package com.hyb.aspectlibrary;

/**
 * 类描述：
 * 创建人：huangyaobin
 * 创建时间：2019/12/11
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class Configuration {

    private static Configuration mConfiguration;
    private int delayTime = 500;
    private OnAspectListener mOnAspectListener;

    private boolean isOpen = true;

    public static Configuration getInstance(){
        if(mConfiguration == null){
            mConfiguration = new Configuration();
        }
        return mConfiguration;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public OnAspectListener getmOnAspectListener() {
        return mOnAspectListener;
    }

    public void setmOnAspectListener(OnAspectListener mOnAspectListener) {
        this.mOnAspectListener = mOnAspectListener;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }


}
