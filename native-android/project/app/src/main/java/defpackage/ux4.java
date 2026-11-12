package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux4 implements cz4 {
    public final TypeToken n;
    public final boolean o;
    public final g32 p;

    public ux4(g32 r1, TypeToken r2, boolean r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r10, TypeToken r11) {
        TypeToken r1 = this.n;
        if (r1 != null) goto L5;
        r11.getRawType();
        throw null;
    L5:
        if (r1.equals(r11) == true) goto L13;
        if (this.o == true) goto L9;
    L11:
        return null;
    L9:
        if (r1.getType() != r11.getRawType()) goto L11;
    L13:
        return new vx4(this.p, r10, r11, this, true);
    }
}
