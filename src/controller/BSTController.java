package controller;

import model.BSTModel;
import model.TreeNode;
import view.TreePanel;

import javax.swing.*;

public class BSTController {
    private BSTModel model;
    private TreePanel view;

    public BSTController(BSTModel model, TreePanel view) {
        this.model = model;
        this.view = view;
    }

    public void handleInsert(int value) {
        // TODO: insert into model, update view
    }

    public void handlePreorder() { /* TODO */ }
    public void handleInorder() { /* TODO */ }
    public void handlePostorder() { /* TODO */ }
    public void handleLevelOrder() { /* TODO */ }

    public void setupUI() {
        JFrame frame = new JFrame("Dynamic BST Auto-Balance");
        // TODO: add components, buttons, and listeners
    }
}
