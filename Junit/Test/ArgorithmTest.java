import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArgorithmTest {
    public static ArgorithmTDD argorithm_tdd = new ArgorithmTDD();

    @BeforeEach
    void setTestcases() {
        argorithm_tdd.setTestcases("test");
        System.out.println("setTestcases");
    }

    @BeforeEach
    void setAnswer() {
        argorithm_tdd.setAnswer("test");
        System.out.println("setAnser");
    }

    String getAnswer() {
        System.out.println("getAnswer");
        return argorithm_tdd.getAnswer();

    }

    String getTestcases() {
        System.out.println("getTestcases");
        return argorithm_tdd.getTestcases();
    }

    @Test
    public void main() {
        Assertions.assertEquals(getTestcases(), getAnswer(), "결과입니다.");
    }
}