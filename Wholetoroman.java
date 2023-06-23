import java.util.Scanner;
class Solution {
    public static void(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num=sc.nextInt();
        System.out.println(intToRoman(num));
    }
        
    public String intToRoman(int num) {
        String[] ones=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tenths=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands=new String[]{"","M","MM","MMM"};

        String ROMAN = (thousands[num/1000]+ hundreds[(num%1000)/100]+tenths[(num%100)/10]+ones[num%10]);
        return ROMAN;
    }
}