package app;

import app.OutPut.OutPut;
import app.Product.Product;
import app.ProductHadler.ProductHadler;
import app.ProductProvider.ProductProvider;

import java.util.Map;

public class MainProgram {

    public static void main(String[] args){

        ProductProvider productProvider = new ProductProvider();
        ProductHadler productHadler = new ProductHadler();
        OutPut outPut = new OutPut();

        Map<Integer, Product> data = productProvider.getData();
        String prData = productHadler.getProduct(data, productProvider.getId());

        outPut.getOutput(data);
        outPut.getOutput(prData);


    }
}
