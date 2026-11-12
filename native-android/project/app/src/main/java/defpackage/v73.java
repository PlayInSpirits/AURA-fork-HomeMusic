package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v73 implements cz4 {
    public final /* synthetic */ int n;

    public v73(int r1) {
        this.n = r1;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r2, TypeToken r3) {
        if (r3.getRawType() == Object.class) goto L5;
        return null;
    L5:
        return new w73(r2, this.n);
    }
}
