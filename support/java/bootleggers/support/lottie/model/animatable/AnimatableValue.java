package bootleggers.support.lottie.model.animatable;

import bootleggers.support.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {
  BaseKeyframeAnimation<K, A> createAnimation();
}
