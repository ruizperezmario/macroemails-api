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
        port(getHerokuAssignedPort());

        get("/hello", (req, res) -> "Hello Heroku World. I don't believe!!!");
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
