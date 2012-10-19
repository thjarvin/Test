package my.git.test;

import junit.framework.TestCase;

public class EventCalendarTest extends TestCase {
	private EventCalendar eventCalendar;
	
	@Override
	public void setUp() {
		eventCalendar = new EventCalendar();
	}

	public void testAddFirstEventShouldReturn1() {
		assertEquals(1, eventCalendar.addEvent(new Event("First", "First event")));
	}
	
	public void testAddSecondEventShouldReturn2() {
		assertEquals(2, eventCalendar.addEvent(new Event("Second", "Second event")));
	}
}
