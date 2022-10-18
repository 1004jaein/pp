public class StudentScores
{
private final int MAX_STUDENTS = 100;
private int[] scores;
private int numStudents;
private Student[] students;
public StudentScores()
{
	students = new Student[MAX_STUDENTS];
	numStudents = 0;
}
public void add(String name, int score)
{
	if (numStudents >= MAX_STUDENTS)
	return; // not enough space to add new student score
	scores[numStudents] = score;
	numStudents++;
}
public String getHighest()
{
	if (numStudents == 0)
	return null;
	int highest = 0;
	for (int i = 1; i < numStudents; i++)
	if (scores[i] > scores[highest])
	highest = i;
	return students[highest].toString();
}
public String getLowest()
{
	if (numStudents == 0)
	return null;
	int lowest = 0;
	for (int i = 1; i < numStudents; i++)
	if (scores[i] < scores[lowest])
	lowest = i;
	return students[lowest].toString();
	}
}