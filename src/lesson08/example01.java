/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 * Пароль называется криптостойким, если он включает в себя и строчные латинские 
 * буквы, и заглавные латинские буквы, и цифры, при этом его длина должна быть не 
 * менее 8 символов. Требуется по данному паролю определить, является ли он криптостойким.
 * @author Денис
 */

import java.io.*;
import java.util.regex.*;

public class example01 {
    public static boolean checks(String incomes){  
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{8,}$");  
        Matcher m = p.matcher(incomes);
        return m.matches();
    }
    public static void main (String[] args) throws IOException
    {
        BufferedReader scan = new BufferedReader( new InputStreamReader(System.in));
        String str = scan.readLine().trim();
        System.out.println(checks(str)? "YES":"NO");
    }
}
