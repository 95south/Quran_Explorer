import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchByTopic {

    int x = 0;

    snode[] array = new snode[20];
    
    public SearchByTopic(numberSearch quran) {
        File text = new File("src/database/topics.txt");
        numberSearch u = quran;
        Scanner topic = null;
        try {
            topic = new Scanner(text);
        } 
        catch (FileNotFoundException e) {
        }

        String line;

        //Reading each line of the file using Scanner class
        int i = 0;

        while (topic.hasNextLine()) {
            System.out.println();
            array[i] = new snode("", null, null);

            line = topic.nextLine();
            array[i].data = line.substring(3);
        
            line = topic.nextLine();

            int a = 3;
            char c;
            array[i].ayatList = new AyatLL(u);

            while (a < line.length()) {
                String string = "";
                String stringg = "";

                while (a != line.length()) {
                    if (line.charAt(a) != ':') {
                        c = line.charAt(a);
                        string = string + c;

                        a++;
                    } else
                        break;
                }
                a++;

                while (a != line.length()) {
                    if (line.charAt(a) != ',') {
                        c = line.charAt(a);
                        stringg = stringg + c;
                        a++;
                    } else
                        break;
                }
                a++;
                a++;

                array[i].ayatList.Insert((Integer.parseInt(string)), Integer.parseInt(stringg));
            }

            line = topic.nextLine();
            int size = 0;
            size = (Integer.parseInt(line.substring(3)));
            line = topic.nextLine();

            if (size > 0) {
                array[i].subArray = new bnode[size];
                int j = 0;

                line = topic.nextLine();
             
                while (line.compareTo("next") != 0) {
                    array[i].subArray[j] = new bnode(null, null);

                    array[i].subArray[j].sData = line.substring(4);

                    int y = 5;
                    char ch;
                    array[i].subArray[j].sAyatList = new AyatLL(u);
                    line = topic.nextLine();

                    while (y < line.length()) {
                        String str = "";
                        String strr = "";

                        while (y != line.length()) {

                            if (line.charAt(y) != ':') {
                                ch = line.charAt(y);
                                str = str + ch;
                                y++;
                            } else
                                break;
                        }
                        y++;

                        while (y != line.length()) {
                            if (line.charAt(y) != ',') {
                                ch = line.charAt(y);
                                strr = strr + ch;
                                y++;
                            } else
                                break;
                        }
                        y++;
                        y++;

                        array[i].subArray[j].sAyatList.Insert((Integer.parseInt(str)), Integer.parseInt(strr));
                    }
                    j++;

                    line = topic.nextLine();
                }
            }
            line = topic.nextLine();
            i++;
        }
    }


    public String[] sListOfTopics(int p) {

        p= p-1;

        String[] topicList = new String[array[p].subArray.length];
        for (int j = 0; j < array[p].subArray.length; j++) {
            topicList[j] = j+1 + "  : " + array[p].subArray[j].sData;
        }
           return topicList;
    }
    
     public String urduAyatTopic(int p) {
        p= p-1;
        x = p;
        return array[p].ayatList.UrduFind();
    }

    public String englishAyatTopic(int p) {
        p= p-1;
        x = p;
        return array[p].ayatList.EnglishFind();
    }
    
    public String ayatTopic(int p) {
        p= p-1;
        x = p;
        return array[p].ayatList.Find();
    }

    public String urdTopicAyat(int s) {
        return array[x].subArray[s-1].sAyatList.UrduFind();
    }
    
    public String engTopicAyat(int s) {
        return array[x].subArray[s-1].sAyatList.EnglishFind();
    }
    
    public String sAyatTopic(int s) {
        return array[x].subArray[s-1].sAyatList.Find();
    }
}





