package net.youmi.android.a.h.b.h;

import net.youmi.android.a.h.b.d;

public final class b
  extends d
{
  /* Error */
  protected org.json.JSONObject a(net.youmi.android.a.h.e parame, net.youmi.android.a.h.b paramb, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: invokestatic 18	net/youmi/android/c/e/c:a	()Ljava/lang/String;
    //   6: pop
    //   7: new 20	org/json/JSONObject
    //   10: dup
    //   11: invokespecial 21	org/json/JSONObject:<init>	()V
    //   14: astore_1
    //   15: aload_3
    //   16: ldc 22
    //   18: aconst_null
    //   19: invokestatic 27	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;
    //   22: astore_2
    //   23: aload_2
    //   24: ifnull +428 -> 452
    //   27: aload_2
    //   28: invokevirtual 33	org/json/JSONArray:length	()I
    //   31: istore 5
    //   33: iload 4
    //   35: iload 5
    //   37: if_icmpge +415 -> 452
    //   40: aload_2
    //   41: iload 4
    //   43: invokevirtual 37	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   46: astore_3
    //   47: aload_3
    //   48: invokevirtual 42	java/lang/String:trim	()Ljava/lang/String;
    //   51: invokevirtual 45	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   54: astore 6
    //   56: ldc 47
    //   58: aload 6
    //   60: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   63: ifeq +15 -> 78
    //   66: aload_1
    //   67: aload_3
    //   68: getstatic 56	android/os/Build:BOARD	Ljava/lang/String;
    //   71: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   74: pop
    //   75: goto +395 -> 470
    //   78: ldc 62
    //   80: aload 6
    //   82: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifeq +15 -> 100
    //   88: aload_1
    //   89: aload_3
    //   90: getstatic 64	android/os/Build:BRAND	Ljava/lang/String;
    //   93: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   96: pop
    //   97: goto +373 -> 470
    //   100: ldc 66
    //   102: aload 6
    //   104: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   107: ifeq +15 -> 122
    //   110: aload_1
    //   111: aload_3
    //   112: getstatic 68	android/os/Build:DEVICE	Ljava/lang/String;
    //   115: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   118: pop
    //   119: goto +351 -> 470
    //   122: ldc 70
    //   124: aload 6
    //   126: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   129: ifeq +15 -> 144
    //   132: aload_1
    //   133: aload_3
    //   134: getstatic 72	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   137: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   140: pop
    //   141: goto +329 -> 470
    //   144: ldc 74
    //   146: aload 6
    //   148: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   151: ifeq +15 -> 166
    //   154: aload_1
    //   155: aload_3
    //   156: getstatic 76	android/os/Build:MODEL	Ljava/lang/String;
    //   159: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   162: pop
    //   163: goto +307 -> 470
    //   166: ldc 78
    //   168: aload 6
    //   170: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   173: ifeq +15 -> 188
    //   176: aload_1
    //   177: aload_3
    //   178: getstatic 80	android/os/Build:PRODUCT	Ljava/lang/String;
    //   181: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   184: pop
    //   185: goto +285 -> 470
    //   188: ldc 82
    //   190: aload 6
    //   192: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   195: ifeq +15 -> 210
    //   198: aload_1
    //   199: aload_3
    //   200: getstatic 84	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   203: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   206: pop
    //   207: goto +263 -> 470
    //   210: ldc 86
    //   212: aload 6
    //   214: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: ifeq +15 -> 232
    //   220: aload_1
    //   221: aload_3
    //   222: getstatic 88	android/os/Build:DISPLAY	Ljava/lang/String;
    //   225: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   228: pop
    //   229: goto +241 -> 470
    //   232: ldc 90
    //   234: aload 6
    //   236: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   239: ifeq +15 -> 254
    //   242: aload_1
    //   243: aload_3
    //   244: getstatic 92	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   247: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   250: pop
    //   251: goto +219 -> 470
    //   254: ldc 94
    //   256: aload 6
    //   258: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   261: ifeq +15 -> 276
    //   264: aload_1
    //   265: aload_3
    //   266: getstatic 96	android/os/Build:HOST	Ljava/lang/String;
    //   269: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   272: pop
    //   273: goto +197 -> 470
    //   276: ldc 98
    //   278: aload 6
    //   280: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   283: ifeq +15 -> 298
    //   286: aload_1
    //   287: aload_3
    //   288: getstatic 100	android/os/Build:ID	Ljava/lang/String;
    //   291: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   294: pop
    //   295: goto +175 -> 470
    //   298: ldc 102
    //   300: aload 6
    //   302: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   305: ifeq +15 -> 320
    //   308: aload_1
    //   309: aload_3
    //   310: getstatic 104	android/os/Build:TAGS	Ljava/lang/String;
    //   313: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   316: pop
    //   317: goto +153 -> 470
    //   320: ldc 106
    //   322: aload 6
    //   324: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   327: ifeq +15 -> 342
    //   330: aload_1
    //   331: aload_3
    //   332: getstatic 108	android/os/Build:TYPE	Ljava/lang/String;
    //   335: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   338: pop
    //   339: goto +131 -> 470
    //   342: ldc 110
    //   344: aload 6
    //   346: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   349: ifeq +15 -> 364
    //   352: aload_1
    //   353: aload_3
    //   354: getstatic 112	android/os/Build:USER	Ljava/lang/String;
    //   357: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   360: pop
    //   361: goto +109 -> 470
    //   364: ldc 114
    //   366: aload 6
    //   368: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   371: ifeq +15 -> 386
    //   374: aload_1
    //   375: aload_3
    //   376: getstatic 119	android/os/Build$VERSION:CODENAME	Ljava/lang/String;
    //   379: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   382: pop
    //   383: goto +87 -> 470
    //   386: ldc 121
    //   388: aload 6
    //   390: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   393: ifeq +15 -> 408
    //   396: aload_1
    //   397: aload_3
    //   398: getstatic 124	android/os/Build$VERSION:INCREMENTAL	Ljava/lang/String;
    //   401: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   404: pop
    //   405: goto +65 -> 470
    //   408: ldc 126
    //   410: aload 6
    //   412: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   415: ifeq +15 -> 430
    //   418: aload_1
    //   419: aload_3
    //   420: getstatic 129	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   423: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   426: pop
    //   427: goto +43 -> 470
    //   430: ldc 131
    //   432: aload 6
    //   434: invokevirtual 51	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   437: ifeq +33 -> 470
    //   440: aload_1
    //   441: aload_3
    //   442: getstatic 135	android/os/Build$VERSION:SDK_INT	I
    //   445: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   448: pop
    //   449: goto +21 -> 470
    //   452: iconst_0
    //   453: invokestatic 141	net/youmi/android/a/h/b/h/b:a	(I)Lorg/json/JSONObject;
    //   456: astore_2
    //   457: aload_2
    //   458: ldc 143
    //   460: aload_1
    //   461: invokevirtual 60	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   464: pop
    //   465: aload_2
    //   466: areturn
    //   467: astore_1
    //   468: aconst_null
    //   469: areturn
    //   470: iload 4
    //   472: iconst_1
    //   473: iadd
    //   474: istore 4
    //   476: goto -449 -> 27
    //   479: astore_3
    //   480: goto -10 -> 470
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	483	0	this	b
    //   0	483	1	parame	net.youmi.android.a.h.e
    //   0	483	2	paramb	net.youmi.android.a.h.b
    //   0	483	3	paramJSONObject	org.json.JSONObject
    //   1	474	4	i	int
    //   31	7	5	j	int
    //   54	379	6	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   3	23	467	java/lang/Throwable
    //   27	33	467	java/lang/Throwable
    //   452	465	467	java/lang/Throwable
    //   40	75	479	java/lang/Throwable
    //   78	97	479	java/lang/Throwable
    //   100	119	479	java/lang/Throwable
    //   122	141	479	java/lang/Throwable
    //   144	163	479	java/lang/Throwable
    //   166	185	479	java/lang/Throwable
    //   188	207	479	java/lang/Throwable
    //   210	229	479	java/lang/Throwable
    //   232	251	479	java/lang/Throwable
    //   254	273	479	java/lang/Throwable
    //   276	295	479	java/lang/Throwable
    //   298	317	479	java/lang/Throwable
    //   320	339	479	java/lang/Throwable
    //   342	361	479	java/lang/Throwable
    //   364	383	479	java/lang/Throwable
    //   386	405	479	java/lang/Throwable
    //   408	427	479	java/lang/Throwable
    //   430	449	479	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.h.b
 * JD-Core Version:    0.7.0.1
 */