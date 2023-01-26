public class Main {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("this"));
        System.out.println(Review.sentimentVal("nasty"));
        System.out.println(Review.sentimentVal("place"));
        System.out.println(Review.sentimentVal("was"));
        System.out.println(Review.sentimentVal("terrible"));

        System.out.println(Review.totalSentiment("simpleReview.txt"));
        System.out.println(Review.starRating("simpleReview.txt"));

        


        
    }
}
