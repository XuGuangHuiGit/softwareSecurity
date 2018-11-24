package net.youmi.android.offers.b.b.a;

import net.youmi.android.c.c.g;

public class a
{
  private static String a()
  {
    try
    {
      String str = g.b("0d4d40490d1c170458111d4e510f0f1c4a0a450c0a1c0a01401f10051e500441", "yKl76nGU1e7a");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  /* Error */
  public static String a(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 26	net/youmi/android/b/b/a:c	(Landroid/content/Context;)Z
    //   4: ifne +14 -> 18
    //   7: ldc 28
    //   9: iconst_0
    //   10: anewarray 4	java/lang/Object
    //   13: invokestatic 33	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aconst_null
    //   17: areturn
    //   18: new 35	java/lang/StringBuilder
    //   21: dup
    //   22: sipush 512
    //   25: invokespecial 39	java/lang/StringBuilder:<init>	(I)V
    //   28: astore 4
    //   30: invokestatic 45	java/lang/System:currentTimeMillis	()J
    //   33: ldc2_w 46
    //   36: ldiv
    //   37: lstore_2
    //   38: iconst_4
    //   39: invokestatic 52	net/youmi/android/b/a/a:a	(I)Ljava/lang/String;
    //   42: astore 6
    //   44: new 54	net/youmi/android/b/a/b
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 57	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   52: astore 7
    //   54: aload 4
    //   56: invokestatic 59	net/youmi/android/offers/b/b/a/a:a	()Ljava/lang/String;
    //   59: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc 65
    //   64: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload 4
    //   70: ldc 67
    //   72: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload 4
    //   78: iconst_3
    //   79: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload 4
    //   85: aload_0
    //   86: invokestatic 73	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   89: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload 4
    //   95: aload 6
    //   97: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: new 75	java/io/ByteArrayOutputStream
    //   104: dup
    //   105: sipush 512
    //   108: invokespecial 76	java/io/ByteArrayOutputStream:<init>	(I)V
    //   111: astore 5
    //   113: ldc 78
    //   115: aload 5
    //   117: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   120: aload 5
    //   122: bipush 38
    //   124: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   127: lload_2
    //   128: invokestatic 92	java/lang/Long:toString	(J)Ljava/lang/String;
    //   131: aload 5
    //   133: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   136: aload 5
    //   138: bipush 38
    //   140: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   143: aload 7
    //   145: invokevirtual 95	net/youmi/android/b/a/b:d	()Ljava/lang/String;
    //   148: aload 5
    //   150: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   153: aload 5
    //   155: bipush 38
    //   157: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   160: aload 7
    //   162: invokevirtual 97	net/youmi/android/b/a/b:c	()Ljava/lang/String;
    //   165: aload 5
    //   167: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   170: aload 5
    //   172: bipush 38
    //   174: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   177: aload 7
    //   179: invokevirtual 99	net/youmi/android/b/a/b:b	()Ljava/lang/String;
    //   182: aload 5
    //   184: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   187: aload 5
    //   189: bipush 38
    //   191: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   194: aload 7
    //   196: invokevirtual 100	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   199: aload 5
    //   201: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   204: aload 5
    //   206: bipush 38
    //   208: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   211: aload_0
    //   212: invokestatic 105	net/youmi/android/c/a:g	(Landroid/content/Context;)Ljava/lang/String;
    //   215: aload 5
    //   217: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   220: aload 5
    //   222: bipush 38
    //   224: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   227: aload_0
    //   228: invokestatic 107	net/youmi/android/c/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   231: aload 5
    //   233: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   236: aload 5
    //   238: bipush 38
    //   240: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   243: aload_0
    //   244: invokestatic 113	net/youmi/android/offers/OffersManager:getInstance	(Landroid/content/Context;)Lnet/youmi/android/offers/OffersManager;
    //   247: invokevirtual 116	net/youmi/android/offers/OffersManager:getCustomUserId	()Ljava/lang/String;
    //   250: aload 5
    //   252: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   255: aload 5
    //   257: bipush 38
    //   259: invokevirtual 86	java/io/ByteArrayOutputStream:write	(I)V
    //   262: aload_1
    //   263: ifnull +21 -> 284
    //   266: aload_1
    //   267: invokevirtual 121	java/lang/String:trim	()Ljava/lang/String;
    //   270: astore_1
    //   271: aload_1
    //   272: invokevirtual 125	java/lang/String:length	()I
    //   275: ifle +9 -> 284
    //   278: aload_1
    //   279: aload 5
    //   281: invokestatic 83	net/youmi/android/b/a/c:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   284: new 35	java/lang/StringBuilder
    //   287: dup
    //   288: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   291: ldc 130
    //   293: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: aload_0
    //   297: invokestatic 131	net/youmi/android/b/b/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   300: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: aload 6
    //   305: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokestatic 138	net/youmi/android/c/c/e:a	(Ljava/lang/String;)Ljava/lang/String;
    //   314: astore_0
    //   315: aload 4
    //   317: aload 5
    //   319: invokevirtual 142	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   322: aload_0
    //   323: ldc 143
    //   325: invokestatic 146	net/youmi/android/b/a/a:a	([BLjava/lang/String;I)Ljava/lang/String;
    //   328: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: pop
    //   332: aload 4
    //   334: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: astore_0
    //   338: aload_0
    //   339: areturn
    //   340: astore_0
    //   341: aconst_null
    //   342: areturn
    //   343: astore_0
    //   344: goto -12 -> 332
    //   347: astore_1
    //   348: goto -64 -> 284
    //   351: astore 7
    //   353: goto -98 -> 255
    //   356: astore 7
    //   358: goto -122 -> 236
    //   361: astore 7
    //   363: goto -143 -> 220
    //   366: astore 7
    //   368: goto -164 -> 204
    //   371: astore 8
    //   373: goto -186 -> 187
    //   376: astore 8
    //   378: goto -208 -> 170
    //   381: astore 8
    //   383: goto -230 -> 153
    //   386: astore 8
    //   388: goto -252 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	391	0	paramContext	android.content.Context
    //   0	391	1	paramString	String
    //   37	91	2	l	long
    //   28	305	4	localStringBuilder	java.lang.StringBuilder
    //   111	207	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   42	262	6	str	String
    //   52	143	7	localb	net.youmi.android.b.a.b
    //   351	1	7	localThrowable1	Throwable
    //   356	1	7	localThrowable2	Throwable
    //   361	1	7	localThrowable3	Throwable
    //   366	1	7	localThrowable4	Throwable
    //   371	1	8	localThrowable5	Throwable
    //   376	1	8	localThrowable6	Throwable
    //   381	1	8	localThrowable7	Throwable
    //   386	1	8	localThrowable8	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	16	340	java/lang/Throwable
    //   18	127	340	java/lang/Throwable
    //   136	143	340	java/lang/Throwable
    //   153	160	340	java/lang/Throwable
    //   170	177	340	java/lang/Throwable
    //   187	194	340	java/lang/Throwable
    //   204	211	340	java/lang/Throwable
    //   220	227	340	java/lang/Throwable
    //   236	243	340	java/lang/Throwable
    //   255	262	340	java/lang/Throwable
    //   284	315	340	java/lang/Throwable
    //   332	338	340	java/lang/Throwable
    //   315	332	343	java/lang/Throwable
    //   266	284	347	java/lang/Throwable
    //   243	255	351	java/lang/Throwable
    //   227	236	356	java/lang/Throwable
    //   211	220	361	java/lang/Throwable
    //   194	204	366	java/lang/Throwable
    //   177	187	371	java/lang/Throwable
    //   160	170	376	java/lang/Throwable
    //   143	153	381	java/lang/Throwable
    //   127	136	386	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.b.b.a.a
 * JD-Core Version:    0.7.0.1
 */