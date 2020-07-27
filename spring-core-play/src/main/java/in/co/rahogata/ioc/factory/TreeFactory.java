/**
 * 
 */
package in.co.rahogata.ioc.factory;

import in.co.rahogata.ioc.beans.Root;
import in.co.rahogata.ioc.beans.Tree;

/**
 * @author shiva
 *
 */
public class TreeFactory {

    public static Tree createInstance(String name, Root root) {
        return new Tree(name, root);
    }
}
