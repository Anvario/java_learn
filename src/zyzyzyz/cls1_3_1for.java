package zyzyzyz;
import java.util.*;

public class cls1_3_1for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum=0;
		int k=sc.nextInt();
		for (int i=1;i<=k;i++){
			sum += 1.0/fact(i);
		}
		System.out.println(sum);
		sc.close();
	}
	
	static int fact(int b){
		if (b==1){
			return 1;
		}else{
			return b*fact(b-1);
		}
	}

}
