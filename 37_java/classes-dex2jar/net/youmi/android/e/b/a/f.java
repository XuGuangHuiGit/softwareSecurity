package net.youmi.android.e.b.a;

import android.content.Context;
import java.io.File;
import net.youmi.android.c.h.c;

public class f
  extends Thread
{
  private int a = 0;
  private File b;
  private File c;
  private int d = 0;
  private int e = 0;
  private boolean f = false;
  private boolean g = false;
  private c h;
  private Context i;
  private int j = 8;
  private int k = 60;
  
  public f(Context paramContext, String paramString, long paramLong, File paramFile1, File paramFile2, int paramInt)
  {
    this.i = paramContext.getApplicationContext();
    this.b = paramFile2;
    this.c = paramFile1;
    this.h = new c(this.i, paramString, this.c, paramLong);
    if (paramInt > 0) {
      this.j = paramInt;
    }
    a(true);
  }
  
  private void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  /* Error */
  private void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	net/youmi/android/e/b/a/f:h	Lnet/youmi/android/c/h/c;
    //   4: invokevirtual 67	net/youmi/android/c/h/c:a	()I
    //   7: tableswitch	default:+65 -> 72, -4:+65->72, -3:+56->63, -2:+56->63, -1:+56->63, 0:+33->40
    //   41: getfield 51	net/youmi/android/e/b/a/f:c	Ljava/io/File;
    //   44: aload_0
    //   45: getfield 49	net/youmi/android/e/b/a/f:b	Ljava/io/File;
    //   48: invokevirtual 73	java/io/File:renameTo	(Ljava/io/File;)Z
    //   51: pop
    //   52: aload_0
    //   53: iconst_1
    //   54: putfield 33	net/youmi/android/e/b/a/f:f	Z
    //   57: aload_0
    //   58: iconst_0
    //   59: invokespecial 61	net/youmi/android/e/b/a/f:a	(Z)V
    //   62: return
    //   63: aload_0
    //   64: iconst_0
    //   65: invokespecial 61	net/youmi/android/e/b/a/f:a	(Z)V
    //   68: return
    //   69: astore_1
    //   70: aload_1
    //   71: athrow
    //   72: return
    //   73: astore_1
    //   74: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	f
    //   69	2	1	localObject	java.lang.Object
    //   73	1	1	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   0	40	69	finally
    //   40	62	69	finally
    //   63	68	69	finally
    //   0	40	73	java/lang/Throwable
    //   40	62	73	java/lang/Throwable
    //   63	68	73	java/lang/Throwable
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public boolean b()
  {
    return this.f;
  }
  
  public long c()
  {
    return this.h.d();
  }
  
  public long d()
  {
    return this.h.b();
  }
  
  public int e()
  {
    return this.h.c();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 84	java/lang/Thread:run	()V
    //   4: aload_0
    //   5: getfield 35	net/youmi/android/e/b/a/f:g	Z
    //   8: ifeq +55 -> 63
    //   11: aload_0
    //   12: aload_0
    //   13: getfield 31	net/youmi/android/e/b/a/f:e	I
    //   16: iconst_1
    //   17: iadd
    //   18: putfield 31	net/youmi/android/e/b/a/f:e	I
    //   21: aload_0
    //   22: getfield 47	net/youmi/android/e/b/a/f:i	Landroid/content/Context;
    //   25: invokestatic 89	net/youmi/android/c/h/j:a	(Landroid/content/Context;)Z
    //   28: ifne +9 -> 37
    //   31: ldc2_w 90
    //   34: invokestatic 95	java/lang/Thread:sleep	(J)V
    //   37: aload_0
    //   38: getfield 47	net/youmi/android/e/b/a/f:i	Landroid/content/Context;
    //   41: invokestatic 89	net/youmi/android/c/h/j:a	(Landroid/content/Context;)Z
    //   44: ifne +21 -> 65
    //   47: aload_0
    //   48: getfield 31	net/youmi/android/e/b/a/f:e	I
    //   51: aload_0
    //   52: getfield 39	net/youmi/android/e/b/a/f:k	I
    //   55: if_icmplt -51 -> 4
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial 61	net/youmi/android/e/b/a/f:a	(Z)V
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: aload_0
    //   67: getfield 29	net/youmi/android/e/b/a/f:d	I
    //   70: iconst_1
    //   71: iadd
    //   72: putfield 29	net/youmi/android/e/b/a/f:d	I
    //   75: aload_0
    //   76: invokespecial 97	net/youmi/android/e/b/a/f:f	()V
    //   79: aload_0
    //   80: getfield 29	net/youmi/android/e/b/a/f:d	I
    //   83: aload_0
    //   84: getfield 37	net/youmi/android/e/b/a/f:j	I
    //   87: if_icmplt -83 -> 4
    //   90: aload_0
    //   91: iconst_0
    //   92: invokespecial 61	net/youmi/android/e/b/a/f:a	(Z)V
    //   95: return
    //   96: astore_1
    //   97: return
    //   98: astore_1
    //   99: goto -20 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	f
    //   64	1	1	localThrowable1	java.lang.Throwable
    //   96	1	1	localThrowable2	java.lang.Throwable
    //   98	1	1	localThrowable3	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   21	37	64	java/lang/Throwable
    //   37	63	64	java/lang/Throwable
    //   4	21	96	java/lang/Throwable
    //   65	75	96	java/lang/Throwable
    //   79	95	96	java/lang/Throwable
    //   75	79	98	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.a.f
 * JD-Core Version:    0.7.0.1
 */