/**
 * Created by jessicatracy on 8/29/16.
 */
public class EnglishGreeting implements HelloWorld {
    String name = "world";
    public void greet() {
        greetSomeone("world");
    }

    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
    }
}
