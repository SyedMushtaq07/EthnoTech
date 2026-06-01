public class JaggedArrayExample {
    public static void main(String[] args) {

        int[][] marks = {
            {85},           
            {78, 90},       
            {88, 76, 95}    
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " Marks:");
            
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}