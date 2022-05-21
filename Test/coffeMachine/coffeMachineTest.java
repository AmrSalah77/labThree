package coffeMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffeeMachineTest {
    coffeMachine test;

    @BeforeEach
    void init(){
        test = new coffeMachine();
    }

    @Nested
    class OffTest {
        @BeforeEach
        public void init () {
            test.State = "OFF";
        }
        @Test
        void mGreaterThanZeroExpectedOutputOn() {
            test.coffeMachine(1);
            assertEquals("ON",test.State);
        }
        @Test
        void mGreaterThanZeroExpectedOutputIdle() {
            test.coffeMachine(1);
            assertEquals("idle",test.State_Coffee);
        }
        @Test
        void mGreaterThanZeroExpectedOutputEmpty() {
            test.coffeMachine(1);
            assertEquals("empty",test.State_Money);
        }
    }

    @Nested
    class OnTest {
        @BeforeEach
        public void init () {
            test.State = "ON";
        }
        @Test
        void mGreaterThanZeroExpectedOutputIdle() {
            test.coffeMachine(1);
            assertEquals("busy",test.State_Coffee);
        }
        @Test
        void mGreaterThanZeroExpectedOutputEmpty() {
            test.coffeMachine(1);
            assertEquals("not empty",test.State_Money);
        }
    }
}

