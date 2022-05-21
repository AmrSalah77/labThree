package watch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest_Stub {
    Watch test;

    @BeforeEach
    void init(){
        test = new Watch();
    }

    @Test
    void stub_changState() {
        test.State_Normal = "Time";
        test.watch('a');
        assertEquals("Date",test.State_Normal);
    }

}

