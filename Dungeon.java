import java.util.Random;
import java.util.Scanner;

class Dungeon {
    public static void main(String[] args) {

        int unit_x = 0;
        int unit_y = 0;
        boolean loop = true;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean hit;
        unit_x = rd.nextInt(5);
        unit_y = rd.nextInt(5);
        while(loop) {
            int[][] dungeon = {
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0}
            }; //int intArray[][] = new int[5][5] => 하면 기본 값 0으로 들어감
            dungeon[unit_y][unit_x] = 1;
            for(int i=0;i<dungeon.length;i++) {
                for(int j=0;j<dungeon[i].length;j++) {
                    System.out.print(dungeon[i][j]+" ");
                }
                System.out.println();
            }
            int a = sc.nextInt();
            if(a == 23) {
                if(unit_y < dungeon.length) {
                    unit_y--;
                } else {

                }

            } else if(a == 24) {
                if(unit_y < dungeon.length) {
                    unit_y++;
                } 
            } else if(a == 25) {
                if(unit_y < dungeon.length) {
                    unit_x--;
                } 
            } else if(a == 26) {
                if(unit_y < dungeon.length) {
                    unit_x++;
                } 
            } 
        }

    }
}