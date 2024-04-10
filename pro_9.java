import java.applet.Applet;
import java.awt.*;
/* <applet code="pro_9.class" width="300" height="300">
</applet> 
*/

public class pro_9 extends Applet {
    
   // @Override
    public void paint(Graphics g) {
        // Set font and text
        Font font = new Font("Arial", Font.PLAIN, 24);
        g.setFont(font);
        String text = "Sample Text";
        
        // Get font metrics
        FontMetrics fontMetrics = g.getFontMetrics();
        
        // Calculate ascent, descent, leading, and baseline
        int ascent = fontMetrics.getAscent();
        int descent = fontMetrics.getDescent();
        int leading = fontMetrics.getLeading();
        int baseline = ascent + leading;
        
        // Display metrics
        g.drawString(": " + ascent, 50, baseline - ascent);
        g.drawString(": " + descent, 50, baseline + descent);
        g.drawString(": " + leading, 20, baseline + descent + leading);
        g.drawString(": " + baseline, 20, baseline);
        
        // Display sample text
        g.drawString(text, 20, baseline);
    }
}
