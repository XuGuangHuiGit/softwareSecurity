package AndroidZjsStock0002.namespace;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sort
  extends Activity
{
  private List<HashMap<String, String>> list = new ArrayList();
  private GridView my_gridview;
  private List<String> sortName;
  
  public void getList()
  {
    SQLiteDatabase localSQLiteDatabase = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 1);
    Cursor localCursor = localSQLiteDatabase.rawQuery("select distinct mysort from myData", null);
    Object localObject;
    if (localCursor.getCount() == 1)
    {
      localCursor.moveToNext();
      localObject = new Intent();
      ((Intent)localObject).putExtra("mydb", "sortList");
      ((Intent)localObject).putExtra("mytext", localCursor.getString(0).toString());
      ((Intent)localObject).setClass(getApplicationContext(), list.class);
      startActivity((Intent)localObject);
      finish();
    }
    for (;;)
    {
      localCursor.close();
      localSQLiteDatabase.close();
      return;
      do
      {
        localObject = new HashMap();
        ((HashMap)localObject).put("mysort", localCursor.getString(0).toString());
        this.list.add(localObject);
      } while (localCursor.moveToNext());
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    getList();
    ((Button)findViewById(2131296261)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        sort.this.finish();
      }
    });
    this.my_gridview = ((GridView)findViewById(2131296280));
    this.my_gridview.setAdapter(new myBase());
  }
  
  public class myBase
    extends BaseAdapter
  {
    public myBase() {}
    
    public int getCount()
    {
      Log.e("getCount", sort.this.list.size());
      return sort.this.list.size();
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
      paramView = LayoutInflater.from(sort.this.getApplicationContext()).inflate(2130903048, null);
      paramViewGroup = (Button)paramView.findViewById(2131296266);
      paramViewGroup.setText((String)((HashMap)sort.this.list.get(paramInt)).get("mysort"));
      paramViewGroup.setTag((String)((HashMap)sort.this.list.get(paramInt)).get("mysort"));
      paramViewGroup.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          Intent localIntent = new Intent();
          localIntent.putExtra("mydb", "sortList");
          localIntent.putExtra("mytext", paramAnonymousView);
          localIntent.setClass(sort.this.getApplicationContext(), list.class);
          sort.this.startActivity(localIntent);
        }
      });
      return paramView;
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0002.namespace.sort
 * JD-Core Version:    0.7.0.1
 */