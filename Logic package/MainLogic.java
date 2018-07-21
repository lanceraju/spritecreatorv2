package Logic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import Client.BaseSprite;
import Client.MainClient;

public class MainLogic{

	private ArrayList <BaseShape> mShapes = new ArrayList <BaseShape>();
	
	
	public void ChooseShape(double tX, double tY, double tRotation, Color mColor, double tWidth, double tHeight, String defaultShape) 
	{
		BaseShape tShape = null;
		if (defaultShape == "Ellipse")
		{
			tShape = new ElliShape(tX, tY, tRotation, mColor, tWidth, tHeight);
		}
		else
		{
			tShape = new RectShape(tX, tY, tRotation, mColor, tWidth, tHeight);
		}
		mShapes.add(tShape);
		MainClient.ChangeValues(mShapes);
	}

	public void Rotate (double tRotation)
	{
		BaseShape tShape = mShapes.get(mShapes.size() - 1 );

		tShape.SetRotation(tShape.GetRotation() + tRotation);
		
		MainClient.ChangeValues(mShapes);
	}
	
	public void Undo()
	{
		mShapes.remove(mShapes.size()-1);
		MainClient.ChangeValues(mShapes);
	}

	
	


}