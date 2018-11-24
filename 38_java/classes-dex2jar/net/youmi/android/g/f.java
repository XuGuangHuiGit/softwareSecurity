package net.youmi.android.g;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

class f
  extends StateListDrawable
{
  f(d paramd, Drawable paramDrawable1, Drawable paramDrawable2)
  {
    addState(d.a(), paramDrawable1);
    addState(d.b(), paramDrawable1);
    addState(d.c(), paramDrawable2);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.g.f
 * JD-Core Version:    0.7.0.1
 */