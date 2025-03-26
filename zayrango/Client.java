package zayrango;
//Class definiton and atributes
    public class Client {

        private String codeClient;
        private String nameClient;
        private String cpfClient;
        private String registrationDatClient;


//Sender
        public Client(String codeClient, String nameClient, String cpfClient, String registrationDatClient) {
            this.codeClient = codeClient;
            this.nameClient = nameClient;
            this.cpfClient = cpfClient;
            this.registrationDatClient = registrationDatClient;
        }
//Data Show message        
    public void showClient() {
        System.out.println("___Data Of Client___");
        System.out.println(codeClient);
        System.out.println(nameClient);
        System.out.println(cpfClient);
        System.out.println(registrationDatClient);
        }

    }