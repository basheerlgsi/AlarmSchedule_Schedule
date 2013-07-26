package ex.schedule.service;

public class Schedule {

	public Day day;
	public int scheduleDay;
	public int minutes;

	public Schedule(int day, int minutes) {
		this.scheduleDay = day;
		this.minutes = minutes;
		if (day < 7)
			this.day = new EachDay();
		else if (day == 7)
			this.day = new WorkingDay();
		else if (day == 8)
			this.day = new EveryDay();
	}
}
