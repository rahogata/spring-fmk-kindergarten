/**
 * 
 */
package in.co.rahogata.dataaccess;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shiva
 *
 */
public class DataSourceCloseTest {

    @Test
    public void closeDataSource() {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        assertNotNull(appContext.getBean("dummyDS"));
        appContext.close();
    }
}
