package net.youmi.android.c.c;

import java.io.OutputStream;

class c
  extends OutputStream
{
  private OutputStream a = null;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  
  public c(OutputStream paramOutputStream, int paramInt)
  {
    this.a = paramOutputStream;
    this.e = paramInt;
  }
  
  protected void a()
  {
    int k;
    int m;
    int i;
    if (this.c > 0)
    {
      if ((this.e > 0) && (this.d == this.e))
      {
        this.a.write("\r\n".getBytes());
        this.d = 0;
      }
      k = d.a.charAt(this.b << 8 >>> 26);
      m = d.a.charAt(this.b << 14 >>> 26);
      if (this.c >= 2) {
        break label155;
      }
      i = d.b;
      if (this.c >= 3) {
        break label175;
      }
    }
    label155:
    label175:
    for (int j = d.b;; j = d.a.charAt(this.b << 26 >>> 26))
    {
      this.a.write(k);
      this.a.write(m);
      this.a.write(i);
      this.a.write(j);
      this.d += 4;
      this.c = 0;
      this.b = 0;
      return;
      i = d.a.charAt(this.b << 20 >>> 26);
      break;
    }
  }
  
  public void close()
  {
    a();
    this.a.close();
  }
  
  public void write(int paramInt)
  {
    this.b = ((paramInt & 0xFF) << 16 - this.c * 8 | this.b);
    this.c += 1;
    if (this.c == 3) {
      a();
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.c.c
 * JD-Core Version:    0.7.0.1
 */