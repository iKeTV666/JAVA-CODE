package game;
import java.util.Random;
public class CodeUtil {
    public static String getCode() {
        // 简单生成4位数字验证码，可根据需要修改
        Random random = new Random();
        int code = random.nextInt(9000) + 1000; // 1000-9999的随机数
        return String.valueOf(code);
    }
}
