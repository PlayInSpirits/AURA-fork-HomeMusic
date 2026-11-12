package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements r02 {
    public final fz0 a = fz0.e0;
    public volatile cr1 b = cr1.n;

    /* JADX WARN: Code duplicated, block: B:46:0x00fc A[LOOP:0: B:45:0x00fa->B:46:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0228, please report this as an issue */
    @Override // defpackage.r02
    public final k14 a(ev3 ev3Var) throws Exception {
        String string;
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetA;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetA2;
        cr1 cr1Var = this.b;
        oz3 oz3Var = ev3Var.e;
        if (cr1Var == cr1.n) {
            return ev3Var.b(oz3Var);
        }
        boolean z2 = true;
        boolean z3 = cr1Var == cr1.p;
        if (!z3 && cr1Var != cr1.o) {
            z2 = false;
        }
        tz3 tz3Var = oz3Var.d;
        y10 y10Var = ev3Var.d;
        cv3 cv3VarE = y10Var != null ? y10Var.e() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(oz3Var.b);
        sb.append(' ');
        gr1 gr1Var = oz3Var.a;
        gr1Var.getClass();
        sb.append(gr1Var.i);
        String str2 = " ";
        if (cv3VarE != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            pr3 pr3Var = cv3VarE.h;
            pr3Var.getClass();
            sb2.append(pr3Var);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string2 = sb.toString();
        if (!z2 && tz3Var != null) {
            StringBuilder sbS = b11.s(string2, " (");
            sbS.append(tz3Var.contentLength());
            sbS.append("-byte body)");
            string2 = sbS.toString();
        }
        this.a.k(string2);
        if (z2) {
            tl1 tl1Var = oz3Var.c;
            if (tz3Var != null) {
                hu2 hu2VarContentType = tz3Var.contentType();
                z = z3;
                if (hu2VarContentType != null && tl1Var.a("Content-Type") == null) {
                    this.a.k("Content-Type: " + hu2VarContentType);
                }
                if (tz3Var.contentLength() != -1 && tl1Var.a("Content-Length") == null) {
                    this.a.k("Content-Length: " + tz3Var.contentLength());
                }
                size = tl1Var.size();
                for (i = 0; i < size; i++) {
                    b(tl1Var, i);
                }
                if (z || tz3Var == null) {
                    this.a.k("--> END " + oz3Var.b);
                } else {
                    String strA = oz3Var.c.a("Content-Encoding");
                    if (strA != null && !strA.equalsIgnoreCase("identity") && !strA.equalsIgnoreCase("gzip")) {
                        this.a.k(b11.q(new StringBuilder("--> END "), oz3Var.b, " (encoded body omitted)"));
                    } else if (tz3Var.isDuplex()) {
                        this.a.k(b11.q(new StringBuilder("--> END "), oz3Var.b, " (duplex request body omitted)"));
                    } else if (tz3Var.isOneShot()) {
                        this.a.k(b11.q(new StringBuilder("--> END "), oz3Var.b, " (one-shot body omitted)"));
                    } else {
                        tv tvVar = new tv();
                        tz3Var.writeTo(tvVar);
                        if ("gzip".equalsIgnoreCase(tl1Var.a("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(tvVar.o);
                            tk1 tk1Var = new tk1(tvVar);
                            try {
                                tvVar = new tv();
                                tvVar.p(tk1Var);
                                tk1Var.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    q05.h(tk1Var, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        hu2 hu2VarContentType2 = tz3Var.contentType();
                        if (hu2VarContentType2 == null || (charsetA2 = hu2.a(hu2VarContentType2)) == null) {
                            charsetA2 = w10.a;
                        }
                        this.a.k("");
                        boolean z4 = uc5.z(tvVar);
                        fz0 fz0Var = this.a;
                        if (!z4) {
                            fz0Var.k("--> END " + oz3Var.b + " (binary " + tz3Var.contentLength() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            fz0Var.k("--> END " + oz3Var.b + " (" + tvVar.o + "-byte, " + lValueOf2 + "-gzipped-byte body)");
                        } else {
                            fz0Var.k(tvVar.B(charsetA2));
                            this.a.k("--> END " + oz3Var.b + " (" + tz3Var.contentLength() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = " ";
            }
            size = tl1Var.size();
            while (i < size) {
                b(tl1Var, i);
            }
            if (z) {
                this.a.k("--> END " + oz3Var.b);
            } else {
                this.a.k("--> END " + oz3Var.b);
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            k14 k14VarB = ev3Var.b(oz3Var);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            n14 n14Var = k14VarB.t;
            n14Var.getClass();
            long jContentLength = n14Var.contentLength();
            String str3 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            fz0 fz0Var2 = this.a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<-- " + k14VarB.q);
            if (k14VarB.p.length() > 0) {
                str = str2;
                sb3.append(str + k14VarB.p);
            } else {
                str = str2;
            }
            StringBuilder sb4 = new StringBuilder(str);
            gr1 gr1Var2 = k14VarB.n.a;
            gr1Var2.getClass();
            sb4.append(gr1Var2.i);
            sb4.append(" (");
            sb4.append(jNanoTime2);
            sb4.append("ms");
            sb3.append(sb4.toString());
            if (!z2) {
                sb3.append(", " + str3 + " body");
            }
            sb3.append(")");
            fz0Var2.k(sb3.toString());
            if (z2) {
                tl1 tl1Var2 = k14VarB.s;
                int size2 = tl1Var2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(tl1Var2, i2);
                }
                if (z && br1.a(k14VarB)) {
                    String strA2 = k14VarB.s.a("Content-Encoding");
                    if (strA2 != null && !strA2.equalsIgnoreCase("identity") && !strA2.equalsIgnoreCase("gzip")) {
                        this.a.k("<-- END HTTP (encoded body omitted)");
                        return k14VarB;
                    }
                    hu2 hu2VarContentType3 = k14VarB.t.contentType();
                    if (hu2VarContentType3 != null && hu2VarContentType3.b.equals("text") && hu2VarContentType3.c.equals("event-stream")) {
                        this.a.k("<-- END HTTP (streaming)");
                        return k14VarB;
                    }
                    fw fwVarSource = n14Var.source();
                    fwVarSource.G(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    tv tvVarA = fwVarSource.a();
                    if ("gzip".equalsIgnoreCase(tl1Var2.a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(tvVarA.o);
                        tk1 tk1Var2 = new tk1(tvVarA.clone());
                        try {
                            tvVarA = new tv();
                            tvVarA.p(tk1Var2);
                            tk1Var2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                q05.h(tk1Var2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    hu2 hu2VarContentType4 = n14Var.contentType();
                    if (hu2VarContentType4 == null || (charsetA = hu2.a(hu2VarContentType4)) == null) {
                        charsetA = w10.a;
                    }
                    if (!uc5.z(tvVarA)) {
                        this.a.k("");
                        fz0 fz0Var3 = this.a;
                        StringBuilder sb5 = new StringBuilder("<-- END HTTP (");
                        sb5.append(jNanoTime3);
                        sb5.append("ms, binary ");
                        fz0Var3.k(b11.p(sb5, tvVarA.o, "-byte body omitted)"));
                        return k14VarB;
                    }
                    if (jContentLength != 0) {
                        this.a.k("");
                        this.a.k(tvVarA.clone().B(charsetA));
                    }
                    fz0 fz0Var4 = this.a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("<-- END HTTP (" + jNanoTime3 + "ms, " + tvVarA.o + "-byte");
                    if (lValueOf != null) {
                        sb6.append(", " + lValueOf + "-gzipped-byte");
                    }
                    sb6.append(" body)");
                    fz0Var4.k(sb6.toString());
                    return k14VarB;
                }
                this.a.k("<-- END HTTP");
            }
            return k14VarB;
        } catch (Exception e) {
            this.a.k("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public final void b(tl1 tl1Var, int i) {
        tl1Var.b(i);
        this.a.k(tl1Var.b(i) + ": " + tl1Var.e(i));
    }
}
