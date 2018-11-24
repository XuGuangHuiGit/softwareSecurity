package net.youmi.android.e.a;

import android.content.Context;

public class f
{
  private g a;
  
  public f(Context paramContext, String paramString, d paramd)
  {
    this.a = new g(paramContext, paramString, paramd);
  }
  
  public f(Context paramContext, String paramString, d paramd, int paramInt)
  {
    this.a = new g(paramContext, paramString, paramd, paramInt);
  }
  
  public int a()
  {
    return this.a.c();
  }
  
  public boolean a(a parama)
  {
    if (parama == null) {}
    for (;;)
    {
      return false;
      try
      {
        String str1 = parama.j();
        if (str1 != null)
        {
          String str2 = parama.h();
          boolean bool = this.a.a(str1, str2, parama.i());
          return bool;
        }
      }
      catch (Throwable parama) {}
    }
    return false;
  }
  
  public d b()
  {
    return this.a.b();
  }
  
  public boolean b(a parama)
  {
    if (parama == null) {}
    for (;;)
    {
      return false;
      try
      {
        String str = parama.j();
        str = this.a.a(str, null);
        if (str != null)
        {
          boolean bool = parama.d(str);
          return bool;
        }
      }
      catch (Throwable parama) {}
    }
    return false;
  }
  
  public String c()
  {
    return this.a.a();
  }
  
  public boolean c(String paramString)
  {
    try
    {
      boolean bool = this.a.a(paramString);
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.a.f
 * JD-Core Version:    0.7.0.1
 */