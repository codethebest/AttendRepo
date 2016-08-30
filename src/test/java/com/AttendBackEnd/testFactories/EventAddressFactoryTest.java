package com.AttendBackEnd.testFactories;

import com.AttendBackEnd.domain.event.EventAddress;
import com.AttendBackEnd.factories.event.EventAddressFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Leo on 4/18/2016.
 */
public class EventAddressFactoryTest {

    @Test
    public void testEveentAddress()throws Exception
    {
         EventAddress eventAddress= EventAddressFactory.getEventAddress("long Street","Town","SA","Cape Town");
        Assert.assertEquals("long Street", eventAddress.getStreet());
    }

    @Test
    public void testUpdate ()throws Exception
    {
        EventAddress eventAddress= EventAddressFactory.getEventAddress("long Street", "Town", "SA", "Cape Town");
        EventAddress eventAddress1 = new EventAddress.Builder()
                .copy(eventAddress)
                .sub("Town")
                .build();
        Assert.assertEquals("Town",eventAddress.getSub());
    }
}
