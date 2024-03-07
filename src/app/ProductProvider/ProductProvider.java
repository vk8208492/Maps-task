package app.ProductProvider;

import app.Product.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductProvider {

    public String getId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        return scanner.nextLine().trim();
    }

    public Map<Integer, Product> getData(){
        Map<Integer, Product> map = new HashMap<>();
        map.put(151, new Product("onion","5","15"));
        map.put(152, new Product("banana","4","49"));
        map.put(153, new Product("lemon","2","45"));
        map.put(154, new Product("carrot","2","16"));
        map.put(155, new Product("orange","2","45"));
        map.put(156, new Product("sour cream","1","19"));
        map.put(157, new Product("apple", "8","22"));
        return map;
    }
}
