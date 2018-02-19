package startup;

import huffman.HuffmanController;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Timer.class.getName());

    public static void main(String[] args) {
        // args.length time complexity: O(1)
        if (args.length > 2) {
            LOGGER.log(Level.SEVERE, "You provided to much parameters. {0} " +
                            "Please refer to the documentation on GitLab for the possible parameters (https://git.fhict.nl/I367789/JCF41/tree/HuffmanMartijn).",
                    System.lineSeparator());
            return;
        }

        // Time complexity of creating a new instance: O(1)
        HuffmanController controller = new HuffmanController();

        // equalsIgnoreCase time complexity: O(n)
        if (args.length == 0) {
            controller.encode();
        } else if (args.length == 1 && args[0].equalsIgnoreCase("encode")) {
            controller.encode();
        } else if (args.length == 1 && args[0].equalsIgnoreCase("decode")) {
            controller.decode();
        } else if (args[0].equalsIgnoreCase("encode")) {
            int testAmount;

            // parseInt time complexity: O(n)
            try {
                testAmount = Integer.parseInt(args[1]);
            } catch(NumberFormatException e) {
                LOGGER.log(Level.SEVERE, "Your input number for performance testing isn't correct. {0} " +
                                "Please refer to the documentation on GitLab for the possible parameters (https://git.fhict.nl/I367789/JCF41/tree/HuffmanMartijn).",
                        System.lineSeparator());
                return;
            }

            controller.encode(testAmount);
        }
    }
}
