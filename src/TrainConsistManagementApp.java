import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void testSort_BasicAlphabeticalSorting() {
        System.out.println("[Test 1: testSort_BasicAlphabeticalSorting]");
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        System.out.println("Original: " + Arrays.toString(bogies));
        Arrays.sort(bogies);
        System.out.println("Sorted:   " + Arrays.toString(bogies) + "\n");
    }

    public static void testSort_UnsortedInput() {
        System.out.println("[Test 2: testSort_UnsortedInput]");
        String[] bogies = {"Luxury", "General", "Sleeper", "AC Chair"};
        System.out.println("Original: " + Arrays.toString(bogies));
        Arrays.sort(bogies);
        System.out.println("Sorted:   " + Arrays.toString(bogies) + "\n");
    }

    public static void testSort_AlreadySortedArray() {
        System.out.println("[Test 3: testSort_AlreadySortedArray]");
        String[] bogies = {"AC Chair", "First Class", "General"};
        System.out.println("Original: " + Arrays.toString(bogies));
        Arrays.sort(bogies);
        System.out.println("Sorted:   " + Arrays.toString(bogies) + "\n");
    }

    public static void testSort_DuplicateBogieNames() {
        System.out.println("[Test 4: testSort_DuplicateBogieNames]");
        String[] bogies = {"Sleeper", "AC Chair", "Sleeper", "General"};
        System.out.println("Original: " + Arrays.toString(bogies));
        Arrays.sort(bogies);
        System.out.println("Sorted:   " + Arrays.toString(bogies) + "\n");
    }

    public static void testSort_SingleElementArray() {
        System.out.println("[Test 5: testSort_SingleElementArray]");
        String[] bogies = {"Sleeper"};
        System.out.println("Original: " + Arrays.toString(bogies));
        Arrays.sort(bogies);
        System.out.println("Sorted:   " + Arrays.toString(bogies) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC17: Sort Bogie Names Using Arrays.sort() ---\n");

        testSort_BasicAlphabeticalSorting();
        testSort_UnsortedInput();
        testSort_AlreadySortedArray();
        testSort_DuplicateBogieNames();
        testSort_SingleElementArray();
    }
}