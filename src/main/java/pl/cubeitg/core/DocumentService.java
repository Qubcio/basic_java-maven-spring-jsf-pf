package pl.cubeitg.core;

import pl.cubeitg.entity.Document;

public interface DocumentService {
    void save(Document document);
    Document get(Long id);
}
