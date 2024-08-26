import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String policyholderFirstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String policyholderLastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int policyholderAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double policyholderHeight = scanner.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double policyholderWeight = scanner.nextDouble();

        // Create a Policy object using the input data
        Policy policy = new Policy(policyNumber, providerName, policyholderFirstName, 
                                   policyholderLastName, policyholderAge, smokingStatus,
                                   policyholderHeight, policyholderWeight);

        // Display all information about the policy
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getPolicyholderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getPolicyholderLastName());
        System.out.println("Policyholder’s Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getPolicyholderHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getPolicyholderWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());

        scanner.close();
    }
}
