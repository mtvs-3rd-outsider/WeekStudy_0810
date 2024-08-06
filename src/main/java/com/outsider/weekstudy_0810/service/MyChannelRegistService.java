package com.outsider.weekstudy_0810.service;

import com.outsider.weekstudy_0810.dto.MyChannelRegistRequestDTO;
import com.outsider.weekstudy_0810.embeded.*;
import com.outsider.weekstudy_0810.entity.MyChannel;
import com.outsider.weekstudy_0810.repository.MyChannelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MyChannelRegistService {

    private MyChannelRepository myChannelRepository;

    @Autowired
    public MyChannelRegistService(MyChannelRepository bookRepository) {
        this.myChannelRepository = bookRepository;
    }

    @Transactional
    public void registMyChannel(MyChannelRegistRequestDTO myChannelRegistRequestDTO) {

        MyChannel book = new MyChannel(
                new DisplayName( myChannelRegistRequestDTO.getDisplayName()),
                new Bio(myChannelRegistRequestDTO.getBio()),
                new Location( myChannelRegistRequestDTO.getLocation()),
                myChannelRegistRequestDTO.getJoinDate(),
                new Website(
                        myChannelRegistRequestDTO.getWebsite()
                ),
                new UserCounts(
                        myChannelRegistRequestDTO.getFollowersCount(),
                        myChannelRegistRequestDTO.getFollowingCount(),
                        myChannelRegistRequestDTO.getTweetsCount()
                ),
                new User(
                        myChannelRegistRequestDTO.getUsername(),
                        myChannelRegistRequestDTO.getEmail()
                )
        );

        myChannelRepository.save(book);
    }
}
