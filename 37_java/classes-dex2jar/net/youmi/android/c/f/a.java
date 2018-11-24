package net.youmi.android.c.f;

import java.io.File;
import java.io.IOException;

public class a
{
  private long a = -1L;
  private long b = -1L;
  private File c;
  
  public a(File paramFile, long paramLong1, long paramLong2)
  {
    if (paramFile == null) {
      throw new IOException("directory must not be null");
    }
    if ((paramFile.exists()) && (!paramFile.isDirectory())) {
      throw new IOException("please set a file cache directory");
    }
    this.c = paramFile;
    this.a = paramLong1;
    this.b = paramLong2;
    b();
    c();
  }
  
  private boolean a(File paramFile)
  {
    if (paramFile == null) {}
    while ((this.b == -1L) || (this.b <= 0L) || (System.currentTimeMillis() - paramFile.lastModified() <= this.b)) {
      return false;
    }
    return true;
  }
  
  private void b()
  {
    try
    {
      if ((this.c != null) && (!this.c.exists())) {
        this.c.mkdirs();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private void c()
  {
    try
    {
      if ((this.a == -1L) && (this.b == -1L)) {
        return;
      }
      if ((this.a > 0L) || (this.b > 0L))
      {
        new Thread(new b(this)).start();
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  public String a(String paramString)
  {
    return this.c.getAbsolutePath() + "/" + paramString;
  }
  
  public File[] a()
  {
    return this.c.listFiles();
  }
  
  public File b(String paramString)
  {
    try
    {
      paramString = new File(a(paramString));
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.f.a
 * JD-Core Version:    0.7.0.1
 */