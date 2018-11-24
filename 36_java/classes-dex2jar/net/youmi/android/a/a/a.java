package net.youmi.android.a.a;

import net.youmi.android.a.h.j;

public class a
  implements net.youmi.android.e.a.a
{
  private String a;
  private String b;
  private b c;
  private c d;
  private String e;
  private boolean f = false;
  private String g;
  private long h;
  private String i;
  private long j = 480000L;
  private boolean k = true;
  private j l;
  private String m;
  
  public a(String paramString, b paramb)
  {
    paramString = net.youmi.android.c.b.e.b(paramString);
    if (paramString == null) {
      throw new NullPointerException("packageName is null");
    }
    this.a = paramString;
    this.b = e(paramString);
    this.c = paramb;
  }
  
  public static String e(String paramString)
  {
    return net.youmi.android.c.c.e.a(paramString);
  }
  
  public String a()
  {
    return this.m;
  }
  
  public void a(long paramLong)
  {
    this.h = paramLong;
  }
  
  public void a(String paramString)
  {
    this.m = paramString;
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
  }
  
  public void a(j paramj)
  {
    this.l = paramj;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean b()
  {
    return this.k;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public void c(String paramString)
  {
    this.i = paramString;
  }
  
  public String d()
  {
    return this.i;
  }
  
  /* Error */
  public boolean d(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 89	net/youmi/android/c/b/b:a	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_1
    //   12: ldc 90
    //   14: aconst_null
    //   15: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull +294 -> 314
    //   23: aload_3
    //   24: ldc 95
    //   26: invokestatic 100	net/youmi/android/c/c/g:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull +283 -> 314
    //   34: aload_3
    //   35: aload_0
    //   36: getfield 52	net/youmi/android/a/a/a:a	Ljava/lang/String;
    //   39: invokevirtual 106	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   42: istore_2
    //   43: iload_2
    //   44: ifeq +270 -> 314
    //   47: aload_1
    //   48: ldc 107
    //   50: aconst_null
    //   51: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +19 -> 75
    //   59: aload_3
    //   60: ldc 95
    //   62: invokestatic 100	net/youmi/android/c/c/g:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +8 -> 75
    //   70: aload_0
    //   71: aload_3
    //   72: putfield 78	net/youmi/android/a/a/a:e	Ljava/lang/String;
    //   75: aload_0
    //   76: aload_1
    //   77: ldc 108
    //   79: aload_0
    //   80: getfield 110	net/youmi/android/a/a/a:g	Ljava/lang/String;
    //   83: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: putfield 110	net/youmi/android/a/a/a:g	Ljava/lang/String;
    //   89: aload_0
    //   90: aload_1
    //   91: ldc 111
    //   93: aload_0
    //   94: getfield 32	net/youmi/android/a/a/a:f	Z
    //   97: invokestatic 114	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    //   100: putfield 32	net/youmi/android/a/a/a:f	Z
    //   103: aload_0
    //   104: aload_1
    //   105: ldc 115
    //   107: aload_0
    //   108: getfield 38	net/youmi/android/a/a/a:k	Z
    //   111: invokestatic 114	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    //   114: putfield 38	net/youmi/android/a/a/a:k	Z
    //   117: aload_0
    //   118: aload_1
    //   119: ldc 116
    //   121: aload_0
    //   122: getfield 69	net/youmi/android/a/a/a:h	J
    //   125: invokestatic 119	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;J)J
    //   128: putfield 69	net/youmi/android/a/a/a:h	J
    //   131: aload_0
    //   132: aload_1
    //   133: ldc 120
    //   135: aconst_null
    //   136: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   139: putfield 81	net/youmi/android/a/a/a:i	Ljava/lang/String;
    //   142: aload_0
    //   143: aload_1
    //   144: ldc 121
    //   146: aconst_null
    //   147: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: putfield 66	net/youmi/android/a/a/a:m	Ljava/lang/String;
    //   153: aload_1
    //   154: ldc 122
    //   156: aconst_null
    //   157: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: astore_3
    //   161: aload_1
    //   162: ldc 123
    //   164: aconst_null
    //   165: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   168: astore 4
    //   170: aload_1
    //   171: ldc 124
    //   173: aconst_null
    //   174: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: astore 5
    //   179: aload_1
    //   180: ldc 125
    //   182: aconst_null
    //   183: invokestatic 93	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   186: astore 6
    //   188: new 127	net/youmi/android/a/h/j
    //   191: dup
    //   192: invokespecial 128	net/youmi/android/a/h/j:<init>	()V
    //   195: astore 7
    //   197: aload 7
    //   199: aload_3
    //   200: invokevirtual 130	net/youmi/android/a/h/j:a	(Ljava/lang/String;)V
    //   203: aload 7
    //   205: aload 5
    //   207: invokevirtual 132	net/youmi/android/a/h/j:c	(Ljava/lang/String;)V
    //   210: aload 7
    //   212: aload 4
    //   214: invokevirtual 134	net/youmi/android/a/h/j:b	(Ljava/lang/String;)V
    //   217: aload 7
    //   219: aload 6
    //   221: invokevirtual 136	net/youmi/android/a/h/j:d	(Ljava/lang/String;)V
    //   224: aload 7
    //   226: invokevirtual 138	net/youmi/android/a/h/j:e	()Z
    //   229: ifeq +9 -> 238
    //   232: aload_0
    //   233: aload 7
    //   235: putfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   238: aload_0
    //   239: getfield 58	net/youmi/android/a/a/a:c	Lnet/youmi/android/a/a/b;
    //   242: ifnull +31 -> 273
    //   245: aload_1
    //   246: ldc 139
    //   248: aconst_null
    //   249: invokestatic 142	net/youmi/android/c/b/b:a	(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   252: astore_1
    //   253: aload_1
    //   254: ifnull +19 -> 273
    //   257: aload_0
    //   258: aload_0
    //   259: getfield 58	net/youmi/android/a/a/a:c	Lnet/youmi/android/a/a/b;
    //   262: aload_1
    //   263: aload_0
    //   264: getfield 72	net/youmi/android/a/a/a:d	Lnet/youmi/android/a/a/c;
    //   267: invokevirtual 147	net/youmi/android/a/a/b:a	(Lorg/json/JSONObject;Lnet/youmi/android/a/a/c;)Lnet/youmi/android/a/a/c;
    //   270: putfield 72	net/youmi/android/a/a/a:d	Lnet/youmi/android/a/a/c;
    //   273: iconst_1
    //   274: ireturn
    //   275: astore_1
    //   276: iconst_0
    //   277: ireturn
    //   278: astore_1
    //   279: goto -6 -> 273
    //   282: astore_3
    //   283: goto -45 -> 238
    //   286: astore_3
    //   287: goto -134 -> 153
    //   290: astore_3
    //   291: goto -149 -> 142
    //   294: astore_3
    //   295: goto -164 -> 131
    //   298: astore_3
    //   299: goto -182 -> 117
    //   302: astore_3
    //   303: goto -200 -> 103
    //   306: astore_3
    //   307: goto -218 -> 89
    //   310: astore_3
    //   311: goto -236 -> 75
    //   314: iconst_0
    //   315: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	316	0	this	a
    //   0	316	1	paramString	String
    //   42	2	2	bool	boolean
    //   18	182	3	str1	String
    //   282	1	3	localThrowable1	java.lang.Throwable
    //   286	1	3	localThrowable2	java.lang.Throwable
    //   290	1	3	localThrowable3	java.lang.Throwable
    //   294	1	3	localThrowable4	java.lang.Throwable
    //   298	1	3	localThrowable5	java.lang.Throwable
    //   302	1	3	localThrowable6	java.lang.Throwable
    //   306	1	3	localThrowable7	java.lang.Throwable
    //   310	1	3	localThrowable8	java.lang.Throwable
    //   168	45	4	str2	String
    //   177	29	5	str3	String
    //   186	34	6	str4	String
    //   195	39	7	localj	j
    // Exception table:
    //   from	to	target	type
    //   0	5	275	java/lang/Throwable
    //   11	19	275	java/lang/Throwable
    //   23	30	275	java/lang/Throwable
    //   34	43	275	java/lang/Throwable
    //   238	253	278	java/lang/Throwable
    //   257	273	278	java/lang/Throwable
    //   153	238	282	java/lang/Throwable
    //   142	153	286	java/lang/Throwable
    //   131	142	290	java/lang/Throwable
    //   117	131	294	java/lang/Throwable
    //   103	117	298	java/lang/Throwable
    //   89	103	302	java/lang/Throwable
    //   75	89	306	java/lang/Throwable
    //   47	55	310	java/lang/Throwable
    //   59	66	310	java/lang/Throwable
    //   70	75	310	java/lang/Throwable
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public c f()
  {
    return this.d;
  }
  
  public j g()
  {
    return this.l;
  }
  
  /* Error */
  public String h()
  {
    // Byte code:
    //   0: new 151	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 152	org/json/JSONObject:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: ldc 90
    //   11: aload_0
    //   12: getfield 52	net/youmi/android/a/a/a:a	Ljava/lang/String;
    //   15: ldc 95
    //   17: invokestatic 154	net/youmi/android/c/c/g:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   20: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   23: pop
    //   24: aload_0
    //   25: getfield 78	net/youmi/android/a/a/a:e	Ljava/lang/String;
    //   28: ifnull +19 -> 47
    //   31: aload_2
    //   32: ldc 107
    //   34: aload_0
    //   35: getfield 78	net/youmi/android/a/a/a:e	Ljava/lang/String;
    //   38: ldc 95
    //   40: invokestatic 154	net/youmi/android/c/c/g:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   43: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   46: pop
    //   47: aload_0
    //   48: getfield 110	net/youmi/android/a/a/a:g	Ljava/lang/String;
    //   51: ifnull +14 -> 65
    //   54: aload_2
    //   55: ldc 108
    //   57: aload_0
    //   58: getfield 110	net/youmi/android/a/a/a:g	Ljava/lang/String;
    //   61: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   64: pop
    //   65: aload_2
    //   66: ldc 111
    //   68: aload_0
    //   69: getfield 32	net/youmi/android/a/a/a:f	Z
    //   72: invokevirtual 161	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   75: pop
    //   76: aload_2
    //   77: ldc 116
    //   79: aload_0
    //   80: getfield 69	net/youmi/android/a/a/a:h	J
    //   83: invokevirtual 164	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   86: pop
    //   87: aload_0
    //   88: getfield 72	net/youmi/android/a/a/a:d	Lnet/youmi/android/a/a/c;
    //   91: astore_3
    //   92: aload_3
    //   93: ifnull +25 -> 118
    //   96: aload_0
    //   97: getfield 72	net/youmi/android/a/a/a:d	Lnet/youmi/android/a/a/c;
    //   100: invokeinterface 169 1 0
    //   105: astore_3
    //   106: aload_3
    //   107: ifnull +11 -> 118
    //   110: aload_2
    //   111: ldc 139
    //   113: aload_3
    //   114: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   117: pop
    //   118: aload_0
    //   119: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   122: ifnull +71 -> 193
    //   125: aload_0
    //   126: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   129: invokevirtual 138	net/youmi/android/a/h/j:e	()Z
    //   132: istore_1
    //   133: iload_1
    //   134: ifeq +59 -> 193
    //   137: aload_2
    //   138: ldc 122
    //   140: aload_0
    //   141: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   144: invokevirtual 171	net/youmi/android/a/h/j:a	()Ljava/lang/String;
    //   147: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   150: pop
    //   151: aload_2
    //   152: ldc 123
    //   154: aload_0
    //   155: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   158: invokevirtual 173	net/youmi/android/a/h/j:b	()Ljava/lang/String;
    //   161: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   164: pop
    //   165: aload_2
    //   166: ldc 124
    //   168: aload_0
    //   169: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   172: invokevirtual 175	net/youmi/android/a/h/j:c	()Ljava/lang/String;
    //   175: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   178: pop
    //   179: aload_2
    //   180: ldc 125
    //   182: aload_0
    //   183: getfield 75	net/youmi/android/a/a/a:l	Lnet/youmi/android/a/h/j;
    //   186: invokevirtual 177	net/youmi/android/a/h/j:d	()Ljava/lang/String;
    //   189: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   192: pop
    //   193: aload_2
    //   194: ldc 115
    //   196: aload_0
    //   197: getfield 38	net/youmi/android/a/a/a:k	Z
    //   200: invokevirtual 161	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   203: pop
    //   204: aload_2
    //   205: ldc 121
    //   207: aload_0
    //   208: getfield 66	net/youmi/android/a/a/a:m	Ljava/lang/String;
    //   211: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   214: pop
    //   215: aload_0
    //   216: getfield 81	net/youmi/android/a/a/a:i	Ljava/lang/String;
    //   219: ifnull +14 -> 233
    //   222: aload_2
    //   223: ldc 120
    //   225: aload_0
    //   226: getfield 81	net/youmi/android/a/a/a:i	Ljava/lang/String;
    //   229: invokevirtual 158	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   232: pop
    //   233: aload_2
    //   234: invokevirtual 180	org/json/JSONObject:toString	()Ljava/lang/String;
    //   237: astore_2
    //   238: aload_2
    //   239: areturn
    //   240: astore_2
    //   241: aconst_null
    //   242: areturn
    //   243: astore_3
    //   244: goto -11 -> 233
    //   247: astore_3
    //   248: goto -55 -> 193
    //   251: astore_3
    //   252: goto -134 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	this	a
    //   132	2	1	bool	boolean
    //   7	232	2	localObject1	Object
    //   240	1	2	localThrowable1	java.lang.Throwable
    //   91	23	3	localObject2	Object
    //   243	1	3	localThrowable2	java.lang.Throwable
    //   247	1	3	localThrowable3	java.lang.Throwable
    //   251	1	3	localThrowable4	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   0	47	240	java/lang/Throwable
    //   47	65	240	java/lang/Throwable
    //   65	92	240	java/lang/Throwable
    //   118	133	240	java/lang/Throwable
    //   193	215	240	java/lang/Throwable
    //   233	238	240	java/lang/Throwable
    //   215	233	243	java/lang/Throwable
    //   137	193	247	java/lang/Throwable
    //   96	106	251	java/lang/Throwable
    //   110	118	251	java/lang/Throwable
  }
  
  public long i()
  {
    return this.j;
  }
  
  public String j()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a
 * JD-Core Version:    0.7.0.1
 */