package Class.Form2D;

import Class.Form2d;
import Interface.IForm;


public class Carre extends Form2d implements IForm
{
        protected int cote;
        public Carre(int cote)
        {
                this.cote = cote;
        }

        @Override
        public double perimetre()
        {
                return this.cote * 4;
        }
        public double surface()
        {
                return this.cote * this.cote;
        }
        public void dessiner()
        {
                System.out.println("Dessiner carre");

        }
}
