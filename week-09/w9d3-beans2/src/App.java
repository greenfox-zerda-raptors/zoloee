import com.com.greenfoxacademy.java.lesson.beans.HelloWorld;
import com.com.greenfoxacademy.java.lesson.beans.HelloWorldConfig;
import com.com.greenfoxacademy.java.lesson.beans.WithFries;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zoloe on 2016. 12. 21..
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        WithFries withFries = new WithFries();
        System.out.println(withFries.toString());
        withFries.toggleFlSalted();
        System.out.printf("Just toggled withFries and now they are '%s'.", withFries.toString());

    }
}