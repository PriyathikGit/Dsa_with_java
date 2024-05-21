package BackTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        // allPaths("",maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathsValue("",maze, 0, 0,path,1);
    }
    static void allPaths(String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        // if any path is false that mean we cannot choose that path so return and find new path
        if(maze[r][c]==false){
            return;
        }

        // moving to a path and marking that i have visited
        maze[r][c] = false;
        if(r<maze.length-1){
            allPaths(p+'D',maze,r+1, c);
        }
        if(c<maze[0].length-1){
            allPaths(p+'R',maze,r, c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1, c);
        }
        if(c>0){
            allPaths(p+'L',maze,r, c-1);
        }

        // this line is where the function will be over
        // so before function removed from the stack, also removed the changes made by that function call
        maze[r][c] = true;
    }
    static void allPathsValue(String p,boolean[][] maze,int r, int c,int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        // if any path is false that mean we cannot choose that path so return and find new path
        if(maze[r][c]==false){
            return;
        }

        // moving to a path and marking that i have visited
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1){
            allPathsValue(p+'D',maze,r+1, c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsValue(p+'R',maze,r, c+1,path,step+1);
        }
        if(r>0){
            allPathsValue(p+'U',maze,r-1, c,path,step+1);
        }
        if(c>0){
            allPathsValue(p+'L',maze,r, c-1,path,step+1);
        }

        // this line is where the function will be over
        // so before function removed from the stack, also removed the changes made by that function call
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
