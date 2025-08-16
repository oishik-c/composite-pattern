import com.compositepattern.html.HTMLCompositeElement;
import com.compositepattern.html.HTMLLeafElement;
import com.compositepattern.html.HTMLTag;

public class TestCompositePattern {
    public static void main(String[] args) {
        HTMLTag htmlParent = new HTMLCompositeElement("<html>");
        htmlParent.setStartTag("<html>");
        htmlParent.setEndTag("</html");

        HTMLTag bodyTag = new HTMLCompositeElement("<body>");
        bodyTag.setStartTag("<body>");
        bodyTag.setEndTag("</body>");

        htmlParent.addChildren(bodyTag);

        HTMLTag paragraph = new HTMLLeafElement("<P>");
        paragraph.setStartTag("<P>");
        paragraph.setEndTag("</P>");
        paragraph.setTagBody("Hello World!");

        bodyTag.addChildren(paragraph);
//        paragraph.addChildren(bodyTag);

        htmlParent.generateHTML();
    }
}
