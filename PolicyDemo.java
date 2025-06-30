import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PolicyDemo {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));
      int smokerCount = 0;
      int nonSmokerCount = 0;

      while (fileScanner.hasNext()) {
         int policyNumber = Integer.parseInt(fileScanner.nextLine());
         String providerName = fileScanner.nextLine();
         String firstName = fileScanner.nextLine();
         String lastName = fileScanner.nextLine();
         int age = Integer.parseInt(fileScanner.nextLine());
         String smokingStatus = fileScanner.nextLine();
         double height = Double.parseDouble(fileScanner.nextLine());
         double weight = Double.parseDouble(fileScanner.nextLine());

         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         Policy policy = new Policy(policyNumber, providerName, holder);

         if (smokingStatus.equalsIgnoreCase("smoker")) {
            smokerCount++;
         } else {
            nonSmokerCount++;
         }

         System.out.println(policy);
         System.out.println();
      }

      System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}