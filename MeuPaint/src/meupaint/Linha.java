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
public class Linha extends Forma {

    public Linha(int xIni, int yIni, int xFim, int yFim, Color corContorno) {
        super( xIni, yIni, xFim, yFim, corContorno, null );
    }
    
    @Override
    public void desenhar( Graphics g ) {
        g.setColor( corContorno );
        g.drawLine( xIni, yIni, xFim, yFim );
    }
    
}
