class Room{
    String num;
    int start;
    int end;

    public Room(int starta, int enda, String n){
        start = starta;
        end = enda;
        num = n;
    }

    public  Room(String name){
        start = 0;
        end  = 0;
    num = name;
    }

    public void signIn(int starta,int enda){
        this.start =  starta;
        this.end = enda;
    }

}