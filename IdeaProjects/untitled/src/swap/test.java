package swap;

interface Wifi {
    void connect(int index);
}

class Network {
    private Wifi wifi;

    public Network(Wifi wifi) {
        this.wifi = wifi;
    }

    public Wifi getWifi() {
        return wifi;
    }
}

public class test {
    public static void main(String[] args) {
        Network network = new Network((index) -> {
            System.out.println(index);
        });

        network.getWifi().connect(0);
    }
}
