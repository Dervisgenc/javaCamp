package odev3;

public class InstructerManager extends UserManager {
	public InstructerManager(Logger logger) {
		super(logger);
	}

	public void createTimeTable(Instructer �nstructer) {
		System.out.println("Ders �izelgesi Olu�tur");
		this.logger.log("Logland�");
	}

	public void startLesson (Instructer �nstructer) {
		System.out.println("Dersi Ba�lat");
		this.logger.log("Logland�");
	}
}
