import java.util.ArrayList;

public class StudentRecords {
    private ArrayList<String> studentNames;
    private ArrayList<Integer> studentGrades;
    
    /**
     * Question 1: Constructor (3 points)
     * - Initialize both ArrayLists (1 point)
     * - Add three students with their grades (2 points)
     * Example data could be: "Alice": 95, "Bob": 89, "Charlie": 78
     * But you can use any names and valid grades you choose!
     */
    public StudentRecords() {
        // TODO: Initialize ArrayLists and add three students with grades
    }
    
    /**
     * Question 2: Remove Elements (5 points)
     * - Correctly identify failing grades (1 point)
     * - Remove failing students from both lists (3 points)
     * - Keep lists in sync (1 point)
     */
    public void removeFailingStudents() {
        // TODO: Remove all students with grades below 70
    }
    
    /**
     * Question 3: Insert Elements (4 points)
     * - Handle valid index insertion (2 points)
     * - Handle invalid index by adding to end (1 point)
     * - Maintain list synchronization (1 point)
     */
    public void addStudent(String name, int grade, int index) {
        // TODO: Add student and grade at the specified index
    }
    
    /**
     * Question 4: ArrayList Traversal (4 points)
     * - Correctly sum all grades (1 point)
     * - Calculate correct average (2 points)
     * - Handle empty list case (1 point)
     */
    public double getAverageGrade() {
        // TODO: Calculate and return the average grade
        return 0.0;
    }
    
    /**
     * Question 5: ArrayList Modification (4 points)
     * - Add bonus points to all grades (2 points)
     * - Enforce maximum grade of 100 (1 point)
     * - Maintain list synchronization (1 point)
     */
    public void applyBonusPoints() {
        // TODO: Add 5 points to all grades (max 100)
    }
    
    // Helper method to get string representation of records
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentNames.size(); i++) {
            sb.append(studentNames.get(i))
              .append(": ")
              .append(studentGrades.get(i))
              .append("\n");
        }
        return sb.toString();
    }
} 