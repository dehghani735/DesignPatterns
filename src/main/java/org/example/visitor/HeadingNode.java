package org.example.visitor;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-heading");
    }
}
