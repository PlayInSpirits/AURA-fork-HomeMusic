package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements r02 {
    public final fz0 a;
    public volatile cr1 b;

    public dr1() {
        this.a = fz0.e0;
        this.b = cr1.n;
    }

    @Override // defpackage.r02
    public final k14 a(ev3 r26) {
        cr1 r2 = this.b;
        oz3 r3 = r26.e;
        if (r2 == cr1.n) goto L5;
        boolean r6 = true;
        if (r2 != cr1.p) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == false) goto L12;
    L15:
        tz3 r5 = r3.d;
        y10 r7 = r26.d;
        if (r7 == null) goto L18;
        cv3 r8 = r7.e();
    L19:
        StringBuilder r9 = new StringBuilder("--> ");
        r9.append(r3.b);
        r9.append(' ');
        gr1 r10 = r3.a;
        r10.getClass();
        r9.append(r10.i);
        String r11 = " ";
        if (r8 == null) goto L22;
        StringBuilder r12 = new StringBuilder(" ");
        pr3 r13 = r8.h;
        r13.getClass();
        r12.append(r13);
        String r14 = r12.toString();
    L23:
        r9.append(r14);
        String r15 = r9.toString();
        if (r6 == true) goto L27;
        if (r5 == null) goto L27;
        StringBuilder r16 = b11.s(r15, " (");
        r16.append(r5.contentLength());
        r16.append("-byte body)");
        r15 = r16.toString();
    L27:
        this.a.k(r15);
        if (r6 == false) goto L89;
        tl1 r17 = r3.c;
        if (r5 == null) goto L43;
        hu2 r18 = r5.contentType();
        boolean r19 = r4;
        if (r18 == null) goto L38;
        if (r17.a("Content-Type") != null) goto L38;
        this.a.k("Content-Type: " + r18);
    L38:
        if (r5.contentLength() == (-1)) goto L44;
        if (r17.a("Content-Length") != null) goto L44;
        this.a.k("Content-Length: " + r5.contentLength());
    L44:
        int r20 = r17.size();
        int r21 = 0;
    L45:
        if (r21 >= r20) goto L48;
        b(r17, r21);
        r21 = r21 + 1;
        goto L45
    L48:
        if (r19 == false) goto L88;
        if (r5 == null) goto L88;
        String r22 = r3.c.a("Content-Encoding");
        if (r22 == null) goto L60;
        if (r22.equalsIgnoreCase("identity") == true) goto L60;
        if (r22.equalsIgnoreCase("gzip") == true) goto L60;
        this.a.k(b11.q(new StringBuilder("--> END "), r3.b, " (encoded body omitted)"));
    L90:
        long r23 = System.nanoTime();
        k14 r0 = r26.b(r3);     // Catch: Exception -> L160
        long r24 = (System.nanoTime() - r23) / 1000000;
        n14 r25 = r0.t;
        r25.getClass();
        long r27 = r25.contentLength();
        if (r27 == (-1)) goto L95;
        String r28 = r27 + "-byte";
    L96:
        fz0 r110 = this.a;
        StringBuilder r29 = new StringBuilder();
        r29.append("<-- " + r0.q);
        if (r0.p.length() <= 0) goto L99;
        String r30 = r11;
        r29.append(r30 + r0.p);
    L100:
        StringBuilder r31 = new StringBuilder(r30);
        gr1 r32 = r0.n.a;
        r32.getClass();
        r31.append(r32.i);
        r31.append(" (");
        r31.append(r24);
        r31.append("ms");
        r29.append(r31.toString());
        if (r6 == true) goto L103;
        r29.append(", " + r28 + " body");
    L103:
        r29.append(")");
        r110.k(r29.toString());
        if (r6 == false) goto L159;
        tl1 r33 = r0.s;
        int r34 = r33.size();
        int r35 = 0;
    L106:
        if (r35 >= r34) goto L108;
        b(r33, r35);
        r35 = r35 + 1;
        goto L106
    L108:
        if (r19 == true) goto L110;
    L158:
        this.a.k("<-- END HTTP");
        goto L159
    L110:
        if (br1.a(r0) == false) goto L158;
        String r36 = r0.s.a("Content-Encoding");
        if (r36 != null) goto L116;
    L121:
        hu2 r37 = r0.t.contentType();
        if (r37 != null) goto L124;
    L129:
        fw r38 = r25.source();
        r38.G(Long.MAX_VALUE);
        long r39 = (System.nanoTime() - r23) / 1000000;
        tv r40 = r38.a();
        if ("gzip".equalsIgnoreCase(r33.a("Content-Encoding")) == false) goto L140;
        Long r41 = Long.valueOf(r40.o);
        tk1 r42 = new tk1(r40.f());
        r40 = new tv();     // Catch: Throwable -> L134
        r40.p(r42);     // Catch: Throwable -> L134
        r42.close();
    L141:
        hu2 r43 = r25.contentType();
        if (r43 == null) goto L145;
        Charset r44 = hu2.a(r43);
        if (r44 == null) goto L145;
    L147:
        if (uc5.z(r40) == true) goto L151;
        this.a.k("");
        fz0 r1 = this.a;
        StringBuilder r45 = new StringBuilder("<-- END HTTP (");
        r45.append(r39);
        r45.append("ms, binary ");
        r1.k(b11.p(r45, r40.o, "-byte body omitted)"));
        return r0;
    L151:
        if (r27 == 0) goto L153;
        this.a.k("");
        this.a.k(r40.f().B(r44));
    L153:
        fz0 r46 = this.a;
        StringBuilder r47 = new StringBuilder();
        r47.append("<-- END HTTP (" + r39 + "ms, " + r40.o + "-byte");
        if (r41 == null) goto L156;
        r47.append(", " + r41 + "-gzipped-byte");
    L156:
        r47.append(" body)");
        r46.k(r47.toString());
        return r0;
    L145:
        r44 = w10.a;
    L134:
        th = move-exception;
        throw th;     // Catch: Throwable -> L137
    L137:
        th = move-exception;
        q05.h(r42, th);
        throw th;
    L140:
        r41 = null;
        goto L141
    L124:
        if (r37.b.equals("text") == false) goto L129;
        if (r37.c.equals("event-stream") == false) goto L129;
        this.a.k("<-- END HTTP (streaming)");
        return r0;
    L116:
        if (r36.equalsIgnoreCase("identity") == true) goto L121;
        if (r36.equalsIgnoreCase("gzip") == true) goto L121;
        this.a.k("<-- END HTTP (encoded body omitted)");
        return r0;
    L159:
        return r0;
    L99:
        r30 = r11;
        goto L100
    L95:
        r28 = "unknown-length";
    L160:
        e = move-exception;
        this.a.k("<-- HTTP FAILED: " + e);
        throw e;
    L60:
        if (r5.isDuplex() == false) goto L63;
        this.a.k(b11.q(new StringBuilder("--> END "), r3.b, " (duplex request body omitted)"));
        goto L90
    L63:
        if (r5.isOneShot() == false) goto L65;
        this.a.k(b11.q(new StringBuilder("--> END "), r3.b, " (one-shot body omitted)"));
        goto L90
    L65:
        tv r48 = new tv();
        r5.writeTo(r48);
        if ("gzip".equalsIgnoreCase(r17.a("Content-Encoding")) == false) goto L76;
        Long r49 = Long.valueOf(r48.o);
        tk1 r50 = new tk1(r48);
        r48 = new tv();     // Catch: Throwable -> L70
        r48.p(r50);     // Catch: Throwable -> L70
        r50.close();
    L77:
        hu2 r51 = r5.contentType();
        if (r51 == null) goto L81;
        Charset r52 = hu2.a(r51);
        if (r52 == null) goto L81;
    L82:
        this.a.k("");
        boolean r53 = uc5.z(r48);
        fz0 r54 = this.a;
        if (r53 == true) goto L85;
        r54.k("--> END " + r3.b + " (binary " + r5.contentLength() + "-byte body omitted)");
        goto L90
    L85:
        if (r49 == null) goto L87;
        r54.k("--> END " + r3.b + " (" + r48.o + "-byte, " + r49 + "-gzipped-byte body)");
        goto L90
    L87:
        r54.k(r48.B(r52));
        this.a.k("--> END " + r3.b + " (" + r5.contentLength() + "-byte body)");
    L81:
        r52 = w10.a;
    L70:
        th = move-exception;
        throw th;     // Catch: Throwable -> L73
    L73:
        th = move-exception;
        q05.h(r50, th);
        throw th;
    L76:
        r49 = null;
    L88:
        this.a.k("--> END " + r3.b);
        goto L90
    L43:
        r19 = r4;
        r6 = r6;
        r11 = " ";
        goto L44
    L89:
        r19 = r4;
        r6 = r6;
        r11 = " ";
        goto L90
    L22:
        r14 = "";
        goto L23
    L18:
        r8 = null;
        goto L19
    L12:
        if (r2 == cr1.o) goto L15;
        r6 = false;
        goto L15
    L9:
        r4 = false;
        goto L10
    L5:
        return r26.b(r3);
    }

    public final void b(tl1 r3, int r4) {
        r3.b(r4);
        this.a.k(r3.b(r4) + ": " + r3.e(r4));
    }
}
