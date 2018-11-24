package net.youmi.android.dev;

public class AppUpdateInfo
{
  private String a;
  private int b;
  private String c;
  private String d;
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  void a(String paramString)
  {
    this.a = paramString;
  }
  
  void b(String paramString)
  {
    this.d = paramString;
  }
  
  void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String getUpdateTips()
  {
    return this.d;
  }
  
  public String getUrl()
  {
    return this.c;
  }
  
  public int getVersionCode()
  {
    return this.b;
  }
  
  public String getVersionName()
  {
    return this.a;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.AppUpdateInfo
 * JD-Core Version:    0.7.0.1
 */