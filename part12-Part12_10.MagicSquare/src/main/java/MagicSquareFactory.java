
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Magic square side length must be an odd integer.");
        }

        
        int row = 0;
        int col = size / 2;
        int num = 1;
        
        while (num <= size * size) {
            square.placeValue(row, col, num);

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextRow, nextCol) == 0) {
                row = nextRow;
                col = nextCol;
            } else {
                row = (row + 1) % size;
            }

            num++;
        }
        return square;
    }

}
