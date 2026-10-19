package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

//    private int id;
//    private String name;
//    private double price;

    private String downloadURL;
    private double filesize;

    public DigitalProduct(Object id, String name, double price, String downloadURL) {
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public double getFilesize() {
        return filesize;
    }
}
