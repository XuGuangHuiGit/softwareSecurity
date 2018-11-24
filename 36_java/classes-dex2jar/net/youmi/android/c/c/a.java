package net.youmi.android.c.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class a
{
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    b(new b(paramInputStream), paramOutputStream);
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream = new c(paramOutputStream, paramInt);
    b(paramInputStream, paramOutputStream);
    paramOutputStream.a();
  }
  
  public static byte[] a(String paramString)
  {
    try
    {
      paramString = b(paramString.getBytes("UTF-8"));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 is not supported!", paramString);
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0);
  }
  
  /* Error */
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: new 54	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 57	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_3
    //   9: new 59	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 61	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore_0
    //   17: aload_3
    //   18: aload_0
    //   19: iload_1
    //   20: invokestatic 63	net/youmi/android/c/c/a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;I)V
    //   23: aload_3
    //   24: invokevirtual 66	java/io/ByteArrayInputStream:close	()V
    //   27: aload_0
    //   28: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   31: aload_0
    //   32: invokevirtual 71	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   35: areturn
    //   36: astore_2
    //   37: new 40	java/lang/RuntimeException
    //   40: dup
    //   41: ldc 73
    //   43: aload_2
    //   44: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   47: athrow
    //   48: astore_2
    //   49: aload_3
    //   50: invokevirtual 66	java/io/ByteArrayInputStream:close	()V
    //   53: aload_0
    //   54: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   57: aload_2
    //   58: athrow
    //   59: astore_2
    //   60: goto -33 -> 27
    //   63: astore_2
    //   64: goto -33 -> 31
    //   67: astore_3
    //   68: goto -15 -> 53
    //   71: astore_0
    //   72: goto -15 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramArrayOfByte	byte[]
    //   0	75	1	paramInt	int
    //   36	8	2	localIOException	java.io.IOException
    //   48	10	2	localObject	Object
    //   59	1	2	localThrowable1	java.lang.Throwable
    //   63	1	2	localThrowable2	java.lang.Throwable
    //   8	42	3	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   67	1	3	localThrowable3	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   17	23	36	java/io/IOException
    //   17	23	48	finally
    //   37	48	48	finally
    //   23	27	59	java/lang/Throwable
    //   27	31	63	java/lang/Throwable
    //   49	53	67	java/lang/Throwable
    //   53	57	71	java/lang/Throwable
  }
  
  private static void b(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[1024];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  /* Error */
  public static byte[] b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 54	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 57	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_2
    //   9: new 59	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 61	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore_0
    //   17: aload_2
    //   18: aload_0
    //   19: invokestatic 87	net/youmi/android/c/c/a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   22: aload_2
    //   23: invokevirtual 66	java/io/ByteArrayInputStream:close	()V
    //   26: aload_0
    //   27: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   30: aload_0
    //   31: invokevirtual 71	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   34: areturn
    //   35: astore_1
    //   36: new 40	java/lang/RuntimeException
    //   39: dup
    //   40: ldc 73
    //   42: aload_1
    //   43: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   46: athrow
    //   47: astore_1
    //   48: aload_2
    //   49: invokevirtual 66	java/io/ByteArrayInputStream:close	()V
    //   52: aload_0
    //   53: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   56: aload_1
    //   57: athrow
    //   58: astore_1
    //   59: goto -33 -> 26
    //   62: astore_1
    //   63: goto -33 -> 30
    //   66: astore_2
    //   67: goto -15 -> 52
    //   70: astore_0
    //   71: goto -15 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramArrayOfByte	byte[]
    //   35	8	1	localIOException	java.io.IOException
    //   47	10	1	localObject	Object
    //   58	1	1	localThrowable1	java.lang.Throwable
    //   62	1	1	localThrowable2	java.lang.Throwable
    //   8	41	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   66	1	2	localThrowable3	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   17	22	35	java/io/IOException
    //   17	22	47	finally
    //   36	47	47	finally
    //   22	26	58	java/lang/Throwable
    //   26	30	62	java/lang/Throwable
    //   48	52	66	java/lang/Throwable
    //   52	56	70	java/lang/Throwable
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.a
 * JD-Core Version:    0.7.0.1
 */