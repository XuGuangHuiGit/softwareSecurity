package net.youmi.android.c.f;

import java.io.File;
import java.util.Comparator;

class c
  implements Comparator
{
  c(a parama) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    try
    {
      long l1 = paramFile1.lastModified();
      long l2 = paramFile2.lastModified();
      if (l1 < l2) {
        return -1;
      }
      return 1;
    }
    catch (Throwable paramFile1) {}
    return 0;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.f.c
 * JD-Core Version:    0.7.0.1
 */