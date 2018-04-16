
class Matrix {
    public String matrixAsString;

    public Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[][] convertToMatrix (){

        String[] stringToArray = matrixAsString.replaceAll("\n", " ").split(" ");

        int[] numbers = new int[stringToArray.length];

        for (int i = 0; i <stringToArray.length; i++) {
            numbers[i]= Integer.parseInt(stringToArray[i]);
        }

        int stringCounter = 0;

        int[][] matrix = new int[getRowsCount()][getColumnsCount()];

        for (int i = 0; i < getRowsCount(); i++) {
            for (int j = 0; j < getColumnsCount(); j++) {
                matrix[i][j] = numbers[stringCounter];
                stringCounter++;
            }
        }
        return matrix;
    }

    int[] getRow(int rowNumber) {
        int [][] matrix = convertToMatrix();
        int[] rows = new int[getColumnsCount()];
        for (int j = 0; j < getColumnsCount(); j++) {
            rows[j] = matrix[rowNumber][j];
        }
        return rows;
    }

    int[] getColumn(int columnNumber) {
        int [][] matrix = convertToMatrix();
        int[] columns = new int[getRowsCount()];
        for (int j = 0; j < getRowsCount(); j++) {
            columns[j] = matrix[j][columnNumber];
        }
        return columns;
    }

    int getRowsCount() {
        String [] newArr = matrixAsString.split("\\n");
        return newArr.length;
    }

    int getColumnsCount() {
        String [] newArr = matrixAsString.split("\\n");
        String [] newArrIndexOne = newArr[0].split(" ");
        return newArrIndexOne.length;

    }

}
