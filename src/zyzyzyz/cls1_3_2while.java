package zyzyzyz;

import java.util.Scanner;

public class cls1_3_2while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum=0;
		int k=sc.nextInt();
		int i=1;
		while (i<=k){
			sum += 1.0/fact(i);
			i++;
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