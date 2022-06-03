
class Routetable {
    public String ID;
    public String Gateway;
    public String[] SubnetList;
}

class Subnet {
    public String ID;
    public String Region;
    public String IP;
    public String Routetable;
}

class NatGateway {
    public String ID;
    public String subnet;
}

class InternetGateway {
    public String ID;
}

public class Main {
    public static void main(String[] args) {
    }
}