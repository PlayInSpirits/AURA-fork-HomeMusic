package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi3 {
    public static final mi3 b = null;
    public static final String c = null;
    public final w71 a;

    static {
        SparseBooleanArray r0 = new SparseBooleanArray();
        rr2.w(!false);
        b = new mi3(new w71(r0));
        String r1 = f35.a;
        c = Integer.toString(0, 36);
    }

    public mi3(w71 r1) {
        this.a = r1;
    }

    public static mi3 b(Bundle r6) {
        ArrayList<Integer> r7 = r6.getIntegerArrayList(c);
        if (r7 == null) goto L5;
        SparseBooleanArray r0 = new SparseBooleanArray();
        int r2 = 0;
    L8:
        if (r2 >= r7.size()) goto L10;
        int r3 = r7.get(r2).intValue();
        rr2.w(!false);
        r0.append(r3, true);
        r2 = r2 + 1;
        goto L8
    L10:
        rr2.w(!false);
        return new mi3(new w71(r0));
    L5:
        return b;
    }

    public final boolean a(int r1) {
        return this.a.a.get(r1);
    }

    public final Bundle c() {
        Bundle r0 = new Bundle();
        ArrayList<Integer> r1 = new ArrayList();
        int r2 = 0;
    L3:
        w71 r3 = this.a;
        if (r2 >= r3.a.size()) goto L6;
        r1.add(Integer.valueOf(r3.b(r2)));
        r2 = r2 + 1;
        goto L3
    L6:
        r0.putIntegerArrayList(c, r1);
        return r0;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof mi3) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((mi3) r2).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
