import javax.swing.*;
import java.awt.*;

class Microwave
{
	public static void main(String[] args) 
	{
		new Interface("The Front View of a microwave");
	}

}


class Interface extends JFrame
{
	//Creat Left and Right Panel
	JPanel LPanel = new JPanel();
	JPanel RPanel = new JPanel();

	//Creat Button Panel
	JPanel BPanel = new JPanel();

	//Creat Component in Left Panel
	JButton ButtonL = new JButton("WAVE ME PETCH");

	//Creat Component in Right Panel and Button Panel
	JTextField qt = new JTextField("Time to be displayed here");
	JButton Button1 = new JButton("1");
	JButton Button2 = new JButton("2");
	JButton Button3 = new JButton("3");
	JButton Button4 = new JButton("4");
	JButton Button5 = new JButton("5");
	JButton Button6 = new JButton("6");
	JButton Button7 = new JButton("7");
	JButton Button8 = new JButton("8");	
	JButton Button9 = new JButton("9");
	JButton Button0 = new JButton("0");
	JButton ButtonSt = new JButton("Start");
	JButton ButtonSp = new JButton("Stop");

	// JFrame
	public Interface(String title){
		super(title);
		setVisible(true);
		setSize(500,300);

		// set layout of the Frame
		setLayout(new BorderLayout());
		add(LPanel,BorderLayout.CENTER);
		add(RPanel,BorderLayout.EAST);

		// set layout of Left Panel
		LPanel.setLayout(new BorderLayout());
		LPanel.add(ButtonL);

		// set layout of Right Panel
		RPanel.setLayout(new BorderLayout());
		RPanel.add(qt,BorderLayout.NORTH);
		RPanel.add(BPanel,BorderLayout.CENTER);

		// set Button Panel
		BPanel.setLayout(new GridLayout(4,3));
		BPanel.add(Button1);
		BPanel.add(Button2);
		BPanel.add(Button3);
		BPanel.add(Button4);
		BPanel.add(Button5);
		BPanel.add(Button6);
		BPanel.add(Button7);
		BPanel.add(Button8);
		BPanel.add(Button9);
		BPanel.add(Button0);
		BPanel.add(ButtonSt);
		BPanel.add(ButtonSp);

	}

}