package cn.xuqplus.aa;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        long n = 1000000000L;
        long sum = 0L;
        Sum sum1 = new Sum(0, n);
        Sum sum2 = new Sum(1, n);
        Sum sum3 = new Sum(0, n);
        Sum sum4 = new Sum(1, n);
        sum1.start();
        sum2.start();
        sum3.start();
        sum4.start();
        sum1.join();
        sum2.join();
        sum3.join();
        sum4.join();
        System.out.println(sum1.getSum() + sum2.getSum() + sum3.getSum() + sum4.getSum());
        System.out.println(System.currentTimeMillis() - start);
    }
}

class Sum extends Thread {
    private long start;
    private long end;
    private long sum = 0L;

    public long getSum() {
        return sum;
    }

    public Sum(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (long i = start; i <= end; i += 4) {
            sum += i;
        }
    }
}
