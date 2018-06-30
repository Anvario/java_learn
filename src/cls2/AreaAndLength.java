package cls2;
class Trangle{
	private double sideA,sideB,sideC,area,length;
	private boolean boo;
	Trangle(double a,double b,double c){
		setABC(a,b,c);//参数a,b,c分别赋值给sideA,sideB,sideC
	}
	double getLength(){
		length=this.sideA+this.sideB+this.sideC;//方法体，要求计算出length的值并返回
		return length;
	}
	public double getArea(){
		if(boo){
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			return area;
		}else{
			System.out.println("不是一个三角形，不能计算面积");
			return 0;
		}
	}
	boolean getBoo(){
		return this.boo;
	}
	double getSideA(){
		return this.sideA;
	}
	double getSideB(){
		return this.sideB;
	}
	double getSideC(){
		return this.sideC;
	}
	public void setABC(double a,double b,double c){
		this.sideA=a;//参数a,b,c分别赋值给sideA,sideB,sideC
		this.sideB=b;
		this.sideC=c;
		if(a+b>c&&a+c>b&&b+c>a){//a,b,c构成三角形的条件表达式
			boo=true;//给boo赋值
	    }else{
	    	boo=false;//给boo赋值
	    }
	}
}
class Lader{
	private double above,bottom,height,area;
	Lader(double above,double bottom,double height){
		this.above=above;//方法体，将参数a,b,c分别赋值给above,bottom,height
		this.bottom=bottom;
		this.height=height;
	}
	double getArea(){
		this.area=this.height*(this.above+this.bottom)/2;//方法体，要求计算出area并返回.
		return this.area;
	}
}
class Circle1{
	private double radius,area;
	Circle1(double radius){
		this.radius = radius;//方法体
	}
	double getArea(){
		this.area=Math.PI*Math.pow(this.radius, 2);//方法体，要求计算出面积area并返回
		return this.area;
	}
	double getLength(){
		return 2*Math.PI*this.radius;//方法体，要求计算出周长length并返回
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
public class AreaAndLength {
	public static void main(String[] args) {
		double length,area;
		Circle1 circle=null;
		Trangle trangle;
		Lader lader;
		//circle = new Circle1(3.3);//【代码15】//创建对象circle
        trangle= new Trangle(3,4,5);//创建对象trangle
        lader  = new Lader(3,4,5);//创建对象lader
		length = circle.getLength();//调用Circle方法返回周长并赋值给length
		System.out.println("圆的周长"+length);
		area = circle.getArea();//调用Circle方法返回面积并赋值给area
		System.out.println("圆的面积"+area);
		length = trangle.getLength();//调用trangle方法返回周长并赋值给length
		System.out.println("三角形的周长"+length);
		area = trangle.getArea();//调用trangle方法返回面积并赋值给area
		System.out.println("三角形的面积"+area);
		area = lader.getArea();//调用lader方法返回面积并赋值给area
		System.out.println("梯形的面积"+area);
		trangle.setABC(12, 34, 1);//调用Trangle方法设置三个边，要求将三个边修改为12，34，1
		area = trangle.getArea();//调用Trangle方法返回面积并赋值给area
		System.out.println("三角形面积："+area);
		length = trangle.getLength();//调用trangle方法返回周长并赋值给length
		System.out.println("三角形的周长"+length);
	}
}

/*
3.	编写一个java应用程序，该程序中有3个类：Trangle,Lader和Circle,分别用来刻画“三角形”、“梯形”和“圆形”。具体要求如下：
	Trangle类具有类型为double的三个边，以及周长、面积属性，Trangle类具有返回周长、面积以及修改三个边的方法。另外，Trangle类还具有一个boolean型的属性，该忏悔用来判断三个数能否构成一个三角形。
	Lader类具有类型为double的上底、下底、高、面积属性，具有返回面积的方法。
	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。

程序模板：
请按模板要求，将【代码】替换为java程序代码。

AreaAndLength.java

class Trangle{
	double sideA,sideB,sideC,area,length;
	boolean boo;
	public Trangle(double a,double b,double c){
		【代码1】//参数a,b,c分别赋值给sideA,sideB,sideC
		if(【代码2】){//a,b,c构成三角形的条件表达式
			【代码3】//给boo赋值
	    }else{
	    	【代码4】//给boo赋值
	    }
	}
	double getLength(){
		【代码5】//方法体，要求计算出length的值并返回
	}
	public double getArea(){
		if(boo){
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			return area;
		}else{
			System.out.println("不是一个三角形，不能计算面积");
			return 0;
		}
	}
	public void setABC(double a,double b,double c){
		【代码6】//参数a,b,c分别赋值给sideA,sideB,sideC
		if(【代码7】){//a,b,c构成三角形的条件表达式
			【代码8】//给boo赋值
	    }else{
	    	【代码9】//给boo赋值
	    }
	}
}

class Lader{
	double above,bottom,height,area;
	Lader(double above,double bottom,double height){
		【代码10】//方法体，将参数a,b,c分别赋值给above,bottom,height
	}
	double getArea(){
		【代码11】//方法体，要求计算出area并返回.
	}
}

class Circle{
	double radius,area;
	Circle(double radius){
		【代码12】//方法体
	}
	double getArea(){
		【代码13】//方法体，要求计算出面积area并返回
	}
	double getLength(){
		【代码14】//方法体，要求计算出周长length并返回
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

public class AreaAndLength {
	public static void main(String[] args){
		double length,area;
		Circle circle=null;
		Trangle trangle;
		Lader lader;
		【代码15】//创建对象circle
        【代码16】//创建对象trangle
        【代码17】//创建对象lader
		【代码18】//调用Circle方法返回周长并赋值给length
		System.out.println("圆的周长"+length);
		【代码19】//调用Circle方法返回面积并赋值给area
		System.out.println("圆的面积"+area);
		【代码20】//调用trangle方法返回周长并赋值给length
		System.out.println("三角形的周长"+length);
		【代码21】//调用trangle方法返回面积并赋值给area
		System.out.println("三角形的面积"+area);
		【代码22】//调用lader方法返回面积并赋值给area
		System.out.println("梯形的面积"+area);
		【代码23】//调用Trangle方法设置三个边，要求将三个边修改为12，34，1
		【代码24】//调用Trangle方法返回面积并赋值给area
		System.out.println("三角形面积："+area);
		【代码25】//调用trangle方法返回周长并赋值给length
		System.out.println("三角形的周长"+length);
	}
}
【思考问题】
（1）	程序中省略【代码15】，编译为什么通过吗？运行时出现怎样的异常提示？
	null pointer access
（2）	给Trangle类增加3个方法，分别用来返回3个边：sideA、sideB和sideC。
	已完成
*/
