package odev3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Dervi�");
		student1.setLastName("Gen�");
		student1.setSchool("�T�");
		student1.setLessonsLearned("Java");
		Student student2 = new Student();
		student2.setName("Halit");
		student2.setLastName("�zdemir");
		student2.setLessonsLearned("C#");
		student2.setSchool("�OM�");

		System.out.println(student1.getName());
		
		
		Instructer instructer = new Instructer();
		instructer.setName("Engin");
		instructer.setLastName("Ddemiro�");
		instructer.setLessonsTaught("C#"+" Java");
		instructer.setcV("Web Devoloper");
		System.out.println(student1.getId());


		
		StudentManager studentManager1 = new StudentManager(new DataBaseLogger());
		studentManager1.editProfile(student1);
		studentManager1.joinLesson(student1);
		InstructerManager �nsttructerManager=new InstructerManager(new EmailLogger());
		�nsttructerManager.createTimeTable(instructer);
							 
	
	}

}
