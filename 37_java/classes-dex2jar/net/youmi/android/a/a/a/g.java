package net.youmi.android.a.a.a;

import net.youmi.android.c.b.e;

public final class g
{
  public int a = 0;
  private long b = 0L;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  
  public long a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    try
    {
      paramString = e.b(paramString);
      if (paramString != null) {
        this.d = paramString;
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.e = paramString;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public void d(String paramString)
  {
    this.f = paramString;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public void e(String paramString)
  {
    this.g = paramString;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public int g()
  {
    return this.a;
  }
  
  public String toString()
  {
    try
    {
      String str = String.format("AppName:[%s],AppPubID:[%s],PakcageName:[%s],IconUrl:[%s],Slogan:[%s],Update:[%d]", new Object[] { this.c, this.g, this.d, this.e, this.f, Long.valueOf(this.b) });
      return str;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.g
 * JD-Core Version:    0.7.0.1
 */