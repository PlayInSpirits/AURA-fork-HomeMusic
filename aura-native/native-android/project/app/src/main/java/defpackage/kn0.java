package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ pn0 a;

    public kn0(pn0 pn0Var) {
        this.a = pn0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        gb3 gb3Var = pn0.k;
        this.a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        gb3 gb3Var = pn0.k;
        this.a.e();
    }
}
