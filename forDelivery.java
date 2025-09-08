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
         System.out.println("------------------------------------");
         clicked = null;
         System.out.println("Full ordered item list: ");
         System.out.println("------------------------------------");
        for(int i = 0; i < cart.size(); i++){
            System.out.println(orderList.get(i));
             System.out.println("------------------------------------");
        }
        System.out.println("Cart status: " + clicked + " the order has been fulfilled!");
    }
    
}
