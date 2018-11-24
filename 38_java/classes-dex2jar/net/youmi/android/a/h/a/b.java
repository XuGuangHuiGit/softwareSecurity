package net.youmi.android.a.h.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import net.youmi.android.e.a.d;
import net.youmi.android.e.a.e;
import net.youmi.android.e.a.f;

public class b
  extends f
{
  private static b a;
  
  public b(Context paramContext)
  {
    super(paramContext, "0t6evSXr", net.youmi.android.a.d.a.b(paramContext), 0);
  }
  
  public static b a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new b(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public a a(String paramString)
  {
    try
    {
      paramString = new a(paramString);
      if (!paramString.a()) {
        return null;
      }
      boolean bool = b(paramString);
      if (bool) {
        return paramString;
      }
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public boolean a(String paramString1, String paramString2, long paramLong)
  {
    try
    {
      paramString1 = new a(paramString1);
      if (paramString1.a())
      {
        paramString1.a(paramLong);
        paramString1.a(paramString2);
        boolean bool = a(paramString1);
        return bool;
      }
    }
    catch (Throwable paramString1) {}
    return false;
  }
  
  public boolean a(List paramList)
  {
    if (paramList == null) {
      return false;
    }
    for (;;)
    {
      Object localObject4;
      try
      {
        if (paramList.size() > 0) {
          break label239;
        }
        return false;
      }
      catch (Throwable paramList)
      {
        int j;
        Object localObject1;
        return false;
      }
      j = paramList.size();
      if (i < j) {
        localObject4 = localObject1;
      }
      try
      {
        a locala = (a)paramList.get(i);
        if (locala == null) {
          break label247;
        }
        localObject4 = localObject1;
        if (!locala.a()) {
          break label247;
        }
        localObject4 = localObject1;
        if (locala.b() == null) {
          break label247;
        }
        localObject4 = localObject1;
        Object localObject3 = locala.b().getBytes("UTF-8");
        if (localObject3 == null) {
          break label247;
        }
        localObject4 = localObject1;
        byte[] arrayOfByte = net.youmi.android.e.a.b.a((byte[])localObject3, c(), a());
        if (arrayOfByte == null) {
          break label247;
        }
        localObject3 = localObject1;
        if (localObject1 == null)
        {
          localObject4 = localObject1;
          localObject3 = new ArrayList();
        }
        localObject4 = localObject3;
        ((List)localObject3).add(new e(locala.j(), arrayOfByte, locala.i()));
        localObject1 = localObject3;
      }
      catch (Throwable localThrowable)
      {
        boolean bool;
        localObject2 = localObject4;
      }
      if (localObject1 == null) {
        return false;
      }
      if (localObject1.size() <= 0) {
        return false;
      }
      bool = b().a(localObject1);
      return bool;
      label239:
      Object localObject2 = null;
      int i = 0;
      continue;
      label247:
      i += 1;
    }
  }
  
  public boolean b(String paramString)
  {
    try
    {
      boolean bool = c(paramString);
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.a.b
 * JD-Core Version:    0.7.0.1
 */