package bootleggers.support.lottie.animation.keyframe;

import bootleggers.support.lottie.value.Keyframe;
import bootleggers.support.lottie.utils.GammaEvaluator;

import java.util.List;

public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {

  public ColorKeyframeAnimation(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public Integer getValue(Keyframe<Integer> keyframe, float keyframeProgress) {
    if (keyframe.startValue == null || keyframe.endValue == null) {
      throw new IllegalStateException("Missing values for keyframe.");
    }
    int startColor = keyframe.startValue;
    int endColor = keyframe.endValue;

    if (valueCallback != null) {
      //noinspection ConstantConditions
      return valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame, startColor,
          endColor, keyframeProgress, getLinearCurrentKeyframeProgress(), getProgress());
    }

    return GammaEvaluator.evaluate(keyframeProgress, startColor, endColor);
  }
}
