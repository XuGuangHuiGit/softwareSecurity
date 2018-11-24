package net.youmi.android.a.h;

import java.io.Serializable;
import net.youmi.android.c.b.e;

public class n
  implements Serializable
{
  private String a;
  private String b;
  private String c;
  private String d;
  private int e = 1;
  
  public void b(String paramString)
  {
    this.a = paramString;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public void d(String paramString)
  {
    try
    {
      paramString = e.b(paramString);
      this.d = paramString;
      if (paramString == null)
      {
        this.e = 1;
        return;
      }
      this.e = 2;
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public void e(String paramString)
  {
    this.c = paramString;
  }
  
  public String h()
  {
    return this.a;
  }
  
  public String i()
  {
    return this.b;
  }
  
  public String j()
  {
    return this.d;
  }
  
  public int k()
  {
    return this.e;
  }
  
  public String l()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.n
 * JD-Core Version:    0.7.0.1
 */