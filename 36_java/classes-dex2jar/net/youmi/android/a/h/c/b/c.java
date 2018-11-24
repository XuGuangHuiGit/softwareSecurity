package net.youmi.android.a.h.c.b;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Bitmap;
import java.util.HashMap;
import net.youmi.android.a.f.b;
import net.youmi.android.c.k.d;
import net.youmi.android.c.k.g;

public class c
  implements net.youmi.android.e.b.i
{
  private static c b;
  private Context a;
  private HashMap c = new HashMap();
  
  public c(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    b.a(this.a).a(this);
  }
  
  private Bitmap a(Bitmap paramBitmap)
  {
    Bitmap localBitmap1;
    if (paramBitmap == null)
    {
      localBitmap1 = null;
      return localBitmap1;
    }
    for (;;)
    {
      int i;
      int m;
      int n;
      int j;
      try
      {
        if (paramBitmap.isRecycled()) {
          return null;
        }
        if (d.a(this.a).e() >= 320)
        {
          i = 100;
          localBitmap1 = paramBitmap;
          if (i <= 0) {
            break;
          }
          m = paramBitmap.getWidth();
          n = paramBitmap.getHeight();
          Bitmap localBitmap3;
          if (m >= n)
          {
            int k = m * i / n;
            j = i;
            i = k;
            break label130;
            localBitmap3 = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
            localBitmap1 = paramBitmap;
            if (localBitmap3 == null) {
              break;
            }
          }
          try
          {
            paramBitmap.recycle();
            return localBitmap3;
            j = i * n / m;
          }
          catch (Throwable paramBitmap)
          {
            continue;
          }
        }
        i = 72;
      }
      catch (Throwable localThrowable)
      {
        return paramBitmap;
      }
      continue;
      label130:
      Bitmap localBitmap2 = paramBitmap;
      if (i <= 0) {
        break;
      }
      localBitmap2 = paramBitmap;
      if (j <= 0) {
        break;
      }
      if (i == m)
      {
        localBitmap2 = paramBitmap;
        if (j == n) {
          break;
        }
      }
    }
  }
  
  /* Error */
  public static c a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 73	net/youmi/android/a/h/c/b/c:b	Lnet/youmi/android/a/h/c/b/c;
    //   6: ifnonnull +14 -> 20
    //   9: new 2	net/youmi/android/a/h/c/b/c
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 75	net/youmi/android/a/h/c/b/c:<init>	(Landroid/content/Context;)V
    //   17: putstatic 73	net/youmi/android/a/h/c/b/c:b	Lnet/youmi/android/a/h/c/b/c;
    //   20: getstatic 73	net/youmi/android/a/h/c/b/c:b	Lnet/youmi/android/a/h/c/b/c;
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: goto -16 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	20	29	finally
    //   20	24	29	finally
    //   3	20	35	java/lang/Throwable
  }
  
  private void a(net.youmi.android.a.h.c.a.a parama, Bitmap paramBitmap)
  {
    try
    {
      Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", parama.a());
      localIntent1.putExtra("duplicate", false);
      Intent localIntent2 = g.a(this.a, parama.f(), parama.e(), parama.b());
      if (localIntent2 == null) {
        return;
      }
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      if (paramBitmap != null) {
        localIntent1.putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
      }
      for (;;)
      {
        this.a.sendBroadcast(localIntent1);
        if ((parama.d() == null) || (parama.g() == null)) {
          break;
        }
        paramBitmap = new StringBuilder();
        paramBitmap.append("javascript:");
        paramBitmap.append(parama.d());
        paramBitmap.append("('");
        paramBitmap.append(parama.a());
        paramBitmap.append("',");
        paramBitmap.append("0);");
        a.a().a(parama.g(), paramBitmap.toString());
        return;
        localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this.a, 17301514));
      }
      return;
    }
    catch (Throwable parama) {}
  }
  
  public void a(String paramString)
  {
    try
    {
      if (!this.c.containsKey(paramString)) {
        return;
      }
      net.youmi.android.a.h.c.a.a locala = (net.youmi.android.a.h.c.a.a)this.c.get(paramString);
      if ((locala != null) && (locala.h()))
      {
        a(locala, null);
        this.c.remove(paramString);
        return;
      }
    }
    catch (Throwable paramString) {}
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    try
    {
      if (!this.c.containsKey(paramString)) {
        return;
      }
      net.youmi.android.a.h.c.a.a locala = (net.youmi.android.a.h.c.a.a)this.c.get(paramString);
      if ((locala != null) && (locala.h()))
      {
        Bitmap localBitmap = a(paramBitmap);
        if (localBitmap != null) {
          a(locala, localBitmap);
        }
        for (;;)
        {
          this.c.remove(paramString);
          return;
          a(locala, paramBitmap);
        }
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public boolean a(net.youmi.android.a.h.c.a.a parama)
  {
    if (parama == null) {}
    for (;;)
    {
      return false;
      try
      {
        if ((net.youmi.android.c.k.i.h(this.a)) && (parama.h()))
        {
          String str2 = parama.b();
          String str1 = parama.c();
          if (str1 == null)
          {
            this.c.put(str2, parama);
            a(str2);
          }
          else
          {
            this.c.put(str1, parama);
            parama = b.a(this.a).a(str1);
            if (parama != null) {
              a(str1, parama);
            }
          }
        }
      }
      catch (Throwable parama)
      {
        return false;
      }
    }
    return true;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.c.b.c
 * JD-Core Version:    0.7.0.1
 */