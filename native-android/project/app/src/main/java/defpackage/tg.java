package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg {
    public static void a(ThemedSpinnerAdapter r1, Resources.Theme r2) {
        if (Objects.equals(r1.getDropDownViewTheme(), r2) == true) goto L6;
        r1.setDropDownViewTheme(r2);
        return;
    }
}
