import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransactions = {"sent bitcfoins2s", "send etherma"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {" sent 10d bitcoin ", "satoichi sent cions"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {" sent 1 bifdtcoind ", "satoichi sent cions"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transactions);

        System.out.println("Hash of block 1");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block 2");
        System.out.println(block2.getBlockHash());
        System.out.println("Hash of block 3");
        System.out.println(block3.getBlockHash());
    }
}
