class Main{
    static Room[] rooms = {new Room("1"),new Room("2")};

    public static void main(String[] args){
        checkIn(1, 2);
       
        checkIn(1,2);
        checkIn(1,2);
        checkIn(3,5);
    }

    public static void checkIn(int startC,int endC){
        System.out.println("************\n");
       System.out.println(getNumAvail(startC, endC));
        bookRoom(startC, endC);
        System.out.println(getNumAvail(startC, endC));
       
            System.out.println("************\n");
       

    }




    private static void bookRoom(int start,int end){
        for (Room room: rooms) {
            if(room.end < start){
                //greate than room end date
                room.signIn(start, end);
                  System.out.print("Booked: "+ room.num);
                break;

            }
    }
    }

    private static int  getNumAvail(int start,int end){
        int nfree = 0;
        for (Room room: rooms) {
            if(room.end < start){
                //greate than room end date
                nfree++;

            }

           
        }
         return nfree;
    }
}

