package work;

public class Counter {
        public int count1 = 0;
        public static int count2 = 0;
        public static void main(String[] args) {
               Counter counterA = new Counter();
                Counter counterB = new Counter();
                 counterA.count1++;//1
                 counterA.count2++;//1
                 counterB.count1++;//1
                 counterB.count2++;//2
          }
}


