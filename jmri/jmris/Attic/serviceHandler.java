// serviceHandler.java

package jmri.jmris;

import jmri.InstanceManager;

/**
 * This class provides access to the service handlers for individual object
 * types which can be passed to a parser visitor object.
 * 
 * @author Paul Bender Copyright (C) 2010
 * @version $Revision: 1.2 $
 *
 */
public class serviceHandler {

     // private service handler objects
     private AbstractPowerServer powerServer = null;
     private AbstractLightServer lightServer = null;
     private AbstractTurnoutServer turnoutServer = null;
     private AbstractSensorServer sensorServer = null;

     /*
      *  set the powerServer instance
      *  @param ps is an instance of an AbstractPowerServer 
      *            derived class.
      */
     public void setPowerServer(AbstractPowerServer ps)
     {
          powerServer = ps;
     }

     /*
      *  get the powerServer instance
      *  @return an instance of an AbstractPowerServer 
      *            derived class.
      */
     public AbstractPowerServer getPowerServer()
     {
          return powerServer;
     }

     /*
      *  set the lightServer instance
      *  @param ls is an instance of an AbstractLightServer 
      *            derived class.
      */
     public void setLightServer(AbstractLightServer ls)
     {
          lightServer = ls;
     }

     /*
      *  get the lightServer instance
      *  @return an instance of an AbstractLightServer 
      *            derived class.
      */
     public AbstractLightServer getLightServer()
     {
          return lightServer;
     }
  
   /*
      *  set the turnoutServer instance
      *  @param ts is an instance of an AbstractTurnoutServer 
      *            derived class.
      */
     public void setTurnoutServer(AbstractTurnoutServer ts)
     {
          turnoutServer = ts;
     }

     /*
      *  get the turnoutServer instance
      *  @return an instance of an AbstractTurnoutServer 
      *            derived class.
      */
     public AbstractTurnoutServer getTurnoutServer()
     {
          return turnoutServer;
     }
 
    /*
      *  set the sensorServer instance
      *  @param ss is an instance of an AbstractSensorServer 
      *            derived class.
      */
     public void setSensorServer(AbstractSensorServer ss)
     {
          sensorServer = ss;
     }

     /*
      *  get the sensorServer instance
      *  @return an instance of an AbstractSensorServer 
      *            derived class.
      */
     public AbstractSensorServer getSensorServer()
     {
          return sensorServer;
     }

}
