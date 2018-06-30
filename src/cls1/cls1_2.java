package cls1;
public class cls1_2 {
	public static void main(String[] args) {
		int num=0;
		for (int i=2;i<=100;i++){
			if (is_prime(i)){
				num++;
				System.out.print(i+"\t");
				if (num%5==0){				//make the output cool ^_^
					System.out.println();
				}
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
