package net.youmi.android.a.k.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.youmi.android.c.k.d;

public class m
  extends LinearLayout
{
  private ProgressBar a;
  private TextView b;
  private o c = new o(this, null);
  private LinearLayout d;
  
  public m(Context paramContext)
  {
    super(paramContext);
    this.a = new ProgressBar(paramContext, null, 16842873);
    this.d = this;
    this.d.setOrientation(0);
    this.a.setIndeterminate(true);
    this.c.b(0);
    this.c.a(this.a.getIndeterminateDrawable());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    d locald = d.a(paramContext);
    localLayoutParams.gravity = 17;
    int i = locald.b(3);
    localLayoutParams.setMargins(i, i, i, i);
    this.d.addView(this.a, localLayoutParams);
    this.b = new TextView(paramContext);
    this.d.addView(this.b, localLayoutParams);
    this.c.a(-1);
    this.b.setTextColor(-1);
    this.b.setTextSize(12.0F);
    this.c.a(12.0F);
    i = locald.b(8);
    float f = locald.b(5);
    paramContext = new ShapeDrawable(new RoundRectShape(new float[] { f, f, f, f, f, f, f, f }, null, null));
    int j = Color.argb(150, 0, 0, 0);
    paramContext.getPaint().setColor(j);
    this.d.setPadding(i, i, i, i);
    this.d.setBackgroundDrawable(paramContext);
  }
  
  public void a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      try
      {
        this.b.setVisibility(8);
        this.b.setText(paramString);
        this.a.setVisibility(0);
        return;
      }
      catch (Throwable paramString) {}
      this.b.setVisibility(0);
    }
  }
  
  public o getStyleConfig()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.m
 * JD-Core Version:    0.7.0.1
 */