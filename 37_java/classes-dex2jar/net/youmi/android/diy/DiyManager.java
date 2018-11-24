package net.youmi.android.diy;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import net.youmi.android.AdBrowser;
import net.youmi.android.a.a.a.d;
import net.youmi.android.a.a.a.g;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.j;
import net.youmi.android.a.h.l;
import net.youmi.android.f.a.o;
import net.youmi.android.f.a.u;
import org.json.JSONArray;
import org.json.JSONObject;

public class DiyManager
{
  public static final String BANNERURL = "http://au.youmi.net/regular/aos/banner.html";
  protected static boolean a = true;
  private static List b;
  private static String c;
  private static String d;
  private static int e = 0;
  
  private static void a(Context paramContext, int paramInt)
  {
    l locall = new l(7, 405);
    locall.e("http://au.youmi.net/regular/aos/lists.html?rtype=" + paramInt);
    locall.b(1);
    Intent localIntent = new Intent(paramContext, AdBrowser.class);
    localIntent.putExtra("aca5522945c72310f9f22b333c68f2b3", locall);
    localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }
  
  public static boolean checkDiyAdConfig(Context paramContext)
  {
    return net.youmi.android.dev.a.d(paramContext);
  }
  
  public static void downloadAd(Context paramContext, int paramInt)
  {
    int i;
    Object localObject1;
    if ((b != null) && (b.size() > 0))
    {
      i = 0;
      if (i >= b.size()) {
        break label242;
      }
      localObject1 = (AdObject)b.get(i);
      if (((AdObject)localObject1).getAdId() != paramInt) {
        break label235;
      }
    }
    for (;;)
    {
      i locali = new i();
      locali.b(true);
      locali.a(true);
      locali.b(((AdObject)localObject1).b());
      net.youmi.android.a.a.a.a locala = new net.youmi.android.a.a.a.a(((AdObject)localObject1).getAdId(), 7);
      Object localObject2 = new d();
      ((d)localObject2).a(((AdObject)localObject1).a());
      locala.a((d)localObject2);
      locali.a(locala);
      localObject2 = new g();
      ((g)localObject2).b(((AdObject)localObject1).getPackageName());
      ((g)localObject2).a(((AdObject)localObject1).getAppName());
      locala.a((g)localObject2);
      localObject1 = new j();
      ((j)localObject1).b(d);
      ((j)localObject1).a(net.youmi.android.f.a.a.c);
      ((j)localObject1).c(c);
      ((j)localObject1).d(URLEncoder.encode("ad=" + paramInt));
      locali.a((j)localObject1);
      net.youmi.android.d.a.a.a(paramContext).a(locali, null);
      return;
      label235:
      i += 1;
      break;
      label242:
      localObject1 = null;
    }
  }
  
  public static List getAdList(Context paramContext)
  {
    if (a) {
      initAdObjects(paramContext);
    }
    if ((b != null) && (b.size() > 0)) {
      return b;
    }
    return null;
  }
  
  /* Error */
  public static AdObject getAdObject(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: getstatic 87	net/youmi/android/diy/DiyManager:b	Ljava/util/List;
    //   5: ifnonnull +95 -> 100
    //   8: aload_0
    //   9: invokestatic 191	net/youmi/android/diy/DiyManager:getAdList	(Landroid/content/Context;)Ljava/util/List;
    //   12: astore 5
    //   14: aload 5
    //   16: ifnull +121 -> 137
    //   19: aload 5
    //   21: invokeinterface 195 1 0
    //   26: ifne +111 -> 137
    //   29: aload_0
    //   30: ldc 197
    //   32: iconst_0
    //   33: invokevirtual 201	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   36: astore 6
    //   38: aload 6
    //   40: ldc 203
    //   42: iconst_m1
    //   43: invokeinterface 209 3 0
    //   48: istore_3
    //   49: iload_3
    //   50: iconst_m1
    //   51: if_icmpeq +57 -> 108
    //   54: iload_3
    //   55: istore_1
    //   56: aload 5
    //   58: iload_1
    //   59: invokeinterface 97 2 0
    //   64: checkcast 99	net/youmi/android/diy/AdObject
    //   67: astore_0
    //   68: aload 6
    //   70: invokeinterface 213 1 0
    //   75: astore 5
    //   77: aload 5
    //   79: ldc 203
    //   81: iload_1
    //   82: iconst_1
    //   83: iadd
    //   84: invokeinterface 219 3 0
    //   89: pop
    //   90: aload 5
    //   92: invokeinterface 222 1 0
    //   97: pop
    //   98: aload_0
    //   99: areturn
    //   100: getstatic 87	net/youmi/android/diy/DiyManager:b	Ljava/util/List;
    //   103: astore 5
    //   105: goto -91 -> 14
    //   108: aload 5
    //   110: invokeinterface 93 1 0
    //   115: istore 4
    //   117: iload_2
    //   118: istore_1
    //   119: iload_3
    //   120: iload 4
    //   122: if_icmplt -66 -> 56
    //   125: iload_2
    //   126: istore_1
    //   127: goto -71 -> 56
    //   130: astore_0
    //   131: aconst_null
    //   132: areturn
    //   133: astore 5
    //   135: aload_0
    //   136: areturn
    //   137: aconst_null
    //   138: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	paramContext	Context
    //   55	72	1	i	int
    //   1	125	2	j	int
    //   48	75	3	k	int
    //   115	8	4	m	int
    //   12	97	5	localObject	Object
    //   133	1	5	localThrowable	Throwable
    //   36	33	6	localSharedPreferences	android.content.SharedPreferences
    // Exception table:
    //   from	to	target	type
    //   2	14	130	java/lang/Throwable
    //   19	49	130	java/lang/Throwable
    //   56	68	130	java/lang/Throwable
    //   100	105	130	java/lang/Throwable
    //   108	117	130	java/lang/Throwable
    //   68	98	133	java/lang/Throwable
  }
  
  public static void initAdObjects(Context paramContext)
  {
    a = false;
    if ((b == null) || (b.isEmpty()))
    {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        new a(paramContext).execute(new Void[0]);
      }
    }
    else {
      return;
    }
    new Handler(Looper.getMainLooper()).post(new c(paramContext));
  }
  
  public static void loadAdObjects(Context paramContext)
  {
    if ((b != null) && (b.size() > 0)) {
      net.youmi.android.c.e.a.d("AdObjectList exists already.", new Object[0]);
    }
    for (;;)
    {
      return;
      try
      {
        Object localObject1 = net.youmi.android.f.a.a.c(paramContext, "");
        if (localObject1 != null)
        {
          localObject1 = net.youmi.android.c.b.b.a((String)localObject1);
          int i = net.youmi.android.c.b.b.a((JSONObject)localObject1, "c", -1);
          if (i == 0)
          {
            b = new ArrayList();
            localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "d", null);
            c = net.youmi.android.c.b.b.a((JSONObject)localObject1, "e", "");
            d = net.youmi.android.c.b.b.a((JSONObject)localObject1, "rsd", "");
            localObject1 = net.youmi.android.c.b.b.a((JSONObject)localObject1, "ad", null);
            i = 0;
            while (i < ((JSONArray)localObject1).length())
            {
              Object localObject2 = ((JSONArray)localObject1).getJSONObject(i);
              int j = net.youmi.android.c.b.b.a((JSONObject)localObject2, "id", 0);
              int k = net.youmi.android.c.b.b.a((JSONObject)localObject2, "at", 0);
              String str1 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "pn", "");
              String str2 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "name", "");
              int m = net.youmi.android.c.b.b.a((JSONObject)localObject2, "pvc", 0);
              String str3 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "pvn", "");
              String str4 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "desc", "");
              String str5 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "adtxt", "");
              String str6 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "price", "");
              String str7 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "size", "");
              String str8 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "cat", "");
              String str9 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "siu", "");
              JSONArray localJSONArray = net.youmi.android.c.b.b.a((JSONObject)localObject2, "sss", null);
              String str10 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "url", "");
              String str11 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "md5", "");
              String str12 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "author", "");
              int n = net.youmi.android.c.b.b.a((JSONObject)localObject2, "isr", 0);
              String str13 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "alerttips", "");
              int i1 = net.youmi.android.c.b.b.a((JSONObject)localObject2, "exp", 0);
              localObject2 = o.a(paramContext, str9);
              AdObject localAdObject = new AdObject();
              localAdObject.setAdId(j);
              localAdObject.a(k);
              localAdObject.setPackageName(str1);
              localAdObject.setAppName(str2);
              localAdObject.setVersionCode(m);
              localAdObject.setVersionName(str3);
              localAdObject.setDescription(str4);
              localAdObject.setAdText(str5);
              localAdObject.a(str6);
              localAdObject.setSize(str7);
              localAdObject.setCategory(str8);
              localAdObject.setIconUrl(str9);
              localAdObject.a(localJSONArray);
              localAdObject.b(str10);
              localAdObject.c(str11);
              localAdObject.setAuthor(str12);
              localAdObject.b(n);
              localAdObject.d(str13);
              localAdObject.c(i1);
              localAdObject.setIcon((Bitmap)localObject2);
              b.add(localAdObject);
              i += 1;
            }
            net.youmi.android.c.e.a.a(u.a, "自定义广告数据获取成功。", new Object[0]);
            return;
          }
          paramContext = net.youmi.android.f.a.b.a(i);
          net.youmi.android.c.e.a.a(u.a, "YoumiDiyAd request result code:%d, %s", new Object[] { Integer.valueOf(i), paramContext });
          return;
        }
      }
      catch (Throwable paramContext) {}
    }
  }
  
  public static void showRecommendAppWall(Context paramContext)
  {
    a(paramContext, 3);
  }
  
  public static void showRecommendGameWall(Context paramContext)
  {
    a(paramContext, 2);
  }
  
  public static void showRecommendWall(Context paramContext)
  {
    a(paramContext, 1);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.DiyManager
 * JD-Core Version:    0.7.0.1
 */