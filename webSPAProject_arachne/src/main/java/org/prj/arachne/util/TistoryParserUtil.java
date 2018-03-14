package org.prj.arachne.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.prj.arachne.domain.tistory.TistoryBoard;
import org.prj.arachne.domain.tistory.TistoryCategory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Component
public class TistoryParserUtil {


    private static final String tistoryUrl="http://kimsoungryoul.tistory.com/category/";


    public List<TistoryBoard> parsingPostList(TistoryCategory category){

        List<TistoryBoard> boards=new LinkedList<>();

        try {
            Document doc= getHtmlDocument(category);




            Elements entries=getPostEntries(doc);


            TistoryBoard tBoard;

            for(Element element: entries){

                tBoard=new TistoryBoard(
                        element.getElementsByClass("titleWrap").get(0)
                                .getElementsByTag("h2").get(0)
                                .getElementsByTag("a").get(0).text(),

                        category.name(),

                        element.getElementsByClass("titleWrap").get(0)
                                .getElementsByTag("h2").get(0)
                                .getElementsByTag("a").get(0).attr("abs:href"),

                        element.getElementsByClass("article").get(0)
                                .getElementsByClass("tt_article_useless_p_margin").get(0)
                                .getElementsByTag("p").text()

                );

                boards.add(tBoard);



                /*System.out.println("-----------------");
                System.out.println(tBoard.toString());
                System.out.println("---------");
*/

            }


            // System.out.println(elements.get(0));









        } catch (IOException e) {
            e.printStackTrace();
        }



        return boards;
    }

    private  Elements getPostEntries(Document doc){

        return doc.body().getElementById("content").getElementsByClass("container").get(0)
                .getElementsByClass("row").get(0)
                .getElementsByClass("col-md-9").get(0)
                .getElementsByClass("entry");


    }

    private  Document getHtmlDocument(TistoryCategory category)throws IOException{

        return Jsoup.connect(tistoryUrl+ category.getCategory())
                .header("User-Agent","Mozilla/5.0")
                .get();


    }




}
