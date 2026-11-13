/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.fe;
import defpackage.xa3;

public final class om4
implements fe {
    public final String a;

    public om4(String string) {
        this.a = string;
    }

    public final boolean equals(Object object) {
        return object instanceof om4 && this.a.equals(object = ((om4)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("StringAnnotation(value=", this.a, ")");
    }
}

