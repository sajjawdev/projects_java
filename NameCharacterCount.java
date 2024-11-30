import java.util.Scanner;


public class NameCharacterCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        for (int i = 1; i <= 10; i++) {
 
            System.out.print ("لطفاً اسم " + i + " را وارد کنید : ");

            String name = scanner.nextLine();
            
            System.out.println(name + " - " + name.length() + " کاراکتر");
        }
        
        scanner.close(); 
    }
}
