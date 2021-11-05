package uk.ac.abdn.comp.csd;
import com.github.javafaker.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.lang.StringBuilder;

/**
 * Tell me a story
 */
public class App
{
    private static String story(){
    Faker faker = new Faker();
     StringBuilder story = new StringBuilder();
     story.append("In a(n) ");
     story.append(faker.hipster().word());
     story.append(" ");
     story.append(faker.job().field());
     story.append(" a young ");
     story.append(faker.hobbit().character());
     story.append(" stumbles across a(n) ");
     story.append(faker.ancient().primordial());
     story.append(" which spurs them into conflict with ");
     story.append(faker.starTrek().villain());
     story.append(" and her ");
     story.append(faker.hacker().noun());
     story.append(" culminating in ");
     story.append(faker.leagueOfLegends().summonerSpell());
     story.append(" where someone shouts '");
     story.append(faker.gameOfThrones().quote());
     story.append("!'");
     return story.toString();
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