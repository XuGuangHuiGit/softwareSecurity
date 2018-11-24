package net.youmi.android.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import net.youmi.android.c.c.a;
import net.youmi.android.c.c.f;

class b
{
  static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return false;
      try
      {
        String str2 = paramContext.getPackageName();
        byte[] arrayOfByte = f.a();
        String str1 = new String(a.a(arrayOfByte));
        paramString3 = f.a(paramString3, str2, arrayOfByte);
        if ((paramString3 != null) && (str1 != null))
        {
          paramContext = paramContext.getSharedPreferences(paramString1, 0).edit();
          paramContext.putString(paramString4, str1);
          paramContext.putString(paramString2, paramString3);
          boolean bool = paramContext.commit();
          return bool;
        }
      }
      catch (Throwable paramContext) {}
    }
    return false;
  }
  
  static String b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return paramString4;
      try
      {
        SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramString1, 0);
        if (localSharedPreferences != null)
        {
          paramString1 = localSharedPreferences.getString(paramString2, null);
          if (paramString1 != null)
          {
            paramString2 = localSharedPreferences.getString(paramString3, null);
            if (paramString2 != null)
            {
              paramString2 = a.b(paramString2.getBytes());
              if (paramString2 != null)
              {
                paramContext = f.b(paramString1, paramContext.getPackageName(), paramString2);
                if (paramContext != null)
                {
                  paramContext = paramContext.trim();
                  int i = paramContext.length();
                  if (i > 0) {
                    return paramContext;
                  }
                }
              }
            }
          }
        }
      }
      catch (Throwable paramContext) {}
    }
    return paramString4;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.b.b.b
 * JD-Core Version:    0.7.0.1
 */