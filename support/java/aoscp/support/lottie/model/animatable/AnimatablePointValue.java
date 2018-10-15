package aoscp.support.lottie.model.animatable;

import android.graphics.PointF;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import aoscp.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
