package net.youmi.android.f.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.io.InputStream;

public class j
  extends ImageView
  implements g
{
  private h a = null;
  private Bitmap b = null;
  private boolean c = true;
  private boolean d = false;
  private m e = null;
  private Context f = null;
  private boolean g = false;
  private View h = null;
  private n i = n.b;
  private Handler j = new k(this);
  
  public j(Context paramContext)
  {
    super(paramContext);
    this.f = paramContext;
    setScaleType(ImageView.ScaleType.FIT_XY);
  }
  
  private void a()
  {
    if (this.j != null)
    {
      Message localMessage = this.j.obtainMessage();
      this.j.sendMessage(localMessage);
    }
  }
  
  private void b()
  {
    setImageBitmap(this.b);
    invalidate();
  }
  
  private void setGifDecoderImage(InputStream paramInputStream)
  {
    if (this.a == null) {
      this.a = new h(this);
    }
    this.a.a(paramInputStream);
    this.a.start();
  }
  
  private void setGifDecoderImage(byte[] paramArrayOfByte)
  {
    if (this.a == null) {
      this.a = new h(this);
    }
    this.a.a(paramArrayOfByte);
    this.a.start();
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean)
    {
      if (this.a == null) {
        break label212;
      }
      switch (l.a[this.i.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (paramInt != -1);
          if (this.a.b() > 1)
          {
            new m(this, null).start();
            return;
          }
          a();
          return;
          if (paramInt == 1)
          {
            this.b = this.a.c();
            a();
            return;
          }
        } while (paramInt != -1);
        if (this.a.b() <= 1) {
          break;
        }
      } while (this.e != null);
      this.e = new m(this, null);
      this.e.start();
      return;
      a();
      return;
      if (paramInt == 1)
      {
        this.b = this.a.c();
        a();
        return;
      }
      if (paramInt == -1)
      {
        a();
        return;
      }
    } while (this.e != null);
    this.e = new m(this, null);
    this.e.start();
    return;
    label212:
    Log.e("gif", "parse error");
  }
  
  protected Parcelable onSaveInstanceState()
  {
    super.onSaveInstanceState();
    if (this.a != null) {
      this.a.a();
    }
    return null;
  }
  
  public void setAsBackground(View paramView)
  {
    this.h = paramView;
  }
  
  public void setGifImage(int paramInt)
  {
    setGifDecoderImage(getResources().openRawResource(paramInt));
  }
  
  public void setGifImage(InputStream paramInputStream)
  {
    setGifDecoderImage(paramInputStream);
  }
  
  public void setGifImage(byte[] paramArrayOfByte)
  {
    setGifDecoderImage(paramArrayOfByte);
  }
  
  public void setGifImageType(n paramn)
  {
    if (this.a == null) {
      this.i = paramn;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.j
 * JD-Core Version:    0.7.0.1
 */