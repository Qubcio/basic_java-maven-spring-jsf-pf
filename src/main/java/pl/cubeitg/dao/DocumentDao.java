package pl.cubeitg.dao;

import pl.cubeitg.entity.Document;

public interface DocumentDao {
    void save(Document document);
    Document get(Long id);
}
