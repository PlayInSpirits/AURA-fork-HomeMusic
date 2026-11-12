package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qh {
    public qh() {
    }

    public abstract void a(StaticLayout.Builder r1, TextView r2);

    public boolean b(TextView r2) {
        return ((Boolean) rh.e(r2, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
