public class Main
{
	public static void main(String[] args) {
	    forDelivery customer = new forDelivery();
	  
	  Lazada cellphone = new Lazada();
	  Lazada laptop = new Lazada();
	  Lazada notebook = new Lazada();
	  
	  customer.clicked(cellphone, "Cherry Mobile");
	   customer.clicked(laptop, "Wuthering Laptop");
	   customer.clicked(notebook, "Notebook");
	   
	   customer.itemList();
	}
}
