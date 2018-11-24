package net.youmi.android.e.a;

import android.content.Context;

public class g
{
  b a;
  private Context b;
  private int c = 1;
  
  public g(Context paramContext, String paramString, d paramd)
  {
    this.b = paramContext.getApplicationContext();
    this.a = new b(paramString, paramd);
  }
  
  public g(Context paramContext, String paramString, d paramd, int paramInt)
  {
    this.b = paramContext.getApplicationContext();
    this.a = new b(paramString, paramd);
    this.c = paramInt;
  }
  
  public String a()
  {
    return this.a.a();
  }
  
  public String a(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = this.a.a(this.b, paramString1, this.c);
      paramString1 = paramString2;
      if (localObject != null)
      {
        localObject = new String((byte[])localObject, "UTF-8");
        paramString1 = paramString2;
        if (localObject != null)
        {
          localObject = ((String)localObject).trim();
          int i = ((String)localObject).length();
          paramString1 = paramString2;
          if (i > 0) {
            paramString1 = (String)localObject;
          }
        }
      }
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
  
  public boolean a(String paramString)
  {
    try
    {
      boolean bool = this.a.a(paramString);
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public boolean a(String paramString1, String paramString2, long paramLong)
  {
    if ((paramString2 == null) || (paramString1 == null)) {
      return false;
    }
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      boolean bool = this.a.a(this.b, paramString1, paramString2, paramLong, this.c);
      return bool;
    }
    catch (Throwable paramString1) {}
    return false;
  }
  
  public d b()
  {
    return this.a.b();
  }
  
  public int c()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.a.g
 * JD-Core Version:    0.7.0.1
 */