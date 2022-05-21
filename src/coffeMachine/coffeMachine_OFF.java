package coffeMachine;

public class coffeMachine_OFF {
    public String changeState(int m){
        String State ="OFF";
        if (m>0)
            State = "ON";
        return State;
    }
    public String stub_changeState(int m){
        String State ="ON";
        return State;
    }
}
