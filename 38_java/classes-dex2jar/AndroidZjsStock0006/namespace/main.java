package AndroidZjsStock0006.namespace;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Process;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import net.youmi.android.AdManager;
import net.youmi.android.smart.SmartBannerManager;

public class main
  extends Activity
{
  protected static final int MENU_ABOUT = 1;
  protected static final int MENU_QUIT = 3;
  protected static final int MENU_WELCOME = 2;
  Cursor cursor;
  private String i_mydb;
  private String i_myid;
  private int mLastY = 0;
  private String myfavtitle;
  private String myid;
  private int randomNum;
  private int runCount;
  private ScrollView scrollview;
  
  public void onCreate(final Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    AdManager.getInstance(this).init("12588b2ad6a3fa81", "29fe099e68f6daaa", false);
    SmartBannerManager.init(this);
    SmartBannerManager.show(this);
    ((LinearLayout)findViewById(2131296272)).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      boolean isFirst = true;
      
      public void onGlobalLayout()
      {
        int i;
        if (this.isFirst)
        {
          this.isFirst = false;
          i = 0;
        }
        for (;;)
        {
          if (i > 30)
          {
            main.this.mLastY = main.this.scrollview.getScrollY();
            Log.e("mLastY", main.this.mLastY);
            Log.e("scrollview.getHeight()", main.this.scrollview.getHeight());
            Log.e("scrollview.getMeasuredHeight()", main.this.scrollview.getMeasuredHeight());
            main.this.scrollview.fullScroll(33);
            return;
          }
          main.this.scrollview.pageScroll(130);
          i += 1;
        }
      }
    });
    myconfig.CopyDB(getResources().openRawResource(2130968576), myconfig.myDataPath(getApplicationContext()), myconfig.myDataFilename(getApplicationContext()));
    paramBundle = (Button)findViewById(2131296277);
    final Button localButton = (Button)findViewById(2131296276);
    try
    {
      Object localObject = getIntent().getExtras();
      this.i_mydb = ((Bundle)localObject).getString("mydb");
      this.i_myid = ((Bundle)localObject).getString("myid");
      Log.e("i_myid", this.i_myid);
      Log.e("i_mydb", this.i_mydb);
      localObject = SQLiteDatabase.openDatabase(myconfig.myDataPath(getApplicationContext()) + myconfig.myDataFilename(getApplicationContext()), null, 1);
      if (this.i_myid.equals(""))
      {
        this.cursor = ((SQLiteDatabase)localObject).rawQuery("select count(myid) from myData", null);
        this.cursor.moveToNext();
        this.runCount = this.cursor.getInt(0);
        if (this.i_myid.equals("")) {
          do
          {
            this.randomNum = ((int)Math.abs(Math.random() * this.runCount + 0.0D));
            this.cursor = ((SQLiteDatabase)localObject).rawQuery("select * from myData where myid=" + this.randomNum, null);
          } while (this.cursor.getCount() == 0);
        }
        Log.e("随机数[总数]", this.randomNum + "[" + this.runCount + "]");
        this.cursor.moveToFirst();
        this.scrollview = ((ScrollView)findViewById(2131296271));
        ((TextView)findViewById(2131296273)).setText(getResources().getString(2131165213) + ":" + this.cursor.getString(1));
        ((TextView)findViewById(2131296265)).setText(this.cursor.getString(2));
        ((TextView)findViewById(2131296274)).setText(Html.fromHtml(this.cursor.getString(3) + "<br><br>"));
        this.myid = this.cursor.getString(0);
        this.myfavtitle = this.cursor.getString(2);
        ((Button)findViewById(2131296268)).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = new Intent(main.this.getApplicationContext(), sort.class);
            main.this.startActivity(paramAnonymousView);
          }
        });
        ((Button)findViewById(2131296269)).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = new Intent(main.this.getApplicationContext(), search.class);
            main.this.startActivity(paramAnonymousView);
          }
        });
        ((Button)findViewById(2131296270)).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = new Intent(main.this.getApplicationContext(), list.class);
            main.this.startActivity(paramAnonymousView);
          }
        });
        ((Button)findViewById(2131296275)).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("mydb", "add");
            paramAnonymousView.putExtra("myid", main.this.myid);
            paramAnonymousView.setClass(main.this.getBaseContext(), data.class);
            main.this.startActivity(paramAnonymousView);
          }
        });
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (main.this.mLastY <= main.this.scrollview.getScrollY())
            {
              localButton.setVisibility(8);
              paramBundle.setVisibility(0);
              return;
            }
            main.this.scrollview.smoothScrollTo(0, main.this.scrollview.getHeight() + main.this.scrollview.getScrollY() - 15);
            Log.e("scrollview.getScrollY()", main.this.scrollview.getScrollY());
          }
        });
        this.scrollview.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            if (main.this.mLastY <= main.this.scrollview.getScrollY())
            {
              localButton.setVisibility(8);
              paramBundle.setVisibility(0);
              return false;
            }
            localButton.setVisibility(0);
            paramBundle.setVisibility(8);
            return false;
          }
        });
        paramBundle.setVisibility(8);
        if (!this.i_myid.equals("")) {
          break label783;
        }
        paramBundle.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            main.this.finish();
            paramAnonymousView = new Intent(main.this.getApplicationContext(), main.class);
            main.this.startActivity(paramAnonymousView);
          }
        });
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.i_mydb = "";
        this.i_myid = "";
        continue;
        if (this.i_mydb.equals("favView")) {
          this.cursor = localException.rawQuery("select * from myFav where myid=" + this.i_myid, null);
        } else {
          this.cursor = localException.rawQuery("select * from myData where myid=" + this.i_myid, null);
        }
      }
      label783:
      paramBundle.setText(getResources().getString(2131165195));
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          main.this.finish();
        }
      });
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    super.onCreateOptionsMenu(paramMenu);
    paramMenu.add(0, 1, 0, 2131165212);
    paramMenu.add(0, 2, 0, 2131165210);
    paramMenu.add(0, 3, 0, 2131165209);
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.i_myid.equals(""))
      {
        paramKeyEvent = new AlertDialog.Builder(this);
        paramKeyEvent.setTitle("退出确认");
        paramKeyEvent.setMessage("您确定要退出" + getResources().getString(2131165184) + "吗？");
        paramKeyEvent.setNegativeButton("取消", null);
        paramKeyEvent.setPositiveButton("确定", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            main.this.finish();
          }
        });
        paramKeyEvent.show();
        return false;
      }
      finish();
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    super.onOptionsItemSelected(paramMenuItem);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return true;
      startActivity(new Intent(getBaseContext(), about.class));
      continue;
      startActivity(new Intent(getBaseContext(), welcome.class));
      continue;
      Process.killProcess(Process.myPid());
      finish();
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0006.namespace.main
 * JD-Core Version:    0.7.0.1
 */