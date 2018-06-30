package cls1;
public class cls1_3_1for {
	public static void main(String[] args) {
		double sum=0;
		for (int i=1;i<=20;i++){
			sum += 1.0/fact(i);
		}
		System.out.println(sum);
	}	
	static int fact(int b){
		if (b==1){
			return 1;
		}else{
			return b*fact(b-1);
		}
	}
}
