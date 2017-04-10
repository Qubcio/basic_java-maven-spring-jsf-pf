package pl.cubeitg.core;

import pl.cubeitg.entity.Document;

import java.util.List;

public interface DocumentService {
    void save(Document document);
    Document get(Long id);
    List<Document> getAll();
}
