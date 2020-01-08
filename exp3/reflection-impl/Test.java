
// v0版本
import java.lang.reflect.Method;

public class Test {
  public static void target(int i) {
    // new Exception("#" + i).printStackTrace();
  }

  public static void main(String[] args) throws Exception {
    Class<?> klass = Class.forName("Test");
    Method method = klass.getMethod("target", int.class);
    long current = System.currentTimeMillis();
    for (int i = 0; i != 2_000_000_000; i ++) {
        if (i % 100_000_000 == 0) {
            long temp = System.currentTimeMillis();
            System.out.println(temp - current);
            current = temp;
        }
        method.invoke(null, 128);
    }
  }
}