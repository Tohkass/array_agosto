import java.util.Arrays;
import java.util.Scanner;

public class Array_Agosto {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {10, 20, 30, 40, 50};
            int[] originalArr = Arrays.copyOf(arr, arr.length);
            
            int choice;
            
            do {
                
                System.out.println("\n===== ARRAY MENU SYSTEM =====");
                System.out.println("1. Insert Element");
                System.out.println("2. Delete Element");
                System.out.println("3. Search Element");
                System.out.println("4. Update Element");
                System.out.println("5. Reverse Array");
                System.out.println("6. Sort Array");
                System.out.println("7. Reset to Original Array");
                System.out.println("8. Exit");
                
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter index: ");
                        int insertIndex = sc.nextInt();
                        
                        System.out.print("Enter value: ");
                        int insertValue = sc.nextInt();
                        
                        int[] insertArr = new int[arr.length + 1];
                        
                        for (int i = 0, j = 0; i < insertArr.length; i++) {
                            
                            if (i == insertIndex) {
                                insertArr[i] = insertValue;
                            } else {
                                insertArr[i] = arr[j];
                                j++;
                            }
                        }
                        
                        arr = insertArr;
                        
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 2 -> {
                        System.out.print("Enter index to delete: ");
                        int deleteIndex = sc.nextInt();
                        
                        int[] deleteArr = new int[arr.length - 1];
                        
                        for (int i = 0, j = 0; i < arr.length; i++) {
                            
                            if (i != deleteIndex) {
                                deleteArr[j] = arr[i];
                                j++;
                            }
                        }
                        
                        arr = deleteArr;
                        
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 3 -> {
                        System.out.print("Enter value to search: ");
                        int searchValue = sc.nextInt();
                        
                        boolean found = false;
                        
                        for (int i = 0; i < arr.length; i++) {
                            
                            if (arr[i] == searchValue) {
                                
                                System.out.println("Element found at index: " + i);
                                
                                found = true;
                            }
                        }
                        
                        if (found == false) {
                            System.out.println("Element not found.");
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter index: ");
                        int updateIndex = sc.nextInt();
                        
                        System.out.print("Enter new value: ");
                        int updateValue = sc.nextInt();
                        
                        arr[updateIndex] = updateValue;
                        
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 5 -> {
                        for (int i = 0; i < arr.length / 2; i++) {
                            
                            int temp = arr[i];
                            
                            arr[i] = arr[arr.length - 1 - i];
                            
                            arr[arr.length - 1 - i] = temp;
                        }
                        
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 6 -> {
                        Arrays.sort(arr);
                        
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 7 -> {
                        arr = Arrays.copyOf(originalArr, originalArr.length);
                        
                        System.out.println("Array Reset!");
                        System.out.println("Updated Array: " + Arrays.toString(arr));
                    }
                    case 8 -> System.out.println("Program terminated.");
                    default -> System.out.println("Invalid choice!");
                }
                // INSERT
                // DELETE
                // SEARCH
                // UPDATE
                // REVERSE
                // SORT
                // RESET
                // EXIT
                // INVALID
                                
            } while (choice != 8);
        }
    }
}