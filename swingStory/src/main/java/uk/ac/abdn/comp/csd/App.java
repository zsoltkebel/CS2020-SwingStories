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
     story.append("One summer day of ");
     story.append(convert(55));
     story.append(" degrees celsius a(n) \n");
     story.append(faker.hipster().word());
     story.append("In a(n) ");
     story.append(faker.hipster().word());
     story.append(" ");
     story.append(faker.job().field() + "\n");
     story.append(" a young ");
     story.append(faker.hobbit().character());
     story.append(" stumbles across a(n) ");
     story.append(faker.ancient().primordial()  + "\n");
     story.append(" which spurs them into conflict with ");
     story.append(faker.starTrek().villain());
     story.append(" and her ");
     story.append(faker.hacker().noun()  + "\n");
     story.append(" culminating in ");
     story.append(faker.leagueOfLegends().summonerSpell()  + "\n");
     story.append(" where someone shouts '");
     story.append(faker.gameOfThrones().quote());
     story.append("!'");
     return story.toString();
    }
    
    public static Integer convert(Integer temp){
     Integer converted = (temp -32) * 5/9;
     return converted;
    }
    
    private static void createAndShowGUI(){
        //Create and set up the window
        JFrame frame = new JFrame("Swing me a story");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String story = story();

        //Add the labels
        JLabel introLabel = new JLabel("The story is: ");
        JTextPane storyPane = new JTextPane();
        storyPane.setText(story);
        frame.getContentPane().add(introLabel, BorderLayout.PAGE_START);
        frame.getContentPane().add(storyPane, BorderLayout.LINE_START);

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
