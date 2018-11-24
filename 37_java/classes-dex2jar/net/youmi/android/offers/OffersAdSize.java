package net.youmi.android.offers;

public class OffersAdSize
{
  public static final int HEIGHT_BANNER = 60;
  public static final int HEIGHT_MINI_BANNER = 32;
  public static final int MATCH_SCREEN = -1;
  public static final OffersAdSize SIZE_320x32 = new OffersAdSize(320, 32);
  public static final OffersAdSize SIZE_320x60 = new OffersAdSize(320, 60);
  public static final OffersAdSize SIZE_MATCH_SCREENx32 = new OffersAdSize(-1, 32);
  public static final OffersAdSize SIZE_MATCH_SCREENx60 = new OffersAdSize(-1, 60);
  protected int a = 0;
  protected int b = 0;
  
  protected OffersAdSize(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
  }
  
  public int getHeight()
  {
    return this.a;
  }
  
  public int getWidth()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.OffersAdSize
 * JD-Core Version:    0.7.0.1
 */