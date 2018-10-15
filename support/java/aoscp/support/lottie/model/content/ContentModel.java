package aoscp.support.lottie.model.content;


import android.support.annotation.Nullable;

import aoscp.support.lottie.LottieDrawable;
import aoscp.support.lottie.animation.content.Content;
import aoscp.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
