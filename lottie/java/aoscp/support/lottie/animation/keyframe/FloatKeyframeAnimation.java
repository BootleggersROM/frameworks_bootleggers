package aoscp.support.lottie.animation.keyframe;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.utils.MiscUtils;

import java.util.List;

public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {

  public FloatKeyframeAnimation(List<Keyframe<Float>> keyframes) {
    super(keyframes);
  }

  @Override Float getValue(Keyframe<Float> keyframe, float keyframeProgress) {
    if (keyframe.startValue == null || keyframe.endValue == null) {
      throw new IllegalStateException("Missing values for keyframe.");
    }

    if (valueCallback != null) {
      //noinspection ConstantConditions
      return valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame,
          keyframe.startValue, keyframe.endValue,
          keyframeProgress, getLinearCurrentKeyframeProgress(), getProgress());
    }

    return MiscUtils.lerp(keyframe.startValue, keyframe.endValue, keyframeProgress);
  }
}
