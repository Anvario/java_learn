package cls2;

public class Excise2_1 {
	int i;
	public Excise2_1(int i)
	{
	    this.i=i;
	    System.out.println("******���췽��******");
	}
	public static void main(String[] args) {
		Excise2_1 e=new Excise2_1(1);
		e.i=3;
	}

}
/*
1.	����������������򡣳���Դ�������£�
public class Excise2_1
{
int i;
public void Excise2_1(int i)
{
    this.i=i;
System.out.println(��******���췽��******��);
}
public static void main(String arg[])
{
     Excise3_1 e=new Excise3_1();
}
}
���⣺
(1) ���������д���ĵط���ʹ������ȷִ�У�
	û��excise3_1 ��Ϊ2_1��
	���캯������Ҫ���巵��ֵ��ȥ��������new��Ҫ�Ӳ�����
	��warning��eδʹ��,����e.i=3;
(2) �����й��췽�����ĸ����������췽����Ŀ����ʲô��
	cls2_1(int i){...}���������������ʼ��
(3) ��ָ��this�ڳ����е����á�
	this���ñ����е�����
	this���ñ����е���������
 	this���ñ����е��������췽��
*/