package problem;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class MicrosoftTextBox extends TextBox {
	
	public MicrosoftTextBox() {
		super(null);
	}

	public MicrosoftTextBox(String text) {
		super(text, null);
	}

	public MicrosoftTextBox(String text, Rectangle bound) {
		super(null, text, bound);
	}

	public MicrosoftTextBox(IComponent parent, String text, Rectangle bound) {
		super(parent, text, bound);		
	}
	
	@Override
	public void drawComponent(Graphics2D g) {
		Rectangle bound = this.getBounds();
		
		
		// Draw the border after setting the thickness
		g.setColor(new Color(14,29,110));
		Rectangle2D border = new Rectangle2D.Float(bound.x, bound.y, bound.width, bound.height);
		g.setStroke(new BasicStroke(5));
		g.draw(border);
		
		// Draw the white fill
		g.setColor(Color.white);
		Rectangle2D fill = new Rectangle2D.Float(bound.x+2, bound.y+2, bound.width-2, bound.height-2);
		g.fill(fill);;
		
		// Draw the Fill
		g.setFont(new Font("TimesRoman", Font.PLAIN, 12)); 		
		g.setColor(Color.black);
		g.drawString(super.getText(), bound.x + TextBox.H_SPACE, bound.y + 16);
	}

}
