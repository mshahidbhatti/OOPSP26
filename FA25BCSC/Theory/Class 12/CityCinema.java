public class CityCinema {
    String name;
    Screen screens[];

    CityCinema(String name, int numberOfScreens){
        this.name=name;
        screens=new Screen[numberOfScreens];
        for(int i=0;i<screens.length;i++)
            screens[i]=new Screen("IMax","Screen1",5);

    }


    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<screens.length;i++)
            stringBuilder.append(screens[i]+" ");

        return String.format("%s %s",name,stringBuilder);
    }


}
