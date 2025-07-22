class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Network net = new Network();

        System.out.println("id of network = " + net.networkId);
        System.out.println("provider = " + net.providerName);
        System.out.println("type = " + net.type);
        System.out.println("bandwidth = " + net.bandwidth);
        System.out.println("latency = " + net.latency);
        System.out.println("is 5G = " + net.is5G);
        System.out.println("region = " + net.region);

        net.networkId = 11;
        net.providerName = "Jio";
        net.type = "Mobile";
        net.bandwidth = 100.5;
        net.latency = 20.3;
        net.is5G = true;
        net.region = "India";

        System.out.println("id of network = " + net.networkId);
        System.out.println("provider = " + net.providerName);
        System.out.println("type = " + net.type);
        System.out.println("bandwidth = " + net.bandwidth);
        System.out.println("latency = " + net.latency);
        System.out.println("is 5G = " + net.is5G);
        System.out.println("region = " + net.region);

        System.out.println("main ended");
    }
}
