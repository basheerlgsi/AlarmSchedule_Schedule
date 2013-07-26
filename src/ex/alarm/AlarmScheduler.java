package ex.alarm;

import java.util.ArrayList;
import ex.alarm.driver.AlarmAlert;
import ex.os.service.TimeService;
import ex.schedule.service.Schedule;

public class AlarmScheduler {

	private AlarmAlert alarmAlert;
	private TimeService timeService;
	ArrayList<Schedule> scheduleList;

	public AlarmScheduler(AlarmAlert alarmAlert, TimeService timeService) {
		this.alarmAlert = alarmAlert;
		this.timeService = timeService;
		scheduleList = new ArrayList<Schedule>();
	}

	public void wakeUp() {
		boolean isScheduled;
		for (Schedule list : scheduleList) {
			isScheduled = list.day.isTheDayAndTime(list.scheduleDay,
					timeService, list.minutes);
			if (isScheduled)
				alarmAlert.startAlarm();
		}
	}

	public void addSchedule(int day, int minute) {
		scheduleList.add(new Schedule(day, minute));
	}

}
