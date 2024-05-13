import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentSumExample {
    private static final int ARRAY_SIZE = 1000;
    private static final int THREAD_POOL_SIZE = 4;
    private static final int[] array = new int[ARRAY_SIZE];

    // 初始化数组
    static {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1; // 假设数组中的元素为1到1000
        }
    }

    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        // 定义任务
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < ARRAY_SIZE; i++) {
                sum += array[i];
            }
            System.out.println("线程 " + Thread.currentThread().getName() + " 计算结果：" + sum);
        };

        // 提交任务到线程池
        for (int i = 0; i < THREAD_POOL_SIZE; i++) {
            executorService.submit(task);
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
