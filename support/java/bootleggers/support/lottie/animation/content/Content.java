package bootleggers.support.lottie.animation.content;

import java.util.List;

public interface Content {
  String getName();

  void setContents(List<Content> contentsBefore, List<Content> contentsAfter);
}
