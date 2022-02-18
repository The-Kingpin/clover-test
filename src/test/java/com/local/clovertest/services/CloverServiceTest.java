package com.local.clovertest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CloverServiceTest {

    @Test
    void initCloverService() {
        CloverService cloverService = new CloverService("azlk");

        Assertions.assertNotNull(cloverService);
    }

    @Test
    void testGetServiceName() {
        CloverService cloverService = new CloverService("Test");

        Assertions.assertEquals("Test", cloverService.getServiceName());
    }
}
