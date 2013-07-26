package ex.schedule.service;

import ex.os.service.TimeService;

public interface Day {

	public boolean isTheDayAndTime(int scheduleDay, TimeService timeService,
			int minutes);

}
