package net.youmi.android.f.a;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import net.youmi.android.b.a.c;
import net.youmi.android.c.c.e;
import net.youmi.android.c.c.g;
import net.youmi.android.c.e.b;
import net.youmi.android.c.h.d;
import net.youmi.android.spot.SpotManager;
import org.apache.http.message.BasicNameValuePair;

public class a
{
  public static final String a;
  public static final String b = i();
  public static final String c = j();
  public static final String d = k();
  public static final String e = l();
  private static final String f = ;
  private static final String g = b();
  private static final String h = c();
  private static final String i = d();
  private static final String j = e();
  private static final String k = f();
  private static final String l;
  
  static
  {
    a = g();
    l = h();
  }
  
  private static String a()
  {
    try
    {
      String str = g.b("0e1540480e4d1e545b43195642481b5a140850185b03121f56000d5651401b100719160647", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  /* Error */
  public static final String a(Context paramContext)
  {
    // Byte code:
    //   0: new 83	net/youmi/android/b/a/b
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 87	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   8: astore_1
    //   9: aload_0
    //   10: invokestatic 92	net/youmi/android/a/i/a:a	(Landroid/content/Context;)Lnet/youmi/android/a/i/a;
    //   13: invokevirtual 95	net/youmi/android/a/i/a:a	()Landroid/location/Location;
    //   16: astore 5
    //   18: aload_0
    //   19: invokestatic 99	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   22: astore 4
    //   24: iconst_4
    //   25: invokestatic 104	net/youmi/android/b/a/a:a	(I)Ljava/lang/String;
    //   28: astore_3
    //   29: new 106	java/lang/StringBuffer
    //   32: dup
    //   33: sipush 512
    //   36: invokespecial 109	java/lang/StringBuffer:<init>	(I)V
    //   39: astore_2
    //   40: aload_2
    //   41: getstatic 28	net/youmi/android/f/a/a:g	Ljava/lang/String;
    //   44: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   47: pop
    //   48: aload_2
    //   49: ldc 115
    //   51: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   54: pop
    //   55: aload_2
    //   56: ldc 117
    //   58: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   61: pop
    //   62: aload_2
    //   63: iconst_3
    //   64: invokevirtual 120	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   67: pop
    //   68: aload_2
    //   69: aload 4
    //   71: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   74: pop
    //   75: aload_2
    //   76: aload_3
    //   77: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   80: pop
    //   81: new 122	java/io/ByteArrayOutputStream
    //   84: dup
    //   85: sipush 512
    //   88: invokespecial 123	java/io/ByteArrayOutputStream:<init>	(I)V
    //   91: astore 4
    //   93: ldc 125
    //   95: aload 4
    //   97: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   100: aload 4
    //   102: bipush 38
    //   104: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   107: aload_1
    //   108: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   111: astore 6
    //   113: new 136	java/lang/StringBuilder
    //   116: dup
    //   117: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   120: ldc 140
    //   122: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: aload 6
    //   127: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: iconst_0
    //   134: anewarray 4	java/lang/Object
    //   137: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload 6
    //   142: aload 4
    //   144: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   147: aload 4
    //   149: bipush 38
    //   151: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   154: invokestatic 157	java/lang/System:currentTimeMillis	()J
    //   157: ldc2_w 158
    //   160: ldiv
    //   161: invokestatic 165	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   164: aload 4
    //   166: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   169: aload 4
    //   171: bipush 38
    //   173: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   176: aload_0
    //   177: invokestatic 168	net/youmi/android/c/h/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   180: aload 4
    //   182: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   185: aload 4
    //   187: bipush 38
    //   189: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   192: aload_0
    //   193: invokestatic 172	net/youmi/android/c/a:i	(Landroid/content/Context;)Ljava/lang/String;
    //   196: aload 4
    //   198: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   201: aload 4
    //   203: bipush 38
    //   205: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   208: aload_0
    //   209: invokevirtual 177	android/content/Context:getPackageName	()Ljava/lang/String;
    //   212: aload 4
    //   214: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   217: aload 4
    //   219: bipush 38
    //   221: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   224: invokestatic 178	net/youmi/android/c/a:c	()Ljava/lang/String;
    //   227: aload 4
    //   229: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   232: aload 4
    //   234: bipush 38
    //   236: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   239: aload 5
    //   241: invokevirtual 184	android/location/Location:getLatitude	()D
    //   244: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   247: aload 4
    //   249: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   252: aload 4
    //   254: bipush 38
    //   256: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   259: aload 5
    //   261: invokevirtual 192	android/location/Location:getLongitude	()D
    //   264: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   267: aload 4
    //   269: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   272: aload 4
    //   274: bipush 38
    //   276: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   279: sipush 405
    //   282: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   285: aload 4
    //   287: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   290: aload 4
    //   292: bipush 38
    //   294: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   297: ldc 196
    //   299: aload 4
    //   301: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   304: aload 4
    //   306: bipush 38
    //   308: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   311: aload_0
    //   312: invokestatic 198	net/youmi/android/b/b/a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   315: aload 4
    //   317: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   320: aload 4
    //   322: bipush 38
    //   324: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   327: aload_0
    //   328: invokestatic 201	net/youmi/android/b/b/a:e	(Landroid/content/Context;)I
    //   331: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   334: aload 4
    //   336: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   339: aload 4
    //   341: bipush 38
    //   343: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   346: aload_0
    //   347: invokestatic 203	net/youmi/android/c/a:j	(Landroid/content/Context;)I
    //   350: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   353: aload 4
    //   355: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   358: aload 4
    //   360: bipush 38
    //   362: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   365: aload_0
    //   366: invokestatic 205	net/youmi/android/c/a:k	(Landroid/content/Context;)I
    //   369: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   372: aload 4
    //   374: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   377: aload 4
    //   379: bipush 38
    //   381: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   384: ldc 207
    //   386: aload 4
    //   388: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   391: aload 4
    //   393: bipush 38
    //   395: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   398: aload_0
    //   399: ldc 209
    //   401: iconst_0
    //   402: invokestatic 214	net/youmi/android/c/k/h:a	(Landroid/content/Context;Ljava/lang/String;I)I
    //   405: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   408: aload 4
    //   410: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   413: aload 4
    //   415: bipush 38
    //   417: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   420: aload_1
    //   421: invokevirtual 217	net/youmi/android/b/a/b:e	()Z
    //   424: ifeq +204 -> 628
    //   427: ldc 219
    //   429: astore_1
    //   430: aload_1
    //   431: aload 4
    //   433: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   436: aload 4
    //   438: bipush 38
    //   440: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   443: invokestatic 221	net/youmi/android/b/b/a:b	()Z
    //   446: iconst_1
    //   447: if_icmpne +187 -> 634
    //   450: ldc 219
    //   452: astore_1
    //   453: aload_1
    //   454: aload 4
    //   456: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   459: aload 4
    //   461: bipush 38
    //   463: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   466: aload_0
    //   467: invokestatic 226	net/youmi/android/c/k/d:a	(Landroid/content/Context;)Lnet/youmi/android/c/k/d;
    //   470: astore_1
    //   471: aload_1
    //   472: invokevirtual 229	net/youmi/android/c/k/d:h	()I
    //   475: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   478: aload 4
    //   480: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   483: aload 4
    //   485: bipush 38
    //   487: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   490: aload_1
    //   491: invokevirtual 231	net/youmi/android/c/k/d:g	()I
    //   494: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   497: aload 4
    //   499: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   502: new 136	java/lang/StringBuilder
    //   505: dup
    //   506: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   509: ldc 233
    //   511: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: aload_0
    //   515: invokestatic 235	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   518: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: aload_3
    //   522: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   528: invokestatic 240	net/youmi/android/c/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   531: astore_1
    //   532: new 136	java/lang/StringBuilder
    //   535: dup
    //   536: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   539: ldc 242
    //   541: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: aload_1
    //   545: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   551: iconst_0
    //   552: anewarray 4	java/lang/Object
    //   555: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   558: aload_2
    //   559: aload 4
    //   561: invokevirtual 246	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   564: aload_1
    //   565: ldc 247
    //   567: invokestatic 250	net/youmi/android/b/a/a:a	([BLjava/lang/String;I)Ljava/lang/String;
    //   570: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   573: pop
    //   574: new 136	java/lang/StringBuilder
    //   577: dup
    //   578: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   581: ldc 252
    //   583: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: aload_2
    //   587: invokevirtual 253	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   590: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: iconst_0
    //   597: anewarray 4	java/lang/Object
    //   600: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: aload_0
    //   604: aload_2
    //   605: invokevirtual 253	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   608: invokestatic 258	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   611: astore_0
    //   612: ldc_w 260
    //   615: iconst_1
    //   616: anewarray 4	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: aload_0
    //   622: aastore
    //   623: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   626: aload_0
    //   627: areturn
    //   628: ldc 207
    //   630: astore_1
    //   631: goto -201 -> 430
    //   634: ldc 207
    //   636: astore_1
    //   637: goto -184 -> 453
    //   640: astore_0
    //   641: ldc_w 262
    //   644: aload_0
    //   645: invokestatic 267	net/youmi/android/c/e/a:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   648: ldc_w 269
    //   651: astore_0
    //   652: goto -40 -> 612
    //   655: astore_0
    //   656: aload_0
    //   657: invokestatic 272	net/youmi/android/c/e/b:c	(Ljava/lang/Throwable;)V
    //   660: aconst_null
    //   661: areturn
    //   662: astore_1
    //   663: goto -89 -> 574
    //   666: astore_1
    //   667: goto -165 -> 502
    //   670: astore 5
    //   672: goto -189 -> 483
    //   675: astore_1
    //   676: goto -217 -> 459
    //   679: astore_1
    //   680: goto -244 -> 436
    //   683: astore 5
    //   685: goto -272 -> 413
    //   688: astore 5
    //   690: goto -299 -> 391
    //   693: astore 5
    //   695: goto -318 -> 377
    //   698: astore 5
    //   700: goto -342 -> 358
    //   703: astore 5
    //   705: goto -366 -> 339
    //   708: astore 5
    //   710: goto -390 -> 320
    //   713: astore 5
    //   715: goto -411 -> 304
    //   718: astore 5
    //   720: goto -430 -> 290
    //   723: astore 5
    //   725: goto -453 -> 272
    //   728: astore 6
    //   730: goto -478 -> 252
    //   733: astore 6
    //   735: goto -503 -> 232
    //   738: astore 6
    //   740: goto -523 -> 217
    //   743: astore 6
    //   745: goto -544 -> 201
    //   748: astore 6
    //   750: goto -565 -> 185
    //   753: astore 6
    //   755: goto -586 -> 169
    //   758: astore 6
    //   760: goto -613 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	763	0	paramContext	Context
    //   8	629	1	localObject1	Object
    //   662	1	1	localThrowable1	Throwable
    //   666	1	1	localThrowable2	Throwable
    //   675	1	1	localThrowable3	Throwable
    //   679	1	1	localThrowable4	Throwable
    //   39	566	2	localStringBuffer	StringBuffer
    //   28	494	3	str1	String
    //   22	538	4	localObject2	Object
    //   16	244	5	localLocation	android.location.Location
    //   670	1	5	localThrowable5	Throwable
    //   683	1	5	localThrowable6	Throwable
    //   688	1	5	localThrowable7	Throwable
    //   693	1	5	localThrowable8	Throwable
    //   698	1	5	localThrowable9	Throwable
    //   703	1	5	localThrowable10	Throwable
    //   708	1	5	localThrowable11	Throwable
    //   713	1	5	localThrowable12	Throwable
    //   718	1	5	localThrowable13	Throwable
    //   723	1	5	localThrowable14	Throwable
    //   111	30	6	str2	String
    //   728	1	6	localThrowable15	Throwable
    //   733	1	6	localThrowable16	Throwable
    //   738	1	6	localThrowable17	Throwable
    //   743	1	6	localThrowable18	Throwable
    //   748	1	6	localThrowable19	Throwable
    //   753	1	6	localThrowable20	Throwable
    //   758	1	6	localThrowable21	Throwable
    // Exception table:
    //   from	to	target	type
    //   603	612	640	java/lang/Throwable
    //   0	107	655	java/lang/Throwable
    //   147	154	655	java/lang/Throwable
    //   169	176	655	java/lang/Throwable
    //   185	192	655	java/lang/Throwable
    //   201	208	655	java/lang/Throwable
    //   217	224	655	java/lang/Throwable
    //   232	239	655	java/lang/Throwable
    //   252	259	655	java/lang/Throwable
    //   272	279	655	java/lang/Throwable
    //   290	297	655	java/lang/Throwable
    //   304	311	655	java/lang/Throwable
    //   320	327	655	java/lang/Throwable
    //   339	346	655	java/lang/Throwable
    //   358	365	655	java/lang/Throwable
    //   377	384	655	java/lang/Throwable
    //   391	398	655	java/lang/Throwable
    //   413	420	655	java/lang/Throwable
    //   436	443	655	java/lang/Throwable
    //   459	471	655	java/lang/Throwable
    //   483	490	655	java/lang/Throwable
    //   502	558	655	java/lang/Throwable
    //   574	603	655	java/lang/Throwable
    //   612	626	655	java/lang/Throwable
    //   641	648	655	java/lang/Throwable
    //   558	574	662	java/lang/Throwable
    //   490	502	666	java/lang/Throwable
    //   471	483	670	java/lang/Throwable
    //   443	450	675	java/lang/Throwable
    //   453	459	675	java/lang/Throwable
    //   420	427	679	java/lang/Throwable
    //   430	436	679	java/lang/Throwable
    //   398	413	683	java/lang/Throwable
    //   384	391	688	java/lang/Throwable
    //   365	377	693	java/lang/Throwable
    //   346	358	698	java/lang/Throwable
    //   327	339	703	java/lang/Throwable
    //   311	320	708	java/lang/Throwable
    //   297	304	713	java/lang/Throwable
    //   279	290	718	java/lang/Throwable
    //   259	272	723	java/lang/Throwable
    //   239	252	728	java/lang/Throwable
    //   224	232	733	java/lang/Throwable
    //   208	217	738	java/lang/Throwable
    //   192	201	743	java/lang/Throwable
    //   176	185	748	java/lang/Throwable
    //   154	169	753	java/lang/Throwable
    //   107	147	758	java/lang/Throwable
  }
  
  public static String a(Context paramContext, String paramString)
  {
    try
    {
      paramString = new BasicNameValuePair("s", paramString);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramString);
      try
      {
        paramContext = d.a(paramContext, k, localArrayList);
        b.a("request spot sendBatchClkLog result:%s", new Object[] { paramContext });
        return paramContext;
      }
      catch (Throwable paramContext)
      {
        for (;;)
        {
          b.a(paramContext);
          paramContext = "";
        }
      }
      return null;
    }
    catch (Throwable paramContext)
    {
      b.c(paramContext);
    }
  }
  
  /* Error */
  public static final String a(Context paramContext, String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 299	net/youmi/android/b/b/a:c	(Landroid/content/Context;)Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 83	net/youmi/android/b/a/b
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 87	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   17: astore 4
    //   19: new 274	org/apache/http/message/BasicNameValuePair
    //   22: dup
    //   23: ldc_w 301
    //   26: aload 4
    //   28: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   31: invokespecial 279	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: astore 6
    //   36: new 274	org/apache/http/message/BasicNameValuePair
    //   39: dup
    //   40: ldc_w 303
    //   43: aload_1
    //   44: invokespecial 279	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: astore 7
    //   49: new 281	java/util/ArrayList
    //   52: dup
    //   53: invokespecial 282	java/util/ArrayList:<init>	()V
    //   56: astore 5
    //   58: new 274	org/apache/http/message/BasicNameValuePair
    //   61: dup
    //   62: ldc_w 305
    //   65: lload_2
    //   66: invokestatic 165	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   69: invokespecial 279	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: astore 8
    //   74: aload 5
    //   76: aload 6
    //   78: invokeinterface 288 2 0
    //   83: pop
    //   84: aload 5
    //   86: aload 7
    //   88: invokeinterface 288 2 0
    //   93: pop
    //   94: aload 5
    //   96: aload 8
    //   98: invokeinterface 288 2 0
    //   103: pop
    //   104: new 307	java/util/HashMap
    //   107: dup
    //   108: invokespecial 308	java/util/HashMap:<init>	()V
    //   111: astore 6
    //   113: aload 6
    //   115: ldc_w 301
    //   118: aload 4
    //   120: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   123: invokevirtual 312	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   126: pop
    //   127: aload 6
    //   129: ldc_w 303
    //   132: aload_1
    //   133: invokevirtual 312	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   136: pop
    //   137: aload 6
    //   139: ldc_w 305
    //   142: lload_2
    //   143: invokestatic 165	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   146: invokevirtual 312	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   149: pop
    //   150: aload 6
    //   152: aload_0
    //   153: invokestatic 235	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   156: invokestatic 315	net/youmi/android/f/a/a:a	(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    //   159: astore 6
    //   161: new 274	org/apache/http/message/BasicNameValuePair
    //   164: dup
    //   165: ldc_w 317
    //   168: aload 6
    //   170: invokespecial 279	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: astore 7
    //   175: getstatic 320	net/youmi/android/f/a/u:a	Ljava/lang/String;
    //   178: new 136	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   185: ldc_w 322
    //   188: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: aload 4
    //   193: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   196: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: iconst_0
    //   203: anewarray 4	java/lang/Object
    //   206: invokestatic 325	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: getstatic 320	net/youmi/android/f/a/u:a	Ljava/lang/String;
    //   212: new 136	java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   219: ldc_w 327
    //   222: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload_1
    //   226: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 325	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: getstatic 320	net/youmi/android/f/a/u:a	Ljava/lang/String;
    //   242: new 136	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   249: ldc_w 329
    //   252: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: lload_2
    //   256: invokevirtual 332	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   259: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: iconst_0
    //   263: anewarray 4	java/lang/Object
    //   266: invokestatic 325	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: getstatic 320	net/youmi/android/f/a/u:a	Ljava/lang/String;
    //   272: new 136	java/lang/StringBuilder
    //   275: dup
    //   276: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   279: ldc_w 334
    //   282: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: aload 6
    //   287: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   293: iconst_0
    //   294: anewarray 4	java/lang/Object
    //   297: invokestatic 325	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: aload 5
    //   302: aload 7
    //   304: invokeinterface 288 2 0
    //   309: pop
    //   310: aload_0
    //   311: getstatic 64	net/youmi/android/f/a/a:d	Ljava/lang/String;
    //   314: aload 5
    //   316: invokestatic 291	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   319: astore_0
    //   320: aload_0
    //   321: areturn
    //   322: astore_0
    //   323: aconst_null
    //   324: areturn
    //   325: astore_0
    //   326: ldc_w 269
    //   329: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	330	0	paramContext	Context
    //   0	330	1	paramString	String
    //   0	330	2	paramLong	long
    //   17	175	4	localb	net.youmi.android.b.a.b
    //   56	259	5	localArrayList	ArrayList
    //   34	252	6	localObject	Object
    //   47	256	7	localBasicNameValuePair1	BasicNameValuePair
    //   72	25	8	localBasicNameValuePair2	BasicNameValuePair
    // Exception table:
    //   from	to	target	type
    //   0	7	322	java/lang/Throwable
    //   9	310	322	java/lang/Throwable
    //   310	320	325	java/lang/Throwable
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    str2 = "";
    localStringBuffer1 = new StringBuffer(512);
    str1 = str2;
    try
    {
      localObject = net.youmi.android.b.b.a.a(paramContext);
      str1 = str2;
      localStringBuffer2 = new StringBuffer(512);
      str1 = str2;
      localStringBuffer2.append(h);
      str1 = str2;
      localStringBuffer2.append("?s=");
      str1 = str2;
      localStringBuffer2.append("00000");
      str1 = str2;
      localStringBuffer2.append(3);
      str1 = str2;
      localStringBuffer2.append((String)localObject);
      str1 = str2;
      localStringBuffer2.append(paramString1);
      str1 = str2;
      localStringBuffer1.append("00000");
      str1 = str2;
      localStringBuffer1.append(3);
      str1 = str2;
      localStringBuffer1.append((String)localObject);
      str1 = str2;
      localStringBuffer1.append(paramString1);
      str1 = str2;
      localObject = new ByteArrayOutputStream(512);
      str1 = str2;
      c.a("1", (ByteArrayOutputStream)localObject);
      str1 = str2;
      ((ByteArrayOutputStream)localObject).write(38);
      str1 = str2;
      c.a(String.valueOf(System.currentTimeMillis()), (ByteArrayOutputStream)localObject);
      str1 = str2;
      str3 = e.a("ef45N92f053P36cd" + net.youmi.android.b.b.a.b(paramContext) + paramString1);
      str1 = str2;
      b.a("encodeyKey for reg:" + str3, new Object[0]);
      paramString1 = "";
    }
    catch (Throwable paramString1)
    {
      try
      {
        Object localObject;
        StringBuffer localStringBuffer2;
        String str3;
        label289:
        paramString1 = d.a(paramContext, localStringBuffer2.toString());
        str1 = paramString1;
        b.a("request spot showlog result:%s", new Object[] { paramString1 });
        for (;;)
        {
          if ((paramString1 == null) || (paramString1.equals(""))) {
            SpotManager.setShow(paramContext, localStringBuffer1.toString());
          }
          return paramString1;
          paramString1 = paramString1;
          b.c(paramString1);
          paramString1 = str1;
        }
      }
      catch (Throwable paramString1)
      {
        for (;;)
        {
          paramString1 = str2;
        }
      }
    }
    try
    {
      str1 = net.youmi.android.b.a.a.a(((ByteArrayOutputStream)localObject).toByteArray(), str3, 809273);
      paramString1 = str1;
      localStringBuffer2.append(str1);
      paramString1 = str1;
    }
    catch (Throwable localThrowable)
    {
      break label289;
    }
    str1 = str2;
    localStringBuffer2.append(",");
    str1 = str2;
    localStringBuffer2.append(paramString2);
    str1 = str2;
    localStringBuffer1.append(paramString1);
    str1 = str2;
    localStringBuffer1.append(",");
    str1 = str2;
    localStringBuffer1.append(paramString2);
    str1 = str2;
    b.a("request spot showlog url:" + localStringBuffer2.toString(), new Object[0]);
  }
  
  /* Error */
  public static final String a(Context paramContext, net.youmi.android.banner.AdSize paramAdSize)
  {
    // Byte code:
    //   0: new 83	net/youmi/android/b/a/b
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 87	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   8: astore_2
    //   9: aload_0
    //   10: invokestatic 92	net/youmi/android/a/i/a:a	(Landroid/content/Context;)Lnet/youmi/android/a/i/a;
    //   13: invokevirtual 95	net/youmi/android/a/i/a:a	()Landroid/location/Location;
    //   16: astore 6
    //   18: aload_0
    //   19: invokestatic 99	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   22: astore 5
    //   24: iconst_4
    //   25: invokestatic 104	net/youmi/android/b/a/a:a	(I)Ljava/lang/String;
    //   28: astore 4
    //   30: new 106	java/lang/StringBuffer
    //   33: dup
    //   34: sipush 512
    //   37: invokespecial 109	java/lang/StringBuffer:<init>	(I)V
    //   40: astore_3
    //   41: aload_3
    //   42: getstatic 24	net/youmi/android/f/a/a:f	Ljava/lang/String;
    //   45: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   48: pop
    //   49: aload_3
    //   50: ldc 115
    //   52: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   55: pop
    //   56: aload_3
    //   57: ldc 117
    //   59: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: pop
    //   63: aload_3
    //   64: iconst_3
    //   65: invokevirtual 120	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   68: pop
    //   69: aload_3
    //   70: aload 5
    //   72: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   75: pop
    //   76: aload_3
    //   77: aload 4
    //   79: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   82: pop
    //   83: new 122	java/io/ByteArrayOutputStream
    //   86: dup
    //   87: sipush 512
    //   90: invokespecial 123	java/io/ByteArrayOutputStream:<init>	(I)V
    //   93: astore 5
    //   95: ldc 125
    //   97: aload 5
    //   99: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   102: aload 5
    //   104: bipush 38
    //   106: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   109: aload_2
    //   110: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   113: astore 7
    //   115: new 136	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   122: ldc 140
    //   124: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload 7
    //   129: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: iconst_0
    //   136: anewarray 4	java/lang/Object
    //   139: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload 7
    //   144: aload 5
    //   146: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   149: aload 5
    //   151: bipush 38
    //   153: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   156: invokestatic 157	java/lang/System:currentTimeMillis	()J
    //   159: ldc2_w 158
    //   162: ldiv
    //   163: invokestatic 165	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   166: aload 5
    //   168: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   171: aload 5
    //   173: bipush 38
    //   175: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   178: aload_0
    //   179: invokestatic 168	net/youmi/android/c/h/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   182: aload 5
    //   184: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   187: aload 5
    //   189: bipush 38
    //   191: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   194: aload_0
    //   195: invokestatic 172	net/youmi/android/c/a:i	(Landroid/content/Context;)Ljava/lang/String;
    //   198: aload 5
    //   200: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   203: aload 5
    //   205: bipush 38
    //   207: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   210: aload_0
    //   211: invokevirtual 177	android/content/Context:getPackageName	()Ljava/lang/String;
    //   214: aload 5
    //   216: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   219: aload 5
    //   221: bipush 38
    //   223: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   226: invokestatic 178	net/youmi/android/c/a:c	()Ljava/lang/String;
    //   229: aload 5
    //   231: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   234: aload 5
    //   236: bipush 38
    //   238: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   241: aload 6
    //   243: invokevirtual 184	android/location/Location:getLatitude	()D
    //   246: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   249: aload 5
    //   251: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   254: aload 5
    //   256: bipush 38
    //   258: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   261: aload 6
    //   263: invokevirtual 192	android/location/Location:getLongitude	()D
    //   266: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   269: aload 5
    //   271: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   274: aload 5
    //   276: bipush 38
    //   278: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   281: sipush 405
    //   284: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   287: aload 5
    //   289: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   292: aload 5
    //   294: bipush 38
    //   296: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   299: ldc_w 355
    //   302: aload 5
    //   304: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   307: aload 5
    //   309: bipush 38
    //   311: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   314: aload_0
    //   315: invokestatic 198	net/youmi/android/b/b/a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   318: aload 5
    //   320: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   323: aload 5
    //   325: bipush 38
    //   327: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   330: aload_0
    //   331: invokestatic 201	net/youmi/android/b/b/a:e	(Landroid/content/Context;)I
    //   334: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   337: aload 5
    //   339: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   342: aload 5
    //   344: bipush 38
    //   346: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   349: aload_0
    //   350: invokestatic 203	net/youmi/android/c/a:j	(Landroid/content/Context;)I
    //   353: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   356: aload 5
    //   358: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   361: aload 5
    //   363: bipush 38
    //   365: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   368: aload_0
    //   369: invokestatic 205	net/youmi/android/c/a:k	(Landroid/content/Context;)I
    //   372: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   375: aload 5
    //   377: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   380: aload 5
    //   382: bipush 38
    //   384: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   387: ldc 207
    //   389: aload 5
    //   391: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   394: aload 5
    //   396: bipush 38
    //   398: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   401: aload_0
    //   402: ldc 209
    //   404: iconst_0
    //   405: invokestatic 214	net/youmi/android/c/k/h:a	(Landroid/content/Context;Ljava/lang/String;I)I
    //   408: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   411: aload 5
    //   413: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   416: aload 5
    //   418: bipush 38
    //   420: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   423: aload_2
    //   424: invokevirtual 217	net/youmi/android/b/a/b:e	()Z
    //   427: ifeq +201 -> 628
    //   430: ldc 219
    //   432: astore_2
    //   433: aload_2
    //   434: aload 5
    //   436: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   439: aload 5
    //   441: bipush 38
    //   443: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   446: invokestatic 221	net/youmi/android/b/b/a:b	()Z
    //   449: iconst_1
    //   450: if_icmpne +184 -> 634
    //   453: ldc 219
    //   455: astore_2
    //   456: aload_2
    //   457: aload 5
    //   459: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   462: aload 5
    //   464: bipush 38
    //   466: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   469: aload_1
    //   470: invokevirtual 360	net/youmi/android/banner/AdSize:getAdHeight	()I
    //   473: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   476: aload 5
    //   478: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   481: aload 5
    //   483: bipush 38
    //   485: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   488: aload_1
    //   489: invokevirtual 363	net/youmi/android/banner/AdSize:getAdWidth	()I
    //   492: invokestatic 194	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   495: aload 5
    //   497: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   500: new 136	java/lang/StringBuilder
    //   503: dup
    //   504: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   507: ldc 233
    //   509: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: aload_0
    //   513: invokestatic 235	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   516: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: aload 4
    //   521: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokestatic 240	net/youmi/android/c/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   530: astore_1
    //   531: new 136	java/lang/StringBuilder
    //   534: dup
    //   535: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   538: ldc 242
    //   540: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: aload_1
    //   544: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   550: iconst_0
    //   551: anewarray 4	java/lang/Object
    //   554: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: aload_3
    //   558: aload 5
    //   560: invokevirtual 246	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   563: aload_1
    //   564: ldc 247
    //   566: invokestatic 250	net/youmi/android/b/a/a:a	([BLjava/lang/String;I)Ljava/lang/String;
    //   569: invokevirtual 113	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   572: pop
    //   573: new 136	java/lang/StringBuilder
    //   576: dup
    //   577: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   580: ldc_w 365
    //   583: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: aload_3
    //   587: invokevirtual 253	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   590: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: iconst_0
    //   597: anewarray 4	java/lang/Object
    //   600: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: aload_0
    //   604: aload_3
    //   605: invokevirtual 253	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   608: invokestatic 258	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   611: astore_0
    //   612: ldc_w 367
    //   615: iconst_1
    //   616: anewarray 4	java/lang/Object
    //   619: dup
    //   620: iconst_0
    //   621: aload_0
    //   622: aastore
    //   623: invokestatic 151	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   626: aload_0
    //   627: areturn
    //   628: ldc 207
    //   630: astore_2
    //   631: goto -198 -> 433
    //   634: ldc 207
    //   636: astore_2
    //   637: goto -181 -> 456
    //   640: astore_0
    //   641: aload_0
    //   642: invokestatic 272	net/youmi/android/c/e/b:c	(Ljava/lang/Throwable;)V
    //   645: ldc_w 269
    //   648: astore_0
    //   649: goto -37 -> 612
    //   652: astore_0
    //   653: aconst_null
    //   654: areturn
    //   655: astore_1
    //   656: goto -83 -> 573
    //   659: astore_1
    //   660: goto -160 -> 500
    //   663: astore_2
    //   664: goto -183 -> 481
    //   667: astore_2
    //   668: goto -206 -> 462
    //   671: astore_2
    //   672: goto -233 -> 439
    //   675: astore 6
    //   677: goto -261 -> 416
    //   680: astore 6
    //   682: goto -288 -> 394
    //   685: astore 6
    //   687: goto -307 -> 380
    //   690: astore 6
    //   692: goto -331 -> 361
    //   695: astore 6
    //   697: goto -355 -> 342
    //   700: astore 6
    //   702: goto -379 -> 323
    //   705: astore 6
    //   707: goto -400 -> 307
    //   710: astore 6
    //   712: goto -420 -> 292
    //   715: astore 6
    //   717: goto -443 -> 274
    //   720: astore 7
    //   722: goto -468 -> 254
    //   725: astore 7
    //   727: goto -493 -> 234
    //   730: astore 7
    //   732: goto -513 -> 219
    //   735: astore 7
    //   737: goto -534 -> 203
    //   740: astore 7
    //   742: goto -555 -> 187
    //   745: astore 7
    //   747: goto -576 -> 171
    //   750: astore 7
    //   752: goto -603 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	755	0	paramContext	Context
    //   0	755	1	paramAdSize	net.youmi.android.banner.AdSize
    //   8	629	2	localObject1	Object
    //   663	1	2	localThrowable1	Throwable
    //   667	1	2	localThrowable2	Throwable
    //   671	1	2	localThrowable3	Throwable
    //   40	565	3	localStringBuffer	StringBuffer
    //   28	492	4	str1	String
    //   22	537	5	localObject2	Object
    //   16	246	6	localLocation	android.location.Location
    //   675	1	6	localThrowable4	Throwable
    //   680	1	6	localThrowable5	Throwable
    //   685	1	6	localThrowable6	Throwable
    //   690	1	6	localThrowable7	Throwable
    //   695	1	6	localThrowable8	Throwable
    //   700	1	6	localThrowable9	Throwable
    //   705	1	6	localThrowable10	Throwable
    //   710	1	6	localThrowable11	Throwable
    //   715	1	6	localThrowable12	Throwable
    //   113	30	7	str2	String
    //   720	1	7	localThrowable13	Throwable
    //   725	1	7	localThrowable14	Throwable
    //   730	1	7	localThrowable15	Throwable
    //   735	1	7	localThrowable16	Throwable
    //   740	1	7	localThrowable17	Throwable
    //   745	1	7	localThrowable18	Throwable
    //   750	1	7	localThrowable19	Throwable
    // Exception table:
    //   from	to	target	type
    //   603	612	640	java/lang/Throwable
    //   0	109	652	java/lang/Exception
    //   109	149	652	java/lang/Exception
    //   149	156	652	java/lang/Exception
    //   156	171	652	java/lang/Exception
    //   171	178	652	java/lang/Exception
    //   178	187	652	java/lang/Exception
    //   187	194	652	java/lang/Exception
    //   194	203	652	java/lang/Exception
    //   203	210	652	java/lang/Exception
    //   210	219	652	java/lang/Exception
    //   219	226	652	java/lang/Exception
    //   226	234	652	java/lang/Exception
    //   234	241	652	java/lang/Exception
    //   241	254	652	java/lang/Exception
    //   254	261	652	java/lang/Exception
    //   261	274	652	java/lang/Exception
    //   274	281	652	java/lang/Exception
    //   281	292	652	java/lang/Exception
    //   292	299	652	java/lang/Exception
    //   299	307	652	java/lang/Exception
    //   307	314	652	java/lang/Exception
    //   314	323	652	java/lang/Exception
    //   323	330	652	java/lang/Exception
    //   330	342	652	java/lang/Exception
    //   342	349	652	java/lang/Exception
    //   349	361	652	java/lang/Exception
    //   361	368	652	java/lang/Exception
    //   368	380	652	java/lang/Exception
    //   380	387	652	java/lang/Exception
    //   387	394	652	java/lang/Exception
    //   394	401	652	java/lang/Exception
    //   401	416	652	java/lang/Exception
    //   416	423	652	java/lang/Exception
    //   423	430	652	java/lang/Exception
    //   433	439	652	java/lang/Exception
    //   439	446	652	java/lang/Exception
    //   446	453	652	java/lang/Exception
    //   456	462	652	java/lang/Exception
    //   462	469	652	java/lang/Exception
    //   469	481	652	java/lang/Exception
    //   481	488	652	java/lang/Exception
    //   488	500	652	java/lang/Exception
    //   500	557	652	java/lang/Exception
    //   557	573	652	java/lang/Exception
    //   573	603	652	java/lang/Exception
    //   603	612	652	java/lang/Exception
    //   612	626	652	java/lang/Exception
    //   641	645	652	java/lang/Exception
    //   557	573	655	java/lang/Throwable
    //   488	500	659	java/lang/Throwable
    //   469	481	663	java/lang/Throwable
    //   446	453	667	java/lang/Throwable
    //   456	462	667	java/lang/Throwable
    //   423	430	671	java/lang/Throwable
    //   433	439	671	java/lang/Throwable
    //   401	416	675	java/lang/Throwable
    //   387	394	680	java/lang/Throwable
    //   368	380	685	java/lang/Throwable
    //   349	361	690	java/lang/Throwable
    //   330	342	695	java/lang/Throwable
    //   314	323	700	java/lang/Throwable
    //   299	307	705	java/lang/Throwable
    //   281	292	710	java/lang/Throwable
    //   261	274	715	java/lang/Throwable
    //   241	254	720	java/lang/Throwable
    //   226	234	725	java/lang/Throwable
    //   210	219	730	java/lang/Throwable
    //   194	203	735	java/lang/Throwable
    //   178	187	740	java/lang/Throwable
    //   156	171	745	java/lang/Throwable
    //   109	149	750	java/lang/Throwable
  }
  
  public static String a(HashMap paramHashMap, String paramString)
  {
    Object localObject = new TreeMap(paramHashMap).entrySet();
    paramHashMap = new StringBuilder();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramHashMap.append((String)localEntry.getKey()).append("=").append((String)localEntry.getValue());
    }
    paramHashMap.append(paramString);
    try
    {
      paramHashMap = MessageDigest.getInstance("MD5").digest(paramHashMap.toString().getBytes("UTF-8"));
      paramString = new StringBuilder();
      int m = 0;
      while (m < paramHashMap.length)
      {
        localObject = Integer.toHexString(paramHashMap[m] & 0xFF);
        if (((String)localObject).length() == 1) {
          paramString.append("0");
        }
        paramString.append((String)localObject);
        m += 1;
      }
      return paramString.toString();
    }
    catch (Throwable paramHashMap)
    {
      throw new IOException(paramHashMap.toString());
    }
  }
  
  private static String b()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b145647", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static String b(Context paramContext, String paramString)
  {
    try
    {
      paramString = new BasicNameValuePair("s", paramString);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramString);
      try
      {
        paramContext = d.a(paramContext, j, localArrayList);
        b.a("request spot sendBatchShowLog result:%s", new Object[] { paramContext });
        return paramContext;
      }
      catch (Throwable paramContext)
      {
        for (;;)
        {
          b.a(paramContext);
          paramContext = "";
        }
      }
      return null;
    }
    catch (Throwable paramContext)
    {
      b.c(paramContext);
    }
  }
  
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    str2 = "";
    localStringBuffer1 = new StringBuffer(512);
    str1 = str2;
    try
    {
      localObject = net.youmi.android.b.b.a.a(paramContext);
      str1 = str2;
      localStringBuffer2 = new StringBuffer(512);
      str1 = str2;
      localStringBuffer2.append(i);
      str1 = str2;
      localStringBuffer2.append("?s=");
      str1 = str2;
      localStringBuffer2.append("00000");
      str1 = str2;
      localStringBuffer2.append(3);
      str1 = str2;
      localStringBuffer2.append((String)localObject);
      str1 = str2;
      localStringBuffer2.append(paramString1);
      str1 = str2;
      localStringBuffer1.append("00000");
      str1 = str2;
      localStringBuffer1.append(3);
      str1 = str2;
      localStringBuffer1.append((String)localObject);
      str1 = str2;
      localStringBuffer1.append(paramString1);
      str1 = str2;
      localObject = new ByteArrayOutputStream(512);
      str1 = str2;
      c.a("1", (ByteArrayOutputStream)localObject);
      str1 = str2;
      ((ByteArrayOutputStream)localObject).write(38);
      str1 = str2;
      c.a(String.valueOf(System.currentTimeMillis()), (ByteArrayOutputStream)localObject);
      str1 = str2;
      str3 = e.a("ef45N92f053P36cd" + net.youmi.android.b.b.a.b(paramContext) + paramString1);
      str1 = str2;
      b.a("encodeyKey for reg:" + str3, new Object[0]);
      paramString1 = "";
    }
    catch (Throwable paramString1)
    {
      try
      {
        Object localObject;
        StringBuffer localStringBuffer2;
        String str3;
        label289:
        paramString1 = d.a(paramContext, localStringBuffer2.toString());
        str1 = paramString1;
        b.a("request spot clicklog result:%s", new Object[] { paramString1 });
        for (;;)
        {
          if ((paramString1 == null) || (paramString1.equals(""))) {
            SpotManager.setClk(paramContext, localStringBuffer1.toString());
          }
          return paramString1;
          paramString1 = paramString1;
          b.c(paramString1);
          paramString1 = str1;
        }
      }
      catch (Throwable paramString1)
      {
        for (;;)
        {
          paramString1 = str2;
        }
      }
    }
    try
    {
      str1 = net.youmi.android.b.a.a.a(((ByteArrayOutputStream)localObject).toByteArray(), str3, 809273);
      paramString1 = str1;
      localStringBuffer2.append(str1);
      paramString1 = str1;
    }
    catch (Throwable localThrowable)
    {
      break label289;
    }
    str1 = str2;
    localStringBuffer2.append(",");
    str1 = str2;
    localStringBuffer2.append(paramString2);
    str1 = str2;
    localStringBuffer1.append(paramString1);
    str1 = str2;
    localStringBuffer1.append(",");
    str1 = str2;
    localStringBuffer1.append(paramString2);
    str1 = str2;
    b.a("request spot clicklog url:" + localStringBuffer2.toString(), new Object[0]);
  }
  
  private static String c()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b155b41", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  /* Error */
  public static final String c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 299	net/youmi/android/b/b/a:c	(Landroid/content/Context;)Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 136	java/lang/StringBuilder
    //   12: dup
    //   13: sipush 512
    //   16: invokespecial 449	java/lang/StringBuilder:<init>	(I)V
    //   19: astore 5
    //   21: invokestatic 157	java/lang/System:currentTimeMillis	()J
    //   24: ldc2_w 158
    //   27: ldiv
    //   28: lstore_2
    //   29: iconst_4
    //   30: invokestatic 104	net/youmi/android/b/a/a:a	(I)Ljava/lang/String;
    //   33: astore 7
    //   35: new 83	net/youmi/android/b/a/b
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 87	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   43: astore 4
    //   45: aload_0
    //   46: invokestatic 226	net/youmi/android/c/k/d:a	(Landroid/content/Context;)Lnet/youmi/android/c/k/d;
    //   49: astore 9
    //   51: aload_0
    //   52: invokestatic 92	net/youmi/android/a/i/a:a	(Landroid/content/Context;)Lnet/youmi/android/a/i/a;
    //   55: invokevirtual 95	net/youmi/android/a/i/a:a	()Landroid/location/Location;
    //   58: astore 8
    //   60: aload 5
    //   62: getstatic 52	net/youmi/android/f/a/a:l	Ljava/lang/String;
    //   65: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 115
    //   70: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload 5
    //   76: ldc 117
    //   78: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 5
    //   84: iconst_3
    //   85: invokevirtual 452	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload 5
    //   91: aload_0
    //   92: invokestatic 99	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   95: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload 5
    //   101: aload 7
    //   103: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: new 122	java/io/ByteArrayOutputStream
    //   110: dup
    //   111: sipush 512
    //   114: invokespecial 123	java/io/ByteArrayOutputStream:<init>	(I)V
    //   117: astore 6
    //   119: ldc_w 454
    //   122: aload 6
    //   124: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   127: aload 6
    //   129: bipush 38
    //   131: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   134: aload 4
    //   136: invokevirtual 455	net/youmi/android/b/a/b:d	()Ljava/lang/String;
    //   139: aload 6
    //   141: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   144: aload 6
    //   146: bipush 38
    //   148: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   151: aload 4
    //   153: invokevirtual 456	net/youmi/android/b/a/b:c	()Ljava/lang/String;
    //   156: aload 6
    //   158: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   161: aload 6
    //   163: bipush 38
    //   165: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   168: aload 4
    //   170: invokevirtual 457	net/youmi/android/b/a/b:b	()Ljava/lang/String;
    //   173: aload 6
    //   175: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   178: aload 6
    //   180: bipush 38
    //   182: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   185: aload 4
    //   187: invokevirtual 134	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   190: aload 6
    //   192: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   195: aload 6
    //   197: bipush 38
    //   199: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   202: aload_0
    //   203: invokestatic 458	net/youmi/android/c/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   206: aload 6
    //   208: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   211: aload 6
    //   213: bipush 38
    //   215: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   218: aload_0
    //   219: invokestatic 460	net/youmi/android/c/a:g	(Landroid/content/Context;)Ljava/lang/String;
    //   222: aload 6
    //   224: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   227: aload 6
    //   229: bipush 38
    //   231: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   234: invokestatic 461	net/youmi/android/c/a:d	()Ljava/lang/String;
    //   237: aload 6
    //   239: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   242: aload 6
    //   244: bipush 38
    //   246: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   249: invokestatic 462	net/youmi/android/c/a:b	()Ljava/lang/String;
    //   252: aload 6
    //   254: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   257: aload 6
    //   259: bipush 38
    //   261: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   264: invokestatic 178	net/youmi/android/c/a:c	()Ljava/lang/String;
    //   267: aload 6
    //   269: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   272: aload 6
    //   274: bipush 38
    //   276: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   279: getstatic 467	android/os/Build:BOARD	Ljava/lang/String;
    //   282: aload 6
    //   284: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   287: aload 6
    //   289: bipush 38
    //   291: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   294: getstatic 470	android/os/Build:BRAND	Ljava/lang/String;
    //   297: aload 6
    //   299: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   302: aload 6
    //   304: bipush 38
    //   306: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   309: getstatic 473	android/os/Build:DEVICE	Ljava/lang/String;
    //   312: aload 6
    //   314: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   317: aload 6
    //   319: bipush 38
    //   321: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   324: aload 4
    //   326: invokevirtual 217	net/youmi/android/b/a/b:e	()Z
    //   329: ifeq +460 -> 789
    //   332: ldc 219
    //   334: astore 4
    //   336: aload 4
    //   338: aload 6
    //   340: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   343: aload 6
    //   345: bipush 38
    //   347: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   350: aload 9
    //   352: invokevirtual 231	net/youmi/android/c/k/d:g	()I
    //   355: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   358: aload 6
    //   360: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   363: aload 6
    //   365: bipush 38
    //   367: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   370: aload 9
    //   372: invokevirtual 229	net/youmi/android/c/k/d:h	()I
    //   375: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   378: aload 6
    //   380: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   383: aload 6
    //   385: bipush 38
    //   387: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   390: aload 9
    //   392: invokevirtual 477	net/youmi/android/c/k/d:e	()I
    //   395: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   398: aload 6
    //   400: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   403: aload 6
    //   405: bipush 38
    //   407: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   410: sipush 405
    //   413: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   416: aload 6
    //   418: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   421: aload 6
    //   423: bipush 38
    //   425: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   428: aload_0
    //   429: invokevirtual 177	android/content/Context:getPackageName	()Ljava/lang/String;
    //   432: aload 6
    //   434: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   437: aload 6
    //   439: bipush 38
    //   441: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   444: aload_0
    //   445: invokestatic 198	net/youmi/android/b/b/a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   448: aload 6
    //   450: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   453: aload 6
    //   455: bipush 38
    //   457: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   460: aload_0
    //   461: invokestatic 201	net/youmi/android/b/b/a:e	(Landroid/content/Context;)I
    //   464: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   467: aload 6
    //   469: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   472: aload 6
    //   474: bipush 38
    //   476: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   479: aload_0
    //   480: invokestatic 479	net/youmi/android/b/b/a:f	(Landroid/content/Context;)I
    //   483: invokestatic 475	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   486: aload 6
    //   488: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   491: aload 6
    //   493: bipush 38
    //   495: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   498: aload_0
    //   499: invokestatic 480	net/youmi/android/b/b/a:g	(Landroid/content/Context;)Ljava/lang/String;
    //   502: astore 4
    //   504: aload 4
    //   506: ifnull +10 -> 516
    //   509: aload 4
    //   511: aload 6
    //   513: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   516: aload 6
    //   518: bipush 38
    //   520: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   523: aload_0
    //   524: invokestatic 168	net/youmi/android/c/h/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   527: aload 6
    //   529: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   532: aload 6
    //   534: bipush 38
    //   536: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   539: aload_0
    //   540: invokestatic 172	net/youmi/android/c/a:i	(Landroid/content/Context;)Ljava/lang/String;
    //   543: aload 6
    //   545: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   548: aload 6
    //   550: bipush 38
    //   552: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   555: aload 8
    //   557: ifnull +16 -> 573
    //   560: aload 8
    //   562: invokevirtual 184	android/location/Location:getLatitude	()D
    //   565: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   568: aload 6
    //   570: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   573: aload 6
    //   575: bipush 38
    //   577: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   580: aload 8
    //   582: ifnull +16 -> 598
    //   585: aload 8
    //   587: invokevirtual 192	android/location/Location:getLongitude	()D
    //   590: invokestatic 189	java/lang/Double:toString	(D)Ljava/lang/String;
    //   593: aload 6
    //   595: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   598: aload 6
    //   600: bipush 38
    //   602: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   605: aload 6
    //   607: bipush 38
    //   609: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   612: aload_0
    //   613: invokestatic 484	net/youmi/android/c/k/k:a	(Landroid/content/Context;)Z
    //   616: ifeq +180 -> 796
    //   619: ldc 219
    //   621: astore 4
    //   623: aload 4
    //   625: aload 6
    //   627: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   630: aload 6
    //   632: bipush 38
    //   634: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   637: lload_2
    //   638: invokestatic 488	java/lang/Long:toString	(J)Ljava/lang/String;
    //   641: aload 6
    //   643: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   646: aload 6
    //   648: bipush 38
    //   650: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   653: invokestatic 494	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   656: invokevirtual 497	java/util/Locale:getCountry	()Ljava/lang/String;
    //   659: aload 6
    //   661: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   664: aload 6
    //   666: bipush 38
    //   668: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   671: invokestatic 494	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   674: invokevirtual 500	java/util/Locale:getLanguage	()Ljava/lang/String;
    //   677: aload 6
    //   679: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   682: aload 6
    //   684: bipush 38
    //   686: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   689: invokestatic 221	net/youmi/android/b/b/a:b	()Z
    //   692: ifeq +111 -> 803
    //   695: ldc 219
    //   697: astore 4
    //   699: aload 4
    //   701: aload 6
    //   703: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   706: aload 6
    //   708: bipush 38
    //   710: invokevirtual 133	java/io/ByteArrayOutputStream:write	(I)V
    //   713: aload_1
    //   714: ifnull +9 -> 723
    //   717: aload_1
    //   718: aload 6
    //   720: invokestatic 130	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   723: new 136	java/lang/StringBuilder
    //   726: dup
    //   727: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   730: ldc 233
    //   732: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: aload_0
    //   736: invokestatic 235	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   739: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: aload 7
    //   744: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   750: invokestatic 240	net/youmi/android/c/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   753: astore_1
    //   754: aload 5
    //   756: aload 6
    //   758: invokevirtual 246	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   761: aload_1
    //   762: ldc 247
    //   764: invokestatic 250	net/youmi/android/b/a/a:a	([BLjava/lang/String;I)Ljava/lang/String;
    //   767: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   770: pop
    //   771: aload 5
    //   773: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   776: pop
    //   777: aload_0
    //   778: aload 5
    //   780: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   783: invokestatic 258	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   786: astore_0
    //   787: aload_0
    //   788: areturn
    //   789: ldc 207
    //   791: astore 4
    //   793: goto -457 -> 336
    //   796: ldc 207
    //   798: astore 4
    //   800: goto -177 -> 623
    //   803: ldc 207
    //   805: astore 4
    //   807: goto -108 -> 699
    //   810: astore_0
    //   811: aload_0
    //   812: athrow
    //   813: astore_1
    //   814: goto -91 -> 723
    //   817: astore_0
    //   818: aconst_null
    //   819: areturn
    //   820: astore_0
    //   821: ldc_w 269
    //   824: areturn
    //   825: astore_1
    //   826: goto -55 -> 771
    //   829: astore 4
    //   831: goto -125 -> 706
    //   834: astore 4
    //   836: goto -154 -> 682
    //   839: astore 4
    //   841: goto -177 -> 664
    //   844: astore 4
    //   846: goto -200 -> 646
    //   849: astore 4
    //   851: goto -221 -> 630
    //   854: astore 4
    //   856: goto -258 -> 598
    //   859: astore 4
    //   861: goto -288 -> 573
    //   864: astore 4
    //   866: goto -318 -> 548
    //   869: astore 4
    //   871: goto -339 -> 532
    //   874: astore 4
    //   876: goto -360 -> 516
    //   879: astore 4
    //   881: goto -390 -> 491
    //   884: astore 4
    //   886: goto -414 -> 472
    //   889: astore 4
    //   891: goto -438 -> 453
    //   894: astore 4
    //   896: goto -459 -> 437
    //   899: astore 4
    //   901: goto -480 -> 421
    //   904: astore 4
    //   906: goto -503 -> 403
    //   909: astore 4
    //   911: goto -528 -> 383
    //   914: astore 4
    //   916: goto -553 -> 363
    //   919: astore 4
    //   921: goto -578 -> 343
    //   924: astore 10
    //   926: goto -609 -> 317
    //   929: astore 10
    //   931: goto -629 -> 302
    //   934: astore 10
    //   936: goto -649 -> 287
    //   939: astore 10
    //   941: goto -669 -> 272
    //   944: astore 10
    //   946: goto -689 -> 257
    //   949: astore 10
    //   951: goto -709 -> 242
    //   954: astore 10
    //   956: goto -729 -> 227
    //   959: astore 10
    //   961: goto -750 -> 211
    //   964: astore 10
    //   966: goto -771 -> 195
    //   969: astore 10
    //   971: goto -793 -> 178
    //   974: astore 10
    //   976: goto -815 -> 161
    //   979: astore 10
    //   981: goto -837 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	984	0	paramContext	Context
    //   0	984	1	paramString	String
    //   28	610	2	l1	long
    //   43	763	4	localObject	Object
    //   829	1	4	localThrowable1	Throwable
    //   834	1	4	localThrowable2	Throwable
    //   839	1	4	localThrowable3	Throwable
    //   844	1	4	localThrowable4	Throwable
    //   849	1	4	localThrowable5	Throwable
    //   854	1	4	localThrowable6	Throwable
    //   859	1	4	localThrowable7	Throwable
    //   864	1	4	localThrowable8	Throwable
    //   869	1	4	localThrowable9	Throwable
    //   874	1	4	localThrowable10	Throwable
    //   879	1	4	localThrowable11	Throwable
    //   884	1	4	localThrowable12	Throwable
    //   889	1	4	localThrowable13	Throwable
    //   894	1	4	localThrowable14	Throwable
    //   899	1	4	localThrowable15	Throwable
    //   904	1	4	localThrowable16	Throwable
    //   909	1	4	localThrowable17	Throwable
    //   914	1	4	localThrowable18	Throwable
    //   919	1	4	localThrowable19	Throwable
    //   19	760	5	localStringBuilder	StringBuilder
    //   117	640	6	localByteArrayOutputStream	ByteArrayOutputStream
    //   33	710	7	str	String
    //   58	528	8	localLocation	android.location.Location
    //   49	342	9	locald	net.youmi.android.c.k.d
    //   924	1	10	localThrowable20	Throwable
    //   929	1	10	localThrowable21	Throwable
    //   934	1	10	localThrowable22	Throwable
    //   939	1	10	localThrowable23	Throwable
    //   944	1	10	localThrowable24	Throwable
    //   949	1	10	localThrowable25	Throwable
    //   954	1	10	localThrowable26	Throwable
    //   959	1	10	localThrowable27	Throwable
    //   964	1	10	localThrowable28	Throwable
    //   969	1	10	localThrowable29	Throwable
    //   974	1	10	localThrowable30	Throwable
    //   979	1	10	localThrowable31	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	7	810	finally
    //   9	134	810	finally
    //   134	144	810	finally
    //   144	151	810	finally
    //   151	161	810	finally
    //   161	168	810	finally
    //   168	178	810	finally
    //   178	185	810	finally
    //   185	195	810	finally
    //   195	202	810	finally
    //   202	211	810	finally
    //   211	218	810	finally
    //   218	227	810	finally
    //   227	234	810	finally
    //   234	242	810	finally
    //   242	249	810	finally
    //   249	257	810	finally
    //   257	264	810	finally
    //   264	272	810	finally
    //   272	279	810	finally
    //   279	287	810	finally
    //   287	294	810	finally
    //   294	302	810	finally
    //   302	309	810	finally
    //   309	317	810	finally
    //   317	324	810	finally
    //   324	332	810	finally
    //   336	343	810	finally
    //   343	350	810	finally
    //   350	363	810	finally
    //   363	370	810	finally
    //   370	383	810	finally
    //   383	390	810	finally
    //   390	403	810	finally
    //   403	410	810	finally
    //   410	421	810	finally
    //   421	428	810	finally
    //   428	437	810	finally
    //   437	444	810	finally
    //   444	453	810	finally
    //   453	460	810	finally
    //   460	472	810	finally
    //   472	479	810	finally
    //   479	491	810	finally
    //   491	498	810	finally
    //   498	504	810	finally
    //   509	516	810	finally
    //   516	523	810	finally
    //   523	532	810	finally
    //   532	539	810	finally
    //   539	548	810	finally
    //   548	555	810	finally
    //   560	573	810	finally
    //   573	580	810	finally
    //   585	598	810	finally
    //   598	612	810	finally
    //   612	619	810	finally
    //   623	630	810	finally
    //   630	637	810	finally
    //   637	646	810	finally
    //   646	653	810	finally
    //   653	664	810	finally
    //   664	671	810	finally
    //   671	682	810	finally
    //   682	689	810	finally
    //   689	695	810	finally
    //   699	706	810	finally
    //   706	713	810	finally
    //   717	723	810	finally
    //   723	754	810	finally
    //   754	771	810	finally
    //   771	777	810	finally
    //   777	787	810	finally
    //   717	723	813	java/lang/Throwable
    //   0	7	817	java/lang/Throwable
    //   9	134	817	java/lang/Throwable
    //   144	151	817	java/lang/Throwable
    //   161	168	817	java/lang/Throwable
    //   178	185	817	java/lang/Throwable
    //   195	202	817	java/lang/Throwable
    //   211	218	817	java/lang/Throwable
    //   227	234	817	java/lang/Throwable
    //   242	249	817	java/lang/Throwable
    //   257	264	817	java/lang/Throwable
    //   272	279	817	java/lang/Throwable
    //   287	294	817	java/lang/Throwable
    //   302	309	817	java/lang/Throwable
    //   317	324	817	java/lang/Throwable
    //   343	350	817	java/lang/Throwable
    //   363	370	817	java/lang/Throwable
    //   383	390	817	java/lang/Throwable
    //   403	410	817	java/lang/Throwable
    //   421	428	817	java/lang/Throwable
    //   437	444	817	java/lang/Throwable
    //   453	460	817	java/lang/Throwable
    //   472	479	817	java/lang/Throwable
    //   491	498	817	java/lang/Throwable
    //   516	523	817	java/lang/Throwable
    //   532	539	817	java/lang/Throwable
    //   548	555	817	java/lang/Throwable
    //   573	580	817	java/lang/Throwable
    //   598	612	817	java/lang/Throwable
    //   630	637	817	java/lang/Throwable
    //   646	653	817	java/lang/Throwable
    //   664	671	817	java/lang/Throwable
    //   682	689	817	java/lang/Throwable
    //   706	713	817	java/lang/Throwable
    //   723	754	817	java/lang/Throwable
    //   771	777	817	java/lang/Throwable
    //   777	787	820	java/lang/Throwable
    //   754	771	825	java/lang/Throwable
    //   689	695	829	java/lang/Throwable
    //   699	706	829	java/lang/Throwable
    //   671	682	834	java/lang/Throwable
    //   653	664	839	java/lang/Throwable
    //   637	646	844	java/lang/Throwable
    //   612	619	849	java/lang/Throwable
    //   623	630	849	java/lang/Throwable
    //   585	598	854	java/lang/Throwable
    //   560	573	859	java/lang/Throwable
    //   539	548	864	java/lang/Throwable
    //   523	532	869	java/lang/Throwable
    //   498	504	874	java/lang/Throwable
    //   509	516	874	java/lang/Throwable
    //   479	491	879	java/lang/Throwable
    //   460	472	884	java/lang/Throwable
    //   444	453	889	java/lang/Throwable
    //   428	437	894	java/lang/Throwable
    //   410	421	899	java/lang/Throwable
    //   390	403	904	java/lang/Throwable
    //   370	383	909	java/lang/Throwable
    //   350	363	914	java/lang/Throwable
    //   324	332	919	java/lang/Throwable
    //   336	343	919	java/lang/Throwable
    //   309	317	924	java/lang/Throwable
    //   294	302	929	java/lang/Throwable
    //   279	287	934	java/lang/Throwable
    //   264	272	939	java/lang/Throwable
    //   249	257	944	java/lang/Throwable
    //   234	242	949	java/lang/Throwable
    //   218	227	954	java/lang/Throwable
    //   202	211	959	java/lang/Throwable
    //   185	195	964	java/lang/Throwable
    //   168	178	969	java/lang/Throwable
    //   151	161	974	java/lang/Throwable
    //   134	144	979	java/lang/Throwable
  }
  
  private static String d()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b055f5d", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static final String d(Context paramContext, String paramString)
  {
    paramString = net.youmi.android.d.b.a.a(paramContext, e, paramString, 405);
    try
    {
      paramContext = d.a(paramContext, paramString);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  private static String e()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b04405e13", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String f()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b04505a0f", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String g()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b025a", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String h()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549415315", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String i()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549415315", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String j()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549575f", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String k()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a494e50450f4c5b041116465a1613401b000c4b1b4405495c43100f5f464c", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String l()
  {
    try
    {
      String str = g.b("0e1540480e4d1e471a494e50450f4c5b041116465a1613401b000c4b1b440549415315", "ddge66nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.a
 * JD-Core Version:    0.7.0.1
 */