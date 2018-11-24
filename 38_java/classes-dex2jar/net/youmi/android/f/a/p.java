package net.youmi.android.f.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import net.youmi.android.c.c.g;

public class p
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
  
  /* Error */
  public static Bitmap a(Context paramContext, String paramString, File paramFile)
  {
    // Byte code:
    //   0: new 89	net/youmi/android/c/h/c
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: invokespecial 92	net/youmi/android/c/h/c:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
    //   10: invokevirtual 95	net/youmi/android/c/h/c:a	()I
    //   13: istore_3
    //   14: iload_3
    //   15: ifne +46 -> 61
    //   18: invokestatic 101	java/lang/System:nanoTime	()J
    //   21: lstore 4
    //   23: aload_2
    //   24: invokevirtual 104	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   27: invokestatic 110	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   30: astore_0
    //   31: invokestatic 101	java/lang/System:nanoTime	()J
    //   34: lstore 6
    //   36: getstatic 16	net/youmi/android/f/a/p:a	Ljava/lang/String;
    //   39: ldc 112
    //   41: iconst_1
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: lload 6
    //   49: lload 4
    //   51: lsub
    //   52: invokestatic 118	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   55: aastore
    //   56: invokestatic 123	net/youmi/android/c/e/b:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_0
    //   60: areturn
    //   61: aconst_null
    //   62: areturn
    //   63: astore_0
    //   64: aconst_null
    //   65: areturn
    //   66: astore_0
    //   67: goto -3 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	paramContext	Context
    //   0	70	1	paramString	String
    //   0	70	2	paramFile	File
    //   13	2	3	i	int
    //   21	29	4	l1	long
    //   34	14	6	l2	long
    // Exception table:
    //   from	to	target	type
    //   0	14	63	java/lang/Throwable
    //   18	59	66	java/lang/Throwable
  }
  
  public static Bitmap a(Context paramContext, String paramString, s params)
  {
    q localq = new q(params);
    params = new File(Environment.getExternalStorageDirectory() + File.separator + b + net.youmi.android.c.c.e.a(paramString));
    if ((params != null) && (params.exists())) {}
    for (params = a(params);; params = null)
    {
      if (params != null)
      {
        paramContext = Message.obtain();
        paramContext.obj = params;
        localq.sendMessageDelayed(paramContext, 50L);
        return params;
      }
      c.execute(new r(paramContext, paramString, localq));
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.p
 * JD-Core Version:    0.7.0.1
 */