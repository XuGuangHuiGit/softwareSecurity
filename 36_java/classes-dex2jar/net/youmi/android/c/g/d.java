package net.youmi.android.c.g;

import android.content.Context;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

public class d
  extends a
{
  private String g;
  
  public d(Context paramContext, c paramc)
  {
    super(paramContext, paramc);
  }
  
  /* Error */
  private static String a(Context paramContext, HttpResponse paramHttpResponse, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_1
    //   4: ifnull +300 -> 304
    //   7: aload_1
    //   8: invokeinterface 21 1 0
    //   13: invokeinterface 27 1 0
    //   18: istore 4
    //   20: iload_3
    //   21: ifeq +20 -> 41
    //   24: ldc 29
    //   26: iconst_1
    //   27: anewarray 31	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: iload 4
    //   34: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aastore
    //   38: invokestatic 43	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iload 4
    //   43: sipush 200
    //   46: if_icmplt +271 -> 317
    //   49: iload 4
    //   51: sipush 300
    //   54: if_icmpge +263 -> 317
    //   57: aload_1
    //   58: invokeinterface 47 1 0
    //   63: astore_1
    //   64: iload_3
    //   65: ifeq +33 -> 98
    //   68: ldc 49
    //   70: iconst_2
    //   71: anewarray 31	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_1
    //   77: invokeinterface 55 1 0
    //   82: invokestatic 60	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload_1
    //   89: invokeinterface 64 1 0
    //   94: aastore
    //   95: invokestatic 43	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload_1
    //   99: invokeinterface 67 1 0
    //   104: astore_0
    //   105: aload_0
    //   106: ifnull +281 -> 387
    //   109: aload_0
    //   110: invokeinterface 73 1 0
    //   115: getstatic 79	java/util/Locale:US	Ljava/util/Locale;
    //   118: invokevirtual 85	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   121: ldc 87
    //   123: invokevirtual 91	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   126: ifeq +261 -> 387
    //   129: new 93	java/util/zip/GZIPInputStream
    //   132: dup
    //   133: aload_1
    //   134: invokeinterface 97 1 0
    //   139: invokespecial 100	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   142: astore_0
    //   143: aload_0
    //   144: astore 5
    //   146: aload_0
    //   147: ifnonnull +11 -> 158
    //   150: aload_1
    //   151: invokeinterface 97 1 0
    //   156: astore 5
    //   158: aload 5
    //   160: ifnonnull +42 -> 202
    //   163: iload_3
    //   164: ifeq +12 -> 176
    //   167: ldc 102
    //   169: iconst_0
    //   170: anewarray 31	java/lang/Object
    //   173: invokestatic 105	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: iconst_0
    //   177: ifeq +11 -> 188
    //   180: new 107	java/lang/NullPointerException
    //   183: dup
    //   184: invokespecial 110	java/lang/NullPointerException:<init>	()V
    //   187: athrow
    //   188: aconst_null
    //   189: areturn
    //   190: astore_0
    //   191: iload_3
    //   192: ifeq +195 -> 387
    //   195: aload_0
    //   196: invokestatic 113	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   199: goto +188 -> 387
    //   202: new 115	java/io/ByteArrayOutputStream
    //   205: dup
    //   206: invokespecial 116	java/io/ByteArrayOutputStream:<init>	()V
    //   209: astore_1
    //   210: aload_1
    //   211: astore_0
    //   212: sipush 1024
    //   215: newarray byte
    //   217: astore 6
    //   219: aload_1
    //   220: astore_0
    //   221: aload 5
    //   223: aload 6
    //   225: invokevirtual 122	java/io/InputStream:read	([B)I
    //   228: istore 4
    //   230: iload 4
    //   232: ifle +41 -> 273
    //   235: aload_1
    //   236: astore_0
    //   237: aload_1
    //   238: aload 6
    //   240: iconst_0
    //   241: iload 4
    //   243: invokevirtual 126	java/io/ByteArrayOutputStream:write	([BII)V
    //   246: goto -27 -> 219
    //   249: astore_2
    //   250: iload_3
    //   251: ifeq +9 -> 260
    //   254: aload_1
    //   255: astore_0
    //   256: aload_2
    //   257: invokestatic 113	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   260: aload_1
    //   261: ifnull -73 -> 188
    //   264: aload_1
    //   265: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   268: aconst_null
    //   269: areturn
    //   270: astore_0
    //   271: aconst_null
    //   272: areturn
    //   273: aload_1
    //   274: astore_0
    //   275: aload_1
    //   276: invokevirtual 132	java/io/ByteArrayOutputStream:flush	()V
    //   279: aload_1
    //   280: astore_0
    //   281: new 81	java/lang/String
    //   284: dup
    //   285: aload_1
    //   286: invokevirtual 136	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   289: aload_2
    //   290: invokespecial 139	java/lang/String:<init>	([BLjava/lang/String;)V
    //   293: astore_2
    //   294: aload_1
    //   295: ifnull +7 -> 302
    //   298: aload_1
    //   299: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   302: aload_2
    //   303: areturn
    //   304: iload_3
    //   305: ifeq +12 -> 317
    //   308: ldc 141
    //   310: iconst_0
    //   311: anewarray 31	java/lang/Object
    //   314: invokestatic 105	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: iconst_0
    //   318: ifeq -130 -> 188
    //   321: new 107	java/lang/NullPointerException
    //   324: dup
    //   325: invokespecial 110	java/lang/NullPointerException:<init>	()V
    //   328: athrow
    //   329: astore_0
    //   330: aconst_null
    //   331: areturn
    //   332: astore_0
    //   333: aload 6
    //   335: astore_1
    //   336: aload_1
    //   337: ifnull +7 -> 344
    //   340: aload_1
    //   341: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   344: aload_0
    //   345: athrow
    //   346: astore_0
    //   347: aconst_null
    //   348: areturn
    //   349: astore_0
    //   350: goto -48 -> 302
    //   353: astore_0
    //   354: goto -94 -> 260
    //   357: astore_1
    //   358: goto -14 -> 344
    //   361: astore_2
    //   362: aload_0
    //   363: astore_1
    //   364: aload_2
    //   365: astore_0
    //   366: goto -30 -> 336
    //   369: astore_2
    //   370: aconst_null
    //   371: astore_1
    //   372: goto -122 -> 250
    //   375: astore_0
    //   376: goto -200 -> 176
    //   379: astore_0
    //   380: goto -282 -> 98
    //   383: astore_0
    //   384: goto -343 -> 41
    //   387: aconst_null
    //   388: astore_0
    //   389: goto -246 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	paramContext	Context
    //   0	392	1	paramHttpResponse	HttpResponse
    //   0	392	2	paramString	String
    //   0	392	3	paramBoolean	boolean
    //   18	224	4	i	int
    //   144	78	5	localObject	java.lang.Object
    //   1	333	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   98	105	190	java/lang/Throwable
    //   109	143	190	java/lang/Throwable
    //   212	219	249	java/lang/Throwable
    //   221	230	249	java/lang/Throwable
    //   237	246	249	java/lang/Throwable
    //   275	279	249	java/lang/Throwable
    //   281	294	249	java/lang/Throwable
    //   264	268	270	java/lang/Throwable
    //   321	329	329	java/lang/Throwable
    //   7	20	332	finally
    //   24	41	332	finally
    //   57	64	332	finally
    //   68	98	332	finally
    //   98	105	332	finally
    //   109	143	332	finally
    //   150	158	332	finally
    //   167	176	332	finally
    //   195	199	332	finally
    //   202	210	332	finally
    //   308	317	332	finally
    //   180	188	346	java/lang/Throwable
    //   298	302	349	java/lang/Throwable
    //   256	260	353	java/lang/Throwable
    //   340	344	357	java/lang/Throwable
    //   212	219	361	finally
    //   221	230	361	finally
    //   237	246	361	finally
    //   256	260	361	finally
    //   275	279	361	finally
    //   281	294	361	finally
    //   7	20	369	java/lang/Throwable
    //   57	64	369	java/lang/Throwable
    //   150	158	369	java/lang/Throwable
    //   195	199	369	java/lang/Throwable
    //   202	210	369	java/lang/Throwable
    //   308	317	369	java/lang/Throwable
    //   167	176	375	java/lang/Throwable
    //   68	98	379	java/lang/Throwable
    //   24	41	383	java/lang/Throwable
  }
  
  protected void a(HttpResponse paramHttpResponse)
  {
    if (this.e != null) {}
    for (boolean bool = this.e.b();; bool = false)
    {
      this.g = a(this.f, paramHttpResponse, this.e.e(), bool);
      return;
    }
  }
  
  protected void b()
  {
    super.b();
    this.a.addHeader("Accept-Encoding", "gzip");
  }
  
  public String d()
  {
    return this.g;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.d
 * JD-Core Version:    0.7.0.1
 */