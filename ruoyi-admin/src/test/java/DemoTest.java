import com.ruoyi.RuoYiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RuoYiApplication.class,webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class DemoTest {

    @Test
    public void testHello(){
        System.out.println("Hello");
    }
    @Test
    public void testHello2(){
        System.out.println("Hello2");
    }
}
