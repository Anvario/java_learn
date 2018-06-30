package cls1;

public class cls1_1 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=10;i++){
			sum += fact(i);
		}	
		System.out.println("1!+2!+3!+...+10!="+sum);
	}
	
	public static int fact(int b){
		if (b==1){
			return 1;
		}else{
			return b*fact(b-1);
		}
	}
}
