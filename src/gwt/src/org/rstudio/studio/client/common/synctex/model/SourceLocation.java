/*
 * SourceLocation.java
 *
 * Copyright (C) 2009-11 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.common.synctex.model;

import com.google.gwt.core.client.JavaScriptObject;

public class SourceLocation extends JavaScriptObject
{
   protected SourceLocation()
   {
   }
   

   public final static native SourceLocation create(String file,
                                                    int line,
                                                    int column) /*-{
      var location = new Object();
      location.file = file;
      location.line = line;
      location.column = column;
      return location;
   }-*/;
   
   public native final String getFile() /*-{
      return this.file;
   }-*/;
   
   public native final int getLine() /*-{
      return this.line;
   }-*/;

   public native final int getColumn() /*-{
      return this.column;
   }-*/;

}
