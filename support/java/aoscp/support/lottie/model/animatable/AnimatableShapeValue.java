package aoscp.support.lottie.model.animatable;

import android.graphics.Path;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import aoscp.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import aoscp.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
