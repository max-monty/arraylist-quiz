# ArrayList Quiz (100 Points)

## Overview
This 45-minute quiz tests your understanding of ArrayList operations in Java. You will implement a student records system that manages parallel ArrayLists of student names and grades.

## Instructions
1. You have 45 minutes to complete this quiz
2. Implement all methods in the `StudentRecords` class (80 points)
3. Write test code in `QuizTester` to demonstrate your implementation works (20 points)
4. You may use the Java API documentation
5. Submit both your `StudentRecords.java` and `QuizTester.java` files

## Implementation Grading Criteria (80 points)

### Question 1: Constructor (12 points)
Implement a constructor that:
- Properly initializes both ArrayLists (4 points)
- Adds three students with their grades (8 points)
  - Use any names and valid grades (0-100)
  - Both lists must be kept in sync

### Question 2: Remove Failing Students (20 points)
Implement removeFailingStudents() that:
- Correctly identifies grades below 70 (4 points)
- Removes failing students from both lists (12 points)
- Maintains synchronization between lists (4 points)

### Question 3: Insert Student (16 points)
Implement addStudent() that:
- Correctly inserts at valid index (8 points)
- Handles invalid index by adding to end (4 points)
- Maintains list synchronization (4 points)

### Question 4: Calculate Average (16 points)
Implement getAverageGrade() that:
- Correctly sums all grades (4 points)
- Calculates proper average (8 points)
- Returns 0.0 for empty list (4 points)

### Question 5: Apply Bonus (16 points)
Implement applyBonusPoints() that:
- Adds 5 points to all grades (8 points)
- Ensures no grade exceeds 100 (4 points)
- Maintains list synchronization (4 points)

## Testing Requirements (20 points)

Your QuizTester.java must include clear tests that demonstrate:

1. Constructor Test (4 points)
   - Show initial state with 3 students

2. Add/Insert Test (4 points)
   - Test adding at valid index
   - Test adding at invalid index
   - Show before/after states

3. Remove Failing Test (4 points)
   - Include both passing/failing students
   - Show before/after states

4. Average Calculation Test (4 points)
   - Test with multiple students
   - Test with empty list
   - Show calculation results

5. Bonus Points Test (4 points)
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