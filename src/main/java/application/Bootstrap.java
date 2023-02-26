package application;

import static spark.Spark.initExceptionHandler;

class Bootstrap implements Runnable {

    private Emapp emapp;

    public Bootstrap() {
        emapp = new Emapp(new AppContext());
        initExceptionHandler((e) -> System.err.printf("""
            >>> SERVER NOT STARTED <<<
            The API server could not start for the following error.%n%s
            """, e.getMessage()));
    }

    @Override
    public void run() {
        emapp.run();
    }

    public static void main(String[] args) {
        new Bootstrap().run();
    }
}