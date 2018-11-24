package net.youmi.android.f.a;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import net.youmi.android.c.c.g;

public class c
{
  public static final String a = u.a;
  public static final String b = a();
  private static ThreadPoolExecutor c = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
  
  public static File a(Context paramContext, String paramString)
  {
    try
    {
      if (net.youmi.android.c.b.e.a(paramString)) {
        return null;
      }
      Object localObject = net.youmi.android.c.c.e.a(paramString);
      File localFile = new File(Environment.getExternalStorageDirectory() + File.separator + b);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      localObject = new File(Environment.getExternalStorageDirectory() + File.separator + b + (String)localObject);
      if ((localObject != null) && (((File)localObject).exists())) {
        return localObject;
      }
      paramContext = a(paramContext, paramString, (File)localObject);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static File a(Context paramContext, String paramString, File paramFile)
  {
    try
    {
      int i = new net.youmi.android.c.h.c(paramContext, paramString, paramFile).a();
      if (i == 0) {
        return paramFile;
      }
      return null;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static File a(Context paramContext, String paramString, f paramf)
  {
    paramf = new d(paramf);
    File localFile = new File(Environment.getExternalStorageDirectory() + File.separator + b + net.youmi.android.c.c.e.a(paramString));
    if ((localFile != null) && (localFile.exists()))
    {
      paramContext = Message.obtain();
      paramContext.obj = localFile;
      paramf.sendMessageDelayed(paramContext, 50L);
      return localFile;
    }
    c.execute(new e(paramContext, paramString, paramf));
    return null;
  }
  
  private static String a()
  {
    try
    {
      String str = g.b("49205a5c460d58511b54564554494c4c0e10545f56070558514e4d7d777672537701225073770a5076530707500e2006095c0d740f00727472067549", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.c
 * JD-Core Version:    0.7.0.1
 */