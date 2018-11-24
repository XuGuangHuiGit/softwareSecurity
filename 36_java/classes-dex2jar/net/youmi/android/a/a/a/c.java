package net.youmi.android.a.a.a;

import java.util.ArrayList;

public final class c
{
  private long a = 0L;
  private ArrayList b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  
  public ArrayList a()
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    return this.b;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    if (!this.b.contains(paramString)) {
      this.b.add(paramString);
    }
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public void e(String paramString)
  {
    this.f = paramString;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public void f(String paramString)
  {
    this.g = paramString;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public void g(String paramString)
  {
    this.h = paramString;
  }
  
  public String h()
  {
    return this.j;
  }
  
  public void h(String paramString)
  {
    this.j = paramString;
  }
  
  public String i()
  {
    return this.i;
  }
  
  public void i(String paramString)
  {
    this.i = paramString;
  }
  
  public long j()
  {
    return this.a;
  }
  
  public String toString()
  {
    try
    {
      Object localObject = new StringBuilder();
      if ((this.b != null) && (this.b.size() > 0))
      {
        int k = 0;
        while (k < this.b.size())
        {
          ((StringBuilder)localObject).append((String)this.b.get(k));
          ((StringBuilder)localObject).append("|||||||");
          k += 1;
        }
      }
      localObject = String.format("Author:[%s],Cat:[%s],Price:[%s],Size:[%s],Keyword:[%s],VersionName:[%s],UpdateDate:[%s],Desc:[%s],Update:[%d],SS:[%s]", new Object[] { this.g, this.f, this.c, this.e, this.h, this.i, this.j, this.d, Long.valueOf(this.a), ((StringBuilder)localObject).toString() });
      return localObject;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.c
 * JD-Core Version:    0.7.0.1
 */