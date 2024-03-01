package practice;

import java.util.List;

public interface ReaderService {
    void registerReader(Reader reader);
    List<Reader> findAllReaders();
}

