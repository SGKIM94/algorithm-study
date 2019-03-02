import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgorithmTest {
    public static Argorithm argorithm = new Argorithm();

    @BeforeEach
    void setTestcases() {
        argorithm.setTestcases("test");
        System.out.println("setTestcases");
    }

    @BeforeEach
    void setAnswer() {
        argorithm.setAnswer("test");
        System.out.println("setAnser");
    }

    String getAnswer() {
        System.out.println("getAnswer");
        return argorithm.getAnswer();

    }

    String getTestcases() {
        System.out.println("getTestcases");
        return argorithm.getTestcases();
    }

    @Test
    public void main() {
        Assertions.assertEquals(getTestcases(), getAnswer(), "결과입니다.");
    }
}