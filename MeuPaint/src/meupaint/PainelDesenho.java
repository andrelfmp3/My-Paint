/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author bv110309
 */
public class PainelDesenho extends JPanel {
    
    private Forma formaTemporaria;
    private List<Forma> formas;
    
    public PainelDesenho() {
        formas = new ArrayList<>();
    }
    
    public void adicionarForma( Forma forma ) {
        formas.add( forma );
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.setColor( Color.WHITE );
        g.fillRect( 0, 0, getWidth(), getHeight() );
        
        for ( Forma forma : formas ) {
            forma.desenhar( g );
        }
        
        if ( formaTemporaria != null ) {
            formaTemporaria.desenhar( g );
        }
        
    }

    public void setFormaTemporaria(Forma formaTemporaria) {
        this.formaTemporaria = formaTemporaria;
    }
    
}
