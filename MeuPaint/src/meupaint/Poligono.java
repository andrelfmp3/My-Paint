/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author bv110309
 */
public class Poligono extends Forma { // faz retangulo. adaptar botoes

    public Poligono(int xIni, int yIni, int xFim, int yFim, Color corContorno, Color corPreenchimento) {
        super( xIni, yIni, xFim, yFim, corContorno, corPreenchimento );
    }
    
    @Override
    public void desenhar( Graphics g ) {
        
        int xIniD = xIni < xFim ? xIni : xFim;
        int xFimD = xIni < xFim ? xFim : xIni;
        
        int yIniD = yIni < yFim ? yIni : yFim;
        int yFimD = yIni < yFim ? yFim : yIni;
        
        g.setColor( corPreenchimento );
        g.fillRect( xIniD, yIniD, xFimD - xIniD, yFimD - yIniD );
        
        g.setColor( corContorno );
        g.drawRect( xIniD, yIniD, xFimD - xIniD, yFimD - yIniD );
        
    }
    
}
