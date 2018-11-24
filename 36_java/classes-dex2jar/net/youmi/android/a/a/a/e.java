package net.youmi.android.a.a.a;

public final class e
{
  private long a;
  private long b = 0L;
  private String c;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String toString()
  {
    try
    {
      String str = String.format("AverageRating:[%s],Downloads:[%d],Update:[%d]", new Object[] { this.c, Long.valueOf(this.b), Long.valueOf(this.a) });
      return str;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.e
 * JD-Core Version:    0.7.0.1
 */