package net.youmi.android.e.b;

import java.util.Locale;
import net.youmi.android.c.c.e;

public class b
{
  private String a;
  private String b;
  private int c;
  private boolean d = false;
  private long e = 0L;
  private String f;
  private String g;
  private String h;
  
  protected b(String paramString)
  {
    if (paramString == null)
    {
      this.d = false;
      return;
    }
    paramString = paramString.trim();
    if (paramString.length() <= 0)
    {
      this.d = false;
      return;
    }
    this.a = paramString;
    this.b = e.a(paramString);
    this.f = this.a;
    this.g = this.b;
    this.c = this.b.hashCode();
    this.d = true;
  }
  
  protected b(String paramString1, String paramString2)
  {
    this(paramString1);
    a(paramString2);
  }
  
  protected b(String paramString1, String paramString2, long paramLong)
  {
    this(paramString1, paramString2);
    a(paramLong);
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  protected void a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      try
      {
        paramString = paramString.trim().toLowerCase(Locale.getDefault());
        if (paramString.length() > 0)
        {
          this.h = paramString;
          return;
        }
      }
      catch (Throwable paramString) {}
    }
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      try
      {
        paramString = paramString.trim();
        if (paramString.length() > 0)
        {
          String str = e.a(paramString);
          this.f = paramString;
          this.g = str;
          return;
        }
      }
      catch (Throwable paramString) {}
    }
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public long d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while (paramObject.hashCode() != hashCode()) {
      return false;
    }
    return true;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    return this.c;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.b.b
 * JD-Core Version:    0.7.0.1
 */