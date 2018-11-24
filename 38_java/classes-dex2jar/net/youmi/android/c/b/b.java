package net.youmi.android.c.b;

import org.json.JSONArray;
import org.json.JSONObject;

public class b
{
  public static double a(JSONObject paramJSONObject, String paramString, double paramDouble)
  {
    double d = paramDouble;
    if (paramJSONObject != null) {
      d = paramDouble;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString)) {
        d = paramJSONObject.getDouble(paramString);
      }
      return d;
    }
    catch (Throwable paramJSONObject) {}
    return paramDouble;
  }
  
  public static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    int i = paramInt;
    if (paramJSONObject != null) {
      i = paramInt;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString)) {
        i = paramJSONObject.getInt(paramString);
      }
      return i;
    }
    catch (Throwable paramJSONObject) {}
    return paramInt;
  }
  
  public static long a(JSONObject paramJSONObject, String paramString, long paramLong)
  {
    long l = paramLong;
    if (paramJSONObject != null) {
      l = paramLong;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString)) {
        l = paramJSONObject.getLong(paramString);
      }
      return l;
    }
    catch (Throwable paramJSONObject) {}
    return paramLong;
  }
  
  public static String a(JSONArray paramJSONArray, int paramInt, String paramString)
  {
    Object localObject = paramString;
    if (paramJSONArray != null) {
      localObject = paramString;
    }
    try
    {
      if (paramJSONArray.length() > paramInt)
      {
        localObject = paramString;
        if (paramInt > -1)
        {
          paramJSONArray = paramJSONArray.getString(paramInt);
          localObject = paramString;
          if (paramJSONArray != null)
          {
            paramJSONArray = paramJSONArray.trim();
            paramInt = paramJSONArray.length();
            localObject = paramString;
            if (paramInt > 0) {
              localObject = paramJSONArray;
            }
          }
        }
      }
      return localObject;
    }
    catch (Throwable paramJSONArray) {}
    return paramString;
  }
  
  public static String a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    Object localObject = paramString2;
    if (paramJSONObject != null) {
      localObject = paramString2;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString1))
      {
        paramJSONObject = paramJSONObject.getString(paramString1);
        localObject = paramString2;
        if (paramJSONObject != null)
        {
          paramJSONObject = paramJSONObject.trim();
          int i = paramJSONObject.length();
          localObject = paramString2;
          if (i > 0) {
            localObject = paramJSONObject;
          }
        }
      }
      return localObject;
    }
    catch (Throwable paramJSONObject) {}
    return paramString2;
  }
  
  public static JSONArray a(JSONObject paramJSONObject, String paramString, JSONArray paramJSONArray)
  {
    JSONArray localJSONArray = paramJSONArray;
    if (paramJSONObject != null) {
      localJSONArray = paramJSONArray;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString)) {
        localJSONArray = paramJSONObject.getJSONArray(paramString);
      }
      return localJSONArray;
    }
    catch (Throwable paramJSONObject) {}
    return paramJSONArray;
  }
  
  public static JSONObject a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public static JSONObject a(JSONArray paramJSONArray, int paramInt, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject;
    if (paramJSONArray != null) {
      localJSONObject = paramJSONObject;
    }
    try
    {
      if (paramJSONArray.length() > paramInt)
      {
        localJSONObject = paramJSONObject;
        if (paramInt > -1) {
          localJSONObject = paramJSONArray.getJSONObject(paramInt);
        }
      }
      return localJSONObject;
    }
    catch (Throwable paramJSONArray) {}
    return paramJSONObject;
  }
  
  public static JSONObject a(JSONObject paramJSONObject1, String paramString, JSONObject paramJSONObject2)
  {
    JSONObject localJSONObject = paramJSONObject2;
    if (paramJSONObject1 != null) {
      localJSONObject = paramJSONObject2;
    }
    try
    {
      if (!paramJSONObject1.isNull(paramString)) {
        localJSONObject = paramJSONObject1.getJSONObject(paramString);
      }
      return localJSONObject;
    }
    catch (Throwable paramJSONObject1) {}
    return paramJSONObject2;
  }
  
  public static boolean a(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (paramJSONObject != null) {
      bool = paramBoolean;
    }
    try
    {
      if (!paramJSONObject.isNull(paramString)) {
        bool = paramJSONObject.getBoolean(paramString);
      }
      return bool;
    }
    catch (Throwable paramJSONObject) {}
    return paramBoolean;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.b.b
 * JD-Core Version:    0.7.0.1
 */