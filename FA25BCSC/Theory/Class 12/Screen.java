public class Screen {
    String rows[]={"A","B","C","D","E","F"};
    String name;
    String id;
    Seat seats[][];
    Screen(String name, String id, int rowCount){
        this.name=name;
        this.id=id;
        seats=new Seat[rowCount][];
        for(int i=0;i<seats.length;i++)
            seats[i]=new Seat[10+i];

        for(int i=0;i<seats.length;i++)
            for(int j=0;j<seats[i].length;j++)
                seats[i][j]=new Seat(rows[i]=="A"?SeatType.VIP:SeatType.Regular,rows[i]);
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<seats.length;i++) {
            stringBuilder.append("\n");
            for (int j = 0; j < seats[i].length; j++)
                stringBuilder.append(seats[i][j] + " ");
        }
        return String.format("%s %s \n%s",name,id,stringBuilder);

    }

}
