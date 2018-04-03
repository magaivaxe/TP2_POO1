
package mainPackage;


/**
 * Class used for calculate a string more frequent
 * @author sire_marcos
 */
public class LesChainesDesCaracteres
{

    public LesChainesDesCaracteres()
    {
    }
    /**
     * Method that split a phrase and it compare within to count the word more 
     * frequent
     * @param phrase
     * @return a word more frequent into a phrase.
     */
    public String motMode(String phrase)
    {
        int count = 0, plusGrand = 0;
        String stringToReturn = "";
        String [] phraseSplit = phrase.split(" ");
        
        for (String str1 : phraseSplit)
        {
            for (String str2 : phraseSplit)
            {
                if (str1.compareTo(str2) == 0)
                {
                    count += 1;
                }
                if (count > plusGrand)
                {
                plusGrand = count;
                stringToReturn = str2;
                }
            }
            count = 0;
        }
        return stringToReturn;
    }
   
}
