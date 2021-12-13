public class Shipment {
    public static void main(String[] args) {
        System.out.println("Welcome to John Doe's shipping calculator!\n");

        //Taking input for the first package from user
        System.out.println("Enter first package dimensions");
        Package firstPackage = new Package();
        firstPackage.inputLength();
        firstPackage.inputWidth();
        firstPackage.inputHeight();
        System.out.println("\n");

        //Taking input for the second package from user
        System.out.println("Enter second package dimensions");
        Package secondPackage = new Package();
        secondPackage.inputLength();
        secondPackage.inputWidth();
        secondPackage.inputHeight();

        //Displaying the dimensions and total volume for the package 1.
        System.out.println("\n");
        System.out.print("First package dimensions: ");
        firstPackage.displayDimensions();
        double firstPackageVolume = firstPackage.calcVolume();
        System.out.println(",\tVolume = " + firstPackageVolume);

        //Displaying the dimensions and total volume for the package 2.
        System.out.print("Second package dimensions: ");
        secondPackage.displayDimensions();
        double secondPackageVolume = secondPackage.calcVolume();
        System.out.println(",\tVolume = " + secondPackageVolume);

        //finding the cost for package 1.
        double firstPackageCost = 3 + firstPackageVolume - 1;
        System.out.println("Package 1 will cost $" + firstPackageCost + " to ship.");

        //finding the cost for package 2.
        double secondPackageCost = 3 + secondPackageVolume - 1;
        System.out.println("Package 2 will cost $" + secondPackageCost + " to ship.");

        //Comparing the total cost of package 1 and package 2, then displaying the results on the basis of their cost.
        if (firstPackageCost == secondPackageCost) {
            System.out.println("The first package is the same cost as the second package");
        } else { //If the package 1 is more costly than package 2.
            if (firstPackageCost > secondPackageCost) {
                if (firstPackageCost < 2 * secondPackageCost) { //if package 1 is less than 2 times costly from package 2.
                    System.out.println("The first package is slightly more than the second package");
                } else if (firstPackageCost < 3 * secondPackageCost) { //if package 1 is less than 3 times costly from package 2.
                    System.out.println("The first package is twice the second package");
                } else if (firstPackageCost < 4 * secondPackageCost) { //if package 1 is less than 4 times costly from package 2.
                    System.out.println("The first package is triple costly the second package");
                } else if (firstPackageCost < 5 * secondPackageCost) { //if package 1 is less than 5 times costly from package 2.
                    System.out.println("The first package is quadruple costly the second package");
                }
            }
        }
        if (secondPackageCost > firstPackageCost) { //If second package costs is more than package 2 costs
            if (secondPackageCost < 2 * firstPackageCost) { //if package 2 is less than 2 times costly from package 1.
                System.out.println("The second package is slightly more than the first package");
            } else if (secondPackageCost < 3 * firstPackageCost) { //if package 2 is less than 3 times costly from package 1.
                System.out.println("The second package is twice the first package");
            } else if (secondPackageCost < 4 * firstPackageCost) { //if package 2 is less than 4 times costly from package 1.
                System.out.println("The second package is triple costly the first package");
            } else if (firstPackageCost < 5 * secondPackageCost) { //if package 2 is less than 5 times costly from package 1.
                System.out.println("The first package is quadruple costly the second package");
            }
        }
    }
}
