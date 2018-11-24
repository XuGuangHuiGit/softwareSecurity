package net.youmi.android.spot;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import net.youmi.android.c.e.b;
import net.youmi.android.f.a.a;
import net.youmi.android.f.a.v;

final class l
  extends v
{
  l(Context paramContext) {}
  
  public void run()
  {
    Object localObject2 = new StringBuffer();
    Object localObject1 = this.a.getSharedPreferences("CLKDATA", 0);
    Object localObject3 = (HashMap)((SharedPreferences)localObject1).getAll();
    Iterator localIterator = ((HashMap)localObject3).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((HashMap)localObject3).get(((String)localIterator.next()).toString());
      b.a("SpotAD", "key" + str, new Object[0]);
      ((StringBuffer)localObject2).append(str);
      if (localIterator.hasNext()) {
        ((StringBuffer)localObject2).append("\n");
      }
    }
    localObject3 = ((StringBuffer)localObject2).toString();
    if ((localObject3 == null) || (((String)localObject3).equals(""))) {}
    do
    {
      return;
      localObject2 = a.a(this.a, ((StringBuffer)localObject2).toString());
    } while ((localObject2 == null) || (((String)localObject2).equals("")));
    localObject1 = ((SharedPreferences)localObject1).edit();
    ((SharedPreferences.Editor)localObject1).clear();
    ((SharedPreferences.Editor)localObject1).commit();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.spot.l
 * JD-Core Version:    0.7.0.1
 */