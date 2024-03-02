package fc;

import fabric.OrderFabric;
import order.Order;

import java.util.ArrayList;

public class CreatingBucketOrder {
    public static ArrayList<Order> createBucketOrderFirst(){
        ArrayList<Order> bucketOrderFirst = new ArrayList<>();
        bucketOrderFirst.add(OrderFabric.order1);
        bucketOrderFirst.add(OrderFabric.order3);
        bucketOrderFirst.add(OrderFabric.order5);
        return bucketOrderFirst;
    }
    public static ArrayList<Order> createBucketOrderSecond(){
        ArrayList<Order> bucketOrderSecond = new ArrayList<>();

        bucketOrderSecond.add(OrderFabric.order2);
        bucketOrderSecond.add(OrderFabric.order4);
        bucketOrderSecond.add(OrderFabric.order6);
        return createBucketOrderSecond();
    }
    public static ArrayList<Order> createBucketOrderThird(){
        ArrayList<Order> bucketOrderThird = new ArrayList<>();
        bucketOrderThird.add(OrderFabric.order7);
        return bucketOrderThird;
    }
}
