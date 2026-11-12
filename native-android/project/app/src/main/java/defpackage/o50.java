package defpackage;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o50 {
    public final m50 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final boolean j;
    public final int k;
    public final int l;

    public o50(String[] r14, boolean r15) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = r15;
        int r16 = r14.length;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= r16) goto L14;
        String r4 = r14[r1];
        if (this.j == false) goto L8;
        byte[] r5 = r4.getBytes(Charset.forName("UTF-8"));
        byte r6 = (byte) r5.length;
        int r8 = r5.length;
        byte[] r9 = new byte[r8 + 3];
        System.arraycopy(r5, 0, r9, 2, r6);
        r9[1] = r6;
        r9[0] = r6;
        r9[r8 + 2] = 0;
    L13:
        Pair r7 = new Pair(r9, Collections.EMPTY_LIST);
        this.f.add(Integer.valueOf(r2));
        byte[] r3 = (byte[]) r7.first;
        r2 = r2 + r3.length;
        this.h.add(r3);
        this.i.add((List) r7.second);
        r1 = r1 + 1;
        goto L4
    L8:
        char[] r10 = r4.toCharArray();
        int r11 = r10.length * 2;
        r9 = new byte[r11 + 4];
        byte[] r12 = g12.S((short) r10.length);
        r9[0] = r12[0];
        r9[1] = r12[1];
        int r13 = 0;
    L10:
        if (r13 >= r10.length) goto L12;
        byte[] r17 = g12.j(r10[r13]);
        int r18 = r13 * 2;
        r9[r18 + 2] = r17[0];
        r9[r18 + 3] = r17[1];
        r13 = r13 + 1;
        goto L10
    L12:
        r9[r11 + 2] = 0;
        r9[r11 + 3] = 0;
        goto L13
    L14:
        ArrayList r19 = this.i;
        int r20 = r19.size();
        int r21 = 0;
        int r22 = 0;
    L15:
        if (r22 >= r20) goto L25;
        Object r23 = r19.get(r22);
        r22 = r22 + 1;
        List r24 = (List) r23;
        Iterator r25 = r24.iterator();
        if (r25.hasNext() == true) goto L20;
        this.g.add(Integer.valueOf(r21));
        r21 = r21 + ((r24.size() * 12) + 4);
        goto L15
    L20:
        if (r25.next() != null) goto L23;
        this.f.add(Integer.valueOf(r2));
        throw null;
    L23:
        kf2.k();
        throw null;
    L25:
        int r110 = r2 % 4;
        if (r110 != 0) goto L28;
        int r111 = 0;
    L29:
        this.k = r111;
        int r26 = this.h.size();
        this.b = r26;
        this.c = this.h.size() - r14.length;
        if ((this.h.size() - r14.length) <= 0) goto L32;
        boolean r112 = true;
    L33:
        if (r112 == true) goto L35;
        this.g.clear();
        this.i.clear();
    L35:
        int r27 = (this.g.size() * 4) + ((r26 * 4) + 28);
        this.d = r27;
        int r28 = r2 + r111;
        if (r112 == false) goto L38;
        int r113 = r27 + r28;
    L39:
        this.e = r113;
        int r29 = r27 + r28;
        if (r112 == false) goto L42;
        r0 = r21;
    L42:
        int r30 = r29 + r0;
        this.l = r30;
        this.a = new m50(r30, 1, 28);
        return;
    L38:
        r113 = 0;
        goto L39
    L32:
        r112 = false;
        goto L33
    L28:
        r111 = 4 - r110;
        goto L29
    }

    public final void a(ByteArrayOutputStream r6) {
        this.a.a(r6);
        r6.write(g12.b(this.b));
        r6.write(g12.b(this.c));
        int r1 = 0;
        if (this.j == false) goto L5;
        int r0 = 256;
    L6:
        r6.write(g12.b(r0));
        r6.write(g12.b(this.d));
        r6.write(g12.b(this.e));
        ArrayList r2 = this.f;
        int r3 = r2.size();
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L9;
        Object r5 = r2.get(r4);
        r4 = r4 + 1;
        r6.write(g12.b(((Integer) r5).intValue()));
        goto L7
    L9:
        ArrayList r7 = this.g;
        int r8 = r7.size();
        int r9 = 0;
    L10:
        if (r9 >= r8) goto L12;
        Object r10 = r7.get(r9);
        r9 = r9 + 1;
        r6.write(g12.b(((Integer) r10).intValue()));
        goto L10
    L12:
        ArrayList r11 = this.h;
        int r12 = r11.size();
        int r13 = 0;
    L13:
        if (r13 >= r12) goto L15;
        Object r14 = r11.get(r13);
        r13 = r13 + 1;
        r6.write((byte[]) r14);
        goto L13
    L15:
        int r15 = this.k;
        if (r15 <= 0) goto L18;
        r6.write(new byte[r15]);
    L18:
        ArrayList r16 = this.i;
        int r17 = r16.size();
    L19:
        if (r1 >= r17) goto L25;
        Object r18 = r16.get(r1);
        r1 = r1 + 1;
        Iterator r19 = ((List) r18).iterator();
        if (r19.hasNext() == true) goto L24;
        r6.write(g12.b(-1));
        goto L19
    L24:
        throw xa3.d(r19);
    L25:
        return;
    L5:
        r0 = 0;
        goto L6
    }
}
