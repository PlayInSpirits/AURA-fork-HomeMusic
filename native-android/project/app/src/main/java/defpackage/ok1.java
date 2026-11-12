package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 {
    public final u21 a;
    public final int b;
    public final int c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;
    public final int g;
    public final int h;
    public final boolean i;
    public boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final LinkedList n;

    public ok1() {
        this.a = u21.p;
        this.b = 1;
        this.c = 1;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = 2;
        this.h = 2;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = 1;
        this.m = 2;
        this.n = new LinkedList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Class r4, g32 r5) {
        TypeToken<?> r0 = TypeToken.get(r4);
        if (r0.getType() != r0.getRawType()) goto L5;
        boolean r1 = true;
    L6:
        ux4 r2 = new ux4(r5, r0, r1);
        ArrayList r3 = this.e;
        r3.add(r2);
        if ((r5 instanceof bz4) == false) goto L10;
        dz4 r6 = hz4.a;
        r3.add(new dz4(TypeToken.get(r4), (bz4) r5, 2));
        return;
    L10:
        return;
    L5:
        r1 = false;
        goto L6
    }
}
