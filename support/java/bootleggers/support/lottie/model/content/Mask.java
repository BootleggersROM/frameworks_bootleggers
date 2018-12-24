package bootleggers.support.lottie.model.content;

import bootleggers.support.lottie.model.animatable.AnimatableIntegerValue;
import bootleggers.support.lottie.model.animatable.AnimatableShapeValue;

public class Mask {
  public enum MaskMode {
    MaskModeAdd,
    MaskModeSubtract,
    MaskModeIntersect
  }

  private final MaskMode maskMode;
  private final AnimatableShapeValue maskPath;
  private final AnimatableIntegerValue opacity;

  public Mask(MaskMode maskMode, AnimatableShapeValue maskPath, AnimatableIntegerValue opacity) {
    this.maskMode = maskMode;
    this.maskPath = maskPath;
    this.opacity = opacity;
  }

  public MaskMode getMaskMode() {
    return maskMode;
  }

  public AnimatableShapeValue getMaskPath() {
    return maskPath;
  }

  public AnimatableIntegerValue getOpacity() {
    return opacity;
  }
}
