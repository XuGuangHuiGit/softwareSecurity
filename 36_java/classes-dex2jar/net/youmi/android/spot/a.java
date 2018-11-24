package net.youmi.android.spot;

import android.content.Context;
import android.os.AsyncTask;
import net.youmi.android.c.e.b;

public class a
  extends AsyncTask
{
  boolean a = false;
  Context b;
  SpotManager c;
  SpotDialogLinstener d;
  
  a(SpotManager paramSpotManager, Context paramContext, boolean paramBoolean, SpotDialogLinstener paramSpotDialogLinstener)
  {
    this.c = paramSpotManager;
    this.b = paramContext;
    this.a = paramBoolean;
    this.d = paramSpotDialogLinstener;
  }
  
  protected String a(Void... paramVarArgs)
  {
    b.a("SpotAD", "SpotAdReq doInBackground", new Object[0]);
    paramVarArgs = "";
    try
    {
      String str = net.youmi.android.f.a.a.a(this.b);
      paramVarArgs = str;
      this.c.a(this.b, str);
      paramVarArgs = str;
      if (!this.a)
      {
        paramVarArgs = str;
        SpotManager.b(this.b);
      }
      return str;
    }
    catch (Throwable localThrowable) {}
    return paramVarArgs;
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    if ((paramString == null) || (paramString.equals(""))) {
      if (this.d != null) {
        this.d.onShowFailed();
      }
    }
    while (!this.a) {
      return;
    }
    try
    {
      this.c.b = paramString;
      this.c.a();
      this.c.a(this.c.d, this.d);
      return;
    }
    catch (Throwable paramString) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.spot.a
 * JD-Core Version:    0.7.0.1
 */