package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 implements ao {
    public final yw1 a;
    public final int b;

    public rb2(int r1, gy3 r2) {
        this.b = r1;
        this.a = r2;
    }

    public static rb2 b(int r18, be3 r19) {
        int r2 = 4;
        uc5.f(4, "initialCapacity");
        Object[] r1 = new Object[4];
        int r3 = r19.c;
        int r5 = -2;
        int r6 = 0;
    L4:
        if (r19.a() <= 8) goto L72;
        int r7 = r19.o();
        int r10 = r19.b + r19.o();
        r19.M(r10);
        if (r7 != 1414744396) goto L8;
        ao r8 = b(r19.o(), r19);
    L61:
        if (r8 == null) goto L70;
        if (r8.getType() != 1752331379) goto L65;
        r5 = ((fo) r8).a();
    L65:
        int r9 = r6 + 1;
        int r4 = qw1.b(r1.length, r9);
        if (r4 <= r1.length) goto L69;
        r1 = Arrays.copyOf(r1, r4);
    L69:
        r1[r6] = r8;
        r6 = r9;
    L70:
        r19.N(r10);
        r19.M(r3);
        r2 = 4;
        goto L4
    L8:
        fo r11 = null;
        switch(r7) {
            case 1718776947: goto L15;
            case 1751742049: goto L13;
            case 1752331379: goto L12;
            case 1852994675: goto L11;
            default: goto L10;
        };
    L10:
        r8 = r11;
        goto L61
    L11:
        r8 = new hm4(r19.y(r19.a(), StandardCharsets.UTF_8));
        goto L61
    L12:
        int r12 = r19.o();
        r19.O(12);
        r19.o();
        int r13 = r19.o();
        int r14 = r19.o();
        r19.O(r2);
        int r15 = r19.o();
        int r16 = r19.o();
        r19.O(r2);
        r11 = new fo(r12, r13, r14, r15, r16, r19.o());
        goto L10
    L13:
        int r17 = r19.o();
        r19.O(8);
        int r20 = r19.o();
        int r110 = r19.o();
        r19.O(r2);
        r19.o();
        r19.O(12);
        r8 = new eo(r17, r20, r110);
        goto L61
    L15:
        if (r5 != 2) goto L28;
        r19.O(r2);
        int r21 = r19.o();
        int r22 = r19.o();
        r19.O(r2);
        int r111 = r19.o();
        switch(r111) {
            case 808802372: goto L23;
            case 826496577: goto L22;
            case 828601953: goto L22;
            case 842289229: goto L21;
            case 859066445: goto L20;
            case 875967048: goto L22;
            case 877677894: goto L23;
            case 1145656883: goto L23;
            case 1145656920: goto L23;
            case 1196444237: goto L19;
            case 1482049860: goto L23;
            case 1684633208: goto L23;
            case 1735420525: goto L19;
            case 2021026148: goto L23;
            default: goto L18;
        };
    L18:
        String r112 = null;
    L24:
        if (r112 != null) goto L26;
        xa3.m(r111, "Ignoring track with unsupported compression ", "StreamFormatChunk");
        goto L10
    L26:
        sb1 r23 = new sb1();
        r23.t = r21;
        r23.u = r22;
        r23.m = lw2.m(r112);
        r8 = new dm4(new tb1(r23));
        goto L61
    L19:
        r112 = "video/mjpeg";
        goto L24
    L20:
        r112 = "video/mp43";
        goto L24
    L21:
        r112 = "video/mp42";
        goto L24
    L22:
        r112 = "video/avc";
        goto L24
    L23:
        r112 = "video/mp4v-es";
        goto L24
    L28:
        if (r5 != 1) goto L60;
        int r24 = r19.t();
        if (r24 != 1) goto L32;
        String r25 = "audio/raw";
    L45:
        if (r25 != null) goto L47;
        xa3.m(r24, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
        goto L10
    L47:
        int r26 = r19.t();
        int r27 = r19.o();
        r19.O(6);
        int r113 = r19.t();
        String r114 = f35.a;
        int r115 = f35.C(r113, ByteOrder.LITTLE_ENDIAN);
        if (r19.a() <= 0) goto L50;
        int r116 = r19.t();
    L51:
        sb1 r117 = new sb1();
        r117.m = lw2.m(r25);
        r117.E = r26;
        r117.F = r27;
        if (r25.equals("audio/raw") == false) goto L56;
        if (r115 == 0) goto L56;
        r117.G = r115;
    L56:
        if (r25.equals("audio/mp4a-latm") == false) goto L59;
        if (r116 <= 0) goto L59;
        byte[] r28 = new byte[r116];
        r19.k(r28, 0, r116);
        r117.p = yw1.o(r28);
    L59:
        r8 = new dm4(new tb1(r117));
        goto L61
    L50:
        r116 = 0;
        goto L51
    L32:
        if (r24 != 85) goto L34;
        r25 = "audio/mpeg";
        goto L45
    L34:
        if (r24 != 255) goto L36;
        r25 = "audio/mp4a-latm";
        goto L45
    L36:
        if (r24 != 8192) goto L38;
        r25 = "audio/ac3";
        goto L45
    L38:
        if (r24 == 8193) goto L40;
        r25 = null;
        goto L45
    L40:
        r25 = "audio/vnd.dts";
        goto L45
    L60:
        l93.q0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(f35.H(r5)));
        goto L10
    L72:
        return new rb2(r18, yw1.i(r6, r1));
    }

    public final ao a(Class r3) {
        vw1 r2 = this.a.m(0);
    L4:
        if (r2.hasNext() == false) goto L8;
        ao r0 = (ao) r2.next();
        if (r0.getClass() != r3) goto L4;
        return r0;
    L8:
        return null;
    }

    @Override // defpackage.ao
    public final int getType() {
        return this.b;
    }
}
