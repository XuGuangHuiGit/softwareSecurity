package net.youmi.android.offers.d;

import android.content.Context;
import net.youmi.android.c.k.d;
import net.youmi.android.offers.OffersAdSize;

public class b
  extends OffersAdSize
{
  public static final OffersAdSize c = new b(-3, -3);
  public static final OffersAdSize d = new b(-1, -1);
  public static final OffersAdSize e = new b(296, 240);
  
  protected b(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public static OffersAdSize a(Context paramContext, double paramDouble)
  {
    for (;;)
    {
      int j;
      int k;
      try
      {
        paramContext = d.a(paramContext);
        int i = paramContext.g();
        j = paramContext.h();
        if (i < j)
        {
          break label89;
          j = paramContext.a(i);
          Object localObject;
          k = (int)(j * localObject);
          i = j;
          if (j <= 360) {
            break label108;
          }
          i = 360;
          break label108;
          paramContext = new b(j, i);
          return paramContext;
        }
        else
        {
          i = j;
        }
      }
      catch (Throwable paramContext)
      {
        return e;
      }
      label89:
      double d1;
      if (paramDouble > 0.0D)
      {
        d1 = paramDouble;
        if (paramDouble <= 1.0D) {}
      }
      else
      {
        d1 = 1.0D;
        continue;
        label108:
        j = k;
        if (k > 360) {
          j = 360;
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.d.b
 * JD-Core Version:    0.7.0.1
 */