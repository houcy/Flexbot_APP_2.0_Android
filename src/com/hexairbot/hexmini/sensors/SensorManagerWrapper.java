<<<<<<< HEAD
package com.hexairbot.hexmini.sensors;

import android.hardware.SensorEventListener;
import android.os.Handler;

public abstract class SensorManagerWrapper
{
    private boolean isGyroAvailable;
    private boolean isMagnetoAvailable;
    private boolean isAcceleroAvailable;

    /**
     * 
     * @param theListener
     * @param theType
     * @return true if sensor was registered
     */
    public abstract boolean registerListener(final SensorEventListener theListener, int theType, Handler handler);

    public abstract void unregisterListener(final SensorEventListener theListener);

    public abstract void onCreate();
    
    public abstract void onDestroy();
    
    public abstract void onPause();
   
    public abstract void onResume();
    

    public boolean isGyroAvailable()
    {
        return isGyroAvailable;
    }

    public void setGyroAvailable(boolean isGyroAvailable)
    {
        this.isGyroAvailable = isGyroAvailable;
    }

    public boolean isMagnetoAvailable()
    {
        return isMagnetoAvailable;
    }

    public void setMagnetoAvailable(boolean isMagnetoAvailable)
    {
        this.isMagnetoAvailable = isMagnetoAvailable;
    }

    public boolean isAcceleroAvailable()
    {
        return isAcceleroAvailable;
    }

    public void setAcceleroAvailable(boolean isAcceleroAvailable)
    {
        this.isAcceleroAvailable = isAcceleroAvailable;
    }
}
=======
package com.hexairbot.hexmini.sensors;

import android.hardware.SensorEventListener;
import android.os.Handler;

public abstract class SensorManagerWrapper
{
    private boolean isGyroAvailable;
    private boolean isMagnetoAvailable;
    private boolean isAcceleroAvailable;

    /**
     * 
     * @param theListener
     * @param theType
     * @return true if sensor was registered
     */
    public abstract boolean registerListener(final SensorEventListener theListener, int theType, Handler handler);

    public abstract void unregisterListener(final SensorEventListener theListener);

    public abstract void onCreate();
    
    public abstract void onDestroy();
    
    public abstract void onPause();
   
    public abstract void onResume();
    

    public boolean isGyroAvailable()
    {
        return isGyroAvailable;
    }

    public void setGyroAvailable(boolean isGyroAvailable)
    {
        this.isGyroAvailable = isGyroAvailable;
    }

    public boolean isMagnetoAvailable()
    {
        return isMagnetoAvailable;
    }

    public void setMagnetoAvailable(boolean isMagnetoAvailable)
    {
        this.isMagnetoAvailable = isMagnetoAvailable;
    }

    public boolean isAcceleroAvailable()
    {
        return isAcceleroAvailable;
    }

    public void setAcceleroAvailable(boolean isAcceleroAvailable)
    {
        this.isAcceleroAvailable = isAcceleroAvailable;
    }
}
>>>>>>> 3f0a383cae589e0b799e261267e77a9bf935e310
