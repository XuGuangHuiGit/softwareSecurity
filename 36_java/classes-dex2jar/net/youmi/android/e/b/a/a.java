package net.youmi.android.e.b.a;

import android.content.Context;
import java.io.File;
import net.youmi.android.e.b.b;

public abstract class a
  extends c
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  protected abstract void a(b paramb, File paramFile);
  
  protected void a(net.youmi.android.e.b.c paramc, b paramb)
  {
    paramc.a(paramb);
  }
  
  protected void a(net.youmi.android.e.b.c paramc, b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    paramc.a(paramb, paramLong1, paramLong2, paramInt, paramLong3);
  }
  
  protected void a(net.youmi.android.e.b.c paramc, b paramb, File paramFile)
  {
    paramc.a(paramb, paramFile);
  }
  
  protected abstract void b(b paramb);
  
  protected abstract void b(b paramb, File paramFile);
  
  protected void b(net.youmi.android.e.b.c paramc, b paramb)
  {
    paramc.b(paramb);
  }
  
  protected void b(net.youmi.android.e.b.c paramc, b paramb, File paramFile)
  {
    paramc.a(paramb, paramFile);
  }
  
  protected boolean b(String paramString)
  {
    try
    {
      boolean bool = paramString.trim().toLowerCase().endsWith(".apk");
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  protected abstract void c(b paramb);
  
  protected final void f(b paramb, File paramFile)
  {
    a(paramb, paramFile);
  }
  
  protected final void g(b paramb, File paramFile)
  {
    b(paramb, paramFile);
  }
  
  protected final void j(b paramb)
  {
    b(paramb);
  }
  
  protected final void k(b paramb)
  {
    c(paramb);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.a
 * JD-Core Version:    0.7.0.1
 */