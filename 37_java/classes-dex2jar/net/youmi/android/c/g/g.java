package net.youmi.android.c.g;

import android.content.Context;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.json.JSONObject;

public class g
{
  public static void a(Context paramContext, JSONObject paramJSONObject, String paramString, int paramInt)
  {
    try
    {
      paramContext = new DatagramSocket(paramInt);
      paramString = InetAddress.getByName(paramString);
      paramJSONObject = paramJSONObject.toString().getBytes();
      paramContext.send(new DatagramPacket(paramJSONObject, paramJSONObject.length, paramString, paramInt));
      paramContext.close();
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.g.g
 * JD-Core Version:    0.7.0.1
 */