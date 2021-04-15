import com.theoldzheng.dao.UserMapper;
import com.theoldzheng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.15 10:55
 */
public class Test01 {
    //    之前我们用到的方式
//    @Test
//    public void test02(){
//        String resource = "mybatis-config.xml";
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = build.openSession();
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> users = mapper.getUserList();
//            System.out.println(users);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
