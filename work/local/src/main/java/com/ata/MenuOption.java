package com.ata;

public enum MenuOption {
    EXIT(0, "Exit"),
    LIST_PRODUCTS(1, "List Products"),
    BUY_PRODUCT(2, "Buy Product"),
    FIND_PRODUCT(3, "Find Product"),
    SHOW_CART(4, "Show Cart"),
    CHECKOUT(5, "Checkout");
    
    int id;
    String displayName;
    
    /**
     *Constructor class.
     * @param id number
     * @param displayName string
     */
    MenuOption(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }
    /**
     * ID getter.
     * @return id number
     */    
    public int getId() {
        return id;
    }
    
    /**
     * Display Name getter.
     * @return display name
     */     
    public String getDisplayName() {
        return displayName;
    }
 

}
