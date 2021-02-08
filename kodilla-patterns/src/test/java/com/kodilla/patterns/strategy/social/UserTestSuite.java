package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User userM = new Millenials("User1");
        User userY = new YGeneration("User2");
        User userZ = new ZGeneration("User3");
        //When
        String facebook = userM.sharePost();
        String twitter = userY.sharePost();
        String snapchat = userZ.sharePost();
        //Then
        Assertions.assertEquals("I am using Facebook", facebook);
        Assertions.assertEquals("I am using Twitter", twitter);
        Assertions.assertEquals("I am using Snapchat", snapchat);

    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User userZ = new ZGeneration("User4");
        userZ.setSocialPublisher(new FacebookPublisher());
        //When
        String facebook = userZ.sharePost();
        //Then
        Assertions.assertEquals("I am using Facebook", facebook);
    }
}
