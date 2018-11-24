package net.youmi.android.c.c;

import java.io.IOException;
import java.io.InputStream;

class b
  extends InputStream
{
  private InputStream a;
  private int[] b;
  private int c = 0;
  private boolean d = false;
  
  public b(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }
  
  private void a()
  {
    int n = 1;
    int i1 = 0;
    char[] arrayOfChar = new char[4];
    int j = 0;
    int k = this.a.read();
    if (k == -1)
    {
      if (j != 0) {
        throw new IOException("Bad base64 stream");
      }
      this.b = new int[0];
      this.d = true;
    }
    for (;;)
    {
      return;
      int i = (char)k;
      if ((d.a.indexOf(i) != -1) || (i == d.b))
      {
        arrayOfChar[j] = i;
        k = j + 1;
        j = k;
        if (k < 4) {
          break;
        }
        k = 0;
        j = 0;
      }
      for (;;)
      {
        if (j >= 4) {
          break label172;
        }
        if (arrayOfChar[j] != d.b)
        {
          m = k;
          if (k == 0) {
            break label162;
          }
          throw new IOException("Bad base64 stream");
          k = j;
          if (i == 13) {
            break;
          }
          k = j;
          if (i == 10) {
            break;
          }
          throw new IOException("Bad base64 stream");
        }
        m = k;
        if (k == 0) {
          m = 1;
        }
        label162:
        j += 1;
        k = m;
      }
      label172:
      if (arrayOfChar[3] == d.b)
      {
        if (this.a.read() != -1) {
          throw new IOException("Bad base64 stream");
        }
        this.d = true;
        if (arrayOfChar[2] == d.b) {
          j = n;
        }
      }
      for (;;)
      {
        k = 0;
        m = 0;
        while (m < 4)
        {
          n = k;
          if (arrayOfChar[m] != d.b) {
            n = k | d.a.indexOf(arrayOfChar[m]) << (3 - m) * 6;
          }
          m += 1;
          k = n;
        }
        j = 2;
        continue;
        j = 3;
      }
      this.b = new int[j];
      int m = i1;
      while (m < j)
      {
        this.b[m] = (k >>> (2 - m) * 8 & 0xFF);
        m += 1;
      }
    }
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public int read()
  {
    if ((this.b == null) || (this.c == this.b.length))
    {
      if (this.d) {
        return -1;
      }
      a();
      if (this.b.length == 0)
      {
        this.b = null;
        return -1;
      }
      this.c = 0;
    }
    int[] arrayOfInt = this.b;
    int i = this.c;
    this.c = (i + 1);
    return arrayOfInt[i];
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.b
 * JD-Core Version:    0.7.0.1
 */