package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ty0 {
    public static EdgeEffect a(Context r1, AttributeSet r2) {
        return new EdgeEffect(r1, r2);
    L5:
        return new EdgeEffect(r1);
    }

    public static float b(EdgeEffect r0) {
        return r0.getDistance();
    L4:
        return 0.0f;
    }

    public static float c(EdgeEffect r0, float r1, float r2) {
        return r0.onPullDistance(r1, r2);
    L4:
        r0.onPull(r1, r2);
        return 0.0f;
    }
}
