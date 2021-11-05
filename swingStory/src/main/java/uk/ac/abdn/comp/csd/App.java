package uk.ac.abdn.comp.csd;
import com.github.javafaker.*;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 * Tell me a story
 */
public class App
{
    private static String story(){
    Faker faker = new Faker();
    String name = faker.name().fullName();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String story = ( "Hello " + name + " " + firstName + " " + lastName );
    return story;
    }
    private static void createAndShowGUI(){
        //Create and set up the window
        JFrame frame = new JFrame("Swing me a story");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String story = story();
        
        //Add the labels
        JLabel introLabel = new JLabel("The story is: ");
        JLabel storyLabel = new JLabel(story);
        frame.getContentPane().add(introLabel, BorderLayout.PAGE_START);
        frame.getContentPane().add(storyLabel, BorderLayout.LINE_START);
        
        //Display the window.
        frame.setSize(400,300);
        frame.setVisible(true);
    }
    public static void main( String[] args)
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
}