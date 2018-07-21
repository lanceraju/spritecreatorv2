package Logic;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public abstract class BaseShape {

	double mX;
	double mY;
	double mRotation;
	int LocalColorOne;
	int LocalColorTwo;
	int LocalColorThree;
	Color mColor;
	double mWidth;
	double mHeight;
	
	
	
	
	public BaseShape(double tX, double tY, double tRotation, Color tColor, double tWidth, double tHeight) 
	{
		mX = tX;
		mY = tY;
		mRotation = tRotation;
		mColor = tColor;
		mWidth = tWidth;
		mHeight = tHeight;
		
	}
	public Color GetColor()
	{
		
		return mColor;
	}
	public double GetRotation()
	{	
//		double tRotation = mRotation * (Math.PI / 180);
//		double tRotation = Math.toRadians(mRotation);
//		mRotation += tRotation;
		return mRotation;
	}
	public double GetHeight()
	{
		
		return mHeight;
	}
	public double GetWidth()
	{
		
		return mWidth;
	}
	public double GetX()
	{
		
		return mX;
	}
	public double GetY()
	{
		
		return mY;
	}
	public void SetRotation(double tRotation) {
		mRotation = tRotation;
		// TODO Auto-generated method stub
		
	}

}


