package gof.dp.creational.prototype;

public class TestPrototype {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        ThreeDModel threeDModelOne =
                new ThreeDModel("Green",150);
//        ThreeDModel threeDModelTwo =
//                new ThreeDModel("Red",1500);
//        ThreeDModel threeDModelThree =
//                new ThreeDModel("Red",150);

        ThreeDModel threeDModelTwo = (ThreeDModel) threeDModelOne.clone();

    }
}
