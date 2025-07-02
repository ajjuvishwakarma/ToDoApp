# Java To-Do List App (Swing)

📝 A simple desktop-based To-Do List application using Java Swing GUI.

## ✅ Features:
- Add new tasks via text field
- Delete selected tasks from the list
- Scrollable task list
- User-friendly buttons and layout

## 🧱 Technologies Used:
- Java (JDK 8+)
- Swing (JFrame, JPanel, JButton, JList, JScrollPane)

## ▶ How It Works (Short Summary):
1. User enters a task in the input field.
2. Clicks *"Add Task"* → task appears in the list.
3. Selects a task from the list.
4. Clicks *"Delete Task"* → selected task is removed.
5. All components arranged using BorderLayout and FlowLayout.

## 🔧 Note:
If *"Delete Task"* button doesn't show:
- Increase frame width (frame.setSize(600, 400))
- Use FlowLayout(FlowLayout.LEFT, 10, 10) for spacing

## 📁 File:
- ToDoApp.java — main class containing all UI and logic.
