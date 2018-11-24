package net.youmi.android.a.k.a;

import android.content.Context;
import android.os.Parcelable;
import android.widget.RelativeLayout;

public class c
  extends RelativeLayout
{
  private a a;
  
  public c(Context paramContext, a parama)
  {
    super(paramContext);
    this.a = parama;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.a();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(paramParcelable);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.c
 * JD-Core Version:    0.7.0.1
 */