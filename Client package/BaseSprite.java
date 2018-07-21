package Client;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import Logic.BaseShape;
import Logic.ElliShape;

public abstract class BaseSprite extends SpriteField{
	

	public abstract void DrawSprite(Graphics2D g2);

}
