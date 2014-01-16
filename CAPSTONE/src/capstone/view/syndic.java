package capstone.view;



import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import java.net.URL;
import java.util.Iterator;

/**
 *
 * @author JARVIS
 */
public class syndic {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://news.yahoo.com/rss/");
        XmlReader reader = null;

        try {

            reader = new XmlReader(url);
            SyndFeed feed = new SyndFeedInput().build(reader);
            System.out.println("Feed Title: " + feed.getAuthor());

            for (Iterator i = feed.getEntries().iterator(); i.hasNext();) {
                SyndEntry entry = (SyndEntry) i.next();
                System.out.println("Title: " + entry.getTitle());
            System.out.println("Link: " + entry.getLink());
            System.out.println("Author: " + entry.getAuthor());
            System.out.println("Publish Date: " + entry.getPublishedDate());
            System.out.println("Description: " + entry.getDescription().getValue());
            System.out.println("aaa"+entry.getTitleEx().getValue());
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
