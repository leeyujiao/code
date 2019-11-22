package bean;

public class AuthorInfo {
    private Integer authorId;
    private String authorName;
    private Integer authorState;

    public AuthorInfo() {
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAuthorState() {
        return authorState;
    }

    public void setAuthorState(Integer authorState) {
        this.authorState = authorState;
    }
}
