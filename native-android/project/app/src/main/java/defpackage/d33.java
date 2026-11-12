package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 extends h33 {
    public final Class r;

    public d33(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            nz2.h(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            er1.m(e);
            throw null;
        }
    }

    @Override // defpackage.h33
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    @Override // defpackage.h33
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.h33
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // defpackage.h33
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d33.class.equals(obj.getClass())) {
            return false;
        }
        return h12.c(this.r, ((d33) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
