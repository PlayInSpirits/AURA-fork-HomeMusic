package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 extends h33 {
    public final Class r;

    public d33(Class r4) {
        super(true);
        if (Parcelable.class.isAssignableFrom(r4) == true) goto L12;
        nz2.h(r4, " does not implement Parcelable.");
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
        return (Parcelable[]) r2.get(r1);
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

    @Override // defpackage.h33
    public final void e(Bundle r1, String r2, Object r3) {
        Parcelable[] r4 = (Parcelable[]) r3;
        r2.getClass();
        this.r.cast(r4);
        r1.putParcelableArray(r2, r4);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (d33.class.equals(r3.getClass()) == true) goto L10;
        return false;
    L10:
        return h12.c(this.r, ((d33) r3).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
