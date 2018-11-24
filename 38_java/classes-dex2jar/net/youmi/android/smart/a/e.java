package net.youmi.android.smart.a;

import android.database.sqlite.SQLiteDatabase;

public abstract class e
{
  protected final String h;
  protected SQLiteDatabase i;
  protected d[] j;
  
  public e(String paramString)
  {
    this.h = paramString;
  }
  
  public static String a(String paramString, d[] paramArrayOfd)
  {
    StringBuilder localStringBuilder = new StringBuilder("create table ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (");
    int m = 1;
    int n = paramArrayOfd.length;
    int k = 0;
    if (k < n)
    {
      paramString = paramArrayOfd[k];
      if (m != 0) {
        m = 0;
      }
      for (;;)
      {
        localStringBuilder.append(paramString.a());
        localStringBuilder.append(' ');
        localStringBuilder.append(paramString.b());
        k += 1;
        break;
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append(");");
    return localStringBuilder.toString();
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase)
  {
    this.i = paramSQLiteDatabase;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.a.e
 * JD-Core Version:    0.7.0.1
 */