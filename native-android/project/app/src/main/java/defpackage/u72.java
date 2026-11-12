package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u72 implements ul1 {
    public final Map b;
    public volatile Map c;

    public u72(Map r1) {
        this.b = Collections.unmodifiableMap(r1);
    }

    @Override // defpackage.ul1
    public final Map a() {
        if (this.c != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.c != null) goto L10;
        this.c = Collections.unmodifiableMap(b());     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.c;
    }

    public final HashMap b() {
        HashMap r0 = new HashMap();
        Iterator r8 = this.b.entrySet().iterator();
    L4:
        if (r8.hasNext() == false) goto L16;
        Map.Entry r1 = (Map.Entry) r8.next();
        List r2 = (List) r1.getValue();
        StringBuilder r3 = new StringBuilder();
        int r4 = r2.size();
        int r5 = 0;
    L6:
        if (r5 >= r4) goto L13;
        String r6 = ((t72) r2.get(r5)).a;
        if (TextUtils.isEmpty(r6) == true) goto L12;
        r3.append(r6);
        if (r5 == (r2.size() - 1)) goto L12;
        r3.append(',');
    L12:
        r5 = r5 + 1;
        goto L6
    L13:
        String r7 = r3.toString();
        if (TextUtils.isEmpty(r7) == true) goto L4;
        r0.put(r1.getKey(), r7);
        goto L4
    L16:
        return r0;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof u72) == true) goto L5;
        return false;
    L5:
        return this.b.equals(((u72) r2).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}
