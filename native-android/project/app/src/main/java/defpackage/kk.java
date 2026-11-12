package defpackage;

import android.content.res.AssetManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kk implements vw2 {
    public final /* synthetic */ int a;
    public final AssetManager b;

    public /* synthetic */ kk(AssetManager r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new lk(0, this.b, this);
    L7:
        return new lk(0, this.b, this);
    }
}
