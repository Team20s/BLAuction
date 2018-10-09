package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.5.0.
 */
public class Helloworld extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008054600160a060020a03191633178155600560015560076002556003556101698061003f6000396000f3006080604052600436106100565763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663893d20e8811461005b578063a2375d1e14610099578063ca77ab65146100c0575b600080fd5b34801561006757600080fd5b506100706100d7565b6040805173ffffffffffffffffffffffffffffffffffffffff9092168252519081900360200190f35b3480156100a557600080fd5b506100ae61012b565b60408051918252519081900360200190f35b3480156100cc57600080fd5b506100d5610131565b005b6040805133815290516000917f2de658eae1b19c79e3cc061f591fba04f483f65811945d8d1af38e72c53b5279919081900360200190a15060005473ffffffffffffffffffffffffffffffffffffffff1690565b60035490565b600254600154016003555600a165627a7a723058204c56cb145c87f2d737286eaedabcf0a7daa2553c008096b38055422b0f24eb300029";

    public static final String FUNC_GETOWNER = "getOwner";

    public static final String FUNC_GETC = "getC";

    public static final String FUNC_CALCULATE = "calculate";

    public static final Event GETOWNEREVENT_EVENT = new Event("getOwnerEvent", Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}), Arrays.<TypeReference<?>>asList());

    protected Helloworld(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Helloworld(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> getOwner() {
        final Function function = new Function(
                FUNC_GETOWNER, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getC() {
        final Function function = new Function(FUNC_GETC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> calculate() {
        final Function function = new Function(
                FUNC_CALCULATE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Helloworld> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Helloworld.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Helloworld> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Helloworld.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public List<GetOwnerEventEventResponse> getGetOwnerEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(GETOWNEREVENT_EVENT, transactionReceipt);
        System.out.println(valueList);
        ArrayList<GetOwnerEventEventResponse> responses = new ArrayList<GetOwnerEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            GetOwnerEventEventResponse typedResponse = new GetOwnerEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<GetOwnerEventEventResponse> getOwnerEventEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, GetOwnerEventEventResponse>() {
            @Override
            public GetOwnerEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(GETOWNEREVENT_EVENT, log);
                GetOwnerEventEventResponse typedResponse = new GetOwnerEventEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<GetOwnerEventEventResponse> getOwnerEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(GETOWNEREVENT_EVENT));
        return getOwnerEventEventObservable(filter);
    }

    public static Helloworld load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Helloworld(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Helloworld load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Helloworld(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class GetOwnerEventEventResponse {
        public Log log;

        public String owner;
    }
}
