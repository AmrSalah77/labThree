package coffeMachine;

public class coffeMachine extends coffeMachine_OFF  {
    String State = "OFF", State_Coffee,State_Money;
    int m=0;
    public void coffeMachine(int input) {
        m = input;
        switch (State) {
            case "OFF" -> {
                if (m>0) {
                    State = stub_changeState(m);
                    State_Coffee = "idle";
                    State_Money = "empty";
                }
            }
            case "ON" -> {
                if (m > 0) {
                    State_Coffee = "busy";
                    State_Money = "not empty";
                    m--;
                }
                if (m == 0){
                    State = "OFF";
                }
            }
        }
    }
}

