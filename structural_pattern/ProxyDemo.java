public class Main {

    // ----- Subject Interface -----
    interface OfficeAccess {
        void enter();
    }

    // ----- Real Subject -----
    static class RealEmployee implements OfficeAccess {
        private String name;

        public RealEmployee(String name) {
            this.name = name;
        }

        public void enter() {
            System.out.println(name + " has entered the office.");
        }
    }

    // ----- Proxy -----
    static class SecurityGuard implements OfficeAccess {

        private RealEmployee employee;

        public SecurityGuard(RealEmployee employee) {
            this.employee = employee;
        }

        public void enter() {
            if (checkAccess()) {
                System.out.println("Security Guard: Access granted ✔️");
                employee.enter();
            } else {
                System.out.println("Security Guard: Access denied ❌");
            }
        }

        private boolean checkAccess() {
            // Simple example: allow only employees with valid name
            return employee != null && employee.name != null && !employee.name.isEmpty();
        }
    }

    // ----- Client -----
    public static void main(String[] args) {

        RealEmployee employee = new RealEmployee("Shantanu");

        OfficeAccess access = new SecurityGuard(employee);

        access.enter(); // Proxy controls the access
    }
}
