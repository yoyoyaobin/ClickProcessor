package com.hyb.aspectlibrary;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 类描述：切面触发器
 * 创建人：huangyaobin
 * 创建时间：2019/12/11
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Aspect
public class AspectListener {

    private Long clickTime = 0L;
    private int dalayTime;
    private OnAspectListener mOnAspectListener;

    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void onClickListener(ProceedingJoinPoint joinPoint) throws Throwable {

        if(!Configuration.getInstance().isOpen()){
            joinPoint.proceed();
            return;
        }

        if(System.currentTimeMillis() - clickTime < dalayTime){
            clickTime = System.currentTimeMillis();
            return;
        }

        clickTime = System.currentTimeMillis();
        dalayTime = Configuration.getInstance().getDelayTime();
        mOnAspectListener = Configuration.getInstance().getmOnAspectListener();

        if(mOnAspectListener == null){
            joinPoint.proceed();
            return;
        }

        if(mOnAspectListener.aspect()){
            joinPoint.proceed();
        }

    }

}
