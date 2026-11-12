package defpackage;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 implements zn4 {
    public final be3 n;

    public ov1(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new be3(10);
        return;
    L5:
        this.n = new be3();
    }

    public qv2 a(l51 r13, kv1 r14, int r15) {
        int r2 = 0;
        qv2 r3 = null;
    L3:
        int r4 = 0;
    L4:
        int r5 = r4 % 10;
        int r6 = r5 + 10;
        be3 r7 = this.n;
        if (r5 != 0) goto L8;
        if (r4 == 0) goto L8;
        byte[] r9 = r7.a;
        System.arraycopy(r9, 10, r9, 0, 9);
    L8:
        if (r4 != 0) goto L10;
        int r10 = 10;
    L34:
        r13.n(r7.a, r6 - r10, r10);     // Catch: EOFException -> L33
        r7.N(r5);
        r7.M(r6);
        if (r7.a() < 3) goto L29;
        int r8 = r7.D();
        int r11 = r7.b - 3;
        r7.b = r11;
        if (r8 == 4801587) goto L16;
        if (jz4.v(r7.i()) != (-1)) goto L31;
        if (r4 != 0) goto L26;
        r7.c(20);
    L26:
        r4 = r4 + 1;
        if (r4 <= r15) goto L4;
    L16:
        r7.O(6);
        int r12 = r7.z();
        int r16 = r12 + 10;
        if (r3 != null) goto L19;
        byte[] r17 = new byte[r16];
        System.arraycopy(r7.a, r11, r17, 0, 10);
        r13.n(r17, 10, r12);
        r3 = new mv1(r14).O(r16, r17);
    L20:
        r2 = r2 + r16;
        goto L3
    L19:
        r13.g(r12);
        goto L20
    L29:
        er1.h(r7.b, r7.c);
        return null;
    L31:
        r13.k();
        r13.g(r2);
        return r3;
    L10:
        r10 = 1;
        goto L34
    }

    @Override // defpackage.zn4
    public void c(byte[] r11, int r12, int r13, yn4 r14, wc0 r15) {
        be3 r10 = this.n;
        r10.L(r13 + r12, r11);
        r10.N(r12);
        ArrayList r5 = new ArrayList();
    L4:
        if (r10.a() <= 0) goto L29;
        if (r10.a() < 8) goto L8;
        boolean r16 = true;
    L9:
        rr2.k("Incomplete Mp4Webvtt Top Level box header found.", r16);
        int r17 = r10.m();
        if (r10.m() == 1987343459) goto L11;
        r10.O(r17 - 8);
        goto L4
    L11:
        int r18 = r17 - 8;
        CharSequence r1 = null;
        hg0 r2 = null;
    L12:
        if (r18 <= 0) goto L22;
        if (r18 < 8) goto L15;
        boolean r3 = true;
    L16:
        rr2.k("Incomplete vtt cue box header found.", r3);
        int r4 = r10.m();
        int r6 = r10.m();
        int r7 = r4 - 8;
        byte[] r8 = r10.a;
        int r9 = r10.b;
        String r19 = f35.a;
        String r20 = new String(r8, r9, r7, StandardCharsets.UTF_8);
        r10.O(r7);
        r18 = (r18 - 8) - r7;
        if (r6 == 1937011815) goto L18;
        if (r6 != 1885436268) goto L12;
        r1 = w95.f(null, r20.trim(), Collections.EMPTY_LIST);
        goto L12
    L18:
        v95 r21 = new v95();
        w95.e(r20, r21);
        r2 = r21.a();
        goto L12
    L15:
        r3 = false;
        goto L16
    L22:
        if (r1 != null) goto L24;
        r1 = "";
    L24:
        if (r2 == null) goto L26;
        r2.a = r1;
        r2.b = null;
        ig0 r110 = r2.a();
    L27:
        r5.add(r110);
        goto L4
    L26:
        Pattern r111 = w95.a;
        v95 r112 = new v95();
        r112.c = r1;
        r110 = r112.a().a();
        goto L27
    L8:
        r16 = false;
        goto L9
    L29:
        r15.accept(new lg0(-9223372036854775807L, -9223372036854775807L, r5));
    }
}
