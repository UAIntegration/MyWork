package lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BashQuotes {
    public static final String url = "http://bashorg.org/";
    
    private String regexp = "<div class=\"quote\">(.*?)</div>";
    private int page = 0;
    private String buff = "";

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private String getBuff() {
        String line = "";
        String buff = "";
        try {
            URL hp = new URL(url + "page/" + page);
            BufferedReader reader = new BufferedReader(new InputStreamReader(hp.openStream(), "windows-1251"));

            while ((line = reader.readLine()) != null) {
                buff += line;
            }
            reader.close();

        } catch (MalformedURLException e) {
            System.out.println("Error: " + e);
        }catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return buff;
    }

    ArrayList<String> getQuotes() {
        buff = getBuff();
        ArrayList<String> Quotes = new ArrayList<String>();
        if(buff.length() > 0) {
            Pattern p = Pattern.compile(regexp);
            Matcher m = p.matcher(buff);
            String res = "";
            while (m.find()) {
                res = m.group(1);
                res = res.replaceAll("<br />", "\n");
                res = res.replaceAll("&quot;", "");
                Quotes.add(res);
            }
        }
        return Quotes;
    }
}