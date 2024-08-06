package com.outsider.weekstudy_0810.comment;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Transactional
    public void generateComment(CommentRequestDTO commentInfo) {
        commentRepository.save(new Comment(
                new CommentCompositeKey(
                        new CommentMemberId(commentInfo.getCommentMemberId()),
                        new CommentMyChannelId(commentInfo.getCommentMyChannelId()),
                        new CommentPostId(commentInfo.getCommentPostId())
                ),
                commentInfo.getContent(),
                commentInfo.getCreatedDate()
        ));
    }
}
