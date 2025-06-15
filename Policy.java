/**
 * The Policy class represents an insurance policy with details
 * about the provider and the policyholder.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    /**
     * Constructs a new Policy object with all fields.
     * @param policyNumber The policy number
     * @param providerName The provider name
     * @param firstName The policyholder's first name
     * @param lastName The policyholder's last name
     * @param age The policyholder's age
     * @param smokingStatus The policyholder's smoking status
     * @param height The policyholder's height (in inches)
     * @param weight The policyholder's weight (in pounds)
     */
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = firstName;
        this.policyholderLastName = lastName;
        this.policyholderAge = age;
        this.smokingStatus = smokingStatus;
        this.policyholderHeight = height;
        this.policyholderWeight = weight;
    }

    /** @return The policy number */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /** @return The provider name */
    public String getProviderName() {
        return providerName;
    }

    /** @return The policyholder's first name */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /** @return The policyholder's last name */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /** @return The policyholder's age */
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    /** @return The policyholder's smoking status */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /** @return The policyholder's height in inches */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    /** @return The policyholder's weight in pounds */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    /**
     * Calculates the Body Mass Index (BMI).
     * @return The BMI of the policyholder
     */
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    /**
     * Calculates the total price of the policy.
     * @return The total policy price
     */
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        if (policyholderAge > 50) baseFee += 75.0;
        if (smokingStatus.equalsIgnoreCase("smoker")) baseFee += 100.0;
        if (calculateBMI() > 35) baseFee += 75.0;
        return baseFee;
    }
}