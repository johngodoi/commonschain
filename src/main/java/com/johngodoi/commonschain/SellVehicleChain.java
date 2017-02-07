package com.johngodoi.commonschain;

import com.johngodoi.commonschain.commands.*;
import org.apache.commons.chain.impl.ChainBase;

/**
 * http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html
 */
public class SellVehicleChain extends ChainBase {
    public SellVehicleChain() {
        super();
        addCommand(new GetCustomerInfo());
        addCommand(new TestDriveVehicle());
        addCommand(new NegotiateSale());
        addCommand(new ArrangeFinancing());
        addCommand(new CloseSale());
    }
}
