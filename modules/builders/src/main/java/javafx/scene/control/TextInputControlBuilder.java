/* 
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.control;

/**
Builder class for javafx.scene.control.TextInputControl
@see javafx.scene.control.TextInputControl
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public abstract class TextInputControlBuilder<B extends javafx.scene.control.TextInputControlBuilder<B>> extends javafx.scene.control.ControlBuilder<B> {
    protected TextInputControlBuilder() {
    }
    
    
    private int __set;
    public void applyTo(javafx.scene.control.TextInputControl x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setEditable(this.editable);
        if ((set & (1 << 1)) != 0) x.setPromptText(this.promptText);
        if ((set & (1 << 2)) != 0) x.setText(this.text);
    }
    
    private boolean editable;
    /**
    Set the value of the {@link javafx.scene.control.TextInputControl#isEditable() editable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B editable(boolean x) {
        this.editable = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private java.lang.String promptText;
    /**
    Set the value of the {@link javafx.scene.control.TextInputControl#getPromptText() promptText} property for the instance constructed by this builder.
    * @since JavaFX 2.2
    */
    @SuppressWarnings("unchecked")
    public B promptText(java.lang.String x) {
        this.promptText = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    private java.lang.String text;
    /**
    Set the value of the {@link javafx.scene.control.TextInputControl#getText() text} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B text(java.lang.String x) {
        this.text = x;
        __set |= 1 << 2;
        return (B) this;
    }
    
}