public class Main {
    public static void main(String[] args) {
        byte myByte = 100;
        int myInt = 200;
        double myDouble = 315.40;
        float myFloat = 3.14f;

 // преобразование типов:
        int byteToInt = myByte;                 // Расширение типа "byte" к "int"
        byte intToByte = (byte) myInt;          // Сужение типа "int" к "byte"
        float doubleToFloat = (float)myDouble;  // Сужение типа "double" к "float"
        double floatToDouble = myFloat;         // Расширение типа "float" к "double"

        System.out.println("Byte to Int:" + byteToInt );
        System.out.println("Int to Byte:" + intToByte );
        System.out.println("Double to Float:" + doubleToFloat );
        System.out.println("Float to Double:" + floatToDouble );



    }
}


