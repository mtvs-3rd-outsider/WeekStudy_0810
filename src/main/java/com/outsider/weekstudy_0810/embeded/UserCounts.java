package com.outsider.weekstudy_0810.embeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserCounts {
    private int followersCount;
    private int followingCount;
    private int tweetsCount;

    protected UserCounts() {}

    public UserCounts(int followersCount, int followingCount, int tweetsCount) {
        validateCounts(followersCount, followingCount, tweetsCount);
        this.followersCount = followersCount;
        this.followingCount = followingCount;
        this.tweetsCount = tweetsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        validateSingleCount(followersCount, "Followers count");
        this.followersCount = followersCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        validateSingleCount(followingCount, "Following count");
        this.followingCount = followingCount;
    }

    public int getTweetsCount() {
        return tweetsCount;
    }

    public void setTweetsCount(int tweetsCount) {
        validateSingleCount(tweetsCount, "Tweets count");
        this.tweetsCount = tweetsCount;
    }

    private void validateCounts(int followersCount, int followingCount, int tweetsCount) {
        if (followersCount < 0 || followingCount < 0 || tweetsCount < 0) {
            throw new IllegalArgumentException("Counts cannot be negative");
        }
    }

    private void validateSingleCount(int count, String countType) {
        if (count < 0) {
            throw new IllegalArgumentException(countType + " cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "UserCounts{" +
                "followersCount=" + followersCount +
                ", followingCount=" + followingCount +
                ", tweetsCount=" + tweetsCount +
                '}';
    }
}
