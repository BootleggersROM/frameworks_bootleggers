package aoscp.support.lottie.animation.keyframe;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.value.ScaleXY;
import aoscp.support.lottie.utils.MiscUtils;

import java.util.List;

public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {
  public ScaleKeyframeAnimation(List<Keyframe<ScaleXY>> keyframes) {
    super(keyframes);
  }

  @Override public ScaleXY getValue(Keyframe<ScaleXY> keyframe, float keyframeProgress) {
    if (keyframe.startValue == null || keyframe.endValue == null) {
      throw new IllegalStateException("Missing values for keyframe.");
    }
    ScaleXY startTransform = keyframe.startValue;
    ScaleXY endTransform = keyframe.endValue;

    if (valueCallback != null) {
      //noinspection ConstantConditions
      return valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame,
          startTransform, endTransform,
          keyframeProgress, getLinearCurrentKeyframeProgress(), getProgress());
    }

    return new ScaleXY(
        MiscUtils.lerp(startTransform.getScaleX(), endTransform.getScaleX(), keyframeProgress),
        MiscUtils.lerp(startTransform.getScaleY(), endTransform.getScaleY(), keyframeProgress));
  }
}
