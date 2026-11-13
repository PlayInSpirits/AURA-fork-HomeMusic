/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import defpackage.er1;
import defpackage.h12;
import defpackage.h33;
import defpackage.nz2;
import java.io.Serializable;

public final class f33
extends h33 {
    public final Class r;

    public f33(Class clazz) {
        super(true);
        if (Serializable.class.isAssignableFrom(clazz)) {
            try {
                StringBuilder stringBuilder = new StringBuilder("[L");
                stringBuilder.append(clazz.getName());
                stringBuilder.append(';');
                this.r = clazz = Class.forName(stringBuilder.toString());
                return;
            }
            catch (ClassNotFoundException classNotFoundException) {
                er1.m(classNotFoundException);
                throw null;
            }
        }
        nz2.h(clazz, " does not implement Serializable.");
        throw null;
    }

    @Override
    public final Object a(String string, Bundle bundle) {
        bundle.getClass();
        string.getClass();
        return (Serializable[])bundle.get(string);
    }

    @Override
    public final String b() {
        return this.r.getName();
    }

    @Override
    public final Object d(String string) {
        string.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override
    public final void e(Bundle bundle, String string, Object serializableArray) {
        serializableArray = serializableArray;
        string.getClass();
        this.r.cast(serializableArray);
        bundle.putSerializable(string, (Serializable)serializableArray);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && f33.class.equals(object.getClass())) {
            object = (f33)object;
            return h12.c(this.r, ((f33)object).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}

