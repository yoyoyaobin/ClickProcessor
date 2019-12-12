package com.hyb.aspectlibrary;

/**
 * 类描述：
 * 创建人：huangyaobin
 * 创建时间：2019/12/11
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class Aspect {

    private volatile static Aspect mAspect;

    public static Aspect init(){
        if(mAspect == null){
            synchronized (Aspect.class){
                if(mAspect == null){
                    mAspect = new Aspect();
                }
            }
        }
        return getInstance();
    }

    public static Aspect getInstance(){
        return mAspect;
    }

    public Aspect setClickDelayTime(int time){
        Configuration.getInstance().setDelayTime(time);
        return mAspect;
    }

    public Aspect setOnAspectListener(OnAspectListener mOnAspectListener){
        Configuration.getInstance().setmOnAspectListener(mOnAspectListener);
        return mAspect;
    }

    public Aspect isOpen(boolean open){
        Configuration.getInstance().setOpen(open);
        return mAspect;
    }

}
