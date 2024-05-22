
interface Operation {
    int perform(int No1, int No2);
}

class Addtion implements Operation {
    @Override
    public int perform(int No1, int No2) {
        return No1 + No2;
    }
}

class Multiplication implements Operation {
    @Override
    public int perform(int No1, int No2) {
        return No1 * No2;
    }
}

class Subtraction implements Operation {
    @Override
    public int perform(int No1, int No2) {
        return No1 - No2;
    }
}

class OperationFactory {

    public static Operation getOperation(String opType) {
        switch (opType.toLowerCase()) {
            case "addition":
                return new Addtion();

            case "subtraction":
                return new Subtraction();

            case "multiplication":
                return new Multiplication();
            
            default:
                throw new IllegalArgumentException("Invalid Operation :"+ opType );
        }

    }

}

public class Factory2 {

    public static void main(String[] args) {

        Operation a = OperationFactory.getOperation("addition");
        int result1 =  a.perform(10, 15); 
        System.out.println("Addition : "+result1);

        Operation s = OperationFactory.getOperation("subtraction");
        int result2 =  s.perform(15, 10); 
        System.out.println("Subtraction : "+result2);

        
        Operation m = OperationFactory.getOperation("multiplication");
        int result3 =  m.perform(15, 10); 
        System.out.println("multiplication : "+result3);

    }
}
