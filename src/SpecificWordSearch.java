import java.io.*;

public class SpecificWordSearch {
    sortedWordSearchNode[] store;
    WordHashFunction key;

    public SpecificWordSearch() {
        this.store = new sortedWordSearchNode[26];
        for (int More1 = 0; More1 < store.length; More1++)
            store[More1] = new sortedWordSearchNode();
    }

    public static BufferedReader readFile(String path) throws IOException {
        File file = new File(path);
        InputStream input = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        return br;
    }

    public void putWordsInArray() {
        try {
            BufferedReader readEnglishFile = readFile("src/database/English/english.txt");
            String sen = readEnglishFile.readLine();
            while (sen != null) {
                int firstOccurrenceOf = sen.indexOf('|');
                String numberOfSurah = sen.substring(0, firstOccurrenceOf);
                sen = sen.substring(firstOccurrenceOf + 1);
                int occurrenceOf = sen.indexOf('|');
                String numberOfVerse = sen.substring(0, occurrenceOf);
                sen = sen.substring(occurrenceOf + 1);
                String[] brokenForm = arrayOfWord(sen);
                //------------------------------------------------------------------------------------------------------
                key = new WordHashFunction();
                for (String string : brokenForm) {
                    if (string.toCharArray().length > 2) {
                        String newBrokenForm = string.toLowerCase();
                        StringBuilder newBrokenFormTwo = new StringBuilder();
                        char[] ofBorkenForm = newBrokenForm.toCharArray();
                        for (char c : ofBorkenForm) {
                            if (c >= 'a' && c <= 'z')
                                newBrokenFormTwo.append(c);
                        }
                        if (newBrokenForm.charAt(0) >= 'a' && newBrokenForm.charAt(0) <= 'z') {
                            int placementPosition = newBrokenFormTwo.charAt(0) - 97;
                            key.insertWordInArray(store[placementPosition], newBrokenFormTwo.toString(), store[placementPosition].wordsStartingWithSameAlphabet.length, numberOfSurah, numberOfVerse);
                        }
                    }
                }
                sen = readEnglishFile.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] arrayOfWord(String line) {
        String[] wordBrokenDown = line.split(" ");
        return wordBrokenDown;
    }

    public long QuadraticProbingForRehashing(long key, int a, int len) {
        long value = key+a*a;
        return value % len;
    }
    
    public long scoreCalculation(String string) {
        return key.wordHashCalculator(string);
    }
    
    public WordNode findingAndDisplayingWord(String string) {
        string = string.toLowerCase();
        int firstLetter = string.charAt(0) - 97;
        int postionInsideArray = 0;
        long score = scoreCalculation(string);
        WordNode findingWordLocation = null;

        for (int start = 0; start < store[firstLetter].hash.length; start++) {
            if (store[firstLetter].hash[start] != 0) {
                postionInsideArray = (int) score % (store[firstLetter].hash[start]);
                if (postionInsideArray < 0)
                    postionInsideArray = postionInsideArray * -1;
                if (store[firstLetter].wordsStartingWithSameAlphabet[postionInsideArray] != null)
                    if (store[firstLetter].wordsStartingWithSameAlphabet[postionInsideArray].particularWord.equals(string))
                        break;
                    else {
                        int rehashCount = 1;
                        int loopTimeRunning = 0;
                        while (loopTimeRunning <= 200) {
                            postionInsideArray = (int) QuadraticProbingForRehashing(score, rehashCount, store[firstLetter].hash[start]);
                            if (postionInsideArray < 0)
                                postionInsideArray = -1 * postionInsideArray;
                            if (postionInsideArray < store[firstLetter].wordsStartingWithSameAlphabet.length && store[firstLetter].wordsStartingWithSameAlphabet[postionInsideArray] != null)
                                if (store[firstLetter].wordsStartingWithSameAlphabet[postionInsideArray].particularWord.equals(string))
                                    break;
                            rehashCount++;
                            loopTimeRunning++;
                        }
                    }
            }
        }
        findingWordLocation = store[firstLetter].wordsStartingWithSameAlphabet[postionInsideArray];
        
        if (findingWordLocation != null) {
            return findingWordLocation;
        }
        else {
            for (int forceSearch = 0; forceSearch < store[firstLetter].wordsStartingWithSameAlphabet.length; forceSearch++) {
                if (store[firstLetter].wordsStartingWithSameAlphabet[forceSearch] != null)
                    if (store[firstLetter].wordsStartingWithSameAlphabet[forceSearch].particularWord.equals(string)) {
                        findingWordLocation = store[firstLetter].wordsStartingWithSameAlphabet[forceSearch];
                        return findingWordLocation;
                    }
            }
        }
        return null;
    }

    public String findForEnglish(WordNode GUI) {
        return GUI.ayatLocation.EnglishFind();
    }
    
    public String englishWordSearch(String alphabet) {
        WordNode GUI = findingAndDisplayingWord(alphabet);
            if(GUI != null)
            return findForEnglish(GUI);            
            return null;
    }

    public String Find(WordNode GUI) {
        return GUI.ayatLocation.Find();
    }
    
    public String arabicWordSearch(String alphabet) {
        WordNode GUI = findingAndDisplayingWord(alphabet);   
            return Find(GUI);
    }
    
    public String findForUrdu(WordNode GUI) {
        return GUI.ayatLocation.UrduFind();
    }
    
    public String urduWordSearch(String alphabet) {
        WordNode GUI = findingAndDisplayingWord(alphabet);
            return findForUrdu(GUI); 
    }
}




