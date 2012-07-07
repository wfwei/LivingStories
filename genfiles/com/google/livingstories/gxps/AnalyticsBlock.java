// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp
*/

package com.google.livingstories.gxps;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L21, C67
import com.google.gxp.html.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L21, C67
import com.google.gxp.js.*;                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L21, C67
import com.google.gxp.text.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L21, C67

public class AnalyticsBlock extends com.google.gxp.base.GxpTemplate {           // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L21, C67

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String analyticsAccountId)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    if (analyticsAccountId.isEmpty()) {                                         // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L24, C3
      gxp$out.append("<script type=\"text/javascript\">var _gaq = null;</script>");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L25, C5
    } else {
      gxp$out.append("<script type=\"text/javascript\">\n      var _gaq = _gaq || [];\n      _gaq.push(['_setAccount', ");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L27, C5
      com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (analyticsAccountId));   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L29, C33
      gxp$out.append("]);\n      _gaq.push(['_trackPageview']);\n      document.documentElement.firstChild.appendChild(document.createElement('script')).src = \n          ('https:' === document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n    </script>");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\AnalyticsBlock.gxp: L29, C70
    }
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("analyticsAccountId"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String analyticsAccountId) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        com.google.livingstories.gxps.AnalyticsBlock.write(gxp$out, gxp_context, analyticsAccountId);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String analyticsAccountId)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String analyticsAccountId);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String analyticsAccountId)
        throws java.io.IOException {
      com.google.livingstories.gxps.AnalyticsBlock.write(gxp$out, gxp_context, analyticsAccountId);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String analyticsAccountId) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, analyticsAccountId);
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
