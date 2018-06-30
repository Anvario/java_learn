package cls4;

interface ComputeWeight{
	public double computeWeight();
}

class Television implements ComputeWeight{
	private double weight=45.5;
	public double computeWeight(){//实现computeWeight()方法
		return this.weight;
	}
}
class Computer implements ComputeWeight{
	private double weight=65.5;
	public double computeWeight(){//实现computeWeight()方法
		return this.weight;
	}
}
class WashMachine implements ComputeWeight{
	private double weight=145;
	public double computeWeight(){//实现computeWeight()方法
		return this.weight;
	}
}

class Car{
	ComputeWeight[] goods;
	double totalWeights;
	public Car(ComputeWeight[] goods) {
		this.goods=goods;
	}
	public double getTotalWeights(){
		totalWeights=0;
		for(int i=0;i<goods.length;i++){//计算totalWeights
			totalWeights += goods[i].computeWeight();
		}return totalWeights;
	}
}
public class cls4_4//Road 
{

	public static void main(String[] args) {
		ComputeWeight[] goodsOne=new ComputeWeight[50],
						goodsTwo=new ComputeWeight[22];
		for(int i=0;i<goodsOne.length;i++){
			if(i%3==0){
				goodsOne[i]=new Television();
			}else if(i%3==1){
				goodsOne[i]=new Computer();
			}else{
				goodsOne[i]=new WashMachine();
			}
		}
		for(int i=0;i<goodsTwo.length;i++){
			if(i%3==0){
				goodsTwo[i]=new Television();
			}else if(i%3==1){
				goodsTwo[i]=new Computer();
			}else{
				goodsTwo[i]=new WashMachine();
			}
		}
		Car bigCar=new Car(goodsOne);
		System.out.println("大货车装载的货物重量:"+bigCar.getTotalWeights());
		Car smallCar=new Car(goodsTwo);
		System.out.println("小货车装载的货物重量:"+smallCar.getTotalWeights());
	}

}
