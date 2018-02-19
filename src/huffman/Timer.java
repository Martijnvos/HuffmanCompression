package huffman;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer {
    private static final Logger LOGGER = Logger.getLogger(Timer.class.getName());

    private long beginTime;

    private int performanceAmount;

    public Timer(int performanceAmount) {
        this.performanceAmount = performanceAmount;
        start();
    }

    private void start() {
        beginTime = System.currentTimeMillis();
    }

    public void end() {
        long endTime = System.currentTimeMillis();
        long timeDifference = endTime - beginTime;

        if (timeDifference == 0) {
            LOGGER.log(Level.INFO, "Encoding took less than {1}ms for {2} words",
                    new Object[]{timeDifference, performanceAmount});
        } else {
            LOGGER.log(Level.INFO, "Encoding took {1}ms for {2} words",
                    new Object[]{timeDifference, performanceAmount});
        }
    }
}
