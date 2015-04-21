package parsers;

import java.net.*; 
import java.io.*; 
import java.lang.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
class UCDemo 
{ 
  public static void main(String args[]) throws Exception { 
    int c;
    String buff = "";
    String line = "";
    URL hp = new URL("http://metro.dp.ua/timetable.html"); 
    URLConnection hpCon = hp.openConnection();
    BufferedReader br = new BufferedReader(new InputStreamReader(
    hpCon.getInputStream(), Charset.forName("UTF-8")));
 
    // get date 
    long d = hpCon.getDate();  
    if(d==0) 
      System.out.println("No date information."); 
    else 
      System.out.println("Date: " + new Date(d)); 
 
    // get content type 
    //System.out.println("Content-Type: " + hpCon.getContentType()); 
 
    // get expiration date 
  /*  d = hpCon.getExpiration(); 
    if(d==0) 
      System.out.println("No expiration information."); 
    else 
      System.out.println("Expires: " + new Date(d)); 
 */
    // get last-modified date 
    /*d = hpCon.getLastModified(); 
    if(d==0) 
      System.out.println("No last-modified information."); 
    else 
      System.out.println("Last-Modified: " + new Date(d)); 
 */
    // get content length 
    long len = hpCon.getContentLengthLong(); 
    /*if(len == -1) 
      System.out.println("Content length unavailable."); 
    else 
      System.out.println("Content-Length: " + len); */

    if(len != 0) { 
      System.out.println("=== Content ==="); 
 
      /*while (((c = br.read()) != -1)) { 
        System.out.print((char) c); 
      } 
      br.close(); */
      while ((line = br.readLine()) != null) {
                buff += line;
      }
 
    } else { 
      System.out.println("No content available."); 
    }
    ArrayList<String> Quotes = new ArrayList<String>();
    /*String regexp = "<div class=\"quote\">(.*?)</div>";
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
    for(int i=0; i<Quotes.size(); i++) {
            System.out.println(Quotes.get(i) + "\n");
        }*/
    buff = buff.replaceAll("<!DOCTYPE(.*)<a name=\"vokzalnaya\">", "<a name=\"vokzalnaya\">");
    buff = buff.replaceAll("(<p> </p>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<p style=\"text-align: left;\">	<table cellpadding=\"0\" cellspacing=\"0\" class=\"moduletable\">)(.*)<a name=\"metrobuild\">", "<a name=\"metrobuild\">");
    buff = buff.replaceAll("(<div class=\"yashare-auto-init)(.*)</html>", "");
    buff = buff.replaceAll("(</td><td width=\"94\" valign=\"top\">)|(<p align=\"center\"> </p>)", "\n");
    buff = buff.replaceAll("(<p>)|(</p>)|(<p align=\"center\">)|(</td></tr><tr><td width=\"94\" valign=\"top\">)|(</td><td width=\"109\" valign=\"top\">)", "\n");
    buff = buff.replaceAll("<br />", "\n");
    buff = buff.replaceAll("(\n)+", "\n");
    buff = buff.replaceAll("^\\s{1,}", "");
    /*String test = "dsd<head> temporary </head>sds";
    test = test.replaceAll("<head>(.*)</head>", "");
    System.out.println(test);*/
 System.out.println(buff + "\n");
  } 
}