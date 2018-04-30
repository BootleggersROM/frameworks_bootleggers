package aoscp.support.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

import aoscp.support.lottie.LottieComposition;
import aoscp.support.lottie.value.Keyframe;
import aoscp.support.lottie.animation.keyframe.PathKeyframe;
import aoscp.support.lottie.utils.Utils;

import java.io.IOException;

class PathKeyframeParser {

  private PathKeyframeParser() {}

  static PathKeyframe parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    boolean animated = reader.peek() == JsonToken.BEGIN_OBJECT;
    Keyframe<PointF> keyframe = KeyframeParser.parse(
        reader, composition, Utils.dpScale(), PathParser.INSTANCE, animated);

    return new PathKeyframe(composition, keyframe);
  }
}
