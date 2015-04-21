/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * по данному числу n от 1 до 9 выводит на экран n пингвинов. Изображение одного пингвина 
 * имеет размер 5×9 символов, между двумя соседними пингвинами также имеется пустой 
 * (из пробелов) столбец. Разрешается вывести пустой столбец после последнего пингвина.
 * @author Денис
 */

import java.util.*;
public class example09 {
    static Scanner in = new Scanner (System.in);
    public static void main (String[] args)
    {
        System.out.println("Введите число пингвинов");
        int n = in.nextInt();
        in.close();
        String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "";
        for (int i=1; i<=n; i++)
        {
            s1 = s1 + "   _~_     ";
            s2 = s2 + "  (o o)    ";
            s3 = s3 + " /  V  \\   ";
            s4 = s4 + "/(  _  )\\  ";
            s5 = s5 + "  ^^ ^^    ";
        }
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);
    }
}
