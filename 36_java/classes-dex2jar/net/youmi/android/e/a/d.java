package net.youmi.android.e.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import net.youmi.android.c.b.e;

public class d
  extends SQLiteOpenHelper
{
  private static d a;
  private static d b;
  private static d c;
  private String d;
  private int e = 0;
  private SQLiteDatabase f;
  
  public d(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
    this.d = paramString;
    this.e = paramInt;
  }
  
  private int a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString)
  {
    return (int)paramSQLiteDatabase.insert(paramString, null, paramContentValues);
  }
  
  private int a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2, String paramString3)
  {
    return (int)paramSQLiteDatabase.update(paramString3, paramContentValues, paramString1 + "=?", new String[] { paramString2 });
  }
  
  private void a(ContentValues paramContentValues, String paramString, long paramLong)
  {
    if ((paramContentValues == null) || (e.a(paramString))) {
      return;
    }
    paramContentValues.put(paramString, Long.valueOf(paramLong));
  }
  
  private void a(ContentValues paramContentValues, String paramString1, String paramString2)
  {
    if ((paramContentValues == null) || (e.a(paramString2)) || (e.a(paramString1))) {
      return;
    }
    paramContentValues.put(paramString1, paramString2);
  }
  
  private void a(ContentValues paramContentValues, String paramString, byte[] paramArrayOfByte)
  {
    if ((paramContentValues == null) || (e.a(paramString)) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    paramContentValues.put(paramString, paramArrayOfByte);
  }
  
  private boolean a(ContentValues paramContentValues, String paramString)
  {
    boolean bool = false;
    try
    {
      long l = getWritableDatabase().insert(paramString, null, paramContentValues);
      if (l > -1L) {
        bool = true;
      }
      return bool;
    }
    catch (Throwable paramContentValues) {}
    return false;
  }
  
  /* Error */
  private boolean a(ContentValues paramContentValues, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload_0
    //   4: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 6
    //   9: aload 6
    //   11: astore 7
    //   13: aload 6
    //   15: aload 4
    //   17: aload_1
    //   18: new 34	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   25: aload_2
    //   26: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 43
    //   31: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: iconst_1
    //   38: anewarray 49	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: aload_3
    //   44: aastore
    //   45: invokevirtual 53	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   48: istore 5
    //   50: iload 5
    //   52: i2l
    //   53: ldc2_w 87
    //   56: lcmp
    //   57: ifle +15 -> 72
    //   60: aload 6
    //   62: ifnull +8 -> 70
    //   65: aload 6
    //   67: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   70: iconst_1
    //   71: ireturn
    //   72: aload 6
    //   74: ifnull +8 -> 82
    //   77: aload 6
    //   79: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   82: iconst_0
    //   83: ireturn
    //   84: astore_1
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_1
    //   88: ifnull -6 -> 82
    //   91: aload_1
    //   92: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   95: goto -13 -> 82
    //   98: astore_1
    //   99: goto -17 -> 82
    //   102: astore_1
    //   103: aload 7
    //   105: ifnull +8 -> 113
    //   108: aload 7
    //   110: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   113: aload_1
    //   114: athrow
    //   115: astore_1
    //   116: iconst_1
    //   117: ireturn
    //   118: astore_1
    //   119: goto -37 -> 82
    //   122: astore_2
    //   123: goto -10 -> 113
    //   126: astore_1
    //   127: aload 6
    //   129: astore_1
    //   130: goto -43 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	d
    //   0	133	1	paramContentValues	ContentValues
    //   0	133	2	paramString1	String
    //   0	133	3	paramString2	String
    //   0	133	4	paramString3	String
    //   48	3	5	i	int
    //   7	121	6	localSQLiteDatabase	SQLiteDatabase
    //   1	108	7	localObject	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   3	9	84	java/lang/Throwable
    //   91	95	98	java/lang/Throwable
    //   3	9	102	finally
    //   13	50	102	finally
    //   65	70	115	java/lang/Throwable
    //   77	82	118	java/lang/Throwable
    //   108	113	122	java/lang/Throwable
    //   13	50	126	java/lang/Throwable
  }
  
  private boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramSQLiteDatabase = paramSQLiteDatabase.query(paramString1, null, paramString2 + "=?", new String[] { paramString3 }, null, null, null);
      boolean bool = paramSQLiteDatabase.moveToFirst();
      return bool;
    }
    catch (Throwable paramSQLiteDatabase)
    {
      try
      {
        paramSQLiteDatabase.close();
        return bool;
      }
      catch (Throwable paramSQLiteDatabase) {}
      paramSQLiteDatabase = paramSQLiteDatabase;
      return false;
    }
  }
  
  /* Error */
  private boolean a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 6
    //   6: aload 6
    //   8: aload_1
    //   9: aconst_null
    //   10: new 34	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   17: aload_2
    //   18: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc 43
    //   23: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: iconst_1
    //   30: anewarray 49	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: aload_3
    //   36: aastore
    //   37: aconst_null
    //   38: aconst_null
    //   39: aconst_null
    //   40: invokevirtual 97	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   43: astore_1
    //   44: aload_1
    //   45: invokeinterface 103 1 0
    //   50: istore 4
    //   52: aload_1
    //   53: invokeinterface 104 1 0
    //   58: aload 6
    //   60: ifnull +8 -> 68
    //   63: aload 6
    //   65: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   68: iload 4
    //   70: istore 5
    //   72: iload 5
    //   74: ireturn
    //   75: astore_1
    //   76: iload 4
    //   78: ireturn
    //   79: astore_1
    //   80: aconst_null
    //   81: astore_1
    //   82: iconst_0
    //   83: istore 4
    //   85: iload 4
    //   87: istore 5
    //   89: aload_1
    //   90: ifnull -18 -> 72
    //   93: aload_1
    //   94: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   97: iload 4
    //   99: ireturn
    //   100: astore_1
    //   101: iload 4
    //   103: ireturn
    //   104: astore_1
    //   105: aconst_null
    //   106: astore 6
    //   108: aload 6
    //   110: ifnull +8 -> 118
    //   113: aload 6
    //   115: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   118: aload_1
    //   119: athrow
    //   120: astore_2
    //   121: goto -3 -> 118
    //   124: astore_1
    //   125: goto -17 -> 108
    //   128: astore_1
    //   129: aload 6
    //   131: astore_1
    //   132: iconst_0
    //   133: istore 4
    //   135: goto -50 -> 85
    //   138: astore_1
    //   139: aload 6
    //   141: astore_1
    //   142: goto -57 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	d
    //   0	145	1	paramString1	String
    //   0	145	2	paramString2	String
    //   0	145	3	paramString3	String
    //   50	84	4	bool1	boolean
    //   70	18	5	bool2	boolean
    //   4	136	6	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   63	68	75	java/lang/Throwable
    //   0	6	79	java/lang/Throwable
    //   93	97	100	java/lang/Throwable
    //   0	6	104	finally
    //   113	118	120	java/lang/Throwable
    //   6	52	124	finally
    //   52	58	124	finally
    //   6	52	128	java/lang/Throwable
    //   52	58	138	java/lang/Throwable
  }
  
  private static String b()
  {
    return "create table if not exists YINcpuKxQ5cA(_id integer primary key autoincrement,a text UNIQUE, b blob, c integer, d integer);";
  }
  
  private static String c(String paramString)
  {
    return "drop table if exists " + paramString;
  }
  
  /* Error */
  public static d d(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 113	net/youmi/android/e/a/d:a	Lnet/youmi/android/e/a/d;
    //   6: ifnonnull +20 -> 26
    //   9: new 2	net/youmi/android/e/a/d
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual 119	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: ldc 121
    //   19: iconst_2
    //   20: invokespecial 123	net/youmi/android/e/a/d:<init>	(Landroid/content/Context;Ljava/lang/String;I)V
    //   23: putstatic 113	net/youmi/android/e/a/d:a	Lnet/youmi/android/e/a/d;
    //   26: getstatic 113	net/youmi/android/e/a/d:a	Lnet/youmi/android/e/a/d;
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    //   41: astore_0
    //   42: goto -16 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	26	35	finally
    //   26	30	35	finally
    //   3	26	41	java/lang/Throwable
  }
  
  /* Error */
  private boolean d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   5: putfield 125	net/youmi/android/e/a/d:f	Landroid/database/sqlite/SQLiteDatabase;
    //   8: aload_0
    //   9: getfield 125	net/youmi/android/e/a/d:f	Landroid/database/sqlite/SQLiteDatabase;
    //   12: ifnull +37 -> 49
    //   15: aload_0
    //   16: getfield 125	net/youmi/android/e/a/d:f	Landroid/database/sqlite/SQLiteDatabase;
    //   19: ldc 127
    //   21: ldc 129
    //   23: iconst_1
    //   24: anewarray 49	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: invokevirtual 133	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   34: istore_2
    //   35: iload_2
    //   36: ifle +5 -> 41
    //   39: iconst_1
    //   40: ireturn
    //   41: iconst_0
    //   42: ireturn
    //   43: astore_1
    //   44: iconst_0
    //   45: ireturn
    //   46: astore_1
    //   47: aload_1
    //   48: athrow
    //   49: iconst_0
    //   50: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	d
    //   0	51	1	paramString	String
    //   34	2	2	i	int
    // Exception table:
    //   from	to	target	type
    //   0	35	43	java/lang/Throwable
    //   0	35	46	finally
  }
  
  /* Error */
  public static d e(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 135	net/youmi/android/e/a/d:b	Lnet/youmi/android/e/a/d;
    //   6: ifnonnull +20 -> 26
    //   9: new 2	net/youmi/android/e/a/d
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual 119	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: ldc 137
    //   19: iconst_2
    //   20: invokespecial 123	net/youmi/android/e/a/d:<init>	(Landroid/content/Context;Ljava/lang/String;I)V
    //   23: putstatic 135	net/youmi/android/e/a/d:b	Lnet/youmi/android/e/a/d;
    //   26: getstatic 135	net/youmi/android/e/a/d:b	Lnet/youmi/android/e/a/d;
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    //   41: astore_0
    //   42: goto -16 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	26	35	finally
    //   26	30	35	finally
    //   3	26	41	java/lang/Throwable
  }
  
  /* Error */
  public static d f(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 139	net/youmi/android/e/a/d:c	Lnet/youmi/android/e/a/d;
    //   6: ifnonnull +20 -> 26
    //   9: new 2	net/youmi/android/e/a/d
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual 119	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: ldc 141
    //   19: iconst_3
    //   20: invokespecial 123	net/youmi/android/e/a/d:<init>	(Landroid/content/Context;Ljava/lang/String;I)V
    //   23: putstatic 139	net/youmi/android/e/a/d:c	Lnet/youmi/android/e/a/d;
    //   26: getstatic 139	net/youmi/android/e/a/d:c	Lnet/youmi/android/e/a/d;
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    //   41: astore_0
    //   42: goto -16 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	26	35	finally
    //   26	30	35	finally
    //   3	26	41	java/lang/Throwable
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_1
    //   9: aload_1
    //   10: astore_2
    //   11: aload_1
    //   12: ldc 127
    //   14: ldc 143
    //   16: iconst_1
    //   17: anewarray 49	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   25: invokestatic 152	java/lang/Long:toString	(J)Ljava/lang/String;
    //   28: aastore
    //   29: invokevirtual 133	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   32: pop
    //   33: aload_1
    //   34: ifnull +7 -> 41
    //   37: aload_1
    //   38: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: aload_2
    //   46: ifnull -5 -> 41
    //   49: aload_2
    //   50: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   53: goto -12 -> 41
    //   56: astore_1
    //   57: goto -16 -> 41
    //   60: astore_1
    //   61: aconst_null
    //   62: astore_2
    //   63: aload_2
    //   64: ifnull +7 -> 71
    //   67: aload_2
    //   68: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: goto -38 -> 41
    //   82: astore_2
    //   83: goto -12 -> 71
    //   86: astore_3
    //   87: aload_1
    //   88: astore_2
    //   89: aload_3
    //   90: astore_1
    //   91: goto -28 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	d
    //   8	30	1	localSQLiteDatabase	SQLiteDatabase
    //   44	1	1	localThrowable1	Throwable
    //   56	1	1	localThrowable2	Throwable
    //   60	12	1	localObject1	java.lang.Object
    //   73	4	1	localObject2	java.lang.Object
    //   78	10	1	localThrowable3	Throwable
    //   90	1	1	localObject3	java.lang.Object
    //   3	65	2	localObject4	java.lang.Object
    //   82	1	2	localThrowable4	Throwable
    //   88	1	2	localObject5	java.lang.Object
    //   86	4	3	localObject6	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   4	9	44	java/lang/Throwable
    //   11	33	44	java/lang/Throwable
    //   49	53	56	java/lang/Throwable
    //   4	9	60	finally
    //   37	41	73	finally
    //   49	53	73	finally
    //   67	71	73	finally
    //   71	73	73	finally
    //   37	41	78	java/lang/Throwable
    //   67	71	82	java/lang/Throwable
    //   11	33	86	finally
  }
  
  public boolean a(String paramString, byte[] paramArrayOfByte, long paramLong)
  {
    boolean bool2 = false;
    try
    {
      boolean bool1 = e.a(paramString);
      if (bool1) {
        bool1 = bool2;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if (paramArrayOfByte != null)
        {
          bool1 = bool2;
          if (paramArrayOfByte.length != 0)
          {
            long l2 = System.currentTimeMillis();
            long l1 = -1L;
            if (paramLong > 0L) {
              l1 = l2 + paramLong;
            }
            try
            {
              ContentValues localContentValues = new ContentValues();
              a(localContentValues, "a", paramString);
              a(localContentValues, "b", paramArrayOfByte);
              a(localContentValues, "c", l2);
              a(localContentValues, "d", l1);
              if (a("YINcpuKxQ5cA", "a", paramString)) {
                bool1 = a(localContentValues, "a", paramString, "YINcpuKxQ5cA");
              } else {
                bool1 = a(localContentValues, "YINcpuKxQ5cA");
              }
            }
            catch (Throwable paramString)
            {
              bool1 = false;
            }
          }
        }
      }
    }
    finally {}
  }
  
  /* Error */
  public boolean a(java.util.List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_1
    //   5: ifnull +14 -> 19
    //   8: aload_1
    //   9: invokeinterface 177 1 0
    //   14: istore_2
    //   15: iload_2
    //   16: ifne +11 -> 27
    //   19: iconst_0
    //   20: istore 5
    //   22: aload_0
    //   23: monitorexit
    //   24: iload 5
    //   26: ireturn
    //   27: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   30: lstore 11
    //   32: lconst_0
    //   33: lstore 7
    //   35: iconst_0
    //   36: istore_2
    //   37: aload_0
    //   38: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 13
    //   43: aload 13
    //   45: invokevirtual 180	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   48: iconst_0
    //   49: istore 4
    //   51: iload 4
    //   53: aload_1
    //   54: invokeinterface 177 1 0
    //   59: if_icmpge +202 -> 261
    //   62: aload_1
    //   63: iload 4
    //   65: invokeinterface 184 2 0
    //   70: checkcast 186	net/youmi/android/e/a/e
    //   73: astore 16
    //   75: aload 16
    //   77: invokevirtual 188	net/youmi/android/e/a/e:b	()Ljava/lang/String;
    //   80: astore 14
    //   82: aload 14
    //   84: invokestatic 59	net/youmi/android/c/b/e:a	(Ljava/lang/String;)Z
    //   87: ifeq +6 -> 93
    //   90: goto +258 -> 348
    //   93: aload 16
    //   95: invokevirtual 191	net/youmi/android/e/a/e:a	()[B
    //   98: astore 15
    //   100: aload 15
    //   102: ifnull +246 -> 348
    //   105: aload 15
    //   107: arraylength
    //   108: ifgt +6 -> 114
    //   111: goto +237 -> 348
    //   114: lload 7
    //   116: aload 15
    //   118: arraylength
    //   119: i2l
    //   120: ladd
    //   121: lstore 7
    //   123: ldc2_w 87
    //   126: lstore 9
    //   128: aload 16
    //   130: invokevirtual 193	net/youmi/android/e/a/e:c	()J
    //   133: lconst_0
    //   134: lcmp
    //   135: ifle +13 -> 148
    //   138: aload 16
    //   140: invokevirtual 193	net/youmi/android/e/a/e:c	()J
    //   143: lload 11
    //   145: ladd
    //   146: lstore 9
    //   148: iload_2
    //   149: iconst_1
    //   150: iadd
    //   151: istore_2
    //   152: new 67	android/content/ContentValues
    //   155: dup
    //   156: invokespecial 154	android/content/ContentValues:<init>	()V
    //   159: astore 16
    //   161: aload_0
    //   162: aload 16
    //   164: ldc 155
    //   166: aload 14
    //   168: invokespecial 157	net/youmi/android/e/a/d:a	(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_0
    //   172: aload 16
    //   174: ldc 158
    //   176: aload 15
    //   178: invokespecial 160	net/youmi/android/e/a/d:a	(Landroid/content/ContentValues;Ljava/lang/String;[B)V
    //   181: aload_0
    //   182: aload 16
    //   184: ldc 161
    //   186: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   189: invokespecial 163	net/youmi/android/e/a/d:a	(Landroid/content/ContentValues;Ljava/lang/String;J)V
    //   192: aload_0
    //   193: aload 16
    //   195: ldc 164
    //   197: lload 9
    //   199: invokespecial 163	net/youmi/android/e/a/d:a	(Landroid/content/ContentValues;Ljava/lang/String;J)V
    //   202: aload_0
    //   203: aload 13
    //   205: ldc 127
    //   207: ldc 155
    //   209: aload 14
    //   211: invokespecial 195	net/youmi/android/e/a/d:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   214: ifeq +27 -> 241
    //   217: aload_0
    //   218: aload 13
    //   220: aload 16
    //   222: ldc 155
    //   224: aload 14
    //   226: ldc 127
    //   228: invokespecial 197	net/youmi/android/e/a/d:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   231: ifle +114 -> 345
    //   234: iload_3
    //   235: iconst_1
    //   236: iadd
    //   237: istore_3
    //   238: goto +119 -> 357
    //   241: aload_0
    //   242: aload 13
    //   244: aload 16
    //   246: ldc 127
    //   248: invokespecial 199	net/youmi/android/e/a/d:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;Ljava/lang/String;)I
    //   251: ifle +91 -> 342
    //   254: iload_3
    //   255: iconst_1
    //   256: iadd
    //   257: istore_3
    //   258: goto +90 -> 348
    //   261: aload 13
    //   263: invokevirtual 202	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   266: iconst_1
    //   267: istore 6
    //   269: iload 6
    //   271: istore 5
    //   273: aload 13
    //   275: ifnull -253 -> 22
    //   278: aload 13
    //   280: invokevirtual 205	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   283: iload 6
    //   285: istore 5
    //   287: goto -265 -> 22
    //   290: astore_1
    //   291: iload 6
    //   293: istore 5
    //   295: goto -273 -> 22
    //   298: astore_1
    //   299: aload 13
    //   301: ifnull +8 -> 309
    //   304: aload 13
    //   306: invokevirtual 205	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   309: iconst_0
    //   310: istore 5
    //   312: goto -290 -> 22
    //   315: astore_1
    //   316: aload 13
    //   318: ifnull +8 -> 326
    //   321: aload 13
    //   323: invokevirtual 205	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   326: aload_1
    //   327: athrow
    //   328: astore_1
    //   329: aload_0
    //   330: monitorexit
    //   331: aload_1
    //   332: athrow
    //   333: astore_1
    //   334: goto -25 -> 309
    //   337: astore 13
    //   339: goto -13 -> 326
    //   342: goto +6 -> 348
    //   345: goto +12 -> 357
    //   348: iload 4
    //   350: iconst_1
    //   351: iadd
    //   352: istore 4
    //   354: goto -303 -> 51
    //   357: goto -9 -> 348
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	d
    //   0	360	1	paramList	java.util.List
    //   14	138	2	i	int
    //   3	255	3	j	int
    //   49	304	4	k	int
    //   20	291	5	bool1	boolean
    //   267	25	6	bool2	boolean
    //   33	89	7	l1	long
    //   126	72	9	l2	long
    //   30	114	11	l3	long
    //   41	281	13	localSQLiteDatabase	SQLiteDatabase
    //   337	1	13	localThrowable	Throwable
    //   80	145	14	str	String
    //   98	79	15	arrayOfByte	byte[]
    //   73	172	16	localObject	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   278	283	290	java/lang/Throwable
    //   43	48	298	java/lang/Throwable
    //   51	90	298	java/lang/Throwable
    //   93	100	298	java/lang/Throwable
    //   105	111	298	java/lang/Throwable
    //   114	123	298	java/lang/Throwable
    //   128	148	298	java/lang/Throwable
    //   152	234	298	java/lang/Throwable
    //   241	254	298	java/lang/Throwable
    //   261	266	298	java/lang/Throwable
    //   43	48	315	finally
    //   51	90	315	finally
    //   93	100	315	finally
    //   105	111	315	finally
    //   114	123	315	finally
    //   128	148	315	finally
    //   152	234	315	finally
    //   241	254	315	finally
    //   261	266	315	finally
    //   8	15	328	finally
    //   27	32	328	finally
    //   37	43	328	finally
    //   278	283	328	finally
    //   304	309	328	finally
    //   321	326	328	finally
    //   326	328	328	finally
    //   304	309	333	java/lang/Throwable
    //   321	326	337	java/lang/Throwable
  }
  
  /* Error */
  public byte[] a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 10
    //   3: aconst_null
    //   4: astore 9
    //   6: aconst_null
    //   7: astore 11
    //   9: aload_0
    //   10: monitorenter
    //   11: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   14: lstore_2
    //   15: aload_0
    //   16: invokevirtual 86	net/youmi/android/e/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore 8
    //   21: aload 8
    //   23: ldc 127
    //   25: aconst_null
    //   26: ldc 208
    //   28: iconst_1
    //   29: anewarray 49	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: aload_1
    //   35: aastore
    //   36: aconst_null
    //   37: aconst_null
    //   38: aconst_null
    //   39: invokevirtual 97	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 9
    //   44: aload 9
    //   46: invokeinterface 103 1 0
    //   51: ifeq +143 -> 194
    //   54: aload 9
    //   56: aload 9
    //   58: ldc 158
    //   60: invokeinterface 212 2 0
    //   65: invokeinterface 216 2 0
    //   70: astore 10
    //   72: aload 9
    //   74: aload 9
    //   76: ldc 164
    //   78: invokeinterface 212 2 0
    //   83: invokeinterface 220 2 0
    //   88: lstore 4
    //   90: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   93: lstore 6
    //   95: lload 4
    //   97: lconst_0
    //   98: lcmp
    //   99: ifle +473 -> 572
    //   102: lload 4
    //   104: lload 6
    //   106: lcmp
    //   107: ifge +465 -> 572
    //   110: aload_0
    //   111: aload_1
    //   112: invokespecial 222	net/youmi/android/e/a/d:d	(Ljava/lang/String;)Z
    //   115: pop
    //   116: aload 11
    //   118: astore 10
    //   120: aload 9
    //   122: invokeinterface 104 1 0
    //   127: aload 9
    //   129: ifnull +10 -> 139
    //   132: aload 9
    //   134: invokeinterface 104 1 0
    //   139: aload 8
    //   141: ifnull +8 -> 149
    //   144: aload 8
    //   146: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   149: ldc 224
    //   151: ldc 226
    //   153: iconst_3
    //   154: anewarray 228	java/lang/Object
    //   157: dup
    //   158: iconst_0
    //   159: aload_1
    //   160: aastore
    //   161: dup
    //   162: iconst_1
    //   163: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   166: lload_2
    //   167: lsub
    //   168: l2i
    //   169: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: aload 10
    //   177: arraylength
    //   178: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: aastore
    //   182: invokestatic 238	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload 10
    //   187: astore 8
    //   189: aload_0
    //   190: monitorexit
    //   191: aload 8
    //   193: areturn
    //   194: aload 9
    //   196: invokeinterface 104 1 0
    //   201: aconst_null
    //   202: astore 10
    //   204: goto -77 -> 127
    //   207: astore_1
    //   208: aload 10
    //   210: astore 8
    //   212: goto -23 -> 189
    //   215: astore 8
    //   217: aconst_null
    //   218: astore 9
    //   220: aconst_null
    //   221: astore 8
    //   223: aload 10
    //   225: ifnull +10 -> 235
    //   228: aload 10
    //   230: invokeinterface 104 1 0
    //   235: aload 9
    //   237: ifnull +8 -> 245
    //   240: aload 9
    //   242: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   245: ldc 224
    //   247: ldc 226
    //   249: iconst_3
    //   250: anewarray 228	java/lang/Object
    //   253: dup
    //   254: iconst_0
    //   255: aload_1
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   262: lload_2
    //   263: lsub
    //   264: l2i
    //   265: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   268: aastore
    //   269: dup
    //   270: iconst_2
    //   271: aload 8
    //   273: arraylength
    //   274: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   277: aastore
    //   278: invokestatic 238	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: goto -92 -> 189
    //   284: astore_1
    //   285: goto -96 -> 189
    //   288: astore 8
    //   290: aconst_null
    //   291: astore 11
    //   293: aconst_null
    //   294: astore 10
    //   296: aload 11
    //   298: ifnull +10 -> 308
    //   301: aload 11
    //   303: invokeinterface 104 1 0
    //   308: aload 9
    //   310: ifnull +8 -> 318
    //   313: aload 9
    //   315: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   318: ldc 224
    //   320: ldc 226
    //   322: iconst_3
    //   323: anewarray 228	java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload_1
    //   329: aastore
    //   330: dup
    //   331: iconst_1
    //   332: invokestatic 149	java/lang/System:currentTimeMillis	()J
    //   335: lload_2
    //   336: lsub
    //   337: l2i
    //   338: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   341: aastore
    //   342: dup
    //   343: iconst_2
    //   344: aload 10
    //   346: arraylength
    //   347: invokestatic 233	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   350: aastore
    //   351: invokestatic 238	net/youmi/android/c/e/b:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   354: aload 8
    //   356: athrow
    //   357: astore_1
    //   358: aload_0
    //   359: monitorexit
    //   360: aload_1
    //   361: athrow
    //   362: astore 10
    //   364: aload 11
    //   366: astore 10
    //   368: goto -248 -> 120
    //   371: astore 9
    //   373: goto -234 -> 139
    //   376: astore 8
    //   378: goto -229 -> 149
    //   381: astore 10
    //   383: goto -148 -> 235
    //   386: astore 9
    //   388: goto -143 -> 245
    //   391: astore 11
    //   393: goto -85 -> 308
    //   396: astore 9
    //   398: goto -80 -> 318
    //   401: astore_1
    //   402: goto -48 -> 354
    //   405: astore 10
    //   407: aconst_null
    //   408: astore 11
    //   410: aconst_null
    //   411: astore 12
    //   413: aload 8
    //   415: astore 9
    //   417: aload 10
    //   419: astore 8
    //   421: aload 12
    //   423: astore 10
    //   425: goto -129 -> 296
    //   428: astore 11
    //   430: aconst_null
    //   431: astore 10
    //   433: aload 8
    //   435: astore 12
    //   437: aload 11
    //   439: astore 8
    //   441: aload 9
    //   443: astore 11
    //   445: aload 12
    //   447: astore 9
    //   449: goto -153 -> 296
    //   452: astore 11
    //   454: aload 8
    //   456: astore 12
    //   458: aload 11
    //   460: astore 8
    //   462: aload 9
    //   464: astore 11
    //   466: aload 12
    //   468: astore 9
    //   470: goto -174 -> 296
    //   473: astore 11
    //   475: aload 8
    //   477: astore 12
    //   479: aload 11
    //   481: astore 8
    //   483: aload 9
    //   485: astore 11
    //   487: aload 12
    //   489: astore 9
    //   491: goto -195 -> 296
    //   494: astore 9
    //   496: aload 8
    //   498: astore 9
    //   500: aconst_null
    //   501: astore 8
    //   503: goto -280 -> 223
    //   506: astore 10
    //   508: aload 8
    //   510: astore 10
    //   512: aconst_null
    //   513: astore 8
    //   515: aload 9
    //   517: astore 11
    //   519: aload 10
    //   521: astore 9
    //   523: aload 11
    //   525: astore 10
    //   527: goto -304 -> 223
    //   530: astore 11
    //   532: aload 9
    //   534: astore 11
    //   536: aload 8
    //   538: astore 9
    //   540: aload 10
    //   542: astore 8
    //   544: aload 11
    //   546: astore 10
    //   548: goto -325 -> 223
    //   551: astore 11
    //   553: aload 8
    //   555: astore 11
    //   557: aload 10
    //   559: astore 8
    //   561: aload 9
    //   563: astore 10
    //   565: aload 11
    //   567: astore 9
    //   569: goto -346 -> 223
    //   572: goto -452 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	575	0	this	d
    //   0	575	1	paramString	String
    //   14	322	2	l1	long
    //   88	15	4	l2	long
    //   93	12	6	l3	long
    //   19	192	8	localObject1	java.lang.Object
    //   215	1	8	localThrowable1	Throwable
    //   221	51	8	localObject2	java.lang.Object
    //   288	67	8	localObject3	java.lang.Object
    //   376	38	8	localThrowable2	Throwable
    //   419	141	8	localObject4	java.lang.Object
    //   4	310	9	localCursor	Cursor
    //   371	1	9	localThrowable3	Throwable
    //   386	1	9	localThrowable4	Throwable
    //   396	1	9	localThrowable5	Throwable
    //   415	75	9	localObject5	java.lang.Object
    //   494	1	9	localThrowable6	Throwable
    //   498	70	9	localObject6	java.lang.Object
    //   1	344	10	localObject7	java.lang.Object
    //   362	1	10	localThrowable7	Throwable
    //   366	1	10	localObject8	java.lang.Object
    //   381	1	10	localThrowable8	Throwable
    //   405	13	10	localObject9	java.lang.Object
    //   423	9	10	localObject10	java.lang.Object
    //   506	1	10	localThrowable9	Throwable
    //   510	54	10	localObject11	java.lang.Object
    //   7	358	11	localObject12	java.lang.Object
    //   391	1	11	localThrowable10	Throwable
    //   408	1	11	localObject13	java.lang.Object
    //   428	10	11	localObject14	java.lang.Object
    //   443	1	11	localObject15	java.lang.Object
    //   452	7	11	localObject16	java.lang.Object
    //   464	1	11	localObject17	java.lang.Object
    //   473	7	11	localObject18	java.lang.Object
    //   485	39	11	localObject19	java.lang.Object
    //   530	1	11	localThrowable11	Throwable
    //   534	11	11	localObject20	java.lang.Object
    //   551	1	11	localThrowable12	Throwable
    //   555	11	11	localObject21	java.lang.Object
    //   411	77	12	localObject22	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   149	185	207	java/lang/Throwable
    //   15	21	215	java/lang/Throwable
    //   245	281	284	java/lang/Throwable
    //   15	21	288	finally
    //   11	15	357	finally
    //   132	139	357	finally
    //   144	149	357	finally
    //   149	185	357	finally
    //   228	235	357	finally
    //   240	245	357	finally
    //   245	281	357	finally
    //   301	308	357	finally
    //   313	318	357	finally
    //   318	354	357	finally
    //   354	357	357	finally
    //   110	116	362	java/lang/Throwable
    //   132	139	371	java/lang/Throwable
    //   144	149	376	java/lang/Throwable
    //   228	235	381	java/lang/Throwable
    //   240	245	386	java/lang/Throwable
    //   301	308	391	java/lang/Throwable
    //   313	318	396	java/lang/Throwable
    //   318	354	401	java/lang/Throwable
    //   21	44	405	finally
    //   44	72	428	finally
    //   110	116	428	finally
    //   194	201	428	finally
    //   72	95	452	finally
    //   120	127	473	finally
    //   21	44	494	java/lang/Throwable
    //   44	72	506	java/lang/Throwable
    //   194	201	506	java/lang/Throwable
    //   72	95	530	java/lang/Throwable
    //   120	127	551	java/lang/Throwable
  }
  
  public boolean b(String paramString)
  {
    try
    {
      boolean bool = d(paramString);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void close()
  {
    try
    {
      if (this.f != null) {
        this.f.close();
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(b());
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL(c("YINcpuKxQ5cA"));
    paramSQLiteDatabase.execSQL(b());
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.a.d
 * JD-Core Version:    0.7.0.1
 */