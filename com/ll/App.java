package com.ll;

import java.util.Scanner;

public class App {

   private final Scanner sc;

   public App(Scanner sc) {
       this.sc = sc;
   }

   public void run(){
       System.out.println("==명언앱==");
       while (true) {
           long lastWiseSayingId = 1;

           System.out.println("명령) ");
           String command = sc.next().trim();
           if(command.equals("종료")){
               break;
           } else if (command.equals("등록")){
               System.out.println("명언 : ");
               String content = sc.nextLine().trim();
               System.out.println("작가 : ");
               String authorName = sc.nextLine().trim();



               System.out.printf("%d번 명언이 등록되었습니다.\n", lastWiseSayingId);
               lastWiseSayingId++;
           }
       }

   }
}
