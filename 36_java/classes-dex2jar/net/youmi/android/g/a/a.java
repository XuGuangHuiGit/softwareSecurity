package net.youmi.android.g.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class a
{
  public static Bitmap a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramString = net.youmi.android.c.c.a.a(paramString);
        if (paramString != null)
        {
          paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
          return paramString;
        }
      }
      catch (Throwable paramString) {}
    }
    return null;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.g.a.a
 * JD-Core Version:    0.7.0.1
 */