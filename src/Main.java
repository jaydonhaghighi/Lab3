public class Main {
    public static void main(String[] args) {
        Hand hand1 = new Hand("5C 5D 5H 5S 4D");
        System.out.println("Hand 1 has: " + hand1.kind());

        Hand hand2 = new Hand("TH 9D 8S 7D 6H");
        System.out.println("Hand 2 has: " + hand2.kind());

        Hand hand3 = new Hand("AC AD AH KS KD");
        System.out.println("Hand 3 has: " + hand3.kind());

        Hand hand4 = new Hand("JS TS 9S 8S 7S");
        System.out.println("Hand 4 has: " + hand4.kind());

        Hand hand5 = new Hand("5C 5D 6H 3S 4D");
        System.out.println("Hand 5 has: " + hand5.kind());

        Hand hand6 = new Hand("5C 2D 9H 3S 4D");
        System.out.println("Hand 6 has: " + hand6.kind());
    }
}
