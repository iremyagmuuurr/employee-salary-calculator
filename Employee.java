

  public class Employee
  {
    String name;
    float salary;
    int workHours;
    int hireYear;

    public Employee(String nameIn, float salaryIn, int workHoursIn, int hireYearIn)
    {
      this.name = nameIn;
      this.salary = salaryIn;
      this.workHours = workHoursIn;
      this.hireYear = hireYearIn;
    }

    public float Tax() 
    { 
      if(this.salary < 1000)
      {
        return 0;
      }  
      else 
      {
        float tax = (this.salary / 100.0f) *3.0f;
        return tax;
      } 
    }

    public float Bonus()
    {
       if(this.workHours <40)
       {
         return 0.0f;
       }
       else
       {
         float overtime = (this.workHours - 40) *30.0f ;
         return overtime;
       }
    }
    
    public float raiseSalary()
    {
      int workYear = 2021 - this.hireYear;
      float netSalary = this.salary - this.Tax() + this.Bonus();

        if (workYear < 10)
        {
         return netSalary / 20.0f ;
        }
         else if ( workYear < 20.0f)
        {
         return netSalary / 10.0f ;
        }
        else 
        {
         return (netSalary / 20.0f) *3.0f;
        }
    }
    public void ToString()
    {
     System.out.println("Adı : " + this.name);
     System.out.println("Maaşı : " + Float.toString(this.salary) );
     System.out.println("Çalışma Saati : " + Integer.toString(this.workHours));
     System.out.println ("Başlangı. Yılı : " + Integer.toString(this.hireYear));
     System.out.println("Vergi : " + Float.toString(this.Tax()));
     System.out.println("Bonus : " + Float.toString(this.Bonus()));
     System.out.println("Maaş Artışı : " + Float.toString(this.raiseSalary()));
     
     float netSalary = this.salary - this.Tax() + this.Bonus();
     System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + Float.toString(netSalary));
     float totalSalary = netSalary + this.Bonus();
     System.out.println("Toplam Maaş : " + Float.toString(totalSalary));
    }
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("Irem", 2000.0f, 45, 1985);
        employee1.ToString();
  
    }
    
  }


    
