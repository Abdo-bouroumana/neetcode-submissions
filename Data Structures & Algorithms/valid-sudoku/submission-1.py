class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        a = 1
        board_map = {}
        for i in range(1, 10, 1):
            board_map[i] = []
        output = True
        testRows = [];
        testColomn = [];
        for i in range(9):
            testRows = []
            testColumn = []
            if output == False:
                break
            for j in range(9):
                if board[i][j] != "." and board[i][j] in testRows:
                    output = False
                    break
                if board[j][i] != "." and board[j][i] in testColumn:
                    output = False
                    break
                testRows.append(board[i][j])
                testColumn.append(board[j][i])
                if j <= 2:
                    if len(board_map[a]) == 9:
                        a += 3
                    if board[i][j] != "." and board[i][j] in board_map[a]:
                        output = False
                        break
                    board_map[a].append(board[i][j])
                elif j <= 5:
                    if board[i][j] != "." and board[i][j] in board_map[a + 1]:
                        output = False
                        break
                    board_map[a + 1].append(board[i][j])
                elif j <= 8: 
                    if board[i][j] != "." and board[i][j] in board_map[a + 2]:
                        output = False
                        break
                    board_map[a + 2].append(board[i][j])
        return output