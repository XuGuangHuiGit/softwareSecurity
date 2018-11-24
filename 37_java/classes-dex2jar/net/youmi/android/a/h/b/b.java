package net.youmi.android.a.h.b;

import net.youmi.android.a.h.y;
import org.json.JSONObject;

public abstract class b
  implements a
{
  protected y a;
  protected net.youmi.android.a.h.a b;
  
  static String a(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null) {
      try
      {
        paramJSONObject = paramJSONObject.toString();
        return paramJSONObject;
      }
      catch (Throwable paramJSONObject) {}
    }
    return b(3);
  }
  
  public static JSONObject a(int paramInt)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("c", paramInt);
      return localJSONObject;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static String b(int paramInt)
  {
    try
    {
      Object localObject = a(paramInt);
      if (localObject != null)
      {
        localObject = ((JSONObject)localObject).toString();
        return localObject;
      }
    }
    catch (Throwable localThrowable) {}
    return "";
  }
  
  public void a(net.youmi.android.a.h.a parama)
  {
    this.b = parama;
  }
  
  public void a(y paramy)
  {
    this.a = paramy;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.h.b.b
 * JD-Core Version:    0.7.0.1
 */