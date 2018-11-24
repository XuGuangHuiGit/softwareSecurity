package net.youmi.android.c.l;

import java.util.ArrayList;
import java.util.List;

public abstract class a
{
  private List a;
  
  public void a(Object paramObject)
  {
    if (paramObject != null) {}
    try
    {
      List localList = b();
      if (!localList.contains(paramObject)) {
        localList.add(paramObject);
      }
      return;
    }
    catch (Throwable paramObject) {}
  }
  
  protected List b()
  {
    try
    {
      if (this.a == null) {
        this.a = new ArrayList();
      }
      List localList = this.a;
      return localList;
    }
    finally {}
  }
  
  public void b(Object paramObject)
  {
    if (paramObject != null) {}
    try
    {
      b().remove(paramObject);
      return;
    }
    catch (Throwable paramObject) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.l.a
 * JD-Core Version:    0.7.0.1
 */