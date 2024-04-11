package org.example.factory.sharp;

import org.example.factory.matcha.Controller;
import org.example.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
