// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp
*/

package com.google.livingstories.gxps;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L24, C67
import com.google.gxp.html.*;                                                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L24, C67
import com.google.gxp.js.*;                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L24, C67
import com.google.gxp.text.*;                                                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L24, C67
import com.google.livingstories.client.FilterSpec;                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L25, C3
import org.json.JSONObject;                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L26, C3

public class StartPageHtml extends com.google.gxp.base.GxpTemplate {            // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L24, C67

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><script type=\"text/javascript\" language=\"javascript\" src=\"StartPage/StartPage.nocache.js\"></script> <script type=\"text/javascript\">\n          window.LIVING_STORY = {\n            USER_NAME: ");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L38, C5
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (userName));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L45, C24
    gxp$out.append(",\n            LOGIN_URL: ");                               // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L45, C51
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (loginUrl));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L46, C24
    gxp$out.append(",\n            LOGOUT_URL: ");                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L46, C51
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (logoutUrl));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L47, C25
    gxp$out.append(",\n            LAST_VISIT_TIMES: ");                        // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L47, C53
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (lastVisitTimes));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L48, C31
    gxp$out.append(",\n            DEFAULT_PAGE: ");                            // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L48, C64
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (defaultStoryView == null ? null : defaultStoryView.getFilterParams()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L49, C27
    gxp$out.append("\n          };\n        </script> ");                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L49, C114
    com.google.livingstories.gxps.AnalyticsBlock.write(gxp$out, gxp_context, analyticsAccountId);   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L53, C9
    gxp$out.append("</head> <body><table width=\"100%\"><tr><td><img id=\"logoImage\" src=\"");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L39, C7
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (logoLocation));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L59, C15
    gxp$out.append("\" alt=\"\"");                                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L59, C15
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L59, C15
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L59, C15
    }
    gxp$out.append("></td> <td style=\"vertical-align: top;\"><div class=\"loginPane\" id=\"managementLinks\"></div></td></tr></table> <div style=\"width: 60%;\" id=\"storyList\"></div></body></html>");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\StartPageHtml.gxp: L59, C15
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("currentUrl", "userName", "loginUrl", "logoutUrl", "lastVisitTimes", "defaultStoryView", "logoLocation", "analyticsAccountId"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        com.google.livingstories.gxps.StartPageHtml.write(gxp$out, gxp_context, currentUrl, userName, loginUrl, logoutUrl, lastVisitTimes, defaultStoryView, logoLocation, analyticsAccountId);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId)
        throws java.io.IOException {
      com.google.livingstories.gxps.StartPageHtml.write(gxp$out, gxp_context, currentUrl, userName, loginUrl, logoutUrl, lastVisitTimes, defaultStoryView, logoLocation, analyticsAccountId);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final String userName, final String loginUrl, final String logoutUrl, final JSONObject lastVisitTimes, final FilterSpec defaultStoryView, final String logoLocation, final String analyticsAccountId) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, currentUrl, userName, loginUrl, logoutUrl, lastVisitTimes, defaultStoryView, logoLocation, analyticsAccountId);
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
