package 第一章;

import java.applet.Applet;
import java.awt.Graphics;
public class HelloApplet extends Applet
{
   public void paint(Graphics g)
   {
      g.drawString("这是一个最简单的Applet程序",40,50);
 }
}
