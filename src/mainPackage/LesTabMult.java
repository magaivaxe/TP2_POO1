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
public class LesTabMult
{
    private int matrice [][];
    private int ordre, n2, sommeMag;
    
    public LesTabMult(int [][] matrice)
    {
        this.matrice = matrice;
        this.ordre = matrice.length;
        this.n2 = ordre * ordre;
        this.sommeMag = ordre * (ordre * ordre + 1) / 2;
    }
    
    public boolean estMagique()
    {
        return (repetition() && someMagique());
    }
    
    private boolean repetition()
    {
        int count = 0;
        
        for (int i = 0; i < ordre; i++)
        {
            for (int j = 0; j < matrice[i].length; j++)
            {
                for (int n = 1; n < n2; n++)
                {
                    if (matrice[i][j] == n)
                    {
                        count += 1;
                    }
                }
            }
        }
        return count != n2;
    }
    
    private boolean someMagique()
    {
        int sommeRange = 0, sommeColonne = 0, sommeDiagP = 0, sommeDiagS = 0;
        //boucle pour check la somme des rangées
        for (int i = 0; i < ordre; i++)
        {
            for (int j = 0; j < matrice[i].length; j++)
            {
                sommeRange += matrice[i][j];
            }
            if (sommeRange != sommeMag)
            {
                System.out.println(1);
                return false;
            }
            sommeRange = 0;
        }
        //boucle pour check la somme des colonnes
        for (int i = 0; i < ordre; i++)
        {
            for (int j = 0; j < matrice[i].length; j++)
            {
                sommeColonne += matrice[j][i];
            }
            if (sommeColonne != sommeMag)
            {
                System.out.println(2);
                return false;
            }
            sommeColonne = 0;
        }
        //boucles pour check la somme des diagonales
        for (int i = 0; i < ordre; i++)
        {
            for (int j = 0; j < ordre; j++)
            {
                if (i == j)
                {
                    sommeDiagP += matrice[i][j];
                }
                if (i == (ordre - 1) - j) 
                {
                    sommeDiagS += matrice[i][j];
                }
            }
        }
        if (sommeDiagP != sommeMag || sommeDiagS != sommeMag)
            {
                System.out.println(sommeDiagP + "\t" + sommeDiagS);
                return false;
            }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
