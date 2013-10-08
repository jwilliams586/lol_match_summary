import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchSummary extends JFrame {
	public MatchSummary() {
		
	  int team1KillsTotal = 0, team1DeathsTotal = 0, team1AssistsTotal = 0;
	  int team2KillsTotal = 0, team2DeathsTotal = 0, team2AssistsTotal = 0;
	  int counter = 0;
		
	  String[] team1 = new String[5];
	  team1[0] = "Shen";
	  team1[1] = "Shaco";
	  team1[2] = "Veigar";
	  team1[3] = "Graves";
	  team1[4] = "Lulu";
	  
	  int[] team1Kills = new int[5];
	  team1Kills[0] = 2 + (int)(Math.random() * ((9 - 2) + 1));
	  team1Kills[1] = 2 + (int)(Math.random() * ((9 - 2) + 1));
	  team1Kills[2] = 2 + (int)(Math.random() * ((17 - 2) + 1));
	  team1Kills[3] = 2 + (int)(Math.random() * ((17 - 2) + 1));
	  team1Kills[4] = (int)(Math.random() * (3 + 1));
	  
	  for(int i = 0; i < 5; i++) {
		  team1KillsTotal += team1Kills[i];
	  }
	  
	  //Need to know total kills on both teams to make deaths equal other teams kills
	  int[] team2Kills = new int[5];
	  team2Kills[0] = 2 + (int)(Math.random() * ((9 - 2) + 1));
	  team2Kills[1] = 2 + (int)(Math.random() * ((9 - 2) + 1));
	  team2Kills[2] = 2 + (int)(Math.random() * ((17 - 2) + 1));
	  team2Kills[3] = 2 + (int)(Math.random() * ((17 - 2) + 1));
	  team2Kills[4] = (int)(Math.random() * (3 + 1));
	  
	  for(int i = 0; i < 5; i++) {
		  team2KillsTotal += team2Kills[i];
	  }
	  
	  team1DeathsTotal = team2KillsTotal;
	  
	  //Will keep random numbers and just subtract from total kills on other team, and just dump the rest on last champion
	  int[] team1Deaths = new int[5];
	  team1Deaths[0] = (int) (team1DeathsTotal * 0.25);
	  team1Deaths[1] = (int) (team1DeathsTotal * 0.2);
	  team1Deaths[2] = (int) (team1DeathsTotal * 0.15);
	  team1Deaths[3] = (int) (team1DeathsTotal * 0.1);
	  
	  for(int i = 0; i < 4; i++) {
		  counter += team1Deaths[i];
	  }
	  
	  team1Deaths[4] = team1DeathsTotal - counter;	  
	  counter = 0;
	  
	  int[] team1Assists = new int[5];
	  team1Assists[0] = 2 + (int)(Math.random() * ((7 - 2) + 1));
	  team1Assists[1] = 2 + (int)(Math.random() * ((5 - 2) + 1));
	  team1Assists[2] = 2 + (int)(Math.random() * ((10 - 2) + 1));
	  team1Assists[3] = 2 + (int)(Math.random() * ((10 - 2) + 1));
	  team1Assists[4] = 2 + (int)(Math.random() * ((15 - 2) + 1));
	  
	  for(int i = 0; i < 5; i++) {
		  team1AssistsTotal += team1Assists[i];
	  }
	  
	  String[] team2 = new String[5];
	  team2[0] = "Jax";
	  team2[1] = "Lee Sin";
	  team2[2] = "Lux";
	  team2[3] = "Ezreal";
	  team2[4] = "Sona"; 
	  
	  team2DeathsTotal = team1KillsTotal;
	  
	  int[] team2Deaths = new int[5];
	  team2Deaths[0] = (int) (team2DeathsTotal * 0.25);
	  team2Deaths[1] = (int) (team2DeathsTotal * 0.2);
	  team2Deaths[2] = (int) (team2DeathsTotal * 0.15);
	  team2Deaths[3] = (int) (team2DeathsTotal * 0.1);
	  
	  for(int i = 0; i < 4; i++) {
		  counter += team2Deaths[i];
	  }
	  
	  team2Deaths[4] = team2DeathsTotal - counter;	 
	  counter = 0;
	  
	  int[] team2Assists = new int[5];
	  team2Assists[0] = 2 + (int)(Math.random() * ((7 - 2) + 1));
	  team2Assists[1] = 2 + (int)(Math.random() * ((5 - 2) + 1));
	  team2Assists[2] = 2 + (int)(Math.random() * ((10 - 2) + 1));
	  team2Assists[3] = 2 + (int)(Math.random() * ((10 - 2) + 1));
	  team2Assists[4] = 2 + (int)(Math.random() * ((15 - 2) + 1));
	  
	  for(int i = 0; i < 5; i++) {
		  team2AssistsTotal += team2Assists[i];
	  }
		
	  JPanel endMatchPanel = new JPanel();
	  endMatchPanel.setLayout(new GridLayout(3, 2));
	  
	  JPanel statsPanel = new JPanel();
      statsPanel.setLayout(new GridLayout(2, 1));
      
      statsPanel.add(new JLabel("VICTORY!", SwingConstants.CENTER));
      statsPanel.add(new JLabel("Team 1:   " + Integer.toString(team1KillsTotal) + " / " + Integer.toString(team1DeathsTotal) + " / " + Integer.toString(team1AssistsTotal)
    		  + "      Team 2:   " + Integer.toString(team2KillsTotal) + " / " + Integer.toString(team2DeathsTotal) + " / " + Integer.toString(team2AssistsTotal), SwingConstants.CENTER));
  
      
         
      JPanel team1Panel = new JPanel();
      team1Panel.setLayout(new GridLayout(5, 2)); 
      team1Panel.setBorder(BorderFactory.createLineBorder(Color.black));
      
	  team1Panel.add(new JLabel(team1[0]));
	  team1Panel.add(new JLabel(Integer.toString(team1Kills[0]) + " / " + Integer.toString(team1Deaths[0]) + " / " + Integer.toString(team1Assists[0])));
	  team1Panel.add(new JLabel(team1[1]));
	  team1Panel.add(new JLabel(Integer.toString(team1Kills[1]) + " / " + Integer.toString(team1Deaths[1]) + " / " + Integer.toString(team1Assists[1])));
	  team1Panel.add(new JLabel(team1[2]));
	  team1Panel.add(new JLabel(Integer.toString(team1Kills[2]) + " / " + Integer.toString(team1Deaths[2]) + " / " + Integer.toString(team1Assists[2])));
	  team1Panel.add(new JLabel(team1[3]));
	  team1Panel.add(new JLabel(Integer.toString(team1Kills[3]) + " / " + Integer.toString(team1Deaths[3]) + " / " + Integer.toString(team1Assists[3])));
	  team1Panel.add(new JLabel(team1[4]));
	  team1Panel.add(new JLabel(Integer.toString(team1Kills[4]) + " / " + Integer.toString(team1Deaths[4]) + " / " + Integer.toString(team1Assists[4])));
	  
      JPanel team2Panel = new JPanel();
	  team2Panel.setLayout(new GridLayout(5, 2));  
	  team2Panel.setBorder(BorderFactory.createLineBorder(Color.black));

	  team2Panel.add(new JLabel(team2[0]));
	  team2Panel.add(new JLabel(Integer.toString(team2Kills[0]) + " / " + Integer.toString(team2Deaths[0]) + " / " + Integer.toString(team2Assists[0])));
	  team2Panel.add(new JLabel(team2[1]));
	  team2Panel.add(new JLabel(Integer.toString(team2Kills[1]) + " / " + Integer.toString(team2Deaths[1]) + " / " + Integer.toString(team2Assists[1])));
	  team2Panel.add(new JLabel(team2[2]));
	  team2Panel.add(new JLabel(Integer.toString(team2Kills[2]) + " / " + Integer.toString(team2Deaths[2]) + " / " + Integer.toString(team2Assists[2])));
	  team2Panel.add(new JLabel(team2[3]));
	  team2Panel.add(new JLabel(Integer.toString(team2Kills[3]) + " / " + Integer.toString(team2Deaths[3]) + " / " + Integer.toString(team2Assists[3])));
	  team2Panel.add(new JLabel(team2[4]));
	  team2Panel.add(new JLabel(Integer.toString(team2Kills[4]) + " / " + Integer.toString(team2Deaths[4]) + " / " + Integer.toString(team2Assists[4])));
	  
	  JPanel chatPanel = new JPanel();
	  chatPanel.setLayout(new GridLayout(1, 1));
	  JTextField chat = new JTextField(10);
	  chatPanel.add(chat);
	  
	  JPanel refreshPanel = new JPanel();
	  JButton refreshButton = new JButton("Play Again!");
	  refreshButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  //Will dispose and run match summary again
			  dispose();
			  MatchSummary.main(null);

		  }
	  });
	  
	  refreshPanel.add(refreshButton);
	  
	  
	  JPanel emptyPanel = new JPanel();
	  emptyPanel.setLayout(new GridLayout(1, 1));
	  
	  endMatchPanel.add(statsPanel);
	  endMatchPanel.add(emptyPanel);
	  endMatchPanel.add(team1Panel);
	  endMatchPanel.add(chatPanel);
	  endMatchPanel.add(team2Panel);
	  endMatchPanel.add(refreshPanel);
	  
      add(endMatchPanel);
	  
    }
  
    public static void main(String[] args) {
    	MatchSummary frame = new MatchSummary();
    	
	    frame.setTitle("Match Summary");
	    frame.setSize(800, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
    }
}