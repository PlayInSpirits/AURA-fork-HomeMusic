package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends dn1 {
    public static final cn1 l = null;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final tb1 h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List r2 = Collections.EMPTY_LIST;
        l = new cn1("", r2, r2, r2, r2, r2, r2, null, r2, false, Collections.EMPTY_MAP, r2);
    }

    public cn1(String r2, List r3, List r4, List r5, List r6, List r7, List r8, tb1 r9, List r10, boolean r11, Map r12, List r13) {
        super(r2, r3, r11);
        ArrayList r14 = new ArrayList();
        int r15 = 0;
    L4:
        if (r15 >= r4.size()) goto L9;
        Uri r16 = ((bn1) r4.get(r15)).a;
        if (r14.contains(r16) == true) goto L8;
        r14.add(r16);
    L8:
        r15 = r15 + 1;
        goto L4
    L9:
        b(r5, r14);
        b(r6, r14);
        b(r7, r14);
        b(r8, r14);
        this.d = Collections.unmodifiableList(r14);
        this.e = Collections.unmodifiableList(r4);
        Collections.unmodifiableList(r5);
        this.f = Collections.unmodifiableList(r6);
        this.g = Collections.unmodifiableList(r7);
        Collections.unmodifiableList(r8);
        this.h = r9;
        if (r10 == null) goto L12;
        List r17 = Collections.unmodifiableList(r10);
    L13:
        this.i = r17;
        this.j = Collections.unmodifiableMap(r12);
        this.k = Collections.unmodifiableList(r13);
        return;
    L12:
        r17 = null;
        goto L13
    }

    public static void b(List r3, ArrayList r4) {
        int r0 = 0;
    L4:
        if (r0 >= r3.size()) goto L9;
        Uri r1 = ((an1) r3.get(r0)).a;
        if (r4.contains(r1) == true) goto L8;
        r4.add(r1);
    L8:
        r0 = r0 + 1;
        goto L4
    }

    public static ArrayList c(List r7, int r8, List r9) {
        ArrayList r0 = new ArrayList(r9.size());
        int r2 = 0;
    L4:
        if (r2 >= r7.size()) goto L15;
        Object r3 = r7.get(r2);
        int r4 = 0;
    L7:
        if (r4 >= r9.size()) goto L14;
        fm4 r5 = (fm4) r9.get(r4);
        if (r5.o != r8) goto L13;
        if (r5.p != r2) goto L13;
        r0.add(r3);
    L13:
        r4 = r4 + 1;
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        return r0;
    }

    @Override // defpackage.dn1
    public final Object a(List r14) {
        ArrayList r3 = c(this.e, 0, r14);
        List r4 = Collections.EMPTY_LIST;
        ArrayList r5 = c(this.f, 1, r14);
        ArrayList r6 = c(this.g, 2, r14);
        Map r11 = this.j;
        List r12 = this.k;
        return new cn1(this.a, this.b, r3, r4, r5, r6, r4, this.h, this.i, this.c, r11, r12);
    }
}
