package todoapp;



import javax.swing.*; // Swing components
import java.awt.*;    // Layouts
import java.awt.event.*; // ActionListener

public class ToDoApps {

    public static void main(String[] args) {

        // Create the main frame (window)
        JFrame frame = new JFrame("To-Do List App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create top panel (for input + buttons)
        JPanel topPanel = new JPanel(new FlowLayout());

        // Input field to enter tasks
        JTextField taskField = new JTextField(20);

        // Buttons to add and delete tasks
        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Task");

        // Add input and buttons to top panel
        topPanel.add(taskField);
        topPanel.add(addButton);
        topPanel.add(deleteButton);

        // Create list model and list to store tasks
        DefaultListModel<String> taskListModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(taskListModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add scroll pane for list
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add Task button functionality
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task); // Add task to list
                    taskField.setText(""); // Clear input field
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a task!");
                }
            }
        });

        // Delete Task button functionality
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex); // Remove selected task
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a task to delete!");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}


