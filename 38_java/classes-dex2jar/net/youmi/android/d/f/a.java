package net.youmi.android.d.f;

import android.content.Context;

public class a
{
  private Context a;
  
  public a(Context paramContext)
  {
    try
    {
      this.a = paramContext.getApplicationContext();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  /* Error */
  public void a(java.lang.String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: iload_2
    //   6: istore 4
    //   8: iload_2
    //   9: ifgt +6 -> 15
    //   12: iconst_3
    //   13: istore 4
    //   15: aload_0
    //   16: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   19: invokestatic 28	net/youmi/android/c/k/d:a	(Landroid/content/Context;)Lnet/youmi/android/c/k/d;
    //   22: astore 7
    //   24: new 30	android/widget/RelativeLayout
    //   27: dup
    //   28: aload_0
    //   29: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   32: invokespecial 32	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   35: astore 5
    //   37: aload 5
    //   39: ldc 33
    //   41: invokevirtual 37	android/widget/RelativeLayout:setBackgroundColor	(I)V
    //   44: new 39	android/widget/TextView
    //   47: dup
    //   48: aload_0
    //   49: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   52: invokespecial 40	android/widget/TextView:<init>	(Landroid/content/Context;)V
    //   55: astore 6
    //   57: aload 6
    //   59: ldc 42
    //   61: invokestatic 48	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   64: invokevirtual 51	android/widget/TextView:setTextColor	(I)V
    //   67: aload 6
    //   69: aload 7
    //   71: fconst_1
    //   72: invokevirtual 54	net/youmi/android/c/k/d:a	(F)F
    //   75: fconst_1
    //   76: fconst_1
    //   77: ldc 33
    //   79: invokevirtual 58	android/widget/TextView:setShadowLayer	(FFFI)V
    //   82: aload 6
    //   84: aload_1
    //   85: invokevirtual 62	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   88: aload 6
    //   90: ldc 63
    //   92: invokevirtual 67	android/widget/TextView:setTextSize	(F)V
    //   95: aload 7
    //   97: bipush 10
    //   99: invokevirtual 71	net/youmi/android/c/k/d:b	(I)I
    //   102: istore_2
    //   103: aload 6
    //   105: iload_2
    //   106: iload_2
    //   107: iload_2
    //   108: iload_2
    //   109: invokevirtual 75	android/widget/TextView:setPadding	(IIII)V
    //   112: aload 6
    //   114: bipush 51
    //   116: invokevirtual 78	android/widget/TextView:setGravity	(I)V
    //   119: aload 6
    //   121: aload_0
    //   122: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   125: invokevirtual 82	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   128: ldc 83
    //   130: invokevirtual 89	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   133: aconst_null
    //   134: aconst_null
    //   135: aconst_null
    //   136: invokevirtual 93	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   139: iload_3
    //   140: ifle +9 -> 149
    //   143: aload 6
    //   145: iload_3
    //   146: invokevirtual 96	android/widget/TextView:setWidth	(I)V
    //   149: new 98	net/youmi/android/d/e/a/a
    //   152: dup
    //   153: invokespecial 99	net/youmi/android/d/e/a/a:<init>	()V
    //   156: aload_0
    //   157: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   160: invokevirtual 102	net/youmi/android/d/e/a/a:a	(Landroid/content/Context;)Landroid/graphics/drawable/NinePatchDrawable;
    //   163: astore_1
    //   164: aload_1
    //   165: ifnull +9 -> 174
    //   168: aload 5
    //   170: aload_1
    //   171: invokevirtual 106	android/widget/RelativeLayout:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   174: new 108	android/widget/RelativeLayout$LayoutParams
    //   177: dup
    //   178: bipush 254
    //   180: bipush 254
    //   182: invokespecial 111	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   185: astore_1
    //   186: aload_1
    //   187: bipush 13
    //   189: invokevirtual 114	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   192: aload 5
    //   194: aload 6
    //   196: aload_1
    //   197: invokevirtual 118	android/widget/RelativeLayout:addView	(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   200: aload_0
    //   201: getfield 21	net/youmi/android/d/f/a:a	Landroid/content/Context;
    //   204: aload 5
    //   206: iload 4
    //   208: invokestatic 123	net/youmi/android/a/j/a:b	(Landroid/content/Context;Landroid/view/View;I)Lnet/youmi/android/a/j/a;
    //   211: invokevirtual 125	net/youmi/android/a/j/a:a	()V
    //   214: return
    //   215: astore_1
    //   216: return
    //   217: astore_1
    //   218: goto -44 -> 174
    //   221: astore_1
    //   222: goto -83 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	a
    //   0	225	1	paramString	java.lang.String
    //   0	225	2	paramInt1	int
    //   0	225	3	paramInt2	int
    //   6	201	4	i	int
    //   35	170	5	localRelativeLayout	android.widget.RelativeLayout
    //   55	140	6	localTextView	android.widget.TextView
    //   22	74	7	locald	net.youmi.android.c.k.d
    // Exception table:
    //   from	to	target	type
    //   15	119	215	java/lang/Throwable
    //   143	149	215	java/lang/Throwable
    //   174	214	215	java/lang/Throwable
    //   149	164	217	java/lang/Throwable
    //   168	174	217	java/lang/Throwable
    //   119	139	221	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.f.a
 * JD-Core Version:    0.7.0.1
 */