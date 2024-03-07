package app;

import app.OutPut.OutPutProduct;
import app.Product.Product;
import app.ProductHadler.ProductHadler;
import app.ProductProvider.ProductProvider;

import java.util.Map;

public class Main {

    public static void main(String[] args){

        ProductProvider productProvider = new ProductProvider();
        ProductHadler productHadler = new ProductHadler();
        OutPutProduct outPut = new OutPutProduct();

        Map<Integer, Product> data = productProvider.getData();
        String prData = productHadler.getProduct(data, productProvider.getId());

        outPut.getOutput(data);
        outPut.getOutput(prData);


    }
}
