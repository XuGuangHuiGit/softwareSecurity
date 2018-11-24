package net.youmi.android.f.a;

public class b
{
  public static String a(int paramInt)
  {
    int i = -1;
    try
    {
      paramInt = Math.abs(paramInt);
      switch (paramInt)
      {
      default: 
        return "If you have any questions, please contact us.";
      case 3208: 
        return "该设备尚未登记。";
      case 2007: 
        return "暂无广告。";
      case 1000: 
      case 1002: 
        return "app不存在。";
      case 1100: 
        return "包名未绑定。";
      case 1200: 
        return "app状态异常。";
      case 1201: 
        return "app还没有提交审核。";
      case 1202: 
        return "app在封杀状态中。";
      case 1203: 
        return "app暂未通过审核。";
      }
      return "该app与开发系统不对应。";
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        paramInt = i;
      }
    }
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.f.a.b
 * JD-Core Version:    0.7.0.1
 */