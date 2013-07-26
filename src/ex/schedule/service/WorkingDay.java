package ex.schedule.service;

import ex.schedule.service.ScheduleDay;
import ex.os.service.TimeService;

public class WorkingDay implements Day {

	@Override
	public boolean isTheDayAndTime(int scheduleDay, TimeService timeService,
			int minutes) {
		if ((timeService.getCurrentDay() > ScheduleDay.SUNDAY && timeService
				.getCurrentDay() < ScheduleDay.WORKINGDAYS)
				&& (minutes == timeService.getCurrentMinute()))
			return true;
		return false;

	}

}
