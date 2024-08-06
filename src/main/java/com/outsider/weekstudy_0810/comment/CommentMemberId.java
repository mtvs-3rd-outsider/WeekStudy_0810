package com.outsider.weekstudy_0810.comment;

import jakarta.persistence.Column;

public class CommentMemberId {

    @Column(name = "comment_member_id")
    private int commentMemberId;

    protected CommentMemberId() {
    }

    public CommentMemberId(int commentMemberId) {
        this.commentMemberId = commentMemberId;
    }

    public int getCommentMemberId() {
        return commentMemberId;
    }


}
