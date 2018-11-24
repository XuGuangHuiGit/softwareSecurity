package net.youmi.android.a.h;

import java.util.Locale;
import net.youmi.android.c.b.e;

public class j
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = e.b(paramString);
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    this.c = e.b(paramString);
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.b = e.b(paramString);
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = e.b(paramString);
  }
  
  public boolean e()
  {
    return (this.a != null) && (this.b != null) && (this.c != null);
  }
  
  public String toString()
  {
    try
    {
      String str = String.format(Locale.getDefault(), "u:[%s],r:[%s],e:[%s],t:[%s]", new Object[] { this.a, this.c, this.b, this.d });
      return str;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.j
 * JD-Core Version:    0.7.0.1
 */