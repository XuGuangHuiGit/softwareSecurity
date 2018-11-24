package net.youmi.android.e.b.a;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import net.youmi.android.e.b.b;
import net.youmi.android.e.b.f;
import net.youmi.android.e.b.h;

public abstract class c
  extends net.youmi.android.c.l.a
  implements net.youmi.android.e.b.e, f, h
{
  private HashSet a = new HashSet();
  private HashMap b = new HashMap();
  protected Context c;
  private HashMap d = new HashMap();
  private HashSet e;
  
  public c(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    this.e = new HashSet();
    d.a().a(this);
  }
  
  protected File a(b paramb, String paramString)
  {
    try
    {
      paramb = a(paramb).b(a().a(paramb, paramString));
      return paramb;
    }
    catch (Throwable paramb) {}
    return null;
  }
  
  protected abstract net.youmi.android.c.f.a a(b paramb);
  
  protected abstract net.youmi.android.e.b.d a();
  
  protected abstract void a(Object paramObject, b paramb);
  
  protected abstract void a(Object paramObject, b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3);
  
  protected abstract void a(Object paramObject, b paramb, File paramFile);
  
  public void a(g paramg)
  {
    try
    {
      if (this.a == null) {
        return;
      }
      if (paramg != null)
      {
        this.a.remove(paramg);
        return;
      }
    }
    catch (Throwable paramg) {}
  }
  
  public void a(g paramg, b paramb)
  {
    for (;;)
    {
      try
      {
        if (this.a == null) {
          return;
        }
        if (paramg == null) {
          return;
        }
        this.a.remove(paramg);
      }
      catch (Throwable paramg)
      {
        continue;
      }
      try
      {
        i(paramb);
        return;
      }
      catch (Throwable paramg) {}
    }
  }
  
  public final void a(g paramg, b paramb, String paramString1, String paramString2, String paramString3)
  {
    if (paramb != null) {}
    try
    {
      if ((paramb.c()) && (d.a().a(this.c, paramb, a(paramb, paramString2), this)))
      {
        this.e.add(paramb);
        this.d.put(paramb.f(), paramb);
        this.b.put(paramb.f(), paramb.b());
      }
      try
      {
        label71:
        this.a.remove(paramg);
        return;
      }
      catch (Throwable paramg) {}
    }
    catch (Throwable paramb)
    {
      break label71;
    }
  }
  
  public final void a(b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3)
  {
    if (paramb == null) {
      return;
    }
    for (;;)
    {
      for (;;)
      {
        try
        {
          boolean bool = this.e.contains(paramb);
          if (!bool) {
            break;
          }
        }
        catch (Throwable localThrowable1)
        {
          List localList;
          int i;
          int j;
          Object localObject;
          continue;
        }
        try
        {
          localList = b();
          i = 0;
          j = localList.size();
          if (i >= j) {
            break;
          }
        }
        catch (Throwable paramb)
        {
          return;
        }
      }
      try
      {
        localObject = localList.get(i);
        if (localObject != null) {
          a(localObject, paramb, paramLong1, paramLong2, paramInt, paramLong3);
        }
      }
      catch (Throwable localThrowable2)
      {
        continue;
      }
      i += 1;
    }
  }
  
  public boolean a(String paramString)
  {
    return a(paramString, null);
  }
  
  /* Error */
  public boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_1
    //   7: invokevirtual 138	java/lang/String:trim	()Ljava/lang/String;
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 141	java/lang/String:length	()I
    //   15: ifle -11 -> 4
    //   18: aload_0
    //   19: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   22: aload_1
    //   23: invokevirtual 144	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   26: ifeq +5 -> 31
    //   29: iconst_1
    //   30: ireturn
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual 146	net/youmi/android/e/b/a/c:c	(Ljava/lang/String;)Z
    //   36: istore_3
    //   37: iload_3
    //   38: ifeq +44 -> 82
    //   41: new 148	net/youmi/android/e/b/a/g
    //   44: dup
    //   45: aload_0
    //   46: getfield 43	net/youmi/android/e/b/a/c:c	Landroid/content/Context;
    //   49: aload_0
    //   50: aload_1
    //   51: aload_2
    //   52: invokespecial 151	net/youmi/android/e/b/a/g:<init>	(Landroid/content/Context;Lnet/youmi/android/e/b/h;Ljava/lang/String;Ljava/lang/String;)V
    //   55: astore_1
    //   56: aload_0
    //   57: getfield 28	net/youmi/android/e/b/a/c:a	Ljava/util/HashSet;
    //   60: aload_1
    //   61: invokevirtual 100	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   64: pop
    //   65: new 153	java/lang/Thread
    //   68: dup
    //   69: aload_1
    //   70: invokespecial 156	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 159	java/lang/Thread:start	()V
    //   76: aload_1
    //   77: invokevirtual 161	net/youmi/android/e/b/a/g:b	()V
    //   80: iconst_1
    //   81: ireturn
    //   82: new 163	net/youmi/android/e/b/a/e
    //   85: dup
    //   86: aload_1
    //   87: aload_2
    //   88: invokespecial 166	net/youmi/android/e/b/a/e:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: astore_2
    //   92: invokestatic 50	net/youmi/android/e/b/a/d:a	()Lnet/youmi/android/e/b/a/d;
    //   95: aload_0
    //   96: getfield 43	net/youmi/android/e/b/a/c:c	Landroid/content/Context;
    //   99: aload_2
    //   100: aload_0
    //   101: aload_2
    //   102: aconst_null
    //   103: invokevirtual 94	net/youmi/android/e/b/a/c:a	(Lnet/youmi/android/e/b/b;Ljava/lang/String;)Ljava/io/File;
    //   106: aload_0
    //   107: invokevirtual 97	net/youmi/android/e/b/a/d:a	(Landroid/content/Context;Lnet/youmi/android/e/b/b;Ljava/io/File;Lnet/youmi/android/e/b/e;)Z
    //   110: ifeq -106 -> 4
    //   113: aload_0
    //   114: getfield 45	net/youmi/android/e/b/a/c:e	Ljava/util/HashSet;
    //   117: aload_2
    //   118: invokevirtual 100	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   121: pop
    //   122: aload_0
    //   123: getfield 33	net/youmi/android/e/b/a/c:b	Ljava/util/HashMap;
    //   126: aload_1
    //   127: aload_1
    //   128: invokevirtual 108	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   136: aload_1
    //   137: aload_2
    //   138: invokevirtual 108	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   141: pop
    //   142: iconst_1
    //   143: ireturn
    //   144: astore_1
    //   145: iconst_0
    //   146: ireturn
    //   147: astore_1
    //   148: iconst_0
    //   149: ireturn
    //   150: astore_2
    //   151: goto -75 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	c
    //   0	154	1	paramString1	String
    //   0	154	2	paramString2	String
    //   36	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	29	144	java/lang/Throwable
    //   31	37	144	java/lang/Throwable
    //   82	142	144	java/lang/Throwable
    //   41	65	147	java/lang/Throwable
    //   76	80	147	java/lang/Throwable
    //   65	76	150	java/lang/Throwable
  }
  
  protected abstract void b(Object paramObject, b paramb);
  
  protected abstract void b(Object paramObject, b paramb, File paramFile);
  
  protected abstract boolean b(String paramString);
  
  public Context c()
  {
    return this.c;
  }
  
  protected boolean c(String paramString)
  {
    try
    {
      Uri localUri = Uri.parse(paramString);
      if (localUri.getQuery() == null)
      {
        if (localUri.getFragment() != null) {
          return true;
        }
        boolean bool = b(paramString);
        if (bool) {
          return false;
        }
      }
    }
    catch (Throwable paramString) {}
    return true;
  }
  
  public boolean c(b paramb, File paramFile)
  {
    if ((paramb == null) || (paramFile == null)) {}
    for (;;)
    {
      return false;
      try
      {
        if (paramFile.exists())
        {
          if (paramb.e() != null) {
            return net.youmi.android.c.c.e.a(paramFile, paramb.e());
          }
          if (paramb.d() > 0L)
          {
            long l1 = paramb.d();
            long l2 = paramFile.length();
            if (l1 == l2) {
              return true;
            }
          }
        }
      }
      catch (Throwable paramb) {}
    }
    return false;
  }
  
  /* Error */
  public final void d(b paramb, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   9: aload_1
    //   10: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   13: invokevirtual 144	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   16: ifeq +15 -> 31
    //   19: aload_0
    //   20: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   23: aload_1
    //   24: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   27: invokevirtual 202	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_0
    //   32: getfield 45	net/youmi/android/e/b/a/c:e	Ljava/util/HashSet;
    //   35: aload_1
    //   36: invokevirtual 114	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   39: istore 5
    //   41: iload 5
    //   43: ifeq -39 -> 4
    //   46: aload_0
    //   47: aload_1
    //   48: aload_2
    //   49: invokevirtual 204	net/youmi/android/e/b/a/c:f	(Lnet/youmi/android/e/b/b;Ljava/io/File;)V
    //   52: aload_0
    //   53: invokevirtual 117	net/youmi/android/e/b/a/c:b	()Ljava/util/List;
    //   56: astore 6
    //   58: iconst_0
    //   59: istore_3
    //   60: aload 6
    //   62: invokeinterface 123 1 0
    //   67: istore 4
    //   69: iload_3
    //   70: iload 4
    //   72: if_icmpge -68 -> 4
    //   75: aload 6
    //   77: iload_3
    //   78: invokeinterface 127 2 0
    //   83: astore 7
    //   85: aload 7
    //   87: ifnull +11 -> 98
    //   90: aload_0
    //   91: aload 7
    //   93: aload_1
    //   94: aload_2
    //   95: invokevirtual 206	net/youmi/android/e/b/a/c:b	(Ljava/lang/Object;Lnet/youmi/android/e/b/b;Ljava/io/File;)V
    //   98: iload_3
    //   99: iconst_1
    //   100: iadd
    //   101: istore_3
    //   102: goto -42 -> 60
    //   105: astore 6
    //   107: goto -55 -> 52
    //   110: astore_1
    //   111: return
    //   112: astore 7
    //   114: goto -16 -> 98
    //   117: astore 6
    //   119: goto -73 -> 46
    //   122: astore 6
    //   124: goto -93 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	c
    //   0	127	1	paramb	b
    //   0	127	2	paramFile	File
    //   59	43	3	i	int
    //   67	6	4	j	int
    //   39	3	5	bool	boolean
    //   56	20	6	localList	List
    //   105	1	6	localThrowable1	Throwable
    //   117	1	6	localThrowable2	Throwable
    //   122	1	6	localThrowable3	Throwable
    //   83	9	7	localObject	Object
    //   112	1	7	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   46	52	105	java/lang/Throwable
    //   52	58	110	java/lang/Throwable
    //   60	69	110	java/lang/Throwable
    //   75	85	112	java/lang/Throwable
    //   90	98	112	java/lang/Throwable
    //   31	41	117	java/lang/Throwable
    //   5	31	122	java/lang/Throwable
  }
  
  /* Error */
  public final void e(b paramb, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   9: aload_1
    //   10: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   13: invokevirtual 144	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   16: ifeq +15 -> 31
    //   19: aload_0
    //   20: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   23: aload_1
    //   24: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   27: invokevirtual 202	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_0
    //   32: getfield 45	net/youmi/android/e/b/a/c:e	Ljava/util/HashSet;
    //   35: aload_1
    //   36: invokevirtual 114	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   39: istore 5
    //   41: iload 5
    //   43: ifeq -39 -> 4
    //   46: aload_0
    //   47: aload_1
    //   48: aload_2
    //   49: invokevirtual 209	net/youmi/android/e/b/a/c:g	(Lnet/youmi/android/e/b/b;Ljava/io/File;)V
    //   52: aload_0
    //   53: invokevirtual 117	net/youmi/android/e/b/a/c:b	()Ljava/util/List;
    //   56: astore 6
    //   58: iconst_0
    //   59: istore_3
    //   60: aload 6
    //   62: invokeinterface 123 1 0
    //   67: istore 4
    //   69: iload_3
    //   70: iload 4
    //   72: if_icmpge -68 -> 4
    //   75: aload 6
    //   77: iload_3
    //   78: invokeinterface 127 2 0
    //   83: astore 7
    //   85: aload 7
    //   87: ifnull +11 -> 98
    //   90: aload_0
    //   91: aload 7
    //   93: aload_1
    //   94: aload_2
    //   95: invokevirtual 211	net/youmi/android/e/b/a/c:a	(Ljava/lang/Object;Lnet/youmi/android/e/b/b;Ljava/io/File;)V
    //   98: iload_3
    //   99: iconst_1
    //   100: iadd
    //   101: istore_3
    //   102: goto -42 -> 60
    //   105: astore 6
    //   107: goto -55 -> 52
    //   110: astore_1
    //   111: return
    //   112: astore 7
    //   114: goto -16 -> 98
    //   117: astore 6
    //   119: goto -73 -> 46
    //   122: astore 6
    //   124: goto -93 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	c
    //   0	127	1	paramb	b
    //   0	127	2	paramFile	File
    //   59	43	3	i	int
    //   67	6	4	j	int
    //   39	3	5	bool	boolean
    //   56	20	6	localList	List
    //   105	1	6	localThrowable1	Throwable
    //   117	1	6	localThrowable2	Throwable
    //   122	1	6	localThrowable3	Throwable
    //   83	9	7	localObject	Object
    //   112	1	7	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   46	52	105	java/lang/Throwable
    //   52	58	110	java/lang/Throwable
    //   60	69	110	java/lang/Throwable
    //   75	85	112	java/lang/Throwable
    //   90	98	112	java/lang/Throwable
    //   31	41	117	java/lang/Throwable
    //   5	31	122	java/lang/Throwable
  }
  
  protected abstract void f(b paramb, File paramFile);
  
  protected abstract void g(b paramb, File paramFile);
  
  public boolean g(b paramb)
  {
    if (paramb == null) {}
    for (;;)
    {
      return false;
      try
      {
        if (paramb.e() == null)
        {
          long l = paramb.d();
          if (l <= 0L) {
            return true;
          }
        }
      }
      catch (Throwable paramb) {}
    }
    return true;
  }
  
  /* Error */
  public final void h(b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 45	net/youmi/android/e/b/a/c:e	Ljava/util/HashSet;
    //   9: aload_1
    //   10: invokevirtual 114	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq -13 -> 4
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual 216	net/youmi/android/e/b/a/c:j	(Lnet/youmi/android/e/b/b;)V
    //   25: aload_0
    //   26: invokevirtual 117	net/youmi/android/e/b/a/c:b	()Ljava/util/List;
    //   29: astore 5
    //   31: iconst_0
    //   32: istore_2
    //   33: aload 5
    //   35: invokeinterface 123 1 0
    //   40: istore_3
    //   41: iload_2
    //   42: iload_3
    //   43: if_icmpge -39 -> 4
    //   46: aload 5
    //   48: iload_2
    //   49: invokeinterface 127 2 0
    //   54: astore 6
    //   56: aload 6
    //   58: ifnull +10 -> 68
    //   61: aload_0
    //   62: aload 6
    //   64: aload_1
    //   65: invokevirtual 218	net/youmi/android/e/b/a/c:b	(Ljava/lang/Object;Lnet/youmi/android/e/b/b;)V
    //   68: iload_2
    //   69: iconst_1
    //   70: iadd
    //   71: istore_2
    //   72: goto -39 -> 33
    //   75: astore 5
    //   77: goto -52 -> 25
    //   80: astore_1
    //   81: return
    //   82: astore 6
    //   84: goto -16 -> 68
    //   87: astore 5
    //   89: goto -69 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	c
    //   0	92	1	paramb	b
    //   32	40	2	i	int
    //   40	4	3	j	int
    //   13	3	4	bool	boolean
    //   29	18	5	localList	List
    //   75	1	5	localThrowable1	Throwable
    //   87	1	5	localThrowable2	Throwable
    //   54	9	6	localObject	Object
    //   82	1	6	localThrowable3	Throwable
    // Exception table:
    //   from	to	target	type
    //   20	25	75	java/lang/Throwable
    //   25	31	80	java/lang/Throwable
    //   33	41	80	java/lang/Throwable
    //   46	56	82	java/lang/Throwable
    //   61	68	82	java/lang/Throwable
    //   5	15	87	java/lang/Throwable
  }
  
  /* Error */
  public final void i(b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   9: aload_1
    //   10: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   13: invokevirtual 144	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   16: ifeq +15 -> 31
    //   19: aload_0
    //   20: getfield 35	net/youmi/android/e/b/a/c:d	Ljava/util/HashMap;
    //   23: aload_1
    //   24: invokevirtual 104	net/youmi/android/e/b/b:f	()Ljava/lang/String;
    //   27: invokevirtual 202	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_0
    //   32: getfield 45	net/youmi/android/e/b/a/c:e	Ljava/util/HashSet;
    //   35: aload_1
    //   36: invokevirtual 114	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   39: istore 4
    //   41: iload 4
    //   43: ifeq -39 -> 4
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual 221	net/youmi/android/e/b/a/c:k	(Lnet/youmi/android/e/b/b;)V
    //   51: aload_0
    //   52: invokevirtual 117	net/youmi/android/e/b/a/c:b	()Ljava/util/List;
    //   55: astore 5
    //   57: iconst_0
    //   58: istore_2
    //   59: aload 5
    //   61: invokeinterface 123 1 0
    //   66: istore_3
    //   67: iload_2
    //   68: iload_3
    //   69: if_icmpge -65 -> 4
    //   72: aload 5
    //   74: iload_2
    //   75: invokeinterface 127 2 0
    //   80: astore 6
    //   82: aload 6
    //   84: ifnull +10 -> 94
    //   87: aload_0
    //   88: aload 6
    //   90: aload_1
    //   91: invokevirtual 223	net/youmi/android/e/b/a/c:a	(Ljava/lang/Object;Lnet/youmi/android/e/b/b;)V
    //   94: iload_2
    //   95: iconst_1
    //   96: iadd
    //   97: istore_2
    //   98: goto -39 -> 59
    //   101: astore 5
    //   103: goto -52 -> 51
    //   106: astore_1
    //   107: return
    //   108: astore 6
    //   110: goto -16 -> 94
    //   113: astore 5
    //   115: goto -69 -> 46
    //   118: astore 5
    //   120: goto -89 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	c
    //   0	123	1	paramb	b
    //   58	40	2	i	int
    //   66	4	3	j	int
    //   39	3	4	bool	boolean
    //   55	18	5	localList	List
    //   101	1	5	localThrowable1	Throwable
    //   113	1	5	localThrowable2	Throwable
    //   118	1	5	localThrowable3	Throwable
    //   80	9	6	localObject	Object
    //   108	1	6	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   46	51	101	java/lang/Throwable
    //   51	57	106	java/lang/Throwable
    //   59	67	106	java/lang/Throwable
    //   72	82	108	java/lang/Throwable
    //   87	94	108	java/lang/Throwable
    //   31	41	113	java/lang/Throwable
    //   5	31	118	java/lang/Throwable
  }
  
  protected abstract void j(b paramb);
  
  protected abstract void k(b paramb);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.c
 * JD-Core Version:    0.7.0.1
 */