package net.youmi.android.f.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class h
  extends Thread
{
  private Bitmap A;
  private i B = null;
  private boolean C = false;
  private byte[] D = new byte[256];
  private int E = 0;
  private int F = 0;
  private int G = 0;
  private boolean H = false;
  private int I = 0;
  private int J;
  private short[] K;
  private byte[] L;
  private byte[] M;
  private byte[] N;
  private i O;
  private int P;
  private g Q = null;
  private byte[] R = null;
  private String S = null;
  private boolean T = false;
  public int a;
  public int b;
  private InputStream c;
  private int d;
  private boolean e;
  private int f;
  private int g = 1;
  private int[] h;
  private int[] i;
  private int[] j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private Bitmap z;
  
  public h(g paramg)
  {
    this.Q = paramg;
  }
  
  private void a(Bitmap paramBitmap, String paramString)
  {
    try
    {
      new File(this.S + File.separator + paramString + ".png");
      paramString = new FileOutputStream(this.S + File.separator + e() + ".png");
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString);
      return;
    }
    catch (Exception paramBitmap) {}
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    try
    {
      a(paramString);
      if (paramBoolean) {
        new File(paramString.toString()).delete();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private boolean a(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {}
    while (!localFile.isDirectory()) {
      return false;
    }
    String[] arrayOfString = localFile.list();
    int i1 = 0;
    boolean bool = false;
    if (i1 < arrayOfString.length) {
      if (paramString.endsWith(File.separator))
      {
        localFile = new File(paramString + arrayOfString[i1]);
        label86:
        if (!localFile.isFile()) {
          break label146;
        }
        localFile.delete();
      }
    }
    for (;;)
    {
      i1 += 1;
      break;
      localFile = new File(paramString + File.separator + arrayOfString[i1]);
      break label86;
      label146:
      if (localFile.isDirectory())
      {
        a(paramString + File.separator + arrayOfString[i1]);
        a(paramString + File.separator + arrayOfString[i1], true);
        bool = true;
        continue;
        return bool;
      }
    }
  }
  
  private int[] c(int paramInt)
  {
    int i2 = 0;
    int i3 = paramInt * 3;
    Object localObject = null;
    byte[] arrayOfByte = new byte[i3];
    int i1;
    int[] arrayOfInt;
    try
    {
      i1 = this.c.read(arrayOfByte);
      if (i1 < i3)
      {
        this.d = 1;
        return localObject;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        i1 = 0;
      }
      arrayOfInt = new int[256];
      i3 = 0;
      i1 = i2;
      i2 = i3;
    }
    for (;;)
    {
      localObject = arrayOfInt;
      if (i1 >= paramInt) {
        break;
      }
      int i5 = i2 + 1;
      i3 = arrayOfByte[i2];
      int i4 = i5 + 1;
      i5 = arrayOfByte[i5];
      i2 = i4 + 1;
      arrayOfInt[i1] = ((i3 & 0xFF) << 16 | 0xFF000000 | (i5 & 0xFF) << 8 | arrayOfByte[i4] & 0xFF);
      i1 += 1;
    }
  }
  
  private String e()
  {
    try
    {
      long l1 = System.currentTimeMillis();
      return String.valueOf(l1);
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void f()
  {
    int i6 = 0;
    int[] arrayOfInt = new int[this.a * this.b];
    int i1;
    if (this.G > 0) {
      if (this.G == 3)
      {
        i1 = this.P - 2;
        if (i1 > 0) {
          this.A = a(i1 - 1);
        }
      }
      else
      {
        if (this.A == null) {
          break label177;
        }
        this.A.getPixels(arrayOfInt, 0, this.a, 0, 0, this.a, this.b);
        if (this.G != 2) {
          break label177;
        }
        if (this.H) {
          break label463;
        }
      }
    }
    label177:
    label455:
    label463:
    for (int i2 = this.m;; i2 = 0)
    {
      int i3 = 0;
      for (;;)
      {
        if (i3 >= this.y) {
          break label177;
        }
        i4 = (this.w + i3) * this.a + this.v;
        i5 = this.x;
        i1 = i4;
        for (;;)
        {
          if (i1 < i5 + i4)
          {
            arrayOfInt[i1] = i2;
            i1 += 1;
            continue;
            this.A = null;
            break;
          }
        }
        i3 += 1;
      }
      int i4 = 8;
      int i5 = 1;
      i1 = 0;
      i3 = i6;
      i6 = i1;
      int i7;
      if (i3 < this.u)
      {
        if (!this.p) {
          break label455;
        }
        i1 = i6;
        i2 = i4;
        i7 = i5;
        if (i6 >= this.u) {
          i7 = i5 + 1;
        }
        switch (i7)
        {
        default: 
          i2 = i4;
          i1 = i6;
          i6 = i1 + i2;
          i5 = i7;
        }
      }
      for (;;)
      {
        i1 += this.s;
        if (i1 < this.b)
        {
          int i8 = this.a * i1;
          i7 = i8 + this.r;
          i4 = this.t + i7;
          i1 = i4;
          if (this.a + i8 < i4) {
            i1 = this.a + i8;
          }
          i4 = this.t * i3;
          for (;;)
          {
            if (i7 < i1)
            {
              i8 = this.N[i4];
              i8 = this.j[(i8 & 0xFF)];
              if (i8 != 0) {
                arrayOfInt[i7] = i8;
              }
              i7 += 1;
              i4 += 1;
              continue;
              i1 = 4;
              i2 = i4;
              break;
              i1 = 2;
              i2 = 4;
              break;
              i1 = 1;
              i2 = 2;
              break;
            }
          }
        }
        i3 += 1;
        i4 = i2;
        break;
        this.z = Bitmap.createBitmap(arrayOfInt, this.a, this.b, Bitmap.Config.ARGB_4444);
        return;
        i1 = i3;
        i2 = i4;
      }
    }
  }
  
  private int g()
  {
    this.c = new ByteArrayInputStream(this.R);
    this.R = null;
    return h();
  }
  
  private int h()
  {
    k();
    if (this.c != null)
    {
      p();
      if (!j())
      {
        n();
        if (this.P >= 0) {
          break label61;
        }
        this.d = 1;
        this.Q.a(false, -1);
      }
    }
    for (;;)
    {
      try
      {
        this.c.close();
        return this.d;
        label61:
        this.d = -1;
        this.Q.a(true, -1);
        continue;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      this.d = 2;
      this.Q.a(false, -1);
    }
  }
  
  private void i()
  {
    int i16 = this.t * this.u;
    if ((this.N == null) || (this.N.length < i16)) {
      this.N = new byte[i16];
    }
    if (this.K == null) {
      this.K = new short[4096];
    }
    if (this.L == null) {
      this.L = new byte[4096];
    }
    if (this.M == null) {
      this.M = new byte[4097];
    }
    int i17 = l();
    int i18 = 1 << i17;
    int i7 = i18 + 2;
    int i2 = i17 + 1;
    int i3 = (1 << i2) - 1;
    int i1 = 0;
    while (i1 < i18)
    {
      this.K[i1] = 0;
      this.L[i1] = ((byte)i1);
      i1 += 1;
    }
    int i10 = 0;
    int i4 = 0;
    int i8 = 0;
    int i5 = 0;
    int i13 = 0;
    int i11 = 0;
    int i6 = 0;
    i1 = -1;
    int i12 = 0;
    int i9;
    if (i13 < i16)
    {
      if (i4 != 0) {
        break label658;
      }
      if (i6 >= i2) {
        break label275;
      }
      i9 = i11;
      if (i11 != 0) {
        break label234;
      }
      i9 = m();
      if (i9 > 0) {
        break label231;
      }
    }
    label231:
    label234:
    int i14;
    label275:
    int i15;
    for (;;)
    {
      if (i10 < i16)
      {
        this.N[i10] = 0;
        i10 += 1;
        continue;
        i12 = 0;
        i5 += ((this.D[i12] & 0xFF) << i6);
        i6 += 8;
        i12 += 1;
        i11 = i9 - 1;
        break;
        i9 = i5 & i3;
        i14 = i5 >> i2;
        i6 -= i2;
        if ((i9 <= i7) && (i9 != i18 + 1))
        {
          if (i9 == i18)
          {
            i2 = i17 + 1;
            i3 = (1 << i2) - 1;
            i7 = i18 + 2;
            i1 = -1;
            i5 = i14;
            break;
          }
          if (i1 == -1)
          {
            this.M[i4] = this.L[i9];
            i4 += 1;
            i1 = i9;
            i8 = i9;
            i5 = i14;
            break;
          }
          if (i9 != i7) {
            break label651;
          }
          byte[] arrayOfByte = this.M;
          i15 = i4 + 1;
          arrayOfByte[i4] = ((byte)i8);
          i5 = i1;
          i4 = i15;
          label415:
          while (i5 > i18)
          {
            this.M[i4] = this.L[i5];
            i5 = this.K[i5];
            i4 += 1;
          }
          i15 = this.L[i5] & 0xFF;
          if (i7 < 4096)
          {
            this.M[i4] = ((byte)i15);
            this.K[i7] = ((short)i1);
            this.L[i7] = ((byte)i15);
            i8 = i7 + 1;
            i1 = i2;
            i5 = i3;
            if ((i8 & i3) == 0)
            {
              i1 = i2;
              i5 = i3;
              if (i8 < 4096)
              {
                i1 = i2 + 1;
                i5 = i3 + i8;
              }
            }
            i3 = i14;
            i7 = i5;
            i5 = i15;
            i14 = i4 + 1;
            i2 = i8;
            i4 = i7;
            i7 = i1;
            i1 = i9;
            i8 = i14;
          }
        }
      }
    }
    for (;;)
    {
      i15 = i8 - 1;
      this.N[i10] = this.M[i15];
      i13 += 1;
      i14 = i10 + 1;
      i8 = i7;
      i9 = i3;
      i10 = i15;
      i7 = i2;
      i2 = i8;
      i3 = i4;
      i4 = i10;
      i8 = i5;
      i5 = i9;
      i10 = i14;
      break;
      return;
      label651:
      i5 = i9;
      break label415;
      label658:
      i9 = i3;
      i3 = i8;
      i8 = i4;
      i4 = i5;
      i14 = i7;
      i5 = i3;
      i3 = i4;
      i7 = i2;
      i4 = i9;
      i2 = i14;
    }
  }
  
  private boolean j()
  {
    return this.d != 0;
  }
  
  private void k()
  {
    this.d = 0;
    this.P = 0;
    this.O = null;
    this.h = null;
    this.i = null;
  }
  
  private int l()
  {
    try
    {
      int i1 = this.c.read();
      return i1;
    }
    catch (Exception localException)
    {
      this.d = 1;
    }
    return 0;
  }
  
  private int m()
  {
    this.E = l();
    int i2 = 0;
    int i1 = 0;
    if (this.E > 0) {}
    for (;;)
    {
      try
      {
        if (i1 < this.E)
        {
          i2 = this.c.read(this.D, i1, this.E - i1);
          if (i2 != -1) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      i2 = i1;
      if (i1 < this.E)
      {
        this.d = 1;
        i2 = i1;
      }
      return i2;
      i1 += i2;
    }
  }
  
  private void n()
  {
    int i1 = 0;
    while ((i1 == 0) && (!j())) {
      switch (l())
      {
      case 0: 
      default: 
        this.d = 1;
        break;
      case 44: 
        q();
        break;
      case 33: 
        switch (l())
        {
        default: 
          v();
          break;
        case 249: 
          o();
          break;
        case 255: 
          m();
          String str = "";
          int i2 = 0;
          while (i2 < 11)
          {
            str = str + (char)this.D[i2];
            i2 += 1;
          }
          if (str.equals("NETSCAPE2.0")) {
            s();
          } else {
            v();
          }
          break;
        }
        break;
      case 59: 
        i1 = 1;
      }
    }
  }
  
  private void o()
  {
    boolean bool = true;
    l();
    int i1 = l();
    this.F = ((i1 & 0x1C) >> 2);
    if (this.F == 0) {
      this.F = 1;
    }
    if ((i1 & 0x1) != 0) {}
    for (;;)
    {
      this.H = bool;
      this.I = (t() * 10);
      this.J = l();
      l();
      return;
      bool = false;
    }
  }
  
  private void p()
  {
    String str = "";
    int i1 = 0;
    while (i1 < 6)
    {
      str = str + (char)l();
      i1 += 1;
    }
    if (!str.startsWith("GIF")) {
      this.d = 1;
    }
    do
    {
      return;
      r();
    } while ((!this.e) || (j()));
    this.h = c(this.f);
    this.l = this.h[this.k];
  }
  
  private void q()
  {
    int i1 = 0;
    this.r = t();
    this.s = t();
    this.t = t();
    this.u = t();
    int i2 = l();
    boolean bool;
    if ((i2 & 0x80) != 0)
    {
      bool = true;
      this.o = bool;
      if ((i2 & 0x40) == 0) {
        break label157;
      }
      bool = true;
      label63:
      this.p = bool;
      this.q = (2 << (i2 & 0x7));
      if (!this.o) {
        break label162;
      }
      this.i = c(this.q);
      this.j = this.i;
      label105:
      if (this.H)
      {
        i1 = this.j[this.J];
        this.j[this.J] = 0;
      }
      if (this.j == null) {
        this.d = 1;
      }
      if (!j()) {
        break label189;
      }
    }
    label157:
    label162:
    label189:
    do
    {
      return;
      bool = false;
      break;
      bool = false;
      break label63;
      this.j = this.h;
      if (this.k != this.J) {
        break label105;
      }
      this.l = 0;
      break label105;
      i();
      v();
    } while (j());
    this.P += 1;
    this.z = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_4444);
    f();
    Object localObject;
    if (this.O == null) {
      if (this.T)
      {
        localObject = e();
        this.O = new i(this.S + File.separator + (String)localObject + ".png", this.I);
        a(this.z, (String)localObject);
        this.B = this.O;
      }
    }
    for (;;)
    {
      if (this.H) {
        this.j[this.J] = i1;
      }
      u();
      this.Q.a(true, this.P);
      return;
      this.O = new i(this.z, this.I);
      break;
      for (localObject = this.O; ((i)localObject).d != null; localObject = ((i)localObject).d) {}
      if (this.T)
      {
        String str = e();
        ((i)localObject).d = new i(this.S + File.separator + str + ".png", this.I);
        a(this.z, str);
      }
      else
      {
        ((i)localObject).d = new i(this.z, this.I);
      }
    }
  }
  
  private void r()
  {
    this.a = t();
    this.b = t();
    int i1 = l();
    if ((i1 & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      this.f = (2 << (i1 & 0x7));
      this.k = l();
      this.n = l();
      return;
    }
  }
  
  private void s()
  {
    do
    {
      m();
      if (this.D[0] == 1) {
        this.g = (this.D[1] & 0xFF | (this.D[2] & 0xFF) << 8);
      }
    } while ((this.E > 0) && (!j()));
  }
  
  private int t()
  {
    return l() | l() << 8;
  }
  
  private void u()
  {
    this.G = this.F;
    this.v = this.r;
    this.w = this.s;
    this.x = this.t;
    this.y = this.u;
    this.A = this.z;
    this.m = this.l;
    this.F = 0;
    this.H = false;
    this.I = 0;
    this.i = null;
  }
  
  private void v()
  {
    do
    {
      m();
    } while ((this.E > 0) && (!j()));
  }
  
  public Bitmap a(int paramInt)
  {
    i locali = b(paramInt);
    if (locali == null) {
      return null;
    }
    return locali.a;
  }
  
  public void a()
  {
    i locali = this.O;
    if (!this.T) {
      while (locali != null)
      {
        if ((locali.a != null) && (!locali.a.isRecycled())) {
          locali.a.recycle();
        }
        locali.a = null;
        this.O = this.O.d;
        locali = this.O;
      }
    }
    a(this.S, true);
    if (this.c != null) {}
    try
    {
      this.c.close();
      label87:
      this.c = null;
      this.R = null;
      this.d = 0;
      this.B = null;
      return;
    }
    catch (Exception localException)
    {
      break label87;
    }
  }
  
  public void a(InputStream paramInputStream)
  {
    this.c = paramInputStream;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.R = paramArrayOfByte;
  }
  
  public int b()
  {
    return this.P;
  }
  
  public i b(int paramInt)
  {
    i locali = this.O;
    int i1 = 0;
    while (locali != null)
    {
      if (i1 == paramInt) {
        return locali;
      }
      locali = locali.d;
      i1 += 1;
    }
    return null;
  }
  
  public Bitmap c()
  {
    return a(0);
  }
  
  public i d()
  {
    if (!this.C)
    {
      this.C = true;
      return this.O;
    }
    if (this.B == null) {
      return null;
    }
    if (this.d == 0) {
      if (this.B.d != null) {
        this.B = this.B.d;
      }
    }
    for (;;)
    {
      return this.B;
      this.B = this.B.d;
      if (this.B == null) {
        this.B = this.O;
      }
    }
  }
  
  public void run()
  {
    if (this.c != null) {
      h();
    }
    while (this.R == null) {
      return;
    }
    g();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.h
 * JD-Core Version:    0.7.0.1
 */