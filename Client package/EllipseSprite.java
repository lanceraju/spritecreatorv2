package Client;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;


public class EllipseSprite extends BaseSprite{
	double mX;
	double mY;
	double mRotation = 0;
	double mHeight = 50;
	double mWidth = 50;
	Color mColor = Color.BLACK;
	
	public EllipseSprite(double tX, double tY, double tRotation, Color tColor, double tWidth, double tHeight)
	{
		mX = tX;
		mY = tY;
		mRotation = tRotation;
		mColor = tColor;
		mWidth = tWidth;
		mHeight = tHeight;
			
	}
	public void DrawSprite( Graphics2D g2 )
	{
	
		
		AffineTransform tOldTransform = g2.getTransform();
		
	
		g2.setColor(mColor);
		g2.translate(mX, mY);
		g2.rotate(mRotation);
		g2.draw(new Ellipse2D.Double(-(mWidth / 2), -(mHeight / 2), mWidth, mHeight));

		
		
		g2.setTransform(tOldTransform);
	
	}
	
	
}