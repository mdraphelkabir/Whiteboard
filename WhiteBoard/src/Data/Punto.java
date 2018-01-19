package Data;

import java.awt.Color;
import java.awt.Point;

public class Punto{
    private Point posizione;
    private Color colore;
    private int raggio;
    
    public Punto(int x, int y, Color colore, int raggio)
    {
        posizione = new Point(x, y);
        colore = new Color(colore.getRGB());
        this.raggio = raggio;
    }
    
    
}
