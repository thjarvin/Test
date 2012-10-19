package my.git.test;

import java.util.HashMap;
import java.util.Map;

public class EventCalendar {
	private static int eventIdCounter = 0;
	private static Map<Integer, Event> eventMap = new HashMap<Integer, Event>();
	
	public int addEvent(Event event) {
		eventMap.put(eventIdCounter++, event);
		return eventIdCounter;
	}
}
