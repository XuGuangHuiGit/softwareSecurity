package net.youmi.android.offers.b.b.c;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import net.youmi.android.c.k.d;

public class f
{
  private static View a(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      localRelativeLayout = new RelativeLayout(paramContext);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localTextView = new TextView(paramContext);
      locald = d.a(paramContext);
      localRelativeLayout.setBackgroundColor(-16777216);
    }
    catch (Throwable paramContext)
    {
      RelativeLayout localRelativeLayout;
      RelativeLayout.LayoutParams localLayoutParams;
      TextView localTextView;
      d locald;
      label68:
      int i;
      return null;
    }
    try
    {
      paramContext = new net.youmi.android.offers.c.a().a(paramContext);
      if (paramContext != null) {
        localRelativeLayout.setBackgroundDrawable(paramContext);
      }
    }
    catch (Throwable paramContext)
    {
      break label68;
    }
    localTextView.setTextColor(Color.parseColor("#ffcc00"));
    localTextView.setShadowLayer(locald.a(1.0F), 1.0F, 1.0F, -16777216);
    localTextView.setText(paramString);
    localTextView.setTextSize(16.0F);
    localTextView.setGravity(17);
    i = locald.b(10);
    localTextView.setPadding(i, i, i, i);
    if (paramInt > 0) {
      localTextView.setWidth(paramInt);
    }
    localLayoutParams.addRule(13);
    localRelativeLayout.addView(localTextView, localLayoutParams);
    return localRelativeLayout;
  }
  
  public static void a(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return;
    }
    try
    {
      net.youmi.android.a.j.a.a(paramContext, a(paramContext, paramString, paramInt2), paramInt1).a();
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.c.f
 * JD-Core Version:    0.7.0.1
 */