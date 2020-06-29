public class Tables {

    public void generateTable()    {
        //Put the code for your times-table here
        int i = 0;
        int j = 0;
        int val = 0;
        
        for(i=0;i<12;i++) {
            for(j=0;j<12;j++) {
                val = (i + 1) * (j + 1);
                System.out.print(val + "	");
            }
            System.out.println("");
        }
    }
}