import java.util.*;
public class forDelivery{
    Lazada clicked;
    LinkedList<Lazada> cart = new LinkedList<>();
    LinkedList<String> orderList = new LinkedList<>();
    
    forDelivery(){
        
    }
    
    public void clicked(Lazada x, String y){
        cart.add(x);
        orderList.add(y);
        clicked = x;
        System.out.println("The user has used " + x + " to order " + y);
    }
    
    public void itemList(){
         clicked = null;
         System.out.println("Full ordered item list: ");
        for(int i = 0; i < cart.size(); i++){
            System.out.println(orderList.get(i));
        }
    }
    
}
