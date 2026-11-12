package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wh extends zz1 {
    public final /* synthetic */ int n;

    public /* synthetic */ wh(int r1) {
        this.n = r1;
    }

    public static m21 O(be3 r8) {
        String r1 = r8.v();
        r1.getClass();
        String r2 = r8.v();
        r2.getClass();
        return new m21(r1, r2, r8.u(), r8.u(), Arrays.copyOfRange(r8.a, r8.b, r8.c));
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 r17, ByteBuffer r18) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new qv2(new pv2[]{O(new be3(r18.limit(), r18.array()))});
    L7:
        if (r18.get() != 116) goto L48;
        h00 r0 = new h00(r18.limit(), r18.array());
        r0.t(12);
        int r5 = (r0.f() + r0.i(12)) - 4;
        r0.t(44);
        r0.u(r0.i(12));
        r0.t(16);
        ArrayList r7 = new ArrayList();
    L10:
        if (r0.f() >= r5) goto L34;
        r0.t(48);
        int r9 = r0.i(8);
        r0.t(4);
        int r11 = r0.f() + r0.i(12);
        String r10 = null;
        String r12 = null;
    L13:
        if (r0.f() >= r11) goto L28;
        int r13 = r0.i(8);
        int r14 = r0.i(8);
        int r15 = r0.f() + r14;
        if (r13 != 2) goto L25;
        int r1 = r0.i(16);
        r0.t(8);
        if (r1 != 3) goto L27;
    L19:
        if (r0.f() >= r15) goto L27;
        int r2 = r0.i(8);
        Charset r16 = StandardCharsets.US_ASCII;
        byte[] r19 = new byte[r2];
        r0.l(r2, r19);
        String r3 = new String(r19, r16);
        int r110 = r0.i(8);
        int r111 = 0;
    L21:
        if (r111 >= r110) goto L23;
        r0.u(r0.i(8));
        r111 = r111 + 1;
        goto L21
    L23:
        r10 = r3;
    L27:
        r0.q(r15 * 8);
        goto L13
    L25:
        if (r13 != 21) goto L27;
        Charset r4 = StandardCharsets.US_ASCII;
        byte[] r112 = new byte[r14];
        r0.l(r14, r112);
        r12 = new String(r112, r4);
        goto L27
    L28:
        r0.q(r11 * 8);
        if (r10 == null) goto L10;
        if (r12 == null) goto L10;
        r7.add(new vh(r9, r10.concat(r12)));
        goto L10
    L34:
        if (r7.isEmpty() == false) goto L37;
        return null;
    L37:
        return new qv2(r7);
    L48:
        return null;
    }
}
