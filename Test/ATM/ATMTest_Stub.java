package ATM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest_Stub {
    ATM test;

    @BeforeEach
    void init(){
        test = new ATM();
    }
    @Test
    void stub_withdraw() {
        assertEquals(1,test.withdraw(2,1));
    }

    @AfterEach
    void clear(){
        test = null;
    }
}

