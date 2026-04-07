public class TrainConsistManagementApp {

    // Custom Runtime Exception for safety violations
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            if ("Petroleum".equalsIgnoreCase(cargo) && "Rectangular".equalsIgnoreCase(this.shape)) {
                throw new CargoSafetyException("Unsafe combination: Cannot assign Petroleum to a Rectangular bogie.");
            }
            this.cargo = cargo;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return "GoodsBogie [shape=" + shape + ", cargo=" + (cargo != null ? cargo : "Unassigned") + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC15: Safe Cargo Assignment Using try-catch-finally ---\n");

        System.out.println("[Test 1: Safe Cargo Assignment Behavior]");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        try {
            System.out.println("Attempting to assign Petroleum to Cylindrical bogie...");
            cylindricalBogie.assignCargo("Petroleum");
            System.out.println("Success! Cargo assigned: " + cylindricalBogie);
        } catch (CargoSafetyException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Validation completion: Assignment process finalized for Cylindrical bogie.");
        }

        System.out.println("\n[Test 2 & 3: Unsafe Cargo Assignment Handled & Cargo Not Assigned]");
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        try {
            System.out.println("Attempting to assign Petroleum to Rectangular bogie...");
            rectangularBogie.assignCargo("Petroleum");
            System.out.println("Success! Cargo assigned: " + rectangularBogie);
        } catch (CargoSafetyException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Validation completion: Assignment process finalized for Rectangular bogie.");
        }
        
        System.out.println("Verify Bogie State: " + rectangularBogie);

        System.out.println("\n[Test 4 & 5: Program Continues After Exception & Finally Block Execution]");
        System.out.println("The program successfully continued execution without crashing, validating proper try-catch-finally usage.");
    }
}