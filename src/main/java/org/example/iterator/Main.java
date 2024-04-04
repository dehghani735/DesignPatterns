package org.example.iterator;

public class Main {
    public static void main(String[] args) {
        var hisory = new BrowseHistory();
        hisory.push("a");
        hisory.push("b");
        hisory.push("c");

//        for (var i = 0; i <hisory.getUrls().size(); i++ ) {
//            var url = hisory.getUrls().get(i);
//            System.out.println(url);
//        }

        Iterator iterator = hisory.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
