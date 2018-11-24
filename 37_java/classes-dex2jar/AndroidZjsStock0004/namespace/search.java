package AndroidZjsStock0004.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class search
  extends Activity
{
  private EditText searchtext;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903046);
    this.searchtext = ((EditText)findViewById(2131296278));
    this.searchtext.selectAll();
    this.searchtext.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        search.this.searchtext.selectAll();
      }
    });
    ((Button)findViewById(2131296264)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        search.this.finish();
      }
    });
    ((Button)findViewById(2131296279)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent(search.this.getBaseContext(), list.class);
        Log.d("searchText", search.this.searchtext.getText().toString());
        paramAnonymousView.putExtra("mydb", "searchList");
        paramAnonymousView.putExtra("mytext", search.this.searchtext.getText().toString());
        search.this.startActivity(paramAnonymousView);
      }
    });
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0004.namespace.search
 * JD-Core Version:    0.7.0.1
 */