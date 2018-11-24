package net.youmi.android.smart.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public class b
{
  private static b d;
  public final a a;
  c b;
  private final SQLiteDatabase c;
  
  private b(Context paramContext)
  {
    this.b = new c(paramContext, net.youmi.android.a.g.a.b(paramContext, 1).b("Sw2Md3B4xR5gT1h").getAbsolutePath(), null, 1);
    this.c = this.b.a();
    this.a = new a();
    this.a.a(this.c);
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      d = new b(paramContext);
      return;
    }
    finally {}
  }
  
  public static b b(Context paramContext)
  {
    if (d == null) {
      a(paramContext);
    }
    return d;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.a.b
 * JD-Core Version:    0.7.0.1
 */