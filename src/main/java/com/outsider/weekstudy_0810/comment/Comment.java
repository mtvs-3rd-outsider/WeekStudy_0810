package com.outsider.weekstudy_0810.comment;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comment")
public class Comment {

    @EmbeddedId
    private CommentCompositeKey commentInfo;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    protected Comment() {
    }

    public Comment(CommentCompositeKey commentInfo, String content, LocalDate createdDate) {
        this.commentInfo = commentInfo;
        this.content = content;
        this.createdDate = createdDate;
    }

    public CommentCompositeKey getCommentInfo() {
        return commentInfo;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
