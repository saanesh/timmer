public class TimmerCounter {
    public static void main(String[] args) {
        int sec = 0, min = 0, hour = 0;

        while (true) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sec++;
            if (sec == 60) {
                sec = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    hour++;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }

            System.out.println(String.format("%02d :%02d :%02d", hour, min, sec));
        }
    }
}
