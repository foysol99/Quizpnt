package Quiz;

public class ArrayList {

    import java.util.Iterator;



        public static class Arraylist {

            /*
             * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
             * Use For Each loop and while loop with Iterator to retrieve data.
             *
             */

            public static void main(String[] args) {

                ArrayList arrayList = new ArrayList();
                arrayList.add(2, "Steve");
                arrayList.add(2, "John");
                arrayList.add(2, "Bonny");
                arrayList.add(2, "Brett");


                System.out.println("Origianl ArrayList:");


                //Add Steve at 3rd positon
                arrayList.add(2, "Steve");

                System.out.println("After adding :" + arrayList);

                System.out.println("**************");

                //Remove Steve

                arrayList.remove("Steve");
                arrayList.remove(  "sueerr");
                System.out.println("After removing:" + arrayList);

                System.out.println("***************");


                //for loop
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i) + " ");

                }

                System.out.println(" ");





            }


        }




        private String get ( int i){
            return null;
        }

        private float size () {
            return 0;
        }

        private void remove (String steve){
        }

        private void add ( int i, String steve){
        }
    }
}
