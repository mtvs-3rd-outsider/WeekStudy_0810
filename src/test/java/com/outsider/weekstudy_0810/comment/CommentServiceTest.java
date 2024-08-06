package com.outsider.weekstudy_0810.comment;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CommentServiceTest {

    @Autowired
    private CommentService commentService;

    private static Stream<Arguments> normalComment() {
        return Stream.of(
                Arguments.of(
                        1,
                        2,
                        3,
                        "content 111",
                        LocalDate.now()
                )
        );
    }

    @ParameterizedTest(name = "comment 생성 테스트")
    @MethodSource("normalComment")
    void generateComment (int memberId, int myChannelId, int postId, String content, LocalDate createdDate) {

        CommentRequestDTO commentRequestDTO =
                new CommentRequestDTO(memberId, myChannelId, postId, content, createdDate);

        Assertions.assertDoesNotThrow(
                () -> commentService.generateComment(commentRequestDTO)
        );
    }
}