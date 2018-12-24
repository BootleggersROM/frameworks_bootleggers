package bootleggers.support.lottie.model.animatable;

import bootleggers.support.lottie.value.Keyframe;
import bootleggers.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import bootleggers.support.lottie.animation.keyframe.ColorKeyframeAnimation;

import java.util.List;

public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
  public AnimatableColorValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new ColorKeyframeAnimation(keyframes);
  }
}
