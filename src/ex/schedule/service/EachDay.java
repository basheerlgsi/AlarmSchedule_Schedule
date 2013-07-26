package ex.schedule.service;

import ex.os.service.TimeService;

public class EachDay implements Day {
	public boolean isTheDayAndTime(int scheduleDay, TimeService timeService,
			int minutes) {
		return ((scheduleDay == timeService.getCurrentDay()) && (minutes == timeService
				.getCurrentMinute()));
	}

}
