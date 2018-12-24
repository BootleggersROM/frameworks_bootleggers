package bootleggers.support.lottie.model.content;


import android.support.annotation.Nullable;

import bootleggers.support.lottie.LottieDrawable;
import bootleggers.support.lottie.animation.content.Content;
import bootleggers.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
