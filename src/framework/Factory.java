
package framework;

/**
 *
 * @author c16318
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    
    protected abstract Product createProduct(String Owener);
    
    protected abstract void registerProduct(Product product);
    
}
