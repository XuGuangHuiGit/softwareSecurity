package net.youmi.android.a.k.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import net.youmi.android.a.h.b;
import net.youmi.android.a.h.e;
import net.youmi.android.a.h.f;
import net.youmi.android.a.h.k;
import net.youmi.android.a.h.p;
import org.apache.http.util.EncodingUtils;

public abstract class a
  extends Dialog
  implements b, net.youmi.android.a.h.d, d
{
  i a;
  protected Context b;
  protected e c;
  private RelativeLayout d;
  private RelativeLayout e;
  private p f;
  private int g = 0;
  private int h = 0;
  
  public a(Context paramContext, p paramp, e parame, int paramInt)
  {
    super(paramContext, paramInt);
    a(paramContext, paramp, parame, paramp.q());
  }
  
  private void a(int paramInt)
  {
    Object localObject1 = null;
    this.d = new RelativeLayout(this.b);
    this.e = new c(this.b, this);
    try
    {
      if (this.f != null) {
        localObject1 = this.f.g();
      }
      this.a = new i(this.b, this.c, paramInt, this, this.f.h(), this.f.i(), 0, (k)localObject1);
      this.a.a("正在努力加载");
      localObject1 = new RelativeLayout.LayoutParams(-1, -1);
      ((RelativeLayout.LayoutParams)localObject1).addRule(13);
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        Object localObject3 = net.youmi.android.c.k.d.a(this.b);
        paramInt = ((net.youmi.android.c.k.d)localObject3).b(8);
        this.e.setPadding(paramInt, paramInt, paramInt, paramInt);
        this.d.setPadding(paramInt, paramInt, paramInt, paramInt);
        if (!this.f.q())
        {
          float f1 = ((net.youmi.android.c.k.d)localObject3).a(6.0F);
          localObject3 = new ShapeDrawable(new RoundRectShape(new float[] { f1, f1, f1, f1, f1, f1, f1, f1 }, null, null));
          ((ShapeDrawable)localObject3).getPaint().setColor(Color.parseColor("#cc999999"));
          this.e.setBackgroundDrawable((Drawable)localObject3);
          localObject3 = getWindow();
          WindowManager.LayoutParams localLayoutParams = ((Window)localObject3).getAttributes();
          localLayoutParams.dimAmount = 0.7F;
          ((Window)localObject3).setAttributes(localLayoutParams);
        }
        label277:
        this.e.addView(this.a.getCurrentView(), (ViewGroup.LayoutParams)localObject1);
        localObject1 = new RelativeLayout.LayoutParams(-1, -1);
        ((RelativeLayout.LayoutParams)localObject1).addRule(13);
        this.d.addView(this.e, (ViewGroup.LayoutParams)localObject1);
        setContentView(this.d, new ViewGroup.LayoutParams(-1, -1));
        paramInt = this.f.a(this.b);
        int i = this.f.b(this.b);
        if ((paramInt > 0) && (i > 0)) {
          a(this.f.m(), this.f.n(), paramInt, i);
        }
        return;
        localThrowable1 = localThrowable1;
        Object localObject2 = null;
      }
      catch (Throwable localThrowable2)
      {
        break label277;
      }
    }
  }
  
  private void a(Context paramContext, p paramp, e parame, boolean paramBoolean)
  {
    getWindow().requestFeature(1);
    if (!paramBoolean) {
      getWindow().addFlags(2);
    }
    this.f = paramp;
    this.b = paramContext;
    setCanceledOnTouchOutside(true);
    this.c = parame;
    if (this.c != null) {
      this.c.a(this);
    }
    a(paramp.d());
    if (!paramBoolean) {}
    try
    {
      this.a.getCurrentView().setBackgroundColor(-1);
      label83:
      if ((paramp.k() == 2) && (paramp.j() != null) && (paramp.l() != null))
      {
        this.a.postUrl(paramp.l(), EncodingUtils.getBytes(paramp.j(), "BASE64"));
        return;
      }
      this.a.loadUrl(paramp.l());
      return;
    }
    catch (Throwable paramContext)
    {
      break label83;
    }
  }
  
  void a()
  {
    try
    {
      int i = this.f.a(this.b);
      int j = this.f.b(this.b);
      if ((i > 0) && (j > 0))
      {
        if ((i == this.g) && (j == this.h)) {
          return;
        }
        a(this.f.m(), this.f.n(), i, j);
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
  
  /* Error */
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 146	net/youmi/android/a/k/a/a:getWindow	()Landroid/view/Window;
    //   4: astore 6
    //   6: aload 6
    //   8: invokevirtual 152	android/view/Window:getAttributes	()Landroid/view/WindowManager$LayoutParams;
    //   11: astore 7
    //   13: iload_1
    //   14: sipush -9999
    //   17: if_icmpne +137 -> 154
    //   20: iconst_1
    //   21: istore_1
    //   22: goto +166 -> 188
    //   25: aload 7
    //   27: iload_3
    //   28: putfield 244	android/view/WindowManager$LayoutParams:width	I
    //   31: aload 7
    //   33: iload 4
    //   35: putfield 247	android/view/WindowManager$LayoutParams:height	I
    //   38: aload_0
    //   39: getfield 50	net/youmi/android/a/k/a/a:b	Landroid/content/Context;
    //   42: invokestatic 100	net/youmi/android/c/k/d:a	(Landroid/content/Context;)Lnet/youmi/android/c/k/d;
    //   45: astore 8
    //   47: aload 7
    //   49: aload 7
    //   51: getfield 244	android/view/WindowManager$LayoutParams:width	I
    //   54: aload 8
    //   56: bipush 16
    //   58: invokevirtual 103	net/youmi/android/c/k/d:b	(I)I
    //   61: iadd
    //   62: putfield 244	android/view/WindowManager$LayoutParams:width	I
    //   65: aload 7
    //   67: aload 7
    //   69: getfield 247	android/view/WindowManager$LayoutParams:height	I
    //   72: aload 8
    //   74: bipush 16
    //   76: invokevirtual 103	net/youmi/android/c/k/d:b	(I)I
    //   79: iadd
    //   80: putfield 247	android/view/WindowManager$LayoutParams:height	I
    //   83: aload 7
    //   85: getfield 244	android/view/WindowManager$LayoutParams:width	I
    //   88: aload 8
    //   90: invokevirtual 249	net/youmi/android/c/k/d:b	()I
    //   93: if_icmple +13 -> 106
    //   96: aload 7
    //   98: aload 8
    //   100: invokevirtual 249	net/youmi/android/c/k/d:b	()I
    //   103: putfield 244	android/view/WindowManager$LayoutParams:width	I
    //   106: aload 7
    //   108: getfield 247	android/view/WindowManager$LayoutParams:height	I
    //   111: aload 8
    //   113: invokevirtual 251	net/youmi/android/c/k/d:c	()I
    //   116: if_icmple +13 -> 129
    //   119: aload 7
    //   121: aload 8
    //   123: invokevirtual 251	net/youmi/android/c/k/d:c	()I
    //   126: putfield 247	android/view/WindowManager$LayoutParams:height	I
    //   129: aload_0
    //   130: iload_3
    //   131: putfield 31	net/youmi/android/a/k/a/a:g	I
    //   134: aload_0
    //   135: iload 4
    //   137: putfield 33	net/youmi/android/a/k/a/a:h	I
    //   140: aload 6
    //   142: iload_1
    //   143: invokevirtual 254	android/view/Window:setGravity	(I)V
    //   146: aload 6
    //   148: aload 7
    //   150: invokevirtual 163	android/view/Window:setAttributes	(Landroid/view/WindowManager$LayoutParams;)V
    //   153: return
    //   154: iconst_3
    //   155: istore 5
    //   157: aload 7
    //   159: iload_1
    //   160: putfield 257	android/view/WindowManager$LayoutParams:x	I
    //   163: iload 5
    //   165: istore_1
    //   166: goto +22 -> 188
    //   169: iload_1
    //   170: bipush 48
    //   172: ior
    //   173: istore_1
    //   174: aload 7
    //   176: iload_2
    //   177: putfield 260	android/view/WindowManager$LayoutParams:y	I
    //   180: goto -155 -> 25
    //   183: astore 6
    //   185: aload 6
    //   187: athrow
    //   188: iload_2
    //   189: sipush -9999
    //   192: if_icmpne -23 -> 169
    //   195: iload_1
    //   196: bipush 16
    //   198: ior
    //   199: istore_1
    //   200: goto -175 -> 25
    //   203: astore 6
    //   205: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	this	a
    //   0	206	1	paramInt1	int
    //   0	206	2	paramInt2	int
    //   0	206	3	paramInt3	int
    //   0	206	4	paramInt4	int
    //   155	9	5	i	int
    //   4	143	6	localWindow	Window
    //   183	3	6	localObject	Object
    //   203	1	6	localThrowable	Throwable
    //   11	164	7	localLayoutParams	WindowManager.LayoutParams
    //   45	77	8	locald	net.youmi.android.c.k.d
    // Exception table:
    //   from	to	target	type
    //   0	13	183	finally
    //   25	106	183	finally
    //   106	129	183	finally
    //   129	153	183	finally
    //   157	163	183	finally
    //   174	180	183	finally
    //   0	13	203	java/lang/Throwable
    //   25	106	203	java/lang/Throwable
    //   106	129	203	java/lang/Throwable
    //   129	153	203	java/lang/Throwable
    //   157	163	203	java/lang/Throwable
    //   174	180	203	java/lang/Throwable
  }
  
  public f js_SDK_Handler_ClearCurrentBrowserHistory()
  {
    try
    {
      if (this.a != null)
      {
        this.a.clearHistory();
        f localf = f.b;
        return localf;
      }
    }
    catch (Throwable localThrowable) {}
    return f.c;
  }
  
  public boolean js_SDK_Handler_RunOnUIThread(Runnable paramRunnable)
  {
    try
    {
      boolean bool = net.youmi.android.c.j.a.a().a(paramRunnable);
      return bool;
    }
    catch (Throwable paramRunnable) {}
    return false;
  }
  
  public void onBackPressed()
  {
    if ((this.a != null) && (this.a.c())) {
      return;
    }
    cancel();
  }
  
  public boolean proxyClearWebViewHistory()
  {
    try
    {
      if (this.a != null)
      {
        this.a.clearHistory();
        return true;
      }
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyCloseCurrentWindow()
  {
    try
    {
      cancel();
      return true;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public boolean proxyLoadUrl(String paramString)
  {
    try
    {
      if ((this.a != null) && (paramString != null))
      {
        this.a.loadUrl(paramString);
        return true;
      }
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean proxyPostUrl(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString != null) {
      try
      {
        if (this.a != null)
        {
          this.a.postUrl(paramString, paramArrayOfByte);
          return true;
        }
      }
      catch (Throwable paramString) {}
    }
    return false;
  }
  
  public void setWebTitle(String paramString) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.k.a.a
 * JD-Core Version:    0.7.0.1
 */