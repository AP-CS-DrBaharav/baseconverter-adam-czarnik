/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zachi_Mac13in_1
 */
public class Main {
    
    public static void main(String[] args) {
        
        BaseConverter b ;
        
        int num;
        String str;
        
        
        num = 167;
        
        System.out.println(num + " as a String: " + BaseConverter.Dec2Str(num));

        str = BaseConverter.Dec2Bin(num) ;
        System.out.println(num + " as a Binary   : " + str);
        System.out.println(str + " as a Dec: " + BaseConverter.Bin2Dec(str));
        

        str = BaseConverter.Dec2Hex(num);
        System.out.println(num + " as a Hex: 0x" + str);

        // Homework from here on.
        System.out.println("---\nHomework from here on\n----");
        System.out.println("0x" + str + " as a Dec: " + BaseConverter.Hex2Dec(str));

        
        num = 20 ;
        str = BaseConverter.Dec2Oct(num);
        System.out.println(num + " as Octal: 0" + str);
        System.out.println("0" + str + " as a Decimal: " + BaseConverter.Oct2Dec(str));

        
        str = BaseConverter.Dec2Hex(num);
        System.out.println("0x" + str + " as a Binary: " + BaseConverter.Hex2Bin(str));
        
    }
}
