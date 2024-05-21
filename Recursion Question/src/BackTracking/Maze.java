package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
        // System.out.println(pathDiagonal("",3,3));
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        mazeRestrictions("",maze, 0, 0);
    }

    // counting the total path
    static int maze(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = maze(row-1,col);
        int right = maze(row,col-1);
        return left+right;
    }

    // all possible path to reach end
    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            path(p+'D',row-1,col);
        }
        if(col>1){
            path(p+'R',row,col-1);
        }
    }
    static ArrayList<String> pathRet(String p, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(pathRet(p+'D',row-1,col));
        }
        if(col>1){
            list.addAll(pathRet(p+'R',row,col-1));
        }
        return list;
    }

    // diagonally rotating
    static ArrayList<String> pathDiagonal(String p, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(pathDiagonal(p+'D',row-1,col-1));
        }
        if(row>1){
            list.addAll(pathDiagonal(p+'V',row-1,col));
        }
        if(col>1){
            list.addAll(pathDiagonal(p+'H',row,col-1));
        }
        return list;
    }

    
    // restriction inside the maze
    static void mazeRestrictions(String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
             mazeRestrictions(p+'D',maze,r+1, c);
        }
        if(c<maze[0].length-1){
             mazeRestrictions(p+'R',maze,r, c+1);

        }
        
    }

}

