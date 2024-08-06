package com.outsider.weekstudy_0810.comment;

import jakarta.persistence.Column;

public class CommentMyChannelId {

    @Column(name = "comment_my_channel_id")
    private int commentMyChannelId;

    protected CommentMyChannelId() {
    }

    public CommentMyChannelId(int commentMyChannelId) {
        this.commentMyChannelId = commentMyChannelId;
    }

    public int getCommentMyChannelId() {
        return commentMyChannelId;
    }
}
