package net.youmi.android.c.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import net.youmi.android.c.c.a;

public class b
{
  protected Bitmap b;
  
  public b(String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = a.a(paramString);
      this.b = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
      return;
    }
    catch (Throwable paramString) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.i.b
 * JD-Core Version:    0.7.0.1
 */