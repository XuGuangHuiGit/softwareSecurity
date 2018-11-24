package net.youmi.android.f.a;

import android.graphics.BitmapFactory;
import android.os.SystemClock;

class m
  extends Thread
{
  private m(j paramj) {}
  
  public void run()
  {
    if (j.d(this.a) == null) {}
    label11:
    label42:
    label188:
    for (;;)
    {
      return;
      i locali;
      if (!j.g(this.a))
      {
        locali = j.d(this.a).d();
        if (locali == null) {
          SystemClock.sleep(50L);
        }
      }
      for (;;)
      {
        if (!j.e(this.a)) {
          break label188;
        }
        if (j.d(this.a).b() != 1) {
          break label11;
        }
        locali = j.d(this.a).d();
        j.a(this.a, locali.a);
        j.d(this.a).a();
        j.f(this.a);
        return;
        if (locali.a != null) {
          j.a(this.a, locali.a);
        }
        for (;;)
        {
          long l = locali.b;
          if (j.h(this.a) == null) {
            break;
          }
          j.f(this.a);
          SystemClock.sleep(l);
          break label42;
          if (locali.c != null) {
            j.a(this.a, BitmapFactory.decodeFile(locali.c));
          }
        }
        SystemClock.sleep(50L);
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.m
 * JD-Core Version:    0.7.0.1
 */