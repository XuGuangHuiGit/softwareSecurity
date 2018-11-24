package net.youmi.android.diy;

import android.graphics.Bitmap;
import java.util.ArrayList;
import net.youmi.android.c.b.b;
import org.json.JSONArray;

public class AdObject
{
  private int a;
  private int b;
  private String c;
  private String d;
  private int e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private Bitmap m;
  private JSONArray n;
  private ArrayList o;
  private String p;
  private String q;
  private String r;
  private int s;
  private String t;
  private int u;
  
  protected String a()
  {
    return this.p;
  }
  
  protected void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  protected void a(String paramString)
  {
    this.i = paramString;
  }
  
  protected void a(JSONArray paramJSONArray)
  {
    this.n = paramJSONArray;
  }
  
  protected String b()
  {
    return this.t;
  }
  
  protected void b(int paramInt)
  {
    this.s = paramInt;
  }
  
  protected void b(String paramString)
  {
    this.p = paramString;
  }
  
  protected void c(int paramInt)
  {
    this.u = paramInt;
  }
  
  protected void c(String paramString)
  {
    this.q = paramString;
  }
  
  protected void d(String paramString)
  {
    this.t = paramString;
  }
  
  public int getAdId()
  {
    return this.a;
  }
  
  public String getAdText()
  {
    return this.h;
  }
  
  public String getAppName()
  {
    return this.d;
  }
  
  public String getAuthor()
  {
    return this.r;
  }
  
  public String getCategory()
  {
    return this.k;
  }
  
  public String getDescription()
  {
    return this.g;
  }
  
  public Bitmap getIcon()
  {
    return this.m;
  }
  
  public String getIconUrl()
  {
    return this.l;
  }
  
  public String getPackageName()
  {
    return this.c;
  }
  
  public ArrayList getScreenShortcuts()
  {
    if (this.n != null) {}
    try
    {
      this.o = new ArrayList();
      int i1 = 0;
      while (i1 < this.n.length())
      {
        localObject = b.a(this.n, i1, "");
        this.o.add(localObject);
        i1 += 1;
      }
      Object localObject = this.o;
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      label70:
      break label70;
    }
    this.o = null;
    return this.o;
  }
  
  public String getSize()
  {
    return this.j;
  }
  
  public int getVersionCode()
  {
    return this.e;
  }
  
  public String getVersionName()
  {
    return this.f;
  }
  
  public void setAdId(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setAdText(String paramString)
  {
    this.h = paramString;
  }
  
  public void setAppName(String paramString)
  {
    this.d = paramString;
  }
  
  public void setAuthor(String paramString)
  {
    this.r = paramString;
  }
  
  public void setCategory(String paramString)
  {
    this.k = paramString;
  }
  
  public void setDescription(String paramString)
  {
    this.g = paramString;
  }
  
  public void setIcon(Bitmap paramBitmap)
  {
    this.m = paramBitmap;
  }
  
  public void setIconUrl(String paramString)
  {
    this.l = paramString;
  }
  
  public void setPackageName(String paramString)
  {
    this.c = paramString;
  }
  
  public void setSize(String paramString)
  {
    this.j = paramString;
  }
  
  public void setVersionCode(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setVersionName(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.AdObject
 * JD-Core Version:    0.7.0.1
 */