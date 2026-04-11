class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean} 
     */
    isValidSudoku(board) {
        let row=Array.from({length:9},()=> new Set())
        let column=Array.from({length:9},()=> new Set())
        let box=Array.from({length:9},()=> new Set())
        for(let i=0;i<9;i++){
            for(let j=0;j<9;j++){
                const bo=board[i][j];
                if(bo=='.') continue;
                let boxIndex= Math.floor(i/3)*3+Math.floor(j/3);
                if(row[i].has(bo)||column[j].has(bo)||box[boxIndex].has(bo)){
                    return false;
                }
                row[i].add(bo);
                column[j].add(bo);
                box[boxIndex].add(bo)
            }
        }
        return true;
    }
}