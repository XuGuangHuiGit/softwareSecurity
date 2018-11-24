package net.youmi.android.d.d.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import net.youmi.android.c.b.e;
import net.youmi.android.c.c.g;
import net.youmi.android.c.h.d;
import net.youmi.android.d.b.a;
import org.apache.http.message.BasicNameValuePair;

public class c
  extends Thread
{
  private Context a;
  private int b = 1;
  private String c;
  
  public c(Context paramContext, int paramInt, String paramString)
  {
    a(paramContext, paramInt);
    try
    {
      this.c = e.b(paramString);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public c(Context paramContext, int paramInt, List paramList)
  {
    a(paramContext, paramInt);
    if (paramList != null) {}
    for (;;)
    {
      try
      {
        paramContext = new StringBuilder(512);
        paramInt = 0;
        if (paramInt < paramList.size())
        {
          String str = e.b((String)paramList.get(paramInt));
          if (str != null)
          {
            if (paramContext.length() > 0) {
              paramContext.append('|');
            }
            paramContext.append(str);
          }
        }
        else
        {
          if (paramContext.length() > 0) {
            this.c = paramContext.toString();
          }
          return;
        }
      }
      catch (Throwable paramContext)
      {
        return;
      }
      paramInt += 1;
    }
  }
  
  public static String a()
  {
    try
    {
      String str = g.b("594117465f194c104207431a5714194b584059504a5a56151c515c4a1946511f594715", "Tr9Wn3WUU1Xo");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private void a(Context paramContext, int paramInt)
  {
    int i = paramInt;
    if (paramInt != 0)
    {
      i = paramInt;
      if (paramInt != 1)
      {
        i = paramInt;
        if (2 != paramInt) {
          i = 1;
        }
      }
    }
    try
    {
      this.b = i;
      label27:
      if (paramContext == null) {
        return;
      }
      try
      {
        this.a = paramContext.getApplicationContext();
        return;
      }
      catch (Throwable paramContext) {}
    }
    catch (Throwable localThrowable)
    {
      break label27;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      new c(paramContext, 2, paramString).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, List paramList)
  {
    try
    {
      new c(paramContext, 1, paramList).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void run()
  {
    try
    {
      super.run();
      try
      {
        label4:
        if (this.c != null)
        {
          if (this.a == null) {
            return;
          }
          String str1 = a();
          if (str1 != null)
          {
            String str2 = a.a(this.a, this.b, this.c);
            if (str2 != null)
            {
              ArrayList localArrayList = new ArrayList();
              localArrayList.add(new BasicNameValuePair("s", str2));
              d.a(this.a, str1, localArrayList);
              return;
            }
          }
        }
      }
      catch (Throwable localThrowable1) {}
    }
    catch (Throwable localThrowable2)
    {
      break label4;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.d.a.c
 * JD-Core Version:    0.7.0.1
 */