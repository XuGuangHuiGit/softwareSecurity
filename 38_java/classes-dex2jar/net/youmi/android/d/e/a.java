package net.youmi.android.d.e;

import java.util.HashMap;
import java.util.Locale;

public class a
{
  private static HashMap a;
  private static HashMap b;
  private static HashMap c;
  
  public static HashMap a()
  {
    try
    {
      Object localObject = Locale.getDefault();
      if (localObject != null)
      {
        if (((Locale)localObject).equals(Locale.SIMPLIFIED_CHINESE)) {
          return b();
        }
        if (((Locale)localObject).equals(Locale.TRADITIONAL_CHINESE))
        {
          localObject = c();
          return localObject;
        }
      }
    }
    catch (Throwable localThrowable) {}
    return d();
  }
  
  /* Error */
  private static HashMap b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   6: ifnonnull +167 -> 173
    //   9: new 40	java/util/HashMap
    //   12: dup
    //   13: invokespecial 44	java/util/HashMap:<init>	()V
    //   16: putstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   19: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   22: ldc 45
    //   24: ldc 47
    //   26: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   33: ldc 52
    //   35: ldc 54
    //   37: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   40: pop
    //   41: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   44: ldc 55
    //   46: ldc 57
    //   48: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   55: ldc 58
    //   57: ldc 60
    //   59: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   66: ldc 62
    //   68: ldc 64
    //   70: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   77: ldc 66
    //   79: ldc 68
    //   81: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   88: ldc 70
    //   90: ldc 72
    //   92: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   99: ldc 74
    //   101: ldc 76
    //   103: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   110: ldc 78
    //   112: ldc 80
    //   114: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   121: ldc 82
    //   123: ldc 84
    //   125: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   132: ldc 86
    //   134: ldc 88
    //   136: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   139: pop
    //   140: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   143: ldc 90
    //   145: ldc 92
    //   147: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   154: ldc 94
    //   156: ldc 96
    //   158: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   165: ldc 98
    //   167: ldc 100
    //   169: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   172: pop
    //   173: getstatic 38	net/youmi/android/d/e/a:a	Ljava/util/HashMap;
    //   176: astore_0
    //   177: ldc 2
    //   179: monitorexit
    //   180: aload_0
    //   181: areturn
    //   182: astore_0
    //   183: ldc 2
    //   185: monitorexit
    //   186: aload_0
    //   187: athrow
    //   188: astore_0
    //   189: goto -16 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   176	5	0	localHashMap	HashMap
    //   182	5	0	localObject	Object
    //   188	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	173	182	finally
    //   173	177	182	finally
    //   3	173	188	java/lang/Throwable
  }
  
  /* Error */
  private static HashMap c()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   6: ifnonnull +167 -> 173
    //   9: new 40	java/util/HashMap
    //   12: dup
    //   13: invokespecial 44	java/util/HashMap:<init>	()V
    //   16: putstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   19: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   22: ldc 45
    //   24: ldc 104
    //   26: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   33: ldc 52
    //   35: ldc 106
    //   37: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   40: pop
    //   41: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   44: ldc 55
    //   46: ldc 108
    //   48: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   55: ldc 58
    //   57: ldc 110
    //   59: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   66: ldc 62
    //   68: ldc 64
    //   70: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   77: ldc 66
    //   79: ldc 112
    //   81: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   88: ldc 70
    //   90: ldc 114
    //   92: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   99: ldc 74
    //   101: ldc 116
    //   103: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   110: ldc 78
    //   112: ldc 118
    //   114: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   121: ldc 82
    //   123: ldc 120
    //   125: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   132: ldc 86
    //   134: ldc 122
    //   136: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   139: pop
    //   140: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   143: ldc 90
    //   145: ldc 124
    //   147: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   154: ldc 94
    //   156: ldc 126
    //   158: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   165: ldc 98
    //   167: ldc 128
    //   169: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   172: pop
    //   173: getstatic 102	net/youmi/android/d/e/a:b	Ljava/util/HashMap;
    //   176: astore_0
    //   177: ldc 2
    //   179: monitorexit
    //   180: aload_0
    //   181: areturn
    //   182: astore_0
    //   183: ldc 2
    //   185: monitorexit
    //   186: aload_0
    //   187: athrow
    //   188: astore_0
    //   189: goto -16 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   176	5	0	localHashMap	HashMap
    //   182	5	0	localObject	Object
    //   188	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	173	182	finally
    //   173	177	182	finally
    //   3	173	188	java/lang/Throwable
  }
  
  /* Error */
  private static HashMap d()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   6: ifnonnull +167 -> 173
    //   9: new 40	java/util/HashMap
    //   12: dup
    //   13: invokespecial 44	java/util/HashMap:<init>	()V
    //   16: putstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   19: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   22: ldc 45
    //   24: ldc 132
    //   26: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   33: ldc 52
    //   35: ldc 134
    //   37: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   40: pop
    //   41: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   44: ldc 55
    //   46: ldc 136
    //   48: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   55: ldc 58
    //   57: ldc 138
    //   59: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   66: ldc 62
    //   68: ldc 140
    //   70: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   77: ldc 66
    //   79: ldc 142
    //   81: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   88: ldc 70
    //   90: ldc 144
    //   92: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   99: ldc 74
    //   101: ldc 146
    //   103: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   110: ldc 78
    //   112: ldc 148
    //   114: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   121: ldc 82
    //   123: ldc 150
    //   125: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   132: ldc 86
    //   134: ldc 152
    //   136: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   139: pop
    //   140: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   143: ldc 90
    //   145: ldc 154
    //   147: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   154: ldc 94
    //   156: ldc 156
    //   158: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   165: ldc 98
    //   167: ldc 158
    //   169: invokevirtual 51	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   172: pop
    //   173: getstatic 130	net/youmi/android/d/e/a:c	Ljava/util/HashMap;
    //   176: astore_0
    //   177: ldc 2
    //   179: monitorexit
    //   180: aload_0
    //   181: areturn
    //   182: astore_0
    //   183: ldc 2
    //   185: monitorexit
    //   186: aload_0
    //   187: athrow
    //   188: astore_0
    //   189: goto -16 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   176	5	0	localHashMap	HashMap
    //   182	5	0	localObject	Object
    //   188	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	173	182	finally
    //   173	177	182	finally
    //   3	173	188	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.e.a
 * JD-Core Version:    0.7.0.1
 */