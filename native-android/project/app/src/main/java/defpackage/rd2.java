package defpackage;

import android.graphics.PathMeasure;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd2 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ rd2(int r1) {
        this.n = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.n) {
            case 0: goto L24;
            case 1: goto L23;
            case 2: goto L20;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L14;
            case 6: goto L13;
            case 7: goto L10;
            case 8: goto L8;
            case 9: goto L7;
            default: goto L5;
        };
    L8:
        l90 r1 = c94.a;
        return null;
    L10:
        wl4 r2 = z44.a;
        return null;
    L14:
        l90 r3 = fg3.a;
        return null;
    L20:
        td0 r4 = te5.a(q01.n);
        te5.g(r4, null);
        return r4;
    L24:
        wl4 r5 = sd2.a;
        return fz0.b0;
    L5:
        return j15.a;
    L7:
        return Boolean.TRUE;
    L13:
        return new w44(new LinkedHashMap());
    L17:
        return new oc(new PathMeasure());
    L19:
        return new qb3();
    L23:
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }
}
