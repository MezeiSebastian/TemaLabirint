
import java.awt.*;
import javax.swing.*;

    public class DrawMaze extends JPanel {
        private static final int RECT_X = 20;
        private static final int RECT_Y = RECT_X;
        private static final int RECT_WIDTH = 50;
        private static final int RECT_HEIGHT = RECT_WIDTH;
        private  Maze maze;
        public DrawMaze(Maze maze){
            this.maze = maze;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int[][] mazeLayout = maze.getSolvedMaze();
            int width = maze.getWidth();
            int height = maze.getHeight();

            for(int i = 0;i<height;i++){
                for(int j = 0;j<width;j++){
                    if(mazeLayout[i][j]==1) {
                        g.setColor(Color.BLACK);
                        g.fillRect((j+1) * 20 + 10, (i+1) * 20 + 10, 20, 20);
                    }
                    if(mazeLayout[i][j]==4){
                        g.setColor(Color.RED);
                        g.fillOval((j+1) * 20 + 10, (i+1) * 20 + 10, 20, 20);
                    }
                }
            }
            // draw the rectangle here
//            g.fillRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
        }

        @Override
        public Dimension getPreferredSize() {
            // so that our GUI is big enough
            return new Dimension(1200, 600);
        }

        // create the GUI explicitly on the Swing event thread


//        public static void main(String[] args) {
//            SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                    createAndShowGui();
//                }
//            });
//        }
    }

