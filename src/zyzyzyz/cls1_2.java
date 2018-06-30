package zyzyzyz;;

public class cls1_2 {

	public static void main(String[] args) {
		for (int i=2;i<=100;i++){
			if (is_prime(i)){
				System.out.print(i+"\t");
			}
		}

	}
	static boolean is_prime(int k){
		for (int j=2;j<=Math.sqrt(k);j++){
			if (k%j==0){
				return false;
			}
		}
		return true;
	}

}
