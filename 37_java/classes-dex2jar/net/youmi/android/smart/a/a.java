package net.youmi.android.smart.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public class a
  extends g
{
  public static final String[] a = { "_id", "package", "white", "black", "last", "origin" };
  public static final d b = new d("package", "text not null unique");
  public static final d c = new d("white", "integer");
  public static final d d = new d("black", "integer");
  public static final d e = new d("last", "long");
  public static final d f = new d("origin", "integer");
  public static final d g = new d("last_req", "long");
  private static final d[] l = { k, b, c, d, e, f, g };
  
  a()
  {
    super("apps");
    this.j = l;
  }
  
  public static String a()
  {
    return a("apps", l);
  }
  
  public long a(String paramString)
  {
    paramString = this.i.rawQuery("select a._id from apps a where a.package = ?", new String[] { paramString });
    if (!paramString.moveToFirst()) {
      return 0L;
    }
    long l1 = paramString.getLong(0);
    paramString.close();
    return l1;
  }
  
  public ArrayList a(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.i.rawQuery("select * from apps a order by a.last DESC limit 1," + (paramInt + 1), null);
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        localArrayList.add(localCursor.getString(localCursor.getColumnIndex("package")));
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("white", Integer.valueOf(paramInt1));
    localContentValues.put("black", Integer.valueOf(paramInt2));
    localContentValues.put("last", Long.valueOf(paramLong1));
    localContentValues.put("origin", Integer.valueOf(paramInt3));
    localContentValues.put("last_req", Long.valueOf(paramLong2));
    this.i.update(this.h, localContentValues, "package = ? ", new String[] { paramString });
  }
  
  public void a(String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("last", Long.valueOf(paramLong));
    this.i.update(this.h, localContentValues, "package = ? ", new String[] { paramString });
  }
  
  public Long b(String paramString, int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("package", paramString);
    localContentValues.put("white", Integer.valueOf(paramInt1));
    localContentValues.put("black", Integer.valueOf(paramInt2));
    localContentValues.put("last", Long.valueOf(paramLong1));
    localContentValues.put("origin", Integer.valueOf(paramInt3));
    localContentValues.put("last_req", Long.valueOf(paramLong2));
    return Long.valueOf(this.i.insert("apps", null, localContentValues));
  }
  
  public net.youmi.android.smart.c.a b(String paramString)
  {
    net.youmi.android.smart.c.a locala = new net.youmi.android.smart.c.a();
    Cursor localCursor = this.i.rawQuery("select * from apps a where a.package = ?", new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      long l1 = localCursor.getLong(localCursor.getColumnIndex("white"));
      long l2 = localCursor.getLong(localCursor.getColumnIndex("black"));
      long l3 = localCursor.getLong(localCursor.getColumnIndex("origin"));
      long l4 = localCursor.getLong(localCursor.getColumnIndex("last"));
      long l5 = localCursor.getLong(localCursor.getColumnIndex("last_req"));
      locala.a(paramString);
      locala.a(l1);
      locala.b(l2);
      locala.c(l4);
      locala.d(l3);
      locala.e(l5);
    }
    localCursor.close();
    return locala;
  }
  
  public long c(String paramString)
  {
    long l2 = 0L;
    paramString = this.i.rawQuery("select a.last_req from apps a where a.package = ?", new String[] { paramString });
    long l1 = l2;
    if (paramString != null)
    {
      l1 = l2;
      if (paramString.moveToFirst()) {
        l1 = paramString.getLong(0);
      }
    }
    paramString.close();
    return l1;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.a.a
 * JD-Core Version:    0.7.0.1
 */