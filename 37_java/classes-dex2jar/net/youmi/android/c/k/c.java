package net.youmi.android.c.k;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class c
{
  public static long a()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
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
  
  public static long a(Context paramContext)
  {
    try
    {
      paramContext = new StatFs(Environment.getDataDirectory().getPath());
      long l1 = paramContext.getBlockSize();
      long l2 = paramContext.getAvailableBlocks() * l1;
      l1 = l2;
      if (l2 < 0L) {
        l1 = Math.abs(l2);
      }
      return l1;
    }
    catch (Throwable paramContext) {}
    return 0L;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.c
 * JD-Core Version:    0.7.0.1
 */