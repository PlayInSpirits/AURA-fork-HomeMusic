/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public final class b35
implements Predicate {
    public final ConcurrentHashMap a;
    public final Function b;

    public b35(ConcurrentHashMap concurrentHashMap, Function function) {
        this.a = concurrentHashMap;
        this.b = function;
    }

    public final boolean test(Object object) {
        Boolean bl5;
        return this.a.putIfAbsent(object = this.b.apply(object), bl5 = Boolean.TRUE) == null;
    }
}

