package collections;


import java.util.HashMap;
import java.util.Map;

public class CollectionsInJava {
	

	public static void main(String[] args) {
		
		
		// Step 1: Create maps for each product

		Map<String, String> product1 = new HashMap<String, String>();
		product1.put("Product ID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "1250K Pounds");
        product1.put("Stock Quantity", "Five");
        product1.put("Supplier", "TechCom Solutions");
        product1.put("Warranty", "3 years");
        product1.put("Rating", "5 Stars");
        product1.put("Manufacturing Date", "Jan 2023");
        product1.put("Expiry Date", "");
        
        Map<String, String> product2 = new HashMap<String, String>();
        product2.put("Product ID", "P002");
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "150K Pounds");
        product2.put("Stock Quantity", "Two");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4 Stars");
        product2.put("Manufacturing Date", "Sep 2024");
        product2.put("Expiry Date", "");
        
        Map<String, String> product3 = new HashMap<String, String>();
        product3.put("Product ID", "P003");
        product3.put("Name", "White Board");
        product3.put("Category", "Stationery");
        product3.put("Price", "40K Pounds");
        product3.put("Stock Quantity", "Ten");
        product3.put("Supplier", "Stationers Ltd");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.5 Stars");
        product3.put("Manufacturing Date", "Dec 2023");
        product3.put("Expiry Date", "");
        
        
        // Step 2: Put products into one big map using Product ID as the key
        Map<String, Map<String, String>> allProducts = new HashMap<>();
        allProducts.put(product1.get("Product ID"), product1);
        allProducts.put(product2.get("Product ID"), product2);
        allProducts.put(product3.get("Product ID"), product3);
        
     // Step 3: Print details of products supplied by "Office Depot"
        System.out.println("List of products from Office Depot:");
        
        for (String productId : allProducts.keySet()) {
            Map<String, String> product = allProducts.get(productId);
            String supplierName = product.get("Supplier");
            if (supplierName.equals("Office Depot")) {
                // Print all product details
                for (String key : product.keySet()) {
                    System.out.println(key + ": " + product.get(key));
                }
                System.out.println(); // Blank line after each product
        
		
            	}

        	}
		}
}