package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

class gui{
	
    public static void main(String args[]){
    	
     //Creating the frame
    	JFrame frame = new JFrame("Chat Box");
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(400, 500);
    	
    //Creating the MenuBar and adding components
    	JMenuBar menuBar = new JMenuBar();
    	JMenu file = new JMenu ("File");
    	JMenu help = new JMenu ("Help");
    	menuBar.add(file);
    	menuBar.add(help);
    	JMenuItem open = new JMenuItem ("Open");
    	JMenuItem saveAs = new JMenuItem ("Save As");
    	file.add(open);
    	file.add(saveAs);
    	JMenuItem noHelp = new JMenuItem("There is no HELP");
    	help.add(noHelp);
    	
    //Creating the panel at bottom and adding components
    	JPanel panel = new JPanel(); //the panel is not visible in output
    	JLabel label = new JLabel("Enter Text");
    	JTextField textF = new JTextField(10); //accepts up to 10 character
    	JButton send = new JButton("Send");
    	JButton reset = new JButton("Reset");
    	panel.add(label); //Components added using FlowLayout
    	panel.add(textF);
    	panel.add(send);
    	panel.add(reset);
    	
    //Text area at the center
    	JTextArea textA = new JTextArea();
    	
    //Adding components to the frame. 
    	frame.getContentPane().add(BorderLayout.SOUTH, panel);
    	frame.getContentPane().add(BorderLayout.NORTH, menuBar);
    	frame.getContentPane().add(BorderLayout.CENTER, textA);
    	
    	frame.setVisible(true);
    	
    			}
}