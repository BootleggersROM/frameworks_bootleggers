package bootleggers.support.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.NonNull;

import bootleggers.support.lottie.LottieDrawable;
import bootleggers.support.lottie.animation.content.Content;
import bootleggers.support.lottie.animation.content.ContentGroup;
import bootleggers.support.lottie.model.KeyPath;
import bootleggers.support.lottie.model.content.ShapeGroup;

import java.util.Collections;
import java.util.List;

public class ShapeLayer extends BaseLayer {
  private final ContentGroup contentGroup;

  ShapeLayer(LottieDrawable lottieDrawable, Layer layerModel) {
    super(lottieDrawable, layerModel);

    // Naming this __container allows it to be ignored in KeyPath matching.
    ShapeGroup shapeGroup = new ShapeGroup("__container", layerModel.getShapes());
    contentGroup = new ContentGroup(lottieDrawable, this, shapeGroup);
    contentGroup.setContents(Collections.<Content>emptyList(), Collections.<Content>emptyList());
  }

  @Override void drawLayer(@NonNull Canvas canvas, Matrix parentMatrix, int parentAlpha) {
    contentGroup.draw(canvas, parentMatrix, parentAlpha);
  }

  @Override public void getBounds(RectF outBounds, Matrix parentMatrix) {
    super.getBounds(outBounds, parentMatrix);
    contentGroup.getBounds(outBounds, boundsMatrix);
  }

  @Override
  protected void resolveChildKeyPath(KeyPath keyPath, int depth, List<KeyPath> accumulator,
      KeyPath currentPartialKeyPath) {
    contentGroup.resolveKeyPath(keyPath, depth, accumulator, currentPartialKeyPath);
  }
}
