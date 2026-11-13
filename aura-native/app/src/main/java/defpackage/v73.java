package defpackage;

import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v73 implements cz4 {
    public final /* synthetic */ int n;

    public v73(int i) {
        this.n = i;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        if (typeToken.getRawType() == Object.class) {
            return new w73(nk1Var, this.n);
        }
        return null;
    }
}
