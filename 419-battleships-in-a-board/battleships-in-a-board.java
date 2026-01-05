class Solution {
    public int countBattleships(char[][] board) {
        // int count=0;
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         int k=i;
        //         int v=j;
        //         if(board[i][j]=='X'){
        //             if(v==j){
        //                 count++;
        //                 break;
        //             }
        //             // else if(k==i){
        //             //     count++;
        //             //     break;
        //             // }
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }
        // return count;

        // int count=0;
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         if(board[i][j]=='X'){
        //             count++;
        //             board[i][j]='.';
        //             int temp=j;
        //             while(temp+1<board[0].length&&board[i][temp+1]=='X'){
        //                 board[i][temp+1]='.';
        //                 temp++;
        //             }
        //             int temp2=i;
        //             while(temp2+1<board.length&&board[temp2+1][j]=='X'){
        //                 board[temp2+1][j]='.';
        //                 temp2++;
        //             }
        //         }
        //     }
        // }
        // return count;

        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    count++;
                    if(i>0&&board[i-1][j]=='X'){
                        count--;
                    }
                    else if(j>0&&board[i][j-1]=='X'){
                        count--;
                    }
                }
            }
        }
        return count;
    }
}