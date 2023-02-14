import java.awt.*;  //frame,label,panel class present in package
import java.awt.event.*;    //window close
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.StubNotFoundException;

import javax.swing.Action;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

public class AwtFrame
{
    //Chracteristics
    Frame mainFrame;
    Label headerLabel;
    Label statusLabel;
    Panel controlPanel;

    //Constructor
    public AwtFrame()
    {
        //Frame class Object
        mainFrame=new Frame("Marvellous Infosystem");  //constructor call
        mainFrame.setSize(400,400);            
        mainFrame.setLayout(new GridLayout(3,1));   

        mainFrame.addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            { 
                System.exit(0);                       
            } 
        });

        headerLabel=new Label();    //object lable class
        headerLabel.setAlignment(Label.CENTER);  

        statusLabel=new Label();               
        statusLabel.setAlignment(Label.CENTER);  

        statusLabel.setSize(350,100);  
        mainFrame.setBackground(Color.YELLOW);

        controlPanel=new Panel();                   
        controlPanel.setLayout(new FlowLayout());      

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
    }

    private void Display()
    {
        headerLabel.setText("Please select batch");
        
        Button PPA = new Button("PPA");
        Button LB = new Button("LB");
        Button Angular = new Button("Angular");
        
        PPA.setActionCommand("PPA");
        LB.setActionCommand("LB");
        Angular.setActionCommand("Angular");
        
        PPA.addActionListener(new MyListener());
        LB.addActionListener(new MyListener());
        Angular.addActionListener(new MyListener());
        
        controlPanel.add(PPA);
        controlPanel.add(LB);
        controlPanel.add(Angular);
        
        mainFrame.setVisible(true);
    }
    
    interface ActionListener
    {
        public void actionPerformed(ActionEvent e);
    }

    class MyListener implements ActionListener, java.awt.event.ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String command=e.getActionCommand();

            if(command.equals("PPA"))
            {
                statusLabel.setText("Pre-Placements Activity batch Selected");
            }
            else if(command.equals("LB"))
            {
                statusLabel.setText("Logic Building");
            }
            else if(command.equals("Angular"))
            {
                statusLabel.setText("Web Devlopment Using Angular");
            }
        }

    }

    public static void main(String arg[])
    {
        AwtFrame obj=new AwtFrame();
        obj.Display();
    }
}


