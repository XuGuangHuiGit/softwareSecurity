package net.youmi.android.c.a;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class a
{
  public static Animation a(Context paramContext, int paramInt)
  {
    paramContext = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, -1.0F, 2, 0.0F);
    paramContext.setDuration(paramInt);
    return paramContext;
  }
  
  public static AnimationSet a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.setInterpolator(AnimationUtils.loadInterpolator(paramContext, 17432580));
    Animation localAnimation = a(paramContext, paramInt1);
    localAnimation.setFillAfter(true);
    paramContext = b(paramContext, paramInt3);
    paramContext.setFillAfter(true);
    paramContext.setStartOffset(paramInt2 + paramInt1);
    localAnimationSet.addAnimation(localAnimation);
    localAnimationSet.addAnimation(paramContext);
    return localAnimationSet;
  }
  
  public static Animation b(Context paramContext, int paramInt)
  {
    paramContext = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, -1.0F);
    paramContext.setDuration(paramInt);
    return paramContext;
  }
  
  public static AnimationSet b(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    localAnimationSet.setInterpolator(AnimationUtils.loadInterpolator(paramContext, 17432580));
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.5F, 1.0F);
    localAlphaAnimation.setDuration(paramInt1);
    localAlphaAnimation.setFillAfter(true);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(paramInt1);
    localScaleAnimation.setFillAfter(true);
    paramContext = d(paramContext, paramInt3);
    paramContext.setFillAfter(true);
    paramContext.setStartOffset(paramInt2 + paramInt1);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.addAnimation(localScaleAnimation);
    localAnimationSet.addAnimation(paramContext);
    return localAnimationSet;
  }
  
  public static Animation c(Context paramContext, int paramInt)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    localAnimationSet.setInterpolator(AnimationUtils.loadInterpolator(paramContext, 17432580));
    paramContext = new AlphaAnimation(0.5F, 1.0F);
    paramContext.setDuration(paramInt);
    paramContext.setFillAfter(true);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(paramInt);
    localScaleAnimation.setFillAfter(true);
    localAnimationSet.addAnimation(paramContext);
    localAnimationSet.addAnimation(localScaleAnimation);
    return localAnimationSet;
  }
  
  public static Animation d(Context paramContext, int paramInt)
  {
    paramContext = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
    paramContext.setDuration(paramInt);
    return paramContext;
  }
}


/* Location:           C:\Users\guanghui\Desktop\软件安全\37\classes-dex2jar.jar
 * Qualified Name:     net.youmi.android.c.a.a
 * JD-Core Version:    0.7.0.1
 */