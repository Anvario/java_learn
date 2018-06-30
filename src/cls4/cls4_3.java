package cls4;

abstract class Employee
{
	public abstract double earnings();
}
class YearWorker extends Employee
{
	public double earnings(){//重写earnings()方法
		return 96000;
	}
}
class MonthWorker extends Employee
{
	public double earnings(){//重写earnings()方法。
		return 8000*12;
	}
}
class WeekWorker extends Employee
{
	public double earnings(){ //重写earnings()方法。
		return 2000*4*12;
	}
}
class Company
{
   Employee[] employee;
   double salaries=0;
   Company(Employee[] employee)
   {
      this.employee=employee;
   }
   public double salariesPay()
   {
      salaries=0;
      for(int i=0;i<employee.length;i++)
      salaries+=employee[i].earnings();//计算salaries。
      return salaries;
   }    
}
public class cls4_3//HardWork
{
   public static void main(String args[])
   {
      Employee[] employee=new Employee[20];
      for(int i=0;i<employee.length;i++)
       {
           if(i%3==0)
             employee[i]=new WeekWorker();
           else if(i%3==1)
             employee[i]=new MonthWorker();
           else if(i%3==2)
             employee[i]=new YearWorker();
       } 
     Company  company=new Company(employee);
     System.out.println("公司年工资总额:"+company.salariesPay());
   }
} 
