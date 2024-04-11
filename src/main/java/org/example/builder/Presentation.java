package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    // we have a single place where we have implemented the exporting logic. if we want to change this logic in the future
    // this is the only place we have to modify
    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
        for (Slide slide : slides)
            builder.addSlide(slide);
    }
}
