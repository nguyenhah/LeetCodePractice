import java.util.ArrayList;
import java.util.List;

/**
 * Created by hazai on 20/01/16.
 */

/*A group of two or more people wants to meet and minimize the total travel distance.
You are given a 2D grid of values 0 or 1, where each 1 marks the home of someone in the group.
The distance is calculated using Manhattan Distance,
where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.

        For example, given three people living at (0,0), (0,4), and (2,2):

        1 - 0 - 0 - 0 - 1
        |   |   |   |   |
        0 - 0 - 0 - 0 - 0
        |   |   |   |   |
        0 - 0 - 1 - 0 - 0
        The point (0,2) is an ideal meeting point, as the total travel distance of 2+2+2=6 is minimal. So return 6.

Hint:
Try to solve it in one dimension first. How can this solution apply to the two dimension case?*/

public class BestMeetingPoint {

    public static int minTotalDistance(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;


        List<Integer> xAxis = new ArrayList<>(x);
        List<Integer> yAxis = new ArrayList<>(y);

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1){
                    xAxis.add(i);
                    yAxis.add(j);
                }
            }
        }

        return minDistance(xAxis) + minDistance(yAxis);
    }

    private static int minDistance(List<Integer> list){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int s = 0; s < list.size(); s++){
            if (list.get(s) < min){
                min = list.get(s);
            }
            if (list.get(s) > max){
                max = list.get(s);
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int [][] map = {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
        System.out.println(minTotalDistance(map));

    }
}
