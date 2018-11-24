package net.youmi.android.dev;

import android.content.Context;
import net.youmi.android.b.b.a;
import net.youmi.android.c.c.g;
import org.json.JSONObject;

public class b
{
  private static String a()
  {
    try
    {
      String str = g.b("0b444d46591c4c4416534c195f154c4a0c44580f4b5f06454e5015404b40024d05514539164001574c50", "YGDw6oRf");
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  /* Error */
  public static String a(Context paramContext)
  {
    // Byte code:
    //   0: new 22	net/youmi/android/b/a/b
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	net/youmi/android/b/a/b:<init>	(Landroid/content/Context;)V
    //   8: astore_3
    //   9: invokestatic 28	net/youmi/android/dev/b:a	()Ljava/lang/String;
    //   12: astore 4
    //   14: aload 4
    //   16: ifnonnull +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: new 30	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 33	java/lang/StringBuilder:<init>	()V
    //   28: astore_2
    //   29: aload_2
    //   30: aload 4
    //   32: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_0
    //   37: invokestatic 43	net/youmi/android/b/b/a:e	(Landroid/content/Context;)I
    //   40: istore_1
    //   41: aload_2
    //   42: ldc 45
    //   44: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_3
    //   48: invokevirtual 46	net/youmi/android/b/a/b:a	()Ljava/lang/String;
    //   51: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_2
    //   56: ldc 48
    //   58: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: aload_0
    //   62: invokestatic 52	net/youmi/android/c/h/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   65: invokestatic 57	net/youmi/android/c/c/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   68: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_2
    //   73: ldc 59
    //   75: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_0
    //   79: invokestatic 62	net/youmi/android/b/b/a:f	(Landroid/content/Context;)I
    //   82: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_2
    //   87: ldc 67
    //   89: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: iload_1
    //   93: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_2
    //   98: ldc 69
    //   100: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_0
    //   104: invokestatic 70	net/youmi/android/b/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   107: invokestatic 57	net/youmi/android/c/c/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   110: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload_2
    //   115: ldc 72
    //   117: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   123: ldc2_w 79
    //   126: ldiv
    //   127: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_2
    //   132: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: astore_0
    //   136: aload_0
    //   137: areturn
    //   138: astore_0
    //   139: aconst_null
    //   140: areturn
    //   141: astore_0
    //   142: goto -11 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramContext	Context
    //   40	53	1	i	int
    //   28	104	2	localStringBuilder	java.lang.StringBuilder
    //   8	40	3	localb	net.youmi.android.b.a.b
    //   12	19	4	str	String
    // Exception table:
    //   from	to	target	type
    //   0	14	138	java/lang/Throwable
    //   21	41	138	java/lang/Throwable
    //   131	136	138	java/lang/Throwable
    //   41	131	141	java/lang/Throwable
  }
  
  private static AppUpdateInfo a(Context paramContext, String paramString)
  {
    try
    {
      int i = a.e(paramContext);
      if (paramString == null) {
        return null;
      }
      paramContext = net.youmi.android.c.b.b.a(paramString);
      if ((paramContext != null) && (net.youmi.android.c.b.b.a(paramContext, "c", 0) == 0))
      {
        Object localObject = net.youmi.android.c.b.b.a(paramContext, "d", null);
        if (localObject != null)
        {
          paramContext = net.youmi.android.c.b.b.a((JSONObject)localObject, "url", null);
          if (paramContext != null)
          {
            int j = net.youmi.android.c.b.b.a((JSONObject)localObject, "vc", 0);
            if (j > i)
            {
              paramString = net.youmi.android.c.b.b.a((JSONObject)localObject, "vn", null);
              localObject = net.youmi.android.c.b.b.a((JSONObject)localObject, "tips", null);
              AppUpdateInfo localAppUpdateInfo = new AppUpdateInfo();
              localAppUpdateInfo.b((String)localObject);
              localAppUpdateInfo.c(paramContext);
              localAppUpdateInfo.a(j);
              localAppUpdateInfo.a(paramString);
              return localAppUpdateInfo;
            }
          }
        }
      }
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  /* Error */
  public static AppUpdateInfo b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 128	net/youmi/android/dev/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +22 -> 28
    //   9: ldc 130
    //   11: iconst_2
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: aconst_null
    //   22: aastore
    //   23: invokestatic 135	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aconst_null
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokestatic 140	net/youmi/android/c/h/d:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_2
    //   34: aload_2
    //   35: ifnonnull +25 -> 60
    //   38: ldc 130
    //   40: iconst_2
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_1
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: aload_2
    //   51: aastore
    //   52: invokestatic 135	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aconst_null
    //   56: areturn
    //   57: astore_0
    //   58: aconst_null
    //   59: areturn
    //   60: aload_0
    //   61: aload_2
    //   62: invokestatic 142	net/youmi/android/dev/b:a	(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/dev/AppUpdateInfo;
    //   65: astore_0
    //   66: ldc 130
    //   68: iconst_2
    //   69: anewarray 4	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_1
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: aload_2
    //   79: aastore
    //   80: invokestatic 135	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_0
    //   84: areturn
    //   85: astore_1
    //   86: aload_0
    //   87: areturn
    //   88: astore_0
    //   89: aconst_null
    //   90: astore_2
    //   91: aconst_null
    //   92: astore_1
    //   93: ldc 130
    //   95: iconst_2
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_1
    //   102: aastore
    //   103: dup
    //   104: iconst_1
    //   105: aload_2
    //   106: aastore
    //   107: invokestatic 135	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aconst_null
    //   111: areturn
    //   112: astore_0
    //   113: aconst_null
    //   114: areturn
    //   115: astore_0
    //   116: aconst_null
    //   117: astore_1
    //   118: aconst_null
    //   119: astore_2
    //   120: ldc 130
    //   122: iconst_2
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_1
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: aload_2
    //   133: aastore
    //   134: invokestatic 135	net/youmi/android/c/e/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_0
    //   138: athrow
    //   139: astore_1
    //   140: goto -3 -> 137
    //   143: astore_0
    //   144: aconst_null
    //   145: astore_2
    //   146: goto -26 -> 120
    //   149: astore_0
    //   150: goto -30 -> 120
    //   153: astore_0
    //   154: aconst_null
    //   155: astore_2
    //   156: goto -63 -> 93
    //   159: astore_0
    //   160: goto -67 -> 93
    //   163: astore_0
    //   164: aconst_null
    //   165: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramContext	Context
    //   4	71	1	str1	String
    //   85	1	1	localThrowable1	Throwable
    //   92	37	1	localObject	Object
    //   139	1	1	localThrowable2	Throwable
    //   33	123	2	str2	String
    // Exception table:
    //   from	to	target	type
    //   38	55	57	java/lang/Throwable
    //   66	83	85	java/lang/Throwable
    //   0	5	88	java/lang/Throwable
    //   93	110	112	java/lang/Throwable
    //   0	5	115	finally
    //   120	137	139	java/lang/Throwable
    //   28	34	143	finally
    //   60	66	149	finally
    //   28	34	153	java/lang/Throwable
    //   60	66	159	java/lang/Throwable
    //   9	26	163	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.dev.b
 * JD-Core Version:    0.7.0.1
 */