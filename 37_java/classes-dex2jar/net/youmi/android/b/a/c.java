package net.youmi.android.b.a;

import java.io.ByteArrayOutputStream;

public class c
{
  public static final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (paramString == null) {}
    Object localObject;
    do
    {
      for (;;)
      {
        return;
        localObject = paramString;
        try
        {
          String str = paramString.trim();
          localObject = str;
          if (str.length() != 0)
          {
            paramString = str;
            localObject = str;
            if (str.indexOf('&') > -1)
            {
              localObject = str;
              paramString = str.replace('&', '_');
            }
            localObject = paramString;
            paramByteArrayOutputStream.write(paramString.getBytes("UTF-8"));
            return;
          }
        }
        catch (Throwable paramString) {}
      }
    } while (localObject == null);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.b.a.c
 * JD-Core Version:    0.7.0.1
 */