package net.youmi.android.diy.banner;

public class DiyAdSize
{
  public static final int HEIGHT_BANNER = 60;
  public static final int HEIGHT_MINI_BANNER = 32;
  public static final int MATCH_SCREEN = -1;
  public static final DiyAdSize SIZE_320x32 = new DiyAdSize(320, 32);
  public static final DiyAdSize SIZE_320x60 = new DiyAdSize(320, 60);
  public static final DiyAdSize SIZE_MATCH_SCREENx32 = new DiyAdSize(-1, 32);
  public static final DiyAdSize SIZE_MATCH_SCREENx60 = new DiyAdSize(-1, 60);
  private int a = 0;
  private int b = 0;
  
  private DiyAdSize(int paramInt1, int paramInt2)
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.banner.DiyAdSize
 * JD-Core Version:    0.7.0.1
 */