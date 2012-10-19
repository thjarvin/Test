package my.git.test;

import java.util.ArrayList;
import java.util.List;

public class EventCalendar {
	private static List<Event> events = new ArrayList<Event>();
	
	public int addEvent(Event event) {
		events.add(event);
		return events.size();
	}
}
