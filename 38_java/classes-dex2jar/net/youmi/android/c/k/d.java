package net.youmi.android.c.k;

import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;

public class d
{
  private boolean a = true;
  private int b;
  private int c;
  private float d = 1.0F;
  private int e = 160;
  private int f = 160;
  private int g;
  private int h;
  
  protected d(DisplayMetrics paramDisplayMetrics1, DisplayMetrics paramDisplayMetrics2)
  {
    this.g = paramDisplayMetrics1.widthPixels;
    this.h = paramDisplayMetrics1.heightPixels;
    this.d = paramDisplayMetrics1.density;
    this.f = 160;
    try
    {
      Field localField = paramDisplayMetrics1.getClass().getField("densityDpi");
      if (localField != null) {
        this.f = localField.getInt(paramDisplayMetrics1);
      }
    }
    catch (Throwable paramDisplayMetrics1)
    {
      label85:
      break label85;
    }
    this.e = 160;
    try
    {
      paramDisplayMetrics1 = paramDisplayMetrics2.getClass().getField("densityDpi");
      if (paramDisplayMetrics1 != null) {
        this.e = paramDisplayMetrics1.getInt(paramDisplayMetrics2);
      }
    }
    catch (Throwable paramDisplayMetrics1)
    {
      label115:
      break label115;
    }
    if (this.f == 160)
    {
      this.b = Math.round(paramDisplayMetrics2.widthPixels * paramDisplayMetrics2.density);
      this.c = Math.round(paramDisplayMetrics2.heightPixels * paramDisplayMetrics2.density);
    }
    for (this.a = true;; this.a = false)
    {
      if (this.b > this.c)
      {
        int i = this.b;
        this.b = this.c;
        this.c = i;
      }
      return;
      this.b = this.g;
      this.c = this.h;
    }
  }
  
  public static d a(Context paramContext)
  {
    return b(paramContext);
  }
  
  /* Error */
  private static d b(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   3: pop2
    //   4: new 32	android/util/DisplayMetrics
    //   7: dup
    //   8: invokespecial 84	android/util/DisplayMetrics:<init>	()V
    //   11: astore_1
    //   12: aload_0
    //   13: ldc 86
    //   15: invokevirtual 92	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   18: checkcast 94	android/view/WindowManager
    //   21: invokeinterface 98 1 0
    //   26: aload_1
    //   27: invokevirtual 104	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   30: new 2	net/youmi/android/c/k/d
    //   33: dup
    //   34: aload_0
    //   35: invokevirtual 108	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   38: invokevirtual 114	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   41: aload_1
    //   42: invokespecial 116	net/youmi/android/c/k/d:<init>	(Landroid/util/DisplayMetrics;Landroid/util/DisplayMetrics;)V
    //   45: astore_0
    //   46: aload_0
    //   47: areturn
    //   48: astore_0
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: aconst_null
    //   53: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramContext	Context
    //   11	31	1	localDisplayMetrics	DisplayMetrics
    // Exception table:
    //   from	to	target	type
    //   4	46	48	finally
    //   4	46	51	java/lang/Throwable
  }
  
  public float a(float paramFloat)
  {
    float f2 = 1.0F;
    float f1 = paramFloat;
    if (paramFloat <= 0.0F) {
      f1 = 1.0F;
    }
    if (a()) {
      return f1;
    }
    paramFloat = this.d * f1;
    if (paramFloat <= 0.0F) {
      paramFloat = f2;
    }
    for (;;)
    {
      return paramFloat;
    }
  }
  
  public int a(int paramInt)
  {
    if (a()) {}
    while (this.d <= 0.0F) {
      return paramInt;
    }
    return (int)(paramInt / this.d);
  }
  
  boolean a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public int b(int paramInt)
  {
    int j = 1;
    int i = paramInt;
    if (paramInt <= 0) {
      i = 1;
    }
    if (a()) {
      return i;
    }
    paramInt = Math.round(i * this.d);
    if (paramInt <= 0) {
      paramInt = j;
    }
    for (;;)
    {
      return paramInt;
    }
  }
  
  public int c()
  {
    return this.h;
  }
  
  public int d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public float f()
  {
    return this.d;
  }
  
  public int g()
  {
    return this.b;
  }
  
  public int h()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.k.d
 * JD-Core Version:    0.7.0.1
 */