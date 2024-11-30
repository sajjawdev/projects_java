import java.util.Scanner;

public class test_project{
  public static void main(String[]args){
    
    Scanner scanner=new Scanner(System.in);
    
    long[]hoghoogh=new long[2];
    
    for (int p=0;p<3 ;p++ ) {
      
      System.out.println("karmand"+(p+1));
       
      System.out.println("please enter hoghoogh "+ (p+1)+" :");
      
      hoghoogh[p]=scanner.nextLong();
      
      if (hoghoogh[p]>5700000){
        
        long bime=hoghoogh[p]* 5/100;
        
        long hoghoogh_bime=hoghoogh[p]-bime;
        
        long hagh_olad=hoghoogh_bime*7/100;
        
        long hoghoogh_payani=hoghoogh_bime+hagh_olad;
        
        System.out.printf("hoghoogh_aval: %,d \n", hoghoogh[p]);
        
        System.out.printf("hoghoogh_badaz_kasre_bime: %,d \n", hoghoogh_bime);
        
        System.out.printf("hoghoogh_payani_badaz_ezafe_kardan_hagh_olad: %,d \n", hoghoogh_payani);
        
        System.out.println("\n");
        
        System.out.println();
        
      }
      else{
        System.out.printf("حقوق شما کمتر از 5700000 است " ,hoghoogh[p]);
        System.out.println("\n");
        System.out.println();
      }
    }
            scanner.close(); 

  }
}