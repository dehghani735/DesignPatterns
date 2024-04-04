package org.example.iterator;

public class BrowseHistory {

    private String[] urls = new String[10]; // todo
    private int count;

    public void push(String url) {
//        urls.add(url);
        urls[count] = url;
        count++;
    }

    public String pop() {
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//
//        return lastUrl;

        count--;
        return urls[count];
    }

    // we don't need this. because we don't want to expose it to others
//    public List<String> getUrls() {
//        return urls;
//    }

    public Iterator createIterator() {
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator<String> {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size()); // I have access to urls and that is the reason I defined ListIterator inside BrowseHistory class
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
