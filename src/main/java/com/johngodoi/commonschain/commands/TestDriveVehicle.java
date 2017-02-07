package com.johngodoi.commonschain.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html
 */
public class TestDriveVehicle implements Command {
    public boolean execute(Context ctx) throws Exception {
        System.out.println("Test drive the vehicle");
        return false;
    }
}