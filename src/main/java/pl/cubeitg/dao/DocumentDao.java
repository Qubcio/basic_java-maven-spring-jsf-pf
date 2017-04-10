package pl.cubeitg.dao;

import pl.cubeitg.entity.Document;

import java.util.List;

public interface DocumentDao {
    Document get(Long id);
    void save(Document document);
    List getAll();
}
