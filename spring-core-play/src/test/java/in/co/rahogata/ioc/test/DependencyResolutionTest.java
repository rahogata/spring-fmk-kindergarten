/**
 * 
 */
package in.co.rahogata.ioc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.rahogata.ioc.beans.Root;
import in.co.rahogata.ioc.beans.Tree;

/**
 * @author shiva
 *
 */
public class DependencyResolutionTest {

    @Test
    void testTypeResolution() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")) {
            context.refresh();
            Root setterRoot = context.getBean("tapRoot", Root.class);
            assertNotNull(setterRoot);
            assertEquals(100, setterRoot.getLifeTime());
            Root conRoot = context.getBean("fibrous", Root.class);
            assertNotNull(conRoot);
            assertEquals(200, conRoot.getLifeTime());
            Tree neem = context.getBean("treeFactory", Tree.class);
            assertNotNull(neem);
        }
    }
}
