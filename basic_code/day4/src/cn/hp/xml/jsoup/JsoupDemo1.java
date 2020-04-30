package cn.hp.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {


        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
//        System.out.println(path);
//
        Document doc = Jsoup.parse(new File(path), "utf-8");
//
//        Elements elements = doc.getElementsByTag("name");
//        Elements student = doc.getElementsByTag("student");
//        Elements id = doc.getElementsByAttribute("id");
//        Elements elementsByAttributeValue = doc.getElementsByAttributeValue("name", "heima_001");
//
//        String number = student.get(0).attr("NUMBER");
//        String text = elements.text();
//        String html = elements.html();
//
//
//        Elements name = doc.select("name");
//        Elements select = doc.select("#itcast");
//        Elements select1 = doc.select("student[number=\"heima_001\"]");
//        Elements select2 = doc.select("student[number=\"heima_001\"] > age");

        JXDocument jxDocument = new JXDocument(doc);
        List<JXNode> jxNodes = jxDocument.selN("//studnet");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        List<JXNode> jxNodes2 = jxDocument.selN("//studnet/name");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
        System.out.println("--------------------");
        //4.4查询student标签下带有id属性的name标签 并且id属性值为itcast

        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='itcast']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }


        //
//        System.out.println(elements.size());
//
//        Element element = elements.get(0);
//
//        String name = element.text();
//        System.out.println(name);


//        URL url = new URL("https://www.baidu.com");//代表网络中的一个资源路径
//        Document document = Jsoup.parse(url, 10000);
//        System.out.println(document);
    }
}
