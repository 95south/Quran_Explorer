public class AyatLL {

    Node head = null;
    Node current = null;
    
    public numberSearch NS;
    public AyatLL(){
    }
    
    public AyatLL(numberSearch ns) {
        this.NS = ns;
    }

    public void Insert(int surah, int verse) {
        Node newNode = new Node(surah, verse);
        if (head == null){
        head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public String Find(){
        NS = new numberSearch();
        String ayat = "";
        current = head;
        while(current != null){
            ayat = ayat + NS.FindingSurahAndVerseInArabic(current.surah, current.verse)+ "\n";
            current = current.next;
        }
        return ayat;
    }
    
    public String UrduFind(){
        NS = new numberSearch();
        String ayat = "";
        current = head;
        while(current != null){
            ayat = ayat+NS.FindingSurahAndVerseInUrdu(current.surah, current.verse)+ "\n";
            current = current.next;
        }
        return ayat;
    }
    
    public String EnglishFind(){
        NS = new numberSearch();
        String ayat = "";
        current = head;
        while(current != null){
            ayat = ayat+NS.FindingSurahAndVerseInEnglish(current.surah, current.verse)+ "\n";
            current = current.next;
        }
        return ayat;
    }
}