package net.youmi.android.banner;

public abstract interface AdViewLinstener
{
  public abstract void onFailedToReceivedAd(AdView paramAdView);
  
  public abstract void onReceivedAd(AdView paramAdView);
  
  public abstract void onSwitchedAd(AdView paramAdView);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.banner.AdViewLinstener
 * JD-Core Version:    0.7.0.1
 */