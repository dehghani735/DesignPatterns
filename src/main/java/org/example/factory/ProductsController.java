package org.example.factory;

import org.example.factory.matcha.Controller;
import org.example.factory.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(product)
        render("products.html", context, new MatchaViewEngine());
    }
}
