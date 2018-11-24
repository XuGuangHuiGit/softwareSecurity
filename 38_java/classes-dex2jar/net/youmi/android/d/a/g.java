package net.youmi.android.d.a;

import android.content.Context;
import net.youmi.android.c.b.e;
import net.youmi.android.c.k.d;

public class g
  extends net.youmi.android.d.d.a.a
  implements Runnable
{
  private static int c = 0;
  private String a;
  private Context b;
  private int d;
  private String e;
  
  public g(String paramString)
  {
    int i = c + 1;
    c = i;
    this.d = i;
    try
    {
      this.a = e.b(paramString);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  /* Error */
  public void a(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 41	java/lang/System:currentTimeMillis	()J
    //   3: pop2
    //   4: aload_0
    //   5: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   8: ifnonnull +4 -> 12
    //   11: return
    //   12: aload_1
    //   13: ifnull +372 -> 385
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 47	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   21: putfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   28: ifnull +357 -> 385
    //   31: aload_0
    //   32: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   35: invokestatic 54	net/youmi/android/a/a/d:a	(Landroid/content/Context;)Lnet/youmi/android/a/a/d;
    //   38: aload_0
    //   39: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   42: aload_0
    //   43: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   46: invokestatic 59	net/youmi/android/d/a/i:b	()Lnet/youmi/android/d/a/i;
    //   49: invokevirtual 62	net/youmi/android/a/a/d:a	(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/a/b;)Lnet/youmi/android/a/a/a;
    //   52: astore 4
    //   54: aload 4
    //   56: ifnull +329 -> 385
    //   59: aload 4
    //   61: invokevirtual 68	net/youmi/android/a/a/a:g	()Lnet/youmi/android/a/h/j;
    //   64: astore_3
    //   65: aload_3
    //   66: ifnull +26 -> 92
    //   69: aload_0
    //   70: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   73: aload_3
    //   74: iconst_3
    //   75: invokestatic 73	net/youmi/android/d/b/a:a	(Landroid/content/Context;Lnet/youmi/android/a/h/j;I)Ljava/lang/String;
    //   78: astore_3
    //   79: aload_3
    //   80: ifnull +305 -> 385
    //   83: aload_0
    //   84: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   87: aload_3
    //   88: invokestatic 76	net/youmi/android/d/b/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   91: pop
    //   92: aload 4
    //   94: invokevirtual 79	net/youmi/android/a/a/a:c	()Ljava/lang/String;
    //   97: ifnull +28 -> 125
    //   100: new 81	java/io/File
    //   103: dup
    //   104: aload 4
    //   106: invokevirtual 79	net/youmi/android/a/a/a:c	()Ljava/lang/String;
    //   109: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   112: astore_3
    //   113: aload_3
    //   114: invokevirtual 87	java/io/File:exists	()Z
    //   117: ifeq +8 -> 125
    //   120: aload_3
    //   121: invokevirtual 90	java/io/File:delete	()Z
    //   124: pop
    //   125: aload 4
    //   127: invokevirtual 92	net/youmi/android/a/a/a:b	()Z
    //   130: ifeq +15 -> 145
    //   133: aload_0
    //   134: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   137: aload_0
    //   138: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   141: invokestatic 97	net/youmi/android/c/k/f:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   144: pop
    //   145: aload 4
    //   147: invokevirtual 99	net/youmi/android/a/a/a:d	()Ljava/lang/String;
    //   150: ifnull +20 -> 170
    //   153: aload_0
    //   154: aload 4
    //   156: invokevirtual 99	net/youmi/android/a/a/a:d	()Ljava/lang/String;
    //   159: putfield 101	net/youmi/android/d/a/g:e	Ljava/lang/String;
    //   162: invokestatic 106	net/youmi/android/c/j/a:a	()Lnet/youmi/android/c/j/a;
    //   165: aload_0
    //   166: invokevirtual 109	net/youmi/android/c/j/a:a	(Ljava/lang/Runnable;)Z
    //   169: pop
    //   170: invokestatic 41	java/lang/System:currentTimeMillis	()J
    //   173: pop2
    //   174: aload 4
    //   176: invokevirtual 113	net/youmi/android/a/a/a:f	()Lnet/youmi/android/a/a/c;
    //   179: astore_3
    //   180: aload_3
    //   181: ifnull +199 -> 380
    //   184: aload_3
    //   185: instanceof 115
    //   188: ifeq +192 -> 380
    //   191: aload_3
    //   192: checkcast 115	net/youmi/android/d/a/h
    //   195: astore_3
    //   196: aload_3
    //   197: ifnull +178 -> 375
    //   200: aload_3
    //   201: invokevirtual 118	net/youmi/android/d/a/h:b	()I
    //   204: istore_2
    //   205: invokestatic 123	net/youmi/android/AdManager:getTipsDisplayOnNotificationAfterInstall	()Z
    //   208: ifeq +92 -> 300
    //   211: aload_0
    //   212: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   215: iload_2
    //   216: aload_0
    //   217: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   220: invokestatic 128	net/youmi/android/d/a/d:a	(Landroid/content/Context;ILjava/lang/String;)V
    //   223: invokestatic 41	java/lang/System:currentTimeMillis	()J
    //   226: pop2
    //   227: aload_3
    //   228: ifnull +142 -> 370
    //   231: aload_3
    //   232: invokevirtual 130	net/youmi/android/d/a/h:c	()I
    //   235: istore_2
    //   236: aload_0
    //   237: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   240: invokestatic 135	net/youmi/android/d/a/a:a	(Landroid/content/Context;)Lnet/youmi/android/d/a/a;
    //   243: iload_2
    //   244: invokevirtual 138	net/youmi/android/d/a/a:a	(I)V
    //   247: aload 4
    //   249: invokevirtual 140	net/youmi/android/a/a/a:e	()Z
    //   252: ifeq +24 -> 276
    //   255: aload 4
    //   257: invokevirtual 142	net/youmi/android/a/a/a:a	()Ljava/lang/String;
    //   260: astore_1
    //   261: aload_1
    //   262: ifnull +60 -> 322
    //   265: aload_0
    //   266: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   269: aload_1
    //   270: ldc 143
    //   272: invokestatic 146	net/youmi/android/c/k/f:a	(Landroid/content/Context;Ljava/lang/String;I)Z
    //   275: pop
    //   276: aload_0
    //   277: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   280: invokestatic 54	net/youmi/android/a/a/d:a	(Landroid/content/Context;)Lnet/youmi/android/a/a/d;
    //   283: aload_0
    //   284: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   287: invokevirtual 149	net/youmi/android/a/a/d:a	(Ljava/lang/String;)Z
    //   290: pop
    //   291: return
    //   292: astore_1
    //   293: return
    //   294: astore_3
    //   295: aconst_null
    //   296: astore_3
    //   297: goto -101 -> 196
    //   300: aload_1
    //   301: ldc 151
    //   303: invokevirtual 155	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   306: checkcast 157	android/app/NotificationManager
    //   309: astore_1
    //   310: aload_1
    //   311: iload_2
    //   312: invokevirtual 160	android/app/NotificationManager:cancel	(I)V
    //   315: goto -92 -> 223
    //   318: astore_1
    //   319: goto -96 -> 223
    //   322: aload_0
    //   323: getfield 49	net/youmi/android/d/a/g:b	Landroid/content/Context;
    //   326: aload_0
    //   327: getfield 34	net/youmi/android/d/a/g:a	Ljava/lang/String;
    //   330: invokestatic 162	net/youmi/android/c/k/f:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   333: pop
    //   334: goto -58 -> 276
    //   337: astore_1
    //   338: goto -62 -> 276
    //   341: astore_1
    //   342: aload_1
    //   343: athrow
    //   344: astore_1
    //   345: return
    //   346: astore_1
    //   347: goto -100 -> 247
    //   350: astore_1
    //   351: goto -128 -> 223
    //   354: astore_3
    //   355: goto -185 -> 170
    //   358: astore_3
    //   359: goto -214 -> 145
    //   362: astore_3
    //   363: goto -238 -> 125
    //   366: astore_3
    //   367: goto -275 -> 92
    //   370: iconst_0
    //   371: istore_2
    //   372: goto -136 -> 236
    //   375: iconst_0
    //   376: istore_2
    //   377: goto -172 -> 205
    //   380: aconst_null
    //   381: astore_3
    //   382: goto -186 -> 196
    //   385: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	this	g
    //   0	386	1	paramContext	Context
    //   204	173	2	i	int
    //   64	168	3	localObject1	java.lang.Object
    //   294	1	3	localThrowable1	Throwable
    //   296	1	3	localObject2	java.lang.Object
    //   354	1	3	localThrowable2	Throwable
    //   358	1	3	localThrowable3	Throwable
    //   362	1	3	localThrowable4	Throwable
    //   366	1	3	localThrowable5	Throwable
    //   381	1	3	localObject3	java.lang.Object
    //   52	204	4	locala	net.youmi.android.a.a.a
    // Exception table:
    //   from	to	target	type
    //   276	291	292	java/lang/Throwable
    //   174	180	294	java/lang/Throwable
    //   184	196	294	java/lang/Throwable
    //   310	315	318	java/lang/Throwable
    //   247	261	337	java/lang/Throwable
    //   265	276	337	java/lang/Throwable
    //   322	334	337	java/lang/Throwable
    //   4	11	341	finally
    //   16	54	341	finally
    //   59	65	341	finally
    //   69	79	341	finally
    //   83	92	341	finally
    //   92	125	341	finally
    //   125	145	341	finally
    //   145	170	341	finally
    //   170	174	341	finally
    //   174	180	341	finally
    //   184	196	341	finally
    //   200	205	341	finally
    //   205	223	341	finally
    //   223	227	341	finally
    //   231	236	341	finally
    //   236	247	341	finally
    //   247	261	341	finally
    //   265	276	341	finally
    //   276	291	341	finally
    //   300	310	341	finally
    //   310	315	341	finally
    //   322	334	341	finally
    //   4	11	344	java/lang/Throwable
    //   16	54	344	java/lang/Throwable
    //   59	65	344	java/lang/Throwable
    //   170	174	344	java/lang/Throwable
    //   223	227	344	java/lang/Throwable
    //   231	236	346	java/lang/Throwable
    //   236	247	346	java/lang/Throwable
    //   200	205	350	java/lang/Throwable
    //   205	223	350	java/lang/Throwable
    //   300	310	350	java/lang/Throwable
    //   145	170	354	java/lang/Throwable
    //   125	145	358	java/lang/Throwable
    //   92	125	362	java/lang/Throwable
    //   69	79	366	java/lang/Throwable
    //   83	92	366	java/lang/Throwable
  }
  
  public void run()
  {
    try
    {
      if (this.e == null) {
        return;
      }
      locala = new net.youmi.android.d.f.a(this.b);
      i = 0;
    }
    catch (Throwable localThrowable1)
    {
      net.youmi.android.d.f.a locala;
      int i;
      int j;
      label41:
      return;
    }
    try
    {
      j = d.a(this.b).b();
      i = (int)(j * 0.9D);
    }
    catch (Throwable localThrowable2)
    {
      break label41;
    }
    locala.a(this.e, 8000, i);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.g
 * JD-Core Version:    0.7.0.1
 */