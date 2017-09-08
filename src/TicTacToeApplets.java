import java.awt.Graphics;
import javax.swing.JApplet;
public class TicTacToeApplets extends JApplet {
    public void paint(Graphics canvas) {
        canvas.drawLine(200,50, 200, 600);
        canvas.drawLine(400, 50, 400, 600);
        canvas.drawLine(50, 200, 600, 200);
        canvas.drawLine(50, 400, 600, 400);
        //1st x
        canvas.drawLine(50, 250, 150, 350);
        canvas.drawLine(50, 350, 150, 250);
        //2nd x
        canvas.drawLine(250, 250, 350, 350);
        canvas.drawLine(250, 350, 350, 250);
        //3rd x
        canvas.drawLine(450, 250, 550, 350);
        canvas.drawLine(450, 350, 550, 250);
        //line striking through the x
        canvas.drawLine(50, 300, 600, 300);
        //1st o
        canvas.drawOval(250, 75, 100,100);
        //2nd o
        canvas.drawOval(450, 75, 100,100);
        //3rd o
        canvas.drawOval(450, 475, 100,100);

    }
}
