import java.util.Scanner;
import java.util.*;
// import javax.swing.text.StyledEditorKit.BoldAction;

class bill{
    private int price;
    private Boolean veg;
    private int toppings_price =100;
    private int cheeseprice = 100;
    private int takeaway = 20;

    public bill(Boolean veg){
        this.veg = veg;
        if(this.veg == true){
            this.price = 300;
        }else{
            this.price = 400;
        } 

    }

    // int getprice(){
    //     return this.price;
    // }

    public void addextratoppings(){

        this.price += toppings_price;
    }
    public void addextracheese(){
        this.price += cheeseprice;
    }
    public void addextratakeaway(){
        this.price +=takeaway;
    }

    int getbill(){
        return this.price;
    }

    
    


}
public class pizza{
    public static void main(String[] args){
        System.out.println("                                         ****WELCOME TO THE VEGGIE VILLA PIZZA SHOP****                                     ");
        System.out.println("Base pricing for veg is 300 -");
        System.out.println("Base pricing for non veg is 400 -");
        System.out.println("extratopping charge is 100");
        System.out.println("extracheese charge is 100");
        System.out.println("takeaway charge is 20");
        

        System.out.println("*choose 0 for vegpizza and 1 for nonveg");
        // System.out.println("****Welcome to our pizza shop****\n choose 0 for vegpizza and 1 for nonveg");
        Scanner sc = new Scanner(System.in);
        boolean veggie= true;
        int a = sc.nextInt();
        if(a == 0){
            veggie = true;
        }
        else if (a == 1){
            veggie = false;
        }
        
        else{
            System.out.println("invalid details");
        }
        System.out.println("Do you want extra cheese press y for extraxheese else n");
        char extracheesereq = sc.next().charAt(0);
        System.out.println("Do you want extra topping press y for extratoppings else n");
        char extratoppingsreq = sc.next().charAt(0);
        System.out.println("Do you want to takeway or dine press y for takewaay else n");
        char extratakewaayreq = sc.next().charAt(0);

        
        // boolean veg = 
        bill mybill = new bill(veggie);
        if(extracheesereq == 'y'){
            mybill.addextracheese();;
        }
        if(extratoppingsreq== 'y'){
            mybill.addextratoppings();
        }
        if(extratakewaayreq == 'y'){
            mybill.addextratakeaway();
        }
        
        System.out.println("the value of the pizza is :" + mybill.getbill()); 
    
    
    }
}