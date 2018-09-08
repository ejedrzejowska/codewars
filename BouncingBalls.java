package codewars;

public class BouncingBalls {

    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        boolean cond = true;
        if(h>0 && bounce>0 && bounce<1 && window<h){
            count++;
            h = h * bounce;
            while(h>=window){
                count = count + 2;
                if(h == window) count--;
                h = h * bounce;
            }
            return count;
        } else {
            return -1;
        }
    }
}
