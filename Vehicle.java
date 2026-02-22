public class Vehicle {

    public String brandName;
    public String modelName;
    public String color;
    private String mfgCode;
    public double price;
    public int seatingCapacity;
    public float mileagePerLiter;

    // Setter & Getter
    public void setMfgCode(String mCode) {
        mfgCode = mCode;
    }

    public String getMfgCode() {
        return mfgCode;
    }

    // Default constructor
    public Vehicle() {
        brandName = "Honda";
        modelName = "Accord";
        color = "Blue";
        setMfgCode("HON123");
        price = 2500000;
        seatingCapacity = 5;
        mileagePerLiter = 14.5f;
    }

    // Parameterized constructor
    public Vehicle(String b, String m, String c, String code,
                   double p, int s, float mil) {
        brandName = b;
        modelName = m;
        color = c;
        setMfgCode(code);
        price = p;
        seatingCapacity = s;
        mileagePerLiter = mil;
    }

    // Behaviour methods
    public void start() {
        System.out.println(brandName + " started");
    }

    public void drive() {
        System.out.println(brandName + " is driving");
    }

    public void stop() {
        System.out.println(brandName + " stopped");
    }

    // SAME logic you wrote (kept as-is)
    public float changeSpeed(float sp) {
        float newSp;
        if (sp < 20)
            newSp = sp + 20;
        else
            newSp = sp - 20;
        return newSp;
    }

    // Simple mileage calculation
    public float calcFuelNeeded(float distance) {
        return distance / mileagePerLiter;
    }
}




// public class Vehicle{
//     public String brandName;
//     public String modelName;
//     public String color;
//     public double price;
//     private String mfgCode;
//     public int seatingCapacity;
//     public float mileagePerLiter;


//     public void setMfgCode(String mCode){
//         mfgCode = mCode;
//     }

//     public String getMfgCode(){
//         return mfgCode;
//     }
//     public Vehicle() {
//     brandName = "Honda";
//     modelName = "Accord";
//     color = "Blue";
//     setMfgCode("XYZ1234");
//     price = 2500000.45;
//     seatingCapacity = 5;
//     mileagePerLiter = 14.5f;   // Honda mileage
// }

//     //Parameterised Constuctor
//     public Vehicle(String bName, String mName, double price, float mileage) {
//     brandName = bName;
//     modelName = mName;
//     this.price = price;
//     mileagePerLiter = mileage;
// }

//     public Vehicle(String bName, double p, int s)
//     {
//         brandName = bName;
//         price = p;
//         seatingCapacity = s;
//     }
//     //copy constructor

//     public Vehicle(Vehicle v){
//         brandName = v.brandName;
//         modelName = v.modelName;
//         color = v.color;
//         mfgCode = v.mfgCode;
//         price = v.price;
//         seatingCapacity = v.seatingCapacity;
//     }

//     public void start()
//     {
//         System.out.println("This vehicle has started.");
//     }
//     public void drive()
//     {
//         System.out.println("This vehicle can be driven on all surfaces");
//     }
//     public void stop()
//     {
//         System.out.println("Stop the ignition. you are at 0kmph now!");
//     }
//     public float changeSpeed(float sp)
//     {   
//         float newSp;
//         if(sp < 20)
//             newSp= sp +=20;
//         else 
//             newSp= sp -=20;
//         return newSp;
//     }
//     // public float calcMileage(float dist, float fuel)
//     // {
//     //     float mileage;
//     //     mileage = dist/fuel;
//     //     return mileage;

//     // }
//     public float calcMileage(float dist) {
//     return dist / mileagePerLiter;
// }

// }
