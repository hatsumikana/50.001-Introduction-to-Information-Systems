package com.hatsumi.Robot;

import java.util.ArrayList;

class GetPath {

    //Fill in your answer for this method
    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {

        Point currentPoint;
        if (path.isEmpty()) {
            currentPoint = new Point(0, 0);
            path.add(currentPoint);
        }
        else
            currentPoint = path.get(path.size()-1);
        if(grid[r][c] == 1){
            return false;
        }

        // Reached Destination
        if(currentPoint.x == r && currentPoint.y == c){
            return true;
        }
        // Going to the right
        boolean right = false;
        if(currentPoint.y < c && grid[currentPoint.x][currentPoint.y+1]!=1) {
            path.add(new Point(currentPoint.x, currentPoint.y + 1));
            right = getPath(r, c, path, grid);
        }
        if (right)
            return true;

        // Going down
        boolean down = false;
        if(currentPoint.x < r && grid[currentPoint.x+1][currentPoint.y]!=1){
            path.add(new Point(currentPoint.x+1, currentPoint.y));
            down = getPath(r,c,path,grid);
        }
        if (down)
            return true;
        path.remove(path.size()-1);
        return false;
}

//You do not need to change any code below ---------
static class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
//--------------------------------------------------

/* HINT:
Your solution ought to work with a grid that is not square.
Here is the grid for Test Case 8:

            final int[][] grid = {
                    {0,0,0,1},
                    {0,1,0,0},
                    {0,1,1,1},
                    {0,0,0,1},
                    {1,1,0,0},
                    {1,1,1,0}
            };

*/

}

