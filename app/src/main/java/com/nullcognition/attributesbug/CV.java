package com.nullcognition.attributesbug;

import android.content.Context;
import android.util.AttributeSet;
import com.ebr163.attributesdispatcher.Attribute;
import com.ebr163.attributesdispatcher.CustomView;
import com.ebr163.attributesdispatcher.attr.DimenAttr;
import com.ebr163.attributesdispatcher.attr.FloatAttr;

/**
 * Created by mms on 2/8/17.
 */

@CustomView("com.nullcognition.attributesbug") public class CV
    extends android.support.v7.widget.AppCompatTextView {
  public CV(Context context, AttributeSet attrs) {
    super(context, attrs);
    CVAttribute.init(this, attrs);
  }

  @Attribute public void setFloat(@FloatAttr("floatAttr") float f) {
  }

  final static Float defaultFloat = 1F;

  @Attribute public void setFloatDefault(
      @FloatAttr(value = "floatDefaultAttr", defaultValue = defaultFloat) Float f) {
  }

  @Attribute public void setDimen(@DimenAttr("dimenAttr") float f) {
  }
}
