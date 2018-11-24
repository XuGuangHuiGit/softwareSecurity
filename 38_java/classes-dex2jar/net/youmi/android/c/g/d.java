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
    //   4: ifnull +316 -> 320
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
    //   46: if_icmplt +287 -> 333
    //   49: iload 4
    //   51: sipush 300
    //   54: if_icmpge +279 -> 333
    //   57: aload_1
    //   58: invokeinterface 47 1 0
    //   63: astore 5
    //   65: iload_3
    //   66: ifeq +35 -> 101
    //   69: ldc 49
    //   71: iconst_2
    //   72: anewarray 31	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload 5
    //   79: invokeinterface 55 1 0
    //   84: invokestatic 60	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   87: aastore
    //   88: dup
    //   89: iconst_1
    //   90: aload 5
    //   92: invokeinterface 64 1 0
    //   97: aastore
    //   98: invokestatic 43	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload 5
    //   103: invokeinterface 67 1 0
    //   108: astore_0
    //   109: aload_0
    //   110: ifnull +293 -> 403
    //   113: aload_0
    //   114: invokeinterface 73 1 0
    //   119: getstatic 79	java/util/Locale:US	Ljava/util/Locale;
    //   122: invokevirtual 85	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   125: ldc 87
    //   127: invokevirtual 91	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   130: ifeq +273 -> 403
    //   133: new 93	java/util/zip/GZIPInputStream
    //   136: dup
    //   137: aload 5
    //   139: invokeinterface 97 1 0
    //   144: invokespecial 100	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   147: astore_0
    //   148: aload_0
    //   149: astore_1
    //   150: aload_0
    //   151: ifnonnull +11 -> 162
    //   154: aload 5
    //   156: invokeinterface 97 1 0
    //   161: astore_1
    //   162: aload_1
    //   163: ifnonnull +42 -> 205
    //   166: iload_3
    //   167: ifeq +12 -> 179
    //   170: ldc 102
    //   172: iconst_0
    //   173: anewarray 31	java/lang/Object
    //   176: invokestatic 105	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: iconst_0
    //   180: ifeq +11 -> 191
    //   183: new 107	java/lang/NullPointerException
    //   186: dup
    //   187: invokespecial 110	java/lang/NullPointerException:<init>	()V
    //   190: athrow
    //   191: aconst_null
    //   192: areturn
    //   193: astore_0
    //   194: iload_3
    //   195: ifeq +208 -> 403
    //   198: aload_0
    //   199: invokestatic 113	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   202: goto +201 -> 403
    //   205: new 115	java/io/ByteArrayOutputStream
    //   208: dup
    //   209: invokespecial 116	java/io/ByteArrayOutputStream:<init>	()V
    //   212: astore 5
    //   214: aload 5
    //   216: astore_0
    //   217: sipush 1024
    //   220: newarray byte
    //   222: astore 6
    //   224: aload 5
    //   226: astore_0
    //   227: aload_1
    //   228: aload 6
    //   230: invokevirtual 122	java/io/InputStream:read	([B)I
    //   233: istore 4
    //   235: iload 4
    //   237: ifle +46 -> 283
    //   240: aload 5
    //   242: astore_0
    //   243: aload 5
    //   245: aload 6
    //   247: iconst_0
    //   248: iload 4
    //   250: invokevirtual 126	java/io/ByteArrayOutputStream:write	([BII)V
    //   253: goto -29 -> 224
    //   256: astore_2
    //   257: aload 5
    //   259: astore_1
    //   260: iload_3
    //   261: ifeq +9 -> 270
    //   264: aload_1
    //   265: astore_0
    //   266: aload_2
    //   267: invokestatic 113	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   270: aload_1
    //   271: ifnull -80 -> 191
    //   274: aload_1
    //   275: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   278: aconst_null
    //   279: areturn
    //   280: astore_0
    //   281: aconst_null
    //   282: areturn
    //   283: aload 5
    //   285: astore_0
    //   286: aload 5
    //   288: invokevirtual 132	java/io/ByteArrayOutputStream:flush	()V
    //   291: aload 5
    //   293: astore_0
    //   294: new 81	java/lang/String
    //   297: dup
    //   298: aload 5
    //   300: invokevirtual 136	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   303: aload_2
    //   304: invokespecial 139	java/lang/String:<init>	([BLjava/lang/String;)V
    //   307: astore_1
    //   308: aload 5
    //   310: ifnull +8 -> 318
    //   313: aload 5
    //   315: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   318: aload_1
    //   319: areturn
    //   320: iload_3
    //   321: ifeq +12 -> 333
    //   324: ldc 141
    //   326: iconst_0
    //   327: anewarray 31	java/lang/Object
    //   330: invokestatic 105	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: iconst_0
    //   334: ifeq -143 -> 191
    //   337: new 107	java/lang/NullPointerException
    //   340: dup
    //   341: invokespecial 110	java/lang/NullPointerException:<init>	()V
    //   344: athrow
    //   345: astore_0
    //   346: aconst_null
    //   347: areturn
    //   348: astore_0
    //   349: aload 6
    //   351: astore_1
    //   352: aload_1
    //   353: ifnull +7 -> 360
    //   356: aload_1
    //   357: invokevirtual 129	java/io/ByteArrayOutputStream:close	()V
    //   360: aload_0
    //   361: athrow
    //   362: astore_0
    //   363: aconst_null
    //   364: areturn
    //   365: astore_0
    //   366: goto -48 -> 318
    //   369: astore_0
    //   370: goto -100 -> 270
    //   373: astore_1
    //   374: goto -14 -> 360
    //   377: astore_2
    //   378: aload_0
    //   379: astore_1
    //   380: aload_2
    //   381: astore_0
    //   382: goto -30 -> 352
    //   385: astore_2
    //   386: aconst_null
    //   387: astore_1
    //   388: goto -128 -> 260
    //   391: astore_0
    //   392: goto -213 -> 179
    //   395: astore_0
    //   396: goto -295 -> 101
    //   399: astore_0
    //   400: goto -359 -> 41
    //   403: aconst_null
    //   404: astore_0
    //   405: goto -257 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	408	0	paramContext	Context
    //   0	408	1	paramHttpResponse	HttpResponse
    //   0	408	2	paramString	String
    //   0	408	3	paramBoolean	boolean
    //   18	231	4	i	int
    //   63	251	5	localObject	java.lang.Object
    //   1	349	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   101	109	193	java/lang/Throwable
    //   113	148	193	java/lang/Throwable
    //   217	224	256	java/lang/Throwable
    //   227	235	256	java/lang/Throwable
    //   243	253	256	java/lang/Throwable
    //   286	291	256	java/lang/Throwable
    //   294	308	256	java/lang/Throwable
    //   274	278	280	java/lang/Throwable
    //   337	345	345	java/lang/Throwable
    //   7	20	348	finally
    //   24	41	348	finally
    //   57	65	348	finally
    //   69	101	348	finally
    //   101	109	348	finally
    //   113	148	348	finally
    //   154	162	348	finally
    //   170	179	348	finally
    //   198	202	348	finally
    //   205	214	348	finally
    //   324	333	348	finally
    //   183	191	362	java/lang/Throwable
    //   313	318	365	java/lang/Throwable
    //   266	270	369	java/lang/Throwable
    //   356	360	373	java/lang/Throwable
    //   217	224	377	finally
    //   227	235	377	finally
    //   243	253	377	finally
    //   266	270	377	finally
    //   286	291	377	finally
    //   294	308	377	finally
    //   7	20	385	java/lang/Throwable
    //   57	65	385	java/lang/Throwable
    //   154	162	385	java/lang/Throwable
    //   198	202	385	java/lang/Throwable
    //   205	214	385	java/lang/Throwable
    //   324	333	385	java/lang/Throwable
    //   170	179	391	java/lang/Throwable
    //   69	101	395	java/lang/Throwable
    //   24	41	399	java/lang/Throwable
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


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.d
 * JD-Core Version:    0.7.0.1
 */