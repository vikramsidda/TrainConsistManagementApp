import java.util.Arrays;

public class TrainConsistManagementApp {

    // Linear Search Implementation for Strings
    public static boolean linearSearch(String[] ids, String searchKey) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(searchKey)) {
                return true; // Match found, search stops
            }
        }
        return false; // Not found
    }

    public static void testSearch_BogieFound() {
        System.out.println("[Test 1: testSearch_BogieFound]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG309";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + linearSearch(ids, key) + "\n");
    }

    public static void testSearch_BogieNotFound() {
        System.out.println("[Test 2: testSearch_BogieNotFound]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG999";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + linearSearch(ids, key) + "\n");
    }

    public static void testSearch_FirstElementMatch() {
        System.out.println("[Test 3: testSearch_FirstElementMatch]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + linearSearch(ids, key) + "\n");
    }

    public static void testSearch_LastElementMatch() {
        System.out.println("[Test 4: testSearch_LastElementMatch]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG550";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + linearSearch(ids, key) + "\n");
    }

    public static void testSearch_SingleElementArray() {
        System.out.println("[Test 5: testSearch_SingleElementArray]");
        String[] ids = {"BG101"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + linearSearch(ids, key) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC18: Linear Search for Bogie ID (Array-Based Searching) ---\n");

        testSearch_BogieFound();
        testSearch_BogieNotFound();
        testSearch_FirstElementMatch();
        testSearch_LastElementMatch();
        testSearch_SingleElementArray();
    }
}