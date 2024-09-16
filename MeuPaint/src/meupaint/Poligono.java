package meupaint;

import java.awt.Color;
import java.awt.Graphics;

public class Poligono extends Forma {

    private int numeroDeLados;

    public Poligono(int xIni, int yIni, int xFim, int yFim, Color corContorno, Color corPreenchimento) {
        super(xIni, yIni, xFim, yFim, corContorno, corPreenchimento);
        this.numeroDeLados = JanelaPrincipal.getNumeroDeLados(); // Inicializa com o número de lados selecionado
    }

   
    @Override
    public void desenhar(Graphics g) {
        int numeroDeLados = this.numeroDeLados;

        // Coordenadas mínimas e máximas
        int xIniD = Math.min(xIni, xFim);
        int xFimD = Math.max(xIni, xFim);
        int yIniD = Math.min(yIni, yFim);
        int yFimD = Math.max(yIni, yFim);

        // Centro do polígono
        int centroX = (xIniD + xFimD) / 2;
        int centroY = (yIniD + yFimD) / 2;

        // Raio do polígono
        int raio = Math.min(xFimD - xIniD, yFimD - yIniD) / 2;

        // Arrays para coordenadas dos vértices do polígono
        int[] xLados = new int[numeroDeLados];
        int[] yLados = new int[numeroDeLados];

        // Cálculo das coordenadas dos vértices
        for (int i = 0; i < numeroDeLados; i++) {
            xLados[i] = (int) (centroX + raio * Math.cos(2 * Math.PI * i / numeroDeLados));
            yLados[i] = (int) (centroY + raio * Math.sin(2 * Math.PI * i / numeroDeLados));
        }

        
        g.setColor(corPreenchimento);
        g.fillPolygon(xLados, yLados, numeroDeLados);  
        g.setColor(corContorno);
        g.drawPolygon(xLados, yLados, numeroDeLados);  
    }

    public void atualizar(int x, int y) {
        this.xFim = x;
        this.yFim = y;
       
        // Atualizar apenas as coordenadas finais
    }

    
    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
        // Atualiza os vértices no próximo desenho
    }
}
