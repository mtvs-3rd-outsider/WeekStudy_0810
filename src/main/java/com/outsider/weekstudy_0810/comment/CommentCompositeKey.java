package com.outsider.weekstudy_0810.comment;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class CommentCompositeKey {

    @Embedded
    private CommentMemberId commentMemberId;

    @Embedded
    private CommentMyChannelId commentMyChannelId;

    @Embedded
    private CommentPostId commentPostId;

    protected CommentCompositeKey() {
    }

    public CommentCompositeKey(CommentMemberId commentMemberId, CommentMyChannelId commentMyChannelId, CommentPostId commentPostId) {
        this.commentMemberId = commentMemberId;
        this.commentMyChannelId = commentMyChannelId;
        this.commentPostId = commentPostId;
    }

    public CommentMemberId getCommentMemberId() {
        return commentMemberId;
    }

    public CommentMyChannelId getCommentMyChannelId() {
        return commentMyChannelId;
    }

    public CommentPostId getCommentPostId() {
        return commentPostId;
    }
}
