package problem4;

/**
 * To store range search of max palindrome
 */
public class Data {
    private int maxNum;
    private int minNum;

    public Data() {
    }

    /**
     * @param maxNum Max number for search palindrome
     */
    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * @param minNum Min number for search palindrome
     */
    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getMinNum() {
        return minNum;
    }
}
