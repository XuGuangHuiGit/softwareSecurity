package net.youmi.android.c.g;

import android.content.Context;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class a
{
  protected HttpUriRequest a;
  protected long b = 0L;
  protected HttpClient c;
  protected b d;
  protected c e;
  protected Context f;
  
  public a(Context paramContext, c paramc)
  {
    if ((paramContext == null) || (paramc == null)) {
      throw new NullPointerException();
    }
    this.f = paramContext.getApplicationContext();
    this.e = paramc;
  }
  
  private void a(HttpResponse paramHttpResponse, long paramLong)
  {
    if (paramHttpResponse == null) {}
    b localb;
    do
    {
      do
      {
        return;
        localb = this.d;
      } while (localb == null);
      localb.b(System.currentTimeMillis() - paramLong);
      int i = paramHttpResponse.getStatusLine().getStatusCode();
      String str = paramHttpResponse.getStatusLine().getReasonPhrase();
      localb.a(i);
      localb.a(str);
    } while (!localb.f());
    localb.a(this.a.getAllHeaders());
    localb.b(paramHttpResponse.getAllHeaders());
  }
  
  /* Error */
  private HttpResponse d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 34	net/youmi/android/c/g/a:f	Landroid/content/Context;
    //   12: invokestatic 104	net/youmi/android/c/h/g:b	(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   15: putfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   18: aload_0
    //   19: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   22: ifnonnull +89 -> 111
    //   25: aload_0
    //   26: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   29: invokevirtual 109	net/youmi/android/c/g/c:c	()Ljava/util/List;
    //   32: ifnull +144 -> 176
    //   35: aload_0
    //   36: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   39: invokevirtual 109	net/youmi/android/c/g/c:c	()Ljava/util/List;
    //   42: invokeinterface 114 1 0
    //   47: ifle +129 -> 176
    //   50: new 116	org/apache/http/client/methods/HttpPost
    //   53: dup
    //   54: aload_0
    //   55: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   58: invokevirtual 118	net/youmi/android/c/g/c:a	()Ljava/lang/String;
    //   61: invokespecial 120	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   64: astore_3
    //   65: aload_0
    //   66: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   69: invokevirtual 109	net/youmi/android/c/g/c:c	()Ljava/util/List;
    //   72: astore 4
    //   74: aload_0
    //   75: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   78: invokevirtual 122	net/youmi/android/c/g/c:e	()Ljava/lang/String;
    //   81: ifnull +89 -> 170
    //   84: aload_0
    //   85: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   88: invokevirtual 122	net/youmi/android/c/g/c:e	()Ljava/lang/String;
    //   91: astore_2
    //   92: aload_3
    //   93: new 124	org/apache/http/client/entity/UrlEncodedFormEntity
    //   96: dup
    //   97: aload 4
    //   99: aload_2
    //   100: invokespecial 127	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   103: invokevirtual 131	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   106: aload_0
    //   107: aload_3
    //   108: putfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   111: aload_0
    //   112: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   115: invokevirtual 133	net/youmi/android/c/g/c:d	()Ljava/util/List;
    //   118: astore_2
    //   119: aload_2
    //   120: ifnull +87 -> 207
    //   123: aload_2
    //   124: invokeinterface 114 1 0
    //   129: ifle +78 -> 207
    //   132: iconst_0
    //   133: istore_1
    //   134: iload_1
    //   135: aload_2
    //   136: invokeinterface 114 1 0
    //   141: if_icmpge +66 -> 207
    //   144: aload_0
    //   145: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   148: aload_2
    //   149: iload_1
    //   150: invokeinterface 137 2 0
    //   155: checkcast 139	org/apache/http/Header
    //   158: invokeinterface 143 2 0
    //   163: iload_1
    //   164: iconst_1
    //   165: iadd
    //   166: istore_1
    //   167: goto -33 -> 134
    //   170: ldc 145
    //   172: astore_2
    //   173: goto -81 -> 92
    //   176: aload_0
    //   177: new 147	org/apache/http/client/methods/HttpGet
    //   180: dup
    //   181: aload_0
    //   182: getfield 36	net/youmi/android/c/g/a:e	Lnet/youmi/android/c/g/c;
    //   185: invokevirtual 118	net/youmi/android/c/g/c:a	()Ljava/lang/String;
    //   188: invokespecial 148	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   191: putfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   194: goto -83 -> 111
    //   197: astore_2
    //   198: aload_0
    //   199: bipush 155
    //   201: invokevirtual 149	net/youmi/android/c/g/a:a	(I)V
    //   204: aconst_null
    //   205: areturn
    //   206: astore_2
    //   207: aload_0
    //   208: invokevirtual 151	net/youmi/android/c/g/a:b	()V
    //   211: aload_0
    //   212: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   215: aload_0
    //   216: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   219: invokeinterface 157 2 0
    //   224: astore_2
    //   225: aload_2
    //   226: areturn
    //   227: astore_2
    //   228: aload_0
    //   229: bipush 156
    //   231: invokevirtual 149	net/youmi/android/c/g/a:a	(I)V
    //   234: goto -30 -> 204
    //   237: astore_2
    //   238: aload_2
    //   239: athrow
    //   240: astore_2
    //   241: goto -30 -> 211
    //   244: astore_2
    //   245: goto -41 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	a
    //   133	34	1	i	int
    //   91	82	2	localObject1	Object
    //   197	1	2	localConnectionPoolTimeoutException	org.apache.http.conn.ConnectionPoolTimeoutException
    //   206	1	2	localThrowable1	Throwable
    //   224	2	2	localHttpResponse	HttpResponse
    //   227	1	2	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   237	2	2	localObject2	Object
    //   240	1	2	localThrowable2	Throwable
    //   244	1	2	localThrowable3	Throwable
    //   64	44	3	localHttpPost	org.apache.http.client.methods.HttpPost
    //   72	26	4	localList	java.util.List
    // Exception table:
    //   from	to	target	type
    //   0	18	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   18	92	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   92	111	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   111	119	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   123	132	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   134	163	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   176	194	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   207	211	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   211	225	197	org/apache/http/conn/ConnectionPoolTimeoutException
    //   111	119	206	java/lang/Throwable
    //   123	132	206	java/lang/Throwable
    //   134	163	206	java/lang/Throwable
    //   0	18	227	org/apache/http/conn/ConnectTimeoutException
    //   18	92	227	org/apache/http/conn/ConnectTimeoutException
    //   92	111	227	org/apache/http/conn/ConnectTimeoutException
    //   111	119	227	org/apache/http/conn/ConnectTimeoutException
    //   123	132	227	org/apache/http/conn/ConnectTimeoutException
    //   134	163	227	org/apache/http/conn/ConnectTimeoutException
    //   176	194	227	org/apache/http/conn/ConnectTimeoutException
    //   207	211	227	org/apache/http/conn/ConnectTimeoutException
    //   211	225	227	org/apache/http/conn/ConnectTimeoutException
    //   0	18	237	finally
    //   18	92	237	finally
    //   92	111	237	finally
    //   111	119	237	finally
    //   123	132	237	finally
    //   134	163	237	finally
    //   176	194	237	finally
    //   198	204	237	finally
    //   207	211	237	finally
    //   211	225	237	finally
    //   228	234	237	finally
    //   207	211	240	java/lang/Throwable
    //   0	18	244	java/lang/Throwable
    //   18	92	244	java/lang/Throwable
    //   92	111	244	java/lang/Throwable
    //   176	194	244	java/lang/Throwable
    //   211	225	244	java/lang/Throwable
  }
  
  public long a()
  {
    return this.b;
  }
  
  protected void a(int paramInt)
  {
    try
    {
      if (this.d != null) {
        this.d.b(paramInt);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void a(b paramb)
  {
    this.d = paramb;
  }
  
  protected abstract void a(HttpResponse paramHttpResponse);
  
  protected void b() {}
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 46	java/lang/System:currentTimeMillis	()J
    //   5: lstore_1
    //   6: aload_0
    //   7: lload_1
    //   8: putfield 23	net/youmi/android/c/g/a:b	J
    //   11: aload_0
    //   12: invokespecial 163	net/youmi/android/c/g/a:d	()Lorg/apache/http/HttpResponse;
    //   15: astore 5
    //   17: aload_0
    //   18: aload 5
    //   20: lload_1
    //   21: invokespecial 165	net/youmi/android/c/g/a:a	(Lorg/apache/http/HttpResponse;J)V
    //   24: aload_0
    //   25: aload 5
    //   27: invokevirtual 167	net/youmi/android/c/g/a:a	(Lorg/apache/http/HttpResponse;)V
    //   30: aload_0
    //   31: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   34: ifnull +12 -> 46
    //   37: aload_0
    //   38: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   41: invokeinterface 170 1 0
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   51: aload_0
    //   52: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   55: ifnull +17 -> 72
    //   58: aload_0
    //   59: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   62: invokeinterface 174 1 0
    //   67: invokeinterface 179 1 0
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   77: aload_0
    //   78: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   81: ifnull +17 -> 98
    //   84: invokestatic 46	java/lang/System:currentTimeMillis	()J
    //   87: lstore_3
    //   88: aload_0
    //   89: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   92: lload_3
    //   93: lload_1
    //   94: lsub
    //   95: invokevirtual 181	net/youmi/android/c/g/b:a	(J)V
    //   98: aload_0
    //   99: monitorexit
    //   100: return
    //   101: astore 5
    //   103: aload_0
    //   104: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   107: ifnull +12 -> 119
    //   110: aload_0
    //   111: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   114: invokeinterface 170 1 0
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   124: aload_0
    //   125: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   128: ifnull +17 -> 145
    //   131: aload_0
    //   132: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   135: invokeinterface 174 1 0
    //   140: invokeinterface 179 1 0
    //   145: aload_0
    //   146: aconst_null
    //   147: putfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   150: aload_0
    //   151: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   154: ifnull -56 -> 98
    //   157: invokestatic 46	java/lang/System:currentTimeMillis	()J
    //   160: lstore_3
    //   161: aload_0
    //   162: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   165: lload_3
    //   166: lload_1
    //   167: lsub
    //   168: invokevirtual 181	net/youmi/android/c/g/b:a	(J)V
    //   171: goto -73 -> 98
    //   174: astore 5
    //   176: goto -78 -> 98
    //   179: astore 5
    //   181: aload_0
    //   182: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   185: ifnull +12 -> 197
    //   188: aload_0
    //   189: getfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   192: invokeinterface 170 1 0
    //   197: aload_0
    //   198: aconst_null
    //   199: putfield 78	net/youmi/android/c/g/a:a	Lorg/apache/http/client/methods/HttpUriRequest;
    //   202: aload_0
    //   203: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   206: ifnull +17 -> 223
    //   209: aload_0
    //   210: getfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   213: invokeinterface 174 1 0
    //   218: invokeinterface 179 1 0
    //   223: aload_0
    //   224: aconst_null
    //   225: putfield 99	net/youmi/android/c/g/a:c	Lorg/apache/http/client/HttpClient;
    //   228: aload_0
    //   229: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   232: ifnull +17 -> 249
    //   235: invokestatic 46	java/lang/System:currentTimeMillis	()J
    //   238: lstore_3
    //   239: aload_0
    //   240: getfield 40	net/youmi/android/c/g/a:d	Lnet/youmi/android/c/g/b;
    //   243: lload_3
    //   244: lload_1
    //   245: lsub
    //   246: invokevirtual 181	net/youmi/android/c/g/b:a	(J)V
    //   249: aload 5
    //   251: athrow
    //   252: astore 5
    //   254: aload_0
    //   255: monitorexit
    //   256: aload 5
    //   258: athrow
    //   259: astore 6
    //   261: goto -237 -> 24
    //   264: astore 6
    //   266: goto -17 -> 249
    //   269: astore 6
    //   271: goto -48 -> 223
    //   274: astore 6
    //   276: goto -79 -> 197
    //   279: astore 5
    //   281: goto -136 -> 145
    //   284: astore 5
    //   286: goto -167 -> 119
    //   289: astore 5
    //   291: goto -193 -> 98
    //   294: astore 5
    //   296: goto -224 -> 72
    //   299: astore 5
    //   301: goto -255 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	this	a
    //   5	240	1	l1	long
    //   87	157	3	l2	long
    //   15	11	5	localHttpResponse	HttpResponse
    //   101	1	5	localThrowable1	Throwable
    //   174	1	5	localThrowable2	Throwable
    //   179	71	5	localObject1	Object
    //   252	5	5	localObject2	Object
    //   279	1	5	localThrowable3	Throwable
    //   284	1	5	localThrowable4	Throwable
    //   289	1	5	localThrowable5	Throwable
    //   294	1	5	localThrowable6	Throwable
    //   299	1	5	localThrowable7	Throwable
    //   259	1	6	localThrowable8	Throwable
    //   264	1	6	localThrowable9	Throwable
    //   269	1	6	localThrowable10	Throwable
    //   274	1	6	localThrowable11	Throwable
    // Exception table:
    //   from	to	target	type
    //   11	17	101	java/lang/Throwable
    //   24	30	101	java/lang/Throwable
    //   150	171	174	java/lang/Throwable
    //   11	17	179	finally
    //   17	24	179	finally
    //   24	30	179	finally
    //   2	11	252	finally
    //   30	46	252	finally
    //   46	51	252	finally
    //   51	72	252	finally
    //   72	77	252	finally
    //   77	98	252	finally
    //   103	119	252	finally
    //   119	124	252	finally
    //   124	145	252	finally
    //   145	150	252	finally
    //   150	171	252	finally
    //   181	197	252	finally
    //   197	202	252	finally
    //   202	223	252	finally
    //   223	228	252	finally
    //   228	249	252	finally
    //   249	252	252	finally
    //   17	24	259	java/lang/Throwable
    //   228	249	264	java/lang/Throwable
    //   202	223	269	java/lang/Throwable
    //   181	197	274	java/lang/Throwable
    //   124	145	279	java/lang/Throwable
    //   103	119	284	java/lang/Throwable
    //   77	98	289	java/lang/Throwable
    //   51	72	294	java/lang/Throwable
    //   30	46	299	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.a
 * JD-Core Version:    0.7.0.1
 */