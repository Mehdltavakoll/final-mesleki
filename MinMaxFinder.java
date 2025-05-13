
public class MinMaxFinder {
    public static void main(String[] args) {
        int[] dizi = {23, 5, 78, 12, -4, 56, 0, 34};

        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }

        System.out.println("En büyük eleman: " + enBuyuk);
        System.out.println("En küçük eleman: " + enKucuk);
    }
}