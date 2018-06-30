package cls1;
public class cls1_3_2while {
	public static void main(String[] args) {
		double sum=0;
		int i=1;
		do {
			sum += 1.0/fact(i);
			i++;
		}while (i<=20);
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