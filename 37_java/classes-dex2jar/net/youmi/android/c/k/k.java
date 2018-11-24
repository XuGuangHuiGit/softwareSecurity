package net.youmi.android.c.k;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class k
{
  public static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return (str.equals("mounted")) || (str.equals("mounted_ro"));
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        boolean bool = i.a(paramContext);
        if (bool) {
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static boolean a(Context paramContext, long paramLong)
  {
    try
    {
      if (a(paramContext))
      {
        paramContext = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l1 = paramContext.getBlockSize();
        long l2 = paramContext.getAvailableBlocks() * l1;
        l1 = l2;
        if (l2 < 0L) {
          l1 = Math.abs(l2);
        }
        if (l1 >= paramLong) {
          return true;
        }
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  public static long b()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      long l1 = localStatFs.getBlockSize();
      long l2 = localStatFs.getBlockCount() * l1;
      l1 = l2;
      if (l2 < 0L) {
        l1 = Math.abs(l2);
      }
      return l1;
    }
    catch (Throwable localThrowable) {}
    return 0L;
  }
  
  public static long b(Context paramContext)
  {
    try
    {
      if (a(paramContext))
      {
        paramContext = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l1 = paramContext.getBlockSize();
        long l2 = paramContext.getAvailableBlocks() * l1;
        l1 = l2;
        if (l2 < 0L) {
          l1 = Math.abs(l2);
        }
        return l1;
      }
    }
    catch (Throwable paramContext) {}
    return 0L;
  }
  
  public static String c()
  {
    try
    {
      String str = Environment.getExternalStorageDirectory().getPath();
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.k
 * JD-Core Version:    0.7.0.1
 */