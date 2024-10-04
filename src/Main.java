public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
     box = box + 2;
     System.out.println(box);
     box = box - 3;
     System.out.println(box);

     var liftingCapacity = 50;
     var stuffWeight = 20;
     var capacityLeft = liftingCapacity - stuffWeight;
     System.out.println("Еще можно положить " + capacityLeft + " кг вещей");
     var appleWeight = 2;
     var orangesWeight = 3;
     var fruitWeight = appleWeight + orangesWeight;
     System.out.println("Общий вес фруктов " + fruitWeight);
            }
        }
