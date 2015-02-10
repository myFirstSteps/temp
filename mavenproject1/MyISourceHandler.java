/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.pankratovm.mavenproject1;

import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.*;
import java.io.IOException;
import java.lang.reflect.Field;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.hibernate.Session;
import ru.intelinfo.as.source.ISourceHandler;
import ru.intelinfo.as.source.request.Legal;
import ru.intelinfo.as.source.request.Natural;

/**
 *
 * @author pankratov
 */
public class MyISourceHandler implements ISourceHandler {

    final static String DEFAULT_URL = "http://reestr.tpprf.ru/?page=511&subpage=629";
    final private WebClient client;
    final private HtmlPage page;

    public MyISourceHandler() throws IOException {
        client = new WebClient(BrowserVersion.FIREFOX_24);
        client.getOptions().setJavaScriptEnabled(false);
        page = (HtmlPage) client.getPage(DEFAULT_URL);
    }

    public MyISourceHandler(String url) throws IOException {
        client = new WebClient();
        page = (HtmlPage) client.getPage(url);
    }

    @Override
    public Object process(Natural natural, Session session) {
        throw new UnsupportedOperationException("not supported yet");
    }

    @Override
    public MyISourceEntity process(Legal natural, Session session) {

        HtmlForm form = page.getFormByName("form1");
        form.getInputByName("Filters[INN]").setValueAttribute("");
        form.getInputByName("Filters[CertificateNumber]").setValueAttribute("");

        try {
            final HtmlPage listPage;
            final HtmlSubmitInput submit = (HtmlSubmitInput) form.getInputByName("Find");
            listPage = submit.click();
            final HtmlDivision div = (HtmlDivision) listPage.getByXPath("//div[@class='zagolovok2']").get(1);
            if (!div.getTextContent().equals("По Вашему запросу найдено компаний: 0")) {
                HtmlTable table = (HtmlTable) listPage.getByXPath("//table[@class='bottom_table']").get(0);

                HtmlAnchor a = (HtmlAnchor) table.getCellAt(0, 0).getElementsByTagName("a").get(0);

                HtmlPage p = a.click();
                table = (HtmlTable) p.getByXPath("//table[@class='bottom_table']").get(0);
                MyISourceEntity entity = new MyISourceEntity();
                System.out.println(MyISourceEntity.class.getDeclaredFields().length);
                for( Field f:entity.getClass().getDeclaredFields()){
                    f.set(entity, table);
                    System.out.println(f.getName());
                }
                
                entity.setFullName(table.getCellAt(1, 1).getTextContent().trim());
                entity.setShortName(table.getCellAt(2, 1).getTextContent().trim());
                entity.setRegion(table.getCellAt(3, 1).getTextContent().trim());
                entity.setTpp(table.getCellAt(4, 1).getTextContent().trim());
                entity.setRegDate(table.getCellAt(5, 1).getTextContent().trim());
                entity.setCertificateNumber(table.getCellAt(6, 1).getTextContent().trim());
                entity.setOkpo(table.getCellAt(7, 1).getTextContent().trim());
                entity.setInn(table.getCellAt(8, 1).getTextContent().trim());
                entity.setOkato(table.getCellAt(9, 1).getTextContent().trim());
                entity.setOkved(table.getCellAt(10, 1).getTextContent().trim());
                entity.setOgrn(table.getCellAt(11, 1).getTextContent().trim());
                entity.setMainActivity(table.getCellAt(12, 1).getTextContent().trim());
                entity.setLegalAddress(table.getCellAt(13, 1).getTextContent().trim());
                entity.setActualAddress(table.getCellAt(14, 1).getTextContent().trim());
                entity.setPostAddress(table.getCellAt(15, 1).getTextContent().trim());
                entity.setPhoneNumber(table.getCellAt(16, 1).getTextContent().trim());
                entity.setFaxNumber(table.getCellAt(17, 1).getTextContent().trim());
                entity.setJobTitleOfManager(table.getCellAt(18, 1).getTextContent().trim());
                entity.setManager(table.getCellAt(19, 1).getTextContent().trim());
                entity.setEmail(table.getCellAt(20, 1).getTextContent().trim());
                entity.setUrl(table.getCellAt(21, 1).getTextContent().trim());

                JAXBContext cont = JAXBContext.newInstance(entity.getClass());
                Marshaller m = cont.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                m.marshal(entity, System.out);
            };

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    public static void main(String... args) {
        try {
            new MyISourceHandler().process(new Legal(), null);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
