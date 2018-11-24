package net.youmi.android.g;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;

class e
  extends StateListDrawable
{
  e(d paramd)
  {
    paramd = new ColorDrawable(0);
    ColorDrawable localColorDrawable = new ColorDrawable(Color.parseColor("#661E90FF"));
    addState(d.d(), localColorDrawable);
    addState(d.e(), paramd);
    addState(d.f(), paramd);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.g.e
 * JD-Core Version:    0.7.0.1
 */