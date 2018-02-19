package huffman;

public class HuffmanController {
    private EncodingUtility encodingUtility;
    private DecodingUtility decodingUtility;

    public HuffmanController() {
        encodingUtility = new EncodingUtility();
        decodingUtility = new DecodingUtility();
    }

    public void encode() {
        encodingUtility.encodeText();
    }

    public void encode(int performanceTestAmount) {
        Timer timer = new Timer(performanceTestAmount);
        encodingUtility.encodeText(performanceTestAmount);
        timer.end();
    }

    public void decode() {
        decodingUtility.decodeText();
    }
}
