/**
 * 
 */
package in.co.rahogata.ioc.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiva
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root {
    private String type;
    private int lifeTime;
}
