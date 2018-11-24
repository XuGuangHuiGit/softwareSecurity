package net.youmi.android.a.e.a;

import android.content.Context;
import java.util.Locale;
import net.youmi.android.c.c.e;
import net.youmi.android.c.c.g;

public class a
{
  public static String a()
  {
    try
    {
      String str = g.b("0c4c43150f4d1b174400471a5f404b180e45545e485a03151c4a11594219440b4d5a575a07", "uf6EAifs");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static String a(Context paramContext, String paramString)
  {
    try
    {
      if (!net.youmi.android.b.b.a.c(paramContext)) {
        return null;
      }
      String str1 = net.youmi.android.b.b.a.a(paramContext);
      String str2 = net.youmi.android.b.b.a.b(paramContext);
      paramContext = a();
      if (paramContext != null)
      {
        str2 = e.a(str1 + paramString + str2);
        paramContext = String.format(Locale.US, "%s?app=%s&key=%s&sig=%s&rt=%d", new Object[] { paramContext, str1, paramString, str2, Long.valueOf(System.currentTimeMillis() / 1000L) });
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  /* Error */
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 4
    //   3: aconst_null
    //   4: astore 11
    //   6: aload_0
    //   7: ifnonnull +37 -> 44
    //   10: aload_1
    //   11: astore 10
    //   13: aload_1
    //   14: astore 9
    //   16: ldc 82
    //   18: iconst_0
    //   19: anewarray 4	java/lang/Object
    //   22: invokestatic 87	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: ldc 89
    //   27: iconst_2
    //   28: anewarray 4	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: aload_1
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: aload_2
    //   38: aastore
    //   39: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_2
    //   43: areturn
    //   44: aload_1
    //   45: astore 10
    //   47: aload_1
    //   48: astore 9
    //   50: aload_0
    //   51: invokevirtual 98	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   54: astore 12
    //   56: aload 12
    //   58: ifnonnull +40 -> 98
    //   61: aload_1
    //   62: astore 10
    //   64: aload_1
    //   65: astore 9
    //   67: ldc 100
    //   69: iconst_0
    //   70: anewarray 4	java/lang/Object
    //   73: invokestatic 87	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: ldc 89
    //   78: iconst_2
    //   79: anewarray 4	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload_1
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload_2
    //   89: aastore
    //   90: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_2
    //   94: areturn
    //   95: astore_0
    //   96: aload_2
    //   97: areturn
    //   98: aload_1
    //   99: ifnonnull +40 -> 139
    //   102: aload_1
    //   103: astore 10
    //   105: aload_1
    //   106: astore 9
    //   108: ldc 102
    //   110: iconst_0
    //   111: anewarray 4	java/lang/Object
    //   114: invokestatic 87	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: ldc 89
    //   119: iconst_2
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload_1
    //   126: aastore
    //   127: dup
    //   128: iconst_1
    //   129: aload_2
    //   130: aastore
    //   131: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aload_2
    //   135: areturn
    //   136: astore_0
    //   137: aload_2
    //   138: areturn
    //   139: aload_1
    //   140: astore 10
    //   142: aload_1
    //   143: astore 9
    //   145: aload_1
    //   146: invokevirtual 105	java/lang/String:trim	()Ljava/lang/String;
    //   149: astore_1
    //   150: aload_1
    //   151: astore 10
    //   153: aload_1
    //   154: astore 9
    //   156: aload_1
    //   157: invokevirtual 109	java/lang/String:length	()I
    //   160: ifgt +40 -> 200
    //   163: aload_1
    //   164: astore 10
    //   166: aload_1
    //   167: astore 9
    //   169: ldc 111
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 87	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: ldc 89
    //   180: iconst_2
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_1
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: aload_2
    //   191: aastore
    //   192: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   195: aload_2
    //   196: areturn
    //   197: astore_0
    //   198: aload_2
    //   199: areturn
    //   200: aload_1
    //   201: astore 10
    //   203: aload_1
    //   204: astore 9
    //   206: aload_1
    //   207: ldc 113
    //   209: invokevirtual 117	java/lang/String:matches	(Ljava/lang/String;)Z
    //   212: ifne +44 -> 256
    //   215: aload_1
    //   216: astore 10
    //   218: aload_1
    //   219: astore 9
    //   221: ldc 119
    //   223: iconst_1
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_1
    //   230: aastore
    //   231: invokestatic 87	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: ldc 89
    //   236: iconst_2
    //   237: anewarray 4	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload_1
    //   243: aastore
    //   244: dup
    //   245: iconst_1
    //   246: aload_2
    //   247: aastore
    //   248: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: aload_2
    //   252: areturn
    //   253: astore_0
    //   254: aload_2
    //   255: areturn
    //   256: aload_1
    //   257: astore 9
    //   259: aload 12
    //   261: invokestatic 124	net/youmi/android/a/e/a/c:a	(Landroid/content/Context;)Lnet/youmi/android/a/e/a/c;
    //   264: aload_1
    //   265: aconst_null
    //   266: invokevirtual 126	net/youmi/android/a/e/a/c:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   269: astore 10
    //   271: aload 10
    //   273: ifnull +26 -> 299
    //   276: ldc 89
    //   278: iconst_2
    //   279: anewarray 4	java/lang/Object
    //   282: dup
    //   283: iconst_0
    //   284: aload_1
    //   285: aastore
    //   286: dup
    //   287: iconst_1
    //   288: aload 10
    //   290: aastore
    //   291: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   294: aload 10
    //   296: areturn
    //   297: astore 9
    //   299: aload_1
    //   300: astore 10
    //   302: aload_1
    //   303: astore 9
    //   305: aload 12
    //   307: aload_1
    //   308: invokestatic 128	net/youmi/android/a/e/a/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   311: astore 13
    //   313: aload_1
    //   314: astore 10
    //   316: aload_1
    //   317: astore 9
    //   319: aload 12
    //   321: aload 13
    //   323: iconst_1
    //   324: invokestatic 133	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    //   327: astore 12
    //   329: aload_1
    //   330: astore 10
    //   332: aload_1
    //   333: astore 9
    //   335: ldc 135
    //   337: iconst_3
    //   338: anewarray 4	java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: aload_1
    //   344: aastore
    //   345: dup
    //   346: iconst_1
    //   347: aload 13
    //   349: aastore
    //   350: dup
    //   351: iconst_2
    //   352: aload 12
    //   354: aastore
    //   355: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: aload_1
    //   359: astore 10
    //   361: aload_1
    //   362: astore 9
    //   364: aload 12
    //   366: invokestatic 140	net/youmi/android/c/b/b:a	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   369: astore 12
    //   371: aload 12
    //   373: ifnonnull +25 -> 398
    //   376: ldc 89
    //   378: iconst_2
    //   379: anewarray 4	java/lang/Object
    //   382: dup
    //   383: iconst_0
    //   384: aload_1
    //   385: aastore
    //   386: dup
    //   387: iconst_1
    //   388: aconst_null
    //   389: aastore
    //   390: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   393: aload_2
    //   394: areturn
    //   395: astore_0
    //   396: aload_2
    //   397: areturn
    //   398: aload_1
    //   399: astore 10
    //   401: aload_1
    //   402: astore 9
    //   404: aload 12
    //   406: ldc 141
    //   408: sipush -999
    //   411: invokestatic 144	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   414: istore_3
    //   415: iload_3
    //   416: ifeq +25 -> 441
    //   419: ldc 89
    //   421: iconst_2
    //   422: anewarray 4	java/lang/Object
    //   425: dup
    //   426: iconst_0
    //   427: aload_1
    //   428: aastore
    //   429: dup
    //   430: iconst_1
    //   431: aconst_null
    //   432: aastore
    //   433: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   436: aload_2
    //   437: areturn
    //   438: astore_0
    //   439: aload_2
    //   440: areturn
    //   441: aload_1
    //   442: astore 10
    //   444: aload_1
    //   445: astore 9
    //   447: aload 12
    //   449: ldc 146
    //   451: lconst_0
    //   452: invokestatic 149	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;J)J
    //   455: lstore 6
    //   457: lload 6
    //   459: lconst_0
    //   460: lcmp
    //   461: ifge +181 -> 642
    //   464: aload_1
    //   465: astore 10
    //   467: aload_1
    //   468: astore 9
    //   470: aload 12
    //   472: ldc 150
    //   474: aconst_null
    //   475: invokestatic 153	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   478: ldc 155
    //   480: aconst_null
    //   481: invokestatic 158	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   484: astore 12
    //   486: aload 12
    //   488: ifnull +47 -> 535
    //   491: aload_0
    //   492: invokestatic 124	net/youmi/android/a/e/a/c:a	(Landroid/content/Context;)Lnet/youmi/android/a/e/a/c;
    //   495: aload_1
    //   496: aload 12
    //   498: lload 4
    //   500: ldc2_w 66
    //   503: lmul
    //   504: invokevirtual 161	net/youmi/android/a/e/a/c:a	(Ljava/lang/String;Ljava/lang/String;J)Z
    //   507: istore 8
    //   509: iload 8
    //   511: ifeq +3 -> 514
    //   514: ldc 89
    //   516: iconst_2
    //   517: anewarray 4	java/lang/Object
    //   520: dup
    //   521: iconst_0
    //   522: aload_1
    //   523: aastore
    //   524: dup
    //   525: iconst_1
    //   526: aload 12
    //   528: aastore
    //   529: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   532: aload 12
    //   534: areturn
    //   535: ldc 89
    //   537: iconst_2
    //   538: anewarray 4	java/lang/Object
    //   541: dup
    //   542: iconst_0
    //   543: aload_1
    //   544: aastore
    //   545: dup
    //   546: iconst_1
    //   547: aload 12
    //   549: aastore
    //   550: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   553: aload_2
    //   554: areturn
    //   555: astore_0
    //   556: aload_2
    //   557: areturn
    //   558: astore_0
    //   559: aload 10
    //   561: astore 9
    //   563: aload_0
    //   564: invokestatic 164	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   567: ldc 89
    //   569: iconst_2
    //   570: anewarray 4	java/lang/Object
    //   573: dup
    //   574: iconst_0
    //   575: aload 10
    //   577: aastore
    //   578: dup
    //   579: iconst_1
    //   580: aconst_null
    //   581: aastore
    //   582: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   585: aload_2
    //   586: areturn
    //   587: astore_0
    //   588: aload_2
    //   589: areturn
    //   590: astore_0
    //   591: aload 9
    //   593: astore_1
    //   594: aload 11
    //   596: astore_2
    //   597: ldc 89
    //   599: iconst_2
    //   600: anewarray 4	java/lang/Object
    //   603: dup
    //   604: iconst_0
    //   605: aload_1
    //   606: aastore
    //   607: dup
    //   608: iconst_1
    //   609: aload_2
    //   610: aastore
    //   611: invokestatic 92	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   614: aload_0
    //   615: athrow
    //   616: astore_1
    //   617: goto -3 -> 614
    //   620: astore_0
    //   621: aload 12
    //   623: astore_2
    //   624: goto -27 -> 597
    //   627: astore_0
    //   628: goto -96 -> 532
    //   631: astore_0
    //   632: goto -118 -> 514
    //   635: astore_0
    //   636: goto -342 -> 294
    //   639: astore_0
    //   640: aload_2
    //   641: areturn
    //   642: lload 6
    //   644: lstore 4
    //   646: goto -182 -> 464
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	649	0	paramContext	Context
    //   0	649	1	paramString1	String
    //   0	649	2	paramString2	String
    //   414	2	3	i	int
    //   1	644	4	l1	long
    //   455	188	6	l2	long
    //   507	3	8	bool	boolean
    //   14	244	9	str1	String
    //   297	1	9	localThrowable	Throwable
    //   303	289	9	str2	String
    //   11	565	10	str3	String
    //   4	591	11	localObject1	Object
    //   54	568	12	localObject2	Object
    //   311	37	13	str4	String
    // Exception table:
    //   from	to	target	type
    //   76	93	95	java/lang/Throwable
    //   117	134	136	java/lang/Throwable
    //   178	195	197	java/lang/Throwable
    //   234	251	253	java/lang/Throwable
    //   259	271	297	java/lang/Throwable
    //   376	393	395	java/lang/Throwable
    //   419	436	438	java/lang/Throwable
    //   535	553	555	java/lang/Throwable
    //   16	25	558	java/lang/Throwable
    //   50	56	558	java/lang/Throwable
    //   67	76	558	java/lang/Throwable
    //   108	117	558	java/lang/Throwable
    //   145	150	558	java/lang/Throwable
    //   156	163	558	java/lang/Throwable
    //   169	178	558	java/lang/Throwable
    //   206	215	558	java/lang/Throwable
    //   221	234	558	java/lang/Throwable
    //   305	313	558	java/lang/Throwable
    //   319	329	558	java/lang/Throwable
    //   335	358	558	java/lang/Throwable
    //   364	371	558	java/lang/Throwable
    //   404	415	558	java/lang/Throwable
    //   447	457	558	java/lang/Throwable
    //   470	486	558	java/lang/Throwable
    //   567	585	587	java/lang/Throwable
    //   16	25	590	finally
    //   50	56	590	finally
    //   67	76	590	finally
    //   108	117	590	finally
    //   145	150	590	finally
    //   156	163	590	finally
    //   169	178	590	finally
    //   206	215	590	finally
    //   221	234	590	finally
    //   259	271	590	finally
    //   305	313	590	finally
    //   319	329	590	finally
    //   335	358	590	finally
    //   364	371	590	finally
    //   404	415	590	finally
    //   447	457	590	finally
    //   470	486	590	finally
    //   563	567	590	finally
    //   597	614	616	java/lang/Throwable
    //   491	509	620	finally
    //   514	532	627	java/lang/Throwable
    //   491	509	631	java/lang/Throwable
    //   276	294	635	java/lang/Throwable
    //   25	42	639	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.e.a.a
 * JD-Core Version:    0.7.0.1
 */