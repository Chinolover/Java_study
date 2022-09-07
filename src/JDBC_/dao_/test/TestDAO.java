package JDBC_.dao_.test;

import JDBC_.dao_.Dao_.ActorDAO;
import JDBC_.dao_.domain.Actor_;
import org.junit.jupiter.api.Test;

import java.util.List;


public class TestDAO {
    //测试ActorDAO对actor表crud操作

    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();
        //1.查询
        String sql = "Select * from actor where id >= ?";
        List<Actor_> actors = actorDAO.queryMultiply(sql, Actor_.class, 1);

        for (Actor_ actor :
                actors) {
            System.out.println(actor);
        }

        //2.增添
        String sql2 = "Insert into actor Values (?,?,?,?,?)";
        int a = actorDAO.update(sql2,null,"zzz","男","1999-12-2","1313138");
        System.out.println(a>0?"成功":"失败");
    }



}
