/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import defpackage.h12;
import defpackage.h33;
import defpackage.nz2;
import java.io.Serializable;

public class g33
extends h33 {
    public final Class r;

    public g33(int n16, Class clazz) {
        super(false);
        if (Serializable.class.isAssignableFrom(clazz)) {
            this.r = clazz;
            return;
        }
        nz2.h(clazz, " does not implement Serializable.");
        throw null;
    }

    public g33(Class clazz) {
        super(true);
        if (Serializable.class.isAssignableFrom(clazz)) {
            if (!clazz.isEnum()) {
                this.r = clazz;
                return;
            }
            nz2.h(clazz, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        nz2.h(clazz, " does not implement Serializable.");
        throw null;
    }

    @Override
    public final Object a(String string, Bundle bundle) {
        bundle.getClass();
        string.getClass();
        return (Serializable)bundle.get(string);
    }

    @Override
    public String b() {
        return this.r.getName();
    }

    @Override
    public Object d(String string) {
        return this.g(string);
    }

    @Override
    public final void e(Bundle bundle, String string, Object object) {
        object = (Serializable)object;
        string.getClass();
        object.getClass();
        this.r.cast(object);
        bundle.putSerializable(string, (Serializable)object);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g33)) {
            return false;
        }
        object = ((g33)object).r;
        return h12.c(this.r, object);
    }

    public Serializable g(String string) {
        string.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}

