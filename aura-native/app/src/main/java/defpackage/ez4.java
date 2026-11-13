package defpackage;

import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ez4 implements cz4 {
    public final /* synthetic */ Class n;
    public final /* synthetic */ Class o;
    public final /* synthetic */ bz4 p;

    public ez4(Class cls, Class cls2, bz4 bz4Var) {
        this.n = cls;
        this.o = cls2;
        this.p = bz4Var;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.n || rawType == this.o) {
            return this.p;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.o.getName() + "+" + this.n.getName() + ",adapter=" + this.p + "]";
    }
}
