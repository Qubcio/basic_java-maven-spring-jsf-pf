package pl.cubeitg.core.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cubeitg.core.DocumentService;
import pl.cubeitg.dao.DocumentDao;
import pl.cubeitg.entity.Document;

import java.io.Serializable;
import java.util.List;

@Service
public class DocumentServiceImp implements Serializable, DocumentService {

    private DocumentDao documentDao;

    @Autowired
    public void inject(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }

    @Override
    public void save(Document document) {
        documentDao.save(document);
    }

    @Override
    public Document get(Long id) {
        return documentDao.get(id);
    }

    @Override
    public List<Document> getAll() {
        return documentDao.getAll();
    }
}
