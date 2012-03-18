package camel.log;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * User: chris
 * Date: 18/03/12
 * Time: 11:13
 */
@Component(value = "logger")
public class Logger {


    public void logOutgoingMessage(Exchange exchange) {
        Message in = exchange.getIn();
        logMessage(in);
    }

    private void logMessage(Message message) {
        Map<String,Object> headers = message.getHeaders();

        Set<Map.Entry<String,Object>> entries = headers.entrySet();
        System.out.println("Headers:");
        for (Map.Entry<String, Object> next : entries) {
            System.out.println(next.getKey()+":"+next.getValue());
        }
        System.out.println(message);
    }

}
