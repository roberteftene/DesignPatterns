package gof.dp.creational.factorymethod;

import gof.dp.creational.factorymethod.documentsAPI.*;

public class TestFactoryMethod {

    public static void main(String[] args) {

        //    DocWord word = new DocWord("badcode.txt",3)
        //    DocOpenOffice openOffice = new DocOpenOffice("badbad.txt");

        AbstractDocumentFactory documentFactory = null;
        documentFactory = new MSOfficeDocFactory();

        DocWord wordDoc =
                (DocWord) documentFactory.createDocument(DocType.TEXT);
        System.out.println(wordDoc.getType());

    }
}
