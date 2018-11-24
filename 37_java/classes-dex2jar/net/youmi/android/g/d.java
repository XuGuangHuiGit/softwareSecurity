package net.youmi.android.g;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import net.youmi.android.g.a.a;

public class d
  extends ImageButton
{
  public d(Context paramContext, String paramString)
  {
    super(paramContext);
    try
    {
      setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramContext = a.a(paramString);
      if (paramContext == null) {
        return;
      }
      paramContext = new BitmapDrawable(getResources(), paramContext);
      a(paramContext, paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public d(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    try
    {
      setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramContext = a.a(paramString1);
      if (paramContext == null)
      {
        paramContext = null;
        paramString1 = a.a(paramString2);
        if (paramString1 != null) {
          break label61;
        }
      }
      label61:
      for (paramString1 = localObject;; paramString1 = new BitmapDrawable(getResources(), paramString1))
      {
        a(paramContext, paramString1);
        return;
        paramContext = new BitmapDrawable(getResources(), paramContext);
        break;
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    try
    {
      setImageDrawable(new f(this, paramDrawable1, paramDrawable2));
      try
      {
        label14:
        setBackgroundDrawable(new e(this));
        return;
      }
      catch (Throwable paramDrawable1) {}
    }
    catch (Throwable paramDrawable1)
    {
      break label14;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.g.d
 * JD-Core Version:    0.7.0.1
 */