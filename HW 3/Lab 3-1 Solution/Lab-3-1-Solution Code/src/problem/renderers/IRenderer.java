package problem.renderers;

import java.awt.Graphics2D;

import problem.components.IComponent;

public interface IRenderer {
	public IComponent getComponent();
	public void render(Graphics2D g);
}
