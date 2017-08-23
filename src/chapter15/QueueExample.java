package chapter15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //Message클래스를 활용해서 Queue 이해하기
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "김성섭"));
        messageQueue.offer(new Message("sendKakaotalk", "카카오톡"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll(); //메세지 큐에서 한개의 메시지 꺼냄
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일 보낸다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 메시지 보냄");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냄");
                    break;
            }
        }
    }
}
