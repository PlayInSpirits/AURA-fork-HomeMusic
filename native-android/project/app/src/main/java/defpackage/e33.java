package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e33 extends h33 {
    public final Class r;

    public e33(Class r2) {
        super(true);
        if (Parcelable.class.isAssignableFrom(r2) == false) goto L5;
    L9:
        this.r = r2;
        return;
    L5:
        if (Serializable.class.isAssignableFrom(r2) == true) goto L9;
        nz2.h(r2, " does not implement Parcelable or Serializable.");
        throw null;
    }

    @Override // defpackage.h33
    public final Object a(String r1, Bundle r2) {
        r2.getClass();
        r1.getClass();
        return r2.get(r1);
    }

    @Override // defpackage.h33
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.h33
    public final Object d(String r1) {
        r1.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.h33
    public final void e(Bundle r1, String r2, Object r3) {
        r2.getClass();
        this.r.cast(r3);
        if (r3 != null) goto L5;
    L11:
        r1.putParcelable(r2, (Parcelable) r3);
        return;
    L5:
        if ((r3 instanceof Parcelable) == true) goto L11;
        if ((r3 instanceof Serializable) == false) goto L13;
        r1.putSerializable(r2, (Serializable) r3);
        return;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (e33.class.equals(r3.getClass()) == true) goto L10;
        return false;
    L10:
        return h12.c(this.r, ((e33) r3).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
