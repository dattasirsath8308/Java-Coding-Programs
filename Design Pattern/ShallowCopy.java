import javax.print.attribute.standard.MediaSize.NA;

class House {
    private String Name;
    private School school;

    public House(String Name, School schoolName) {
        this.Name = Name;
        this.school = schoolName;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return Name;
    }

    public School getSchool() {
        return school;
    }

}

class School {
    private String schoolName;

    public School(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}

public class ShallowCopy {

    public static void main(String[] args) {

        School school = new School("Aryan");
        House original = new House("Gotya", school);

        House shallowcopy = new House(original.getName(), original.getSchool()) ;

        System.out.println(original.getName());
        System.out.println(original.getSchool().getSchoolName()); // Aryan
        System.out.println(shallowcopy.getSchool().getSchoolName()); // 

        
        System.out.println("After Shallow Copy : ");
        // 
        school.setSchoolName("Narayan");

        System.out.println(original.getSchool().getSchoolName()); // Aryan
        System.out.println(shallowcopy.getSchool().getSchoolName()); // 
        


    }
}
