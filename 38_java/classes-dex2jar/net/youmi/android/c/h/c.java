package net.youmi.android.c.h;

import android.content.Context;
import java.io.File;

public class c
{
  private Context a;
  private long b = 0L;
  private long c = 0L;
  private boolean d = true;
  private String e;
  private File f;
  
  public c(Context paramContext, String paramString, File paramFile)
  {
    this(paramContext, paramString, paramFile, 0L);
  }
  
  public c(Context paramContext, String paramString, File paramFile, long paramLong)
  {
    this.a = paramContext.getApplicationContext();
    this.e = paramString;
    if (paramLong >= 0L) {
      this.b = paramLong;
    }
    this.f = paramFile;
  }
  
  /* Error */
  public int a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 11
    //   3: aconst_null
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 13
    //   9: aconst_null
    //   10: astore 12
    //   12: aload 8
    //   14: astore 10
    //   16: aload_0
    //   17: getfield 40	net/youmi/android/c/h/c:e	Ljava/lang/String;
    //   20: astore 9
    //   22: aload 9
    //   24: ifnonnull +61 -> 85
    //   27: bipush 254
    //   29: istore_1
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 30	net/youmi/android/c/h/c:d	Z
    //   35: iconst_0
    //   36: ifeq +11 -> 47
    //   39: new 47	java/lang/NullPointerException
    //   42: dup
    //   43: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   46: athrow
    //   47: iconst_0
    //   48: ifeq +11 -> 59
    //   51: new 47	java/lang/NullPointerException
    //   54: dup
    //   55: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   58: athrow
    //   59: iconst_0
    //   60: ifeq +11 -> 71
    //   63: new 47	java/lang/NullPointerException
    //   66: dup
    //   67: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   70: athrow
    //   71: iconst_0
    //   72: ifeq +11 -> 83
    //   75: new 47	java/lang/NullPointerException
    //   78: dup
    //   79: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   82: athrow
    //   83: iload_1
    //   84: ireturn
    //   85: aload 8
    //   87: astore 10
    //   89: aload_0
    //   90: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   93: astore 9
    //   95: aload 9
    //   97: ifnonnull +64 -> 161
    //   100: bipush 254
    //   102: istore_1
    //   103: aload_0
    //   104: iconst_0
    //   105: putfield 30	net/youmi/android/c/h/c:d	Z
    //   108: iconst_0
    //   109: ifeq +11 -> 120
    //   112: new 47	java/lang/NullPointerException
    //   115: dup
    //   116: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   119: athrow
    //   120: iconst_0
    //   121: ifeq +11 -> 132
    //   124: new 47	java/lang/NullPointerException
    //   127: dup
    //   128: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   131: athrow
    //   132: iconst_0
    //   133: ifeq +11 -> 144
    //   136: new 47	java/lang/NullPointerException
    //   139: dup
    //   140: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   143: athrow
    //   144: iconst_0
    //   145: ifeq -62 -> 83
    //   148: new 47	java/lang/NullPointerException
    //   151: dup
    //   152: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   155: athrow
    //   156: astore 8
    //   158: bipush 254
    //   160: ireturn
    //   161: aload 8
    //   163: astore 10
    //   165: aload_0
    //   166: iconst_1
    //   167: putfield 30	net/youmi/android/c/h/c:d	Z
    //   170: aload 8
    //   172: astore 10
    //   174: aload_0
    //   175: getfield 38	net/youmi/android/c/h/c:a	Landroid/content/Context;
    //   178: invokestatic 53	net/youmi/android/c/h/g:b	(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   181: astore 8
    //   183: aload 8
    //   185: astore 10
    //   187: new 55	org/apache/http/client/methods/HttpGet
    //   190: dup
    //   191: aload_0
    //   192: getfield 40	net/youmi/android/c/h/c:e	Ljava/lang/String;
    //   195: invokespecial 58	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   198: astore 9
    //   200: aload_0
    //   201: getfield 26	net/youmi/android/c/h/c:b	J
    //   204: lstore 6
    //   206: lload 6
    //   208: lconst_0
    //   209: lcmp
    //   210: ifle +27 -> 237
    //   213: aload 9
    //   215: ldc 60
    //   217: ldc 62
    //   219: iconst_1
    //   220: anewarray 4	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: lload 6
    //   227: invokestatic 68	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   230: aastore
    //   231: invokestatic 74	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   234: invokevirtual 78	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload 8
    //   239: aload 9
    //   241: invokevirtual 84	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   244: astore 14
    //   246: aload 14
    //   248: invokeinterface 90 1 0
    //   253: invokeinterface 95 1 0
    //   258: istore_1
    //   259: iload_1
    //   260: sipush 200
    //   263: if_icmplt +10 -> 273
    //   266: iload_1
    //   267: sipush 300
    //   270: if_icmplt +63 -> 333
    //   273: iconst_m1
    //   274: istore_1
    //   275: aload_0
    //   276: iconst_0
    //   277: putfield 30	net/youmi/android/c/h/c:d	Z
    //   280: iconst_0
    //   281: ifeq +11 -> 292
    //   284: new 47	java/lang/NullPointerException
    //   287: dup
    //   288: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   291: athrow
    //   292: aload 9
    //   294: ifnull +8 -> 302
    //   297: aload 9
    //   299: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   302: aload 8
    //   304: ifnull +13 -> 317
    //   307: aload 8
    //   309: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   312: invokeinterface 107 1 0
    //   317: iconst_0
    //   318: ifeq -235 -> 83
    //   321: new 47	java/lang/NullPointerException
    //   324: dup
    //   325: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   328: athrow
    //   329: astore 8
    //   331: iconst_m1
    //   332: ireturn
    //   333: aload 14
    //   335: invokeinterface 111 1 0
    //   340: invokeinterface 117 1 0
    //   345: lstore 4
    //   347: iload_1
    //   348: sipush 200
    //   351: if_icmpne +93 -> 444
    //   354: lload 6
    //   356: lconst_0
    //   357: lcmp
    //   358: ifle +86 -> 444
    //   361: aload_0
    //   362: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   365: invokevirtual 122	java/io/File:length	()J
    //   368: lstore_2
    //   369: lload_2
    //   370: lload 4
    //   372: lcmp
    //   373: ifne +63 -> 436
    //   376: iconst_0
    //   377: istore_1
    //   378: aload_0
    //   379: iconst_0
    //   380: putfield 30	net/youmi/android/c/h/c:d	Z
    //   383: iconst_0
    //   384: ifeq +11 -> 395
    //   387: new 47	java/lang/NullPointerException
    //   390: dup
    //   391: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   394: athrow
    //   395: aload 9
    //   397: ifnull +8 -> 405
    //   400: aload 9
    //   402: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   405: aload 8
    //   407: ifnull +13 -> 420
    //   410: aload 8
    //   412: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   415: invokeinterface 107 1 0
    //   420: iconst_0
    //   421: ifeq -338 -> 83
    //   424: new 47	java/lang/NullPointerException
    //   427: dup
    //   428: invokespecial 48	java/lang/NullPointerException:<init>	()V
    //   431: athrow
    //   432: astore 8
    //   434: iconst_0
    //   435: ireturn
    //   436: aload_0
    //   437: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   440: invokevirtual 126	java/io/File:delete	()Z
    //   443: pop
    //   444: lload 6
    //   446: lconst_0
    //   447: lcmp
    //   448: ifne +34 -> 482
    //   451: aload_0
    //   452: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   455: invokevirtual 129	java/io/File:exists	()Z
    //   458: ifeq +24 -> 482
    //   461: aload_0
    //   462: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   465: invokevirtual 122	java/io/File:length	()J
    //   468: lload 4
    //   470: lcmp
    //   471: ifle +11 -> 482
    //   474: aload_0
    //   475: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   478: invokevirtual 126	java/io/File:delete	()Z
    //   481: pop
    //   482: new 131	java/io/RandomAccessFile
    //   485: dup
    //   486: aload_0
    //   487: getfield 42	net/youmi/android/c/h/c:f	Ljava/io/File;
    //   490: ldc 133
    //   492: invokespecial 136	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   495: astore 10
    //   497: aload 13
    //   499: astore 12
    //   501: aload 10
    //   503: lload 6
    //   505: invokevirtual 140	java/io/RandomAccessFile:seek	(J)V
    //   508: aload 13
    //   510: astore 12
    //   512: aload_0
    //   513: aload_0
    //   514: getfield 26	net/youmi/android/c/h/c:b	J
    //   517: lload 4
    //   519: ladd
    //   520: putfield 28	net/youmi/android/c/h/c:c	J
    //   523: aload 13
    //   525: astore 12
    //   527: aload 14
    //   529: invokeinterface 111 1 0
    //   534: invokeinterface 144 1 0
    //   539: astore 11
    //   541: aload 11
    //   543: astore 12
    //   545: sipush 2048
    //   548: newarray byte
    //   550: astore 13
    //   552: aload 11
    //   554: astore 12
    //   556: aload_0
    //   557: getfield 30	net/youmi/android/c/h/c:d	Z
    //   560: ifeq +125 -> 685
    //   563: aload 11
    //   565: astore 12
    //   567: aload 11
    //   569: aload 13
    //   571: invokevirtual 150	java/io/InputStream:read	([B)I
    //   574: istore_1
    //   575: iload_1
    //   576: ifle +109 -> 685
    //   579: aload 11
    //   581: astore 12
    //   583: aload 10
    //   585: aload 13
    //   587: iconst_0
    //   588: iload_1
    //   589: invokevirtual 154	java/io/RandomAccessFile:write	([BII)V
    //   592: aload 11
    //   594: astore 12
    //   596: aload_0
    //   597: aload_0
    //   598: getfield 26	net/youmi/android/c/h/c:b	J
    //   601: iload_1
    //   602: i2l
    //   603: ladd
    //   604: putfield 26	net/youmi/android/c/h/c:b	J
    //   607: goto -55 -> 552
    //   610: astore 12
    //   612: aload 11
    //   614: astore 12
    //   616: aload 10
    //   618: astore 11
    //   620: aload 9
    //   622: astore 10
    //   624: aload 8
    //   626: astore 9
    //   628: aload 12
    //   630: astore 8
    //   632: aload_0
    //   633: iconst_0
    //   634: putfield 30	net/youmi/android/c/h/c:d	Z
    //   637: aload 11
    //   639: ifnull +8 -> 647
    //   642: aload 11
    //   644: invokevirtual 157	java/io/RandomAccessFile:close	()V
    //   647: aload 10
    //   649: ifnull +8 -> 657
    //   652: aload 10
    //   654: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   657: aload 9
    //   659: ifnull +13 -> 672
    //   662: aload 9
    //   664: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   667: invokeinterface 107 1 0
    //   672: aload 8
    //   674: ifnull +8 -> 682
    //   677: aload 8
    //   679: invokevirtual 158	java/io/InputStream:close	()V
    //   682: bipush 252
    //   684: ireturn
    //   685: aload 11
    //   687: astore 12
    //   689: aload_0
    //   690: getfield 28	net/youmi/android/c/h/c:c	J
    //   693: lstore_2
    //   694: aload 11
    //   696: astore 12
    //   698: aload_0
    //   699: getfield 26	net/youmi/android/c/h/c:b	J
    //   702: lstore 4
    //   704: lload_2
    //   705: lload 4
    //   707: lcmp
    //   708: ifne +61 -> 769
    //   711: iconst_0
    //   712: istore_1
    //   713: aload_0
    //   714: iconst_0
    //   715: putfield 30	net/youmi/android/c/h/c:d	Z
    //   718: aload 10
    //   720: ifnull +8 -> 728
    //   723: aload 10
    //   725: invokevirtual 157	java/io/RandomAccessFile:close	()V
    //   728: aload 9
    //   730: ifnull +8 -> 738
    //   733: aload 9
    //   735: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   738: aload 8
    //   740: ifnull +13 -> 753
    //   743: aload 8
    //   745: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   748: invokeinterface 107 1 0
    //   753: aload 11
    //   755: ifnull -672 -> 83
    //   758: aload 11
    //   760: invokevirtual 158	java/io/InputStream:close	()V
    //   763: iconst_0
    //   764: ireturn
    //   765: astore 8
    //   767: iconst_0
    //   768: ireturn
    //   769: bipush 253
    //   771: istore_1
    //   772: aload_0
    //   773: iconst_0
    //   774: putfield 30	net/youmi/android/c/h/c:d	Z
    //   777: aload 10
    //   779: ifnull +8 -> 787
    //   782: aload 10
    //   784: invokevirtual 157	java/io/RandomAccessFile:close	()V
    //   787: aload 9
    //   789: ifnull +8 -> 797
    //   792: aload 9
    //   794: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   797: aload 8
    //   799: ifnull +13 -> 812
    //   802: aload 8
    //   804: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   807: invokeinterface 107 1 0
    //   812: aload 11
    //   814: ifnull -731 -> 83
    //   817: aload 11
    //   819: invokevirtual 158	java/io/InputStream:close	()V
    //   822: bipush 253
    //   824: ireturn
    //   825: astore 8
    //   827: bipush 253
    //   829: ireturn
    //   830: astore 13
    //   832: aconst_null
    //   833: astore 9
    //   835: aload 10
    //   837: astore 8
    //   839: aload 13
    //   841: astore 10
    //   843: aload_0
    //   844: iconst_0
    //   845: putfield 30	net/youmi/android/c/h/c:d	Z
    //   848: aload 11
    //   850: ifnull +8 -> 858
    //   853: aload 11
    //   855: invokevirtual 157	java/io/RandomAccessFile:close	()V
    //   858: aload 9
    //   860: ifnull +8 -> 868
    //   863: aload 9
    //   865: invokevirtual 98	org/apache/http/client/methods/HttpGet:abort	()V
    //   868: aload 8
    //   870: ifnull +13 -> 883
    //   873: aload 8
    //   875: invokevirtual 102	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   878: invokeinterface 107 1 0
    //   883: aload 12
    //   885: ifnull +8 -> 893
    //   888: aload 12
    //   890: invokevirtual 158	java/io/InputStream:close	()V
    //   893: aload 10
    //   895: athrow
    //   896: astore 8
    //   898: goto -851 -> 47
    //   901: astore 8
    //   903: goto -844 -> 59
    //   906: astore 8
    //   908: bipush 254
    //   910: ireturn
    //   911: astore 8
    //   913: goto -793 -> 120
    //   916: astore 8
    //   918: goto -786 -> 132
    //   921: astore 10
    //   923: goto -631 -> 292
    //   926: astore 9
    //   928: goto -626 -> 302
    //   931: astore 10
    //   933: goto -538 -> 395
    //   936: astore 9
    //   938: goto -533 -> 405
    //   941: astore 10
    //   943: goto -215 -> 728
    //   946: astore 9
    //   948: goto -210 -> 738
    //   951: astore 10
    //   953: goto -166 -> 787
    //   956: astore 9
    //   958: goto -161 -> 797
    //   961: astore 11
    //   963: goto -316 -> 647
    //   966: astore 10
    //   968: goto -311 -> 657
    //   971: astore 8
    //   973: goto -291 -> 682
    //   976: astore 11
    //   978: goto -120 -> 858
    //   981: astore 9
    //   983: goto -115 -> 868
    //   986: astore 8
    //   988: goto -95 -> 893
    //   991: astore 8
    //   993: goto -110 -> 883
    //   996: astore 10
    //   998: goto -155 -> 843
    //   1001: astore 13
    //   1003: aload 10
    //   1005: astore 11
    //   1007: aload 13
    //   1009: astore 10
    //   1011: goto -168 -> 843
    //   1014: astore 9
    //   1016: goto -344 -> 672
    //   1019: astore 8
    //   1021: aconst_null
    //   1022: astore 8
    //   1024: aconst_null
    //   1025: astore 11
    //   1027: aconst_null
    //   1028: astore 9
    //   1030: aconst_null
    //   1031: astore 10
    //   1033: goto -401 -> 632
    //   1036: astore 9
    //   1038: aconst_null
    //   1039: astore 12
    //   1041: aconst_null
    //   1042: astore 11
    //   1044: aload 8
    //   1046: astore 9
    //   1048: aconst_null
    //   1049: astore 10
    //   1051: aload 12
    //   1053: astore 8
    //   1055: goto -423 -> 632
    //   1058: astore 10
    //   1060: aconst_null
    //   1061: astore 13
    //   1063: aload 8
    //   1065: astore 10
    //   1067: aload 9
    //   1069: astore 11
    //   1071: aconst_null
    //   1072: astore 12
    //   1074: aload 13
    //   1076: astore 8
    //   1078: aload 10
    //   1080: astore 9
    //   1082: aload 11
    //   1084: astore 10
    //   1086: aload 12
    //   1088: astore 11
    //   1090: goto -458 -> 632
    //   1093: astore 11
    //   1095: aconst_null
    //   1096: astore 14
    //   1098: aload 8
    //   1100: astore 12
    //   1102: aload 9
    //   1104: astore 13
    //   1106: aload 10
    //   1108: astore 11
    //   1110: aload 14
    //   1112: astore 8
    //   1114: aload 12
    //   1116: astore 9
    //   1118: aload 13
    //   1120: astore 10
    //   1122: goto -490 -> 632
    //   1125: astore 8
    //   1127: goto -315 -> 812
    //   1130: astore 8
    //   1132: goto -379 -> 753
    //   1135: astore 10
    //   1137: goto -655 -> 482
    //   1140: astore 10
    //   1142: goto -698 -> 444
    //   1145: astore 8
    //   1147: goto -727 -> 420
    //   1150: astore 8
    //   1152: goto -835 -> 317
    //   1155: astore 8
    //   1157: goto -1013 -> 144
    //   1160: astore 8
    //   1162: goto -1091 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1165	0	this	c
    //   29	743	1	i	int
    //   368	337	2	l1	long
    //   345	361	4	l2	long
    //   204	300	6	l3	long
    //   4	82	8	localObject1	Object
    //   156	15	8	localThrowable1	Throwable
    //   181	127	8	localDefaultHttpClient	org.apache.http.impl.client.DefaultHttpClient
    //   329	82	8	localThrowable2	Throwable
    //   432	193	8	localThrowable3	Throwable
    //   630	114	8	localObject2	Object
    //   765	38	8	localThrowable4	Throwable
    //   825	1	8	localThrowable5	Throwable
    //   837	37	8	localObject3	Object
    //   896	1	8	localThrowable6	Throwable
    //   901	1	8	localThrowable7	Throwable
    //   906	1	8	localThrowable8	Throwable
    //   911	1	8	localThrowable9	Throwable
    //   916	1	8	localThrowable10	Throwable
    //   971	1	8	localThrowable11	Throwable
    //   986	1	8	localThrowable12	Throwable
    //   991	1	8	localThrowable13	Throwable
    //   1019	1	8	localThrowable14	Throwable
    //   1022	91	8	localObject4	Object
    //   1125	1	8	localThrowable15	Throwable
    //   1130	1	8	localThrowable16	Throwable
    //   1145	1	8	localThrowable17	Throwable
    //   1150	1	8	localThrowable18	Throwable
    //   1155	1	8	localThrowable19	Throwable
    //   1160	1	8	localThrowable20	Throwable
    //   20	844	9	localObject5	Object
    //   926	1	9	localThrowable21	Throwable
    //   936	1	9	localThrowable22	Throwable
    //   946	1	9	localThrowable23	Throwable
    //   956	1	9	localThrowable24	Throwable
    //   981	1	9	localThrowable25	Throwable
    //   1014	1	9	localThrowable26	Throwable
    //   1028	1	9	localObject6	Object
    //   1036	1	9	localThrowable27	Throwable
    //   1046	71	9	localObject7	Object
    //   14	880	10	localObject8	Object
    //   921	1	10	localThrowable28	Throwable
    //   931	1	10	localThrowable29	Throwable
    //   941	1	10	localThrowable30	Throwable
    //   951	1	10	localThrowable31	Throwable
    //   966	1	10	localThrowable32	Throwable
    //   996	8	10	localObject9	Object
    //   1009	41	10	localObject10	Object
    //   1058	1	10	localThrowable33	Throwable
    //   1065	56	10	localObject11	Object
    //   1135	1	10	localThrowable34	Throwable
    //   1140	1	10	localThrowable35	Throwable
    //   1	853	11	localObject12	Object
    //   961	1	11	localThrowable36	Throwable
    //   976	1	11	localThrowable37	Throwable
    //   1005	84	11	localObject13	Object
    //   1093	1	11	localThrowable38	Throwable
    //   1108	1	11	localObject14	Object
    //   10	585	12	localObject15	Object
    //   610	1	12	localThrowable39	Throwable
    //   614	501	12	localObject16	Object
    //   7	579	13	arrayOfByte	byte[]
    //   830	10	13	localObject17	Object
    //   1001	7	13	localObject18	Object
    //   1061	58	13	localObject19	Object
    //   244	867	14	localHttpResponse	org.apache.http.HttpResponse
    // Exception table:
    //   from	to	target	type
    //   148	156	156	java/lang/Throwable
    //   321	329	329	java/lang/Throwable
    //   424	432	432	java/lang/Throwable
    //   545	552	610	java/lang/Throwable
    //   556	563	610	java/lang/Throwable
    //   567	575	610	java/lang/Throwable
    //   583	592	610	java/lang/Throwable
    //   596	607	610	java/lang/Throwable
    //   689	694	610	java/lang/Throwable
    //   698	704	610	java/lang/Throwable
    //   758	763	765	java/lang/Throwable
    //   817	822	825	java/lang/Throwable
    //   16	22	830	finally
    //   89	95	830	finally
    //   165	170	830	finally
    //   174	183	830	finally
    //   187	200	830	finally
    //   39	47	896	java/lang/Throwable
    //   51	59	901	java/lang/Throwable
    //   75	83	906	java/lang/Throwable
    //   112	120	911	java/lang/Throwable
    //   124	132	916	java/lang/Throwable
    //   284	292	921	java/lang/Throwable
    //   297	302	926	java/lang/Throwable
    //   387	395	931	java/lang/Throwable
    //   400	405	936	java/lang/Throwable
    //   723	728	941	java/lang/Throwable
    //   733	738	946	java/lang/Throwable
    //   782	787	951	java/lang/Throwable
    //   792	797	956	java/lang/Throwable
    //   642	647	961	java/lang/Throwable
    //   652	657	966	java/lang/Throwable
    //   677	682	971	java/lang/Throwable
    //   853	858	976	java/lang/Throwable
    //   863	868	981	java/lang/Throwable
    //   888	893	986	java/lang/Throwable
    //   873	883	991	java/lang/Throwable
    //   200	206	996	finally
    //   213	237	996	finally
    //   237	259	996	finally
    //   333	347	996	finally
    //   361	369	996	finally
    //   436	444	996	finally
    //   451	482	996	finally
    //   482	497	996	finally
    //   501	508	1001	finally
    //   512	523	1001	finally
    //   527	541	1001	finally
    //   545	552	1001	finally
    //   556	563	1001	finally
    //   567	575	1001	finally
    //   583	592	1001	finally
    //   596	607	1001	finally
    //   689	694	1001	finally
    //   698	704	1001	finally
    //   662	672	1014	java/lang/Throwable
    //   16	22	1019	java/lang/Throwable
    //   89	95	1019	java/lang/Throwable
    //   165	170	1019	java/lang/Throwable
    //   174	183	1019	java/lang/Throwable
    //   187	200	1036	java/lang/Throwable
    //   200	206	1058	java/lang/Throwable
    //   213	237	1058	java/lang/Throwable
    //   237	259	1058	java/lang/Throwable
    //   333	347	1058	java/lang/Throwable
    //   361	369	1058	java/lang/Throwable
    //   482	497	1058	java/lang/Throwable
    //   501	508	1093	java/lang/Throwable
    //   512	523	1093	java/lang/Throwable
    //   527	541	1093	java/lang/Throwable
    //   802	812	1125	java/lang/Throwable
    //   743	753	1130	java/lang/Throwable
    //   451	482	1135	java/lang/Throwable
    //   436	444	1140	java/lang/Throwable
    //   410	420	1145	java/lang/Throwable
    //   307	317	1150	java/lang/Throwable
    //   136	144	1155	java/lang/Throwable
    //   63	71	1160	java/lang/Throwable
  }
  
  public long b()
  {
    return this.b;
  }
  
  public int c()
  {
    try
    {
      long l = this.c;
      if (l > 0L)
      {
        l = this.b * 100L / l;
        return (int)l;
      }
    }
    catch (Throwable localThrowable) {}
    return 0;
  }
  
  public long d()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.c
 * JD-Core Version:    0.7.0.1
 */