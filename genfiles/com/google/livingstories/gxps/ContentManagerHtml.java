// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp
*/

package com.google.livingstories.gxps;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L20, C67
import com.google.gxp.html.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L20, C67
import com.google.gxp.js.*;                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L20, C67
import com.google.gxp.text.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L20, C67

public class ContentManagerHtml extends com.google.gxp.base.GxpTemplate {       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L20, C67

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String mapsKey)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L25, C5
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L27, C9
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L27, C9
    }
    gxp$out.append("> <link type=\"text/css\" rel=\"stylesheet\" href=\"ContentManager.css\"");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L27, C9
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L31, C9
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L31, C9
    }
    gxp$out.append("> <title>Living Stories Content Manager</title> <script type=\"text/javascript\" language=\"javascript\" src=\"ContentManager/ContentManager.nocache.js\"></script> <script type=\"text/javascript\">\n          window.LIVING_STORY = {\n            MAPS_KEY: ");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L31, C9
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (mapsKey));   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L37, C23
    gxp$out.append("\n          };\n        </script></head> <body><iframe src=\"javascript:&#39;&#39;\" id=\"__gwt_historyFrame\" style=\"position:absolute;width:0;height:0;border:0\"></iframe> <h1>Living Stories Content Manager</h1></body></html>");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\ContentManagerHtml.gxp: L37, C49
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("mapsKey"));

  /**
   * @return the names of the user defined arguments to this template.
   * This is sort of like a mapping between the positional and named
   * parameters. The first two parameters (common to all templates) are
   * not included in this list. (BTW: No, Java reflection does not
   * provide this information)
   */
  public static java.util.List<String> getArgList() {
    return GXP$ARGLIST;
  }

  private abstract static class TunnelingHtmlClosure
      extends GxpTemplate.TunnelingGxpClosure
      implements com.google.gxp.html.HtmlClosure {
  }

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String mapsKey) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        com.google.livingstories.gxps.ContentManagerHtml.write(gxp$out, gxp_context, mapsKey);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String mapsKey)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String mapsKey);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String mapsKey)
        throws java.io.IOException {
      com.google.livingstories.gxps.ContentManagerHtml.write(gxp$out, gxp_context, mapsKey);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String mapsKey) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, mapsKey);
        }
      };
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
