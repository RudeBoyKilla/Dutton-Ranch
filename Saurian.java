import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Saurian
{
	private String english;
    private String saurian;
    private boolean isEnglish;

    public Saurian()                            //default constructor
    {
        english = "you speaking spanish?";
        saurian = "no hablo baxter";
    }
    public Saurian(String phrase, boolean english)  //overloaded constructor
    {
        if (english = false){
            this.saurian = phrase;
            isEnglish = false;
        }else
            this.english = phrase;
            isEnglish = true;
    }
    public String getEnglish()                  //getter for english string
    {
        return english;
    }
    public String getSaurian()                  //getter for saurian string
    {
        return saurian;
    }
    public void setEnglish(String phrase)
    {
        this.english = phrase;
    }
    public void setSaurian(String phrase)
    {
        this.saurian = phrase;
    }
    public void transEngToSaur(String englishToSaur)
    {

    }
    public void translateSaurToEng(String saurianToEnglish)
    {

    }
	// constants used for translating
	// note M = M and m = m so M and m are not needed
	public static final char[] ENGLISHARR = {' ','A','B','C','D','E','F','G','H','I','J','K','L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static final char[] SAURIANARR = {' ','U','R','S','T','O','V','W','X','A','Z','B','C','D','E','F','G','H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x','a','z','b','c','d','e','f','g','h','j','k','i','l','n','p','o','q'};
	public static final int ARRLENGTH = ENGLISHARR.length;	// should be the same length for ENGLISHARR and SAURIANARR
  public static void main(String[] args) {
            String test = " hello baxter Im Mexican";
            HashMap<Character, Character> translateMap = new HashMap<>();
            ArrayList<String> foreignLanguage = new ArrayList<>();
            ArrayList<String> englishLanguage = new ArrayList<>();
            //String englishList = String.valueOf(ENGLISHARR);
            //String saurianList = String.valueOf(SAURIANARR);

            for (int i = 0; i <= ARRLENGTH; i++){
                translateMap.put(ENGLISHARR[i], SAURIANARR[i]);
            }
            String[] words = test.split(" ");
            String translatedSentence = "";
            System.out.println(words);
          for (String w : words){
                String wordToAdd = translateMap.get(w);
                translatedSentence = translatedSentence + " " + wordToAdd;
                System.out.println(translatedSentence);
            }


/*public static void main(String[] args) {
            String testTranslation = "Fuck this shit boiiiiii";
            char[] testTranslationToArray = testTranslation.toCharArray();
            String englisharrFromArray = new String(ENGLISHARR);
            String saurianarrFromArray = new String(SAURIANARR);
            int count = 0;
            StringBuilder sb = new StringBuilder();
            System.out.println(testTranslationToArray);
            for (int i = 0; i < testTranslation.length(); i++){
                char untranslatedChar = testTranslationToArray[i];
                //boolean areWeThereYet = false;
                for (int j = 0; j < ARRLENGTH; j++){
                    if (untranslatedChar == englisharrFromArray.charAt(j)){
                        sb.append(saurianarrFromArray.charAt(j));
                        //areWeThereYet = true;
                    }


                    System.out.println(sb);
            
            
                 
            }*/
