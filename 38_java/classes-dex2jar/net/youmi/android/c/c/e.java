package net.youmi.android.c.c;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;

public class e
{
  /* Error */
  public static String a(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: ifnonnull +8 -> 12
    //   7: aload 4
    //   9: astore_3
    //   10: aload_3
    //   11: areturn
    //   12: aload_0
    //   13: invokevirtual 14	java/io/File:exists	()Z
    //   16: istore_2
    //   17: aload 4
    //   19: astore_3
    //   20: iload_2
    //   21: ifeq -11 -> 10
    //   24: sipush 1024
    //   27: newarray byte
    //   29: astore_3
    //   30: new 16	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 20	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: astore_0
    //   39: ldc 22
    //   41: invokestatic 28	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   44: astore 5
    //   46: aload_0
    //   47: aload_3
    //   48: invokevirtual 34	java/io/InputStream:read	([B)I
    //   51: istore_1
    //   52: iload_1
    //   53: ifle +31 -> 84
    //   56: aload 5
    //   58: aload_3
    //   59: iconst_0
    //   60: iload_1
    //   61: invokevirtual 38	java/security/MessageDigest:update	([BII)V
    //   64: goto -18 -> 46
    //   67: astore_3
    //   68: aload 4
    //   70: astore_3
    //   71: aload_0
    //   72: ifnull -62 -> 10
    //   75: aload_0
    //   76: invokevirtual 42	java/io/InputStream:close	()V
    //   79: aconst_null
    //   80: areturn
    //   81: astore_0
    //   82: aconst_null
    //   83: areturn
    //   84: aload 5
    //   86: invokevirtual 46	java/security/MessageDigest:digest	()[B
    //   89: invokestatic 51	net/youmi/android/c/b/a:a	([B)Ljava/lang/String;
    //   92: astore_3
    //   93: aload_3
    //   94: astore 4
    //   96: aload 4
    //   98: astore_3
    //   99: aload_0
    //   100: ifnull -90 -> 10
    //   103: aload_0
    //   104: invokevirtual 42	java/io/InputStream:close	()V
    //   107: aload 4
    //   109: areturn
    //   110: astore_0
    //   111: aload 4
    //   113: areturn
    //   114: astore_3
    //   115: aconst_null
    //   116: astore_0
    //   117: aload_0
    //   118: ifnull +7 -> 125
    //   121: aload_0
    //   122: invokevirtual 42	java/io/InputStream:close	()V
    //   125: aload_3
    //   126: athrow
    //   127: astore_3
    //   128: goto -104 -> 24
    //   131: astore_0
    //   132: goto -7 -> 125
    //   135: astore_3
    //   136: goto -19 -> 117
    //   139: astore_0
    //   140: aconst_null
    //   141: astore_0
    //   142: goto -74 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramFile	File
    //   51	10	1	i	int
    //   16	5	2	bool	boolean
    //   9	50	3	localObject1	Object
    //   67	1	3	localThrowable1	Throwable
    //   70	29	3	localObject2	Object
    //   114	12	3	localObject3	Object
    //   127	1	3	localThrowable2	Throwable
    //   135	1	3	localObject4	Object
    //   1	111	4	localObject5	Object
    //   44	41	5	localMessageDigest	MessageDigest
    // Exception table:
    //   from	to	target	type
    //   39	46	67	java/lang/Throwable
    //   46	52	67	java/lang/Throwable
    //   56	64	67	java/lang/Throwable
    //   84	93	67	java/lang/Throwable
    //   75	79	81	java/lang/Throwable
    //   103	107	110	java/lang/Throwable
    //   30	39	114	finally
    //   12	17	127	java/lang/Throwable
    //   121	125	131	java/lang/Throwable
    //   39	46	135	finally
    //   46	52	135	finally
    //   56	64	135	finally
    //   84	93	135	finally
    //   30	39	139	java/lang/Throwable
  }
  
  public static String a(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null) {}
    try
    {
      int i = paramString.length();
      localObject1 = localObject2;
      if (i > 0) {}
      return null;
    }
    catch (Throwable paramString)
    {
      try
      {
        localObject1 = MessageDigest.getInstance("MD5");
        paramString = paramString.getBytes();
        ((MessageDigest)localObject1).update(paramString, 0, paramString.length);
        localObject1 = String.format("%032x", new Object[] { new BigInteger(1, ((MessageDigest)localObject1).digest()) });
        return localObject1;
      }
      catch (Throwable paramString) {}
      paramString = paramString;
      return "";
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int i = 0;
    char[] arrayOfChar = new char[16];
    char[] tmp10_8 = arrayOfChar;
    tmp10_8[0] = 48;
    char[] tmp15_10 = tmp10_8;
    tmp15_10[1] = 49;
    char[] tmp20_15 = tmp15_10;
    tmp20_15[2] = 50;
    char[] tmp25_20 = tmp20_15;
    tmp25_20[3] = 51;
    char[] tmp30_25 = tmp25_20;
    tmp30_25[4] = 52;
    char[] tmp35_30 = tmp30_25;
    tmp35_30[5] = 53;
    char[] tmp40_35 = tmp35_30;
    tmp40_35[6] = 54;
    char[] tmp46_40 = tmp40_35;
    tmp46_40[7] = 55;
    char[] tmp52_46 = tmp46_40;
    tmp52_46[8] = 56;
    char[] tmp58_52 = tmp52_46;
    tmp58_52[9] = 57;
    char[] tmp64_58 = tmp58_52;
    tmp64_58[10] = 97;
    char[] tmp70_64 = tmp64_58;
    tmp70_64[11] = 98;
    char[] tmp76_70 = tmp70_64;
    tmp76_70[12] = 99;
    char[] tmp82_76 = tmp76_70;
    tmp82_76[13] = 100;
    char[] tmp88_82 = tmp82_76;
    tmp88_82[14] = 101;
    char[] tmp94_88 = tmp88_82;
    tmp94_88[15] = 102;
    tmp94_88;
    for (;;)
    {
      Object localObject;
      int j;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramArrayOfByte);
        paramArrayOfByte = ((MessageDigest)localObject).digest();
        localObject = new char[32];
        j = 0;
      }
      catch (Throwable paramArrayOfByte)
      {
        return null;
      }
      paramArrayOfByte = new String((char[])localObject);
      return paramArrayOfByte;
      while (i < 16)
      {
        int k = paramArrayOfByte[i];
        int m = j + 1;
        localObject[j] = arrayOfChar[(k >>> 4 & 0xF)];
        j = m + 1;
        localObject[m] = arrayOfChar[(k & 0xF)];
        i += 1;
      }
    }
  }
  
  public static boolean a(File paramFile, String paramString)
  {
    try
    {
      paramFile = a(paramFile);
      if (paramFile == null) {
        return false;
      }
      paramFile = paramFile.toLowerCase();
      if (paramString != null)
      {
        boolean bool = paramFile.equals(paramString.toLowerCase());
        return bool;
      }
    }
    catch (Throwable paramFile) {}
    return false;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.e
 * JD-Core Version:    0.7.0.1
 */