package net.youmi.android.c.g;

import android.content.Context;
import net.youmi.android.c.b.d;
import org.json.JSONObject;

public class e
{
  public static String a = "";
  protected static int b = 0;
  protected static String c = "";
  protected static int d = 0;
  protected static String e = "";
  protected static int f = 0;
  protected static String g = "";
  protected static int h = 0;
  public static long i = 0L;
  
  public static void a(Context paramContext)
  {
    a = net.youmi.android.a.b.a.a(paramContext, "m_host", null);
    b = Integer.valueOf(net.youmi.android.a.b.a.a(paramContext, "m_port", "0")).intValue();
    c = net.youmi.android.a.b.a.a(paramContext, "m_wifi_type", "udp");
    d = Integer.valueOf(net.youmi.android.a.b.a.a(paramContext, "m_wifi_rate", "50")).intValue();
    g = net.youmi.android.a.b.a.a(paramContext, "m_2g_type", "tcp");
    h = Integer.valueOf(net.youmi.android.a.b.a.a(paramContext, "m_2g_rate", "50")).intValue();
    e = net.youmi.android.a.b.a.a(paramContext, "m_3g_type", "tcp");
    f = Integer.valueOf(net.youmi.android.a.b.a.a(paramContext, "m_3g_rate", "50")).intValue();
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, String paramString3, int paramInt3, String paramString4, int paramInt4)
  {
    try
    {
      a = paramString1;
      b = paramInt1;
      d = paramInt2;
      c = paramString2;
      h = paramInt4;
      g = paramString4;
      f = f;
      e = e;
      if (paramLong <= 0L) {}
      for (i = 86400000L;; i = 1000L * paramLong)
      {
        net.youmi.android.a.b.a.a(paramContext, "m_host", a, i);
        net.youmi.android.a.b.a.a(paramContext, "m_port", String.valueOf(b), i);
        net.youmi.android.a.b.a.a(paramContext, "m_wifi_type", c, i);
        net.youmi.android.a.b.a.a(paramContext, "m_wifi_rate", String.valueOf(d), i);
        net.youmi.android.a.b.a.a(paramContext, "m_3g_rate", String.valueOf(f), i);
        net.youmi.android.a.b.a.a(paramContext, "m_3g_type", e, i);
        net.youmi.android.a.b.a.a(paramContext, "m_2g_rate", String.valueOf(h), i);
        net.youmi.android.a.b.a.a(paramContext, "m_2g_type", g, i);
        return;
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(Context paramContext, JSONObject paramJSONObject)
  {
    try
    {
      a(paramContext);
      if ((a == null) || (a.equals(""))) {
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        try
        {
          String str2;
          String str1;
          if (net.youmi.android.c.h.b.a(paramContext).equals("wifi"))
          {
            str2 = "wifi";
            str1 = c;
            if (!a(str2)) {
              continue;
            }
            if (str1.equals("udp"))
            {
              net.youmi.android.c.e.b.a("try to send udp data");
              g.a(paramContext, paramJSONObject, a, b);
            }
          }
          else
          {
            int j = net.youmi.android.c.a.k(paramContext);
            if (((j == 3) || (j > 4)) && (j != 7))
            {
              str2 = "3g";
              str1 = e;
              continue;
            }
            str2 = "2g";
            str1 = g;
            continue;
          }
          if (str1.equals("tcp"))
          {
            net.youmi.android.c.e.b.a("try to send tcp data");
            f.a(paramContext, paramJSONObject, a, b);
            return;
          }
          net.youmi.android.c.e.b.a("not udp or tcp?");
          return;
        }
        catch (Throwable paramContext) {}
        localThrowable = localThrowable;
      }
    }
  }
  
  protected static boolean a(String paramString)
  {
    int j = d.a(100);
    if (paramString.equals("wifi"))
    {
      if (j >= d) {}
    }
    else {
      do
      {
        return true;
        if (!paramString.equals("3g")) {
          break;
        }
      } while (j < f);
    }
    while (j >= h) {
      return false;
    }
    return true;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.e
 * JD-Core Version:    0.7.0.1
 */