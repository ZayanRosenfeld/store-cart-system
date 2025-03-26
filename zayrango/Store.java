package zayrango;

public class Store {
    private String codeStore;
    private String nameStore;
    private String cnpjStore;
    private String brandName;
    private String addressStore;

    // Constructor
    public Store(String codeStore, String nameStore, String cnpjStore, String brandName, String addressStore) {
        this.codeStore = codeStore;
        this.nameStore = nameStore;
        this.cnpjStore = cnpjStore;
        this.brandName = brandName;
        this.addressStore = addressStore;
    }

    // Method to display store information
    public void showStore() {
        System.out.println("___ Data Of Store ___");
        System.out.println("Code: " + codeStore);
        System.out.println("Name: " + nameStore);
        System.out.println("CNPJ: " + cnpjStore);
        System.out.println("Brand: " + brandName);
        System.out.println("Address: " + addressStore);
    }
}
