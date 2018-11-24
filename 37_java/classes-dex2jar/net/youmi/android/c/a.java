package net.youmi.android.c;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.util.Locale;
import net.youmi.android.c.k.i;

public class a
{
  private static String a;
  private static String b;
  private static String c;
  private static String d;
  private static String e;
  private static int f = -1;
  private static int g = -1;
  private static String h;
  private static String i;
  
  public static String a()
  {
    try
    {
      if (c == null)
      {
        Locale localLocale = Locale.getDefault();
        c = String.format("%s-%s", new Object[] { localLocale.getLanguage(), localLocale.getCountry() });
      }
      label36:
      return c;
    }
    catch (Throwable localThrowable)
    {
      break label36;
    }
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (paramContext != null)
      {
        paramContext = paramContext.trim().toLowerCase();
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_1
    //   5: invokestatic 76	net/youmi/android/c/b/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnonnull +28 -> 38
    //   13: iconst_0
    //   14: ifeq +11 -> 25
    //   17: new 78	java/lang/NullPointerException
    //   20: dup
    //   21: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   24: athrow
    //   25: iconst_0
    //   26: ifeq +11 -> 37
    //   29: new 78	java/lang/NullPointerException
    //   32: dup
    //   33: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   36: athrow
    //   37: return
    //   38: aload_1
    //   39: ldc 83
    //   41: invokestatic 88	net/youmi/android/c/c/g:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: astore 4
    //   46: new 90	java/io/FileWriter
    //   49: dup
    //   50: aload_0
    //   51: ldc 92
    //   53: invokevirtual 96	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   56: invokespecial 99	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   59: astore_0
    //   60: new 101	java/io/BufferedWriter
    //   63: dup
    //   64: aload_0
    //   65: invokespecial 104	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   68: astore_1
    //   69: aload_1
    //   70: aload 4
    //   72: invokevirtual 108	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   75: aload_1
    //   76: invokevirtual 111	java/io/BufferedWriter:flush	()V
    //   79: aload_0
    //   80: ifnull +7 -> 87
    //   83: aload_0
    //   84: invokevirtual 114	java/io/FileWriter:close	()V
    //   87: aload_1
    //   88: ifnull -51 -> 37
    //   91: aload_1
    //   92: invokevirtual 115	java/io/BufferedWriter:close	()V
    //   95: return
    //   96: astore_0
    //   97: return
    //   98: astore_0
    //   99: aconst_null
    //   100: astore_0
    //   101: aload_3
    //   102: astore_1
    //   103: aload_1
    //   104: ifnull +7 -> 111
    //   107: aload_1
    //   108: invokevirtual 114	java/io/FileWriter:close	()V
    //   111: aload_0
    //   112: ifnull -75 -> 37
    //   115: aload_0
    //   116: invokevirtual 115	java/io/BufferedWriter:close	()V
    //   119: return
    //   120: astore_0
    //   121: return
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_0
    //   125: aload_0
    //   126: ifnull +7 -> 133
    //   129: aload_0
    //   130: invokevirtual 114	java/io/FileWriter:close	()V
    //   133: aload_2
    //   134: ifnull +7 -> 141
    //   137: aload_2
    //   138: invokevirtual 115	java/io/BufferedWriter:close	()V
    //   141: aload_1
    //   142: athrow
    //   143: astore_0
    //   144: goto -119 -> 25
    //   147: astore_0
    //   148: return
    //   149: astore_0
    //   150: goto -63 -> 87
    //   153: astore_1
    //   154: goto -43 -> 111
    //   157: astore_0
    //   158: goto -25 -> 133
    //   161: astore_0
    //   162: goto -21 -> 141
    //   165: astore_1
    //   166: goto -41 -> 125
    //   169: astore_3
    //   170: aload_1
    //   171: astore_2
    //   172: aload_3
    //   173: astore_1
    //   174: goto -49 -> 125
    //   177: astore_1
    //   178: aconst_null
    //   179: astore_2
    //   180: aload_0
    //   181: astore_1
    //   182: aload_2
    //   183: astore_0
    //   184: goto -81 -> 103
    //   187: astore_2
    //   188: aload_0
    //   189: astore_2
    //   190: aload_1
    //   191: astore_0
    //   192: aload_2
    //   193: astore_1
    //   194: goto -91 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	paramContext	Context
    //   0	197	1	paramString	String
    //   1	182	2	str1	String
    //   187	1	2	localThrowable	Throwable
    //   189	4	2	localContext	Context
    //   3	99	3	localObject1	Object
    //   169	4	3	localObject2	Object
    //   44	27	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   91	95	96	java/lang/Throwable
    //   4	9	98	java/lang/Throwable
    //   38	60	98	java/lang/Throwable
    //   115	119	120	java/lang/Throwable
    //   4	9	122	finally
    //   38	60	122	finally
    //   17	25	143	java/lang/Throwable
    //   29	37	147	java/lang/Throwable
    //   83	87	149	java/lang/Throwable
    //   107	111	153	java/lang/Throwable
    //   129	133	157	java/lang/Throwable
    //   137	141	161	java/lang/Throwable
    //   60	69	165	finally
    //   69	79	169	finally
    //   60	69	177	java/lang/Throwable
    //   69	79	187	java/lang/Throwable
  }
  
  public static String b()
  {
    try
    {
      if (d == null)
      {
        Field localField = Build.class.getField("MANUFACTURER");
        if (localField != null) {
          d = localField.get(Build.class).toString().trim();
        }
      }
    }
    catch (Throwable localThrowable)
    {
      label33:
      break label33;
    }
    if (d == null) {
      return Build.BRAND;
    }
    return d;
  }
  
  public static String b(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = a(paramContext);
      }
      if (b != null)
      {
        paramContext = b;
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  public static String c()
  {
    return "android " + Build.VERSION.RELEASE;
  }
  
  public static String c(Context paramContext)
  {
    try
    {
      if (h == null) {
        h = l(paramContext);
      }
      if (h != null)
      {
        paramContext = h;
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  public static String d()
  {
    return Build.MODEL;
  }
  
  public static String d(Context paramContext)
  {
    try
    {
      if (i == null) {
        i = m(paramContext);
      }
      if (i != null)
      {
        paramContext = i;
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  public static String e(Context paramContext)
  {
    try
    {
      if (i.g(paramContext))
      {
        String str = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        if (str != null)
        {
          str = str.trim().replace(":", "").toLowerCase(Locale.ENGLISH);
          if ((str != null) && (str.length() > 0)) {
            a(paramContext, str);
          }
          return str;
        }
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  /* Error */
  public static String f(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: ldc 92
    //   7: invokevirtual 96	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   10: astore_0
    //   11: aload_0
    //   12: ifnonnull +32 -> 44
    //   15: ldc 70
    //   17: astore_0
    //   18: iconst_0
    //   19: ifeq +11 -> 30
    //   22: new 78	java/lang/NullPointerException
    //   25: dup
    //   26: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   29: athrow
    //   30: iconst_0
    //   31: ifeq +11 -> 42
    //   34: new 78	java/lang/NullPointerException
    //   37: dup
    //   38: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   41: athrow
    //   42: aload_0
    //   43: areturn
    //   44: aload_0
    //   45: invokevirtual 218	java/io/File:exists	()Z
    //   48: ifne +34 -> 82
    //   51: ldc 70
    //   53: astore_0
    //   54: iconst_0
    //   55: ifeq +11 -> 66
    //   58: new 78	java/lang/NullPointerException
    //   61: dup
    //   62: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   65: athrow
    //   66: iconst_0
    //   67: ifeq -25 -> 42
    //   70: new 78	java/lang/NullPointerException
    //   73: dup
    //   74: invokespecial 81	java/lang/NullPointerException:<init>	()V
    //   77: athrow
    //   78: astore_0
    //   79: ldc 70
    //   81: areturn
    //   82: new 220	java/io/FileReader
    //   85: dup
    //   86: aload_0
    //   87: invokespecial 221	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   90: astore_1
    //   91: new 223	java/io/BufferedReader
    //   94: dup
    //   95: aload_1
    //   96: invokespecial 226	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   99: astore_0
    //   100: aload_0
    //   101: invokevirtual 229	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   104: invokestatic 76	net/youmi/android/c/b/e:b	(Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_2
    //   108: aload_2
    //   109: ifnonnull +31 -> 140
    //   112: ldc 70
    //   114: astore_2
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 230	java/io/BufferedReader:close	()V
    //   123: aload_2
    //   124: astore_0
    //   125: aload_1
    //   126: ifnull -84 -> 42
    //   129: aload_1
    //   130: invokevirtual 231	java/io/FileReader:close	()V
    //   133: ldc 70
    //   135: areturn
    //   136: astore_0
    //   137: ldc 70
    //   139: areturn
    //   140: aload_2
    //   141: ldc 83
    //   143: invokestatic 233	net/youmi/android/c/c/g:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   146: astore_2
    //   147: aload_0
    //   148: ifnull +7 -> 155
    //   151: aload_0
    //   152: invokevirtual 230	java/io/BufferedReader:close	()V
    //   155: aload_2
    //   156: astore_0
    //   157: aload_1
    //   158: ifnull -116 -> 42
    //   161: aload_1
    //   162: invokevirtual 231	java/io/FileReader:close	()V
    //   165: aload_2
    //   166: areturn
    //   167: astore_0
    //   168: aload_2
    //   169: areturn
    //   170: astore_0
    //   171: aconst_null
    //   172: astore_0
    //   173: aload_3
    //   174: astore_1
    //   175: aload_0
    //   176: ifnull +7 -> 183
    //   179: aload_0
    //   180: invokevirtual 230	java/io/BufferedReader:close	()V
    //   183: aload_1
    //   184: ifnull +7 -> 191
    //   187: aload_1
    //   188: invokevirtual 231	java/io/FileReader:close	()V
    //   191: ldc 70
    //   193: areturn
    //   194: astore_0
    //   195: aconst_null
    //   196: astore_1
    //   197: aload_2
    //   198: ifnull +7 -> 205
    //   201: aload_2
    //   202: invokevirtual 230	java/io/BufferedReader:close	()V
    //   205: aload_1
    //   206: ifnull +7 -> 213
    //   209: aload_1
    //   210: invokevirtual 231	java/io/FileReader:close	()V
    //   213: aload_0
    //   214: athrow
    //   215: astore_1
    //   216: goto -186 -> 30
    //   219: astore_0
    //   220: ldc 70
    //   222: areturn
    //   223: astore_1
    //   224: goto -158 -> 66
    //   227: astore_0
    //   228: goto -105 -> 123
    //   231: astore_0
    //   232: goto -77 -> 155
    //   235: astore_0
    //   236: goto -53 -> 183
    //   239: astore_0
    //   240: goto -49 -> 191
    //   243: astore_2
    //   244: goto -39 -> 205
    //   247: astore_1
    //   248: goto -35 -> 213
    //   251: astore_0
    //   252: goto -55 -> 197
    //   255: astore_3
    //   256: aload_0
    //   257: astore_2
    //   258: aload_3
    //   259: astore_0
    //   260: goto -63 -> 197
    //   263: astore_0
    //   264: aconst_null
    //   265: astore_0
    //   266: goto -91 -> 175
    //   269: astore_2
    //   270: goto -95 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramContext	Context
    //   90	120	1	localObject1	Object
    //   215	1	1	localThrowable1	Throwable
    //   223	1	1	localThrowable2	Throwable
    //   247	1	1	localThrowable3	Throwable
    //   1	201	2	str	String
    //   243	1	2	localThrowable4	Throwable
    //   257	1	2	localContext	Context
    //   269	1	2	localThrowable5	Throwable
    //   3	171	3	localObject2	Object
    //   255	4	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   70	78	78	java/lang/Throwable
    //   129	133	136	java/lang/Throwable
    //   161	165	167	java/lang/Throwable
    //   4	11	170	java/lang/Throwable
    //   44	51	170	java/lang/Throwable
    //   82	91	170	java/lang/Throwable
    //   4	11	194	finally
    //   44	51	194	finally
    //   82	91	194	finally
    //   22	30	215	java/lang/Throwable
    //   34	42	219	java/lang/Throwable
    //   58	66	223	java/lang/Throwable
    //   119	123	227	java/lang/Throwable
    //   151	155	231	java/lang/Throwable
    //   179	183	235	java/lang/Throwable
    //   187	191	239	java/lang/Throwable
    //   201	205	243	java/lang/Throwable
    //   209	213	247	java/lang/Throwable
    //   91	100	251	finally
    //   100	108	255	finally
    //   140	147	255	finally
    //   91	100	263	java/lang/Throwable
    //   100	108	269	java/lang/Throwable
    //   140	147	269	java/lang/Throwable
  }
  
  public static String g(Context paramContext)
  {
    try
    {
      if ((a == null) || (a.length() <= 0)) {
        a = e(paramContext);
      }
      if ((a == null) || (a.length() <= 0)) {
        a = f(paramContext);
      }
      if (a != null)
      {
        paramContext = a;
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return "";
  }
  
  public static void h(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null) {
        try
        {
          paramContext = paramContext.getNetworkOperatorName();
          if (paramContext == null)
          {
            e = "";
            return;
          }
          e = paramContext;
          return;
        }
        catch (Throwable paramContext) {}
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static String i(Context paramContext)
  {
    if (e == null) {
      h(paramContext);
    }
    if (e == null) {
      return "";
    }
    return e;
  }
  
  public static int j(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        int j = paramContext.getPhoneType();
        return j;
      }
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static int k(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        int j = paramContext.getNetworkType();
        return j;
      }
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  /* Error */
  private static String l(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 242
    //   3: invokevirtual 182	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 244	android/telephony/TelephonyManager
    //   9: astore_0
    //   10: aload_0
    //   11: ifnull +178 -> 189
    //   14: aload_0
    //   15: invokevirtual 263	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull +169 -> 189
    //   23: aload_2
    //   24: astore_0
    //   25: aload_2
    //   26: ifnull +152 -> 178
    //   29: aload_2
    //   30: astore_0
    //   31: aload_2
    //   32: invokevirtual 65	java/lang/String:trim	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: astore_0
    //   38: aload_3
    //   39: ldc_w 265
    //   42: invokevirtual 269	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   45: iconst_m1
    //   46: if_icmple +15 -> 61
    //   49: aload_3
    //   50: astore_0
    //   51: aload_3
    //   52: ldc_w 265
    //   55: ldc 70
    //   57: invokevirtual 199	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   60: pop
    //   61: aload_3
    //   62: astore_2
    //   63: aload_3
    //   64: astore_0
    //   65: aload_3
    //   66: ldc_w 271
    //   69: invokevirtual 269	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   72: iconst_m1
    //   73: if_icmple +15 -> 88
    //   76: aload_3
    //   77: astore_0
    //   78: aload_3
    //   79: ldc_w 271
    //   82: ldc 70
    //   84: invokevirtual 199	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   87: astore_2
    //   88: aload_2
    //   89: astore_3
    //   90: aload_2
    //   91: astore_0
    //   92: aload_2
    //   93: ldc_w 273
    //   96: invokevirtual 269	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   99: iconst_m1
    //   100: if_icmple +15 -> 115
    //   103: aload_2
    //   104: astore_0
    //   105: aload_2
    //   106: ldc_w 273
    //   109: ldc 70
    //   111: invokevirtual 199	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   114: astore_3
    //   115: aload_3
    //   116: astore_0
    //   117: aload_3
    //   118: ldc_w 275
    //   121: invokevirtual 269	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   124: istore_1
    //   125: aload_3
    //   126: astore_2
    //   127: iload_1
    //   128: iconst_m1
    //   129: if_icmple +18 -> 147
    //   132: aload_3
    //   133: astore_0
    //   134: aload_3
    //   135: ldc_w 275
    //   138: invokevirtual 210	java/lang/String:length	()I
    //   141: iload_1
    //   142: iadd
    //   143: invokevirtual 279	java/lang/String:substring	(I)Ljava/lang/String;
    //   146: astore_2
    //   147: aload_2
    //   148: astore_0
    //   149: aload_2
    //   150: invokevirtual 65	java/lang/String:trim	()Ljava/lang/String;
    //   153: astore_2
    //   154: aload_2
    //   155: astore_0
    //   156: aload_2
    //   157: invokevirtual 68	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   160: astore_2
    //   161: aload_2
    //   162: astore_0
    //   163: aload_2
    //   164: invokevirtual 210	java/lang/String:length	()I
    //   167: istore_1
    //   168: aload_2
    //   169: astore_0
    //   170: iload_1
    //   171: bipush 10
    //   173: if_icmpge +5 -> 178
    //   176: aconst_null
    //   177: astore_0
    //   178: aload_0
    //   179: areturn
    //   180: astore_0
    //   181: aconst_null
    //   182: areturn
    //   183: astore_0
    //   184: aconst_null
    //   185: areturn
    //   186: astore_2
    //   187: aload_0
    //   188: areturn
    //   189: aconst_null
    //   190: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	paramContext	Context
    //   124	50	1	j	int
    //   18	151	2	localObject1	Object
    //   186	1	2	localThrowable	Throwable
    //   35	100	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	10	180	java/lang/Throwable
    //   14	19	183	java/lang/Throwable
    //   31	36	186	java/lang/Throwable
    //   38	49	186	java/lang/Throwable
    //   51	61	186	java/lang/Throwable
    //   65	76	186	java/lang/Throwable
    //   78	88	186	java/lang/Throwable
    //   92	103	186	java/lang/Throwable
    //   105	115	186	java/lang/Throwable
    //   117	125	186	java/lang/Throwable
    //   134	147	186	java/lang/Throwable
    //   149	154	186	java/lang/Throwable
    //   156	161	186	java/lang/Throwable
    //   163	168	186	java/lang/Throwable
  }
  
  /* Error */
  private static String m(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 242
    //   3: invokevirtual 182	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 244	android/telephony/TelephonyManager
    //   9: astore_0
    //   10: aload_0
    //   11: ifnull +50 -> 61
    //   14: aload_0
    //   15: invokevirtual 282	android/telephony/TelephonyManager:getSubscriberId	()Ljava/lang/String;
    //   18: astore_0
    //   19: aload_0
    //   20: ifnull +41 -> 61
    //   23: aload_0
    //   24: invokevirtual 65	java/lang/String:trim	()Ljava/lang/String;
    //   27: astore_2
    //   28: aload_2
    //   29: astore_0
    //   30: aload_2
    //   31: invokevirtual 68	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   34: astore_2
    //   35: aload_2
    //   36: astore_0
    //   37: aload_2
    //   38: invokevirtual 210	java/lang/String:length	()I
    //   41: istore_1
    //   42: iload_1
    //   43: bipush 10
    //   45: if_icmpge +5 -> 50
    //   48: aconst_null
    //   49: astore_2
    //   50: aload_2
    //   51: areturn
    //   52: astore_0
    //   53: aconst_null
    //   54: areturn
    //   55: astore_0
    //   56: aconst_null
    //   57: areturn
    //   58: astore_2
    //   59: aload_0
    //   60: areturn
    //   61: aconst_null
    //   62: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramContext	Context
    //   41	5	1	j	int
    //   27	24	2	str	String
    //   58	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	10	52	java/lang/Throwable
    //   14	19	55	java/lang/Throwable
    //   23	28	55	java/lang/Throwable
    //   30	35	58	java/lang/Throwable
    //   37	42	58	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.a
 * JD-Core Version:    0.7.0.1
 */