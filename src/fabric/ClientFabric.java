package fabric;

import client.Client;
import fc.CreatingBucketOrder;

public class ClientFabric {
    public static Client client1 = new Client("name1", 18, "02.03.2024", CreatingBucketOrder.createBucketOrderFirst());
    public static Client client2 = new Client("name2", 28, "12.05.2023", CreatingBucketOrder.createBucketOrderSecond());
    public static Client client3 = new Client("name3", 38, "17.12.2022", CreatingBucketOrder.createBucketOrderThird());
}
