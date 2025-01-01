import java.io.*;

public class numberSearch {
public String[][] arabic;
public String[][] english;
public String[][] urdu;
public int[] ayats={7, 286, 200, 176, 120, 165, 206, 75, 129, 109, 123,
        111, 43, 52, 99, 128, 111, 110, 98, 135, 112, 78, 118, 64, 77, 227,
        93, 88, 69, 60, 34, 30, 73, 54, 45, 83, 182, 88, 75, 85, 54, 53, 89, 59,
        37, 35, 38, 29, 18, 45, 60, 49, 62, 55, 78, 96, 29, 22, 24, 13, 14, 11,
        11, 18, 12, 12, 30, 52, 52, 44, 28, 28, 20, 56, 40, 31, 50, 40, 46, 42,
        29, 19, 36, 25, 22, 17, 19, 26, 30, 20, 15, 21, 11, 8, 8, 19, 5, 8, 8,
        11, 11, 8, 3, 9, 5, 4, 7, 3, 6, 3, 5, 4, 5, 6};

    public static BufferedReader readFile(String path, String ch) throws IOException {
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, ch));
        return br;
    }
    
    public static BufferedReader readFile(String path) throws IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        return br;
    }

    public numberSearch(){
        arabic=new String[114][];
        english=new String[114][];
        urdu=new String[114][];
    
    try {
        BufferedReader Arabic = readFile("src/database/Arabic/arabic.txt", "utf-8");
        BufferedReader English = readFile("src/database/English/english.txt");
        BufferedReader Urdu = readFile("src/database/Urdu/urdu.txt", "utf-8");
        String arabicLine;
        String englishLine;
        String urduLine;
        
        for(int i=0;i<ayats.length;i++){
            arabic[i]=new String[ayats[i]];
            english[i]=new String[ayats[i]];
            urdu[i]=new String[ayats[i]];
            
            for(int j=0;j<ayats[i];j++) {
                arabicLine = Arabic.readLine();
                englishLine = English.readLine();
                urduLine = Urdu.readLine();
                StringBuilder ara = new StringBuilder();
                StringBuilder eng = new StringBuilder();
                StringBuilder urd = new StringBuilder();
                ara.append(arabicLine);
                eng.append(englishLine);
                urd.append(urduLine);
                arabic[i][j] = ara.toString();
                english[i][j] = eng.toString();
                urdu[i][j] = urd.toString();
            }
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

    public String FindingSurahAndVerseInUrdu(int x, int y){
        return urdu[x-1][y-1];
    }
    
    public String FindingSurahAndVerseInEnglish(int x, int y){
        return english[x-1][y-1];
    }
    
    public String FindingSurahAndVerseInArabic(int x, int y){
        return arabic[x-1][y-1];
    }
   
    public String FindBySurahUrdu(int urd){
        String Urdu="";
        for(int i=0;i<ayats[urd-1]; i++){
            Urdu=Urdu+urdu[urd-1][i]+"\n";
        }
        return Urdu;
    }
    
    public String FindBySurahEnglish(int eng){
        String English="";
        for(int i=0;i<ayats[eng-1]; i++){
            English=English+english[eng-1][i]+"\n";
        }
        return English;
    }
    
    public String FindBySurahArabic(int ara){
        String Arabic="";
        for(int i=0;i<ayats[ara-1]; i++){
            Arabic=Arabic+arabic[ara-1][i]+"\n";
        }
        return Arabic;
    }
}
