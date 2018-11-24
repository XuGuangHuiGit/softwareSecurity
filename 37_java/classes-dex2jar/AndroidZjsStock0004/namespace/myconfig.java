package AndroidZjsStock0004.namespace;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class myconfig
{
  static Context context;
  private static String name = "data.db";
  private static String str;
  
  public static void CopyDB(InputStream paramInputStream, String paramString1, String paramString2)
  {
    new File(paramString1);
    paramString1 = new File(paramString1 + paramString2);
    try
    {
      if ((!paramString1.exists()) || (paramString1.length() == 0L))
      {
        paramString1 = new FileOutputStream(paramString1);
        byte[] arrayOfByte = new byte[81920];
        for (;;)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i <= 0)
          {
            Log.e("main.拷贝文件", "拷贝文件从raw中数据源到" + paramString2 + "成功！");
            return;
          }
          paramString1.write(arrayOfByte, 0, i);
        }
      }
      return;
    }
    catch (Exception paramInputStream)
    {
      Log.e("main.拷贝文件", "拷贝文件出错了！");
      paramInputStream.printStackTrace();
    }
  }
  
  public static String SysDataPath(Context paramContext)
  {
    paramContext = Environment.getDataDirectory() + "/data/" + paramContext.getPackageName() + "/databases/";
    if (!new File(paramContext).exists()) {
      new File(paramContext).mkdirs();
    }
    return paramContext;
  }
  
  public static String myDataFilename(Context paramContext)
  {
    return name;
  }
  
  public static String myDataPath(Context paramContext)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      Log.e("myconfig", "SD卡存在且可以使用");
      paramContext = Environment.getExternalStorageDirectory() + "/" + paramContext.getPackageName() + "/";
      if (!new File(paramContext).exists()) {
        new File(paramContext).mkdirs();
      }
    }
    for (str = paramContext;; str = SysDataPath(paramContext))
    {
      return str;
      Log.e("myconfig", "SD卡不可用，使用系统数据库路径!");
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     AndroidZjsStock0004.namespace.myconfig
 * JD-Core Version:    0.7.0.1
 */