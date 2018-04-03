
package mainPackage;

public class TP2_POO1
{

    
    public static void main(String[] args)
    {
        System.out.println("Question 1 =====================");
        
        String phrase = "En avril ne te decouvre pas d un fil en mai fais ce"
                + "qu il te plait";
        
        LesChainesDesCaracteres lcdc = new LesChainesDesCaracteres();
        
        System.out.println("Le mot plus commun est: " + lcdc.motMode(phrase));
        
        System.out.println("Question 2 =====================");
        
        int [][] matrice = {{2,7,6},{9,5,1},{4,3,8}};
        
        LesTabMult ltm = new LesTabMult(matrice);
        
        System.out.println(ltm.estMagique());
    }
    
}
