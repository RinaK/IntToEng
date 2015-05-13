import java.util.Scanner;

public class IntToEng {
	  // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int input) {
    	String b="";
    	String[] ENG_LIST= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
    	if(input/10==2){
    		if(remainder(input)==0) {
    			b="twenty";
    		}else{
    	b="twenty"+ENG_LIST[remainder(input)];
    	}
    	}else if(input/10==3){
    		if(remainder(input)==0) {
    			b="thirty";
    		}else{
    		b="thirty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==4){
    		if(remainder(input)==0) {
    			b="fourty";
    		}else{
    		b="fourty"+ENG_LIST[remainder(input)];
    		}	
    	}else if(input/10==5){
    		if(remainder(input)==0) {
    			b="fifty";
    		}else{
    		b="fifty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==6){
    		if(remainder(input)==0) {
    			b="sixty";
    		}else{
    		b="sixty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==7){
    		if(remainder(input)==0) {
    			b="seventy";
    		}else{
    		b="seventy"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==8){
    		if(remainder(input)==0) {
    			b="eighty";
    		}else{
    			b="eighty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==9){
    		if(remainder(input)==0) {
    			b="ninety";
    		}else{
    		b="ninety"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10 == 10) {
    		b="hundred";
    		
    	}else{
    	
    	//String[] ENG_LIST= {"zero","one","two","three","four","five","six","seven","eight","nine","ten" };
    		return ENG_LIST[input];
    	}
    	return b;
}
    static int remainder(int input){
    	int remain;
    	remain=input%10;
    	return remain;
    }
}

