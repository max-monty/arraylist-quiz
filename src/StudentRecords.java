import java.util.ArrayList;

public class StudentRecords {
    private ArrayList<String> studentNames;
    private ArrayList<Integer> studentGrades;
    
    /**
     * Question 1: Constructor (15 points)
     * - Initialize both ArrayLists (5 points)
     * - Add three students with their grades (10 points)
     * Example data could be: "Alice": 95, "Bob": 89, "Charlie": 78
     * But you can use any names and valid grades you choose!
     */
    public StudentRecords() {
        // TODO: Initialize ArrayLists and add three students with grades
    }
    
    /**
     * Question 2: Remove Elements (25 points)
     * - Correctly identify failing grades (5 points)
     * - Remove failing students from both lists (15 points)
     * - Keep lists in sync (5 points)
     */
    public void removeFailingStudents() {
        // TODO: Remove all students with grades below 70
    }
    
    /**
     * Question 3: Insert Elements (20 points)
     * - Handle valid index insertion (10 points)
     * - Handle invalid index by adding to end (5 points)
     * - Maintain list synchronization (5 points)
     */
    public void addStudent(String name, int grade, int index) {
        // TODO: Add student and grade at the specified index
    }
    
    /**
     * Question 4: ArrayList Traversal (20 points)
     * - Correctly sum all grades (5 points)
     * - Calculate correct average (10 points)
     * - Handle empty list case (5 points)
     */
    public double getAverageGrade() {
        // TODO: Calculate and return the average grade
        return 0.0;
    }
    
    /**
     * Question 5: ArrayList Modification (20 points)
     * - Add bonus points to all grades (10 points)
     * - Enforce maximum grade of 100 (5 points)
     * - Maintain list synchronization (5 points)
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