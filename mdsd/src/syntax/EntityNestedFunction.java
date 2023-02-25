/*
 * Modified example from Ulrik Pagh Schultz Lundquist example
 * https://github.com/ulrikpaghschultz/MDSD/blob/master/src/examples/misc/EntitiesNested.java
 * 
 * */

package syntax;

public class EntityNestedFunction {
	
	public void build() {
		system("University",
			entity("Person",
		    	attribute("name", "String"),
		    	attribute("age", "Number")),
	    	entity("Student",
		    	attribute("id", "Number")),
	    	entity("Teacher"));
	}
	
	// Builder definitions, placed in this class to show declarations, place elsewhere in real system
	private interface Entity { }
	private interface Attribute { }
	static void system(String name, Entity...entities) { throw new Error("Not implemented"); }
	static Entity entity(String name, Attribute...attributes) { throw new Error("Not implemented"); }
	static Attribute attribute(String name, String type) { throw new Error("Not implemented"); }	
}
// example from class lecture 3
class Transition {
	private String event;
	private State toState;
	public Transition(String event, State toState) {
		this.event = event;
		this.toState = toState;
	}
	public setToState(State toState) {
		this.toState = toState;
	}
}

class TransitionBuilder {
	Transition currentEvent;
	public void when(String event) {
		currentEvent = new Transition(event);
	}
	public void to(String toState) {
		State state =...<toState>;
		currentTransition.setToState(state);
	}
}