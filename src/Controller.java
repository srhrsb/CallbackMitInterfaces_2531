public class Controller {

    public Controller() {
        doSomething( this::task2 );
        doSomething( this::task3 );

        doSomethingParam( this::task1Int );
        doSomethingParam( this::task2Int );
        doSomethingParam( this::task3Int );

        doSomethingString(this::show);

    }

    private void doSomething( Action callback){
        callback.invoke();
    }

    private void doSomethingParam( ActionParam<Integer> callback){
        int result = 6;
        callback.invoke( result );
    }

    private void doSomethingString( ActionParam<String> callback ){
        String result = "Test";
        callback.invoke( result );

    }

    private void show( String txt){
        System.out.println(txt);
    }



    private void task1(){
        System.out.println("Aufgabe 1 aufgerufen");
    }

    private void task2(){
        System.out.println("Aufgabe 2 aufgerufen");
    }

    private void task3(){
        System.out.println("Aufgabe 3 aufgerufen");
    }

    private void task1Int(int value){
        System.out.println("Aufgabe 1 aufgerufen mit Parameter: "+ value);
    }

    private void task2Int(int value){
        System.out.println("Aufgabe 2 aufgerufen mit Parameter: "+ value);
    }

    private void task3Int( int value){
        System.out.println("Aufgabe 3 aufgerufen mit Parameter: "+ value);
    }





}
