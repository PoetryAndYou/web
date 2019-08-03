package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author rui
 * @create 2019-08-03 21:58
 */
public class JsoupXpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获得路径path
        String path = JsoupTest.class.getClassLoader().getResource("student.xml").getPath();
        //解析
        Document document = Jsoup.parse(new File(path), "utf-8");
        //剧创建JXDocumnet对象
        JXDocument jxDocument=new JXDocument(document);
        //结合xpath语法查询
        List<JXNode> jxNodes = jxDocument.selN("//student");
        System.out.println(jxNodes);

        System.out.println("__________________________");
        List<JXNode> jxNode = jxDocument.selN("//student[@number='heima_0001']");
        System.out.println(jxNode);
    }
}
