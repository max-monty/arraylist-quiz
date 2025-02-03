# ArrayList Quiz (25 Points)

## Overview
This 45-minute quiz tests your understanding of ArrayList operations in Java. You will implement a student records system that manages parallel ArrayLists of student names and grades.

## Instructions
1. You have 45 minutes to complete this quiz
2. Implement all methods in the `StudentRecords` class (20 points)
3. Write test code in `QuizTester` to demonstrate your implementation works (5 points)
4. You may use the Java API documentation
5. Submit both your `StudentRecords.java` and `QuizTester.java` files

## Implementation Grading Criteria (20 points)

### Question 1: Constructor (3 points)
Implement a constructor that:
- Properly initializes both ArrayLists (1 point)
- Adds three students with their grades (2 points)
  - Use any names and valid grades (0-100)
  - Both lists must be kept in sync

### Question 2: Remove Failing Students (5 points)
Implement removeFailingStudents() that:
- Correctly identifies grades below 70 (1 point)
- Removes failing students from both lists (3 points)
- Maintains synchronization between lists (1 point)

### Question 3: Insert Student (4 points)
Implement addStudent() that:
- Correctly inserts at valid index (2 points)
- Handles invalid index by adding to end (1 point)
- Maintains list synchronization (1 point)

### Question 4: Calculate Average (4 points)
Implement getAverageGrade() that:
- Correctly sums all grades (1 point)
- Calculates proper average (2 points)
- Returns 0.0 for empty list (1 point)

### Question 5: Apply Bonus (4 points)
Implement applyBonusPoints() that:
- Adds 5 points to all grades (2 points)
- Ensures no grade exceeds 100 (1 point)
- Maintains list synchronization (1 point)

## Testing Requirements (5 points)

Your QuizTester.java must include clear tests that demonstrate:

1. Constructor Test (1 point)
   - Show initial state with 3 students

2. Add/Insert Test (1 point)
   - Test adding at valid index
   - Test adding at invalid index
   - Show before/after states

3. Remove Failing Test (1 point)
   - Include both passing/failing students
   - Show before/after states

4. Average Calculation Test (1 point)
   - Test with multiple students
   - Test with empty list
   - Show calculation results

5. Bonus Points Test (1 point)
   - Test with grades near 100
   - Show before/after states

## Example Test Output Format
```bash
=== Testing Constructor ===
Initial Records:
John: 95
Sarah: 88
Mike: 73

=== Testing Add Student ===
Adding David (65) at index 1...
Updated Records:
John: 95
David: 65
Sarah: 88
Mike: 73

=== Testing Remove Failing ===
Before removal:
John: 95
David: 65
Sarah: 88
Mike: 73

After removing failing students:
John: 95
Sarah: 88
Mike: 73

=== Testing Average ===
Current average grade: 85.33

=== Testing Bonus Points ===
Before bonus:
John: 95
Sarah: 88
Mike: 73
After 5 point bonus:
John: 100
Sarah: 93
Mike: 78
```
## Tips
- Use the toString() method to display records (it can be called implicitly)
- Test edge cases (empty lists, invalid indices, etc.)
- Keep your lists synchronized at all times
- Comment your code to explain your logic