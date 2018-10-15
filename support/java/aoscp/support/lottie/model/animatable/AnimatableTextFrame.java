package aoscp.support.lottie.model.animatable;

import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.animation.keyframe.TextKeyframeAnimation;
import aoscp.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
