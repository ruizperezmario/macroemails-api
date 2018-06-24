package app;

/*
public class Main{
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
*/
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

    	// Start embedded server at this port
        port(5000);

        get("/hello", (req, res) -> "Hello World. I don't believe!!!");
    }
}
