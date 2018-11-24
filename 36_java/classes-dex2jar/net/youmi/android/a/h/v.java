package net.youmi.android.a.h;

import android.content.Context;
import net.youmi.android.a.h.c.b.a;
import net.youmi.android.c.h.d;

public class v
  implements Runnable
{
  Context a;
  long b;
  String c;
  String d;
  String e;
  String f;
  long g;
  boolean h = false;
  boolean i = false;
  
  public v(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this.a = paramContext;
    this.e = paramString1;
    this.d = paramString2;
    this.f = paramString3;
    this.b = paramLong1;
    this.g = paramLong2;
    this.h = true;
    this.i = paramBoolean;
  }
  
  public v(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, boolean paramBoolean)
  {
    this.a = paramContext;
    this.e = paramString1;
    this.d = paramString2;
    this.f = paramString3;
    this.b = paramLong;
    this.h = false;
    this.i = paramBoolean;
  }
  
  protected int a()
  {
    if (!this.i)
    {
      str = u.a(this.a, this.f);
      if (str != null)
      {
        this.c = str;
        return 1;
      }
    }
    String str = d.a(this.a, this.f);
    if (str != null)
    {
      if (this.h) {
        u.a(this.a, this.f, str, this.g);
      }
      this.c = str;
      return 0;
    }
    return 2;
  }
  
  protected void a(int paramInt)
  {
    try
    {
      if (this.d != null)
      {
        if (this.c == null) {
          this.c = "";
        }
        String str = String.format("javascript:%s(%d,%d,'%s','%s')", new Object[] { this.d, Long.valueOf(this.b), Integer.valueOf(paramInt), this.f, this.c });
        a.a().a(this.e, str);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void run()
  {
    try
    {
      a(a());
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.v
 * JD-Core Version:    0.7.0.1
 */