package net.youmi.android.f.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import net.youmi.android.c.c.g;
import net.youmi.android.c.h.c;

public class o
{
  public static final String a = u.a;
  public static final String b = a();
  private static ThreadPoolExecutor c = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
  
  public static Bitmap a(Context paramContext, String paramString)
  {
    try
    {
      if (net.youmi.android.c.b.e.a(paramString)) {
        return null;
      }
      Object localObject1 = net.youmi.android.c.c.e.a(paramString);
      Object localObject2 = new File(Environment.getExternalStorageDirectory() + File.separator + b);
      if (!((File)localObject2).exists()) {
        ((File)localObject2).mkdirs();
      }
      localObject1 = new File(Environment.getExternalStorageDirectory() + File.separator + b + (String)localObject1);
      localObject2 = a((File)localObject1);
      if (localObject2 != null) {
        return localObject2;
      }
      paramContext = a(paramContext, paramString, (File)localObject1);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static Bitmap a(Context paramContext, String paramString, File paramFile)
  {
    Object localObject = null;
    try
    {
      int i = new c(paramContext, paramString, paramFile).a();
      paramContext = localObject;
      if (i == 0) {}
      return null;
    }
    catch (Throwable paramContext)
    {
      try
      {
        paramContext = BitmapFactory.decodeFile(paramFile.getAbsolutePath());
        return paramContext;
      }
      catch (Throwable paramContext) {}
      paramContext = paramContext;
      return null;
    }
  }
  
  public static Bitmap a(File paramFile)
  {
    try
    {
      if (!paramFile.exists()) {
        return null;
      }
      paramFile = BitmapFactory.decodeFile(paramFile.getAbsolutePath());
      return paramFile;
    }
    catch (Throwable paramFile) {}
    return null;
  }
  
  private static String a()
  {
    try
    {
      String str = g.b("49205a5c460d58511b54564554494c4c0e10545f56070558514e4d7b060401537774202703760f55055e7174507d2206045c7b00790a050701730149", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.o
 * JD-Core Version:    0.7.0.1
 */