/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idcard;
import framework.Product;

/**
 *
 * @author c16318
 */
public class IDCard extends Product{
    
    private String owner;
    private int number;
    
    public IDCard(String owner,int number){
        System.out.println(number + "番:"+owner + "のカードを作ります。");
        this.owner = owner;
        this.number = number;
    }
    
    public void use(){
        System.out.println(number + "番:"+owner + "のカードを使います。");
    }
    
    public String getOwner(){
        return owner;
    }
   
    
}
