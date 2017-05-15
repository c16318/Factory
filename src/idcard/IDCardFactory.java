
package idcard;
import framework.Factory;

import framework.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c16318
 */
public class IDCardFactory extends Factory{
     public ArrayList<String> owners = new ArrayList();
     private int number = 1;
     
     protected Product createProduct(String owner){
         return new IDCard(owner,number++);
     }
     
     protected void  registerProduct(Product product){
         owners.add(((IDCard)product).getOwner());
     }
     
     public List getOwners(){
         return owners;
     }
    
}
