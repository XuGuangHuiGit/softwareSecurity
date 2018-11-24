package net.youmi.android.d.a;

import android.content.Context;
import android.util.SparseArray;
import java.io.File;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.j;
import net.youmi.android.a.h.o;
import net.youmi.android.c.k.h;

public class a
  extends net.youmi.android.a.f.a
{
  private static a d;
  e a = new e(this);
  d b;
  private SparseArray e = new SparseArray();
  private SparseArray f = new SparseArray();
  
  public a(Context paramContext)
  {
    super(paramContext);
    a(this.a);
    this.b = new d(this.c, this);
    a(this.b);
  }
  
  private String a(File paramFile)
  {
    if (paramFile != null) {
      try
      {
        if ((paramFile.exists()) && (paramFile.getAbsolutePath().contains(this.c.getFilesDir().getAbsolutePath())))
        {
          net.youmi.android.c.k.e.a(paramFile, "664");
          paramFile = paramFile.getAbsolutePath();
          return paramFile;
        }
      }
      catch (Throwable paramFile) {}
    }
    return null;
  }
  
  public static a a(Context paramContext)
  {
    try
    {
      if (d == null) {
        d = new a(paramContext);
      }
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  private void a(String paramString, i parami, net.youmi.android.e.b.b paramb)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_2
    //   6: invokevirtual 91	net/youmi/android/a/h/i:e	()Lnet/youmi/android/a/a/a/a;
    //   9: astore 6
    //   11: aload 6
    //   13: ifnull -9 -> 4
    //   16: aload 6
    //   18: invokevirtual 97	net/youmi/android/a/a/a/a:g	()Lnet/youmi/android/a/a/a/g;
    //   21: astore 6
    //   23: aload 6
    //   25: ifnull -21 -> 4
    //   28: aload 6
    //   30: invokevirtual 101	net/youmi/android/a/a/a/g:c	()Ljava/lang/String;
    //   33: astore 6
    //   35: aload 6
    //   37: ifnull -33 -> 4
    //   40: aload_2
    //   41: invokevirtual 104	net/youmi/android/a/h/i:f	()Lnet/youmi/android/a/h/j;
    //   44: astore 7
    //   46: new 106	net/youmi/android/a/a/a
    //   49: dup
    //   50: aload 6
    //   52: invokestatic 111	net/youmi/android/d/a/i:b	()Lnet/youmi/android/d/a/i;
    //   55: invokespecial 114	net/youmi/android/a/a/a:<init>	(Ljava/lang/String;Lnet/youmi/android/a/a/b;)V
    //   58: astore 6
    //   60: aload 7
    //   62: ifnull +18 -> 80
    //   65: aload 7
    //   67: invokevirtual 118	net/youmi/android/a/h/j:e	()Z
    //   70: ifeq +10 -> 80
    //   73: aload 6
    //   75: aload 7
    //   77: invokevirtual 121	net/youmi/android/a/a/a:a	(Lnet/youmi/android/a/h/j;)V
    //   80: aload 6
    //   82: aload_2
    //   83: invokevirtual 123	net/youmi/android/a/h/i:d	()Z
    //   86: invokevirtual 126	net/youmi/android/a/a/a:b	(Z)V
    //   89: aload 6
    //   91: aload_2
    //   92: invokevirtual 128	net/youmi/android/a/h/i:a	()Ljava/lang/String;
    //   95: invokevirtual 131	net/youmi/android/a/a/a:a	(Ljava/lang/String;)V
    //   98: aload 6
    //   100: invokestatic 137	java/lang/System:currentTimeMillis	()J
    //   103: invokevirtual 140	net/youmi/android/a/a/a:a	(J)V
    //   106: aload 6
    //   108: aload_2
    //   109: invokevirtual 142	net/youmi/android/a/h/i:g	()Z
    //   112: invokevirtual 144	net/youmi/android/a/a/a:a	(Z)V
    //   115: aload 6
    //   117: aload_2
    //   118: invokevirtual 146	net/youmi/android/a/h/i:b	()Ljava/lang/String;
    //   121: invokevirtual 148	net/youmi/android/a/a/a:c	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: ifnull +9 -> 134
    //   128: aload 6
    //   130: aload_1
    //   131: invokevirtual 150	net/youmi/android/a/a/a:b	(Ljava/lang/String;)V
    //   134: aload_3
    //   135: invokestatic 153	net/youmi/android/d/a/d:c	(Lnet/youmi/android/e/b/b;)I
    //   138: istore 4
    //   140: aload_3
    //   141: invokestatic 155	net/youmi/android/d/a/a:f	(Lnet/youmi/android/e/b/b;)I
    //   144: istore 5
    //   146: new 157	net/youmi/android/d/a/h
    //   149: dup
    //   150: invokespecial 158	net/youmi/android/d/a/h:<init>	()V
    //   153: astore_1
    //   154: aload_1
    //   155: iload 4
    //   157: invokevirtual 161	net/youmi/android/d/a/h:a	(I)V
    //   160: aload_1
    //   161: iload 5
    //   163: invokevirtual 163	net/youmi/android/d/a/h:b	(I)V
    //   166: aload 6
    //   168: aload_1
    //   169: invokevirtual 166	net/youmi/android/a/a/a:a	(Lnet/youmi/android/a/a/c;)V
    //   172: aload_0
    //   173: getfield 42	net/youmi/android/d/a/a:c	Landroid/content/Context;
    //   176: invokestatic 171	net/youmi/android/a/a/d:a	(Landroid/content/Context;)Lnet/youmi/android/a/a/d;
    //   179: aload_0
    //   180: getfield 42	net/youmi/android/d/a/a:c	Landroid/content/Context;
    //   183: aload 6
    //   185: invokevirtual 174	net/youmi/android/a/a/d:a	(Landroid/content/Context;Lnet/youmi/android/a/a/a;)Z
    //   188: pop
    //   189: return
    //   190: astore_1
    //   191: return
    //   192: astore_1
    //   193: goto -59 -> 134
    //   196: astore_1
    //   197: goto -25 -> 172
    //   200: astore_2
    //   201: goto -77 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	a
    //   0	204	1	paramString	String
    //   0	204	2	parami	i
    //   0	204	3	paramb	net.youmi.android.e.b.b
    //   138	18	4	i	int
    //   144	18	5	j	int
    //   9	175	6	localObject	Object
    //   44	32	7	localj	j
    // Exception table:
    //   from	to	target	type
    //   5	11	190	java/lang/Throwable
    //   16	23	190	java/lang/Throwable
    //   28	35	190	java/lang/Throwable
    //   40	60	190	java/lang/Throwable
    //   65	80	190	java/lang/Throwable
    //   80	115	190	java/lang/Throwable
    //   172	189	190	java/lang/Throwable
    //   128	134	192	java/lang/Throwable
    //   134	172	196	java/lang/Throwable
    //   115	124	200	java/lang/Throwable
  }
  
  private void b(File paramFile)
  {
    try
    {
      h.g(this.c, paramFile.getPath());
      return;
    }
    catch (Throwable paramFile) {}
  }
  
  private void d()
  {
    f.a(this.c);
  }
  
  private void d(String paramString)
  {
    net.youmi.android.c.j.a.a().a(new b(this, paramString));
  }
  
  public static int f(net.youmi.android.e.b.b paramb)
  {
    if (paramb != null) {
      try
      {
        if (paramb.f() != null)
        {
          int i = paramb.f().hashCode();
          return i;
        }
      }
      catch (Throwable paramb) {}
    }
    return 0;
  }
  
  private j l(net.youmi.android.e.b.b paramb)
  {
    if (paramb == null) {
      return null;
    }
    try
    {
      paramb = paramb.f();
      if (paramb == null) {
        return null;
      }
      paramb = (i)this.f.get(paramb.hashCode());
      if (paramb != null)
      {
        paramb = paramb.f();
        return paramb;
      }
    }
    catch (Throwable paramb) {}
    return null;
  }
  
  public void a(int paramInt)
  {
    try
    {
      i locali = (i)this.f.get(paramInt);
      o localo = (o)this.e.get(paramInt);
      this.a.a(locali, localo);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void a(i parami, o paramo)
  {
    if (parami == null) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = parami.e();
        if (localObject != null)
        {
          net.youmi.android.a.a.a.d locald = ((net.youmi.android.a.a.a.a)localObject).l();
          if (locald != null)
          {
            localObject = locald.c();
            if (locald.c() != null)
            {
              this.f.put(((String)localObject).hashCode(), parami);
              if (paramo != null) {
                this.e.put(((String)localObject).hashCode(), paramo);
              }
              parami = locald.d();
              if (parami != null)
              {
                a((String)localObject, parami);
                return;
              }
              a((String)localObject);
              return;
            }
          }
        }
      }
      catch (Throwable parami) {}
    }
  }
  
  /* Error */
  protected void a(net.youmi.android.e.b.b paramb, File paramFile)
  {
    // Byte code:
    //   0: ldc 240
    //   2: astore 4
    //   4: aload_0
    //   5: aload_2
    //   6: invokespecial 242	net/youmi/android/d/a/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   9: astore 6
    //   11: aload 4
    //   13: astore 5
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 245	net/youmi/android/d/a/a:e	(Lnet/youmi/android/e/b/b;)Lnet/youmi/android/a/h/i;
    //   20: astore 7
    //   22: aload 4
    //   24: astore_3
    //   25: aload 7
    //   27: ifnull +68 -> 95
    //   30: aload 4
    //   32: astore 5
    //   34: aload 7
    //   36: invokevirtual 104	net/youmi/android/a/h/i:f	()Lnet/youmi/android/a/h/j;
    //   39: astore 8
    //   41: aload 4
    //   43: astore_3
    //   44: aload 8
    //   46: ifnull +37 -> 83
    //   49: new 247	net/youmi/android/d/d/a/d
    //   52: dup
    //   53: aload_0
    //   54: getfield 42	net/youmi/android/d/a/a:c	Landroid/content/Context;
    //   57: aload 8
    //   59: iconst_2
    //   60: newarray int
    //   62: dup
    //   63: iconst_0
    //   64: iconst_2
    //   65: iastore
    //   66: dup
    //   67: iconst_1
    //   68: bipush 7
    //   70: iastore
    //   71: invokespecial 250	net/youmi/android/d/d/a/d:<init>	(Landroid/content/Context;Lnet/youmi/android/a/h/j;[I)V
    //   74: invokevirtual 253	net/youmi/android/d/d/a/d:start	()V
    //   77: aload 7
    //   79: invokevirtual 254	net/youmi/android/a/h/i:c	()Ljava/lang/String;
    //   82: astore_3
    //   83: aload_3
    //   84: astore 5
    //   86: aload_0
    //   87: aload 6
    //   89: aload 7
    //   91: aload_1
    //   92: invokespecial 256	net/youmi/android/d/a/a:a	(Ljava/lang/String;Lnet/youmi/android/a/h/i;Lnet/youmi/android/e/b/b;)V
    //   95: aload_0
    //   96: invokespecial 258	net/youmi/android/d/a/a:d	()V
    //   99: aload_0
    //   100: aload_2
    //   101: invokespecial 260	net/youmi/android/d/a/a:b	(Ljava/io/File;)V
    //   104: aload_0
    //   105: aload_3
    //   106: invokespecial 262	net/youmi/android/d/a/a:d	(Ljava/lang/String;)V
    //   109: return
    //   110: astore_1
    //   111: return
    //   112: astore_1
    //   113: aload 5
    //   115: astore_3
    //   116: goto -21 -> 95
    //   119: astore_3
    //   120: aload 4
    //   122: astore_3
    //   123: goto -40 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	a
    //   0	126	1	paramb	net.youmi.android.e.b.b
    //   0	126	2	paramFile	File
    //   24	92	3	localObject1	Object
    //   119	1	3	localThrowable	Throwable
    //   122	1	3	str1	String
    //   2	119	4	str2	String
    //   13	101	5	localObject2	Object
    //   9	79	6	str3	String
    //   20	70	7	locali	i
    //   39	19	8	localj	j
    // Exception table:
    //   from	to	target	type
    //   4	11	110	java/lang/Throwable
    //   95	109	110	java/lang/Throwable
    //   15	22	112	java/lang/Throwable
    //   34	41	112	java/lang/Throwable
    //   86	95	112	java/lang/Throwable
    //   49	83	119	java/lang/Throwable
  }
  
  @Deprecated
  public boolean a(String paramString)
  {
    return super.a(paramString);
  }
  
  @Deprecated
  public boolean a(String paramString1, String paramString2)
  {
    return super.a(paramString1, paramString2);
  }
  
  protected void b(net.youmi.android.e.b.b paramb)
  {
    try
    {
      paramb = l(paramb);
      if (paramb != null) {
        new net.youmi.android.d.d.a.d(this.c, paramb, 6).start();
      }
      return;
    }
    catch (Throwable paramb) {}
  }
  
  /* Error */
  protected void b(net.youmi.android.e.b.b paramb, File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokespecial 242	net/youmi/android/d/a/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   5: astore 5
    //   7: ldc 240
    //   9: astore 4
    //   11: aload 4
    //   13: astore_3
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 245	net/youmi/android/d/a/a:e	(Lnet/youmi/android/e/b/b;)Lnet/youmi/android/a/h/i;
    //   19: astore 6
    //   21: aload 4
    //   23: astore_3
    //   24: aload 6
    //   26: ifnull +61 -> 87
    //   29: aload 4
    //   31: astore_3
    //   32: aload 6
    //   34: invokevirtual 104	net/youmi/android/a/h/i:f	()Lnet/youmi/android/a/h/j;
    //   37: astore 7
    //   39: aload 4
    //   41: astore_3
    //   42: aload 6
    //   44: invokevirtual 254	net/youmi/android/a/h/i:c	()Ljava/lang/String;
    //   47: astore 4
    //   49: aload 7
    //   51: ifnull +21 -> 72
    //   54: new 247	net/youmi/android/d/d/a/d
    //   57: dup
    //   58: aload_0
    //   59: getfield 42	net/youmi/android/d/a/a:c	Landroid/content/Context;
    //   62: aload 7
    //   64: bipush 7
    //   66: invokespecial 272	net/youmi/android/d/d/a/d:<init>	(Landroid/content/Context;Lnet/youmi/android/a/h/j;I)V
    //   69: invokevirtual 253	net/youmi/android/d/d/a/d:start	()V
    //   72: aload 4
    //   74: astore_3
    //   75: aload_0
    //   76: aload 5
    //   78: aload 6
    //   80: aload_1
    //   81: invokespecial 256	net/youmi/android/d/a/a:a	(Ljava/lang/String;Lnet/youmi/android/a/h/i;Lnet/youmi/android/e/b/b;)V
    //   84: aload 4
    //   86: astore_3
    //   87: aload_0
    //   88: invokespecial 258	net/youmi/android/d/a/a:d	()V
    //   91: aload_0
    //   92: aload_2
    //   93: invokespecial 260	net/youmi/android/d/a/a:b	(Ljava/io/File;)V
    //   96: aload_0
    //   97: aload_3
    //   98: invokespecial 262	net/youmi/android/d/a/a:d	(Ljava/lang/String;)V
    //   101: return
    //   102: astore_1
    //   103: return
    //   104: astore_1
    //   105: goto -18 -> 87
    //   108: astore_3
    //   109: goto -37 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	a
    //   0	112	1	paramb	net.youmi.android.e.b.b
    //   0	112	2	paramFile	File
    //   13	85	3	str1	String
    //   108	1	3	localThrowable	Throwable
    //   9	76	4	str2	String
    //   5	72	5	str3	String
    //   19	60	6	locali	i
    //   37	26	7	localj	j
    // Exception table:
    //   from	to	target	type
    //   0	7	102	java/lang/Throwable
    //   87	101	102	java/lang/Throwable
    //   14	21	104	java/lang/Throwable
    //   32	39	104	java/lang/Throwable
    //   42	49	104	java/lang/Throwable
    //   75	84	104	java/lang/Throwable
    //   54	72	108	java/lang/Throwable
  }
  
  protected void c(net.youmi.android.e.b.b paramb) {}
  
  o d(net.youmi.android.e.b.b paramb)
  {
    if (paramb == null) {}
    while (paramb.f() == null) {
      return null;
    }
    return (o)this.e.get(paramb.f().hashCode());
  }
  
  i e(net.youmi.android.e.b.b paramb)
  {
    if (paramb == null) {}
    while (paramb.f() == null) {
      return null;
    }
    return (i)this.f.get(paramb.f().hashCode());
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.a
 * JD-Core Version:    0.7.0.1
 */