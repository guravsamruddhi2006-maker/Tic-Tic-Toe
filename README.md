 Terminal Tic-Tac-Toe (Java) – One Sheet Logic Blueprint
1. Game Rules
• 3 × 3 board.
• Two players: X and O.
• Players take turns placing symbols.
• Three in a row / column / diagonal wins.
• Full board without winner → Draw.

2. Board Representation
• Use a 3 × 3 structure to store the board.
• Each cell holds X, O, or empty.
• Maintain a move counter (0–9).

3. Core Methods
Method
main()
printBoard()
isValidMove()
checkWinner()
isDraw()
4. Game Flow
Purpose
Controls game loop and calls other methods.
Displays board after each move.
Checks position inside board and empty.
Checks rows, columns, diagonals.
Returns true if moves = 9 and no winner.
• Create board and initialize empty cells.
• Set starting player → X.
• Start loop until game ends.
• Display board.
• Take row and column input.
• Validate move (isValidMove).
• Place symbol on board.
• Increase move count.
• Check winner.
• Check draw.
• Switch player (X ↔ O).

5. Winning Conditions
• 3 horizontal rows.
• 3 vertical columns.
• 2 diagonals.

6. Development Order
• Create board.
• Print board.
• Player input.
• Move validation.
• Place symbol.
• Switch player.
• Winner logic.
• Draw logic
