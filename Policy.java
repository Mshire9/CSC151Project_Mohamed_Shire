public class Policy {
   private String policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private boolean smokingStatus;
   private double height; // in inches
   private double weight; // in pounds

   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age,
                 boolean smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyholderFirstName = firstName;
      this.policyholderLastName = lastName;
      this.policyholderAge = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }

   public double calculatePolicyPrice() {
      double price = 600;

      if (policyholderAge > 50) {
         price += 75;
      }
      if (smokingStatus) {
         price += 100;
      }
      double bmi = calculateBMI();
      if (bmi > 35) {
         price += (bmi - 35) * 20;
      }

      return price;
   }

   // Getters
   public String getPolicyNumber() {
      return policyNumber;
   }

   public String getProviderName() {
      return providerName;
   }

   public String getPolicyholderFirstName() {
      return policyholderFirstName;
   }

   public String getPolicyholderLastName() {
      return policyholderLastName;
   }

   public int getPolicyholderAge() {
      return policyholderAge;
   }

   public boolean getSmokingStatus() {
      return smokingStatus;
   }

   public double getHeight() {
      return height;
   }

   public double getWeight() {
      return weight;
   }
}