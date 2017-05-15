package com.speedracing.graphics;

public class Render
{
	public final int width;
	public final int height;
	
	public final int []pixels;
	
	public Render(int w, int h)						//  gli passiamo le dimensioni
	{
		this.width=w;
		this.height=h;
		this.pixels=new int [this.width * this.height];	 // Arrau che rappresentera i pixel dello schermo
	}
	
	
	
	
}
