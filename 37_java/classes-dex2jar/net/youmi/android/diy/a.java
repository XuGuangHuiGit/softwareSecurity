package net.youmi.android.diy;

import android.content.Context;
import android.os.AsyncTask;

public class a
  extends AsyncTask
{
  Context a;
  
  a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  protected String a(Void... paramVarArgs)
  {
    try
    {
      DiyManager.loadAdObjects(this.a);
      return "";
    }
    catch (Throwable paramVarArgs) {}
    return "";
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.diy.a
 * JD-Core Version:    0.7.0.1
 */