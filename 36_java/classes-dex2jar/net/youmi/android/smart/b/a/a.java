package net.youmi.android.smart.b.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import net.youmi.android.a.h.b.d;
import net.youmi.android.a.h.e;
import org.json.JSONObject;

public class a
  extends d
{
  public String a(e parame, net.youmi.android.a.h.b paramb, String paramString)
  {
    return super.a(parame, paramb, paramString);
  }
  
  protected JSONObject a(e parame, net.youmi.android.a.h.b paramb, JSONObject paramJSONObject)
  {
    int j = 0;
    for (;;)
    {
      Object localObject2;
      try
      {
        String str = net.youmi.android.c.b.b.a(paramJSONObject, "a", null);
        int k = net.youmi.android.c.b.b.a(paramJSONObject, "b", 0);
        paramb = "";
        localObject2 = "";
        Object localObject1 = "";
        paramJSONObject = parame.a().getPackageManager().getInstalledPackages(0);
        i = 0;
        if (i < paramJSONObject.size())
        {
          PackageInfo localPackageInfo = (PackageInfo)paramJSONObject.get(i);
          if (!localPackageInfo.packageName.equals(str))
          {
            i += 1;
            continue;
          }
          paramb = localPackageInfo.applicationInfo.loadLabel(parame.a().getPackageManager()).toString();
          paramJSONObject = localPackageInfo.versionName;
          i = localPackageInfo.versionCode;
          localObject2 = localPackageInfo.applicationInfo.loadIcon(parame.a().getPackageManager());
          parame = paramJSONObject;
          paramJSONObject = (JSONObject)localObject2;
          if (paramb.equals("")) {
            return a(3);
          }
          if (k == 1)
          {
            paramJSONObject = ((BitmapDrawable)paramJSONObject).getBitmap();
            localObject1 = new ByteArrayOutputStream();
            paramJSONObject.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject1);
            localObject1 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 0);
          }
          paramJSONObject = a(0);
          localObject2 = new JSONObject();
          ((JSONObject)localObject2).put("a", paramb);
          ((JSONObject)localObject2).put("b", parame);
          ((JSONObject)localObject2).put("c", i);
          ((JSONObject)localObject2).put("d", localObject1);
          paramJSONObject.put("d", localObject2);
          return paramJSONObject;
        }
      }
      catch (Throwable parame)
      {
        return null;
      }
      paramJSONObject = null;
      int i = j;
      parame = (e)localObject2;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.smart.b.a.a
 * JD-Core Version:    0.7.0.1
 */