package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class th {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final yd4 h = new yd4(0);
    public final Object[] a = new Object[2];

    public ef a(Context context, AttributeSet attributeSet) {
        return new ef(context, attributeSet, app.homemusic.R.attr.autoCompleteTextViewStyle);
    }

    public ff b(Context context, AttributeSet attributeSet) {
        return new ff(context, attributeSet, app.homemusic.R.attr.buttonStyle);
    }

    public hf c(Context context, AttributeSet attributeSet) {
        return new hf(context, attributeSet, app.homemusic.R.attr.checkboxStyle);
    }

    public mg d(Context context, AttributeSet attributeSet) {
        return new mg(context, attributeSet);
    }

    public mh e(Context context, AttributeSet attributeSet) {
        return new mh(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        yd4 yd4Var = h;
        Constructor constructor = (Constructor) yd4Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            yd4Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
