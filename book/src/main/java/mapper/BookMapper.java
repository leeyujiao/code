package mapper;

import bean.BookInfo;

import java.util.List;

public interface BookMapper {
    List<BookInfo> searchBook(BookInfo bi);
}
