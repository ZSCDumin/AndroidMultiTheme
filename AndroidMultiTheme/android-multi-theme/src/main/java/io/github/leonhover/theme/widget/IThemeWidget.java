package io.github.leonhover.theme.widget;

import android.util.AttributeSet;
import android.view.View;

/**
 * Created by leonhover on 16-9-27.
 */

public interface IThemeWidget {

    /**
     * 组装主题的信息到View的TAG中。
     *
     * @param view         View
     * @param attributeSet View在Inflate时的Attribute.
     */
    void assemble(View view, AttributeSet attributeSet);

    /**
     * view应用主题Theme
     *
     * @param view View
     */
    void applyTheme(View view);

}