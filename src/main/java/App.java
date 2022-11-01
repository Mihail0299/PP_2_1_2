import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanFirst = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanThird = (Cat) applicationContext.getBean("cat");
        Cat beanFourth = (Cat) applicationContext.getBean("cat");
        System.out.println(beanFirst == beanSecond);
        System.out.println(beanThird == beanFourth);
    }
}