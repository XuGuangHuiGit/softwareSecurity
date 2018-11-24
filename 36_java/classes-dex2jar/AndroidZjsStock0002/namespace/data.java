package AndroidZjsStock0002.namespace;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.Date;

public class data
  extends Activity
{
  private String DBcontrol;
  private String i_mycontent;
  private String i_mydb;
  private String i_myid;
  private String i_mysort;
  private String i_mytitle;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    try
    {
      this.i_mydb = paramBundle.getString("mydb");
      this.DBcontrol = this.i_mydb.toString();
      this.i_myid = paramBundle.getString("myid");
      Log.e("i_myid", this.i_myid);
      if (this.DBcontrol.equals("add"))
      {
        paramBundle = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 2);
        Object localObject1 = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 1);
        localObject2 = ((SQLiteDatabase)localObject1).rawQuery("select myid,mysort,mytitle,mycontent from myData where myid=" + this.i_myid, null);
        ((Cursor)localObject2).moveToFirst();
        this.i_mysort = ((Cursor)localObject2).getString(1).toString();
        this.i_mytitle = ((Cursor)localObject2).getString(2).toString();
        this.i_mycontent = ((Cursor)localObject2).getString(3).toString();
        localObject1 = ((SQLiteDatabase)localObject1).rawQuery("select myid from myFAv where myid=" + this.i_myid, null);
        localObject2 = new ContentValues();
        if (((Cursor)localObject1).getCount() == 0)
        {
          ((ContentValues)localObject2).put("myid", this.i_myid);
          ((ContentValues)localObject2).put("mysort", this.i_mysort);
          ((ContentValues)localObject2).put("mytitle", this.i_mytitle);
          ((ContentValues)localObject2).put("mycontent", this.i_mycontent);
          ((ContentValues)localObject2).put("isfavtime", new Date().toLocaleString());
          paramBundle.insert("myFav", null, (ContentValues)localObject2);
          Toast.makeText(getApplicationContext(), getResources().getString(2131165190) + this.i_mytitle + getResources().getString(2131165197), 0).show();
          ((Cursor)localObject1).close();
          paramBundle.close();
          finish();
          return;
        }
      }
    }
    catch (Exception paramBundle)
    {
      do
      {
        for (;;)
        {
          Object localObject2;
          this.DBcontrol = "add";
          continue;
          ((ContentValues)localObject2).put("isfavtime", new Date().toLocaleString());
          paramBundle.update("myFav", (ContentValues)localObject2, "myid=" + this.i_myid, null);
          Toast.makeText(getApplicationContext(), getResources().getString(2131165191) + this.i_mytitle + getResources().getString(2131165197), 0).show();
        }
      } while (!this.DBcontrol.equals("del"));
      paramBundle = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 2);
      new ContentValues();
      paramBundle.delete("myFav", "myid=" + this.i_myid, null);
      paramBundle.close();
      Toast.makeText(getApplicationContext(), getResources().getString(2131165194) + getResources().getString(2131165197), 0).show();
      finish();
      startActivity(new Intent(getApplicationContext(), list.class));
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0002.namespace.data
 * JD-Core Version:    0.7.0.1
 */