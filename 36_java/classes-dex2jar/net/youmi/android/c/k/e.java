package net.youmi.android.c.k;

import java.io.File;

public class e
{
  public static boolean a(File paramFile, String paramString)
  {
    if (paramFile == null) {}
    for (;;)
    {
      return false;
      try
      {
        if ((paramFile.exists()) && (paramString != null))
        {
          StringBuilder localStringBuilder = new StringBuilder(100);
          localStringBuilder.append("chmod ").append(paramString).append(" ").append(paramFile.getAbsolutePath());
          paramFile = localStringBuilder.toString();
          Runtime.getRuntime().exec(paramFile);
          return true;
        }
      }
      catch (Throwable paramFile) {}
    }
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.e
 * JD-Core Version:    0.7.0.1
 */