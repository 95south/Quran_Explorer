public class snode {
        String data;
        bnode[] subArray;
        AyatLL ayatList;
        Node next;

        public snode(String data, bnode[] array, AyatLL list) {
            this.data = data;
            this.ayatList = list;
            this.subArray = array;
        }
    }