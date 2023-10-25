package CloudVandana;

public class RomanToInteger {
    public static void main(String[] args) {
            String str = "LVIII";
        System.out.println(romanToInt(str));

    }

    private static int romanToInt(String str) {
        int ans = 0;
        int currVal = 0;
        int prevVal =0;
        for(int i=str.length()-1;i>=0;i--){
            switch(str.charAt(i)){
                case 'I':currVal=1;
                         break;
                case 'V':currVal=5;
                         break;
                case 'X':currVal=10;
                         break;
                case 'L':currVal=50;
                         break;
                case 'C':currVal=100;
                         break;
                case 'D':currVal=500;
                         break;
                case 'M':currVal=1000;
                         break;
            }
            if(currVal < prevVal){
                ans = ans - currVal;
            }
            else{
                ans = ans + currVal;
            }
            prevVal = currVal;
        }
        return ans;
    }

}
