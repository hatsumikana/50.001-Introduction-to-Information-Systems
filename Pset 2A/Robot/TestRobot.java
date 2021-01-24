package com.hatsumi.Robot;

import com.hatsumi.Robot.GetPath;

import java.util.ArrayList;

public class TestRobot {
    public static void main(String[] args) {
//        final int[][] grid = {
//                {0,0,0},
//                {0,0,1},
//                {1,1,0}
//        };
//        ArrayList<GetPath.Point> path = new ArrayList<>();
//        boolean success = GetPath.getPath(2, 2, path, grid);
//        System.out.println(success);
//        if (success)
//            System.out.println(path);
//        path.clear();

        final int[][] grid0 = {
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0},
        };
        ArrayList<GetPath.Point> path = new ArrayList<>();
        boolean success = GetPath.getPath(3, 2, path, grid0);
        System.out.println(success);
        if (success)
            System.out.println(path);
        path.clear();

        final int[][] grid = {
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 1, 0, 0},
        };
        success = GetPath.getPath(3, 2, path, grid);
        System.out.println(success);
        if (success)
            System.out.println(path);
        path.clear();


    }
}

