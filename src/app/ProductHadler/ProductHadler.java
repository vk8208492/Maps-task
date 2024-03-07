package app.ProductHadler;

import app.Product.Product;

import java.util.Map;

public class ProductHadler {

    public String getProduct(Map<Integer, Product> map,String strId){
        Integer id = Integer.parseInt(strId);
        if (map.containsKey(id)){
            return "Product: id " + strId + "," + map.get(id).toString();
        } else return "No product!";
    }
}
