package defpackage;

import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ux4 implements cz4 {
    public final TypeToken n;
    public final boolean o;
    public final g32 p;

    public ux4(g32 g32Var, TypeToken typeToken, boolean z) {
        this.p = g32Var;
        this.n = typeToken;
        this.o = z;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        TypeToken typeToken2 = this.n;
        if (typeToken2 == null) {
            typeToken.getRawType();
            throw null;
        }
        if (typeToken2.equals(typeToken) || (this.o && typeToken2.getType() == typeToken.getRawType())) {
            return new vx4(this.p, nk1Var, typeToken, this, true);
        }
        return null;
    }
}
