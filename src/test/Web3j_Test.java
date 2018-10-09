package test;

import java.math.BigInteger;
import java.util.List;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import test.Auction_Manager.MakeAuctionEventEventResponse;

public class Web3j_Test {
	
    public static void main(String[] args) throws Exception {
    	
    	Web3j_Config config = new Web3j_Config();
    	
    	Credentials credentials = Credentials.create("1306FCA02CF38FB322CD4DF9158C8E0E5CDF5EB87040C6B9B7E029A6B0A27BA9");
    	BigInteger Gas_Price = BigInteger.valueOf(30_000_000_000L);
    	BigInteger Gas_Limit = BigInteger.valueOf(3_000_000);
    	BigInteger param = BigInteger.valueOf(0);
    	
    	Auction_Manager contract = Auction_Manager.load(
    			"0x4dadde590e5a9575ce56052b6258d376b0f80f09", config.web3, credentials, Gas_Price, Gas_Limit);
    	
    	TransactionReceipt receipt = contract.makeAuction(BigInteger.valueOf(1), param, param, param, param, param, param).send();
    	
    	List<MakeAuctionEventEventResponse> result = contract.getMakeAuctionEventEvents(receipt);
    	
    	System.out.println(result.get(0).auction_address);
    	System.out.println(result.get(0).auction_id);
    	System.out.println(result.get(0).log);
	}
}
