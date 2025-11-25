public class Main {

    // ----- Context (Train Controller) -----
    static class TrainContext {
        void moveForward(int steps) {
            System.out.println("🚂 Moving forward " + steps + " steps.");
        }

        void turnLeft() {
            System.out.println("🚂 Turning LEFT.");
        }

        void turnRight() {
            System.out.println("🚂 Turning RIGHT.");
        }
    }

    // ----- Expression Interface -----
    interface Expression {
        void interpret(TrainContext context);
    }

    // ----- Terminal Expressions -----

    static class ForwardExpression implements Expression {
        private int steps;

        public ForwardExpression(int steps) {
            this.steps = steps;
        }

        public void interpret(TrainContext context) {
            context.moveForward(steps);
        }
    }

    static class LeftExpression implements Expression {
        public void interpret(TrainContext context) {
            context.turnLeft();
        }
    }

    static class RightExpression implements Expression {
        public void interpret(TrainContext context) {
            context.turnRight();
        }
    }

    // ----- Non-Terminal Expression: LOOP -----

    static class LoopExpression implements Expression {
        private int times;
        private Expression command;

        public LoopExpression(int times, Expression command) {
            this.times = times;
            this.command = command;
        }

        public void interpret(TrainContext context) {
            for (int i = 0; i < times; i++) {
                command.interpret(context);
            }
        }
    }

    // ----- Simple Parser -----
    static class Parser {
        public static Expression parse(String command) {

            String[] parts = command.split(" ");

            // LOOP n <command>
            if (parts[0].equalsIgnoreCase("LOOP")) {
                int times = Integer.parseInt(parts[1]);
                String innerCommand = parts[2];

                // Example: LOOP 3 FORWARD10
                if (innerCommand.startsWith("FORWARD")) {
                    int steps = Integer.parseInt(innerCommand.replace("FORWARD", ""));
                    return new LoopExpression(times, new ForwardExpression(steps));
                }
            }

            // FORWARD <n>
            if (parts[0].equalsIgnoreCase("FORWARD")) {
                return new ForwardExpression(Integer.parseInt(parts[1]));
            }

            // LEFT
            if (parts[0].equalsIgnoreCase("LEFT")) {
                return new LeftExpression();
            }

            // RIGHT
            if (parts[0].equalsIgnoreCase("RIGHT")) {
                return new RightExpression();
            }

            throw new IllegalArgumentException("Unknown command: " + command);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        TrainContext context = new TrainContext();

        // Commands
        String[] commands = {
            "FORWARD 5",
            "LEFT",
            "LOOP 3 FORWARD10",
            "RIGHT"
        };

        System.out.println("🚂 Executing Train Commands:\n");

        for (String cmd : commands) {
            Expression expr = Parser.parse(cmd);
            expr.interpret(context);
        }
    }
}
