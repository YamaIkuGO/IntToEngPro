package IntToEng;
import java.util.Scanner;

public class IntToEng {

	//メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	//数字を読み取る
    	String number = String.valueOf(n);
    	//0~19
    	String[] NumPart1 = {"zero", "one", "two", "three", "four","five", "six", 
    			"seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", 
    			"fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	String[] NumPart2 = {"","","twenty", "thirty", "forty", 
    	"fifty", "sixty","seventy", "eighty", "ninety"};
    	
    	int tenplace=n/10;//10の位
    	
    	int oneplace=n%10;//1の位
  
        if(n>0&&n<20){
    		number=NumPart1[n];
    		return number;
    	}else{
    		number = NumPart2[tenplace]+" "+NumPart1[oneplace];
    		return number;
    	}
    	
    	
        
    }
	
}
