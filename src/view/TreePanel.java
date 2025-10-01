package view;

import model.TreeNode;
import javax.swing.*;
import java.awt.*;

public class TreePanel extends JPanel {
    private TreeNode root;

    public TreePanel(TreeNode root) {
        this.root = root;
        setPreferredSize(new Dimension(800, 500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // TODO: draw tree here
    }

    public void setRoot(TreeNode root) {
        this.root = root;
        repaint();
    }

    public void resetVisited(TreeNode node) {
        // TODO: reset visited flags
    }
}
