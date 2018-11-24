package net.youmi.android.c.e;

import android.util.Log;
import net.youmi.android.c.c.g;

public class a
{
  private static String a = ;
  private static boolean b = true;
  
  private static String a()
  {
    try
    {
      String str = g.b("3c5b4c5859635209", "FTZNgRJZOBk5");
      return str;
    }
    catch (Throwable localThrowable) {}
    return "Test";
  }
  
  public static void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    try
    {
      if (!b) {
        return;
      }
      for (;;)
      {
        Log.v(paramString1, paramString2, paramThrowable);
        return;
        Log.d(paramString1, paramString2, paramThrowable);
        return;
        Log.e(paramString1, paramString2, paramThrowable);
        return;
        Log.i(paramString1, paramString2, paramThrowable);
        return;
        Log.w(paramString1, paramString2, paramThrowable);
        return;
        switch (paramInt)
        {
        }
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public static void a(int paramInt, String paramString1, String paramString2, Object... paramVarArgs)
  {
    try
    {
      if (!b) {
        return;
      }
      paramString2 = String.format(paramString2, paramVarArgs);
      switch (paramInt)
      {
      }
      for (;;)
      {
        Log.v(paramString1, paramString2);
        return;
        Log.d(paramString1, paramString2);
        return;
        Log.e(paramString1, paramString2);
        return;
        Log.i(paramString1, paramString2);
        return;
        Log.w(paramString1, paramString2);
        return;
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    try
    {
      a(3, paramString1, paramString2, paramVarArgs);
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    try
    {
      a(4, a, paramString, paramThrowable);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    try
    {
      a(4, a, paramString, paramVarArgs);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public static void a(Throwable paramThrowable)
  {
    try
    {
      a(6, a, "", paramThrowable);
      return;
    }
    catch (Throwable paramThrowable) {}
  }
  
  public static void a(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    try
    {
      a(3, a, paramString, paramThrowable);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    try
    {
      a(6, a, paramString, paramVarArgs);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public static void b(Throwable paramThrowable)
  {
    try
    {
      a(3, a, "", paramThrowable);
      return;
    }
    catch (Throwable paramThrowable) {}
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    try
    {
      a(5, a, paramString, paramVarArgs);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    try
    {
      a(3, a, paramString, paramVarArgs);
      return;
    }
    catch (Throwable paramString) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.e.a
 * JD-Core Version:    0.7.0.1
 */