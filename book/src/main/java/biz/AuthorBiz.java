package biz;

import bean.AuthorInfo;

import java.util.List;

public interface AuthorBiz {
    String findAllAuthor();
    void saveAuthor(String authorName);
}
