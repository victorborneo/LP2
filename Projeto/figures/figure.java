package figures;

import java.awt.*;
import java.awt.event.*;

public abstract class figure {
    public int x, y;
    public int w, h;
    public float thickness;
    public String type;
    public Color border, inner;
    
    public abstract void paint(Graphics g);
    public abstract void drag(Point mouse_pos, int dist_x, int dist_y);
    public abstract boolean contains(MouseEvent evt);
    public abstract void resize();

    public void print () {
        System.out.format("%s de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.type, this.w, this.h, this.x, this.y);
    }
}