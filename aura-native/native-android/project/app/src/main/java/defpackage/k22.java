package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k22 implements Iterator {
    public static final k22 n;
    public static final /* synthetic */ k22[] o;

    static {
        k22 k22Var = new k22("INSTANCE", 0);
        n = k22Var;
        o = new k22[]{k22Var};
    }

    public static k22 valueOf(String str) {
        return (k22) Enum.valueOf(k22.class, str);
    }

    public static k22[] values() {
        return (k22[]) o.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        rr2.v("no calls to next() since the last call to remove()", false);
    }
}
