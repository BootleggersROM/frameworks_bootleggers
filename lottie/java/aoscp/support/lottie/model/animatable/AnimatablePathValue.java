package aoscp.support.lottie.model.animatable;

import android.graphics.PointF;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import aoscp.support.lottie.animation.keyframe.PathKeyframeAnimation;
import aoscp.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.Collections;
import java.util.List;

public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {
  private final List<Keyframe<PointF>> keyframes;

  /**
   * Create a default static animatable path.
   */
  public AnimatablePathValue() {
    keyframes = Collections.singletonList(new Keyframe<>(new PointF(0, 0)));
  }

  public AnimatablePathValue(List<Keyframe<PointF>> keyframes) {
    this.keyframes = keyframes;
  }

  @Override
  public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    if (keyframes.get(0).isStatic()) {
      return new PointKeyframeAnimation(keyframes);
    }
    return new PathKeyframeAnimation(keyframes);
  }
}
