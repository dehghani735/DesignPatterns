package org.example.decorator;

public class Main {
    public static void main(String[] args) {
//        var cloudStream = new CloudStream();
//        cloudStream.write("Here's some data");

        storeCreditCard(new CloudStream());
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
        // we are wrapping or decorating this cloud stream with an encrypted cloud stream
    }

    // this method is talking to an interface.
    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
