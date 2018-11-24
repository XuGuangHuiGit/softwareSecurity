package net.youmi.android.e.b.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import net.youmi.android.e.b.f;

public abstract class b
  extends net.youmi.android.c.l.a
  implements net.youmi.android.e.b.e, f
{
  private Context a;
  private net.youmi.android.c.f.a b;
  private HashMap c;
  private HashSet d;
  
  public b(Context paramContext, net.youmi.android.c.f.a parama)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context is null");
    }
    this.a = paramContext.getApplicationContext();
    if (parama == null) {
      throw new IOException("Cache Directory is null");
    }
    this.b = parama;
    this.c = new HashMap();
    this.d = new HashSet();
    d.a().a(this);
  }
  
  protected Bitmap a(File paramFile)
  {
    if (paramFile == null) {}
    for (;;)
    {
      return null;
      try
      {
        if (paramFile.exists())
        {
          paramFile = BitmapFactory.decodeFile(paramFile.getAbsolutePath());
          if (paramFile != null)
          {
            boolean bool = paramFile.isRecycled();
            if (!bool) {
              return paramFile;
            }
          }
        }
      }
      catch (Throwable paramFile) {}
    }
    return null;
  }
  
  public Bitmap a(String paramString)
  {
    try
    {
      paramString = new e(paramString);
      if (!paramString.c()) {
        return null;
      }
      Object localObject = a(paramString);
      if (localObject != null) {
        return localObject;
      }
      localObject = this.b.b(paramString.a());
      this.d.add(paramString);
      if (!d.a().a(this.a, paramString, (File)localObject, this))
      {
        this.d.remove(paramString);
        return null;
      }
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  protected Bitmap a(net.youmi.android.e.b.b paramb)
  {
    try
    {
      if (this.c.containsKey(paramb))
      {
        Object localObject = (SoftReference)this.c.get(paramb);
        if (localObject != null)
        {
          localObject = (Bitmap)((SoftReference)localObject).get();
          if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
            return localObject;
          }
        }
        this.c.remove(paramb);
      }
    }
    catch (Throwable paramb)
    {
      label57:
      break label57;
    }
    return null;
  }
  
  public final void a(net.youmi.android.e.b.b paramb, long paramLong1, long paramLong2, int paramInt, long paramLong3) {}
  
  protected boolean a(net.youmi.android.e.b.b paramb, Bitmap paramBitmap)
  {
    boolean bool2 = true;
    for (;;)
    {
      try
      {
        if (a(paramb) == null) {
          break label60;
        }
        bool1 = true;
      }
      catch (Throwable paramb)
      {
        return false;
      }
      if (paramBitmap.isRecycled()) {
        return bool1;
      }
      paramb = this.c.put(paramb, new SoftReference(paramBitmap));
      boolean bool1 = bool2;
      if (paramb == null) {
        return false;
      }
      while (paramBitmap == null)
      {
        return bool1;
        label60:
        bool1 = false;
      }
    }
  }
  
  public boolean c(net.youmi.android.e.b.b paramb, File paramFile)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    try
    {
      paramFile = a(paramFile);
      if (paramFile != null) {
        bool1 = true;
      }
      bool2 = bool1;
      a(paramb, paramFile);
      return bool1;
    }
    catch (Throwable paramb) {}
    return bool2;
  }
  
  /* Error */
  public final void d(net.youmi.android.e.b.b paramb, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 53	net/youmi/android/e/b/a/b:d	Ljava/util/HashSet;
    //   9: aload_1
    //   10: invokevirtual 144	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   13: istore 5
    //   15: iload 5
    //   17: ifeq -13 -> 4
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual 96	net/youmi/android/e/b/a/b:a	(Lnet/youmi/android/e/b/b;)Landroid/graphics/Bitmap;
    //   25: astore 6
    //   27: aload 6
    //   29: ifnonnull +93 -> 122
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 138	net/youmi/android/e/b/a/b:a	(Ljava/io/File;)Landroid/graphics/Bitmap;
    //   37: astore_2
    //   38: aload_2
    //   39: astore 6
    //   41: aload_0
    //   42: aload_1
    //   43: aload_2
    //   44: invokevirtual 140	net/youmi/android/e/b/a/b:a	(Lnet/youmi/android/e/b/b;Landroid/graphics/Bitmap;)Z
    //   47: pop
    //   48: aload_2
    //   49: ifnull -45 -> 4
    //   52: aload_0
    //   53: invokevirtual 147	net/youmi/android/e/b/a/b:b	()Ljava/util/List;
    //   56: astore 6
    //   58: iconst_0
    //   59: istore_3
    //   60: aload 6
    //   62: invokeinterface 153 1 0
    //   67: istore 4
    //   69: iload_3
    //   70: iload 4
    //   72: if_icmpge -68 -> 4
    //   75: aload 6
    //   77: iload_3
    //   78: invokeinterface 156 2 0
    //   83: checkcast 158	net/youmi/android/e/b/i
    //   86: aload_1
    //   87: invokevirtual 160	net/youmi/android/e/b/b:b	()Ljava/lang/String;
    //   90: aload_2
    //   91: invokeinterface 163 3 0
    //   96: iload_3
    //   97: iconst_1
    //   98: iadd
    //   99: istore_3
    //   100: goto -40 -> 60
    //   103: astore_2
    //   104: aload 6
    //   106: astore_2
    //   107: goto -59 -> 48
    //   110: astore_1
    //   111: return
    //   112: astore 7
    //   114: goto -18 -> 96
    //   117: astore 6
    //   119: goto -99 -> 20
    //   122: aload 6
    //   124: astore_2
    //   125: goto -77 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	b
    //   0	128	1	paramb	net.youmi.android.e.b.b
    //   0	128	2	paramFile	File
    //   59	41	3	i	int
    //   67	6	4	j	int
    //   13	3	5	bool	boolean
    //   25	80	6	localObject	Object
    //   117	6	6	localThrowable1	Throwable
    //   112	1	7	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   32	38	103	java/lang/Throwable
    //   41	48	103	java/lang/Throwable
    //   20	27	110	java/lang/Throwable
    //   52	58	110	java/lang/Throwable
    //   60	69	110	java/lang/Throwable
    //   75	96	112	java/lang/Throwable
    //   5	15	117	java/lang/Throwable
  }
  
  public void e(net.youmi.android.e.b.b paramb, File paramFile)
  {
    d(paramb, paramFile);
  }
  
  public boolean g(net.youmi.android.e.b.b paramb)
  {
    return false;
  }
  
  public final void h(net.youmi.android.e.b.b paramb) {}
  
  /* Error */
  public final void i(net.youmi.android.e.b.b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield 53	net/youmi/android/e/b/a/b:d	Ljava/util/HashSet;
    //   9: aload_1
    //   10: invokevirtual 144	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq -13 -> 4
    //   20: aload_0
    //   21: invokevirtual 147	net/youmi/android/e/b/a/b:b	()Ljava/util/List;
    //   24: astore 5
    //   26: iconst_0
    //   27: istore_2
    //   28: aload 5
    //   30: invokeinterface 153 1 0
    //   35: istore_3
    //   36: iload_2
    //   37: iload_3
    //   38: if_icmpge -34 -> 4
    //   41: aload 5
    //   43: iload_2
    //   44: invokeinterface 156 2 0
    //   49: checkcast 158	net/youmi/android/e/b/i
    //   52: aload_1
    //   53: invokevirtual 160	net/youmi/android/e/b/b:b	()Ljava/lang/String;
    //   56: invokeinterface 173 2 0
    //   61: iload_2
    //   62: iconst_1
    //   63: iadd
    //   64: istore_2
    //   65: goto -37 -> 28
    //   68: astore_1
    //   69: return
    //   70: astore 6
    //   72: goto -11 -> 61
    //   75: astore 5
    //   77: goto -57 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	b
    //   0	80	1	paramb	net.youmi.android.e.b.b
    //   27	38	2	i	int
    //   35	4	3	j	int
    //   13	3	4	bool	boolean
    //   24	18	5	localList	java.util.List
    //   75	1	5	localThrowable1	Throwable
    //   70	1	6	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   20	26	68	java/lang/Throwable
    //   28	36	68	java/lang/Throwable
    //   41	61	70	java/lang/Throwable
    //   5	15	75	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.b
 * JD-Core Version:    0.7.0.1
 */