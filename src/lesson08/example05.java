/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 * Секретное агентство «Super-Secret-no» решило для шифрования переписки своих сотрудников 
 * использовать «метод бутерброда». Сначала буквы слова нумеруются в таком порядке: первая 
 * буква получает номер 1, последняя буква - номер 2, вторая – номер 3, предпоследняя – 
 * номер 4, потом третья … и так для всех букв (см. рисунок). Затем все буквы записываются 
 * в шифр в порядке своих номеров. В конец зашифрованного слова добавляется знак «диез» (#), 
 * который  нельзя использовать в сообщениях. Вводится слово, зашифрованное методом 
 * бутерброда. Длина слова не превышает 20 букв. Выведите расшифрованное слово. 
 * @author Денис
 */
import java.io.*;
import java.util.*;

public class example05 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));
        String str = scan.readLine();
        str = str.substring(0, str.length()-1);
        char[] chars = str.toCharArray();
        char[] master = new char[str.length()];
        int fl=0, i=0;
        while (i<str.length())
            {
                master[fl] = chars[i];
                ++i;
                if (i == str.length()) break;
                master[str.length() - 1 - fl] = chars[i];
                ++fl;
                ++i;
            }
        System.out.println(master);
    }
}
