package codewars;

public class Kyu6 {

    public static void main(String[] args) {

        //System.out.println(tankvol(40,120,3500));
        //System.out.println(Tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));


    }

    public static String Tickets(int[] peopleInLine){
        int flag25 = 0;
        int flag50 = 0;

        for(int i = 0; i < peopleInLine.length; i++){
            int index = peopleInLine[i];
            if(index == 25)
                flag25++;
            else if(index == 50) {
                flag25--;
                flag50++;
                if(flag25 < 0) return "NO";
            }
            else if(index == 100) {
                if(flag50 > 0){
                    flag50--;
                    flag25--;
                    if(flag25 < 0) return "NO";
                } else {
                    flag25 -= 3;
                    if (flag25 < 0) return "NO";
                }
            }
        }
        if(flag25 >= 0)
            return "YES";
        else return "NO";
    }

    public static int tankvol(int h, int d, int vt){
        double r = d / 2;
        double angle = getAngle(r, h);
        double cylinderHeight = getCylinderHeight(r, vt);

        double vr = vt - getLiquidVolume(h, r, angle, cylinderHeight);

        return (int) Math.floor(vr);
    }

    public static double getLiquidVolume(int h, double r, double angle, double height){
        double liquidVolume = 0;

        liquidVolume = height * (getSlice(r, angle) - (r - h)*(Math.sin(angle) * r));
        System.out.println("liquid volume: " + liquidVolume);
        return liquidVolume;
    }

    public static double getAngle(double r, int h){
        double angle = 0;
        if(h > r){
            // angle = Math.acos(r)
        } else {
            angle = Math.acos((r - h) / r);
        }
        System.out.println("angle: " + angle * 2);

        return angle *2;
    }

    public static double getCylinderHeight(double r, int vt){
        double cylinderHeight = vt * 2 / (Math.PI * Math.pow(r, 2));
        System.out.println("cylider height: " + cylinderHeight);
        return cylinderHeight;
    }

    public static double getSlice(double r, double angle){
        double area = Math.pow(r, 2) * angle / 2;
        System.out.println("slice area: " + area);
        return area;
    }

}

