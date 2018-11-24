package net.youmi.android.c.g;

import android.content.Context;
import java.io.OutputStream;
import java.net.Socket;
import org.json.JSONObject;

public class f
{
  public static void a(Context paramContext, JSONObject paramJSONObject, String paramString, int paramInt)
  {
    try
    {
      paramContext = new Socket(paramString, paramInt);
      paramString = paramContext.getOutputStream();
      paramString.write(paramJSONObject.toString().getBytes());
      paramString.flush();
      paramString.close();
      paramContext.close();
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.f
 * JD-Core Version:    0.7.0.1
 */