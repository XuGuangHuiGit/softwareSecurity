package net.youmi.android.e.a;

public class b
{
  private String a;
  private d b;
  
  b(String paramString, d paramd)
  {
    this.a = paramString;
    this.b = paramd;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    switch (paramInt)
    {
    default: 
    case 1: 
      try
      {
        return c.a(paramArrayOfByte, paramString);
      }
      catch (Throwable paramArrayOfByte)
      {
        arrayOfByte = null;
      }
      paramArrayOfByte = c.a(paramArrayOfByte, paramString);
      return paramArrayOfByte;
    }
    return arrayOfByte;
  }
  
  public String a()
  {
    return this.a;
  }
  
  /* Error */
  protected boolean a(android.content.Context paramContext, String paramString, byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 34	java/lang/System:currentTimeMillis	()J
    //   3: pop2
    //   4: aload_3
    //   5: ifnull +88 -> 93
    //   8: aload_0
    //   9: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   12: ifnull +81 -> 93
    //   15: aload_0
    //   16: getfield 17	net/youmi/android/e/a/b:b	Lnet/youmi/android/e/a/d;
    //   19: ifnonnull +5 -> 24
    //   22: iconst_0
    //   23: ireturn
    //   24: aload_2
    //   25: invokestatic 39	net/youmi/android/c/b/e:a	(Ljava/lang/String;)Z
    //   28: ifne +65 -> 93
    //   31: aload_3
    //   32: astore_1
    //   33: iload 6
    //   35: tableswitch	default:+60 -> 95, 0:+30->65, 1:+42->77
    //   57: aload_0
    //   58: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   61: invokestatic 26	net/youmi/android/e/a/c:a	([BLjava/lang/String;)[B
    //   64: astore_1
    //   65: aload_0
    //   66: getfield 17	net/youmi/android/e/a/b:b	Lnet/youmi/android/e/a/d;
    //   69: aload_2
    //   70: aload_1
    //   71: lload 4
    //   73: invokevirtual 44	net/youmi/android/e/a/d:a	(Ljava/lang/String;[BJ)Z
    //   76: ireturn
    //   77: aload_3
    //   78: aload_0
    //   79: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   82: invokestatic 26	net/youmi/android/e/a/c:a	([BLjava/lang/String;)[B
    //   85: astore_1
    //   86: goto -21 -> 65
    //   89: astore_1
    //   90: aload_1
    //   91: athrow
    //   92: astore_1
    //   93: iconst_0
    //   94: ireturn
    //   95: goto -39 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	b
    //   0	98	1	paramContext	android.content.Context
    //   0	98	2	paramString	String
    //   0	98	3	paramArrayOfByte	byte[]
    //   0	98	4	paramLong	long
    //   0	98	6	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   8	22	89	finally
    //   24	31	89	finally
    //   56	65	89	finally
    //   65	77	89	finally
    //   77	86	89	finally
    //   8	22	92	java/lang/Throwable
    //   24	31	92	java/lang/Throwable
    //   56	65	92	java/lang/Throwable
    //   65	77	92	java/lang/Throwable
    //   77	86	92	java/lang/Throwable
  }
  
  protected boolean a(String paramString)
  {
    try
    {
      boolean bool = this.b.b(paramString);
      return bool;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  /* Error */
  protected byte[] a(android.content.Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 34	java/lang/System:currentTimeMillis	()J
    //   5: pop2
    //   6: aload_1
    //   7: astore 4
    //   9: aload_0
    //   10: getfield 17	net/youmi/android/e/a/b:b	Lnet/youmi/android/e/a/d;
    //   13: ifnull +102 -> 115
    //   16: aload_0
    //   17: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   20: ifnonnull +5 -> 25
    //   23: aconst_null
    //   24: areturn
    //   25: aload_1
    //   26: astore 4
    //   28: aload_2
    //   29: invokestatic 39	net/youmi/android/c/b/e:a	(Ljava/lang/String;)Z
    //   32: ifne +83 -> 115
    //   35: aload_0
    //   36: getfield 17	net/youmi/android/e/a/b:b	Lnet/youmi/android/e/a/d;
    //   39: aload_2
    //   40: invokevirtual 50	net/youmi/android/e/a/d:a	(Ljava/lang/String;)[B
    //   43: astore_2
    //   44: aload_1
    //   45: astore 4
    //   47: aload_2
    //   48: ifnull +67 -> 115
    //   51: invokestatic 34	java/lang/System:currentTimeMillis	()J
    //   54: pop2
    //   55: iload_3
    //   56: tableswitch	default:+62 -> 118, 0:+74->130, 1:+38->94
    //   81: aload_0
    //   82: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   85: invokestatic 52	net/youmi/android/e/a/c:b	([BLjava/lang/String;)[B
    //   88: astore_2
    //   89: aload_2
    //   90: astore_1
    //   91: goto +30 -> 121
    //   94: aload_2
    //   95: aload_0
    //   96: getfield 15	net/youmi/android/e/a/b:a	Ljava/lang/String;
    //   99: invokestatic 52	net/youmi/android/e/a/c:b	([BLjava/lang/String;)[B
    //   102: astore_2
    //   103: aload_2
    //   104: astore_1
    //   105: goto +16 -> 121
    //   108: astore_1
    //   109: aload_1
    //   110: athrow
    //   111: astore_2
    //   112: aload_1
    //   113: astore 4
    //   115: aload 4
    //   117: areturn
    //   118: goto -38 -> 80
    //   121: aload_1
    //   122: astore 4
    //   124: aload_1
    //   125: ifnonnull -10 -> 115
    //   128: aload_1
    //   129: areturn
    //   130: aload_2
    //   131: astore_1
    //   132: goto -11 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	b
    //   0	135	1	paramContext	android.content.Context
    //   0	135	2	paramString	String
    //   0	135	3	paramInt	int
    //   7	116	4	localContext	android.content.Context
    // Exception table:
    //   from	to	target	type
    //   9	23	108	finally
    //   28	44	108	finally
    //   51	55	108	finally
    //   80	89	108	finally
    //   94	103	108	finally
    //   9	23	111	java/lang/Throwable
    //   28	44	111	java/lang/Throwable
    //   51	55	111	java/lang/Throwable
    //   80	89	111	java/lang/Throwable
    //   94	103	111	java/lang/Throwable
  }
  
  public d b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.e.a.b
 * JD-Core Version:    0.7.0.1
 */