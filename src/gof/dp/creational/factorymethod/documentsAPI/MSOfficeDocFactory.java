package gof.dp.creational.factorymethod.documentsAPI;

import gof.dp.creational.factorymethod.AbstractDocumentFactory;

public class MSOfficeDocFactory extends AbstractDocumentFactory {
    @Override
    public DocInterface createDocument(DocType docType) {
        DocInterface docInterface = null;
        switch (docType) {
            case TEXT:
                docInterface = new DocWord("",0);
                break;
            case HTML:
                docInterface = new DocHTML();
                break;
            case WORD:
                docInterface = new DocOpenOffice("NewDoc.docx");
                break;
        }
        return docInterface;
    }
}
