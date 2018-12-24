package bootleggers.support.lottie.model.animatable;

import android.graphics.Path;

import bootleggers.support.lottie.value.Keyframe;
import bootleggers.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import bootleggers.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import bootleggers.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
