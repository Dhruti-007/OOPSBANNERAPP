import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Rendering function
    public static void renderWord(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "   ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]  
                    "  ***
                    " **  *
                    "**    
                    "**    
                    "**    
                    " **  *
                    "  ***  "
        });

        patternMap.put('P', new String[]  
                    " ****
                    "**   
                    "**   
                    "**** 
                    "**   
                    "**   
                    "**     "
        });

        patternMap.put('S', new String[]  
                    " ***
                    "**  
                    "**  
                    " ***
                    "    
                    "    
                    " **** "
        });

        // Render any word
        renderWord("OOPS", patternMap);
    }
}