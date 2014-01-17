package capstone.view;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Iterator;

/**
 *
 * @author JARVIS
 */
public class syndic {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://news.yahoo.com/rss/");
        URL url1 = new URL("http://weather.yahooapis.com/forecastrss?w=1199155&u=c");
        XmlReader reader = null;

        try {

            reader = new XmlReader(url1);
            SyndFeed feed = new SyndFeedInput().build(reader);

            for (Iterator i = feed.getEntries().iterator(); i.hasNext();) {
                SyndEntry entry = (SyndEntry) i.next();
                System.out.println("Title: " + entry.getTitle());

            //System.out.println("Description: " + entry.getDescription().getValue());
                String contentString = entry.getDescription().getValue();
                String noHtml = contentString.replaceAll("\\<.*?>", "");
                String afterDecoding = URLDecoder.decode(noHtml, "UTF-8");
                String[] arr = afterDecoding.split("\n");
                System.out.println(afterDecoding);
                
                System.out.println(arr[3]);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
