/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.m7;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Supplier;

public final class mj
implements Supplier {
    public mj() {
        super();
    }

    public final Object get() {
        return new TreeSet(Comparator.comparing(new m7(13)));
    }
}

