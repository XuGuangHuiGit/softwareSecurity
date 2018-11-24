package net.youmi.android.c.i;

import android.content.Context;
import android.graphics.NinePatch;
import android.graphics.drawable.NinePatchDrawable;

public class a
  extends b
{
  protected byte[] a;
  
  public a(String paramString1, String paramString2)
  {
    super(paramString1);
    if (paramString2 != null) {}
    try
    {
      this.a = net.youmi.android.c.c.a.a(paramString2);
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public NinePatchDrawable a(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        if ((this.b != null) && (this.a != null))
        {
          NinePatch localNinePatch = new NinePatch(this.b, this.a, null);
          paramContext = new NinePatchDrawable(paramContext.getResources(), localNinePatch);
          return paramContext;
        }
      }
      catch (Throwable paramContext) {}
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.i.a
 * JD-Core Version:    0.7.0.1
 */