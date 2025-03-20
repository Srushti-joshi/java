public class BranchMethod {
    static String[] BranchName = {null, null, null, null, null};
    public static int index = 0;
    public static void displayBranch(String name) {
        if (index < BranchName.length) {
            BranchName[index] = name;
            index++;
            System.out.println(name + " has been added to the list.");
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }
    public static void displayBranch(String name, int locationCode) {
        if (index < BranchName.length) {
            BranchName[index] = name + " - " + locationCode;
            index++;
            System.out.println(name + " with location code " + locationCode + " has been added to the list.");
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }
    public static void displayBranch(String name, double latitude) {
        if (index < BranchName.length) {
            BranchName[index] = name + " - Latitude: " + latitude;
            index++;
            System.out.println(name + " at latitude " + latitude + " has been added.");
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }
    public static void displayBranch(String name, boolean isOpen) {
        if (index < BranchName.length) {
            BranchName[index] = name + " - Open: " + isOpen;
            index++;
            System.out.println(name + " is " + (isOpen ? "open" : "closed"));
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }
    public static void displayBranch(String name, char branchCode) {
        if (index < BranchName.length) {
            BranchName[index] = name + " - Branch Code: " + branchCode;
            index++;
            System.out.println(name + " with branch code " + branchCode + " has been added.");
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }

    public static void displayBranch(String name, float rating) {
        if (index < BranchName.length) {
            BranchName[index] = name + " - Rating: " + rating;
            index++;
            System.out.println(name + " with a rating of " + rating + " has been added.");
        } else {
            System.out.println("The list is full. Cannot add more branches.");
        }
    }
}

    
