/**
 * 
 */
package in.co.rahogata.ioc.annotation.qualifiers.generics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.rahogata.ioc.annotation.qualifiers.generics.IntegerStore;
import in.co.rahogata.ioc.annotation.qualifiers.generics.StoreService;
import in.co.rahogata.ioc.annotation.qualifiers.generics.StringStore;

/**
 * @author shiva
 *
 */
public class GenericsQualifierTest {

    @Test
    void testGenericQulifierAutowiring() {
        try (ClassPathXmlApplicationContext cxt =
            new ClassPathXmlApplicationContext("classpath:generics-qualifier-cxt.xml")) {
            assertNotNull(cxt.getBean(StoreService.class));
            StoreService storeService = cxt.getBean(StoreService.class);
            assertNotNull(storeService.getI());
            assertNotNull(storeService.getS());
            assertEquals(storeService.getI().getClass(), IntegerStore.class);
            assertEquals(storeService.getS().getClass(), StringStore.class);
            assertSame(storeService.getI(), cxt.getBean(IntegerStore.class));
            assertSame(storeService.getS(), cxt.getBean(StringStore.class));
        }
    }
}
