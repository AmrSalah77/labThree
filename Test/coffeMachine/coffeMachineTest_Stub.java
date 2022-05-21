package coffeMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffeeMachineTest_stub {
    coffeMachine test;

    @BeforeEach
    void init(){
        test = new coffeMachine();
    }
    @Test
    void stub_coffee() {
        test.coffeMachine(1);
        assertEquals("ON",test.State);
    }
}

