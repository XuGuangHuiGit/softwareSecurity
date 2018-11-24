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
    //   3: lstore_3
    //   4: aconst_null
    //   5: astore 7
    //   7: aload_1
    //   8: ifnonnull +29 -> 37
    //   11: iconst_0
    //   12: ifeq +11 -> 23
    //   15: new 13	java/lang/NullPointerException
    //   18: dup
    //   19: invokespecial 17	java/lang/NullPointerException:<init>	()V
    //   22: athrow
    //   23: iconst_0
    //   24: ifeq +11 -> 35
    //   27: new 13	java/lang/NullPointerException
    //   30: dup
    //   31: invokespecial 17	java/lang/NullPointerException:<init>	()V
    //   34: athrow
    //   35: lload_3
    //   36: lreturn
    //   37: aload_0
    //   38: invokestatic 21	net/youmi/android/c/h/g:b	(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   41: astore_0
    //   42: new 23	org/apache/http/client/methods/HttpGet
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 26	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   50: astore 7
    //   52: aload_0
    //   53: aload 7
    //   55: invokevirtual 32	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   58: astore_1
    //   59: aload_1
    //   60: invokeinterface 38 1 0
    //   65: invokeinterface 44 1 0
    //   70: istore_2
    //   71: iload_2
    //   72: sipush 200
    //   75: if_icmplt +56 -> 131
    //   78: iload_2
    //   79: sipush 300
    //   82: if_icmpge +49 -> 131
    //   85: aload_1
    //   86: invokeinterface 48 1 0
    //   91: invokeinterface 54 1 0
    //   96: lstore 5
    //   98: aload 7
    //   100: ifnull +8 -> 108
    //   103: aload 7
    //   105: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   108: lload 5
    //   110: lstore_3
    //   111: aload_0
    //   112: ifnull -77 -> 35
    //   115: aload_0
    //   116: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   119: invokeinterface 66 1 0
    //   124: lload 5
    //   126: lreturn
    //   127: astore_0
    //   128: lload 5
    //   130: lreturn
    //   131: aload 7
    //   133: ifnull +8 -> 141
    //   136: aload 7
    //   138: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   141: aload_0
    //   142: ifnull -107 -> 35
    //   145: aload_0
    //   146: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   149: invokeinterface 66 1 0
    //   154: ldc2_w 10
    //   157: lreturn
    //   158: astore_0
    //   159: ldc2_w 10
    //   162: lreturn
    //   163: astore_0
    //   164: aconst_null
    //   165: astore_1
    //   166: aload 7
    //   168: astore_0
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   177: aload_0
    //   178: ifnull -143 -> 35
    //   181: aload_0
    //   182: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   185: invokeinterface 66 1 0
    //   190: ldc2_w 10
    //   193: lreturn
    //   194: astore_0
    //   195: ldc2_w 10
    //   198: lreturn
    //   199: astore_1
    //   200: aconst_null
    //   201: astore 7
    //   203: aconst_null
    //   204: astore_0
    //   205: aload 7
    //   207: ifnull +8 -> 215
    //   210: aload 7
    //   212: invokevirtual 57	org/apache/http/client/methods/HttpGet:abort	()V
    //   215: aload_0
    //   216: ifnull +12 -> 228
    //   219: aload_0
    //   220: invokevirtual 61	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   223: invokeinterface 66 1 0
    //   228: aload_1
    //   229: athrow
    //   230: astore_0
    //   231: goto -208 -> 23
    //   234: astore_1
    //   235: goto -127 -> 108
    //   238: astore_1
    //   239: goto -98 -> 141
    //   242: astore_1
    //   243: goto -66 -> 177
    //   246: astore 7
    //   248: goto -33 -> 215
    //   251: astore_0
    //   252: goto -24 -> 228
    //   255: astore_1
    //   256: aconst_null
    //   257: astore 7
    //   259: goto -54 -> 205
    //   262: astore_1
    //   263: goto -58 -> 205
    //   266: astore_1
    //   267: aconst_null
    //   268: astore_1
    //   269: goto -100 -> 169
    //   272: astore_1
    //   273: aload 7
    //   275: astore_1
    //   276: goto -107 -> 169
    //   279: astore_0
    //   280: ldc2_w 10
    //   283: lreturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	paramContext	Context
    //   0	284	1	paramString	String
    //   70	13	2	i	int
    //   3	108	3	l1	long
    //   96	33	5	l2	long
    //   5	206	7	localHttpGet	org.apache.http.client.methods.HttpGet
    //   246	1	7	localThrowable	Throwable
    //   257	17	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   115	124	127	java/lang/Throwable
    //   145	154	158	java/lang/Throwable
    //   37	42	163	java/lang/Throwable
    //   181	190	194	java/lang/Throwable
    //   37	42	199	finally
    //   15	23	230	java/lang/Throwable
    //   103	108	234	java/lang/Throwable
    //   136	141	238	java/lang/Throwable
    //   173	177	242	java/lang/Throwable
    //   210	215	246	java/lang/Throwable
    //   219	228	251	java/lang/Throwable
    //   42	52	255	finally
    //   52	71	262	finally
    //   85	98	262	finally
    //   42	52	266	java/lang/Throwable
    //   52	71	272	java/lang/Throwable
    //   85	98	272	java/lang/Throwable
    //   27	35	279	java/lang/Throwable
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.g
 * JD-Core Version:    0.7.0.1
 */