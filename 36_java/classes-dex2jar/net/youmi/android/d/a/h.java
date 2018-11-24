package net.youmi.android.d.a;

import java.util.Random;
import net.youmi.android.a.a.c;
import net.youmi.android.c.b.b;
import org.json.JSONObject;

public class h
  implements c
{
  private int a;
  private int b;
  
  public h()
  {
    try
    {
      this.a = new Random(System.currentTimeMillis()).nextInt();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public JSONObject a()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("a", this.a);
      localJSONObject.put("b", this.b);
      return localJSONObject;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public boolean a(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null) {}
    try
    {
      this.a = b.a(paramJSONObject, "a", this.a);
      this.b = b.a(paramJSONObject, "b", this.b);
      label32:
      return true;
    }
    catch (Throwable paramJSONObject)
    {
      break label32;
    }
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int c()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.d.a.h
 * JD-Core Version:    0.7.0.1
 */