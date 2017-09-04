package cn.xuqplus.task;

import org.springframework.core.task.TaskExecutor;

import java.sql.Date;
import java.sql.SQLData;
import java.sql.Time;
import java.util.Calendar;

public class DemoTask {
    public DemoTask() {
    }

    public void task() {
        Calendar now = Calendar.getInstance();
        System.out.println("task -- "
                + now.get(Calendar.YEAR) + "-"
                + now.get(Calendar.MONTH) + "-"
                + now.get(Calendar.DATE) + " "
                + now.get(Calendar.HOUR) + ":"
                + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND));
    }

    public void task0() throws InterruptedException {
        Thread.sleep(5000);
        Calendar now = Calendar.getInstance();
        System.out.println("task0 -- "
                + now.get(Calendar.YEAR) + "-"
                + now.get(Calendar.MONTH) + "-"
                + now.get(Calendar.DATE) + " "
                + now.get(Calendar.HOUR) + ":"
                + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND));
    }


    /**
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
     */

    private class MessagePrinterTask implements Runnable {
        private String message;

        public MessagePrinterTask(String message) {
            this.message = message;
        }

        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Calendar now = Calendar.getInstance();
            System.out.println(message
                    + now.get(Calendar.YEAR) + "-"
                    + now.get(Calendar.MONTH) + "-"
                    + now.get(Calendar.DATE) + " "
                    + now.get(Calendar.HOUR) + ":"
                    + now.get(Calendar.MINUTE) + ":"
                    + now.get(Calendar.SECOND));
        }
    }

    private TaskExecutor taskExecutor;

    public DemoTask(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void printMessages() throws InterruptedException {
        taskExecutor.execute(new MessagePrinterTask("printMessages -- "));
    }
}
