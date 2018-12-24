package bootleggers.support.lottie.model.animatable;

import bootleggers.support.lottie.value.Keyframe;
import bootleggers.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import bootleggers.support.lottie.animation.keyframe.IntegerKeyframeAnimation;

import java.util.List;

public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {

  public AnimatableIntegerValue() {
    super(100);
  }

  public AnimatableIntegerValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new IntegerKeyframeAnimation(keyframes);
  }
}
