package Module12;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class MyNet {
    public MyNet() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("localhost");
        System.out.println(address);
        InetAddress[] sw = InetAddress.getAllByName("www.starwave.com");
        System.out.println(Arrays.toString(sw));
    }
}
