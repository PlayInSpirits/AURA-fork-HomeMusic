package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class tg {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
