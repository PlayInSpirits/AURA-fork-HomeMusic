package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f33 extends h33 {
    public final Class r;

    public f33(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            nz2.h(cls, " does not implement Serializable.");
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
        return (Serializable[]) bundle.get(str);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.h33
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        str.getClass();
        this.r.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f33.class.equals(obj.getClass())) {
            return false;
        }
        return h12.c(this.r, ((f33) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
