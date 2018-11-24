package net.youmi.android.c.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.Environment;
import java.io.File;

public abstract class a
{
  private final String a;
  private final SQLiteDatabase.CursorFactory b;
  private final int c;
  private Context d;
  private SQLiteDatabase e = null;
  private boolean f = false;
  private boolean g = false;
  
  public a(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    int i = paramInt;
    if (paramInt < 1) {
      i = 1;
    }
    this.a = paramString;
    this.b = paramCursorFactory;
    this.c = i;
    this.g = paramString.startsWith(Environment.getExternalStorageDirectory().getPath());
    this.d = paramContext;
  }
  
  /* Error */
  public SQLiteDatabase a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 28	net/youmi/android/c/d/a:g	Z
    //   9: ifeq +22 -> 31
    //   12: aload_0
    //   13: getfield 54	net/youmi/android/c/d/a:d	Landroid/content/Context;
    //   16: invokestatic 63	net/youmi/android/c/k/k:a	(Landroid/content/Context;)Z
    //   19: istore_2
    //   20: iload_2
    //   21: ifne +10 -> 31
    //   24: aload 5
    //   26: astore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: areturn
    //   31: aload_0
    //   32: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   35: ifnull +31 -> 66
    //   38: aload_0
    //   39: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   42: invokevirtual 69	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   45: ifeq +21 -> 66
    //   48: aload_0
    //   49: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   52: invokevirtual 72	android/database/sqlite/SQLiteDatabase:isReadOnly	()Z
    //   55: ifne +11 -> 66
    //   58: aload_0
    //   59: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   62: astore_3
    //   63: goto -36 -> 27
    //   66: aload 5
    //   68: astore_3
    //   69: aload_0
    //   70: getfield 26	net/youmi/android/c/d/a:f	Z
    //   73: ifne -46 -> 27
    //   76: aload_0
    //   77: getfield 30	net/youmi/android/c/d/a:a	Ljava/lang/String;
    //   80: astore 4
    //   82: aload 5
    //   84: astore_3
    //   85: aload 4
    //   87: ifnull -60 -> 27
    //   90: aload_0
    //   91: iconst_1
    //   92: putfield 26	net/youmi/android/c/d/a:f	Z
    //   95: aload_0
    //   96: getfield 30	net/youmi/android/c/d/a:a	Ljava/lang/String;
    //   99: aload_0
    //   100: getfield 32	net/youmi/android/c/d/a:b	Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
    //   103: invokestatic 76	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   106: astore_3
    //   107: aload_3
    //   108: invokevirtual 80	android/database/sqlite/SQLiteDatabase:getVersion	()I
    //   111: istore_1
    //   112: iload_1
    //   113: aload_0
    //   114: getfield 34	net/youmi/android/c/d/a:c	I
    //   117: if_icmpeq +32 -> 149
    //   120: aload_3
    //   121: invokevirtual 83	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   124: iload_1
    //   125: ifne +60 -> 185
    //   128: aload_0
    //   129: aload_3
    //   130: invokevirtual 86	net/youmi/android/c/d/a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   133: aload_3
    //   134: aload_0
    //   135: getfield 34	net/youmi/android/c/d/a:c	I
    //   138: invokevirtual 90	android/database/sqlite/SQLiteDatabase:setVersion	(I)V
    //   141: aload_3
    //   142: invokevirtual 93	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   145: aload_3
    //   146: invokevirtual 96	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   149: aload_0
    //   150: aload_3
    //   151: invokevirtual 98	net/youmi/android/c/d/a:b	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   154: aload_0
    //   155: iconst_0
    //   156: putfield 26	net/youmi/android/c/d/a:f	Z
    //   159: aload_0
    //   160: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   163: astore 4
    //   165: aload 4
    //   167: ifnull +10 -> 177
    //   170: aload_0
    //   171: getfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   174: invokevirtual 101	android/database/sqlite/SQLiteDatabase:close	()V
    //   177: aload_0
    //   178: aload_3
    //   179: putfield 24	net/youmi/android/c/d/a:e	Landroid/database/sqlite/SQLiteDatabase;
    //   182: goto -155 -> 27
    //   185: aload_0
    //   186: aload_3
    //   187: iload_1
    //   188: aload_0
    //   189: getfield 34	net/youmi/android/c/d/a:c	I
    //   192: invokevirtual 104	net/youmi/android/c/d/a:a	(Landroid/database/sqlite/SQLiteDatabase;II)V
    //   195: goto -62 -> 133
    //   198: astore 4
    //   200: aload_3
    //   201: invokevirtual 96	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   204: goto -55 -> 149
    //   207: astore 4
    //   209: aload_3
    //   210: astore 4
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield 26	net/youmi/android/c/d/a:f	Z
    //   217: aload 5
    //   219: astore_3
    //   220: aload 4
    //   222: ifnull -195 -> 27
    //   225: aload 4
    //   227: invokevirtual 101	android/database/sqlite/SQLiteDatabase:close	()V
    //   230: aload 5
    //   232: astore_3
    //   233: goto -206 -> 27
    //   236: astore_3
    //   237: aload 5
    //   239: astore_3
    //   240: goto -213 -> 27
    //   243: astore 4
    //   245: aload_3
    //   246: invokevirtual 96	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   249: aload 4
    //   251: athrow
    //   252: astore 5
    //   254: aload_3
    //   255: astore 4
    //   257: aload 5
    //   259: astore_3
    //   260: aload_0
    //   261: iconst_0
    //   262: putfield 26	net/youmi/android/c/d/a:f	Z
    //   265: aload 4
    //   267: ifnull +8 -> 275
    //   270: aload 4
    //   272: invokevirtual 101	android/database/sqlite/SQLiteDatabase:close	()V
    //   275: aload_3
    //   276: athrow
    //   277: astore_3
    //   278: aload_0
    //   279: monitorexit
    //   280: aload_3
    //   281: athrow
    //   282: astore 4
    //   284: goto -9 -> 275
    //   287: astore_3
    //   288: aconst_null
    //   289: astore 4
    //   291: goto -31 -> 260
    //   294: astore_3
    //   295: aconst_null
    //   296: astore 4
    //   298: goto -86 -> 212
    //   301: astore 4
    //   303: goto -121 -> 182
    //   306: astore 4
    //   308: goto -131 -> 177
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	this	a
    //   111	77	1	i	int
    //   19	2	2	bool	boolean
    //   26	207	3	localObject1	Object
    //   236	1	3	localThrowable1	java.lang.Throwable
    //   239	37	3	localObject2	Object
    //   277	4	3	localObject3	Object
    //   287	1	3	localObject4	Object
    //   294	1	3	localThrowable2	java.lang.Throwable
    //   80	86	4	localObject5	Object
    //   198	1	4	localThrowable3	java.lang.Throwable
    //   207	1	4	localThrowable4	java.lang.Throwable
    //   210	16	4	localObject6	Object
    //   243	7	4	localObject7	Object
    //   255	16	4	localObject8	Object
    //   282	1	4	localThrowable5	java.lang.Throwable
    //   289	8	4	localObject9	Object
    //   301	1	4	localThrowable6	java.lang.Throwable
    //   306	1	4	localThrowable7	java.lang.Throwable
    //   1	237	5	localObject10	Object
    //   252	6	5	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   128	133	198	java/lang/Throwable
    //   133	145	198	java/lang/Throwable
    //   185	195	198	java/lang/Throwable
    //   107	124	207	java/lang/Throwable
    //   145	149	207	java/lang/Throwable
    //   149	154	207	java/lang/Throwable
    //   200	204	207	java/lang/Throwable
    //   245	252	207	java/lang/Throwable
    //   212	217	236	java/lang/Throwable
    //   225	230	236	java/lang/Throwable
    //   128	133	243	finally
    //   133	145	243	finally
    //   185	195	243	finally
    //   107	124	252	finally
    //   145	149	252	finally
    //   149	154	252	finally
    //   200	204	252	finally
    //   245	252	252	finally
    //   5	20	277	finally
    //   31	63	277	finally
    //   69	82	277	finally
    //   154	165	277	finally
    //   170	177	277	finally
    //   177	182	277	finally
    //   212	217	277	finally
    //   225	230	277	finally
    //   260	265	277	finally
    //   270	275	277	finally
    //   275	277	277	finally
    //   260	265	282	java/lang/Throwable
    //   270	275	282	java/lang/Throwable
    //   90	107	287	finally
    //   90	107	294	java/lang/Throwable
    //   154	165	301	java/lang/Throwable
    //   177	182	301	java/lang/Throwable
    //   170	177	306	java/lang/Throwable
  }
  
  public abstract void a(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
  
  public void b(SQLiteDatabase paramSQLiteDatabase) {}
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.d.a
 * JD-Core Version:    0.7.0.1
 */