package net.youmi.android.c.b;

import android.content.Context;
import java.io.InputStream;
import java.util.Properties;

public class c
{
  public static Properties a(Context paramContext, String paramString)
  {
    localProperties = new Properties();
    try
    {
      paramContext = paramContext.openFileInput(paramString);
      if (paramContext != null) {
        localProperties.load(paramContext);
      }
      try
      {
        paramContext.close();
        return localProperties;
      }
      catch (Throwable paramContext)
      {
        return localProperties;
      }
      return localProperties;
    }
    catch (Throwable paramContext) {}
  }
  
  /* Error */
  public static boolean a(Context paramContext, Properties paramProperties, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 2
    //   5: monitorenter
    //   6: aload_0
    //   7: aload_2
    //   8: iconst_0
    //   9: invokevirtual 35	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   12: astore_0
    //   13: iload 4
    //   15: istore_3
    //   16: aload_0
    //   17: ifnull +15 -> 32
    //   20: aload_1
    //   21: aload_0
    //   22: aconst_null
    //   23: invokevirtual 39	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   26: aload_0
    //   27: invokevirtual 42	java/io/OutputStream:close	()V
    //   30: iconst_1
    //   31: istore_3
    //   32: ldc 2
    //   34: monitorexit
    //   35: iload_3
    //   36: ireturn
    //   37: astore_0
    //   38: goto -8 -> 30
    //   41: astore_0
    //   42: ldc 2
    //   44: monitorexit
    //   45: aload_0
    //   46: athrow
    //   47: astore_0
    //   48: iload 4
    //   50: istore_3
    //   51: goto -19 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramContext	Context
    //   0	54	1	paramProperties	Properties
    //   0	54	2	paramString	String
    //   15	36	3	bool1	boolean
    //   1	48	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   26	30	37	java/lang/Throwable
    //   6	13	41	finally
    //   20	26	41	finally
    //   26	30	41	finally
    //   6	13	47	java/lang/Throwable
    //   20	26	47	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.b.c
 * JD-Core Version:    0.7.0.1
 */