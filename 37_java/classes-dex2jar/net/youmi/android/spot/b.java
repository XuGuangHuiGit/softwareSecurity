package net.youmi.android.spot;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import net.youmi.android.AdBrowser;
import net.youmi.android.a.a.a.g;
import net.youmi.android.a.h.i;
import net.youmi.android.a.h.l;
import net.youmi.android.c.k.h;
import net.youmi.android.f.a.p;
import net.youmi.android.f.a.t;
import net.youmi.android.f.a.u;
import org.json.JSONObject;

public class b
  extends Dialog
  implements View.OnClickListener
{
  private static float[] H = { 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F };
  private static int O = 1;
  public static Bitmap d = net.youmi.android.g.a.a.a(f.a());
  public static Bitmap e = net.youmi.android.g.a.a.a(f.b());
  public static Bitmap f = net.youmi.android.g.a.a.a(f.c());
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F = 15;
  private int G = 6;
  private String I = "#99333333";
  private RelativeLayout J;
  private Button K;
  private ImageView L;
  private ImageView M;
  private net.youmi.android.f.a.j N;
  private e P = new e(this);
  private SpotDialogLinstener Q;
  protected int a;
  LinearLayout b;
  RelativeLayout c;
  Bitmap g = null;
  File h = null;
  private Context i;
  private boolean j = false;
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private int r;
  private int s;
  private String t;
  private String u;
  private int v;
  private int w;
  private int x;
  private String y;
  private String z;
  
  public b(Context paramContext, int paramInt, String paramString, SpotDialogLinstener paramSpotDialogLinstener)
  {
    super(paramContext, paramInt);
    this.i = paramContext;
    this.k = paramString;
    this.Q = paramSpotDialogLinstener;
    c();
    b();
    this.b = new LinearLayout(paramContext);
    this.b.setGravity(17);
    this.b.setOrientation(1);
    this.b.setBackgroundColor(Color.parseColor(this.I));
    this.c = new RelativeLayout(paramContext);
    this.c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.b.addView(this.c);
    if (this.r == 0)
    {
      paramString = new ShapeDrawable(new RoundRectShape(H, null, null));
      paramString.getPaint().setARGB(255, 255, 255, 255);
      if (O == 1)
      {
        this.M = new ImageView(paramContext);
        this.M.setAdjustViewBounds(true);
        this.M.setId(2);
        this.M.setOnClickListener(this);
        this.M.setLayoutParams(new RelativeLayout.LayoutParams(this.A, this.A));
        if (!a(this.q)) {}
      }
    }
    for (;;)
    {
      this.c.addView(this.M);
      this.g = p.a(paramContext, this.q);
      label303:
      this.J = new RelativeLayout(paramContext);
      paramString = new RelativeLayout.LayoutParams(this.A, this.A);
      Object localObject = new ShapeDrawable(new RoundRectShape(H, null, null));
      ((ShapeDrawable)localObject).getPaint().setColor(Color.parseColor(this.I));
      this.J.setBackgroundDrawable((Drawable)localObject);
      this.J.setVisibility(4);
      this.J.setLayoutParams(paramString);
      this.J.setId(3);
      this.J.setOnClickListener(this);
      this.c.addView(this.J);
      label419:
      this.K = new Button(paramContext);
      if (this.w == 0)
      {
        this.K.setText("点击免费下载");
        label447:
        this.K.setGravity(17);
        this.K.setTextSize(this.F);
        this.K.setTextColor(Color.parseColor("#663300"));
        this.K.setBackgroundColor(0);
        paramContext = new RelativeLayout.LayoutParams(-2, -2);
        if (this.r != 1) {
          break label1079;
        }
        paramContext.addRule(13);
        label515:
        this.K.setLayoutParams(paramContext);
        this.K.setId(4);
        this.K.setOnClickListener(this);
        paramContext = new StateListDrawable();
        paramString = new BitmapDrawable(f);
        localObject = new BitmapDrawable(e);
        paramContext.addState(new int[] { 16842919, 16842910 }, paramString);
        paramContext.addState(new int[] { 16842910 }, (Drawable)localObject);
        this.K.setBackgroundDrawable(paramContext);
        this.J.addView(this.K);
        setCancelable(false);
        setContentView(this.b);
        this.j = true;
      }
      try
      {
        if (this.g != null)
        {
          this.M.setImageBitmap(this.g);
          show();
        }
        label1079:
        do
        {
          return;
          this.M.setPadding(this.G, this.G, this.G, this.G);
          this.M.setBackgroundDrawable(paramString);
          break;
          if (O != 2) {
            break label303;
          }
          this.N = new net.youmi.android.f.a.j(paramContext);
          this.N.setId(2);
          this.N.setOnClickListener(this);
          this.N.setLayoutParams(new RelativeLayout.LayoutParams(this.A, this.A));
          this.N.setPadding(this.G, this.G, this.G, this.G);
          this.N.setBackgroundDrawable(paramString);
          this.h = net.youmi.android.f.a.c.a(paramContext, this.q);
          this.c.addView(this.N);
          break label303;
          if (this.r != 1) {
            break label419;
          }
          if (O == 1)
          {
            this.M = new ImageView(paramContext);
            this.M.setId(2);
            this.M.setOnClickListener(this);
            this.M.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.M.setAdjustViewBounds(true);
            this.c.addView(this.M);
            this.g = p.a(paramContext, this.q);
          }
          for (;;)
          {
            this.J = new RelativeLayout(paramContext);
            paramString = new RelativeLayout.LayoutParams(-1, -1);
            this.J.setVisibility(4);
            this.J.setLayoutParams(paramString);
            this.J.setBackgroundColor(Color.parseColor(this.I));
            this.J.setId(3);
            this.J.setOnClickListener(this);
            this.c.addView(this.J);
            break;
            if (O == 2) {
              try
              {
                this.N = new net.youmi.android.f.a.j(paramContext);
                this.N.setId(2);
                this.N.setOnClickListener(this);
                this.N.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.c.addView(this.N);
                this.h = net.youmi.android.f.a.c.a(paramContext, this.q);
              }
              catch (Throwable paramString) {}
            }
          }
          this.K.setText("点击查看详情");
          break label447;
          paramContext.addRule(12, -1);
          paramContext.addRule(14);
          paramContext.bottomMargin = this.E;
          break label515;
          if ((this.h != null) && (this.h.exists()))
          {
            paramContext = a(this.h);
            this.N.setGifImage(paramContext);
            show();
            return;
          }
        } while (paramSpotDialogLinstener == null);
        paramSpotDialogLinstener.onShowFailed();
        return;
      }
      catch (Throwable paramContext) {}
    }
  }
  
  protected static boolean a(String paramString)
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = paramString.substring(paramString.lastIndexOf(".") + 1).toLowerCase().equals("png");
      if (bool2) {
        bool1 = true;
      }
      return bool1;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  public static byte[] a(File paramFile)
  {
    System.currentTimeMillis();
    Object localObject = null;
    FileInputStream localFileInputStream;
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      localFileInputStream = new FileInputStream(paramFile);
      localByteArrayOutputStream = new ByteArrayOutputStream(localFileInputStream.available());
      paramFile = new byte[2048];
      for (;;)
      {
        int i1 = localFileInputStream.read(paramFile);
        if (i1 == -1) {
          break;
        }
        localByteArrayOutputStream.write(paramFile, 0, i1);
      }
      System.currentTimeMillis();
    }
    catch (Throwable paramFile)
    {
      paramFile = localObject;
    }
    for (;;)
    {
      return paramFile;
      paramFile = localByteArrayOutputStream.toByteArray();
      try
      {
        localFileInputStream.close();
        localByteArrayOutputStream.close();
      }
      catch (Throwable localThrowable) {}
    }
  }
  
  private void b()
  {
    net.youmi.android.c.k.d locald = net.youmi.android.c.k.d.a(this.i);
    if (locald.g() <= 240)
    {
      this.A = 200;
      this.B = 20;
      this.C = 5;
      this.D = 20;
      this.E = 20;
      return;
    }
    if (locald.g() <= 320)
    {
      this.A = 280;
      this.B = 30;
      this.C = 5;
      this.D = 30;
      this.E = 30;
      return;
    }
    if (locald.g() <= 480)
    {
      this.A = 400;
      this.B = 40;
      this.C = 8;
      this.D = 40;
      this.E = 40;
      this.F = 18;
      return;
    }
    if (locald.g() <= 600)
    {
      this.A = (locald.g() - 100);
      this.B = 50;
      this.C = 10;
      this.D = 50;
      this.E = 50;
      this.F = 20;
      this.G = 8;
      return;
    }
    this.A = (locald.g() - 160);
    this.B = 60;
    this.C = 10;
    this.D = 60;
    this.E = 50;
    this.F = 20;
    this.G = 10;
  }
  
  private void c()
  {
    try
    {
      JSONObject localJSONObject = net.youmi.android.c.b.b.a(this.k);
      this.a = net.youmi.android.c.b.b.a(localJSONObject, "spotid", 0);
      this.m = net.youmi.android.c.b.b.a(localJSONObject, "rsd", "");
      this.l = net.youmi.android.c.b.b.a(localJSONObject, "e", "");
      this.q = net.youmi.android.c.b.b.a(localJSONObject, "pic", "");
      this.p = net.youmi.android.c.b.b.a(localJSONObject, "appname", "");
      this.n = net.youmi.android.c.b.b.a(localJSONObject, "app", "");
      this.o = net.youmi.android.c.b.b.a(localJSONObject, "packName", "");
      this.t = net.youmi.android.c.b.b.a(localJSONObject, "tips", "");
      this.u = net.youmi.android.c.b.b.a(localJSONObject, "itips", "");
      this.r = net.youmi.android.c.b.b.a(localJSONObject, "adtype", 0);
      this.I = net.youmi.android.c.b.b.a(localJSONObject, "bgcolor", "#99333333");
      this.s = net.youmi.android.c.b.b.a(localJSONObject, "delay", 1000);
      this.v = net.youmi.android.c.b.b.a(localJSONObject, "disclk", 0);
      this.w = net.youmi.android.c.b.b.a(localJSONObject, "cptype", 0);
      this.x = net.youmi.android.c.b.b.a(localJSONObject, "io", 0);
      this.y = net.youmi.android.c.b.b.a(localJSONObject, "url", "");
      this.z = net.youmi.android.c.b.b.a(localJSONObject, "jsc", "");
      if (this.a != 0)
      {
        if (this.n.equals("")) {
          return;
        }
        O = SpotManager.a(this.q);
        if (O == 2)
        {
          this.h = null;
          return;
        }
        this.g = null;
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void c(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("spotData", 0).edit();
      paramContext.putLong("lastShowTime", System.currentTimeMillis());
      paramContext.commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private void d()
  {
    if (this.x == 0)
    {
      l locall = new l(2, 405);
      locall.e(this.y);
      locall.b(this.z);
      locall.b(1);
      Intent localIntent = new Intent(this.i, AdBrowser.class);
      localIntent.putExtra("aca5522945c72310f9f22b333c68f2b3", locall);
      localIntent.setFlags(268435456);
      this.i.startActivity(localIntent);
    }
    for (;;)
    {
      if (this.Q != null) {
        this.Q.onClicked();
      }
      return;
      t.a(this.i, this.y);
    }
  }
  
  private void e()
  {
    if (h.a(this.i, this.o)) {
      net.youmi.android.c.k.f.b(this.i, this.o);
    }
    do
    {
      return;
      i locali = new i();
      locali.b(true);
      locali.a(true);
      locali.b(this.t);
      locali.c(this.u);
      Object localObject1 = new net.youmi.android.a.a.a.a(this.a, 2);
      Object localObject2 = new net.youmi.android.a.a.a.d();
      ((net.youmi.android.a.a.a.d)localObject2).a(this.n);
      ((net.youmi.android.a.a.a.a)localObject1).a((net.youmi.android.a.a.a.d)localObject2);
      locali.a((net.youmi.android.a.a.a.a)localObject1);
      localObject2 = new g();
      ((g)localObject2).b(this.o);
      ((g)localObject2).a(this.p);
      ((net.youmi.android.a.a.a.a)localObject1).a((g)localObject2);
      localObject1 = new net.youmi.android.a.h.j();
      ((net.youmi.android.a.h.j)localObject1).b(this.m);
      ((net.youmi.android.a.h.j)localObject1).a(net.youmi.android.f.a.a.a);
      ((net.youmi.android.a.h.j)localObject1).c(this.l);
      locali.a((net.youmi.android.a.h.j)localObject1);
      net.youmi.android.d.a.a.a(this.i).a(locali, null);
    } while (this.Q == null);
    this.Q.onClicked();
  }
  
  public void a(Context paramContext)
  {
    try
    {
      new Thread(new c(this, paramContext)).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void b(Context paramContext)
  {
    try
    {
      new Thread(new d(this, paramContext)).start();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public void dismiss()
  {
    super.dismiss();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    net.youmi.android.c.e.b.a("SpotAD", "onAttachedToWindow", new Object[0]);
    Message localMessage = new Message();
    localMessage.what = 1;
    this.P.sendMessageDelayed(localMessage, this.s);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 1) {
      dismiss();
    }
    do
    {
      return;
      if (paramView.getId() == 3)
      {
        this.J.setVisibility(8);
        return;
      }
      if (paramView.getId() == 4)
      {
        if (this.w == 1) {
          d();
        }
        for (;;)
        {
          dismiss();
          return;
          e();
          a(this.i);
        }
      }
    } while (paramView.getId() != 2);
    int i1;
    if (this.v == 0) {
      i1 = 0;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        this.J.setVisibility(0);
        return;
        if (this.v == 1)
        {
          i1 = 1;
          continue;
        }
        if (this.v == 2)
        {
          if (net.youmi.android.c.h.b.a(this.i).equals("wifi"))
          {
            i1 = 0;
            continue;
          }
          i1 = 1;
        }
      }
      else
      {
        if (this.w == 1) {
          d();
        }
        for (;;)
        {
          dismiss();
          return;
          e();
          a(this.i);
        }
      }
      i1 = 0;
    }
  }
  
  public void show()
  {
    if ((this.k == null) || (this.k.equals("")))
    {
      net.youmi.android.c.e.a.a(u.a, "No ads to show spot dialog.", new Object[0]);
      if (this.Q != null) {
        this.Q.onShowFailed();
      }
    }
    do
    {
      do
      {
        return;
        if ((this.g != null) || ((this.h != null) && (this.h.exists()))) {
          break;
        }
        net.youmi.android.c.e.a.a(u.a, "No ad image to show spot dialog.", new Object[0]);
      } while (this.Q == null);
      this.Q.onShowFailed();
      return;
      if (this.j) {
        break;
      }
      net.youmi.android.c.e.a.a(u.a, "Spot dialog can not build.", new Object[0]);
    } while (this.Q == null);
    this.Q.onShowFailed();
    return;
    if (this.Q != null) {
      this.Q.onShowSuccess();
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.3F, 1.0F);
    localAlphaAnimation.setDuration(500L);
    this.b.setAnimation(localAlphaAnimation);
    localAlphaAnimation.startNow();
    super.show();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.spot.b
 * JD-Core Version:    0.7.0.1
 */