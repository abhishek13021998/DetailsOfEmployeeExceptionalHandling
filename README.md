# DetailsOfEmployeeExceptionalHandling
In this programme we have to add employee name,age,sal and invalid option is handled by exceptional handling.
Operation side code-
we take employee as abstract class
taking method as create-
 public void create()
         {
           
        System.out.println("Enter your name:");
         name=sc.next();
        System.out.println("Enter your age:");
         age=sc.nextInt();
         }
Now take raiseSal method
public abstract void raiseSal();

for displaying we take display method
 public void display()
         {
         System.out.println("Name:"+this.name);
         System.out.println("Age:"+this.age);
         System.out.println("Sal:"+this.sal);
        System.out.println("Job:"+this.Designation);
         }
 Now take property of clerk and extends Employee
  
     Clerk()
     {
      sal=20000;
      Designation="Clerk";
     }    
  
    public void raiseSal()
     {
        sal=sal+(sal*10)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 10%");
          super.sal=sal;
      }
      Now take property of manager and extends employee
      class Manager extends Employee
{
      
      Manager()
       {
       sal=50000;
        Designation="Manager";
      }
    public void raiseSal()
     {
        sal=sal+(sal*20)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 20%");
            super.sal=sal;
      }
      Similary programmer side extends Employee
      rogrammer()
      {
        sal=100000;
        Designation="Programmer";
      }
   
    public void raiseSal()
     {
        sal=sal+(sal*25)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 25%");
         super.sal=sal;
      }
      In service -in use do while and switch statement
        do
   {
    
     System.out.println("\n 1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");

     choice=sc.nextInt();
        
        
         
        
    switch(choice)
     {
     case 1:   do{
                System.out.println("\n 1.Clerk \n 2.Manager \n 3.Programmer\n 4.Exit\n choose");
                d=sc.nextInt();
              
              switch(d)
                {
               case 1:     
                            Clerk f=new Clerk();
                            f.create();
                            c[i]=(Clerk)f;
                            i++;
                             
                         break;
                           
                case 2:    
                            Manager m=new Manager();
			    m.create();
                            c[i]=(Manager)m; 	
		            i++;
                            count++;
                            break;      
                    
                 case 3:
                         
                         Programmer p=new Programmer();
                          p.create();
                          c[i]=(Programmer)p;
                           i++;
                            
                          break;
                           
                   case 4:
                    System.out.println("exiting----");
                   }   
               }while(d!=4);
                break;
                        
     case 2:   try
                 {
                   int j=0;
                  while(c[j]!=null)
                   {
                    c[j].display();                  
                    j++;
                   } 
                }
             catch(NullPointerException ne)
              {
             System.out.println("no records");
             }
             break;
             
     case 3:try
              { 
                  int j=0;
                   do
                   {
                  c[j].raiseSal();
                   j++;
                    }while(c[j]!=null);
                   
               }
             catch(NullPointerException ne)
               {
              System.out.println("no records");
               }
               break;
             
     case 4:System.out.println("exiting..");
     default:System.out.println("Invalid choice");
     }

   }while(choice>0 && choice<4);

 }
      
      
      
      
      
 


