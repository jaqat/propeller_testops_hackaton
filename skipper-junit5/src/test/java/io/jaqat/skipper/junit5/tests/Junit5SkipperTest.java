package io.jaqat.skipper.junit5.tests;

import io.github.jaqat.skipper.core.base.impl.storagetracker.services.storage.impl.HazelcastStorageService;
import io.github.jaqat.skipper.junit5.extension.impl.AllureTestOpsSkipperExtension;
import io.github.jaqat.skipper.junit5.extension.impl.HazelcastJiraSkipperExtension;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5SkipperTest {

//    @Test
//    @ExtendWith(AllureTestOpsSkipperExtension.class)
//    void firstTest(){
//        assertTrue(false, "Debug defect error message");
//    }

    @Test
    @ExtendWith(HazelcastJiraSkipperExtension.class)
    void testMe(){
        assertTrue(false);

    }

}
