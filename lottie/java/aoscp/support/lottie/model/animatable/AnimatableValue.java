package aoscp.support.lottie.model.animatable;

import aoscp.support.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {
  BaseKeyframeAnimation<K, A> createAnimation();
}
