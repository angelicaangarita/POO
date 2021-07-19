class Main{
    public static void main(String [] args){
        System.out.println("Hola mundo");
        UberX uberX = new UberX("MAA123", new Account("John Freddy", "AB1092355"),"Chevrolet", "Sonic");
        uberX.setPassenger(2);
        /*uberX.passenger = 4;*/
        uberX.printDataCar();  
        
        /*Car car2 = new Car("MSSA123", new Account("Sofia", "CD1097"));       
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}