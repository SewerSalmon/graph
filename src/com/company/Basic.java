package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Basic extends JPanel {
    private JFrame frame;
    private int[] data;
    public Basic(int height,int width, int[] Data){
        frame = new JFrame("Basic Graph");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
        data = Data;
    }

    @Override
    public void paintComponent(Graphics g) {
        int left = 50;    // hard-coded just for testing
        int top = 80;
        int width = data.length*10;
        int height = 100;
        g.setColor(Color.BLACK);
        g.fillRect(left, top, width, height);

        g.setColor(Color.BLUE);
        for (int x = 0;x<data.length;x++ )
        g.fillRect((left+x*10)+2,top+height-data[x],5,data[x]);
        }


}
