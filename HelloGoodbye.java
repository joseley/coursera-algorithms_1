public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No names provided, you have to provide at least one name.");
            return;
        }

        String name1, name2, msgHello, msgBye;

        name1 = (args.length >= 1) ? args[0] : "";
        name2 = (args.length >= 2) ? args[1] : "";
        
        msgHello = "";
        msgBye = "";
        
        if (!name1.isEmpty()) {
            msgHello = "Hello " + name1;
            msgBye = "Goodbye " + name1;
        }

        if (!name2.isEmpty()) {
            if (msgHello.isEmpty()) {
                msgHello = "Hello " + name2;
            } else {
                msgHello += " and " + name2;
            }

            if (msgBye.isEmpty()) {
                msgBye = "Goodbye " + name2;
            } else {
                msgBye += " and " + name2;
            }
        }

        msgHello += ".";
        msgBye += ".";

        // Prints "Hello, World" to the terminal window.
        System.out.println(msgHello);
        System.out.println(msgBye);
        
    }
}
