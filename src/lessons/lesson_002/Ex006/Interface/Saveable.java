package lessons.lesson_002.Ex006.Interface;

import lessons.lesson_002.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
