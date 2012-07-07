// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp
*/

package com.google.livingstories.gxps;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L24, C67
import com.google.gxp.html.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L24, C67
import com.google.gxp.js.*;                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L24, C67
import com.google.gxp.text.*;                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L24, C67
import java.util.List;                                                          // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L25, C3

public class GqlServletHtml extends com.google.gxp.base.GxpTemplate {           // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L24, C67

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String query, final List<Object> results)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><title>Gql query test</title> <style type=\"text/css\">\n          pre {\n            white-space: pre-wrap;\n            white-space: -moz-pre-wrap !important;\n            word-wrap: break-word;\n          }\n        </style></head> <body><form method=\"POST\" action=\"gqlServlet\">Query: (note - must use fully qualified class names)<br");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L31, C5
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L44, C63
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L44, C63
    }
    gxp$out.append("> <textarea name=\"query\" rows=\"5\" cols=\"80\">");       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L44, C63
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (query));   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L46, C13
    gxp$out.append("</textarea> <br");                                          // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L45, C11
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L48, C11
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L48, C11
    }
    gxp$out.append("> <input type=\"submit\" value=\"Submit\"");                // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L48, C11
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L49, C11
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L49, C11
    }
    gxp$out.append("> <input type=\"submit\" name=\"delete\" value=\"Delete\"");   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L49, C11
    if (gxp_context.isUsingXmlSyntax()) {                                       // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L50, C11
      gxp$out.append(" /");                                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L50, C11
    }
    gxp$out.append("></form> ");                                                // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L50, C11
    if (results != null) {                                                      // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L53, C9
      gxp$out.append("<hr");                                                    // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L54, C11
      if (gxp_context.isUsingXmlSyntax()) {                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L54, C11
        gxp$out.append(" /");                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L54, C11
      }
      gxp$out.append("> Results:<br");                                          // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L54, C11
      if (gxp_context.isUsingXmlSyntax()) {                                     // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L55, C19
        gxp$out.append(" /");                                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L55, C19
      }
      gxp$out.append("> <table border=\"1\">");                                 // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L55, C19
      {
        boolean gxp$bool$0 = false;
        for (final Object result : results) {                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L57, C13
          if (gxp$bool$0) {
            gxp$out.append(" ");                                                // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L57, C13
          } else {
            gxp$bool$0 = true;
          }
          gxp$out.append("<tr><td><pre>");                                      // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L58, C15
          com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (result.toString()));   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L59, C26
          gxp$out.append("</pre></td></tr>");                                   // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L59, C21
        }
      }
      gxp$out.append("</table>");                                               // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L56, C11
    }
    gxp$out.append("</body></html>");                                           // D:\Users\WangFengwei\git_workspace\living-stories\src\com\google\livingstories\gxps\GqlServletHtml.gxp: L42, C7
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("query", "results"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String query, final List<Object> results) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        com.google.livingstories.gxps.GqlServletHtml.write(gxp$out, gxp_context, query, results);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String query, final List<Object> results)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String query, final List<Object> results);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String query, final List<Object> results)
        throws java.io.IOException {
      com.google.livingstories.gxps.GqlServletHtml.write(gxp$out, gxp_context, query, results);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String query, final List<Object> results) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, query, results);
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
