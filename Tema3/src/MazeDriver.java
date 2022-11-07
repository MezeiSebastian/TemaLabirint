import javax.swing.*;
import java.io.File;
import java.util.List;

public class MazeDriver {
    public static void main(String[] args) throws Exception {
        File maze1 = new File("src/resources/maze2.txt");
//        File maze2 = new File("src/main/resources/maze/maze2.txt");

        execute(maze1);
    }

    private static void execute(File file) throws Exception {
        Maze maze = new Maze(file);
        bfs(maze);
        createAndShowGui(maze);
    }

    private static void createAndShowGui(Maze maze) {
        DrawMaze mainPanel = new DrawMaze(maze);

        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    private static void bfs(Maze maze) {
        BFSMazeSolver bfs = new BFSMazeSolver();
        List<Coordinate> path = bfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }


}