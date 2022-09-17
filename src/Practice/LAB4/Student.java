package Practice.LAB4;

public class Student extends Person{

    private int[] possibleYears = {1, 2, 3, 4, 5};;
    private int yearsOfStudy;
    private boolean studyStatus;

    public Student(String name, int yearsOfStudy) {
        super(name);
        if (okYearsOfStudy(yearsOfStudy)) {
            this.yearsOfStudy = yearsOfStudy;
        } else {
            yearsOfStudy = 0;
        }
    }

    @Override
    protected void provideSomeInfo() {
        toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearsOfStudy=" + yearsOfStudy +
                ", studyStatus=" + studyStatus +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private boolean okYearsOfStudy(int yearsOfStudy) {
        for (int i = 0; i < possibleYears.length; i++) {
            if (possibleYears[i] == (yearsOfStudy)) {
                studyStatus = true;
            }
        }
        return studyStatus;
    }

}
