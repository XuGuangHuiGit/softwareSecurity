package net.youmi.android.c.h;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import net.youmi.android.c.e.a;
import net.youmi.android.c.g.b;
import net.youmi.android.c.g.c;
import org.apache.http.Header;

public class d
{
  public static String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2, false, null);
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, Header[] paramArrayOfHeader)
  {
    int i = 0;
    if (paramString1 == null)
    {
      if (paramBoolean) {
        a.b("Request error , url is null", new Object[0]);
      }
      return null;
    }
    if (paramBoolean) {
      a.d("Request url : %s", new Object[] { paramString1 });
    }
    if (paramString2 == null) {}
    try
    {
      ArrayList localArrayList = new ArrayList();
      if ((paramArrayOfHeader != null) && (paramArrayOfHeader.length > 0)) {
        while (i < paramArrayOfHeader.length)
        {
          localArrayList.add(paramArrayOfHeader[i]);
          i += 1;
        }
      }
      paramString2 = new c();
      paramString2.a(paramString1);
      paramString2.a(false);
      paramString2.b(localArrayList);
      paramString1 = new net.youmi.android.c.g.d(paramContext, paramString2);
      paramArrayOfHeader = new b();
      paramArrayOfHeader.a(true);
      paramString1.a(paramArrayOfHeader);
      paramString1.c();
      if (paramString1.d() == null)
      {
        new Thread(new e(paramArrayOfHeader, paramString1, paramContext, paramString2)).start();
        return null;
      }
      paramContext = paramString1.d();
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static String a(Context paramContext, String paramString, List paramList)
  {
    if (paramList != null) {}
    try
    {
      return a(paramContext, paramString, paramList, "UTF-8", null);
    }
    catch (Throwable paramContext) {}
    paramContext = a(paramContext, paramString, "UTF-8");
    return paramContext;
    return null;
  }
  
  private static String a(Context paramContext, String paramString1, List paramList, String paramString2, Header[] paramArrayOfHeader)
  {
    int i = 0;
    if (paramString1 == null) {
      return null;
    }
    if (paramString2 == null) {}
    try
    {
      Object localObject = new ArrayList();
      if ((paramArrayOfHeader != null) && (paramArrayOfHeader.length > 0)) {
        while (i < paramArrayOfHeader.length)
        {
          ((ArrayList)localObject).add(paramArrayOfHeader[i]);
          i += 1;
        }
      }
      paramString2 = new c();
      paramString2.a(paramString1);
      paramString2.a(false);
      paramString2.a(paramList);
      paramString2.b((List)localObject);
      paramString1 = new net.youmi.android.c.g.d(paramContext, paramString2);
      paramArrayOfHeader = new b();
      paramArrayOfHeader.a(true);
      paramString1.a(paramArrayOfHeader);
      paramString1.c();
      localObject = paramString1.d();
      if (localObject != null) {}
    }
    catch (Throwable paramContext) {}
    try
    {
      new Thread(new f(paramArrayOfHeader, paramString1, paramContext, paramString2, paramList)).start();
      return null;
    }
    catch (Throwable paramContext)
    {
      break label169;
    }
    paramContext = paramString1.d();
    return paramContext;
    label169:
    return null;
  }
  
  public static String a(Context paramContext, String paramString, List paramList, boolean paramBoolean, Header[] paramArrayOfHeader)
  {
    if (paramList != null) {}
    try
    {
      return a(paramContext, paramString, paramList, "UTF-8", paramArrayOfHeader);
    }
    catch (Throwable paramContext) {}
    paramContext = a(paramContext, paramString, "UTF-8", paramBoolean, paramArrayOfHeader);
    return paramContext;
    return null;
  }
  
  public static String a(Context paramContext, String paramString, boolean paramBoolean)
  {
    return a(paramContext, paramString, null, paramBoolean, null);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.d
 * JD-Core Version:    0.7.0.1
 */