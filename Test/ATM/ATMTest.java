package ATM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM test;

    @BeforeEach
    void init(){
        test = new ATM();
    }
    @Test
    void withdraw200expected400() {
        assertEquals(400,test.withdraw(600,200));
    }
    @Test
    void withdraw400expected400() {
        assertEquals(400,test.withdraw(800,400));
    }
    @Test
    void withdraw13expected547() {
        assertEquals(547,test.withdraw(560,13));
    }
    @Test
    void withdraw70expectedException() {
        assertThrows(IllegalArgumentException.class,() -> test.withdraw(10,70));
    }


    @AfterEach
    void clear(){
        test = null;
    }
}

