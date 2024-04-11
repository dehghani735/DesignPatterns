package org.example.factory;

import org.example.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

//public class ProductsController extends Controller {
public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(product)
        render("products.html", context);
    }
}
