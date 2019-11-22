package mapper;

import bean.AuthorInfo;

import java.util.List;

public interface AuthorMapper {
    List<AuthorInfo> findAllAuthor();
    void saveAuthor(String authorName);
}
