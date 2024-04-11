package org.example.builder;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

//        var builder = new PdfDocumentBuilder();
//        presentation.export(builder);
//        PdfDocument pdf = builder.getPdfDocument();

        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();
    }
}
