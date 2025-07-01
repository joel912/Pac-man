

import javax.swing.*;


public class App {
     public static void main(String[] args) throws Exception {
          int rowCount = 21;
          int columnCount = 19;
          int tileSize = 32;
          int boardwidth = columnCount * tileSize;
          int boardheight = rowCount * tileSize;

          JFrame frame = new JFrame("Pac Man");
          frame.setVisible(true);
          frame.setSize(boardwidth, boardheight);
          frame.setLocationRelativeTo(null);
          frame.setResizable(false);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Pacman pacman = new Pacman();  // assuming Pacman extends JPanel
          frame.add(pacman);
          frame.pack();
          pacman.requestFocus();  // focus goes to the pacman component, not pacmanGame
     }
}
