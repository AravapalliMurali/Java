package Arrays;

public class arrays {
    public static void main(String[] args) {
        class Innerarrays {
    
            int rollnum;
            String name;
            
        }

        int array1[][] = new int[3][4];
        Innerarrays stud = new Innerarrays();
        stud.name = "murali";
        stud.rollnum = 78;
        Innerarrays arr1[] = new Innerarrays[3];
        arr1[0] = stud;

        for(Innerarrays stu : arr1){
            System.out.println(stu.name + " : " + stu.rollnum);
        }

        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array1[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        //for Each  -----
        for(int n[] : array1){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
