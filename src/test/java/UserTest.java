import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.woohsi.bean.Address;
import top.woohsi.bean.User;
import top.woohsi.UserConfig;

import java.time.LocalDate;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = UserConfig.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class UserTest {

    @Autowired
    private User user;

    @Autowired
    private Address address;

    @Autowired
    private LocalDate localDate;

    @Test
    public void userShouldNotBeNUll() {
        assertNotNull(user);
    }

    @Test
    public void testUser() {
        System.out.print(user);
    }

    @Test
    public void testAddress() {
        System.out.println(address);
    }

    @Test
    public void testStringArray() {
        String[] strings = new String[]{"1", "2"};
        System.out.println(strings);

        Properties properties = System.getProperties();
        System.out.println(properties);
    }

    @Test
    public void testUserBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        User user = context.getBean("user2", User.class);
    }

    @Test
    public void testLoalDate() {
        System.out.println(localDate);
    }
}
