import java.util.Arrays;

public class Block {
    private final int previousHash;
    private final String[] transactions;
    private final int blockHash;

    public Block(int previousHash, String[] transaction) {
        this.previousHash = previousHash;
        this.transactions = transaction;

        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
