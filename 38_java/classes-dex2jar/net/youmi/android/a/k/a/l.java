package net.youmi.android.a.k.a;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import net.youmi.android.c.k.d;

public class l
  extends RelativeLayout
{
  private TextView a;
  private Button b;
  private Button c;
  
  public l(Context paramContext)
  {
    super(paramContext);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    this.a = new TextView(paramContext);
    this.a.setTextColor(-16777216);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    int i = d.a(paramContext).b(4);
    localLayoutParams1.setMargins(i, i, i, i);
    localLayoutParams1.gravity = 17;
    localLinearLayout.addView(this.a, localLayoutParams1);
    setBackgroundColor(-1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(i, i, i, i);
    this.c = new Button(paramContext);
    this.c.setText("再次请求");
    this.b = new Button(paramContext);
    this.b.setText("检查网络");
    paramContext = new LinearLayout(paramContext);
    paramContext.setOrientation(0);
    paramContext.addView(this.b, localLayoutParams2);
    paramContext.addView(this.c, localLayoutParams2);
    localLinearLayout.addView(paramContext, localLayoutParams1);
    paramContext = new RelativeLayout.LayoutParams(-2, -2);
    paramContext.addRule(13);
    addView(localLinearLayout, paramContext);
  }
  
  public Button getRefreshButton()
  {
    return this.c;
  }
  
  public Button getSetNetworkButton()
  {
    return this.b;
  }
  
  public TextView getTipsView()
  {
    return this.a;
  }
  
  public void setErrTips(String paramString)
  {
    if (this.a != null) {
      this.a.setText(paramString);
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.l
 * JD-Core Version:    0.7.0.1
 */