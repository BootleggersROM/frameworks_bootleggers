package aoscp.support.lottie.parser;

import android.util.JsonReader;
import android.util.Log;

import aoscp.support.lottie.L;
import aoscp.support.lottie.LottieComposition;
import aoscp.support.lottie.model.animatable.AnimatableIntegerValue;
import aoscp.support.lottie.model.animatable.AnimatableShapeValue;
import aoscp.support.lottie.model.content.Mask;

import java.io.IOException;

class MaskParser {

  private MaskParser() {}

  static Mask parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    Mask.MaskMode maskMode = null;
    AnimatableShapeValue maskPath = null;
    AnimatableIntegerValue opacity = null;

    reader.beginObject();
    while (reader.hasNext()) {
      String mode = reader.nextName();
      switch (mode) {
        case "mode":
          switch (reader.nextString()) {
            case "a":
              maskMode = Mask.MaskMode.MaskModeAdd;
              break;
            case "s":
              maskMode = Mask.MaskMode.MaskModeSubtract;
              break;
            case "i":
              maskMode = Mask.MaskMode.MaskModeIntersect;
              break;
            default:
              Log.w(L.TAG, "Unknown mask mode " + mode + ". Defaulting to Add.");
              maskMode = Mask.MaskMode.MaskModeAdd;
          }
          break;
        case "pt":
          maskPath = AnimatableValueParser.parseShapeData(reader, composition);
          break;
        case "o":
          opacity = AnimatableValueParser.parseInteger(reader, composition);
          break;
        default:
          reader.skipValue();
      }
    }
    reader.endObject();

    return new Mask(maskMode, maskPath, opacity);
  }

}
