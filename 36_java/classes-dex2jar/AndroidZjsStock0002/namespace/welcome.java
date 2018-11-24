package AndroidZjsStock0002.namespace;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.os.Bundle;
import android.widget.TextView;

public class welcome
  extends Activity
{
  private void addShortcut()
  {
    Intent localIntent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent.putExtra("android.intent.extra.shortcut.NAME", getString(2131165184));
    localIntent.putExtra("duplicate", false);
    ComponentName localComponentName = new ComponentName(getPackageName(), "." + getLocalClassName());
    localIntent.putExtra("android.intent.extra.shortcut.INTENT", new Intent("android.intent.action.MAIN").setComponent(localComponentName));
    localIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, 2130837507));
    sendBroadcast(localIntent);
  }
  
  public void Start()
  {
    new Thread()
    {
      public void run()
      {
        try
        {
          Thread.sleep(3000L);
          Intent localIntent = new Intent();
          localIntent.setClass(welcome.this, main.class);
          welcome.this.startActivity(localIntent);
          welcome.this.finish();
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            localInterruptedException.printStackTrace();
          }
        }
      }
    }.start();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903049);
    ((TextView)findViewById(2131296258)).setVisibility(8);
    Start();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0002.namespace.welcome
 * JD-Core Version:    0.7.0.1
 */