package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oc {
    public final PathMeasure a;

    public oc(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, nc ncVar) {
        if (ncVar == null) {
            er1.l("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, ncVar.a, true);
        }
    }
}
