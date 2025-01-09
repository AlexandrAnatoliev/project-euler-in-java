package solve5;

/**
 * To store range search
 */
public class Data {
    private int firstNum;
    private int pastNum;

    public Data() {
    }

    /**
     * @param firstNum First number for search
     */
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    /**
     * @param pastNum Past number for search
     */
    public void setPastNum(int pastNum) {
        this.pastNum = pastNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getPastNum() {
        return pastNum;
    }
}
