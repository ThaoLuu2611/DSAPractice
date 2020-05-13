package JavaCode;

public class LambdaExp {
    interface InternetConnection{
        public void internetListener();
    }

    interface InternetType {
        public String internetType(String type);
    }

    public void lambdaWithoutParameter(){

        InternetConnection myInternet = () ->{
            System.out.println("I don't connected to the internet");
        };
        myInternet.internetListener();
    }

    public void lambdaWithParameter(){
        System.out.println("\nLambda with parameter ...\n");
        InternetType type = (internetType) -> {
            return "you are connected to "+internetType;
        };
        System.out.println(type.internetType("wifi"));
    }

    public void callImplementation(){
        System.out.println("call with implementation of interface");
        InternetConnection internetConnection = new MyInternet();
        internetConnection.internetListener();
    }
}

 class MyInternet implements LambdaExp.InternetConnection{
    @Override
    public void internetListener() {
        System.out.println("You device is connected to internet");
    }
 }