package bean;

public class BookInfo {
    private Integer bookId ;
    private String bookName ;
    private String bookImg ;
    private Integer authorId;
    private Integer pubId ;
    private String bookContent;
    private Integer bookState ;
    private AuthorInfo ai;
    private PubInfo pi;

    public BookInfo() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public AuthorInfo getAi() {
        return ai;
    }

    public void setAi(AuthorInfo ai) {
        this.ai = ai;
    }

    public PubInfo getPi() {
        return pi;
    }

    public void setPi(PubInfo pi) {
        this.pi = pi;
    }
}
