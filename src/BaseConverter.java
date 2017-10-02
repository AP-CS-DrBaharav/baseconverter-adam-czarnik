
/**
 *
 * @author Dr. Baharav
 */

public class BaseConverter {

    
    public static String Dec2Str(int num) {
        String str = "";
        
        while(num>0) {
            str = str + (num % 10);     // Operator %, modulus
            //str = (num % 10) + str;
            num = num/10;               // mention num /=  10;
        }
        return str;
    }

    
    public static String Dec2Bin(int num) {   
        String str = "";

        while ( num>0 )
        {
            int digit   = num % 2 ;
            str = digit + str ;
            num         = num / 2;
        }
        return str;
    }
    

    public static int Bin2Dec(String str) {
        int l = 0;
        int newNum = 0;
        while (l<str.length()) {
            newNum = 2*newNum + (str.charAt(l)-'0');
            l++;
        }
        return newNum;   
    }
    
    
    public static String Dec2Hex(int num) {
        String str = "";

        int baseValue = 16;
        
        while ( num>0 )
        {
            int digit = num % baseValue ;
            num = num / baseValue;

            String digitStr = "";
            if (digit<10)
                digitStr = "" + digit;
            if (digit>=10)
                digitStr = "" + (char)('A'+ (digit-10));

            str =  digitStr + str ;

        }
        return str;
    }
    
    
    
    // Homework

    // Do NOT use any special purpose functions (like Character.digit(), 
    // Integer.isInteger(),Integer.parseInt() etc. 
    
    /**
    * @param str input string describing a hex number. For example, A7
    * @return   the value in Decimal
    */

    public static int Hex2Dec(String str) {

        int decTotal = 0;
        int i;
        int num = 0;
        for (i=str.length()-1;i>=0;i--) {
            if (str.charAt(i) == 'A') num = 10;
            if (str.charAt(i) == 'B') num = 11;
            if (str.charAt(i) == 'C') num = 12;
            if (str.charAt(i) == 'D') num = 13;
            if (str.charAt(i) == 'E') num = 14;
            if (str.charAt(i) == 'F') num = 15;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') num = str.charAt(i)-'0';
            decTotal = decTotal + (num * ((int)(Math.pow(16, str.length()-1-i))));
        }
        return decTotal;                
    }
    
    
    
    /**
    * @param num input number in decimal, for example 20
    * @return   the value in Octal as a string 24
    */
    public static String Dec2Oct(int num) {
        String str = "";

        while ( num>0 )
        {
            int digit   = num % 8 ;
            str = digit + str ;
            num         = num / 8;
        }
        return str;                
    }

    /**
    * @param str input string describing an Octal number. For example, 24
    * @return   the value in Decimal, for example 24
    */
    public static int Oct2Dec(String str) {
        // TODO

        int l = 0;
        int newNum = 0;
        while (l<str.length()) {
            newNum = 8*newNum + (str.charAt(l)-'0');
            l++;
        }
        return newNum;                
    }

    
    /**
    * @param str input string describing a Hex number. 
    * @return   string representing the number as Binary string.
    */
    public static String Hex2Bin(String str) {
        // TODO
        
        int j = Hex2Dec(str);
        String k = Dec2Bin(j);
        return k;                
    }

} 