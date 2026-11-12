package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oc {
    public final PathMeasure a;

    public oc(PathMeasure r1) {
        this.a = r1;
    }

    public final void a(float r2, float r3, nc r4) {
        if (r4 == null) goto L5;
        Path r5 = r4.a;
        this.a.getSegment(r2, r3, r5, true);
        return;
    L5:
        er1.l("Unable to obtain android.graphics.Path");
    }
}
