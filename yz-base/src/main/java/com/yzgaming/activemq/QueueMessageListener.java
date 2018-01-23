package com.yzgaming.activemq;

import com.yzgaming.util.websocket.WebSocketUtil;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 消息监听器
 */
public class QueueMessageListener implements MessageListener{

    //当收到消息后，自动调用该方法
    @Override
    public void onMessage(Message message) {

        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("QueueMessageListener监听到了文本消息：\t"
                    + tm.getText());
            //监听到了就发送给订阅者
//            WebSocketUtil socketUtil=new WebSocketUtil();
//            socketUtil.sendMsg("监听到了文本消息发送给你咯");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
