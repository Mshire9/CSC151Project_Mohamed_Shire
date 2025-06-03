import java.util.Scanner;

public class PolicyDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the Policy Number: ");
      String policyNumber = input.nextLine();

      System.out.print("Enter the Provider Name: ");
      String providerName = input.nextLine();

      System.out.print("Enter the Policyholder’s First Name: ");
      String firstName = input.nextLine();

      System.out.print("Enter the Policyholder’s Last Name: ");
      String lastName = input.nextLine();

      System.out.print("Enter the Policyholder’s Age: ");
      int age = input.nextInt();

      System.out.print("Enter the Policyholder’s Smoking Status (true for smoker, false for non-smoker): ");
      boolean isSmoker = input.nextBoolean();

      System.out.print("Enter the Policyholder’s Height (in inches): ");
      double height = input.nextDouble();

      System.out.print("Enter the Policyholder’s Weight (in pounds): ");
      double weight = input.nextDouble();

      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, isSmoker, height, weight);

      System.out.println("\n--- Policy Details ---");
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder: " + policy.getPolicyholderFirstName() + " " + policy.getPolicyholderLastName());
      System.out.println("Age: " + policy.getPolicyholderAge());
      System.out.println("Smoking Status: " + (policy.getSmokingStatus() ? "Smoker" : "Non-Smoker"));
      System.out.println("Height: " + policy.getHeight() + " inches");
      System.out.println("Weight: " + policy.getWeight() + " pounds");
      System.out.printf("BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
   }
}