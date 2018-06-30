package cls2;
class Circle
{
	float f1=3.14f;
	static float f2=100;
	void method1()
	{
       System.out.println("f1="+f1);
	}
    static void method2()
    {
       System.out.println("f2="+f2);
    }
}

public class DifferFun {

	public static void main(String[] args) {
		float f3; 
		Circle c1=new Circle();
		f3=c1.f1+Circle.f2;
		c1.method1();
		Circle.method2();
		System.out.println(f3);
	}

}
/*
2.	����������������򡣳���Դ�������£�
class Circle
{
	float f1=3.14f;
	static float f2=100;
	void method1()
	{
       System.out.println("f1="+f1);
	}
    static void method2()//�෽���в��ܳ���this����super�ؼ���
    {
       System.out.println("f2="+f2);
    }
}

public class DifferFun {

	public static void main(String[] args) {
		float f3; 
		Circle c1=new Circle();
		f3=c1.f1+Circle.f2;
		c1.method1();
		Circle.method2();
	}

}
���⣺
(1) ����f1��f2�����÷�ʽ�кβ�ͬ��
	c1.f1ʵ������  Circle.f2�����
(2) ����method1()��method2()�ĵ��÷�ʽ�кβ�ͬ��
	method1()ʵ������           method2()�෽��
(3) ��������Щ��ʵ����������Щ���������   
	f1             f2
*/