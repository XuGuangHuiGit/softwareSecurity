package net.youmi.android.spot;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class e
  extends Handler
{
  e(b paramb) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = 0;
    super.handleMessage(paramMessage);
    if (paramMessage.what == 1) {
      for (;;)
      {
        try
        {
          this.a.setCancelable(true);
          b.a(this.a, new ImageView(b.c(this.a)));
          b.d(this.a).setId(1);
          b.d(this.a).setVisibility(4);
          b.d(this.a).setImageBitmap(b.d);
          b.d(this.a).setOnClickListener(this.a);
          if (b.e(this.a) == 1)
          {
            if (b.a() == 1)
            {
              paramMessage = b.f(this.a).getImageMatrix();
              Rect localRect = b.f(this.a).getDrawable().getBounds();
              float[] arrayOfFloat = new float[9];
              paramMessage.getValues(arrayOfFloat);
              float f1 = arrayOfFloat[2];
              float f2 = arrayOfFloat[5];
              float f3 = arrayOfFloat[2];
              float f4 = localRect.width();
              float f5 = arrayOfFloat[0];
              float f6 = arrayOfFloat[5];
              float f7 = localRect.height();
              float f8 = arrayOfFloat[0];
              net.youmi.android.c.e.b.a("SpotAD", "left:" + f1 + " right:" + (f3 + f4 * f5) + " top:" + f2 + " bottom:" + (f7 * f8 + f6), new Object[0]);
              i = (int)f1;
              j = b.g(this.a) + i;
              i = b.g(this.a) + (int)f2;
              b.d(this.a).setPadding(b.h(this.a), i, j, b.h(this.a));
              paramMessage = new RelativeLayout.LayoutParams(j + (b.i(this.a) + b.h(this.a)), i + (b.i(this.a) + b.h(this.a)));
              paramMessage.addRule(10, -1);
              paramMessage.addRule(7, 2);
              this.a.c.addView(b.d(this.a), paramMessage);
              b.d(this.a).setVisibility(0);
              b.c(b.c(this.a));
              this.a.b(b.c(this.a));
              return;
            }
            if (b.a() == 2)
            {
              j = b.g(this.a);
              i = b.g(this.a);
              continue;
            }
          }
          else
          {
            j = b.g(this.a);
            i = b.g(this.a);
            continue;
          }
          int j = 0;
        }
        catch (Throwable paramMessage)
        {
          return;
        }
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.spot.e
 * JD-Core Version:    0.7.0.1
 */