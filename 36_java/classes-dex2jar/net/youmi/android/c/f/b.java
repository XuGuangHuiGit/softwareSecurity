package net.youmi.android.c.f;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class b
  implements Runnable
{
  b(a parama) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = a.a(this.a);
      if ((!((File)localObject1).exists()) && (!((File)localObject1).mkdirs())) {
        return;
      }
      localObject1 = this.a.a();
      long l1;
      if (localObject1 != null)
      {
        Object localObject2 = new ArrayList();
        int i = 0;
        l1 = 0L;
        boolean bool;
        if (i < localObject1.length)
        {
          File localFile = localObject1[i];
          bool = a.a(this.a, localFile);
          if (bool) {}
          for (;;)
          {
            try
            {
              bool = localFile.delete();
              l2 = l1;
              if (!bool) {}
            }
            catch (Throwable localThrowable4)
            {
              long l2 = l1;
              continue;
            }
            i += 1;
            l1 = l2;
            break;
            l2 = l1;
            if (localFile.exists())
            {
              l2 = l1;
              if (a.b(this.a) != -1L)
              {
                l2 = l1;
                if (a.b(this.a) > 0L)
                {
                  l2 = l1 + localFile.length();
                  ((List)localObject2).add(localFile);
                }
              }
            }
          }
        }
        Collections.sort((List)localObject2, new c(this.a));
        localObject1 = ((List)localObject2).iterator();
        i = 10000;
        l2 = l1;
        label281:
        do
        {
          if (l2 <= a.b(this.a)) {
            break label313;
          }
          bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break label313;
          }
          l1 = l2;
          try
          {
            localObject2 = (File)((Iterator)localObject1).next();
            l1 = l2;
            l2 -= ((File)localObject2).length();
            l1 = l2;
            ((Iterator)localObject1).remove();
          }
          catch (Throwable localThrowable2)
          {
            for (;;)
            {
              l2 = l1;
            }
          }
          try
          {
            bool = ((File)localObject2).delete();
            if (!bool) {}
          }
          catch (Throwable localThrowable3)
          {
            break label281;
          }
          i -= 1;
        } while (i >= 0);
      }
      label313:
      return;
    }
    catch (Throwable localThrowable1) {}
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\361\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.f.b
 * JD-Core Version:    0.7.0.1
 */