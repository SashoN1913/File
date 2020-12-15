package File;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.file.Files;

import javax.swing.JComponent;

public class GUI extends JComponent
{
	private Folder folder;
	
	public GUI()
	{
		this.folder = new Folder();
	}
	
	public GUI(Folder folder)
	{
		this.folder = folder;
	}
	
	private void drawFolder(Graphics graphics)
	{
		Graphics2D g = (Graphics2D) graphics;
		g.setColor(Color.YELLOW);
		g.drawRect(20, 20, 50, 30);
		g.fillRect(20, 20, 50, 30);
		g.setColor(Color.black);
		g.drawString(folder.getName(), 25, 40);
		g.drawLine(40, 160, 40, 50);
		FileSystemObject[] fso = folder.getFiles();
		int tmp = 0;
		for(int i = 0; i < fso.length; i++)
		{
			if(fso[i] != null)
			{
				if(fso[i].getClass().equals(Folder.class))
				{
					tmp += 65;
					g.setColor(Color.YELLOW);
					g.drawRect(20 + tmp, 90, 50 + tmp, 30);
					g.fillRect(20 + tmp, 90, 50 + tmp, 30);
					g.setColor(Color.BLACK);
					g.drawString(fso[i].getName(), 105, 115);
				}
			}
		}
		g.setColor(Color.black);
		g.drawLine(40, 105, 85, 105);
	}
	
	public void drawFile(Graphics graphics)
	{
		Graphics2D g = (Graphics2D) graphics;
		g.setColor(Color.black);
		FileSystemObject[] fso = folder.getFiles();
		int tmp = 0;
		for(int i = 0; i < fso.length; i++)
		{
			if(fso[i] != null)
			{
				if(fso[i].getClass().equals(File.class))
				{
					tmp += 90;
					g.setColor(Color.black);
					g.drawLine(40, 70 + tmp, 80, 70 + tmp);
					g.setColor(Color.WHITE);
					g.drawRect(5 + tmp, 150, 50, 30);
					g.fillRect(5 + tmp, 150, 50, 30);
					g.setColor(Color.black);
					g.drawString(fso[i].getName(), 95, 75 + tmp);
					//tmp += 65;
				}
			}
		}
		
	}
	
	public void paintComponent(Graphics graphics)
	{	
		super.paintComponent(graphics);
		drawFolder(graphics);
		drawFile(graphics);
	}
}
