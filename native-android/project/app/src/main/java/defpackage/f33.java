package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f33 extends h33 {
    public final Class r;

    public f33(Class r4) {
        super(true);
        if (Serializable.class.isAssignableFrom(r4) == true) goto L12;
        nz2.h(r4, " does not implement Serializable.");
        throw null;
    L12:
        this.r = Class.forName("[L" + r4.getName() + ';');
        return;
    L7:
        e = move-exception;
        er1.m(e);
        throw null;
    }

    @Override // defpackage.h33
    public final Object a(String r1, Bundle r2) {
        r2.getClass();
        r1.getClass();
        return (Serializable[]) r2.get(r1);
    }

    @Override // defpackage.h33
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.h33
    public final Object d(String r1) {
        r1.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.h33
    public final void e(Bundle r1, String r2, Object r3) {
        ?? r4 = (Serializable[]) r3;
        r2.getClass();
        this.r.cast(r4);
        r1.putSerializable(r2, r4);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (f33.class.equals(r3.getClass()) == true) goto L10;
        return false;
    L10:
        return h12.c(this.r, ((f33) r3).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
