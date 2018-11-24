package net.youmi.android.c.h;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import org.apache.http.HttpHost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class g
{
  private static String a;
  
  /* Error */
  public static long a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 10
    //   3: lstore 5
    //   5: aconst_null
    //   6: astore 7
    //   8: aload_1
    //   9: ifnonnull +30 -> 39
    //   12: iconst_0
    //   13: ifeq +11 -> 24
    //   16: new 13	java/lang/NullPointerException
    //   19: dup
    //   20: invokespecial 17	java/lang/NullPointerException:<init>	()V
    //   23: athrow
    //   24: iconst_0
    //   25: ifeq +11 -> 36
    //   28: new 13	java/lang/NullPointerException
    //   31: dup
    //   32: invokespecial 17	java/lang/NullPointerException:<init>	()V
    //   35: athrow
    //   36: lload 5
    //   38: lreturn
    //   39: aload_0
    //   40: invokestatic 21	net/youmi/android/c/h/g:b	(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   43: astore_0
    //   44: new 23	org/apache/http/client/methods/HttpGet
    //   47: dup
    //   48: aload_1
    //   49: invokespecial 26	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   52: astore 7
    //   54: aload_0
    //   55: aload 7
    //   57: invokevirtual 32	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   60: astore_1
    //   61: aload_1
    //   62: invokeinterface 38 1 0
    //   67: invokeinterface 44 1 0
    //   72: istore_2
    //   73: iload_2
    //   74: sipush 200
    //   77: if_icmplt +53 -> 130
    //   80: iload_2
    //   81: sipush 300
    //   84: if_icmpge +46 -> 130
    //   87: aload_1
    //   88: invokeinterface 48 1 0
    //   93: invokeinterface 54 1 0
    //   98: lstore_3
    //   99: aload 7
    //   101: ifnull +8 -> 109
    //   104: aload 7
    //   106: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   109: lload_3
    //   110: lstore 5
    //   112: aload_0
    //   113: ifnull -77 -> 36
    //   116: aload_0
    //   117: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   120: invokeinterface 66 1 0
    //   125: lload_3
    //   126: lreturn
    //   127: astore_0
    //   128: lload_3
    //   129: lreturn
    //   130: aload 7
    //   132: ifnull +8 -> 140
    //   135: aload 7
    //   137: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   140: aload_0
    //   141: ifnull -105 -> 36
    //   144: aload_0
    //   145: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   148: invokeinterface 66 1 0
    //   153: ldc2_w 10
    //   156: lreturn
    //   157: astore_0
    //   158: ldc2_w 10
    //   161: lreturn
    //   162: astore_0
    //   163: aconst_null
    //   164: astore_1
    //   165: aload 7
    //   167: astore_0
    //   168: aload_1
    //   169: ifnull +7 -> 176
    //   172: aload_1
    //   173: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   176: aload_0
    //   177: ifnull -141 -> 36
    //   180: aload_0
    //   181: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   184: invokeinterface 66 1 0
    //   189: ldc2_w 10
    //   192: lreturn
    //   193: astore_0
    //   194: ldc2_w 10
    //   197: lreturn
    //   198: astore_1
    //   199: aconst_null
    //   200: astore 7
    //   202: aconst_null
    //   203: astore_0
    //   204: aload 7
    //   206: ifnull +8 -> 214
    //   209: aload 7
    //   211: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   214: aload_0
    //   215: ifnull +12 -> 227
    //   218: aload_0
    //   219: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   222: invokeinterface 66 1 0
    //   227: aload_1
    //   228: athrow
    //   229: astore_0
    //   230: goto -206 -> 24
    //   233: astore_1
    //   234: goto -125 -> 109
    //   237: astore_1
    //   238: goto -98 -> 140
    //   241: astore_1
    //   242: goto -66 -> 176
    //   245: astore 7
    //   247: goto -33 -> 214
    //   250: astore_0
    //   251: goto -24 -> 227
    //   254: astore_1
    //   255: aconst_null
    //   256: astore 7
    //   258: goto -54 -> 204
    //   261: astore_1
    //   262: goto -58 -> 204
    //   265: astore_1
    //   266: aconst_null
    //   267: astore_1
    //   268: goto -100 -> 168
    //   271: astore_1
    //   272: aload 7
    //   274: astore_1
    //   275: goto -107 -> 168
    //   278: astore_0
    //   279: ldc2_w 10
    //   282: lreturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	283	0	paramContext	Context
    //   0	283	1	paramString	String
    //   72	13	2	i	int
    //   98	31	3	l1	long
    //   3	108	5	l2	long
    //   6	204	7	localHttpGet	org.apache.http.client.methods.HttpGet
    //   245	1	7	localThrowable	Throwable
    //   256	17	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   116	125	127	java/lang/Throwable
    //   144	153	157	java/lang/Throwable
    //   39	44	162	java/lang/Throwable
    //   180	189	193	java/lang/Throwable
    //   39	44	198	finally
    //   16	24	229	java/lang/Throwable
    //   104	109	233	java/lang/Throwable
    //   135	140	237	java/lang/Throwable
    //   172	176	241	java/lang/Throwable
    //   209	214	245	java/lang/Throwable
    //   218	227	250	java/lang/Throwable
    //   44	54	254	finally
    //   54	73	261	finally
    //   87	99	261	finally
    //   44	54	265	java/lang/Throwable
    //   54	73	271	java/lang/Throwable
    //   87	99	271	java/lang/Throwable
    //   28	36	278	java/lang/Throwable
  }
  
  public static String a()
  {
    if (a == null) {}
    try
    {
      StringBuilder localStringBuilder = new StringBuilder(256);
      localStringBuilder.append("Mozilla/5.0 (Linux; U; Android ");
      localStringBuilder.append(Build.VERSION.RELEASE);
      localStringBuilder.append("; ");
      localStringBuilder.append(net.youmi.android.c.a.a().toLowerCase());
      localStringBuilder.append("; ");
      localStringBuilder.append(net.youmi.android.c.a.d());
      localStringBuilder.append(" Build/");
      localStringBuilder.append(Build.ID);
      localStringBuilder.append(") AppleWebkit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
      a = localStringBuilder.toString();
      return a;
    }
    catch (Throwable localThrowable) {}
    return "";
  }
  
  public static DefaultHttpClient a(Context paramContext, a parama)
  {
    paramContext = new DefaultHttpClient(a(paramContext));
    paramContext.setRedirectHandler(new i(parama));
    return paramContext;
  }
  
  public static HttpParams a(Context paramContext)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
    HttpClientParams.setRedirecting(localBasicHttpParams, true);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, a());
    if (b.a(paramContext).equals("cmwap")) {
      localBasicHttpParams.setParameter("http.route.default-proxy", new HttpHost("10.0.0.172", 80, null));
    }
    return localBasicHttpParams;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramString1 == null) || (paramString2 == null)) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      try
      {
        paramString1 = paramString1.trim();
        paramString2 = paramString2.trim();
        if ((paramString1.length() == 0) || (paramString2.length() == 0)) {
          break label90;
        }
        bool1 = bool2;
        if (!paramString1.equalsIgnoreCase(paramString2))
        {
          paramString2 = Uri.parse(paramString2);
          if (paramString1.contains(paramString2.getPath()))
          {
            boolean bool3 = paramString1.contains(paramString2.getHost());
            bool1 = bool2;
            if (bool3) {
              continue;
            }
          }
        }
      }
      catch (Throwable paramString1)
      {
        label84:
        break label84;
      }
    }
    return false;
    label90:
    return false;
  }
  
  public static DefaultHttpClient b(Context paramContext)
  {
    return a(paramContext, new h());
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.g
 * JD-Core Version:    0.7.0.1
 */