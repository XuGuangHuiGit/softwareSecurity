package net.youmi.android.smart;

import android.content.Context;
import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.ArrayList;
import net.youmi.android.f.a.u;

public class d
  extends AsyncTask
{
  private Context a;
  private String b;
  private String c;
  private String d;
  private int e;
  private int f;
  private int g;
  private int h = 5;
  
  d(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramContext;
    this.c = paramString2;
    this.b = paramString1;
    this.f = paramInt1;
    this.e = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
  }
  
  protected String a(Void... paramVarArgs)
  {
    Object localObject = SmartBannerManager.d(this.a);
    for (;;)
    {
      try
      {
        paramVarArgs = new StringBuffer();
        localObject = ((net.youmi.android.smart.a.b)localObject).a.a(this.h);
        if (localObject != null) {
          continue;
        }
        if (((ArrayList)localObject).size() <= 0) {
          continue;
        }
      }
      catch (Throwable paramVarArgs)
      {
        StringBuffer localStringBuffer;
        String str;
        continue;
        int i = 0;
        continue;
      }
      if (i >= ((ArrayList)localObject).size()) {
        continue;
      }
      paramVarArgs.append((String)((ArrayList)localObject).get(i) + "|");
      i += 1;
    }
    this.d = paramVarArgs.toString();
    localStringBuffer = new StringBuffer();
    localStringBuffer.append("pd=17");
    localStringBuffer.append("&pt=2");
    localStringBuffer.append("&bw=" + this.f);
    localStringBuffer.append("&bh=" + this.e);
    localObject = "";
    paramVarArgs = (Void[])localObject;
    if (this.d != null)
    {
      paramVarArgs = (Void[])localObject;
      if (!this.d.equals("")) {
        paramVarArgs = this.d;
      }
    }
    try
    {
      localObject = URLEncoder.encode(this.b, "UTF-8");
      str = URLEncoder.encode(this.c, "UTF-8");
      paramVarArgs = URLEncoder.encode(paramVarArgs, "UTF-8");
      localStringBuffer.append("&ppk=" + (String)localObject);
      localStringBuffer.append("&pat=" + str);
      localStringBuffer.append("&lps=" + paramVarArgs);
      paramVarArgs = URLEncoder.encode(localStringBuffer.toString(), "UTF-8");
    }
    catch (Throwable paramVarArgs)
    {
      for (;;)
      {
        try
        {
          paramVarArgs = net.youmi.android.f.a.a.d(this.a, paramVarArgs);
          return paramVarArgs;
        }
        catch (Throwable paramVarArgs)
        {
          return "";
        }
        paramVarArgs = paramVarArgs;
        paramVarArgs = "";
      }
    }
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    if ((paramString == null) || (paramString.equals("")))
    {
      net.youmi.android.c.e.a.a(u.a, "网络状态不佳，无法获取广告。", new Object[0]);
      return;
    }
    b.a(this.a, paramString, this.g);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.d
 * JD-Core Version:    0.7.0.1
 */