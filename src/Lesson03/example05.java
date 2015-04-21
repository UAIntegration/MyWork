/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 * Со дня постройки храма в 1605 году раз в десять лет мощи святого 
 * выставляются для всеобщего обозрения. 
 * Индийский крестьянин Вирмарам  – человек очень набожный, 
 * он не упускал случая коснуться святых мощей. Зная годы его жизни, 
 * определите, сколько раз он мог коснуться святых мощей 
* (считается, что в год своего рождения он не мог этого сделать, а в год смерти – мог).
 * @author Денис
 */
import java.io.*;
import java.util.*;
public class example05 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите год рождения");
        short y1 = in.nextShort();
        System.out.println("Введите год смерти");
        short y2 = in.nextShort();
        if ( y2 <= 1605 ) System.out.println("0");
        else if ( y1 <= 1605) System.out.println((y2-1605)/10);
        else System.out.println((y2-y1+1)/10);
    }
}
