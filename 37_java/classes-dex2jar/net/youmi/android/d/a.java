package net.youmi.android.d;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.p;
import net.youmi.android.c.k.d;

public class a
  extends net.youmi.android.a.k.a.a
  implements View.OnClickListener
{
  protected net.youmi.android.g.a d;
  protected b e;
  
  protected a(Context paramContext, p paramp, e parame, int paramInt)
  {
    super(paramContext, paramp, parame, paramInt);
    a(paramContext, paramp);
  }
  
  public static a b(Context paramContext, p paramp)
  {
    try
    {
      paramContext = new a(paramContext, paramp, new net.youmi.android.d.g.a(paramContext, null, paramp), 16973839);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  void a(Context paramContext, p paramp)
  {
    if (paramp == null) {}
    while (!paramp.a()) {
      return;
    }
    Object localObject = d.a(paramContext);
    localObject = new FrameLayout.LayoutParams(((d)localObject).b(34), ((d)localObject).b(34));
    this.d = new net.youmi.android.g.a(paramContext);
    this.d.setOnClickListener(this);
    switch (paramp.c())
    {
    default: 
      this.d.setVisibility(8);
    }
    for (;;)
    {
      addContentView(this.d, (ViewGroup.LayoutParams)localObject);
      this.d.bringToFront();
      return;
      ((FrameLayout.LayoutParams)localObject).gravity = 51;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 83;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 53;
      continue;
      ((FrameLayout.LayoutParams)localObject).gravity = 85;
    }
  }
  
  public void a(b paramb)
  {
    this.e = paramb;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onClick(View paramView)
  {
    try
    {
      cancel();
      return;
    }
    catch (Throwable paramView) {}
  }
  
  public void onContentChanged()
  {
    super.onContentChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return super.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      if (this.e != null) {
        this.e.onDialogClose();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
  }
  
  public Bundle onSaveInstanceState()
  {
    return super.onSaveInstanceState();
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    super.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public boolean proxySetVisibility(int paramInt)
  {
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a
 * JD-Core Version:    0.7.0.1
 */