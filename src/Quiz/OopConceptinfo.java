package Quiz;

public class OopConceptinfo {

        public static void main(String[] args) {

            OopConcept info = new OopConcept();
            info.printInfo();

            info.accountHolderName = "Foysol Bhuiyan";
            info.accountNumber = "35688";
            info.amount = 40.0;
            info.printInfo();

            OopConcept bob = new OopConcept();

            bob.accountHolderName = "Bob man";
          bob.accountNumber = " CBI";
          bob.amount = 50.0;
            bob.printInfo();

        }
    }
