public class sortedWordSearchNode {
    
    public WordNode[] wordsStartingWithSameAlphabet;
    public int[] hash;
    int collisions = 0;
    int cells = 0;
    
    public sortedWordSearchNode() {
        hash = new int[10];
        this.collisions = collisions;
        this.cells = cells;
        wordsStartingWithSameAlphabet = new WordNode[1000];
        for (int i = 0; i < wordsStartingWithSameAlphabet.length; i++) {
            wordsStartingWithSameAlphabet[i] = null;
        }
    }
}
