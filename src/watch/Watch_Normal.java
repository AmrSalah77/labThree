package watch;

public class Watch_Normal {
    public String changeState(String State){
            if (State.equals("Time"))
                State = "Date";
            else
                State = "Time";

        return State;
    }
    public String stub_changeState(String State){
        State ="Date";
        return State;
    }
}
