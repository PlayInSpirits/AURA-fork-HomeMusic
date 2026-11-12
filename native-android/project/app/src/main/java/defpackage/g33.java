package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class g33 extends h33 {
    public final Class r;

    public g33(Class r3) {
        super(true);
        if (Serializable.class.isAssignableFrom(r3) == true) goto L5;
        nz2.h(r3, " does not implement Serializable.");
        throw null;
    L5:
        if (r3.isEnum() == true) goto L8;
        this.r = r3;
        return;
    L8:
        nz2.h(r3, " is an Enum. You should use EnumType instead.");
        throw null;
    }

    @Override // defpackage.h33
    public final Object a(String r1, Bundle r2) {
        r2.getClass();
        r1.getClass();
        return (Serializable) r2.get(r1);
    }

    @Override // defpackage.h33
    public String b() {
        return this.r.getName();
    }

    @Override // defpackage.h33
    public /* bridge */ /* synthetic */ Object d(String r1) {
        return g(r1);
    }

    @Override // defpackage.h33
    public final void e(Bundle r1, String r2, Object r3) {
        Serializable r4 = (Serializable) r3;
        r2.getClass();
        r4.getClass();
        this.r.cast(r4);
        r1.putSerializable(r2, r4);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof g33) == true) goto L9;
        return false;
    L9:
        Class r3 = ((g33) r2).r;
        return h12.c(this.r, r3);
    }

    public Serializable g(String r1) {
        r1.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public g33(int r1, Class r2) {
        super(false);
        if (Serializable.class.isAssignableFrom(r2) == false) goto L6;
        this.r = r2;
        return;
    L6:
        nz2.h(r2, " does not implement Serializable.");
        throw null;
    }
}
