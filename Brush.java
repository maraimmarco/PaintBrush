import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
abstract class Shape{
	private int x;
	private int y;
	private int width;
	private int  height;
	public void setX(int x){
		this.x=x;
	}
	public int GetX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int GetY(){
		return y;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int  getWidth(){
		return width;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public int getHeight(){
		return height;
	}
	public abstract void Drawing(Graphics g);
}
public class Brush extends Applet {
		//buttons
		private Button RectangleButt;//done
		private Button line ;//done
		private Button Eraser;//done 
		private Button Pencil;
		private Button OvalButton;
		private Button Red;
		private Button Green;
		private Button Blue;
		private Checkbox check;
		private Button eraserButton;
		//
		private boolean chckEraser;
		private boolean sol;
		//char 
		private char col;
		private char shapeChar;
		//coordinate 
		private int startX ,startY;
		private int endX,endY;
		private int minX,minY;
		ArrayList<Shape>shapes;
		//creates object
		Shape Rect;
		Shape Line;
		Shape Oval;
		Shape eraserRect;
		Shape pen;
		Shape eraser;
		public void init(){
			shapes=new ArrayList<>();
			Rect=new Rectangle();
			Line=new Line();
			Oval=new Oval();
			eraserRect=new eraserRect();
			pen=new pencil();
			eraser=new eraser();
			RectangleButt =new Button("Rect");
			Pencil=new Button("pencil");
			Eraser=new Button("Clear All");
			line=new Button("line");
			OvalButton=new Button("Oval");
			Red=new Button("RED");
			Blue=new Button("Blue");
			Green=new Button("Green");
			check=new Checkbox("check");
			eraserButton=new Button("Eraser");
			RectangleButt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				shapeChar='r';
				System.out.println("Rect");
				sol=false;
			}});
			line.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				shapeChar='l';
				System.out.println("Line");
				sol=false;
			}});
			Eraser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				shapeChar='e';
				sol=false;
				System.out.println("clear All");
			}});
			OvalButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				shapeChar='o';
				sol=false;
				System.out.println("Oval");
			}});
			Pencil.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				shapeChar='p';
				sol=false;
				System.out.println("pencil");
			}});
			Red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				col='r';
				sol=false;
				System.out.println("RED");
			}});
			Blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				col='b';
				sol=false;
				System.out.println("BLUE");
			}});
			Green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				col='g';
				sol=false;
				System.out.println("Green");
			}});
			check.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					sol=true;
					System.out.println("check ");
					
				}
			});
			eraserButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chckEraser=true;
				shapeChar='m';
				System.out.println("Eraser");
			}});
		add(RectangleButt);
		add(Pencil);
		add(OvalButton);
		add(line);
		add(Eraser);
		add(Red);
		add(Green);
		add(Blue);
		add(check);
		add(eraserButton);
		this.addMouseListener(new MouseAdapt());
		this.addMouseMotionListener(new MouseAdapt());		
		}
		class Line extends Shape{
			public Line(){
			}
			public Line(Shape line){
				int x=line.GetX();
				int y=line.GetY();
				int width=line.getWidth();
				int height=line.getHeight();
			}
			public  void Drawing(Graphics g){
				int x=GetX();
				int y=GetY();
				int width=getWidth();
				int height=getHeight();
				}
			}
		class Rectangle extends Shape{
			public Rectangle(){
			}
		public Rectangle (Shape rect){
			int x=rect.GetX();
			int y=rect.GetY();
			int width=rect.getWidth();
			int height=rect.getHeight();
		}
		//override the method 
		public void Drawing(Graphics g){
			int x=GetX();
			int y=GetY();
			int width=getWidth();
			int height=getHeight();
	}
	}
		class eraserRect extends Shape{
			public eraserRect(){
			}
			public eraserRect(Shape eraserRect){
			int x=eraserRect.GetX();
			int y=eraserRect.GetY();
			int width=eraserRect.getWidth();
			int height=eraserRect.getHeight();
		}
		//override the method 
		public void Drawing(Graphics g){
			int x=GetX();
			int y=GetY();
			int width=getWidth();
			int height=getHeight();
			g.setColor(Color.WHITE);
			g.drawRect(GetX(),GetY(),getWidth(),getHeight());	
		}
		}
		class Oval extends Shape{
			public Oval(){
			}
			public Oval(Shape Oval){
				int x=Oval.GetX();
				int y=Oval.GetY();
				int width=Oval.getWidth();
				int height=Oval.getHeight();
			}
			public void Drawing(Graphics g){
				int x=GetX();
				int y=GetY();
				int width=getWidth();
				int height=getHeight();
				}
			}
		class eraser extends Shape{
			public eraser(){
			}
			public eraser(Shape eraser){
				int x=eraser.GetX();
				int y=eraser.GetY();
				int width=eraser.getWidth();
				int height=eraser.getHeight();
			}
			public void Drawing(Graphics g){
				int x=GetX();
				int y=GetY();
				int width=getWidth();
				int height=getHeight();
				}
		}
		class pencil extends Shape{
			public pencil(){
			}
			public pencil(Shape pencil){
				int x=GetX();
				int y=GetY();
				int width=getWidth();
				int height=getHeight();
			}
			public void Drawing(Graphics g){
				int x=GetX();
				int y=GetY();
				int width=getWidth();
				int height=getHeight();
			}
		}
		class MouseAdapt extends MouseAdapter{
			public void mousePressed(MouseEvent e){
				startX=e.getX();
				startY=e.getY();
				switch(shapeChar){
					case 'r':
					case 'R':
						Rect.setX(startX);
						Rect.setY(startY);
						break;
					case 'e':
					case 'E':
						eraserRect.setX(startX);
						eraserRect.setY(startY);
						break;
					case 'o':
					case 'O':
						Oval.setX(startX);
						Oval.setY(startY);
						break;
					case 'l':
					case 'L':
						Line.setX(startX);
						Line.setY(startY);
						break;
					case'p':
						pen.setX(startX);
						pen.setY(startY);
						break;
						case 'm':
						eraser.setX(startX);
						eraser.setY(startY);
						break;
				}
				
			}
			//
			public void mouseDragged(MouseEvent e){
				startX=e.getX();
				startY=e.getY();
				//endX=e.getX();
				//endY=e.getY();
				//System.out.println(endX, endY);
				switch(shapeChar){
					case 'r':
					case 'R':
						minX=Math.min(e.getX() ,startX);
						minY=Math.min(e.getY(),startY);
						endX=Math.abs(e.getX() - startX);
						endY=Math.abs(e.getY() - startY);
						Rect.setX(endX);
						Rect.setY(endY);
						break;
					case 'e':
					case 'E':
						eraserRect.setX(endX);
						eraserRect.setY(endY);
						break;
					case 'o':
					case 'O':
						Oval.setX(endX);
						Oval.setY(endY);
						break;
					case 'l':
					case 'L':
						Line.setWidth(startX);
						Line.setHeight(startY);
						System.out.println(Line.getWidth()+" "+Line.getHeight());
						break;
					case'p':
						pen.setX(endX);
						pen.setY(endY);
						break;
					case 'm':
						eraser.setX(endX);
						eraser.setY(endY);
						break;
				}
				//repaint();
			}
			public void mouseReleased(MouseEvent e){
				endX=e.getX();
				endY=e.getY();
				switch(shapeChar){
					case 'r':
					case 'R':
						Rect.setWidth(endX);
						Rect.setHeight(endY);
						shapes.add(Rect);
						break;
					case 'o':
					case 'O':
						Oval.setWidth(endX);
						Oval.setHeight(endY);
						shapes.add(Oval);
						break;
					case 'l':
					case 'L':
						Line.setWidth(endX);
						Line.setHeight(endY);
						shapes.add(Line);
						break;
					case'p':
						pen.setWidth(endX);
						pen.setHeight(endY);
						shapes.add(pen);
						break;
					case 'm':
						eraser.setWidth(endX);
						eraser.setHeight(endY);
						shapes.add(eraser);
						break;
					case 'e':
						eraserRect.setWidth(endX);
						eraserRect.setHeight(endY);		
				}
				repaint();
				}
			}
public void  paint(Graphics g){
			for (int i=0;i<shapes.size();i++){
					if(sol== false){
						if(shapeChar == 'r'){
							switch (col){
								case'R':
								case'r':
									g.setColor(Color.RED);
									g.drawRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'G':
							case 'g':
								g.setColor(Color.GREEN);
								g.drawRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'B':
							case 'b':
								g.setColor(Color.BLUE);
								g.drawRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;		
					}
					}else if(shapeChar == 'o'){
								switch (col){
							case'R':
							case'r':
								g.setColor(Color.RED);
								g.drawOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'G':
							case 'g':
								g.setColor(Color.GREEN);
								g.drawOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'B':
							case 'b':
								g.setColor(Color.BLUE);
								g.drawOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
								}
								}else if (shapeChar =='l'){
									switch (col){
											case'R':
											case'r':
												g.setColor(Color.RED);
												g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
												break;
											case 'G':
											case 'g':
												g.setColor(Color.GREEN);
												g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
												break;
											case 'B':
											case 'b':
												g.setColor(Color.BLUE);
												g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
												break;
						}
						}else if (shapeChar == 'm'){
							g.setColor(Color.WHITE);
							g.drawRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());	
					}
			}else{
				if(shapeChar == 'r'){
							switch (col){
							case'R':
							case'r':
								g.setColor(Color.RED);
								g.fillRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'G':
							case 'g':
								g.setColor(Color.GREEN);
								g.fillRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'B':
							case 'b':
								g.setColor(Color.BLUE);
								g.fillRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;		
					}
					}else if(shapeChar == 'o'){
								switch (col){
							case'R':
							case'r':
								g.setColor(Color.RED);
								g.fillOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'G':
							case 'g':
								g.setColor(Color.GREEN);
								g.fillOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
							case 'B':
							case 'b':
								g.setColor(Color.BLUE);
								g.fillOval(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
								break;
								}
								}else if (shapeChar =='l'){
						switch (col){
							case'R':
							case'r':
								g.setColor(Color.RED);
								g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
								break;
							case 'G':
							case 'g':
								g.setColor(Color.GREEN);
								g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
								break;
							case 'B':
							case 'b':
								g.setColor(Color.BLUE);
								g.drawLine(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(), shapes.get(i).getWidth());
								break;
							}
					}else if (shapeChar == 'm'){
							g.setColor(Color.WHITE);
							g.drawRect(shapes.get(i).GetX(),shapes.get(i).GetY(),shapes.get(i).getHeight(),shapes.get(i).getWidth());
			}
			}
			}
		}//paint
}		
			
		

