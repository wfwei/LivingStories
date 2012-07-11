// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp
*/

package com.google.livingstories.gxps;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L24, C67
import com.google.gxp.html.*;                                                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L24, C67
import com.google.gxp.js.*;                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L24, C67
import com.google.gxp.text.*;                                                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L24, C67
import com.google.livingstories.client.FilterSpec;                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L25, C3
import com.google.livingstories.client.LivingStory;                             // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L26, C3
import com.google.livingstories.server.util.LivingStoryIterator;                // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L27, C3
import com.google.livingstories.server.util.SummaryDiffUtil;                    // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L28, C3
import java.util.Date;                                                          // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L29, C3
import java.util.List;                                                          // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L30, C3

public class LivingStoryHtml extends com.google.gxp.base.GxpTemplate {          // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L24, C67

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><title>");                                      // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L47, C3
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (livingStory.getTitle()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L49, C14
    gxp$out.append("</title>\n<link id=\"rssLink\" rel=\"alternate\" type=\"application/rss+xml\" href=\"");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L49, C7
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, ("../feeds/" + livingStory.getUrl()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L51, C7
    gxp$out.append("\"");                                                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L51, C7
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L51, C7
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L51, C7
    }
    gxp$out.append(">\n<script type=\"text/javascript\" src=\"../LivingStoryPage/LivingStoryPage.nocache.js\"></script>\n<script type=\"text/javascript\" src=\"http://www.google.com/friendconnect/script/friendconnect.js\"></script>\n<script type=\"text/javascript\">\n        window.LIVING_STORY = {\n          ID: ");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L51, C7
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (livingStory.getId()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L63, C15
    gxp$out.append(",\n          TITLE: ");                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L63, C53
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (livingStory.getTitle()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L64, C18
    gxp$out.append(",\n          STORY_URL: ");                                 // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L64, C59
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (livingStory.getUrl()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L65, C22
    gxp$out.append(",\n          SUMMARY: ");                                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L65, C61
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (SummaryDiffUtil.getDiffedSummary(livingStory, lastVisitDate)));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L66, C20
    gxp$out.append(",\n          LAST_VISIT_DATE: ");                           // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L66, C99
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (lastVisitDate == null ? null : lastVisitDate.toString()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L67, C28
    gxp$out.append(",\n          SUBSCRIPTION_STATUS: ");                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L67, C102
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (subscriptionStatus));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L68, C32
    gxp$out.append(",\n          SUBSCRIBE_URL: ");                             // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L68, C69
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (subscriptionUrl));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L69, C26
    gxp$out.append(",\n          DEFAULT_PAGE: ");                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L69, C60
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (defaultStoryView == null ? null : defaultStoryView.getFilterParams()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L70, C25
    gxp$out.append(",\n          USER_NAME: ");                                 // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L70, C112
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (userName));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L71, C22
    gxp$out.append(",\n          LOGIN_URL: ");                                 // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L71, C49
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (loginUrl));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L72, C22
    gxp$out.append(",\n          LOGOUT_URL: ");                                // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L72, C49
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (logoutUrl));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L73, C23
    gxp$out.append(",\n          FRIEND_CONNECT_SITE_ID: ");                    // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L73, C51
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (friendConnectSiteId));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L74, C35
    gxp$out.append(",\n          MAPS_KEY: ");                                  // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L74, C73
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (mapsKey));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L75, C21
    gxp$out.append(",\n          LOGO_LOCATION: ");                             // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L75, C47
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (logoLocation));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L76, C26
    gxp$out.append("\n        };\n      </script>\n<link rel=\"stylesheet\" href=\"../LivingStoryPage/gwt/standard/standard.css\"");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L76, C57
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L80, C7
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L80, C7
    }
    gxp$out.append(">\n<link rel=\"stylesheet\" href=\"../Timeline.css\"");     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L80, C7
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L81, C7
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L81, C7
    }
    gxp$out.append(">\n");                                                      // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L81, C7
    com.google.livingstories.gxps.AnalyticsBlock.write(gxp$out, gxp_context, analyticsAccountId);   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L83, C7
    gxp$out.append("</head>\n<body><iframe src=\"javascript:&#39;&#39;\" id=\"__gwt_historyFrame\" style=\"position:absolute;width:0;height:0;border:0\"></iframe>\n<div class=\"page\" id=\"storyBody\"></div>\n<div class=\"page\"><div style=\"margin: 5px; border-top: 1px solid #999; padding: 5px 0px;\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"><tr><td id=\"readOtherStories\" style=\"color: #777; vertical-align: top;\"></td>\n<td style=\"text-align: left; vertical-align: top;\">");   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L48, C5
    {
      final LivingStoryIterator itr = new LivingStoryIterator(otherStories.iterator(), livingStory, 4);   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L101, C17
      {
        boolean gxp$bool$0 = false;
        final java.util.Iterator<? extends LivingStory> gxp$iter$1 = itr;       // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L103, C19
        while (gxp$iter$1.hasNext()) {                                          // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L103, C19
          final LivingStory story = gxp$iter$1.next();                          // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L103, C19
          if (gxp$bool$0) {
            gxp$out.append(" ");                                                // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L103, C19
          } else {
            gxp$bool$0 = true;
          }
          if (story != null) {                                                  // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L104, C21
            gxp$out.append("&nbsp;&nbsp;&nbsp;\n<a href=\"");                   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L105, C34
            com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (story.getUrl()));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L106, C23
            gxp$out.append("\" style=\"text-decoration: underline;\">");        // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L106, C23
            com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (story.getTitle().trim().replaceAll(" ", "\u00a0")));   // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L106, C90
            gxp$out.append("</a>\n");                                           // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L106, C23
            if (itr.getCount() % 2 == 0) {                                      // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L108, C23
              gxp$out.append("<br");                                            // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L109, C25
              if (gxp_context.isUsingXmlSyntax()) {                             // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L109, C25
                gxp$out.append(" /");                                           // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L109, C25
              }
              gxp$out.append(">");                                              // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L109, C25
            }
          }
        }
      }
    }
    gxp$out.append("</td></tr></table></div></div></body></html>");             // D:\Users\WangFengwei\Workspaces\MyEclipse 10\living-stories\src\com\google\livingstories\gxps\LivingStoryHtml.gxp: L100, C15
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("currentUrl", "livingStory", "userName", "loginUrl", "logoutUrl", "subscriptionUrl", "lastVisitDate", "subscriptionStatus", "defaultStoryView", "friendConnectSiteId", "mapsKey", "analyticsAccountId", "logoLocation", "otherStories"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        com.google.livingstories.gxps.LivingStoryHtml.write(gxp$out, gxp_context, currentUrl, livingStory, userName, loginUrl, logoutUrl, subscriptionUrl, lastVisitDate, subscriptionStatus, defaultStoryView, friendConnectSiteId, mapsKey, analyticsAccountId, logoLocation, otherStories);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories)
        throws java.io.IOException {
      com.google.livingstories.gxps.LivingStoryHtml.write(gxp$out, gxp_context, currentUrl, livingStory, userName, loginUrl, logoutUrl, subscriptionUrl, lastVisitDate, subscriptionStatus, defaultStoryView, friendConnectSiteId, mapsKey, analyticsAccountId, logoLocation, otherStories);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String currentUrl, final LivingStory livingStory, final String userName, final String loginUrl, final String logoutUrl, final String subscriptionUrl, final Date lastVisitDate, final boolean subscriptionStatus, final FilterSpec defaultStoryView, final String friendConnectSiteId, final String mapsKey, final String analyticsAccountId, final String logoLocation, final List<LivingStory> otherStories) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, currentUrl, livingStory, userName, loginUrl, logoutUrl, subscriptionUrl, lastVisitDate, subscriptionStatus, defaultStoryView, friendConnectSiteId, mapsKey, analyticsAccountId, logoLocation, otherStories);
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
