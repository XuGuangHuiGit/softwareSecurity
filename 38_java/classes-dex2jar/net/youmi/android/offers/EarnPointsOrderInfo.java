package net.youmi.android.offers;

import java.io.Serializable;

public final class EarnPointsOrderInfo
  implements Serializable
{
  private String a;
  private int b;
  private String c;
  private int d;
  private String e;
  private String f;
  private int g;
  private long h;
  private int i;
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  void a(long paramLong)
  {
    this.h = paramLong;
  }
  
  void a(String paramString)
  {
    this.a = paramString;
  }
  
  void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  void b(String paramString)
  {
    this.c = paramString;
  }
  
  void c(int paramInt)
  {
    this.g = paramInt;
  }
  
  void c(String paramString)
  {
    this.e = paramString;
  }
  
  void d(int paramInt)
  {
    this.i = paramInt;
  }
  
  void d(String paramString)
  {
    this.f = paramString;
  }
  
  public int getChannelId()
  {
    return this.b;
  }
  
  public String getCustomUserID()
  {
    return this.c;
  }
  
  public String getMessage()
  {
    return this.e;
  }
  
  public String getOrderID()
  {
    return this.a;
  }
  
  public int getPoints()
  {
    return this.g;
  }
  
  public long getSettlingTime()
  {
    return this.h;
  }
  
  public int getStatus()
  {
    return this.d;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.EarnPointsOrderInfo
 * JD-Core Version:    0.7.0.1
 */