package com.outsider.weekstudy_0810.comment;

import jakarta.persistence.Column;

public class CommentPostId {

    @Column(name = "comment_post_id")
    private int commentPostId;

    protected CommentPostId() {
    }

    public CommentPostId(int commentPostId) {
        this.commentPostId = commentPostId;
    }

    public int getCommentPostId() {
        return commentPostId;
    }
}
