package net.youmi.android.g;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;

public class b
  extends RelativeLayout
  implements View.OnClickListener
{
  private Context a;
  private c b;
  private View c;
  private View d;
  private View e;
  private View f;
  private View g;
  
  public b(Context paramContext, c paramc)
  {
    super(paramContext);
    this.b = paramc;
    this.a = paramContext;
    setBackgroundColor(Color.parseColor("#333333"));
    try
    {
      a();
      label28:
      setBackEnable(false);
      setForwardEnable(false);
      return;
    }
    catch (Throwable paramContext)
    {
      break label28;
    }
  }
  
  private void a()
  {
    TableLayout localTableLayout = new TableLayout(this.a);
    localTableLayout.setStretchAllColumns(true);
    localTableLayout.setColumnStretchable(0, true);
    localTableLayout.setColumnStretchable(1, true);
    localTableLayout.setColumnStretchable(2, true);
    localTableLayout.setColumnStretchable(3, true);
    TableRow localTableRow = new TableRow(this.a);
    int i = net.youmi.android.c.k.d.a(this.a).b(48);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i, i);
    localLayoutParams.addRule(13);
    this.c = new d(this.a, net.youmi.android.g.a.b.b(), net.youmi.android.g.a.b.c());
    a(localTableRow, 0, this.c, localLayoutParams);
    this.d = new d(this.a, net.youmi.android.g.a.b.d(), net.youmi.android.g.a.b.e());
    a(localTableRow, 1, this.d, localLayoutParams);
    this.e = new d(this.a, net.youmi.android.g.a.b.f(), net.youmi.android.g.a.b.g());
    a(localTableRow, 2, this.e, localLayoutParams);
    this.g = new d(this.a, net.youmi.android.g.a.b.a());
    a(localTableRow, 3, this.g, localLayoutParams);
    localTableLayout.addView(localTableRow);
    addView(localTableLayout, new RelativeLayout.LayoutParams(-1, i));
  }
  
  protected void a(TableRow paramTableRow, int paramInt, View paramView, RelativeLayout.LayoutParams paramLayoutParams)
  {
    TableRow.LayoutParams localLayoutParams = new TableRow.LayoutParams(-2, -2);
    localLayoutParams.column = paramInt;
    RelativeLayout localRelativeLayout = new RelativeLayout(this.a);
    paramView.setOnClickListener(this);
    localRelativeLayout.addView(paramView, paramLayoutParams);
    paramTableRow.addView(localRelativeLayout, localLayoutParams);
  }
  
  public void onClick(View paramView)
  {
    try
    {
      if (this.b != null)
      {
        if (paramView == this.c)
        {
          this.b.c();
          return;
        }
        if (paramView == this.d)
        {
          this.b.d();
          return;
        }
        if (paramView == this.f)
        {
          this.b.e();
          return;
        }
        if (paramView == this.e)
        {
          this.b.b();
          return;
        }
        if (paramView == this.g) {
          this.b.f();
        }
      }
      return;
    }
    catch (Throwable paramView) {}
  }
  
  public void setBackEnable(boolean paramBoolean)
  {
    try
    {
      if (this.c != null) {
        this.c.setEnabled(paramBoolean);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void setForwardEnable(boolean paramBoolean)
  {
    try
    {
      if (this.d != null) {
        this.d.setEnabled(paramBoolean);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.g.b
 * JD-Core Version:    0.7.0.1
 */