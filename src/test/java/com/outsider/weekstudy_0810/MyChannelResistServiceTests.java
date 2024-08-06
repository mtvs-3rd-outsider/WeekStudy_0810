package com.outsider.weekstudy_0810;

import com.outsider.weekstudy_0810.dto.MyChannelRegistRequestDTO;
import com.outsider.weekstudy_0810.service.MyChannelRegistService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Stream;

@SpringBootTest
@Transactional
public class MyChannelResistServiceTests {

    @Autowired
    private MyChannelRegistService myChannelRegistService;

    private static Stream<Arguments> getChannelInfos() {
        return Stream.of(
                Arguments.of("John Doe", "This is John's bio", "New York, NY, USA", LocalDate.now(), "https://example.com", 100, 50, 200, "john_doe", "john.doe@example.com"),
                Arguments.of("Jane Smith", "This is Jane's bio", "Los Angeles, CA, USA", LocalDate.now(), "https://example.org", 150, 75, 250, "jane_smith", "jane.smith@example.org"),
                Arguments.of("Jane Smith", "", "", LocalDate.now(), "", 0, 0, 0, "jane_smith", "jane.smith@example.org")
        );
    }

    @ParameterizedTest(name = "Test registration of channel for {0}")
    @MethodSource("getChannelInfos")
    void testRegistMyChannel(String displayName, String bio, String location, LocalDate joinDate, String website, int followersCount, int followingCount, int tweetsCount, String username, String email) {
        MyChannelRegistRequestDTO dto = new MyChannelRegistRequestDTO();
        dto.setDisplayName(displayName);
        dto.setBio(bio);
        dto.setLocation(location);
        dto.setJoinDate(joinDate);
        dto.setWebsite(website);
        dto.setFollowersCount(followersCount);
        dto.setFollowingCount(followingCount);
        dto.setTweetsCount(tweetsCount);
        dto.setUsername(username);
        dto.setEmail(email);
        Assertions.assertDoesNotThrow(() -> myChannelRegistService.registMyChannel(dto));
    }


}
