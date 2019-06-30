package _216_TJMaxx;

import java.util.ArrayList;
import java.util.List;

/**
	 * represents TJMaxx store class.
	 * https://tjmaxx.com/
	 */
	public class TJMaxx {

	    /**
	     * Private lists to hold regular Item objects
	     * and OnSaleItem objects that represent items that sell in TJMaxx
	     */
	    private List<Item> regularItems;
	    private List<OnSaleItem> onSaleItems;

	    /**
	     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
	     * as new ArrayList
	     */
	    public TJMaxx() {
	        //TODO
	        this.regularItems = new ArrayList <>();
	        this.onSaleItems = new ArrayList <>();
	    }

	    /**
	     * adds an item object to regularItems list
	     * @param item
	     */
	    public void addRegularItem(Item item) {
	       this.regularItems.add(item);
	       
	    }

	    /**
	     * adds OnSaleItem object to onSaleItems list
	     * @param item
	     */
	    public void addOnSaleItem(OnSaleItem item) {
	        this.onSaleItems.add(item);
	        
	    }

	    /**
	     * getter for regularItems
	     * @return
	     */
	    
	    
	    public List<Item> getRegularItems() {
	        //TODO change from null 
	        return this.regularItems;
	    }


		/**
	     * getter for onSaleItems
	     * @return
	     */
	    public List<OnSaleItem> getOnSaleItems() {
	         //TODO change from null 
	        return this.onSaleItems;
	    }

	    /**
	     * return count of regularItem object
	     * @return
	     */
	    public int regularItemsCount() {
	         //TODO change from -1 
	        return this.regularItems.size();
	    }

	    /**
	     * returns count of onSaleItems in TJ Maxx
	     * @return
	     */
	    public int onSaleItemsCount() {
	        //TODO change from -1 
	        return this.onSaleItems.size();
	    }

	    /**
	     * returns the name of each item in TJ Maxx starting
	     * from regular item then onSaleItems
	     * @return
	     */
	    public List<String> getAllItemNames() {
	       
	       ArrayList <String> itemList = new ArrayList <>();
	       for (Item each: this.regularItems) {
	    	   itemList.add(each.getName());
	       }
	       
	       for (OnSaleItem each: this.onSaleItems) {
	    	   itemList.add(each.getName());
	       }
	       
	       return itemList;
	    }

	    /**
	     * gets catalog number and returns price for the item
	     * it will search for the item both regularItems and onsaleonSaleItems
	     * @param catalogNumber
	     * @returns 0.0 if product cannot be found with that catalognumber
	     */
	    public double getItemPrice(int catalogNumber)
	    {
	       for (Item each: this.regularItems) {
	    	   if (each.getCatalogNumber()==catalogNumber) {
	    		   return each.getPrice();
	    	   }
	       }
	       
	       for (OnSaleItem each: this.onSaleItems) {
	    	   if (each.getCatalogNumber()==catalogNumber) {
	    		   return each.getPrice();
	    	   }
	       }
	    	
	        return 0.0;
	    }

	    /**
	     * accepts a name then searches
	     * amoung onSaleItems. Once it finds, the method will return
	     * that OnSaleItem object
	     * @param name
	     * @return
	     */
	    public OnSaleItem getOnSaleItem(String name)
	    {
	        for (OnSaleItem each : this.onSaleItems) {
	        	if (each.getName().equals(name)) {
	        		return each;
	        	}
	        }
	        
	        return null;
	    }

	    /**
	     * removes the item with matching catalogNumber
	     * from both regularItems and onSaleItems.
	     * Does nothing if not found
	     * @param catalogNumber
	     */
	    public void removeItem(int catalogNumber) {
	        for (Item each: this.regularItems) {
	        	if (each.getCatalogNumber()==catalogNumber) {
	        		this.regularItems.remove(each);
	        	}
	        }
	        
	        for (OnSaleItem each: this.onSaleItems) {
	        	if (each.getCatalogNumber()==catalogNumber) {
	        		this.regularItems.remove(each);
	        	}
	        }
	    }

	    /**
	     * - it accepts a catalog number and finds that item
	     * among regularItems and onSaleItems
	     * - if it finds the item:
	     *   - decrease the count of the Item by 1
	     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
	     *
	     * @param catalogNumber
	     */
	    public void buyItem(int catalogNumber) {
	       
	    	 for ( int i=0; i<this.regularItems.size();  i++){
		        	if (this.regularItems.get(i).getCatalogNumber()==catalogNumber) {
		        		this.regularItems.get(i).setQuantity(this.regularItems.get(i).getQuantity()-1);
		        		if (this.regularItems.get(i).getQuantity()==0) {
		        			this.regularItems.remove(this.regularItems.get(i));
		        		}
		        	}
		        }
	       
	    	 for ( int i=0; i<this.onSaleItems.size();  i++){
		        	if (this.onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
		        		this.onSaleItems.get(i).setQuantity(this.onSaleItems.get(i).getQuantity()-1);
		        		if (this.onSaleItems.get(i).getQuantity()==0) {
		        			this.onSaleItems.remove(this.onSaleItems.get(i));
		        		}
		        	}
		        }
	       
	       
	    }


}
