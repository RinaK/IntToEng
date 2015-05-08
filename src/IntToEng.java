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
    	String a="";
    	String[] ENG_LIST= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
    	if(input/10==2){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    	a="twenty"+ENG_LIST[remainder(input)];
    	}
    	}else if(input/10==3){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="thirty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==4){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="fourty"+ENG_LIST[remainder(input)];
    		}	
    	}else if(input/10==5){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="fifty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==6){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="sixty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==7){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="seventy"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==8){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    			a="eighty"+ENG_LIST[remainder(input)];
    		}
    	}else if(input/10==9){
    		if(remainder(input)==0) {
    			a="twenty";
    		}else{
    		a="ninety"+ENG_LIST[remainder(input)];
    		}
    	}else{
    	//String[] ENG_LIST= {"zero","one","two","three","four","five","six","seven","eight","nine","ten" };
    		return ENG_LIST[input];
    	}
    	return a;
    }
    static int remainder(int input){
    	int remain;
    	remain=input%10;
    	return remain;
    }
}

