package net.youmi.android.offers;

import android.content.Context;
import android.content.Intent;
import net.youmi.android.c.b.b;
import net.youmi.android.c.h.d;
import net.youmi.android.offers.b.b.c.h;
import net.youmi.android.offers.b.b.c.j;
import org.json.JSONArray;
import org.json.JSONObject;

public class c
  extends net.youmi.android.d.d.a.a
{
  private void a(Context paramContext, String paramString)
  {
    try
    {
      paramString = b.a(paramString);
      if (paramString == null) {
        return;
      }
      b(paramContext, paramString);
      if (a(paramString)) {
        a(paramContext, paramString);
      }
      c(paramContext, paramString);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void a(Context paramContext, EarnPointsOrderList paramEarnPointsOrderList)
  {
    try
    {
      Object localObject = PointsReceiver.getActionName_EarnPoints(paramContext);
      if (localObject == null) {
        return;
      }
      localObject = new Intent((String)localObject);
      ((Intent)localObject).putExtra("a13aa5059675e8b8242a7b02292cc6ce", paramEarnPointsOrderList);
      paramContext.sendBroadcast((Intent)localObject);
      return;
    }
    catch (Throwable paramContext)
    {
      paramContext = paramContext;
      return;
    }
    finally {}
  }
  
  private void a(Context paramContext, JSONObject paramJSONObject)
  {
    for (;;)
    {
      try
      {
        String str1 = b.a(paramJSONObject, "u", null);
        j.a(paramContext, b.a(paramJSONObject, "acck", null));
        paramJSONObject = b.a(paramJSONObject, "d", null);
        if (paramJSONObject == null) {
          return;
        }
        JSONArray localJSONArray = b.a(paramJSONObject, "os", null);
        if (localJSONArray == null) {
          break;
        }
        int i = 0;
        paramJSONObject = null;
        if (i < localJSONArray.length())
        {
          Object localObject3 = b.a(localJSONArray, i, null);
          Object localObject1;
          if (localObject3 == null)
          {
            localObject1 = paramJSONObject;
            i += 1;
            paramJSONObject = (JSONObject)localObject1;
          }
          else
          {
            Object localObject2 = paramJSONObject;
            try
            {
              int j = b.a((JSONObject)localObject3, "points", 0);
              localObject1 = paramJSONObject;
              if (j <= 0) {
                continue;
              }
              localObject2 = paramJSONObject;
              localObject1 = b.a((JSONObject)localObject3, "oid", null);
              localObject2 = paramJSONObject;
              int k = b.a((JSONObject)localObject3, "chn", 0);
              localObject2 = paramJSONObject;
              String str2 = b.a((JSONObject)localObject3, "user", null);
              localObject2 = paramJSONObject;
              int m = b.a((JSONObject)localObject3, "status", 0);
              localObject2 = paramJSONObject;
              String str3 = b.a((JSONObject)localObject3, "msg", null);
              localObject2 = paramJSONObject;
              int n = b.a((JSONObject)localObject3, "wadid", 0);
              localObject2 = paramJSONObject;
              String str4 = b.a((JSONObject)localObject3, "name", null);
              localObject2 = paramJSONObject;
              long l = b.a((JSONObject)localObject3, "time", 0L);
              localObject2 = paramJSONObject;
              localObject3 = new EarnPointsOrderInfo();
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).a(k);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).c(str3);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).d(str4);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).a((String)localObject1);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).c(j);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).b(m);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).a(l * 1000L);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).b(str2);
              localObject2 = paramJSONObject;
              ((EarnPointsOrderInfo)localObject3).d(n);
              localObject1 = paramJSONObject;
              if (paramJSONObject == null)
              {
                localObject2 = paramJSONObject;
                paramJSONObject = new EarnPointsOrderList();
              }
            }
            catch (Throwable paramJSONObject)
            {
              try
              {
                paramJSONObject.a(str1);
                localObject1 = paramJSONObject;
                localObject2 = localObject1;
                ((EarnPointsOrderList)localObject1).a((EarnPointsOrderInfo)localObject3);
              }
              catch (Throwable localThrowable)
              {
                JSONObject localJSONObject = paramJSONObject;
              }
              paramJSONObject = paramJSONObject;
              localObject1 = localObject2;
            }
          }
        }
        else
        {
          if ((paramJSONObject == null) || (paramJSONObject.size() <= 0)) {
            break;
          }
          a(paramContext, paramJSONObject);
          b(paramContext, paramJSONObject);
          return;
        }
      }
      catch (Throwable paramContext)
      {
        return;
      }
    }
  }
  
  private boolean a(JSONObject paramJSONObject)
  {
    boolean bool = false;
    try
    {
      int i = b.a(paramJSONObject, "c", -999);
      if (i == 0) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable paramJSONObject) {}
    return false;
  }
  
  private void b(Context paramContext)
  {
    try
    {
      String str = net.youmi.android.offers.b.b.a.a.a(paramContext, j.a(paramContext));
      if (str == null) {
        return;
      }
      a(paramContext, d.a(paramContext, str));
      return;
    }
    catch (Throwable paramContext)
    {
      paramContext = paramContext;
      return;
    }
    finally {}
  }
  
  /* Error */
  private void b(Context paramContext, EarnPointsOrderList paramEarnPointsOrderList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_2
    //   3: invokevirtual 143	net/youmi/android/offers/EarnPointsOrderList:size	()I
    //   6: istore 4
    //   8: iload_3
    //   9: iload 4
    //   11: if_icmpge +61 -> 72
    //   14: aload_2
    //   15: iload_3
    //   16: invokevirtual 164	net/youmi/android/offers/EarnPointsOrderList:get	(I)Lnet/youmi/android/offers/EarnPointsOrderInfo;
    //   19: astore 5
    //   21: aload 5
    //   23: ifnull +41 -> 64
    //   26: aload 5
    //   28: invokevirtual 167	net/youmi/android/offers/EarnPointsOrderInfo:getPoints	()I
    //   31: ifle +33 -> 64
    //   34: aload_1
    //   35: aload 5
    //   37: invokestatic 172	net/youmi/android/offers/b/b/c/e:a	(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;)V
    //   40: aload_1
    //   41: invokestatic 177	net/youmi/android/offers/b/b/c/d:a	(Landroid/content/Context;)Lnet/youmi/android/offers/b/b/c/d;
    //   44: aload 5
    //   46: invokevirtual 167	net/youmi/android/offers/EarnPointsOrderInfo:getPoints	()I
    //   49: invokevirtual 180	net/youmi/android/offers/b/b/c/d:b	(I)Z
    //   52: ifeq +12 -> 64
    //   55: ldc 182
    //   57: iconst_0
    //   58: anewarray 184	java/lang/Object
    //   61: invokestatic 189	net/youmi/android/c/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: iload_3
    //   65: iconst_1
    //   66: iadd
    //   67: istore_3
    //   68: goto -60 -> 8
    //   71: astore_1
    //   72: return
    //   73: astore 5
    //   75: goto -11 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	c
    //   0	78	1	paramContext	Context
    //   0	78	2	paramEarnPointsOrderList	EarnPointsOrderList
    //   1	67	3	i	int
    //   6	6	4	j	int
    //   19	26	5	localEarnPointsOrderInfo	EarnPointsOrderInfo
    //   73	1	5	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	8	71	java/lang/Throwable
    //   14	21	73	java/lang/Throwable
    //   26	64	73	java/lang/Throwable
  }
  
  private void b(Context paramContext, JSONObject paramJSONObject)
  {
    try
    {
      long l = b.a(paramJSONObject, "fb", 0L);
      if (l == 0L) {
        return;
      }
      if (l < 0L)
      {
        h.b(paramContext);
        return;
      }
      h.a(paramContext, l * 1000L);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void c(Context paramContext, JSONObject paramJSONObject) {}
  
  /* Error */
  public void a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokevirtual 202	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +8 -> 16
    //   11: aload_2
    //   12: invokestatic 204	net/youmi/android/offers/b/b/c/h:c	(Landroid/content/Context;)V
    //   15: return
    //   16: aload_1
    //   17: invokestatic 207	net/youmi/android/offers/b/b/c/i:c	(Landroid/content/Context;)V
    //   20: aload_2
    //   21: astore_3
    //   22: aload_0
    //   23: aload_2
    //   24: invokespecial 208	net/youmi/android/offers/c:b	(Landroid/content/Context;)V
    //   27: aload_2
    //   28: invokestatic 204	net/youmi/android/offers/b/b/c/h:c	(Landroid/content/Context;)V
    //   31: return
    //   32: astore_1
    //   33: return
    //   34: astore_1
    //   35: aload_3
    //   36: invokestatic 204	net/youmi/android/offers/b/b/c/h:c	(Landroid/content/Context;)V
    //   39: return
    //   40: astore_1
    //   41: return
    //   42: astore_1
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 204	net/youmi/android/offers/b/b/c/h:c	(Landroid/content/Context;)V
    //   49: aload_1
    //   50: athrow
    //   51: astore_1
    //   52: return
    //   53: astore_1
    //   54: goto -34 -> 20
    //   57: astore_2
    //   58: goto -9 -> 49
    //   61: astore_1
    //   62: goto -17 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	c
    //   0	65	1	paramContext	Context
    //   6	40	2	localContext	Context
    //   57	1	2	localThrowable	Throwable
    //   1	35	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	31	32	java/lang/Throwable
    //   2	7	34	java/lang/Throwable
    //   22	27	34	java/lang/Throwable
    //   35	39	40	java/lang/Throwable
    //   2	7	42	finally
    //   11	15	51	java/lang/Throwable
    //   16	20	53	java/lang/Throwable
    //   45	49	57	java/lang/Throwable
    //   16	20	61	finally
    //   22	27	61	finally
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.offers.c
 * JD-Core Version:    0.7.0.1
 */