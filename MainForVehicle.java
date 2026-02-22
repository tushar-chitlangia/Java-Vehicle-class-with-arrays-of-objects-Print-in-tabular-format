public class MainForVehicle {

    public static void main(String[] args) {

        // 4 DIFFERENT vehicles
        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle("Maruti", "X Cross", "Grey","MAR456", 1200000, 5, 20.0f);

        Vehicle v3 = new Vehicle("Tata", "Nexon", "Red","TAT789", 1500000, 5, 17.0f);

        Vehicle v4 = new Vehicle("Hyundai", "Creta", "White","HYU321", 1800000, 5, 16.5f);

        // Tabular heading
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Brand\tModel\tColor\tCode\tPrice\t\tSeats\tMileage");
        System.out.println("----------------------------------------------------------------------------");

        printVehicleDetails(v1);
        printVehicleDetails(v2);
        printVehicleDetails(v3);
        printVehicleDetails(v4);

        System.out.println("----------------------------------------------------------------------------");

        // Behaviour demo
        v1.start();
        v1.drive();
        System.out.println("New Speed: " + v1.changeSpeed(15));
        System.out.println("Fuel needed for 100 km: " + v1.calcFuelNeeded(100));
        v1.stop();
    }

    // Method to print ONE ROW of table
    public static void printVehicleDetails(Vehicle v) {
        System.out.println(
                v.brandName + "\t" +
                v.modelName + "\t" +
                v.color + "\t" +
                v.getMfgCode() + "\t" +
                v.price + "\t" +
                v.seatingCapacity + "\t" +
                v.mileagePerLiter
        );
    }
}





// public class MainForVehicle {

//     public static void main(String[] args) {

//         // 4 DIFFERENT vehicles
//         Vehicle v1 = new Vehicle();

//         Vehicle v2 = new Vehicle("Maruti", "X Cross", "Grey","MAR456", 1200000, 5, 20.0f);

//         Vehicle v3 = new Vehicle("Tata", "Nexon", "Red","TAT789", 1500000, 5, 17.0f);

//         Vehicle v4 = new Vehicle("Hyundai", "Creta", "White","HYU321", 1800000, 5, 16.5f);

//         Vehicle[] fleet = { v1, v2, v3, v4 };


//         // TABULAR PRINTING (simple)
//         System.out.println("----------------------------------------------------------------------------");
//         System.out.println("Brand\tModel\tColor\tCode\tPrice\t\tSeats\tMileage");
//         System.out.println("----------------------------------------------------------------------------");

//         for (Vehicle v : fleet) {
//             System.out.println(
//                     v.brandName + "\t" +
//                     v.modelName + "\t" +
//                     v.color + "\t" +
//                     v.getMfgCode() + "\t" +
//                     v.price + "\t" +
//                     v.seatingCapacity + "\t" +
//                     v.mileagePerLiter
//             );
//         }

//         System.out.println("----------------------------------------------------------------------------");

//         // Behaviour demo (as taught)
//         v1.start();
//         v1.drive();
//         System.out.println("New Speed: " + v1.changeSpeed(15));
//         System.out.println("Fuel needed for 100 km: " + v1.calcFuelNeeded(100));
//         v1.stop();
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------


//  public class MainForVehicle {

//     public static void main(String[] args) {

//         Vehicle v1 = new Vehicle();
//         printVehicleDetails(v1);
//         // v1.brandName = "Honda";
//         // v1.modelName = "Accord";
//         // v1.color = "Blue";
//         // v1.setMfgCode("XYZ1234");
//         // v1.price = 2500000.45;
        
//         Vehicle v2 = new Vehicle("Maruti", "X Cross", 5000000.45, 20.0f);
//         printVehicleDetails(v2);

//         // v2.brandName = "Maruti";
//         // v2.modelName = "X Cross";
//         // v2.color = "Grey";
//         // v2.setMfgCode("XYZ1122");
//         // v2.price = 5000000.45;
//         // v2.seatingCapacity = 4;

//         // printVehicleDetails(v1);
//         // printVehicleDetails(v2);

//         Vehicle[]myfleet= new Vehicle[]{v1,v2};
//         for (Vehicle v : myfleet){
//             printVehicleDetails(v);
//         }


//         v1.start();
//         v1.drive();
//         System.out.println("New speed: " + v1.changeSpeed(40));
//         // System.out.println("Mileage: " + v1.calcMileage(45.0f, 10.98f));
//         System.out.println("Fuel needed: " + v1.calcMileage(100));
//         v1.stop();

//         System.out.println();

//         v2.start();
//         v2.drive();
//         System.out.println("New speed: " + v2.changeSpeed(20));
//         // System.out.println("Mileage: " + v2.calcMileage(45.0f, 10.98f));
//         System.out.println("Fuel needed: " + v2.calcMileage(100));
//         v2.stop();
//     }

    // public static void printVehicleDetails(Vehicle v) {
    //     System.out.println("=========== Vehicle Details ===========");
    //     System.out.println(" Brand Name: " + v.brandName);
    //     System.out.println(" Model Name: " + v.modelName);
    //     System.out.println(" Colour: " + v.color);
    //     System.out.println(" Manufacturing Code: " + v.getMfgCode());
    //     System.out.println(" Price: " + v.price);
    //     System.out.println(" seatingCapacity: " + v.seatingCapacity);
    //     System.out.println();
    // }
// }