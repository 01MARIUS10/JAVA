import Class.Form2D.Carre;
import Class.Form2D.Cercle;

public class Main 
{
        public static void main(String args[]) 
        {
                Carre  A = new Carre(10);
                Cercle B = new Cercle(2);
                A.dessiner();
                B.dessiner();
        }
}