package net.youmi.android.a.h.a;

import net.youmi.android.c.b.e;

public class a
  implements net.youmi.android.e.a.a
{
  private String a;
  private String b;
  private long c;
  private boolean d = false;
  
  public a(String paramString)
  {
    paramString = e.b(paramString);
    this.a = paramString;
    if (paramString == null)
    {
      this.d = false;
      return;
    }
    this.d = true;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public boolean d(String paramString)
  {
    if (this.a == null) {}
    while (paramString == null) {
      return false;
    }
    this.b = paramString;
    return true;
  }
  
  public String h()
  {
    return this.b;
  }
  
  public long i()
  {
    return this.c;
  }
  
  public String j()
  {
    return this.a;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.a.a
 * JD-Core Version:    0.7.0.1
 */