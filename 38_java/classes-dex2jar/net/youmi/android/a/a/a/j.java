package net.youmi.android.a.a.a;

import java.util.ArrayList;
import java.util.List;

public class j
{
  private long a = 0L;
  private List b;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(i parami)
  {
    label123:
    for (;;)
    {
      try
      {
        if (this.b == null) {
          this.b = new ArrayList();
        }
        if (parami == null) {
          return;
        }
        int j = -1;
        int i = 0;
        try
        {
          if (i < this.b.size())
          {
            if (((i)this.b.get(i)).b() != parami.b()) {
              break label123;
            }
            j = i;
            break label123;
          }
          if ((j >= 0) && (j < this.b.size())) {
            this.b.remove(j);
          }
          this.b.add(parami);
        }
        catch (Throwable parami) {}
        continue;
        i += 1;
      }
      finally {}
    }
  }
  
  public List b()
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    return this.b;
  }
  
  public String toString()
  {
    try
    {
      Object localObject = new StringBuilder();
      if (this.b != null)
      {
        int i = 0;
        while (i < this.b.size())
        {
          i locali = (i)this.b.get(i);
          ((StringBuilder)localObject).append(String.format("[第%d套虚拟货币:%s,汇率=$d,编号:%d]", new Object[] { Integer.valueOf(i), locali.a(), Integer.valueOf(locali.c()), Integer.valueOf(locali.b()) }));
          i += 1;
        }
      }
      localObject = String.format("Update:[%d],Currencys:%s", new Object[] { Long.valueOf(this.a), ((StringBuilder)localObject).toString() });
      return localObject;
    }
    catch (Throwable localThrowable) {}
    return super.toString();
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\38\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.a.a.a.j
 * JD-Core Version:    0.7.0.1
 */