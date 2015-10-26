package problem;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;

public class MicrosoftButton extends Button {
	
	public MicrosoftButton() {
		super(null);
	}

	public MicrosoftButton(String text) {
		super(text, null);
	}

	public MicrosoftButton(String text, Rectangle bound) {
		super(null, text, bound);
	}
	
	public MicrosoftButton(IComponent parent, String text, Rectangle bound) {
		super(parent, text, bound);
	}

	@Override
	public void drawComponent(Graphics2D g) {
		Rectangle bound = this.getBounds();
		
		
		// Draw the border after setting the thickness
		g.setColor(new Color(124,104,104));
		RoundRectangle2D border = new RoundRectangle2D.Float(bound.x, bound.y, bound.width, bound.height, 20, 50);
		g.setStroke(new BasicStroke(5));
		g.draw(border);
		
		// Fill in the rest of the button
		RoundRectangle2D fill = new RoundRectangle2D.Float(bound.x+2, bound.y+2, bound.width-2, bound.height-2, 18, 48);
		g.fill(fill);;
		
		// Draw the text
		g.setFont(new Font("TimesRoman", Font.PLAIN, 12)); 		
		g.setColor(Color.black);
		g.drawString(super.getText(), bound.x + Button.H_SPACE, bound.y + 16);
	}

}
