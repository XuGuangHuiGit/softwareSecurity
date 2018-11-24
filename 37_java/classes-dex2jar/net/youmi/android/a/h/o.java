package net.youmi.android.a.h;

public class o
{
  private long a;
  private String b;
  private String c;
  private int d;
  private boolean e = false;
  
  public o(long paramLong, String paramString1, String paramString2)
  {
    this.a = paramLong;
    a(paramString1);
    b(paramString2);
    e();
  }
  
  public o(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
    e();
  }
  
  private void a(String paramString)
  {
    this.b = net.youmi.android.c.b.e.b(paramString);
  }
  
  private void b(String paramString)
  {
    this.c = net.youmi.android.c.b.e.b(paramString);
  }
  
  private void e()
  {
    String str1 = "u0h1WrllOLGt_";
    try
    {
      if (this.b != null) {
        str1 = "u0h1WrllOLGt_" + this.b;
      }
      String str2 = str1;
      if (this.c != null) {
        str2 = str1 + this.c;
      }
      this.d = net.youmi.android.c.c.e.a(str2).hashCode();
      if ((this.b != null) && (this.c != null)) {}
      for (boolean bool = true;; bool = false)
      {
        this.e = bool;
        return;
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public String a()
  {
    return this.b;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
    } while (!(paramObject instanceof o));
    try
    {
      int i = ((o)paramObject).d;
      int j = this.d;
      if (i == j) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
      return super.equals(paramObject);
    }
    catch (Throwable localThrowable) {}
  }
  
  public int hashCode()
  {
    return this.d;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.o
 * JD-Core Version:    0.7.0.1
 */