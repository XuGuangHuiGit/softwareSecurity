package net.youmi.android.a.e.a;

import net.youmi.android.e.a.a;

public class b
  implements a
{
  private String a;
  private String b;
  private long c = 0L;
  
  public b(String paramString)
  {
    paramString = net.youmi.android.c.b.e.b(paramString);
    if (paramString != null) {
      this.b = net.youmi.android.c.c.e.a("ZdWpvx74" + paramString);
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = net.youmi.android.c.b.e.b(paramString);
  }
  
  public boolean d(String paramString)
  {
    if (paramString != null) {
      try
      {
        this.a = paramString;
        return true;
      }
      catch (Throwable paramString) {}
    }
    return false;
  }
  
  public String h()
  {
    return this.a;
  }
  
  public long i()
  {
    return this.c;
  }
  
  public String j()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.e.a.b
 * JD-Core Version:    0.7.0.1
 */