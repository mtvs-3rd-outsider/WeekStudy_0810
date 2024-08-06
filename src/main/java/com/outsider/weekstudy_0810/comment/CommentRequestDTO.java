package com.outsider.weekstudy_0810.comment;

import java.time.LocalDate;

public class CommentRequestDTO {

    private int commentMemberId;
    private int commentMyChannelId;
    private int commentPostId;
    private String content;
    private LocalDate createdDate;

    public CommentRequestDTO() {}

    public CommentRequestDTO(int commentMemberId, int commentMyChannelId, int commentPostId, String content, LocalDate createdDate) {
        this.commentMemberId = commentMemberId;
        this.commentMyChannelId = commentMyChannelId;
        this.commentPostId = commentPostId;
        this.content = content;
        this.createdDate = createdDate;
    }

    public int getCommentMemberId() {
        return commentMemberId;
    }

    public void setCommentMemberId(int commentMemberId) {
        this.commentMemberId = commentMemberId;
    }

    public int getCommentMyChannelId() {
        return commentMyChannelId;
    }

    public void setCommentMyChannelId(int commentMyChannelId) {
        this.commentMyChannelId = commentMyChannelId;
    }

    public int getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(int commentPostId) {
        this.commentPostId = commentPostId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
