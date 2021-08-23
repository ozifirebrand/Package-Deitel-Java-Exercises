package ClassWork;
/*Program should get the number of students
    the school has. 5 in this case
 It also asks how many subjects they do. 3 in this case
 Collects each students scores per subject
 Display scores in tabular form
 Display total, average score and rank

 It should display
 Overall highest scoring student as in student 1
 Overall lowest score
 Lowest score per subject
 Average score per subjects

 HOW?
     My array is going to be a 5 by 3 array

     Display "how many students"
     User inputs value
     Display "how many subjects"
     User inputs value
     Declare array with inputs by user as no of rows and columns
     Students as rows, subjects as columns

     Declare each row and initialise with the inputs that the user will give
     Display "enter student (with student's id) scores"
     User inputs scores separated by spaces
     These are the student's scores for each subject

     Each subject at every index has a value of its index plus one

     Each student at a particular index has a name which is the index value plus one

     To get each students total score, add the scores in each row

     To get the total score per subject, add the values in each column

     To get the highest score per subject, compare the scores per column equating the first
     value at index [0][0] as the highest and compare other values the the current highest
        If the next number is higher than the last highest number, then the current value
        is the highest no

     To get the lowest score per subject, the same concept applies except that the number at
     [0][0] is the lowest score and other scores in the column are compared against it

     To get the average score per subject, sum the individual columns and divide by the
     total number of students

     To get the highest score by a student, the values in a row are compared against the
     value at index [0][0]. The highest score here becomes the highest score of the student

     This also applies to each student's lowest score. If next score is lesser than the
     lowest score, then the score is the lowest score

     To get the lowest scoring student, compare the sums obtained from each student and
     equate the first sum to the lowest score. If the next sum is lesser than the lowest,
     the current sum is the lowest sum

     To get the highest scoring student, compare the sums obtained from each student.
     Equate the first sum to the highest score. If the next sum is greater than the
     highest number, then the sum is the highest student's score.

     To display the students scores in tabular form,
        print each value represented by their index according to
        the number of columns then go to the next line
     */
public class StudentsArray {
}
