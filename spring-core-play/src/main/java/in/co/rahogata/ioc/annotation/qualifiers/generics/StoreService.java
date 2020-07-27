/**
 * 
 */
package in.co.rahogata.ioc.annotation.qualifiers.generics;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shiva
 *
 */
public class StoreService {

    private Store<String> s;

    private Store<Integer> i;

    /**
     * @param s
     * @param i
     */
    @Autowired
    public StoreService(Store<String> s, Store<Integer> i) {
        this.s = s;
        this.i = i;
    }

    /**
     * @return the s
     */
    public Store<String> getS() {
        return s;
    }

    /**
     * @return the i
     */
    public Store<Integer> getI() {
        return i;
    }
}
