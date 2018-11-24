package net.youmi.android.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import net.youmi.android.c.k.h;

public class f
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private int d = -1;
  private long e;
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = h.c(paramContext, paramString);
      if (paramContext != null) {
        this.c = true;
      }
      for (this.d = paramContext.versionCode;; this.d = -1)
      {
        this.a = true;
        return true;
        this.c = false;
      }
      return false;
    }
    catch (Throwable paramContext) {}
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public String toString()
  {
    try
    {
      String str = String.format("isr:[%s],是否已经检查安装状态:[%s],是否已经安装到设备中:[%s],Update:[%d]", new Object[] { Boolean.toString(this.b), Boolean.toString(this.a), Boolean.toString(this.c), Long.valueOf(this.e) });
      return str;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.f
 * JD-Core Version:    0.7.0.1
 */