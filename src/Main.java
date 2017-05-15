import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        
        Product card1 = factory.create("akiyama");
        Product card2 = factory.create("tanaka");
        Product card3 = factory.create("honda");
        
        
        System.out.println();
        card1.use();
        card2.use();
    }
    
}
