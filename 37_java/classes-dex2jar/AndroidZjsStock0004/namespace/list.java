package AndroidZjsStock0004.namespace;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class list
  extends Activity
{
  private int[] colors = { 553631232, 542728139 };
  private String i_mydb;
  private String i_mytext;
  private String isfavtime;
  private List<HashMap<String, String>> list = new ArrayList();
  private String myid;
  private String mytitle;
  private int runCount;
  
  public void getDetail(int paramInt, String paramString1, String paramString2)
  {
    if (this.list.isEmpty())
    {
      Toast.makeText(getApplicationContext(), 2131165186, 0).show();
      return;
    }
    this.myid = ((String)((HashMap)this.list.get(paramInt)).get("myid"));
    this.mytitle = ((String)((HashMap)this.list.get(paramInt)).get("mytitle"));
    String str = this.mytitle;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(str);
    localBuilder.setNegativeButton(2131165195, null);
    if (paramString2 == "y") {
      localBuilder.setNeutralButton(2131165194, new dialogDel());
    }
    localBuilder.show();
  }
  
  public void getList()
  {
    SQLiteDatabase localSQLiteDatabase = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 1);
    Cursor localCursor = localSQLiteDatabase.rawQuery("select myid from myData limit 1", null);
    if (this.i_mydb.equals(""))
    {
      localCursor = localSQLiteDatabase.rawQuery("select myid,mytitle from myFav order by isfavtime desc", null);
      this.runCount = localCursor.getCount();
    }
    for (;;)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        localSQLiteDatabase.close();
        return;
        if (this.i_mydb.equals("searchList"))
        {
          localCursor = localSQLiteDatabase.rawQuery("select myid,mytitle from myData where mytitle like '%" + this.i_mytext + "%' order by myid desc", null);
          break;
        }
        if (!this.i_mydb.equals("sortList")) {
          break;
        }
        localCursor = localSQLiteDatabase.rawQuery("select myid,mytitle from myData where mysort='" + this.i_mytext + "' order by myid desc", null);
        break;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("myid", localCursor.getString(0).toString());
      localHashMap.put("mytitle", localCursor.getString(1));
      this.list.add(localHashMap);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    try
    {
      paramBundle = getIntent().getExtras();
      this.i_mydb = paramBundle.getString("mydb");
      this.i_mytext = paramBundle.getString("mytext");
      paramBundle = (TextView)findViewById(2131296262);
      if (this.i_mydb.equals(""))
      {
        paramBundle.setText(2131165217);
        getList();
        paramBundle = (ListView)findViewById(2131296263);
        paramBundle.setAdapter(new myBase());
        paramBundle.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            paramAnonymousAdapterView = (String)((HashMap)list.this.list.get(paramAnonymousInt)).get("myid");
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("myid", paramAnonymousAdapterView);
            paramAnonymousView.putExtra("mydb", list.this.i_mydb);
            paramAnonymousView.setClass(list.this.getBaseContext(), main.class);
            list.this.startActivity(paramAnonymousView);
          }
        });
        paramBundle = (Button)findViewById(2131296264);
        if (!this.i_mydb.equals("")) {
          break label250;
        }
        paramBundle.setText(getResources().getString(2131165188));
        paramBundle.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            list.this.finish();
          }
        });
      }
    }
    catch (Exception paramBundle)
    {
      label250:
      do
      {
        for (;;)
        {
          this.i_mydb = "";
          this.i_mytext = "";
          continue;
          if (this.i_mydb.equals("searchList")) {
            paramBundle.setText(getResources().getString(2131165215) + ":" + this.i_mytext);
          } else if (this.i_mydb.equals("sortList")) {
            paramBundle.setText(this.i_mytext);
          }
        }
        if (this.i_mydb.equals("searchList"))
        {
          paramBundle.setText(getResources().getString(2131165195) + getResources().getString(2131165215));
          paramBundle.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramAnonymousView)
            {
              list.this.finish();
            }
          });
          return;
        }
      } while (!this.i_mydb.equals("sortList"));
      paramBundle.setText(getResources().getString(2131165195) + getResources().getString(2131165213));
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          list.this.finish();
        }
      });
    }
  }
  
  class dialogDel
    implements DialogInterface.OnClickListener
  {
    dialogDel() {}
    
    public void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      list.this.finish();
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("myid", list.this.myid);
      paramDialogInterface.putExtra("mydb", "del");
      paramDialogInterface.setClass(list.this.getBaseContext(), data.class);
      list.this.startActivity(paramDialogInterface);
    }
  }
  
  public class myBase
    extends BaseAdapter
  {
    public myBase() {}
    
    public int getCount()
    {
      return list.this.list.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramView = LayoutInflater.from(list.this.getApplicationContext()).inflate(2130903043, null);
      int i = list.this.colors.length;
      paramView.setBackgroundColor(list.this.colors[(paramInt % i)]);
      ((TextView)paramView.findViewById(2131296265)).setText((String)((HashMap)list.this.list.get(paramInt)).get("mytitle"));
      paramViewGroup = (Button)paramView.findViewById(2131296266);
      if (list.this.i_mydb.equals(""))
      {
        paramViewGroup.setTag((String)((HashMap)list.this.list.get(paramInt)).get("myid"));
        paramViewGroup.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = (String)paramAnonymousView.getTag();
            Intent localIntent = new Intent();
            localIntent.putExtra("myid", paramAnonymousView);
            localIntent.putExtra("mydb", "del");
            localIntent.setClass(list.this.getBaseContext(), data.class);
            list.this.startActivity(localIntent);
            list.this.finish();
          }
        });
        return paramView;
      }
      paramViewGroup.setVisibility(8);
      return paramView;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0004.namespace.list
 * JD-Core Version:    0.7.0.1
 */