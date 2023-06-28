package Redis;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Connection;

public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("redis://default:DclsZYrKRcktvgl9NlTPy6QIL79kv5cI@redis-14112.c12.us-east-1-4.ec2.cloud.redislabs.com:14112");
        Connection connection = jedis.getConnection();
        String product = jedis.get("product");
        
        
        System.out.println("product: " + product);
        
        
        jedis.close();
         	
    }
}