package Client;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import Logic.BaseShape;
import Logic.ElliShape;
import Logic.RectShape;
import Client.BaseSprite;

public class SpriteField extends JPanel
{
	
	ArrayList <BaseSprite> mSprites; 
	Color tColor;
	SpriteField()
	{
		mSprites = new ArrayList <BaseSprite>(); 
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		AffineTransform tOldTransform = g2.getTransform();
		for ( BaseSprite tSprite : mSprites )
		{
			tSprite.DrawSprite(g2);
			g2.setTransform(tOldTransform);
		}
	}
	
	public void ShapeToSprite(ArrayList <BaseShape> mShapes)
	{
		mSprites.clear();
		for (BaseShape tShape : mShapes)
		{
			BaseSprite tSprite = null;
			if(tShape instanceof RectShape)
			{
				tSprite = new RectangleSprite(tShape.GetX(), tShape.GetY(), tShape.GetRotation(), tShape.GetColor(), tShape.GetWidth(), tShape.GetHeight());
			}
			else if (tShape instanceof ElliShape)
			{
				tSprite = new EllipseSprite(tShape.GetX(), tShape.GetY(), tShape.GetRotation(), tShape.GetColor(), tShape.GetWidth(), tShape.GetHeight());	
			}
			mSprites.add(tSprite);
		}
		repaint();
		
	}
	
}


	