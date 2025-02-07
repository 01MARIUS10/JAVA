package Class.Form2D;

import Class.Form2d;
import Interface.IForm;

public class Cercle extends Form2d implements IForm
{
        protected float rayon;
        public Cercle(float rayon)
        {
                this.rayon = rayon;
        }
        
        @Override
        public double perimetre()
        {
                return 2 * 3.14 * this.rayon;
        }
        public double surface()
        {
                return 3.14 * this.rayon * this.rayon;
        }
        public void dessiner()
        {
                System.out.println("dessiner cercle");
        }
}
