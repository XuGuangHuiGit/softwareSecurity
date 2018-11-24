package net.youmi.android.offers;

import android.content.BroadcastReceiver;
import android.content.Context;
import net.youmi.android.b.b.a;

public abstract class PointsReceiver
  extends BroadcastReceiver
{
  public static final String getActionName_EarnPoints(Context paramContext)
  {
    try
    {
      paramContext = a.a(paramContext);
      if (paramContext == null) {
        return null;
      }
      paramContext = "ep_" + paramContext;
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static final String getActionName_ViewPoints(Context paramContext)
  {
    try
    {
      paramContext = a.a(paramContext);
      if (paramContext == null) {
        return null;
      }
      paramContext = "vp_" + paramContext;
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  protected abstract void onEarnPoints(Context paramContext, EarnPointsOrderList paramEarnPointsOrderList);
  
  /* Error */
  public final void onReceive(Context paramContext, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 18	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   4: astore 4
    //   6: aload 4
    //   8: ifnonnull +13 -> 21
    //   11: ldc 40
    //   13: iconst_0
    //   14: anewarray 42	java/lang/Object
    //   17: invokestatic 48	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: return
    //   21: aload_2
    //   22: invokevirtual 53	android/content/Intent:getAction	()Ljava/lang/String;
    //   25: invokestatic 58	net/youmi/android/c/b/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   28: astore 5
    //   30: aload 5
    //   32: ifnonnull +15 -> 47
    //   35: ldc 60
    //   37: iconst_0
    //   38: anewarray 42	java/lang/Object
    //   41: invokestatic 48	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: return
    //   45: astore_1
    //   46: return
    //   47: ldc 62
    //   49: iconst_1
    //   50: anewarray 42	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload 5
    //   57: aastore
    //   58: invokestatic 65	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload 5
    //   63: ldc 23
    //   65: invokevirtual 71	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   68: ifeq +119 -> 187
    //   71: aload 5
    //   73: new 20	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   80: ldc 23
    //   82: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload 4
    //   87: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokevirtual 74	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   96: istore_3
    //   97: iload_3
    //   98: ifeq +79 -> 177
    //   101: aload_2
    //   102: ldc 76
    //   104: invokevirtual 80	android/content/Intent:getSerializableExtra	(Ljava/lang/String;)Ljava/io/Serializable;
    //   107: astore_2
    //   108: aload_2
    //   109: ifnonnull +13 -> 122
    //   112: ldc 82
    //   114: iconst_0
    //   115: anewarray 42	java/lang/Object
    //   118: invokestatic 48	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: return
    //   122: aload_2
    //   123: instanceof 84
    //   126: ifeq +114 -> 240
    //   129: aload_2
    //   130: checkcast 84	net/youmi/android/offers/EarnPointsOrderList
    //   133: astore_2
    //   134: aload_2
    //   135: invokevirtual 88	net/youmi/android/offers/EarnPointsOrderList:isEmpty	()Z
    //   138: istore_3
    //   139: iload_3
    //   140: ifne +27 -> 167
    //   143: aload_0
    //   144: aload_1
    //   145: aload_2
    //   146: invokevirtual 90	net/youmi/android/offers/PointsReceiver:onEarnPoints	(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    //   149: ldc 92
    //   151: iconst_0
    //   152: anewarray 42	java/lang/Object
    //   155: invokestatic 65	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: return
    //   159: astore_1
    //   160: aload_1
    //   161: invokestatic 95	net/youmi/android/c/e/a:a	(Ljava/lang/Throwable;)V
    //   164: goto -15 -> 149
    //   167: ldc 97
    //   169: iconst_0
    //   170: anewarray 42	java/lang/Object
    //   173: invokestatic 65	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: return
    //   177: ldc 99
    //   179: iconst_0
    //   180: anewarray 42	java/lang/Object
    //   183: invokestatic 48	net/youmi/android/c/e/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: return
    //   187: aload 5
    //   189: ldc 34
    //   191: invokevirtual 71	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   194: ifeq +46 -> 240
    //   197: aload 5
    //   199: new 20	java/lang/StringBuilder
    //   202: dup
    //   203: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   206: ldc 34
    //   208: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload 4
    //   213: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokevirtual 74	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   222: istore_3
    //   223: iload_3
    //   224: ifeq +16 -> 240
    //   227: aload_0
    //   228: aload_1
    //   229: invokevirtual 103	net/youmi/android/offers/PointsReceiver:onViewPoints	(Landroid/content/Context;)V
    //   232: return
    //   233: astore_1
    //   234: return
    //   235: astore 6
    //   237: goto -176 -> 61
    //   240: return
    //   241: astore_1
    //   242: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	PointsReceiver
    //   0	243	1	paramContext	Context
    //   0	243	2	paramIntent	android.content.Intent
    //   96	128	3	bool	boolean
    //   4	208	4	str1	String
    //   28	170	5	str2	String
    //   235	1	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	6	45	java/lang/Throwable
    //   11	20	45	java/lang/Throwable
    //   21	30	45	java/lang/Throwable
    //   35	44	45	java/lang/Throwable
    //   61	97	45	java/lang/Throwable
    //   177	186	45	java/lang/Throwable
    //   187	223	45	java/lang/Throwable
    //   143	149	159	java/lang/Throwable
    //   227	232	233	java/lang/Throwable
    //   47	61	235	java/lang/Throwable
    //   101	108	241	java/lang/Throwable
    //   112	121	241	java/lang/Throwable
    //   122	139	241	java/lang/Throwable
    //   149	158	241	java/lang/Throwable
    //   160	164	241	java/lang/Throwable
    //   167	176	241	java/lang/Throwable
  }
  
  protected abstract void onViewPoints(Context paramContext);
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.PointsReceiver
 * JD-Core Version:    0.7.0.1
 */