import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class JSONTest {
    @Test
    public void test(){
        System.out.println(23333);
    }
    //json字符串转JSONObject
    @Test
    public void test1(){
        JSONObject jsonObject = JSON.parseObject("{\"name\":\"张三\",\"age\":18}");
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("name"));
        System.out.println(jsonObject.getIntValue("age"));
        System.out.println(jsonObject.get("name"));
    }
    //json字符串转JsonArray
    @Test
    public void test2(){
        JSONArray jsonArray = JSON.parseArray("[\"张三\",\"李四\"]");
        System.out.println(jsonArray);
        System.out.println(jsonArray.get(0));
        System.out.println(jsonArray.get(1));
    }
}
