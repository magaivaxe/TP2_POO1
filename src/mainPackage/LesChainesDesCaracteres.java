/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;


/**
 *
 * @author sire_marcos
 */
public class LesChainesDesCaracteres
{

    public LesChainesDesCaracteres()
    {
    }
    
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
