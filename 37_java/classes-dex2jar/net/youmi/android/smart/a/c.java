package net.youmi.android.smart.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class c
  extends net.youmi.android.c.d.a
{
  public c(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(a.a());
  }
  
  public void a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.a.c
 * JD-Core Version:    0.7.0.1
 */