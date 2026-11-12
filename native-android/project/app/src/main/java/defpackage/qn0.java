package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 {
    public final int a;
    public final List b;

    public qn0() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public ty4 a(int r7, gc r8) {
        String r0 = (String) r8.b;
        if (r7 == 2) goto L78;
        if (r7 == 3) goto L76;
        if (r7 == 4) goto L76;
        if (r7 == 21) goto L74;
        if (r7 == 27) goto L68;
        if (r7 == 36) goto L66;
        if (r7 == 45) goto L64;
        if (r7 == 89) goto L62;
        if (r7 == 172) goto L60;
        if (r7 == 257) goto L58;
        if (r7 == 138) goto L56;
        if (r7 == 139) goto L54;
        switch(r7) {
            case 15: goto L49;
            case 16: goto L47;
            case 17: goto L42;
            default: goto L28;
        };
    L28:
        switch(r7) {
            case 128: goto L78;
            case 129: goto L40;
            case 130: goto L37;
            default: goto L29;
        };
    L29:
        switch(r7) {
            case 134: goto L32;
            case 135: goto L40;
            case 136: goto L56;
            default: goto L79;
        };
    L79:
        return null;
    L32:
        if (c(16) == false) goto L35;
        return null;
    L35:
        return new h84(new z05("application/x-scte35"));
    L37:
        if (c(64) == true) goto L56;
        return null;
    L40:
        return new ag3(new s2(r8.b(), 0, r0, "video/mp2t"));
    L42:
        if (c(2) == false) goto L45;
        return null;
    L45:
        return new ag3(new j62(r8.b(), r0));
    L47:
        return new ag3(new yk1(new r20(b(r8))));
    L49:
        if (c(2) == false) goto L52;
        return null;
    L52:
        return new ag3(new i6(r0, r8.b(), "video/mp2t", false));
    L54:
        return new ag3(new jx0(r0, r8.b(), 5408));
    L56:
        return new ag3(new jx0(r0, r8.b(), 4096));
    L58:
        return new h84(new z05("application/vnd.dvb.ait"));
    L60:
        return new ag3(new s2(r8.b(), 1, r0, "video/mp2t"));
    L62:
        return new ag3(new wx0((List) r8.c));
    L64:
        return new ag3(new xy2());
    L66:
        return new ag3(new dl1(new jv3(b(r8))));
    L68:
        if (c(4) == false) goto L72;
        return null;
    L72:
        return new ag3(new bl1(new jv3(b(r8)), c(1), c(8)));
    L74:
        return new ag3(new wx0());
    L76:
        return new ag3(new vy2(r8.b(), r0, "video/mp2t"));
    L78:
        return new ag3(new vk1(new r20(b(r8)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(gc r11) {
        boolean r0 = c(32);
        List r10 = this.b;
        if (r0 == false) goto L5;
        return r10;
    L5:
        be3 r1 = new be3((byte[]) r11.d);
        ArrayList r12 = r10;
    L7:
        if (r1.a() <= 0) goto L33;
        int r13 = r1.A();
        int r2 = r1.b + r1.A();
        if (r13 != 134) goto L32;
        r12 = new ArrayList();
        int r14 = r1.A() & 31;
        int r3 = 0;
    L11:
        if (r3 >= r14) goto L32;
        String r4 = r1.y(3, StandardCharsets.UTF_8);
        int r5 = r1.A();
        if ((r5 & 128) == 0) goto L15;
        boolean r6 = true;
    L16:
        if (r6 == false) goto L18;
        int r7 = r5 & 63;
        String r8 = "application/cea-708";
    L19:
        byte r9 = (byte) r1.A();
        r1.O(1);
        if (r6 == true) goto L22;
        List r15 = null;
    L31:
        sb1 r16 = new sb1();
        r16.m = lw2.m(r8);
        r16.d = r4;
        r16.J = r7;
        r16.p = r15;
        r12.add(new tb1(r16));
        r3 = r3 + 1;
        goto L11
    L22:
        if ((r9 & 64) == 0) goto L24;
        boolean r17 = true;
    L25:
        byte[] r18 = i40.a;
        if (r17 == false) goto L28;
        byte[] r19 = {1};
    L29:
        r15 = Collections.singletonList(r19);
        goto L31
    L28:
        r19 = new byte[]{0};
        goto L29
    L24:
        r17 = false;
        goto L25
    L18:
        r8 = "application/cea-608";
        r7 = 1;
        goto L19
    L15:
        r6 = false;
    L32:
        r1.N(r2);
        r12 = r12;
        goto L7
    L33:
        return r12;
    }

    public boolean c(int r1) {
        if ((this.a & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public qn0(List r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    public qn0(ArrayList r2) {
        this.a = 0;
        this.b = r2;
    }
}
