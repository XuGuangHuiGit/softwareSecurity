package net.youmi.android.a.h;

import android.content.Context;
import net.youmi.android.c.k.d;

public class p
  extends l
{
  private int a = -9999;
  private int b = -9999;
  private int c = 0;
  private int d = 0;
  private double e = 0.0D;
  private double f = 0.0D;
  private boolean g = false;
  
  public p(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public int a(Context paramContext)
  {
    try
    {
      paramContext = d.a(paramContext);
      if ((this.f > 0.0D) && (this.e > 0.0D)) {
        return (int)(paramContext.b() * this.e);
      }
      if (paramContext.b() > paramContext.c()) {
        return this.d;
      }
      int i = this.c;
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public void a(double paramDouble)
  {
    double d1 = 1.0D;
    double d2 = 0.0D;
    if (paramDouble < 0.0D) {
      paramDouble = d2;
    }
    for (;;)
    {
      if (paramDouble > 1.0D) {
        paramDouble = d1;
      }
      for (;;)
      {
        this.e = paramDouble;
        return;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public int b(Context paramContext)
  {
    try
    {
      paramContext = d.a(paramContext);
      if ((this.f > 0.0D) && (this.e > 0.0D)) {
        return (int)(paramContext.c() * this.f);
      }
      if (paramContext.b() > paramContext.c()) {
        return this.c;
      }
      int i = this.d;
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public void b(double paramDouble)
  {
    double d1 = 1.0D;
    double d2 = 0.0D;
    if (paramDouble < 0.0D) {
      paramDouble = d2;
    }
    for (;;)
    {
      if (paramDouble > 1.0D) {
        paramDouble = d1;
      }
      for (;;)
      {
        this.f = paramDouble;
        return;
      }
    }
  }
  
  public void c(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void e(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void f(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int m()
  {
    return this.a;
  }
  
  public int n()
  {
    return this.b;
  }
  
  public int o()
  {
    return this.c;
  }
  
  public int p()
  {
    return this.d;
  }
  
  public boolean q()
  {
    return this.g;
  }
  
  public double r()
  {
    return this.e;
  }
  
  public double s()
  {
    return this.f;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.p
 * JD-Core Version:    0.7.0.1
 */