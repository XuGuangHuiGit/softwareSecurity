package net.youmi.android.a.h;

import net.youmi.android.e.a.a;

public class q
  implements a
{
  private long a = -1L;
  private String b;
  private String c;
  
  public q(String paramString)
  {
    this.b = paramString;
  }
  
  public q(String paramString, long paramLong)
  {
    this.b = paramString;
    this.a = paramLong;
  }
  
  public String a()
  {
    return this.c;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public boolean d(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.c = paramString;
      return true;
    }
    return false;
  }
  
  public String h()
  {
    return this.c;
  }
  
  public long i()
  {
    return this.a;
  }
  
  public String j()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.q
 * JD-Core Version:    0.7.0.1
 */