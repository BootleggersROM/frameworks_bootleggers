package bootleggers.support.lottie.model.content;

import android.graphics.Paint;
import android.support.annotation.Nullable;

import bootleggers.support.lottie.LottieDrawable;
import bootleggers.support.lottie.animation.content.Content;
import bootleggers.support.lottie.animation.content.StrokeContent;
import bootleggers.support.lottie.model.animatable.AnimatableColorValue;
import bootleggers.support.lottie.model.animatable.AnimatableFloatValue;
import bootleggers.support.lottie.model.animatable.AnimatableIntegerValue;
import bootleggers.support.lottie.model.layer.BaseLayer;

import java.util.List;

public class ShapeStroke implements ContentModel {
  public enum LineCapType {
    Butt,
    Round,
    Unknown;

    public Paint.Cap toPaintCap() {
      switch (this) {
        case Butt:
          return Paint.Cap.BUTT;
        case Round:
          return Paint.Cap.ROUND;
        case Unknown:
        default:
          return Paint.Cap.SQUARE;
      }
    }
  }

  public enum LineJoinType {
    Miter,
    Round,
    Bevel;

    public Paint.Join toPaintJoin() {
      switch (this) {
        case Bevel:
          return Paint.Join.BEVEL;
        case Miter:
          return Paint.Join.MITER;
        case Round:
          return Paint.Join.ROUND;
      }
      return null;
    }
  }

  private final String name;
  @Nullable private final AnimatableFloatValue offset;
  private final List<AnimatableFloatValue> lineDashPattern;
  private final AnimatableColorValue color;
  private final AnimatableIntegerValue opacity;
  private final AnimatableFloatValue width;
  private final LineCapType capType;
  private final LineJoinType joinType;

  public ShapeStroke(String name, @Nullable AnimatableFloatValue offset,
      List<AnimatableFloatValue> lineDashPattern, AnimatableColorValue color,
      AnimatableIntegerValue opacity, AnimatableFloatValue width, LineCapType capType,
      LineJoinType joinType) {
    this.name = name;
    this.offset = offset;
    this.lineDashPattern = lineDashPattern;
    this.color = color;
    this.opacity = opacity;
    this.width = width;
    this.capType = capType;
    this.joinType = joinType;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new StrokeContent(drawable, layer, this);
  }

  public String getName() {
    return name;
  }

  public AnimatableColorValue getColor() {
    return color;
  }

  public AnimatableIntegerValue getOpacity() {
    return opacity;
  }

  public AnimatableFloatValue getWidth() {
    return width;
  }

  public List<AnimatableFloatValue> getLineDashPattern() {
    return lineDashPattern;
  }

  public AnimatableFloatValue getDashOffset() {
    return offset;
  }

  public LineCapType getCapType() {
    return capType;
  }

  public LineJoinType getJoinType() {
    return joinType;
  }
}
