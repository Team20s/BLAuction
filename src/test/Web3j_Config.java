package test;

import java.io.IOException;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class Web3j_Config {
	
	Web3j web3 = Web3j.build(new HttpService("https://ropsten.infura.io/v3/875698661ce64ebab6a4ede298db7be2"));
    public String getClientVersion() throws IOException {
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
        
        // log 
        System.out.println(web3ClientVersion.getWeb3ClientVersion());
        return web3ClientVersion.getWeb3ClientVersion();
    }

}
