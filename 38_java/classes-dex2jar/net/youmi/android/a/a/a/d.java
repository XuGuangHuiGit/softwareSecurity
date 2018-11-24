package net.youmi.android.a.a.a;

public final class d
{
  private long a = 0L;
  private int b = 0;
  private String c;
  private String d;
  private int e = 0;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public String toString()
  {
    try
    {
      String str = String.format("URL:[%s],MD5:[%s],VersionCode:[%d],Size:[%d],Update:[%d]", new Object[] { this.c, this.d, Integer.valueOf(this.b), Integer.valueOf(this.e), Long.valueOf(this.a) });
      return str;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.d
 * JD-Core Version:    0.7.0.1
 */