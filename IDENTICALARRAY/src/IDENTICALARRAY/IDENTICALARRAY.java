package IDENTICALARRAY;

public class IDENTICALARRAY {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 3x3 array
        System.out.print("Enter list1: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // Prompt the user to enter the second 3x3 array
        System.out.print("Enter list2: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        // Check if the two arrays are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        
        input.close();
    }

    // Method to check if two 2D arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if the dimensions match
        if (m1.length != m2.length) {
            return false;
        }
        
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            // Check each element
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
