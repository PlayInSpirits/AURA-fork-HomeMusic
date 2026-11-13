package defpackage;

import java.io.Closeable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fr0 implements Closeable {
    public final String n;
    public final long o;
    public final ArrayList p;
    public final /* synthetic */ jr0 q;

    public fr0(jr0 jr0Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.q = jr0Var;
        this.n = str;
        this.o = j;
        this.p = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xe5.b((ej4) obj);
        }
    }
}
