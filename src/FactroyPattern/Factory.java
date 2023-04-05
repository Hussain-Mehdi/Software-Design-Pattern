package FactroyPattern;

public class Factory {

    public Transport getTransport(String transportType)
    {
        if(transportType==null)
            return  null;

        if(transportType.equalsIgnoreCase("TRUCK")) {
            return new TruckDelivery();
        }
        else if(transportType.equalsIgnoreCase("SHIP"))
        {
            return new ShipDelivery();
        }
        return null;
    }
}
