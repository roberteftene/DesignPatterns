package gof.dp.creational.factorymethod.documentsAPI;

import gof.dp.creational.factorymethod.AbstractDocumentFactory;

public class OpenOfficeDocFactory extends AbstractDocumentFactory {

    @Override
    public DocInterface createDocument(DocType documentType) {
        DocInterface document = null;

        switch(documentType){
            case TEXT:
                document = new DocWord("",0);
                break;
            case HTML:
                document = new DocHTML();
                break;
            case WORD:
                document = new DocOpenOffice("NewDocument.writer");
                break;
        }

        return document;
    }


}
