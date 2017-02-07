package com.johngodoi.commonschain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Command process = new SellVehicleChain();
        Context ctx = new ContextBase();
        try {
            process.execute(ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
