package pkg;

import java.awt.Color;

import ryanguru.ColorDisplay;

public class YourCode
{

	public static void blinkingslopinglines(int row, int col, int height, String color)
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			int x = col + i;
			int z = row + i;

			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
			}
			ColorDisplay.pause(150);
			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelOFF (z, x);
			}
		}
	}

	public static void blinkingvertlines(int row ,int col ,int height,String color)
	{

		while( height > 0 && row < 10)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			row++;
			height--;
		}
		ColorDisplay.pause(150);

		while( height > 0 && row < 10)
		{
			ColorDisplay.setPixelOFF(row, col);
		}
	}

	public static void drawVertLinealltheway( int i, String color)//^ start from 0 row=0
	{
		int c;
		for ( c=0;c<10;c++)
		{
			ColorDisplay.setPixelColor(c,i, color);
		}
	}

	public static void drawHorLinealltheway( int i, String color)//> start from 0 col=0
	{
		int c;
		for ( c=0;c<20;c++)
		{
			ColorDisplay.setPixelColor(i,c, color);
		}
	}

	public static void drawVertLine(int row ,int col ,int height,String color)//draw ^ line any amount
	{
		while( height > 0 && row < 10)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			row++;
			height--;
		}
	}

	public static void drawHorLine(int row ,int col ,int height,String color)//draw > line any amount
	{
		while( height > 0 && col < 20)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			height--;
			col++;
		}
	}

	public static void drawShootingVertLine(int row ,int col ,int height,String color)//draw ^ line any amount
	{
		while( height > 0 && row < 10)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			row++;
			height--;
			ColorDisplay.pause(15);
		}
		ColorDisplay.pause(10);
		while( height > 0 && row < 10)
		{
			//ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(10);
		}
	}

	public static void drawShootingHorLine(int row ,int col ,int height,String color)//draw > line any amount
	{
		while( height > 0 && col < 20)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			height--;
			col++;
			ColorDisplay.pause(15);
		}
		ColorDisplay.pause(10);
		while( height > 0 && col < 20)
		{
			//ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(10);
		}
	}

	public static void DrawShootingLineUpAt(int col, int row, String color)//shooting lines all the way starting from top going DOWN to col ,row
	{
		for (int i=9; i>=row; i--)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(1);
		} 
		ColorDisplay.pause(10);
		for (int i=9; i>=row-1; i--)
		{
			//ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(1);
		}
	}

	public static void DrawShootingLineDownAt(int col, int row , String color)//shooting lines all the way starting from bottom going UP to col ,row
	{
		for (int i=0; i<=row; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(1);
		}
		ColorDisplay.pause(10);
		for (int i=0; i<=row; i++)
		{
			//ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(1);
		}
	}

	public static void drawShootingVertLinefromdowntoup(int row ,int col ,int height,String color)//draw ^ line any amount
	{
		while( height > 0 && row < 10)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			row++;
			height--;
			ColorDisplay.pause(10);
		}
		ColorDisplay.pause(100);

	}

	public static void drawShootingVertLinefromuptodown(int row ,int col ,int height,String color)//draw ^ line any amount
	{
		while( height > 0 && row <10)
		{ 
			ColorDisplay.setPixelColor(row, col, color);
			row--;
			height--;

			ColorDisplay.pause(1);
		}
		ColorDisplay.pause(100);



	}

	public static void drawhorshootinglinelefttoright(int row ,int col ,int height,String color)//shooting line hor ---->
	{
		{
			while( height > 0 && col < 20)
			{ 
				ColorDisplay.setPixelColor(row, col, color);
				height--;
				col++;
				ColorDisplay.pause(10);				
			}
			ColorDisplay.pause(100);
			
			

					}
	}


	public static void drawhorshootinglinerighttoleft(int row ,int col ,int height,String color)//shooting line hor <-----
	{
		while( col < 20 && height > 0)
		{ 
			ColorDisplay.setPixelColor( row,col, color);
			height--;
			col--;
			ColorDisplay.pause(10);
		}
		ColorDisplay.pause(100);

	}


	public static void drawSlopingLineAt(int row, int col, int height, String color)//draw sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			int x = col + i;
			int z = row + i;

			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
			}
		}
	}

	public static void drawReverseSlopingLineAt(int row, int col, int height, String color)//draw reverse sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			int x = col - i;
			int z = row + i;

			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
			}
		}
	}

	public static void drawShootingSlopingLineAt(int row, int col, int height, String color)//draw sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			ColorDisplay.pause(10);
			int x = col + i;
			int z = row + i;
			ColorDisplay.pause(10);
			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
				//ColorDisplay.setPixelOFF(i, col);
				ColorDisplay.pause(20);
			}
		}
	}

	public static void drawReverseShootingSlopingLineAt(int row, int col, int height, String color)//draw reverse sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			ColorDisplay.pause(10);
			int x = col - i;
			int z = row + i;
			ColorDisplay.pause(10);
			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
				//ColorDisplay.setPixelOFF(i, col);
				ColorDisplay.pause(20); 
			}
		}
	}

	public static void drawShootingSlopingLineDownAt(int row, int col, int height, String color)//draw sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			ColorDisplay.pause(10);
			int x = col - i;
			int z = row - i;
			ColorDisplay.pause(10);
			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
				//ColorDisplay.setPixelOFF(i, col);
				ColorDisplay.pause(1);
			}
		}
	}

	public static void drawReverseShootingSlopingLineDownAt(int row, int col, int height, String color)//draw reverse sloping line any amount
	{
		int i;
		for( i = 0; i < height; i ++)
		{
			ColorDisplay.pause(10);
			int x =col+i;
			int z =row-i;
			ColorDisplay.pause(10);
			if ((z <= 9) && (x <=19))
			{
				ColorDisplay.setPixelColor (z, x, color);
				//ColorDisplay.setPixelOFF(i, col);
				ColorDisplay.pause(1); 
			}
		}
	}
	public static void drawRectAt(int row, int col, int length,int height,String color)  
	{
		for(int i=0;i<height;i++)
		{

			int x = row + i;
			drawHorLine( x , col , length , color);
		}
	}
	
	public static void drawhouse() 
	{
		drawSlopingLineAt(3,2,6,"LIGHTGRAY");
		drawReverseSlopingLineAt(3,12,6,"LIGHTGRAY");
		drawRectAt(0,4,7,5,"WHITE");
		drawHorLine(5,5,5,"LIGHTGRAY");
		drawHorLine(6,6,3,"LIGHTGRAY");
		drawHorLine(7,7,1,"LIGHTGRAY");
	}

	public static void Beats()//Going Down
	{
	
	for (int i = 9;i >= 0;i--)  
	{
		int rh = 0 + i;
		for(int ct = 1;ct < 20;ct = ct + 2)
		{
			int cc = 0 + ct;
		ColorDisplay.setPixelColor(rh, cc,"YELLOW");		
			
		}
		}
	
	for(int i = 0;i < 10;i++) 
	{
		int rh = 0 + i;
		for(int ct = 1;ct < 20;ct = ct + 2)
		{
			int cc = 0 + ct;
			if((rh <= 9)&&(cc <= 19))
			{
				ColorDisplay.setPixelColor(rh, cc, "ORANGE");
			}
		}
			ColorDisplay.pause(15);
	}
		
	}

	public static void drawDownandUpeffect()
	{
	
		DrawShootingLineDownAt(0,4 , "ORANGE");
		DrawShootingLineUpAt(1, 5, "RED");
	
		DrawShootingLineDownAt(2,4 , "ORANGE");
		DrawShootingLineUpAt(3, 5, "RED");
	
		DrawShootingLineDownAt(4,4 , "ORANGE");
		DrawShootingLineUpAt(5, 5, "RED");
	
		DrawShootingLineDownAt(6,4 , "ORANGE");
		DrawShootingLineUpAt(7, 5, "RED");
	
		DrawShootingLineDownAt(8,4 , "ORANGE");
		DrawShootingLineUpAt(9, 5, "RED");
	
		DrawShootingLineDownAt(10,4 , "ORANGE");
		DrawShootingLineUpAt(11, 5, "RED");
	
		DrawShootingLineDownAt(12,4 , "ORANGE");
		DrawShootingLineUpAt(13, 5, "RED");
	
		DrawShootingLineDownAt(14,4 , "ORANGE");
		DrawShootingLineUpAt(15, 5, "RED");
	
		DrawShootingLineDownAt(16,4 , "ORANGE");
		DrawShootingLineUpAt(17, 5, "RED");
	
		DrawShootingLineDownAt(18,4 , "ORANGE");
		DrawShootingLineUpAt(19, 5, "RED");
		ColorDisplay.pause(10);
	}

	public static void drawUpandDowneffect()
	{
		DrawShootingLineDownAt(19,4 , "RED");
		DrawShootingLineUpAt(18, 5, "ORANGE");
	
		DrawShootingLineDownAt(17,4 , "RED");
		DrawShootingLineUpAt(16, 5, "ORANGE");
	
		DrawShootingLineDownAt(15,4 , "RED");
		DrawShootingLineUpAt(14, 5, "ORANGE");
	
		DrawShootingLineDownAt(13,4 , "RED");
		DrawShootingLineUpAt(12, 5, "ORANGE");
	
		DrawShootingLineDownAt(11,4 , "RED");
		DrawShootingLineUpAt(10, 5, "ORANGE");
	
		DrawShootingLineDownAt(9,4 , "RED");
		DrawShootingLineUpAt(8, 5, "ORANGE");
	
		DrawShootingLineDownAt(7,4 , "RED");
		DrawShootingLineUpAt(6, 5, "ORANGE");
	
		DrawShootingLineDownAt(5,4 , "RED");
		DrawShootingLineUpAt(4, 5, "ORANGE");
	
		DrawShootingLineDownAt(3,4 , "RED");
		DrawShootingLineUpAt(2, 5, "ORANGE");
	
		DrawShootingLineDownAt(1,4 , "RED");
		DrawShootingLineUpAt(0, 5, "ORANGE");
		ColorDisplay.pause(10);
	}

	public static void DJBEATS() 
	{
		for(int i = 0;i < 10;i++)
		{
			int row = 0 + i;
			if(row <= 9)
			{
				ColorDisplay.setPixelColor(row, 0, "RED");
				ColorDisplay.setPixelColor(row, 2, "RED");
				ColorDisplay.setPixelColor(row, 4, "RED");
				ColorDisplay.setPixelColor(row, 6, "RED");
				ColorDisplay.setPixelColor(row, 8, "RED");
				ColorDisplay.setPixelColor(row, 10, "RED");
				ColorDisplay.setPixelColor(row, 12, "RED");
				ColorDisplay.setPixelColor(row, 14, "RED");
				ColorDisplay.setPixelColor(row, 16, "RED");
				ColorDisplay.setPixelColor(row, 18, "RED");
	
				ColorDisplay.setPixelColor(row, 1, "ORANGE");
				ColorDisplay.setPixelColor(row, 3, "ORANGE");
				ColorDisplay.setPixelColor(row, 5, "ORANGE");
				ColorDisplay.setPixelColor(row, 7, "ORANGE");
				ColorDisplay.setPixelColor(row, 9, "ORANGE");
				ColorDisplay.setPixelColor(row, 11, "ORANGE");
				ColorDisplay.setPixelColor(row, 13, "ORANGE");
				ColorDisplay.setPixelColor(row, 15, "ORANGE");
				ColorDisplay.setPixelColor(row,17, "ORANGE");
				ColorDisplay.setPixelColor(row, 19, "ORANGE");
			}
			ColorDisplay.pause(15);
		}
		for(int i = 9;i >= 0;i--)
		{
			int row = 0 + i;
			for(int ct = 0;ct < 20;ct = ct + 2)
			{
				if(row <= 9)
				{
					ColorDisplay.setPixelColor(row, 0, "BLACK");
					ColorDisplay.setPixelColor(row, 2, "BLACK");
					ColorDisplay.setPixelColor(row, 4, "BLACK");
					ColorDisplay.setPixelColor(row, 6, "BLACK");
					ColorDisplay.setPixelColor(row, 8, "BLACK");
					ColorDisplay.setPixelColor(row, 10, "BLACK");
					ColorDisplay.setPixelColor(row, 12, "BLACK");
					ColorDisplay.setPixelColor(row, 14, "BLACK");
					ColorDisplay.setPixelColor(row, 16, "BLACK");
					ColorDisplay.setPixelColor(row, 18, "BLACK");
	
					ColorDisplay.setPixelColor(row, 1, "BLACK");
					ColorDisplay.setPixelColor(row, 3, "BLACK");
					ColorDisplay.setPixelColor(row, 5, "BLACK");
					ColorDisplay.setPixelColor(row, 7, "BLACK");
					ColorDisplay.setPixelColor(row, 9, "BLACK");
					ColorDisplay.setPixelColor(row, 11, "BLACK");
					ColorDisplay.setPixelColor(row, 13, "BLACK");
					ColorDisplay.setPixelColor(row, 15, "BLACK");
					ColorDisplay.setPixelColor(row,17, "BLACK");
					ColorDisplay.setPixelColor(row, 19, "BLACK");
				}
			}
			ColorDisplay.pause(15);
		}		
	}

	public static void drawequilibrium(String color)
	{
		int col = 0;
		
		while( col>=0  && col < 20)
		{ 
			int row = ColorDisplay.randomRow();
			int start = 0;
			while(start < row) {
				ColorDisplay.setPixelColor(start, col, color);
				start++;
			}
			
			col++;

		}
	}

	public static void drawboat()
	{
	
		drawhorshootinglinelefttoright(4 ,0 ,11,"GREEN");
		ColorDisplay.setPixelColor(3,9, "GREEN");
		drawhorshootinglinelefttoright(3 ,1 ,9,"GREEN");
		drawhorshootinglinelefttoright(2 ,2 ,7,"GREEN");
		drawShootingVertLinefromdowntoup(5,3 ,5,"GREEN");
		drawReverseShootingSlopingLineDownAt(9, 4, 3,"GREEN");
		drawhorshootinglinelefttoright(6 ,4 ,4,"GREEN");
		drawhorshootinglinelefttoright(7 ,3 ,4,"GREEN");
		ColorDisplay.setPixelColor(8,4, "GREEN");
	}

	public static void drawwave()
	{
	
		drawRectAt(0, 0, 20, 3, "BLUE");
		ColorDisplay.setPixelColor(3,13, "BLUE");
		ColorDisplay.setPixelColor(4,14, "BLUE");
		ColorDisplay.setPixelColor(3,14, "BLUE");
		ColorDisplay.setPixelColor(3,15, "BLUE");
		ColorDisplay.setPixelColor(3,18, "BLUE");
		ColorDisplay.setPixelColor(4,19, "BLUE");
		ColorDisplay.setPixelColor(3,19, "BLUE");
		ColorDisplay.setPixelColor(2,11, "BLACK");
		ColorDisplay.setPixelColor(3,0, "BLUE");
		ColorDisplay.setPixelColor(3,10, "BLUE");
		ColorDisplay.setPixelColor(3,12, "BLUE");
		drawShootingVertLinefromdowntoup(2 ,11 ,3,"BLUE");
	}

	public static void drawBIGwave()
	{
	
		drawRectAt(0, 0, 20, 3, "BLUE");
		ColorDisplay.setPixelColor(3,13, "BLUE");
		ColorDisplay.setPixelColor(4,14, "BLUE");
		ColorDisplay.setPixelColor(3,14, "BLUE");
		ColorDisplay.setPixelColor(3,15, "BLUE");
		ColorDisplay.setPixelColor(3,18, "BLUE");
		ColorDisplay.setPixelColor(4,19, "BLUE");
		ColorDisplay.setPixelColor(3,19, "BLUE");
		ColorDisplay.setPixelColor(2,11, "BLACK");
		ColorDisplay.setPixelColor(3,0, "BLUE");
		ColorDisplay.setPixelColor(3,10, "BLUE");
		ColorDisplay.setPixelColor(3,12, "BLUE");
		drawShootingVertLinefromdowntoup(2 ,11 ,3,"BLUE");
		drawVertLine(0,0 ,10,"BLUE");
		drawReverseSlopingLineAt(3, 8, 6, "BLUE");
		drawRectAt(3, 1, 4, 4, "BLUE");
		ColorDisplay.setPixelColor(8,1, "BLUE");
		ColorDisplay.setPixelColor(8,2, "BLUE");
		ColorDisplay.setPixelColor(7,1, "BLUE");
		ColorDisplay.setPixelColor(7,2, "BLUE");
		ColorDisplay.setPixelColor(7,3, "BLUE");
		ColorDisplay.setPixelColor(5,5, "BLUE");
		ColorDisplay.setPixelColor(4,5, "BLUE");
		ColorDisplay.setPixelColor(4,6, "BLUE");
		ColorDisplay.setPixelColor(3,5, "BLUE");
		ColorDisplay.setPixelColor(3,6, "BLUE");
		ColorDisplay.setPixelColor(3,7, "BLUE");
		ColorDisplay.setPixelColor(5,6, "BLACK");
		ColorDisplay.setPixelColor(3,8, "BLACK");
	
	}

	public static void motionofwave()
	{
		drawShootingVertLinefromdowntoup(0 ,7 ,10,"BLUE");
		drawReverseSlopingLineAt(4, 14, 8, "BLUE");
		drawRectAt(4, 8, 4, 2, "BLUE");
		ColorDisplay.setPixelColor(9,8, "BLUE");
		ColorDisplay.setPixelColor(8,8, "BLUE");
		ColorDisplay.setPixelColor(8,9, "BLUE");
		ColorDisplay.setPixelColor(7,8, "BLUE");
		ColorDisplay.setPixelColor(7,9, "BLUE");
		ColorDisplay.setPixelColor(7,10, "BLUE");
		ColorDisplay.setPixelColor(7,12, "BLUE");
		ColorDisplay.setPixelColor(6,13, "BLUE");
		ColorDisplay.setPixelColor(4,15, "BLUE");
		drawHorLine(6,8 ,4,"BLUE");
		ColorDisplay.setPixelColor(5,12, "BLUE");
		ColorDisplay.setPixelColor(4,12, "BLUE");
		ColorDisplay.setPixelColor(4,13, "BLUE");
		ColorDisplay.setPixelColor(3,8, "BLUE");
		ColorDisplay.setPixelColor(3,9, "BLUE");
	
	}

	public static void drawwords()
	{
		drawShootingVertLinefromuptodown(8 ,0 ,6,"GRAY");
		drawShootingSlopingLineAt(2, 1, 2, "GRAY");
		drawhorshootinglinelefttoright(3 ,2 ,2,"GRAY");
		drawReverseShootingSlopingLineDownAt(3, 3, 2, "GRAY");
		drawVertLine(3 ,5 ,6,"GRAY");
	
		drawRectAt(2,7, 4,7,"GRAY");
		drawRectAt(3,8, 2,5,"BLACK");
	
		drawVertLine(2,12 ,7,"GRAY");
		drawhorshootinglinelefttoright(8 ,12 ,3,"GRAY");
	
		drawShootingVertLinefromuptodown(8 ,16 ,7,"GRAY");
		drawShootingSlopingLineAt(2, 17, 3, "GRAY");
		drawVertLine(4,19 ,3,"GRAY");
		drawReverseShootingSlopingLineAt(6, 19, 3, "GRAY");
	
	}

	public static void drawlockedlock()
	{
		drawRectAt(1,7,6,5,"YELLOW");
		drawVertLine(6,8,2,"LIGHTGRAY");
		drawVertLine(6,11,2,"LIGHTGRAY");
	    drawHorLine(7,8,4,"LIGHTGRAY");
	    drawHorLine(8,9,2,"LIGHTGRAY");
	}

	public static void drawopenlock() //open locker
	{
		drawRectAt(1,7,6,5,"YELLOW");
		drawVertLine(7,8,2,"LIGHTGRAY");
		drawVertLine(6,11,3,"LIGHTGRAY");
	    drawHorLine(8,8,4,"LIGHTGRAY");
	    drawHorLine(9,9,2,"LIGHTGRAY");
	}
	
	public static void drawopenlockright()//open locke 2
	{
		drawRectAt(1,7,6,5,"YELLOW");
		drawHorLine(8,8,4,"LIGHTGRAY");
		drawRectAt(8,12,2,2,"LIGHTGRAY");
		drawVertLine(7,14,2,"LIGHTGRAY");
	}
	
	public static void drawLockedlockwithheart() //locked heart
	{
		int[] row ={5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5};
		int[] col ={4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] height ={3, 5, 6, 7, 7, 7, 7, 7, 7, 6, 5, 3};
		String red = "RED";
		for(int i = 0;i < row.length;i++)
		{
			drawVertLine(row[i], col[i], height[i], red);
		}
		drawRectAt(1,7,6,5,"YELLOW");
		drawVertLine(6,8,2,"LIGHTGRAY");
		drawVertLine(6,11,2,"LIGHTGRAY");
	    drawHorLine(7,8,4,"LIGHTGRAY");
	    drawHorLine(8,9,2,"LIGHTGRAY");
	
	}

     public static void drawOpenlockwithheart()//open lock 1
{
	int[] row ={5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5};
	int[] col ={4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	int[] height ={3, 5, 6, 7, 7, 7, 7, 7, 7, 6, 5, 3};
	String red = "RED";
	for(int i = 0;i < row.length;i++)
	{
		drawVertLine(row[i], col[i], height[i], red);
	}
	drawRectAt(1,7,6,5,"YELLOW");
	drawVertLine(7,8,2,"LIGHTGRAY");
	drawVertLine(6,11,3,"LIGHTGRAY");
    drawHorLine(8,8,4,"LIGHTGRAY");
    drawHorLine(9,9,2,"LIGHTGRAY");
}

     public static void drawOpenlockrightwithheart()//openlock
{
	int[] row ={5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5};
	int[] col ={4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	int[] height ={3, 5, 6, 7, 7, 7, 7, 7, 7, 6, 5, 3};
	String red = "RED";
	for(int i = 0;i < row.length;i++)
	{
		drawVertLine(row[i], col[i], height[i], red);
	}
	drawRectAt(1,7,6,5,"YELLOW");
	drawVertLine(6,11,3,"LIGHTGRAY");
	drawRectAt(8,12,2,2,"LIGHTGRAY");
	drawVertLine(7,14,2,"LIGHTGRAY");
}

	public static void drawHeart(String color)//heart
	{
		int[] row ={5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5};
		int[] col ={4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] height ={3, 5, 6, 7, 7, 7, 7, 7, 7, 6, 5, 3};
		
		for(int i = 0;i < row.length;i++)
		{
			drawVertLine(row[i], col[i], height[i], color);
		}
	}

	public static void drawmatch()//match
	{
		drawRectAt(0, 0, 20, 10, "CYAN");
		drawRectAt(0, 10, 2, 3, "GRAY");
		drawHorLine(3 ,10 ,2,"BLACK");
		drawRectAt(4, 10, 2, 3, "ORANGE");
		drawVertLine(4 ,9 ,3,"RED");
		drawVertLine(4 ,12 ,3,"RED");
		drawHorLine(7 ,10 ,2,"RED");
		ColorDisplay.setPixelColor(8,11, "RED");
		ColorDisplay.setPixelColor(9,10, "ORANGE");
		
		ColorDisplay.setPixelColor(7,15, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(7, 15,"CYAN");
		
		ColorDisplay.setPixelColor(8,5, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(8, 5,"CYAN");
		ColorDisplay.setPixelColor(7,15, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(7, 15,"CYAN");
		
		ColorDisplay.setPixelColor(8,5, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(8, 5,"CYAN");
		
		
	}
	
	

	public static void drawexplosion()//expolsion
	{
		drawHorLine(1 ,5 ,10,"RED");
		ColorDisplay.setPixelColor(0,4, "RED");
		ColorDisplay.setPixelColor(0,15, "RED");
		drawVertLine(2 ,8 ,3,"RED");
		drawVertLine(2 ,11 ,3,"RED");
		drawVertLine(5 ,6 ,2,"RED");
		ColorDisplay.setPixelColor(7,7, "RED");
		ColorDisplay.setPixelColor(8,6, "RED");
		drawHorLine(9,7 ,7,"RED");
		ColorDisplay.setPixelColor(8,14, "RED");
		ColorDisplay.setPixelColor(7,13, "RED");
		drawVertLine(5 ,14 ,2,"RED");
		ColorDisplay.setPixelColor(4,13, "RED");
		ColorDisplay.setPixelColor(6,12, "RED");
		drawVertLine(7, 11 ,2,"RED");
		drawVertLine(6 ,9 ,2,"RED");
		drawHorLine(0,5 ,10,"ORANGE");
		drawVertLine(2, 10 ,7,"ORANGE");
		drawVertLine(2 ,9 ,4,"ORANGE");
		drawVertLine(5 ,8 ,4,"ORANGE");
		drawHorLine(8,7 ,4,"ORANGE");
		drawVertLine(5 ,7 ,2,"ORANGE");
		drawVertLine(5 ,11 ,2,"ORANGE");
		drawVertLine(5 ,13 ,2,"ORANGE");
		ColorDisplay.setPixelColor(5,12, "ORANGE");
		ColorDisplay.setPixelColor(8,12, "ORANGE");
		ColorDisplay.setPixelColor(8,13, "ORANGE");
		ColorDisplay.setPixelColor(7,12, "ORANGE");
		
		ColorDisplay.setPixelColor(7,15, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(7, 15,"BLACK");
		
		ColorDisplay.setPixelColor(8,5, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		ColorDisplay.setPixelColor(8, 5,"BLACK");
		ColorDisplay.setPixelColor(7,15, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		
		ColorDisplay.setPixelColor(8,5, "LIGHTGRAY");
		ColorDisplay.pause(1000);
		
	}

	public static void drawpeople()
	{
		drawRectAt(4,2,3,3,"BLUE");
		drawVertLine(1 ,3 ,3,"BLUE");
		ColorDisplay.setPixelColor(0,2, "BLUE");
		ColorDisplay.setPixelColor(0,4, "BLUE");
		drawHorLine(2,3 ,3,"BLUE");	
	}

	public static void drawspeech()
	{
		drawShootingSlopingLineAt(6, 6, 3, "RED");
		drawReverseShootingSlopingLineDownAt(6, 6, 3, "RED");
		drawHorLine(8,8 ,8,"RED");	
		drawHorLine(4,8 ,8,"RED");	
		drawVertLine(4 ,15 ,5,"RED");
		ColorDisplay.setPixelColor(6,9, "CYAN");
		ColorDisplay.setPixelColor(6,11, "CYAN");
		ColorDisplay.setPixelColor(6,13, "CYAN");
	}
	
	public static void drawx()
	{
		drawSlopingLineAt(3, 9, 7, "BLACK");
		drawReverseSlopingLineAt(3, 15, 7, "BLACK");
	}

	public static void drawwreckingball()
	{
		drawVertLine(4, 10, 6, "LIGHTGRAY");
		drawRectAt(1,9,3,3,"DARKGRAY");
	}
	
	public static void drawwreckingball1()
	{
		drawSlopingLineAt(5, 6, 5, "LIGHTGRAY");
		drawRectAt(2,4,3,3,"DARKGRAY");
	}

	public static void drawwreckingball3()
	{
		drawReverseSlopingLineAt(5, 14, 5, "LIGHTGRAY");
		drawRectAt(2,14,3,3,"DARKGRAY");
	}

	public static void drawpeopleshouting()
	{
		drawRectAt(4,2,3,3,"BLUE");
		drawVertLine(1 ,3 ,3,"BLUE");
		ColorDisplay.setPixelColor(0,2, "BLUE");
		ColorDisplay.setPixelColor(0,4, "BLUE");
		drawHorLine(2,3 ,3,"BLUE");	
		
		ColorDisplay.setPixelColor(6, 9, "RED");
		ColorDisplay.setPixelColor(3, 9, "RED");
		drawVertLine(4, 10, 2, "RED");
		ColorDisplay.pause(40);
		ColorDisplay.setPixelColor(7, 11, "RED");
		ColorDisplay.setPixelColor(2, 11, "RED");
		drawVertLine(3, 12, 4, "RED");
		ColorDisplay.pause(40);
		ColorDisplay.setPixelColor(8, 13, "RED");
		ColorDisplay.setPixelColor(1, 13, "RED");
		drawVertLine(2, 14, 2, "RED");
		drawVertLine(6, 14, 2, "RED");
		drawVertLine(4, 15, 2, "RED");
		ColorDisplay.pause(40);
		ColorDisplay.setPixelColor(0, 15, "RED");
		ColorDisplay.setPixelColor(9, 15, "RED");
		drawVertLine(1, 16, 2, "RED");
		drawVertLine(7, 16, 2, "RED");
		drawVertLine(3, 17, 4, "RED");
	}
	
	public static void questionmark()//?
	{
		ColorDisplay.setPixelColor(6, 6, "RED");
		ColorDisplay.setPixelColor(7, 6, "RED");
		ColorDisplay.setPixelColor(8, 7, "RED");
		ColorDisplay.setPixelColor(9, 8, "RED");
		ColorDisplay.setPixelColor(9, 9, "RED");
		ColorDisplay.setPixelColor(9, 10, "RED");
		ColorDisplay.setPixelColor(8, 11, "RED");
		ColorDisplay.setPixelColor(7, 12, "RED");
		ColorDisplay.setPixelColor(6, 12, "RED");
		ColorDisplay.setPixelColor(5, 11, "RED");
		ColorDisplay.setPixelColor(4, 10, "RED");
		ColorDisplay.setPixelColor(4, 9, "RED");
		ColorDisplay.setPixelColor(3, 9, "RED");
		ColorDisplay.setPixelColor(2, 9, "RED");
		ColorDisplay.setPixelColor(0, 9, "RED");
	}

	public static void drawpaino() //paino
	{
		drawRectAt(0,0,20,10,"LIGHTGRAY");
		drawVertLine(0, 0, 5, "WHITE");
		drawVertLine(0, 2, 5, "WHITE");
		drawVertLine(0, 4, 5, "WHITE");
		drawVertLine(0, 6, 5, "WHITE");
		drawVertLine(0, 8, 5, "WHITE");
		drawVertLine(0, 10, 5, "WHITE");
		drawVertLine(0, 12, 5, "WHITE");
		drawVertLine(0, 14, 5, "WHITE");
		drawVertLine(0, 16, 5, "WHITE");
		drawVertLine(0, 18, 5, "WHITE");
		drawVertLine(0, 19 , 5, "WHITE");
		
		drawVertLine(0, 1, 2, "WHITE");
		drawVertLine(0, 3, 2, "WHITE");
		drawVertLine(0, 5, 2, "WHITE");
		drawVertLine(0, 7, 2, "WHITE");
		drawVertLine(0, 9, 2, "WHITE");
		drawVertLine(0, 11, 2, "WHITE");
		drawVertLine(0, 13, 2, "WHITE");
		drawVertLine(0, 15, 2, "WHITE");
		drawVertLine(0, 17, 2, "WHITE");
		
		
		
		drawVertLine(1, 1, 4, "BLACK");
		drawVertLine(1, 3, 4, "BLACK");
		drawVertLine(1, 5, 4, "BLACK");
		drawVertLine(1, 7, 4, "BLACK");
		drawVertLine(1, 9, 4, "BLACK");
		drawVertLine(1, 11, 4, "BLACK");
		drawVertLine(1, 13, 4, "BLACK");
		drawVertLine(1, 15, 4, "BLACK");
		drawVertLine(1, 17, 4, "BLACK");
		
	}
	
	public static void fight() //fight
	{
		drawVertLine(5, 0, 5, "MAGENTA");
		drawHorLine(9, 1, 2, "MAGENTA");
		drawHorLine(7, 1, 2, "MAGENTA");
		
		drawVertLine(5, 5, 5, "MAGENTA");
		drawHorLine(9, 4, 3, "MAGENTA");
		drawHorLine(5,4, 3, "MAGENTA");
		
		drawHorLine(9, 8, 4, "MAGENTA");
		drawHorLine(5, 8, 4, "MAGENTA");
		drawVertLine(5, 8, 5, "MAGENTA");
		drawHorLine(7, 10,2, "MAGENTA");
		drawVertLine(5, 11, 3, "MAGENTA");
		
		drawVertLine(5, 13, 5, "MAGENTA");
		drawVertLine(5, 15, 5, "MAGENTA");
		ColorDisplay.setPixelColor(7, 14, "MAGENTA");
		
		drawVertLine(5, 18, 5, "MAGENTA");
		drawHorLine(9, 17,3, "MAGENTA");
	} 
	
	public static void whenfightispress() //the key press on the paino
	{
		drawVertLine(0, 0, 5, "MAGENTA");
		drawVertLine(1, 5, 4, "MAGENTA");
		drawVertLine(1, 11, 4, "MAGENTA");
		drawVertLine(1, 13, 4, "MAGENTA");
		drawVertLine(1, 15, 4, "MAGENTA");
		drawVertLine(0, 18, 5, "MAGENTA");
	}
	
	public static void drawsong()// song
	{
		drawRectAt(0,0,20,10,"LIGHTGRAY");
		drawHorLine(9, 0, 4, "BLUE");
		drawHorLine(7, 0, 4, "BLUE");
		drawHorLine(5, 0, 4, "BLUE");
		ColorDisplay.setPixelColor(8, 0, "BLUE");
		ColorDisplay.setPixelColor(6, 3, "BLUE");
		
		drawRectAt(5,5,4,5,"BLUE");
		drawRectAt(6,6,2,3,"LIGHTGRAY");
		
		drawVertLine(5, 10, 5, "BLUE");
		drawVertLine(5, 14, 5, "BLUE");
		drawHorLine(9, 10, 5, "BLUE");
		
		drawHorLine(9, 16, 4, "BLUE");
		drawHorLine(5, 16, 4, "BLUE");
		drawHorLine(7, 18, 2, "BLUE");
		drawVertLine(5, 16, 5, "BLUE");
		ColorDisplay.setPixelColor(6, 19, "BLUE");
		
		
	}

	
	public static void SmileyFace() //smiley face
	{
		int[] row = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] col = {7, 6, 5, 5, 5, 5, 6, 7};
		int[] l   = {6, 8, 10, 10, 10, 10, 8, 6};
		for(int i = 0;i < row.length;i++)
		{
			drawHorLine(row[i], col[i], l[i], "YELLOW");
		}
		drawHorLine(0, 7, 6, "BLACK");
		drawHorLine(9, 7, 6, "BLACK");
		drawHorLine(2, 8, 4, "BLACK");
		drawVertLine(3, 4, 4, "BLACK");
		drawVertLine(3, 15, 4, "BLACK");
		drawVertLine(6, 8, 3, "BLACK");
		drawVertLine(6, 11, 3, "BLACK");
		int[] r = {3, 3, 1, 2, 1, 2, 7, 8, 7, 8};
		int[] c = {7, 12, 6, 5, 13, 14, 5, 6, 14, 13};
		for(int i = 0;i < r.length;i++)
		{
			ColorDisplay.setPixelColor(r[i], c[i], "BLACK");
		}
	}
	public static void SmileyFaceCloseEyes()// close eye
	{
		int[] row = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] col = {7, 6, 5, 5, 5, 5, 6, 7};
		int[] l   = {6, 8, 10, 10, 10, 10, 8, 6};
		for(int i = 0;i < row.length;i++)
		{
			drawHorLine(row[i], col[i], l[i], "YELLOW");
		}
		drawHorLine(0, 7, 6, "BLACK");
		drawHorLine(9, 7, 6, "BLACK");
		drawHorLine(2, 8, 4, "BLACK");
		drawVertLine(3, 4, 4, "BLACK");
		drawVertLine(3, 15, 4, "BLACK");
		drawHorLine(6, 7, 2, "BLACK");
		drawHorLine(6, 11, 2, "BLACK");
		int[] r = {3, 3, 1, 2, 1, 2, 7, 8, 7, 8};
		int[] c = {7, 12, 6, 5, 13, 14, 5, 6, 14, 13};
		for(int i = 0;i < r.length;i++)
		{
			ColorDisplay.setPixelColor(r[i], c[i], "YELLOW");
		}
	}
	public static void SmileyFaceOpenMouth()// open mouth
	{
		int[] row = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] col = {7, 6, 5, 5, 5, 5, 6, 7};
		int[] l   = {6, 8, 10, 10, 10, 10, 8, 6};
		for(int i = 0;i < row.length;i++)
		{
			drawHorLine(row[i], col[i], l[i], "YELLOW");
		}
		drawHorLine(0, 7, 6, "BLACK");
		drawHorLine(9, 7, 6, "BLACK");
		drawHorLine(2, 8, 4, "BLACK");
		drawVertLine(3, 4, 4, "BLACK");
		drawVertLine(3, 15, 4, "BLACK");
		drawVertLine(5, 8, 3, "BLACK");
		drawVertLine(5, 11, 3, "BLACK");
		drawHorLine(3, 8, 4, "BLACK");
		int[] r = {3, 3, 1, 2, 1, 2, 7, 8, 7, 8};
		int[] c = {7, 12, 6, 5, 13, 14, 5, 6, 14, 13};
		for(int i = 0;i < r.length;i++)
		{
			ColorDisplay.setPixelColor(r[i], c[i], "BLACK");
		}
	}
	public static void SmileyFaceOpenMouthCloseEyes() //open mouth close eye
	{
		int[] row = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] col = {7, 6, 5, 5, 5, 5, 6, 7};
		int[] l   = {6, 8, 10, 10, 10, 10, 8, 6};
		for(int i = 0;i < row.length;i++)
		{
			drawHorLine(row[i], col[i], l[i], "YELLOW");
		}
		drawHorLine(0, 7, 6, "BLACK");
		drawHorLine(9, 7, 6, "BLACK");
		drawHorLine(2, 8, 4, "BLACK");
		drawVertLine(3, 4, 4, "BLACK");
		drawVertLine(3, 15, 4, "BLACK");
		drawHorLine(3, 8, 4, "BLACK");
		drawHorLine(6, 7, 2, "BLACK");
		drawHorLine(6, 11, 2, "BLACK");
		int[] r = {3, 3, 1, 2, 1, 2, 7, 8, 7, 8};
		int[] c = {7, 12, 6, 5, 13, 14, 5, 6, 14, 13};
		for(int i = 0;i < r.length;i++)
		{
			ColorDisplay.setPixelColor(r[i], c[i], "BLACK");
		}
	}
	   
     public static void drawheartratemoniter()//heart rate moniter
     {
    	 drawRectAt(2,0,20,8,"BLACK");
    	 drawRectAt(3,1,18,6,"LIGHTGRAY");
    	 drawSlopingLineAt(0,5,2,"BLACK");
    	 drawReverseSlopingLineAt(0,13,2,"BLACK");
     }
     
     public static void drawlineforheartmoniter()//dead
     {
    	 drawhorshootinglinelefttoright(5,1,18,"RED");
    	 drawhorshootinglinelefttoright(5,1,18,"LIGHTGRAY");
    	 drawhorshootinglinelefttoright(5,1,18,"RED");
    	 drawhorshootinglinelefttoright(5,1,18,"LIGHTGRAY");
     }
     
     public static void drawupdownforheartmoniter()//the up and down line for heart rate moniter
     {
    	 drawhorshootinglinelefttoright(5,1,4,"RED");
    	 drawShootingSlopingLineAt(5,4,4,"RED");
    	 drawReverseShootingSlopingLineDownAt(8,7,4,"RED");
    	 drawhorshootinglinelefttoright(5,10,9,"RED"); 
    	 drawShootingSlopingLineAt(5,4,4,"LIGHTGRAY");
    	 drawhorshootinglinelefttoright(5,1,4,"LIGHTGRAY");
    	 drawReverseShootingSlopingLineDownAt(8,7,4,"LIGHTGRAY");
    	 drawhorshootinglinelefttoright(5,10,9,"LIGHTGRAY"); 
    	 
    	 drawhorshootinglinelefttoright(5,1,4,"RED");
    	 drawShootingSlopingLineAt(5,4,4,"RED");
    	 drawReverseShootingSlopingLineDownAt(8,7,4,"RED");
    	 drawhorshootinglinelefttoright(5,10,9,"RED"); 
    	 drawShootingSlopingLineAt(5,4,4,"LIGHTGRAY");
    	 drawhorshootinglinelefttoright(5,1,4,"LIGHTGRAY");
    	 drawReverseShootingSlopingLineDownAt(8,7,4,"LIGHTGRAY");
    	 drawhorshootinglinelefttoright(5,10,9,"LIGHTGRAY"); 
    	 
    	 
     }
     public static void stronger()//dumbell up 
     {
    	 drawHorLine(5,5,10,"BLACK");
    	 drawVertLine(4,4,3,"BLACK");
    	 drawVertLine(4,15,3,"BLACK");
    	 drawVertLine(3,3,5,"BLACK");
    	 drawVertLine(3,16,5,"BLACK");
  
    	 drawVertLine(0,7,5,"PINK");
    	 drawVertLine(0,12,5,"PINK");
    	 drawHorLine(6,6,3,"PINK");
    	 drawHorLine(6,11,3,"PINK");
    	 ColorDisplay.setPixelColor(5,8,"PINK");
    	 ColorDisplay.setPixelColor(5,11,"PINK");
     }
     
     public static void strongerup() //dumbell down
     {
    	 drawHorLine(3,5,10,"BLACK");
    	 drawVertLine(2,4,3,"BLACK");
    	 drawVertLine(2,15,3,"BLACK");
    	 drawVertLine(1,3,5,"BLACK");
    	 drawVertLine(1,16,5,"BLACK");
    	 
    	 drawVertLine(0,7,3,"PINK");
    	 drawVertLine(0,12,3,"PINK");
    	 drawHorLine(4,6,3,"PINK");
    	 drawHorLine(4,11,3,"PINK");
    	 ColorDisplay.setPixelColor(3,8,"PINK");
    	 ColorDisplay.setPixelColor(3,11,"PINK"); 
     }
      
     public static void fire()
     {
     	int []row= {0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,3,3,3,4,5};
     	int[]col= {7,8,9,10,11,12,7,8,9,10,11,12,8,9,10,11,8,9,10,9,9};
     	
     	for(int i=0;i<row.length;i++)
     	{
     		ColorDisplay.setPixelColor(row[i], col[i], "ORANGE");		
     	}
     	int []rowl= {0,0,2,4,6,4,3,2,0,0};
     	int[]coll= {5,6,7,8,9,10,11,12,13,14};
     	int []height= {4,3,6,3,2,7,3,5,4,5};
     	for(int i=0;i<rowl.length;i++)
     	{
     	drawVertLine(rowl[i],coll[i],height[i],"RED");	
     	}
     	ColorDisplay.pause(500);
     	
     	for(int i = 9;i >= 0;i--)  
     	{
     		int ro = 0 + i;
     		for(int ct = 0;ct < 20;ct++)
     		{
     			int cp = 0 + ct;
     			if((ro < 10)&&(cp < 20))
     			{
     				ColorDisplay.setPixelColor(ro, cp, "BLACK");	
     }
     		}
     	}
     }
     public static void fire1()
     {
     	
     	int []ri= {0,0,0,0,0,0,1,1,1,1,1,1 ,2,2,2,2 ,3,3,3,4,5};
     	int[]ci= {7,8,9,10,11,12,7,8,9,10,11,12 ,8,9,10,11 ,9,10,11,10,10};
     	
     	for(int i=0;i<ri.length;i++)
     	{
     		ColorDisplay.setPixelColor(ri[i], ci[i], "ORANGE");		
     	}
     	int []rh= {0,0,2,3,4,6,3,2,0,0};
     	int[]ch= {5,6,7,8,9,10,11,12,13,14};
     	int []hh= {5,4,5,3,7,2,4,6,3,4};
     	for(int i=0;i<rh.length;i++)
     	{
     	drawVertLine(rh[i],ch[i],hh[i],"RED");	
     	}
     	ColorDisplay.pause(500);
     	
     	for(int i = 9;i >= 0;i--)  
     	{
     		int rp = 0 + i;
     		for(int ct = 0;ct < 20;ct++)
     		{
     			int cp = 0 + ct;
     			if((rp < 10)&&(cp < 20))
     			{
     				ColorDisplay.setPixelColor(rp, cp, "BLACK");	
     }
     		}
     	}
     }
     public static void fire2()
     {
     	
     	int []ra= {0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,3,3,3,4,5};
     	int[]ca= {7,8,9,10,11,12,7,8,9,10,11,12,8,9,10,11,8,9,10,9,9};
     	
     	for(int i=0;i<ra.length;i++)
     	{
     		ColorDisplay.setPixelColor(ra[i], ca[i], "ORANGE");		
     	}
     	int []rb= {0,0,2,4,6,4,3,2,0,0};
     	int[]cb= {5,6,7,8,9,10,11,12,13,14};
     	int []hb= {4,3,6,3,2,7,3,5,4,5};
     	for(int i=0;i<rb.length;i++)
     	{
     	drawVertLine(rb[i],cb[i],hb[i],"RED");	
     	}
     	ColorDisplay.pause(500);
     	
     	for(int i = 9;i >= 0;i--)  
     	{
     		int rp = 0 + i;
     		for(int ct = 0;ct < 20;ct++)
     		{
     			int cp = 0 + ct;
     			if((rp < 10)&&(cp < 20))
     			{
     				ColorDisplay.setPixelColor(rp, cp, "BLACK");	
     }
     		}
     	}
     }
     public static void fire3()
     {
     	
     	int []rc= {0,0,0,0,0,0,1,1,1,1,1,1 ,2,2,2,2 ,3,3,3,4,5};
     	int[]cc= {7,8,9,10,11,12,7,8,9,10,11,12 ,8,9,10,11 ,9,10,11,10,10};
     	
     	for(int i=0;i<rc.length;i++)
     	{
     		ColorDisplay.setPixelColor(rc[i], cc[i], "ORANGE");		
     	}
     	int []rd= {0,0,2,3,4,6,3,2,0,0};
     	int[]cd= {5,6,7,8,9,10,11,12,13,14};
     	int []hd= {5,4,5,3,7,2,4,6,3,4};
     	for(int i=0;i<rd.length;i++)
     	{
     	drawVertLine(rd[i],cd[i],hd[i],"RED");	
     	}
     	ColorDisplay.pause(500);
     	
     	for(int i = 9;i >= 0;i--)  
     	{
     		int rp = 0 + i;
     		for(int ct = 0;ct < 20;ct++)
     		{
     			int cp = 0 + ct;
     			if((rp < 10)&&(cp < 20))
     			{
     				ColorDisplay.setPixelColor(rp, cp, "BLACK");	
     }
     		}
     	}
     }
     
     
     public static void drawfire()
     {
    	 fire();
    	 fire1();
    	 fire2();
    	 fire3();
     }
     
      
      public static void draw2years() // 2 years
      {
    	  drawHorLine(8,0,6,"BLUE");
    	  drawHorLine(5,0,6,"BLUE");
    	  drawHorLine(1,0,6,"BLUE");
    	  
    	  drawVertLine(5,5,4,"BLUE");
    	  drawVertLine(1,0,5,"BLUE");
    	  
    	  drawSlopingLineAt(6,9,3,"BLUE");
    	  drawReverseSlopingLineAt(6,9,3,"BLUE");
    	  drawVertLine(1,9,6,"BLUE");
    	  
          drawHorLine(7,13,6,"BLUE");  
    	  drawVertLine(1,13,8,"BLUE");
      }
      
      public static void drawme()// me
      {
    	  drawVertLine(1,1,8,"MAGENTA");
    	  drawVertLine(1,7,8,"MAGENTA");
    	  drawSlopingLineAt(5,4,4,"MAGENTA");
    	  drawReverseSlopingLineAt(5,4,4,"MAGENTA");
    	  
    	  drawVertLine(1,1,8,"MAGENTA");
    	  drawHorLine(8,11,6,"MAGENTA");  
    	  drawHorLine(5,11,6,"MAGENTA");  
    	  drawHorLine(1,11,6,"MAGENTA");  
      }
       
      public static void drawdeep() //deep
      {
    	  drawVertLine(1,4,8,"RED");
    	  drawHorLine(4,0,5,"RED");
    	  drawHorLine(1,0,5,"RED");  
    	  //d-red
    	  drawVertLine(1,5,4,"GRAY");
    	  drawHorLine(4,5,4,"GRAY");
    	  drawHorLine(3,5,4,"GRAY");
    	  drawHorLine(1,5,4,"GRAY");
    	  //gray-e
    	  drawVertLine(1,9,4,"PINK");
    	  drawHorLine(4,9,4,"PINK");
    	  drawHorLine(3,9,4,"PINK");
    	  drawHorLine(1,9,4,"PINK");
    	  //pink-e
    	  drawVertLine(3,17,4,"WHITE");
    	  drawHorLine(6,13,5,"WHITE");
    	  drawVertLine(0,13,7,"WHITE");
    	  drawHorLine(3,19,5,"WHITE");
    	  //white--p
      }
      
      public static void clearboard() //even left odd right
  	{
  		for (int i = 19;i >= 0;i--)  
  		{
  			int rh = 0 + i;
  			for(int ct = 0;ct < 9;ct = ct + 2)
  			{
  				int cc = 0 + ct;
  				ColorDisplay.setPixelColor(cc, rh, "BLUE");
  			}
  				ColorDisplay.pause(15);
  			}
  		
  		for(int i = 0;i <= 19;i++) 
  		{
  			int rh = 0 + i;
  			for(int ct = 1;ct <= 9;ct = ct + 2)
  			{
  				int cc = 0 + ct;
  				
  					ColorDisplay.setPixelColor(cc, rh, "BLACK");
  				
  			}
  				ColorDisplay.pause(15);
  			}
  			
  	}
      
      public static void drawpeople2()//2 person 
      {
    	  drawRectAt(4,14,3,3,"BLUE");
  		drawVertLine(1 ,15 ,3,"BLUE");
  		ColorDisplay.setPixelColor(0,16, "BLUE");
  		ColorDisplay.setPixelColor(0,14, "BLUE");
  		drawHorLine(2,14 ,3,"BLUE");	
      }
      
      public static void drawtheend(String color)//the end 
      {
    	  drawVertLine(5,2,5,color);
    	  drawHorLine(9,0,5,color);
    	  
    	  drawVertLine(5,6,5,color);
    	  drawVertLine(5,9,5,color);
    	  drawHorLine(7,6,4,color);
    	  	
    	  drawVertLine(5,11,5,color);
    	  drawHorLine(7,11,4,color);
    	  drawHorLine(9,11,4,color);
    	  drawHorLine(5,11,4,color);
    	  
    	  drawVertLine(0,5,5,color);
    	  drawHorLine(4,5,4,color);
    	  drawHorLine(2,5,4,color);
    	  drawHorLine(0,5,4,color);
    	  
    	  drawVertLine(0,10,5,color);
    	  drawVertLine(0,14,5,color);
    	  drawReverseSlopingLineAt(0,14,5,color);
    	  
    	  drawVertLine(0,16,5,color);
    	  drawHorLine(0,16,3,color);
    	  drawHorLine(4,16,3,color);
    	  drawVertLine(1,19,3,color);
      }
      
      public static void drawtest(String color)//one by one form up too down
      {
    	  for(int i=0;i<20;i++)
    	  {
    		  for(int j =9 ; j>=0;j--)
    		  {
    			  int count=0;
				ColorDisplay.setPixelColor(j,i-count,color);
				ColorDisplay.pause(25);
    		  }
    	  }
      }
      public static void drawleftside(String color)//from below to to top but sideway
      {
    	  
    	  
    	  drawSlopingLineAt(0,9,1,color);
    	  drawReverseSlopingLineAt(0,10,1,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,8,2,color);
  		 drawReverseSlopingLineAt(0,11,2,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,7,3,color);
  		 drawReverseSlopingLineAt(0,12,3,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,6,4,color);
  		 drawReverseSlopingLineAt(0,13,4,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,5,5,color);
  		 drawReverseSlopingLineAt(0,14,5,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,4,6,color);
  		 drawReverseSlopingLineAt(0,15,6,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,3,7,color);
  		 drawReverseSlopingLineAt(0,16,7,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,2,8,color);
  		 drawReverseSlopingLineAt(0,17,8,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(0,1,9,color);
  		 drawReverseSlopingLineAt(0,18,9,color);
  		ColorDisplay.pause(400);
  		
  		 drawSlopingLineAt(0,0,10,color); // LEFT MIDDLE SPLINT
  		 drawReverseSlopingLineAt(0,19,10,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(1,0,9,color);
  		 drawReverseSlopingLineAt(1,19,9,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(2,0,8,color);
  		 drawReverseSlopingLineAt(2,19,8,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(3,0,7,color);
  		 drawReverseSlopingLineAt(3,19,7,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(4,0,6,color);
  		 drawReverseSlopingLineAt(4,19,6,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(5,0,5,color);
  		 drawReverseSlopingLineAt(5,19,5,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(6,0,4,color);
  		 drawReverseSlopingLineAt(6,19,4,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(7,0,3,color);
  		 drawReverseSlopingLineAt(7,19,3,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(8,0,2,color);
  		 drawReverseSlopingLineAt(8,19,2,color);
  		ColorDisplay.pause(400);
  		 drawSlopingLineAt(9,0,1,color);
  		 drawReverseSlopingLineAt(9,19,1,color);
  		ColorDisplay.pause(400);
  	
      }
   
	public static void onBeat(int c)
	{
		System.out.println("At beat : " + c);
		

	if(c == 0)
		{
			
			for(int i = 0; i < 20; i++) {
				drawequilibrium(ColorDisplay.randomColor());
				ColorDisplay.pause(170);
				ColorDisplay.setScreenOFF();
			}
			
		
		}
	 else if (c==6)
		{
		 drawRectAt(0, 0, 20, 10, "BLACK");
		    drawboat();
		}

		else if (c==12)
		    {
			 drawwave();
		    } 

	else if (c==14)
		 {
		    	drawRectAt(0, 0, 20, 10, "BLACK");
		    } 

		else if(c==15)
			{
			 drawBIGwave();
			}	

		else if(c==19)
		{
			drawRectAt(4, 0, 7, 6, "BLACK");
			 motionofwave();

		}

		else if(c==22)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");	
			drawwords();
		}

		else if(c==25)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawLockedlockwithheart();
			 ColorDisplay.pause(1000);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawOpenlockwithheart();
			 ColorDisplay.pause(1000);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawOpenlockrightwithheart();
			 ColorDisplay.pause(800);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
		     drawHeart("RED");
		}
		
	else if (c==29)
		 {
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawmatch();
		 }

		else if (c==32)
		 {
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawexplosion();
		 }

		else if (c==35)
		{
			drawRectAt(0, 0, 20, 10, "GRAY");
			drawpeople();
			drawspeech();

		}

		else if (c==38)
		{
			drawx();
		}

		else if(c==40)
		{
			 drawRectAt(0, 0, 20, 10,"PINK");
			 drawwreckingball1();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 drawwreckingball();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 drawwreckingball3();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "PINK");
			drawwreckingball1();
			 ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10, "PINK");
		   drawwreckingball();
			ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10,"PINK");
			drawwreckingball3();
			ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10, "PINK");
			 drawwreckingball1();
			
		}
     else if(c==44)
        {
        	drawRectAt(0, 0, 20, 10, "GRAY");
        	drawpeopleshouting();
        	
        }
        
      else  if(c==45)
        {
        	drawRectAt(0, 0, 20, 10, "BLACK");
        	drawpeopleshouting();
        	drawRectAt(8, 0, 2, 2, "WHITE");
        }

		else if(c==46)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			questionmark();
		}
		
		else if(c==48)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			 drawpaino();

		}
		else if(c==49)
		{
			drawpaino();
			whenfightispress();
			 ColorDisplay.pause(300);
			 drawpaino();
			 fight();
			 ColorDisplay.pause(300);
			 drawsong();
		}
		else if(c==51)
		{
			drawRectAt(0, 0, 20, 10, "WHITE");
				drawheartratemoniter();
	ColorDisplay.pause(170);
	drawlineforheartmoniter();
	ColorDisplay.pause(100);
	drawupdownforheartmoniter();
			
		}
		
		else if (c==54)
		{
			drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFace();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouth();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouthCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouth();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouthCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouth();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouthCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouth();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouthCloseEyes();
		
		}
		
		else if(c==60)
		{
			 drawRectAt(0, 0, 20, 10, "MAGENTA");
			stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
		}
		
		else if(c==63)
		{
			drawpaino();
			whenfightispress();
			 ColorDisplay.pause(300);
			 drawpaino();
			 fight();
		}
		else if(c==64)
		{
			drawsong();
		}
		else if(c==65)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
		}
		else if(c==66)
		{
			drawpeople();
			
		}
	
		else if(c==69)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
		}
		
		else if(c==70)
		{
			drawDownandUpeffect();
			drawUpandDowneffect();
			Beats();
			Beats();
			Beats();
		}
		
		else if(c==74)
		{
			clearboard();
			
		}
		
		else if(c==77)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawme();
		}
		
		
		else if(c==79)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			
		}
		
		else if(c==80)
		{
			drawpeople();
			drawpeople2();
		}
		
		else if(c==81)
		{
			drawRectAt(0, 0, 10, 10, "BLACK");
		}
		
		else if(c==82)
		{
			drawRectAt(0, 10, 10, 10, "BLACK");
		}
		else if(c==83)
		{
			drawRectAt(0, 10, 10, 10, "LIGHTGRAY");
			ColorDisplay.pause(350);
			drawRectAt(1, 2, 16, 8, "DARKGRAY");
			ColorDisplay.pause(350);
			drawRectAt(3, 3, 14, 4, "BLACK");
			
		}
		
		else if(c==88)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawdeep();
			
		}
		
		else if(c==90)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			draw2years();
		    
		}
		
		else if(c==93)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawhouse(); 
		}
		
		else if(c==95)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			fire();
	 
	 }
		
		else if(c==96)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			for(int i = 0; i < 20; i++) 
			{
				drawequilibrium(ColorDisplay.randomColor());
				ColorDisplay.pause(170);
				ColorDisplay.setScreenOFF();
			}
		}
		
		
		else if(c==104)
		{
		drawRectAt(0, 0, 20, 10, "GRAY");
		drawpeople();
		drawspeech();
		}
		
		else if(c==107)
		{
		drawx();
		}
		
		else if(c==109)
		{
		 drawRectAt(0, 0, 20, 10,"CYAN");
			 drawwreckingball1();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "CYAN");
			 drawwreckingball();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "CYAN");
			 drawwreckingball3();
			 ColorDisplay.pause(350);
			 drawRectAt(0, 0, 20, 10, "CYAN");
			drawwreckingball1();
			 ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10, "CYAN");
		   drawwreckingball();
			ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10,"CYAN");
			drawwreckingball3();
			ColorDisplay.pause(350);
			drawRectAt(0, 0, 20, 10, "CYAN");
			 drawwreckingball1();
			 ColorDisplay.pause(350);
		     drawRectAt(0, 0, 20, 10, "CYAN");
			 drawwreckingball();
		}
		else if(c==112)
		{
		drawRectAt(0, 0, 20, 10, "GRAY");
        	drawpeopleshouting();
		}
		
		else if(c==113)
        {
        	drawRectAt(0, 0, 20, 10, "BLACK");
        	drawpeopleshouting();
        	drawRectAt(8, 0, 2, 2, "WHITE");
        }

		else if(c==115)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			questionmark();
			
		}
		else if(c==116)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
			 drawpaino();
		}
	
		else if(c==118)
		{
			drawpaino();
			whenfightispress();
			 ColorDisplay.pause(300);
			 drawpaino();
			 fight();
			 ColorDisplay.pause(300);
			 drawsong();
		}
		
		else if(c==121)
		{
			drawRectAt(0, 0, 20, 10, "WHITE");
				drawheartratemoniter();
	ColorDisplay.pause(170);
	drawlineforheartmoniter();
	ColorDisplay.pause(170);
	drawupdownforheartmoniter();
			
		}
		
		else if (c==128)
		{
			drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFace();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouth();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFaceOpenMouthCloseEyes();
			 ColorDisplay.pause(300);
			 drawRectAt(0, 0, 20, 10, "PINK");
			 SmileyFace();
			 
		}
		
		else if(c==132)
		{
			 drawRectAt(0, 0, 20, 10, "MAGENTA");
			stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	strongerup();
	ColorDisplay.pause(170);
	ColorDisplay.setScreenOFF();
	stronger();
		}
		
		else if(c==137)
		{
			drawpaino();
			whenfightispress();
			 ColorDisplay.pause(300);
			 drawpaino();
			 fight();
		}
		else if(c==138)
		{ 
			drawsong();
		}
		else if(c==139)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");
		}
		
		else if(c==140)
		{
			drawpeople();
			drawpeople2();
		}
		
		else if(c==142)
		{
			drawRectAt(0, 0, 10, 10, "BLACK");
		}
		
		else if(c==143)
		{
			drawRectAt(0, 10, 10, 10, "BLACK");
		}
		
		else if(c==145)
		{
			drawtest(ColorDisplay.randomColor());
			
		}
		
		
		else if(c==151)
		{
		
			drawRectAt(0, 0, 20, 10, "BLACK");
			ColorDisplay.pause(300);
			fire();
			
			
		}
		
		else if(c==156)
		{
			for(int i = 0; i < 20; i++) 
			{
				drawequilibrium(ColorDisplay.randomColor());
				ColorDisplay.pause(170);
			}
		}
		
		
		else if(c==165)
		{
		drawRectAt(0, 0, 20, 10, "BLACK");
		drawboat();
		}
		else if(c==168)
		    {
			 drawwave();
		    } 

	 else if (c==170)
		 {
		    	drawRectAt(0, 0, 20, 10, "BLACK");
		    } 

		else if(c==172)
			{
			 drawBIGwave();
			}	

		else if(c==174)
		{
			drawRectAt(4, 0, 7, 6, "BLACK");
			 motionofwave();

		}

		else if(c==179)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");	
			drawwords();
		}

		else if(c==183)
		{
			drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawLockedlockwithheart();
			 ColorDisplay.pause(1000);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawOpenlockwithheart();
			 ColorDisplay.pause(1000);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
			 drawOpenlockrightwithheart();
			 ColorDisplay.pause(800);
			 drawRectAt(0, 0, 20, 10, "BLACK");	
		     drawHeart("RED");
		}
		
		else if (c==185)
		 {
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawmatch();
		 }

		else if (c==188)
		 {
			drawRectAt(0, 0, 20, 10, "BLACK");
			drawexplosion();
			ColorDisplay.pause(800);
			drawleftside(ColorDisplay.randomColor());
			ColorDisplay.pause(800);
			drawtheend(ColorDisplay.randomColor());
			}
		
	 	// Replace the below with your own code to dance

		//Blink();
	}}

