package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author rui
 * @create 2019-08-03 14:43
 */
public class JsoupTest {
    public static void main(String[] args) throws IOException {
        //获得路径path
        String path = JsoupTest.class.getClassLoader().getResource("student.xml").getPath();
        //解析
        Document document = Jsoup.parse(new File(path), "utf-8");
        //查询name标签
        Elements elements = document.select("name");
        System.out.println(elements.get(0).text());
        //查询id
        Elements id = document.select("#cat");
        System.out.println(elements.get(0).select("name").text());
        System.out.println("******************");
        //查找student中number等于heima_0001
        Elements select = document.select("student[number=\"heima_0001\"]");
        System.out.println(select);
        System.out.println("******************");
        //查找student中number等于heima_0001中的age子标签
        Elements select1 = document.select("student[number=\"heima_0001\"]>age");
        System.out.println(select1);
    }
}
