/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.jx1;
import defpackage.l22;
import defpackage.o15;
import defpackage.yw1;

public final class nf4
extends jx1 {
    public final transient Object q;

    public nf4(Object object) {
        object.getClass();
        this.q = object;
    }

    @Override
    public final yw1 a() {
        return yw1.o(this.q);
    }

    @Override
    public final int b(int n16, Object[] objectArray) {
        objectArray[n16] = this.q;
        return n16 + 1;
    }

    @Override
    public final boolean contains(Object object) {
        return this.q.equals(object);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final o15 h() {
        return new l22(this.q);
    }

    @Override
    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.q.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

