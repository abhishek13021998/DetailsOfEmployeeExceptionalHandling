import java.util.Scanner;
class Service
{
  public static void main(String[]args)
{    
     Scanner sc=new Scanner(System.in);
     int no=0;
     int choice=0;
     boolean b=false;
     int d=0;  
      int i=0;
      int count=0;
      Employee[ ] c=new Employee[ 10];
      
   
   
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
}