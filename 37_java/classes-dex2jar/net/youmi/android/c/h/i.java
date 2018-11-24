package net.youmi.android.c.h;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

final class i
  implements RedirectHandler
{
  i(a parama) {}
  
  public URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    if (paramHttpResponse.containsHeader("location")) {
      paramHttpResponse = paramHttpResponse.getFirstHeader("location");
    }
    for (;;)
    {
      if (paramHttpResponse == null) {}
      do
      {
        return null;
        if (paramHttpResponse.containsHeader("Location"))
        {
          paramHttpResponse = paramHttpResponse.getFirstHeader("Location");
          break;
        }
        if (!paramHttpResponse.containsHeader("LOCATION")) {
          break label105;
        }
        paramHttpResponse = paramHttpResponse.getFirstHeader("LOCATION");
        break;
        paramHttpResponse = paramHttpResponse.getValue();
      } while (paramHttpResponse == null);
      if (this.a != null) {
        this.a.a(paramHttpResponse);
      }
      return URI.create(paramHttpResponse);
      label105:
      paramHttpResponse = null;
    }
  }
  
  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    return (i == 301) || (i == 302) || (i == 303) || (i == 307);
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.h.i
 * JD-Core Version:    0.7.0.1
 */