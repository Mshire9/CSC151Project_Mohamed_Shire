public class Policy {
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;

   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
      policyCount++;
   }

   public int getPolicyNumber() {
      return policyNumber;
   }

   public String getProviderName() {
      return providerName;
   }

   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }

   public double getPolicyPrice() {
      double basePrice = 600.0;
      if (policyHolder.getAge() > 50) {
         basePrice += 75.0;
      }
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
         basePrice += 100.0;
      }
      if (policyHolder.getBMI() > 35) {
         basePrice += 75.0;
      }
      return basePrice;
   }

   public static int getPolicyCount() {
      return policyCount;
   }

   public String toString() {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName + "\n" +
             policyHolder.toString() +
             "\nPolicy Price: $" + String.format("%.2f", getPolicyPrice());
   }
}