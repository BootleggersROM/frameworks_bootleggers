package bootleggers.support.lottie.model.animatable;

import bootleggers.support.lottie.value.Keyframe;
import bootleggers.support.lottie.animation.keyframe.TextKeyframeAnimation;
import bootleggers.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
