
package mainPackage;

public class TP2_POO1
{

    
    public static void main(String[] args)
    {
        String phrase = "En avril ne te decouvre pas d un fil en mai fais ce"
                + "qu il te plait";
        
        LesChainesDesCaracteres lcdc = new LesChainesDesCaracteres();
        
        System.out.println("Le mot plus commun est: " + lcdc.motMode(phrase));
    }
    
}
