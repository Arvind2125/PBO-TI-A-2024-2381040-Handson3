package handson3;

public class ForEaach {
    public static void main(String[] args) {
        int[] himpunanBilangan = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int satuanBilangan : himpunanBilangan) {
            if(satuanBilangan == 15) {
                continue;
            }
        }
    }
}
