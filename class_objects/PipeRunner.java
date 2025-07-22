class PipeRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Pipe pipe = new Pipe();

        System.out.println("id of pipe = " + pipe.pipeId);
        System.out.println("material = " + pipe.material);
        System.out.println("length = " + pipe.length);
        System.out.println("diameter = " + pipe.diameter);
        System.out.println("thickness = " + pipe.thickness);
        System.out.println("price = " + pipe.price);
        System.out.println("flexible = " + pipe.flexible);

        pipe.pipeId = 12;
        pipe.material = "PVC";
        pipe.length = 3.5;
        pipe.diameter = 1.2;
        pipe.thickness = 0.5;
        pipe.price = 150.0;
        pipe.flexible = true;

        System.out.println("id of pipe = " + pipe.pipeId);
        System.out.println("material = " + pipe.material);
        System.out.println("length = " + pipe.length);
        System.out.println("diameter = " + pipe.diameter);
        System.out.println("thickness = " + pipe.thickness);
        System.out.println("price = " + pipe.price);
        System.out.println("flexible = " + pipe.flexible);

        System.out.println("main ended");
    }
}
