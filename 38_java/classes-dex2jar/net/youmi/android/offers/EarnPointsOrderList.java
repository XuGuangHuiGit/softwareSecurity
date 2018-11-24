package net.youmi.android.offers;

import java.io.Serializable;
import java.util.ArrayList;
import net.youmi.android.c.b.e;

public class EarnPointsOrderList
  implements Serializable
{
  private String a;
  private ArrayList b;
  
  private void a()
  {
    try
    {
      if (this.b == null) {
        this.b = new ArrayList();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(String paramString)
  {
    try
    {
      paramString = e.b(paramString);
      if (paramString != null) {
        this.a = paramString;
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  boolean a(EarnPointsOrderInfo paramEarnPointsOrderInfo)
  {
    if (paramEarnPointsOrderInfo == null) {
      return false;
    }
    a();
    return this.b.add(paramEarnPointsOrderInfo);
  }
  
  public EarnPointsOrderInfo get(int paramInt)
  {
    if (this.b == null) {}
    while ((paramInt < 0) || (paramInt >= this.b.size())) {
      return null;
    }
    return (EarnPointsOrderInfo)this.b.get(paramInt);
  }
  
  public String getCurrencyName()
  {
    return this.a;
  }
  
  public boolean isEmpty()
  {
    return size() <= 0;
  }
  
  public int size()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.EarnPointsOrderList
 * JD-Core Version:    0.7.0.1
 */