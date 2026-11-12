package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dz4 implements cz4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ bz4 p;

    public /* synthetic */ dz4(Object obj, bz4 bz4Var, int i) {
        this.n = i;
        this.o = obj;
        this.p = bz4Var;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        int i = this.n;
        bz4 bz4Var = this.p;
        Object obj = this.o;
        switch (i) {
            case 0:
                if (typeToken.getRawType() == ((Class) obj)) {
                    return bz4Var;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) obj).isAssignableFrom(rawType)) {
                    return new si(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) obj)) {
                    return bz4Var;
                }
                return null;
        }
    }

    public String toString() {
        int i = this.n;
        bz4 bz4Var = this.p;
        Object obj = this.o;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + bz4Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + bz4Var + "]";
            default:
                return super.toString();
        }
    }
}
