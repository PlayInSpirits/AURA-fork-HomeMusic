package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ky2 implements k51 {
    public final long a;
    public final be3 b;
    public final wy2 c;
    public final zg1 d;
    public final ov1 e;
    public final tq0 f;
    public m51 g;
    public wv4 h;
    public wv4 i;
    public int j;
    public qv2 k;
    public qv2 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public q84 r;
    public boolean s;
    public boolean t;
    public long u;

    public ky2(long j) {
        this.a = j;
        this.b = new be3(10);
        this.c = new wy2();
        this.d = new zg1();
        this.m = -9223372036854775807L;
        this.e = new ov1(0);
        tq0 tq0Var = new tq0();
        this.f = tq0Var;
        this.i = tq0Var;
        this.p = -1L;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x024d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0258  */
    /* JADX WARN: Code duplicated, block: B:108:0x0269  */
    /* JADX WARN: Code duplicated, block: B:113:0x029e  */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x0303  */
    /* JADX WARN: Code duplicated, block: B:143:0x0307  */
    /* JADX WARN: Code duplicated, block: B:147:0x033e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0342  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0349  */
    /* JADX WARN: Code duplicated, block: B:152:0x0357  */
    /* JADX WARN: Code duplicated, block: B:155:0x0366  */
    /* JADX WARN: Code duplicated, block: B:158:0x036b A[LOOP:0: B:149:0x0347->B:158:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x0375  */
    /* JADX WARN: Code duplicated, block: B:165:0x037d  */
    /* JADX WARN: Code duplicated, block: B:167:0x038b  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:170:0x039f  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a4 A[LOOP:1: B:164:0x037b->B:173:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d2 A[LOOP:2: B:180:0x03d0->B:181:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0402  */
    /* JADX WARN: Code duplicated, block: B:186:0x0410  */
    /* JADX WARN: Code duplicated, block: B:188:0x0414  */
    /* JADX WARN: Code duplicated, block: B:189:0x0417 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x041a  */
    /* JADX WARN: Code duplicated, block: B:193:0x041e  */
    /* JADX WARN: Code duplicated, block: B:194:0x044f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0474 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0476  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:207:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:212:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:215:0x0501  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0570  */
    /* JADX WARN: Code duplicated, block: B:234:0x057b  */
    /* JADX WARN: Code duplicated, block: B:235:0x057e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0586  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:250:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0370 A[EDGE_INSN: B:251:0x0370->B:160:0x0370 BREAK  A[LOOP:0: B:149:0x0347->B:158:0x036b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x03a9 A[EDGE_INSN: B:253:0x03a9->B:175:0x03a9 BREAK  A[LOOP:1: B:164:0x037b->B:173:0x03a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb A[LOOP:4: B:77:0x01c9->B:78:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0214  */
    /* JADX WARN: Code duplicated, block: B:94:0x022a  */
    /* JADX WARN: Code duplicated, block: B:97:0x023e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0169, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws Throwable {
        wy2 wy2Var;
        Throwable th;
        int i;
        long j;
        q84 q84Var;
        be3 be3Var;
        boolean z;
        long j2;
        long j3;
        long position;
        long j4;
        ?? r4;
        int iF;
        int i2;
        int iM;
        be3 be3Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2;
        zg1 zg1Var;
        wy2 wy2Var2;
        int i7;
        int iM3;
        int iE;
        long jC;
        long[] jArr;
        my2 my2Var;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        qv2 qv2Var;
        long position2;
        long j6;
        long length;
        long jY;
        long j7;
        q84 eb0Var;
        long jY2;
        float fIntBitsToFloat;
        ly2 ly2VarA;
        ly2 ly2VarA2;
        long[] jArr2;
        int i12;
        qv2 qv2Var2;
        long position3;
        pv2[] pv2VarArr;
        int length2;
        int i13;
        pv2 pv2Var;
        pw2 pw2Var;
        int[] iArr;
        pv2[] pv2VarArr2;
        int length3;
        int i14;
        pv2 pv2Var2;
        ds4 ds4Var;
        char c;
        long jQ;
        int length4;
        long[] jArr3;
        long[] jArr4;
        long j8;
        int i15;
        qw2 qw2Var;
        pv2 pv2Var3;
        pv2 pv2Var4;
        boolean z2;
        q84 p84Var;
        boolean z3;
        qv2 qv2VarB;
        qv2 qv2Var3;
        sb1 sb1Var;
        long length5;
        long position4;
        long j9;
        long j10;
        int iM4;
        long jY3;
        int iH;
        int iH2;
        int iH3;
        long[] jArr5;
        long[] jArr6;
        wy2 wy2Var3;
        long j11;
        int i16;
        long j12;
        long jMax;
        wy2 wy2Var4;
        int iA;
        this.h.getClass();
        String str = f35.a;
        int i17 = this.j;
        int i18 = 0;
        wy2 wy2Var5 = this.c;
        if (i17 == 0) {
            try {
                i(l51Var, false);
                q84Var = this.r;
                be3Var = this.b;
                if (q84Var == null) {
                    be3Var2 = new be3(wy2Var5.b);
                    th = null;
                    l51Var.n(be3Var2.a, 0, wy2Var5.b);
                    i3 = wy2Var5.a & 1;
                    i4 = wy2Var5.d;
                    i5 = 21;
                    j = 1000000;
                    if (i3 != 0) {
                        if (i4 != 1) {
                            i6 = 36;
                        }
                        j2 = -9223372036854775807L;
                        if (be3Var2.c >= i6 + 4) {
                            be3Var2.N(i6);
                            iM2 = be3Var2.m();
                            if (iM2 != 1483304551 && iM2 != 1231971951) {
                                if (be3Var2.c >= 40) {
                                    be3Var2.N(36);
                                    if (be3Var2.m() == 1447187017) {
                                        iM2 = 1447187017;
                                    } else {
                                        iM2 = 0;
                                    }
                                } else {
                                    iM2 = 0;
                                }
                            }
                        } else if (be3Var2.c >= 40) {
                            be3Var2.N(36);
                            if (be3Var2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                        zg1Var = this.d;
                        if (iM2 == 1231971951) {
                            wy2Var2 = wy2Var5;
                            i7 = 0;
                            iM3 = be3Var2.m();
                            if ((iM3 & 1) != 0) {
                                iE = be3Var2.E();
                            } else {
                                iE = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jC = be3Var2.C();
                            } else {
                                jC = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                for (i12 = 0; i12 < 100; i12++) {
                                    jArr2[i12] = be3Var2.A();
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                be3Var2.O(4);
                            }
                            if (be3Var2.a() >= 24) {
                                be3Var2.O(11);
                                fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                                int iH4 = be3Var2.H();
                                int iH5 = be3Var2.H();
                                ly2VarA = ly2.a(iH4);
                                ly2VarA2 = ly2.a(iH5);
                                if (fIntBitsToFloat > 0.0f && ly2VarA == null && ly2VarA2 == null) {
                                    my2Var = null;
                                } else {
                                    my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                                }
                                be3Var2.O(2);
                                int iD = be3Var2.D();
                                i9 = (16773120 & iD) >> 12;
                                i8 = iD & 4095;
                            } else {
                                my2Var = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iE;
                            i10 = wy2Var2.b;
                            int i19 = wy2Var2.c;
                            i11 = wy2Var2.e;
                            int i20 = wy2Var2.f;
                            if ((zg1Var.a != -1 || zg1Var.b == -1) && i9 != -1 && i8 != -1) {
                                zg1Var.a = i9;
                                zg1Var.b = i8;
                            }
                            if (my2Var != null) {
                                qv2Var = new qv2(my2Var);
                            } else {
                                qv2Var = null;
                            }
                            this.l = qv2Var;
                            position2 = l51Var.getPosition();
                            if (l51Var.getLength() != -1 || jC == -1) {
                                j6 = j5;
                            } else {
                                j6 = j5;
                                long j13 = position2 + jC;
                                if (l51Var.getLength() != j13) {
                                    l93.K("Mp3Extractor", "Data size mismatch between stream (" + l51Var.getLength() + ") and Xing frame (" + j13 + "), using Xing value.");
                                }
                            }
                            l51Var.l(wy2Var2.b);
                            if (iM2 == 1483304551) {
                                if (j6 != -1 || j6 == 0) {
                                    jY2 = -9223372036854775807L;
                                } else {
                                    jY2 = f35.Y(i19, (j6 * ((long) i20)) - 1);
                                }
                                if (jY2 == -9223372036854775807L) {
                                    eb0Var = null;
                                } else {
                                    eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                                }
                            } else {
                                length = l51Var.getLength();
                                if (j6 != -1 || j6 == 0) {
                                    jY = -9223372036854775807L;
                                } else {
                                    jY = f35.Y(i19, (((long) i20) * j6) - 1);
                                }
                                if (jY != -9223372036854775807L) {
                                    if (jC != -1) {
                                        length = position2 + jC;
                                        j7 = jC - ((long) i10);
                                    } else if (length != -1) {
                                        j7 = (length - position2) - ((long) i10);
                                    } else {
                                        eb0Var = null;
                                    }
                                    long j14 = length;
                                    long j15 = j7;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    eb0Var = new eb0(j14, position2 + ((long) i10), jz4.m(f35.a0(j15, 8000000L, jY, roundingMode)), jz4.m(gh0.h(j15, j6, roundingMode)), false, true);
                                } else {
                                    eb0Var = null;
                                }
                            }
                        } else if (iM2 != 1447187017) {
                            length5 = l51Var.getLength();
                            position4 = l51Var.getPosition();
                            be3Var2.O(6);
                            int iM5 = be3Var2.m();
                            i7 = 0;
                            j9 = position4 + ((long) wy2Var5.b);
                            j10 = j9 + ((long) iM5);
                            iM4 = be3Var2.m();
                            if (iM4 <= 0) {
                                jY3 = f35.Y(wy2Var5.c, (((long) iM4) * ((long) wy2Var5.f)) - 1);
                                iH = be3Var2.H();
                                iH2 = be3Var2.H();
                                iH3 = be3Var2.H();
                                be3Var2.O(2);
                                jArr5 = new long[iH];
                                jArr6 = new long[iH];
                                wy2Var3 = wy2Var5;
                                j11 = position4 + ((long) wy2Var5.b);
                                i16 = 0;
                                while (true) {
                                    if (i16 < iH) {
                                        long[] jArr7 = jArr5;
                                        long[] jArr8 = jArr6;
                                        wy2 wy2Var6 = wy2Var3;
                                        if (length5 != -1 || length5 == j10) {
                                            j12 = j10;
                                        } else {
                                            StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
                                            sb.append(length5);
                                            sb.append(", ");
                                            j12 = j10;
                                            sb.append(j12);
                                            l93.q0("VbriSeeker", sb.toString());
                                        }
                                        if (j12 != j11) {
                                            l93.q0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j12 + ", " + j11 + "\nSeeking will be inaccurate.");
                                            jMax = Math.max(j12, j11);
                                        } else {
                                            jMax = j12;
                                        }
                                        wy2Var2 = wy2Var6;
                                        eb0Var = new l35(jArr7, jArr8, jY3, j9, jMax, wy2Var2.e);
                                        break;
                                    }
                                    long[] jArr9 = jArr6;
                                    wy2Var4 = wy2Var3;
                                    int i21 = i16;
                                    long[] jArr10 = jArr5;
                                    jArr10[i21] = (((long) i16) * jY3) / ((long) iH);
                                    jArr9[i21] = j11;
                                    if (iH3 != 1) {
                                        iA = be3Var2.A();
                                    } else if (iH3 != 2) {
                                        iA = be3Var2.H();
                                    } else if (iH3 != 3) {
                                        iA = be3Var2.D();
                                    } else {
                                        if (iH3 != 4) {
                                            eb0Var = null;
                                            wy2Var2 = wy2Var4;
                                            break;
                                        }
                                        iA = be3Var2.E();
                                    }
                                    j11 += ((long) iA) * ((long) iH2);
                                    i16 = i21 + 1;
                                    jArr6 = jArr9;
                                    wy2Var3 = wy2Var4;
                                    jArr5 = jArr10;
                                }
                            } else {
                                eb0Var = null;
                                wy2Var2 = wy2Var5;
                            }
                            l51Var.l(wy2Var2.b);
                        } else if (iM2 != 1483304551) {
                            l51Var.k();
                            eb0Var = null;
                            wy2Var2 = wy2Var5;
                            i7 = 0;
                        } else {
                            wy2Var2 = wy2Var5;
                            i7 = 0;
                            iM3 = be3Var2.m();
                            if ((iM3 & 1) != 0) {
                                iE = be3Var2.E();
                            } else {
                                iE = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jC = be3Var2.C();
                            } else {
                                jC = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                while (i12 < 100) {
                                    jArr2[i12] = be3Var2.A();
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                be3Var2.O(4);
                            }
                            if (be3Var2.a() >= 24) {
                                be3Var2.O(11);
                                fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                                int iH6 = be3Var2.H();
                                int iH7 = be3Var2.H();
                                ly2VarA = ly2.a(iH6);
                                ly2VarA2 = ly2.a(iH7);
                                if (fIntBitsToFloat > 0.0f) {
                                    my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                                } else {
                                    my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                                }
                                be3Var2.O(2);
                                int iD2 = be3Var2.D();
                                i9 = (16773120 & iD2) >> 12;
                                i8 = iD2 & 4095;
                            } else {
                                my2Var = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iE;
                            i10 = wy2Var2.b;
                            int i110 = wy2Var2.c;
                            i11 = wy2Var2.e;
                            int i22 = wy2Var2.f;
                            if (zg1Var.a != -1) {
                                zg1Var.a = i9;
                                zg1Var.b = i8;
                            } else {
                                zg1Var.a = i9;
                                zg1Var.b = i8;
                            }
                            if (my2Var != null) {
                                qv2Var = new qv2(my2Var);
                            } else {
                                qv2Var = null;
                            }
                            this.l = qv2Var;
                            position2 = l51Var.getPosition();
                            if (l51Var.getLength() != -1) {
                                j6 = j5;
                            } else {
                                j6 = j5;
                            }
                            l51Var.l(wy2Var2.b);
                            if (iM2 == 1483304551) {
                                if (j6 != -1) {
                                    jY2 = -9223372036854775807L;
                                } else {
                                    jY2 = -9223372036854775807L;
                                }
                                if (jY2 == -9223372036854775807L) {
                                    eb0Var = null;
                                } else {
                                    eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                                }
                            } else {
                                length = l51Var.getLength();
                                if (j6 != -1) {
                                    jY = -9223372036854775807L;
                                } else {
                                    jY = -9223372036854775807L;
                                }
                                if (jY != -9223372036854775807L) {
                                    if (jC != -1) {
                                        length = position2 + jC;
                                        j7 = jC - ((long) i10);
                                    } else if (length != -1) {
                                        j7 = (length - position2) - ((long) i10);
                                    } else {
                                        eb0Var = null;
                                    }
                                    long j16 = length;
                                    long j17 = j7;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    eb0Var = new eb0(j16, position2 + ((long) i10), jz4.m(f35.a0(j17, 8000000L, jY, roundingMode2)), jz4.m(gh0.h(j17, j6, roundingMode2)), false, true);
                                } else {
                                    eb0Var = null;
                                }
                            }
                        }
                        qv2Var2 = this.k;
                        position3 = l51Var.getPosition();
                        if (qv2Var2 == null) {
                            qw2Var = null;
                        } else {
                            pv2VarArr = qv2Var2.a;
                            length2 = pv2VarArr.length;
                            i13 = i7;
                            while (true) {
                                if (i13 < length2) {
                                    pv2Var = null;
                                    break;
                                }
                                pv2Var4 = pv2VarArr[i13];
                                if (pw2.class.isAssignableFrom(pv2Var4.getClass())) {
                                    pv2Var = (pv2) pw2.class.cast(pv2Var4);
                                    if (!zo3.n.apply(pv2Var)) {
                                        pv2Var = null;
                                    }
                                } else {
                                    pv2Var = null;
                                }
                                if (pv2Var != null) {
                                    break;
                                }
                                i13++;
                            }
                            pw2Var = (pw2) pv2Var;
                            if (pw2Var == null) {
                                qw2Var = null;
                            } else {
                                iArr = pw2Var.e;
                                pv2VarArr2 = qv2Var2.a;
                                length3 = pv2VarArr2.length;
                                i14 = 0;
                                while (true) {
                                    if (i14 < length3) {
                                        pv2Var2 = null;
                                        break;
                                    }
                                    pv2Var3 = pv2VarArr2[i14];
                                    if (ds4.class.isAssignableFrom(pv2Var3.getClass())) {
                                        pv2Var2 = (pv2) ds4.class.cast(pv2Var3);
                                        if (!((ds4) pv2Var2).a.equals("TLEN")) {
                                            pv2Var2 = null;
                                        }
                                    } else {
                                        pv2Var2 = null;
                                    }
                                    if (pv2Var2 != null) {
                                        break;
                                    }
                                    i14++;
                                }
                                ds4Var = (ds4) pv2Var2;
                                if (ds4Var == null) {
                                    jQ = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    jQ = f35.Q(Long.parseLong((String) ds4Var.d.get(0)));
                                }
                                length4 = iArr.length;
                                int i23 = length4 + 1;
                                jArr3 = new long[i23];
                                jArr4 = new long[i23];
                                jArr3[c] = position3;
                                jArr4[c] = 0;
                                j8 = 0;
                                i15 = 1;
                                while (i15 <= length4) {
                                    int i24 = i15 - 1;
                                    long j18 = position3 + ((long) (pw2Var.c + iArr[i24]));
                                    j8 += (long) (pw2Var.d + pw2Var.f[i24]);
                                    jArr3[i15] = j18;
                                    jArr4[i15] = j8;
                                    i15++;
                                    length4 = length4;
                                    position3 = j18;
                                }
                                qw2Var = new qw2(jQ, jArr3, jArr4);
                            }
                        }
                        if (this.s) {
                            p84Var = new p84(-9223372036854775807L);
                            be3Var = be3Var;
                            zg1Var = zg1Var;
                            wy2Var = wy2Var2;
                            z3 = true;
                            i18 = 0;
                        } else {
                            j2 = -9223372036854775807L;
                            if (qw2Var != null) {
                                eb0Var = qw2Var;
                            } else if (eb0Var == null) {
                                eb0Var = null;
                            }
                            if (eb0Var == null) {
                                int i25 = i7;
                                l51Var.n(be3Var.a, i25, 4);
                                be3Var.N(i25);
                                wy2Var2.a(be3Var.m());
                                wy2Var = wy2Var2;
                                z2 = true;
                                i18 = 0;
                                eb0Var = new eb0(l51Var.getLength(), l51Var.getPosition(), wy2Var2.e, wy2Var2.b, false, true);
                            } else {
                                wy2Var = wy2Var2;
                                z2 = true;
                                i18 = 0;
                            }
                            eb0Var.b();
                            eb0Var.b();
                            this.h.d(eb0Var.g());
                            p84Var = eb0Var;
                            z3 = z2;
                        }
                        this.r = p84Var;
                        this.g.w(p84Var);
                        qv2VarB = this.k;
                        qv2Var3 = this.l;
                        if (qv2VarB != null) {
                            if (qv2Var3 != null) {
                                qv2VarB = qv2VarB.b(qv2Var3);
                            }
                            qv2Var3 = qv2VarB;
                        }
                        sb1Var = new sb1();
                        sb1Var.l = lw2.m("audio/mpeg");
                        sb1Var.m = lw2.m((String) wy2Var.g);
                        sb1Var.n = 4096;
                        sb1Var.E = wy2Var.d;
                        sb1Var.F = wy2Var.c;
                        sb1Var.H = zg1Var.a;
                        sb1Var.I = zg1Var.b;
                        sb1Var.k = qv2Var3;
                        if (this.r.f() != -2147483647) {
                            sb1Var.h = this.r.f();
                        }
                        this.i.g(new tb1(sb1Var));
                        this.o = l51Var.getPosition();
                        j3 = 0;
                        r4 = z3;
                    } else if (i4 == 1) {
                        i5 = 13;
                    }
                    i6 = i5;
                    j2 = -9223372036854775807L;
                    if (be3Var2.c >= i6 + 4) {
                        be3Var2.N(i6);
                        iM2 = be3Var2.m();
                        if (iM2 != 1483304551) {
                            if (be3Var2.c >= 40) {
                                be3Var2.N(36);
                                if (be3Var2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (be3Var2.c >= 40) {
                        be3Var2.N(36);
                        if (be3Var2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    zg1Var = this.d;
                    if (iM2 == 1231971951) {
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                        iM3 = be3Var2.m();
                        if ((iM3 & 1) != 0) {
                            iE = be3Var2.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = be3Var2.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i12 < 100) {
                                jArr2[i12] = be3Var2.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            be3Var2.O(4);
                        }
                        if (be3Var2.a() >= 24) {
                            be3Var2.O(11);
                            fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                            int iH8 = be3Var2.H();
                            int iH9 = be3Var2.H();
                            ly2VarA = ly2.a(iH8);
                            ly2VarA2 = ly2.a(iH9);
                            if (fIntBitsToFloat > 0.0f) {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            } else {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            }
                            be3Var2.O(2);
                            int iD3 = be3Var2.D();
                            i9 = (16773120 & iD3) >> 12;
                            i8 = iD3 & 4095;
                        } else {
                            my2Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iE;
                        i10 = wy2Var2.b;
                        int i111 = wy2Var2.c;
                        i11 = wy2Var2.e;
                        int i26 = wy2Var2.f;
                        if (zg1Var.a != -1) {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        } else {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        }
                        if (my2Var != null) {
                            qv2Var = new qv2(my2Var);
                        } else {
                            qv2Var = null;
                        }
                        this.l = qv2Var;
                        position2 = l51Var.getPosition();
                        if (l51Var.getLength() != -1) {
                            j6 = j5;
                        } else {
                            j6 = j5;
                        }
                        l51Var.l(wy2Var2.b);
                        if (iM2 == 1483304551) {
                            if (j6 != -1) {
                                jY2 = -9223372036854775807L;
                            } else {
                                jY2 = -9223372036854775807L;
                            }
                            if (jY2 == -9223372036854775807L) {
                                eb0Var = null;
                            } else {
                                eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                            }
                        } else {
                            length = l51Var.getLength();
                            if (j6 != -1) {
                                jY = -9223372036854775807L;
                            } else {
                                jY = -9223372036854775807L;
                            }
                            if (jY != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j7 = jC - ((long) i10);
                                } else if (length != -1) {
                                    j7 = (length - position2) - ((long) i10);
                                } else {
                                    eb0Var = null;
                                }
                                long j19 = length;
                                long j110 = j7;
                                RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                eb0Var = new eb0(j19, position2 + ((long) i10), jz4.m(f35.a0(j110, 8000000L, jY, roundingMode3)), jz4.m(gh0.h(j110, j6, roundingMode3)), false, true);
                            } else {
                                eb0Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length5 = l51Var.getLength();
                        position4 = l51Var.getPosition();
                        be3Var2.O(6);
                        int iM6 = be3Var2.m();
                        i7 = 0;
                        j9 = position4 + ((long) wy2Var5.b);
                        j10 = j9 + ((long) iM6);
                        iM4 = be3Var2.m();
                        if (iM4 <= 0) {
                            jY3 = f35.Y(wy2Var5.c, (((long) iM4) * ((long) wy2Var5.f)) - 1);
                            iH = be3Var2.H();
                            iH2 = be3Var2.H();
                            iH3 = be3Var2.H();
                            be3Var2.O(2);
                            jArr5 = new long[iH];
                            jArr6 = new long[iH];
                            wy2Var3 = wy2Var5;
                            j11 = position4 + ((long) wy2Var5.b);
                            i16 = 0;
                            while (true) {
                                if (i16 < iH) {
                                    long[] jArr11 = jArr5;
                                    long[] jArr12 = jArr6;
                                    wy2 wy2Var7 = wy2Var3;
                                    if (length5 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        l93.q0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j12 + ", " + j11 + "\nSeeking will be inaccurate.");
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    wy2Var2 = wy2Var7;
                                    eb0Var = new l35(jArr11, jArr12, jY3, j9, jMax, wy2Var2.e);
                                    break;
                                }
                                long[] jArr13 = jArr6;
                                wy2Var4 = wy2Var3;
                                int i27 = i16;
                                long[] jArr14 = jArr5;
                                jArr14[i27] = (((long) i16) * jY3) / ((long) iH);
                                jArr13[i27] = j11;
                                if (iH3 != 1) {
                                    iA = be3Var2.A();
                                } else if (iH3 != 2) {
                                    iA = be3Var2.H();
                                } else if (iH3 != 3) {
                                    iA = be3Var2.D();
                                } else {
                                    if (iH3 != 4) {
                                        eb0Var = null;
                                        wy2Var2 = wy2Var4;
                                        break;
                                    }
                                    iA = be3Var2.E();
                                }
                                j11 += ((long) iA) * ((long) iH2);
                                i16 = i27 + 1;
                                jArr6 = jArr13;
                                wy2Var3 = wy2Var4;
                                jArr5 = jArr14;
                            }
                        } else {
                            eb0Var = null;
                            wy2Var2 = wy2Var5;
                        }
                        l51Var.l(wy2Var2.b);
                    } else if (iM2 != 1483304551) {
                        l51Var.k();
                        eb0Var = null;
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                    } else {
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                        iM3 = be3Var2.m();
                        if ((iM3 & 1) != 0) {
                            iE = be3Var2.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = be3Var2.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i12 < 100) {
                                jArr2[i12] = be3Var2.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            be3Var2.O(4);
                        }
                        if (be3Var2.a() >= 24) {
                            be3Var2.O(11);
                            fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                            int iH10 = be3Var2.H();
                            int iH11 = be3Var2.H();
                            ly2VarA = ly2.a(iH10);
                            ly2VarA2 = ly2.a(iH11);
                            if (fIntBitsToFloat > 0.0f) {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            } else {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            }
                            be3Var2.O(2);
                            int iD4 = be3Var2.D();
                            i9 = (16773120 & iD4) >> 12;
                            i8 = iD4 & 4095;
                        } else {
                            my2Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iE;
                        i10 = wy2Var2.b;
                        int i112 = wy2Var2.c;
                        i11 = wy2Var2.e;
                        int i28 = wy2Var2.f;
                        if (zg1Var.a != -1) {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        } else {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        }
                        if (my2Var != null) {
                            qv2Var = new qv2(my2Var);
                        } else {
                            qv2Var = null;
                        }
                        this.l = qv2Var;
                        position2 = l51Var.getPosition();
                        if (l51Var.getLength() != -1) {
                            j6 = j5;
                        } else {
                            j6 = j5;
                        }
                        l51Var.l(wy2Var2.b);
                        if (iM2 == 1483304551) {
                            if (j6 != -1) {
                                jY2 = -9223372036854775807L;
                            } else {
                                jY2 = -9223372036854775807L;
                            }
                            if (jY2 == -9223372036854775807L) {
                                eb0Var = null;
                            } else {
                                eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                            }
                        } else {
                            length = l51Var.getLength();
                            if (j6 != -1) {
                                jY = -9223372036854775807L;
                            } else {
                                jY = -9223372036854775807L;
                            }
                            if (jY != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j7 = jC - ((long) i10);
                                } else if (length != -1) {
                                    j7 = (length - position2) - ((long) i10);
                                } else {
                                    eb0Var = null;
                                }
                                long j111 = length;
                                long j112 = j7;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                eb0Var = new eb0(j111, position2 + ((long) i10), jz4.m(f35.a0(j112, 8000000L, jY, roundingMode4)), jz4.m(gh0.h(j112, j6, roundingMode4)), false, true);
                            } else {
                                eb0Var = null;
                            }
                        }
                    }
                    qv2Var2 = this.k;
                    position3 = l51Var.getPosition();
                    if (qv2Var2 == null) {
                        qw2Var = null;
                    } else {
                        pv2VarArr = qv2Var2.a;
                        length2 = pv2VarArr.length;
                        i13 = i7;
                        while (true) {
                            if (i13 < length2) {
                                pv2Var = null;
                                break;
                            }
                            pv2Var4 = pv2VarArr[i13];
                            if (pw2.class.isAssignableFrom(pv2Var4.getClass())) {
                                pv2Var = (pv2) pw2.class.cast(pv2Var4);
                                if (!zo3.n.apply(pv2Var)) {
                                    pv2Var = null;
                                }
                            } else {
                                pv2Var = null;
                            }
                            if (pv2Var != null) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        pw2Var = (pw2) pv2Var;
                        if (pw2Var == null) {
                            qw2Var = null;
                        } else {
                            iArr = pw2Var.e;
                            pv2VarArr2 = qv2Var2.a;
                            length3 = pv2VarArr2.length;
                            i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    pv2Var2 = null;
                                    break;
                                }
                                pv2Var3 = pv2VarArr2[i14];
                                if (ds4.class.isAssignableFrom(pv2Var3.getClass())) {
                                    pv2Var2 = (pv2) ds4.class.cast(pv2Var3);
                                    if (!((ds4) pv2Var2).a.equals("TLEN")) {
                                        pv2Var2 = null;
                                    }
                                } else {
                                    pv2Var2 = null;
                                }
                                if (pv2Var2 != null) {
                                    break;
                                    break;
                                }
                                i14++;
                            }
                            ds4Var = (ds4) pv2Var2;
                            if (ds4Var == null) {
                                jQ = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jQ = f35.Q(Long.parseLong((String) ds4Var.d.get(0)));
                            }
                            length4 = iArr.length;
                            int i29 = length4 + 1;
                            jArr3 = new long[i29];
                            jArr4 = new long[i29];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i15 = 1;
                            while (i15 <= length4) {
                                int i210 = i15 - 1;
                                long j113 = position3 + ((long) (pw2Var.c + iArr[i210]));
                                j8 += (long) (pw2Var.d + pw2Var.f[i210]);
                                jArr3[i15] = j113;
                                jArr4[i15] = j8;
                                i15++;
                                length4 = length4;
                                position3 = j113;
                            }
                            qw2Var = new qw2(jQ, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        p84Var = new p84(-9223372036854775807L);
                        be3Var = be3Var;
                        zg1Var = zg1Var;
                        wy2Var = wy2Var2;
                        z3 = true;
                        i18 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (qw2Var != null) {
                            eb0Var = qw2Var;
                        } else if (eb0Var == null) {
                            eb0Var = null;
                        }
                        if (eb0Var == null) {
                            int i211 = i7;
                            l51Var.n(be3Var.a, i211, 4);
                            be3Var.N(i211);
                            wy2Var2.a(be3Var.m());
                            wy2Var = wy2Var2;
                            z2 = true;
                            i18 = 0;
                            eb0Var = new eb0(l51Var.getLength(), l51Var.getPosition(), wy2Var2.e, wy2Var2.b, false, true);
                        } else {
                            wy2Var = wy2Var2;
                            z2 = true;
                            i18 = 0;
                        }
                        eb0Var.b();
                        eb0Var.b();
                        this.h.d(eb0Var.g());
                        p84Var = eb0Var;
                        z3 = z2;
                    }
                    this.r = p84Var;
                    this.g.w(p84Var);
                    qv2VarB = this.k;
                    qv2Var3 = this.l;
                    if (qv2VarB != null) {
                        if (qv2Var3 != null) {
                            qv2VarB = qv2VarB.b(qv2Var3);
                        }
                        qv2Var3 = qv2VarB;
                    }
                    sb1Var = new sb1();
                    sb1Var.l = lw2.m("audio/mpeg");
                    sb1Var.m = lw2.m((String) wy2Var.g);
                    sb1Var.n = 4096;
                    sb1Var.E = wy2Var.d;
                    sb1Var.F = wy2Var.c;
                    sb1Var.H = zg1Var.a;
                    sb1Var.I = zg1Var.b;
                    sb1Var.k = qv2Var3;
                    if (this.r.f() != -2147483647) {
                        sb1Var.h = this.r.f();
                    }
                    this.i.g(new tb1(sb1Var));
                    this.o = l51Var.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else {
                    wy2Var = wy2Var5;
                    be3Var = be3Var;
                    z = true;
                    th = null;
                    j = 1000000;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (this.o != 0) {
                        position = l51Var.getPosition();
                        j4 = this.o;
                        if (position < j4) {
                            r4 = z;
                            r4 = z;
                            l51Var.l((int) (j4 - position));
                            r4 = z;
                        }
                    }
                }
                r4 = z;
                r4 = z;
                r4 = z;
                if (this.q == 0) {
                    l51Var.k();
                    if (h(l51Var)) {
                        i = -1;
                        i18 = -1;
                    } else {
                        be3Var.N(i18);
                        iM = be3Var.m();
                        if (((-128000) & iM) == (((long) this.j) & (-128000)) || jz4.v(iM) == -1) {
                            l51Var.l(r4);
                            this.j = i18;
                        } else {
                            wy2Var.a(iM);
                            if (this.m == j2) {
                                this.m = this.r.c(l51Var.getPosition());
                                long j20 = this.a;
                                if (j20 != j2) {
                                    this.m = (j20 - this.r.c(j3)) + this.m;
                                }
                            }
                            this.q = wy2Var.b;
                            this.p = l51Var.getPosition() + ((long) wy2Var.b);
                            if (this.r instanceof vx1) {
                                long j21 = ((this.n + ((long) wy2Var.f)) * j) / ((long) wy2Var.c);
                                throw th;
                            }
                            iF = this.i.f(l51Var, this.q, r4);
                            if (iF == -1) {
                                i = -1;
                                i18 = -1;
                            } else {
                                i2 = this.q - iF;
                                this.q = i2;
                                if (i2 <= 0) {
                                    this.i.a(this.m + ((this.n * j) / ((long) wy2Var.c)), 1, wy2Var.b, 0, null);
                                    this.n += (long) wy2Var.f;
                                    this.q = i18;
                                }
                            }
                        }
                        i = -1;
                    }
                } else {
                    iF = this.i.f(l51Var, this.q, r4);
                    if (iF == -1) {
                        i = -1;
                        i18 = -1;
                    } else {
                        i2 = this.q - iF;
                        this.q = i2;
                        if (i2 <= 0) {
                            this.i.a(this.m + ((this.n * j) / ((long) wy2Var.c)), 1, wy2Var.b, 0, null);
                            this.n += (long) wy2Var.f;
                            this.q = i18;
                        }
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                wy2Var = wy2Var5;
                th = null;
                i = -1;
                i18 = -1;
                j = 1000000;
            }
        } else {
            q84Var = this.r;
            be3Var = this.b;
            if (q84Var == null) {
                be3Var2 = new be3(wy2Var5.b);
                th = null;
                l51Var.n(be3Var2.a, 0, wy2Var5.b);
                i3 = wy2Var5.a & 1;
                i4 = wy2Var5.d;
                i5 = 21;
                j = 1000000;
                if (i3 != 0) {
                    if (i4 != 1) {
                        i6 = 36;
                    }
                    j2 = -9223372036854775807L;
                    if (be3Var2.c >= i6 + 4) {
                        be3Var2.N(i6);
                        iM2 = be3Var2.m();
                        if (iM2 != 1483304551) {
                            if (be3Var2.c >= 40) {
                                be3Var2.N(36);
                                if (be3Var2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (be3Var2.c >= 40) {
                        be3Var2.N(36);
                        if (be3Var2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    zg1Var = this.d;
                    if (iM2 == 1231971951) {
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                        iM3 = be3Var2.m();
                        if ((iM3 & 1) != 0) {
                            iE = be3Var2.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = be3Var2.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i12 < 100) {
                                jArr2[i12] = be3Var2.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            be3Var2.O(4);
                        }
                        if (be3Var2.a() >= 24) {
                            be3Var2.O(11);
                            fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                            int iH12 = be3Var2.H();
                            int iH13 = be3Var2.H();
                            ly2VarA = ly2.a(iH12);
                            ly2VarA2 = ly2.a(iH13);
                            if (fIntBitsToFloat > 0.0f) {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            } else {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            }
                            be3Var2.O(2);
                            int iD5 = be3Var2.D();
                            i9 = (16773120 & iD5) >> 12;
                            i8 = iD5 & 4095;
                        } else {
                            my2Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iE;
                        i10 = wy2Var2.b;
                        int i113 = wy2Var2.c;
                        i11 = wy2Var2.e;
                        int i212 = wy2Var2.f;
                        if (zg1Var.a != -1) {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        } else {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        }
                        if (my2Var != null) {
                            qv2Var = new qv2(my2Var);
                        } else {
                            qv2Var = null;
                        }
                        this.l = qv2Var;
                        position2 = l51Var.getPosition();
                        if (l51Var.getLength() != -1) {
                            j6 = j5;
                        } else {
                            j6 = j5;
                        }
                        l51Var.l(wy2Var2.b);
                        if (iM2 == 1483304551) {
                            if (j6 != -1) {
                                jY2 = -9223372036854775807L;
                            } else {
                                jY2 = -9223372036854775807L;
                            }
                            if (jY2 == -9223372036854775807L) {
                                eb0Var = null;
                            } else {
                                eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                            }
                        } else {
                            length = l51Var.getLength();
                            if (j6 != -1) {
                                jY = -9223372036854775807L;
                            } else {
                                jY = -9223372036854775807L;
                            }
                            if (jY != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j7 = jC - ((long) i10);
                                } else if (length != -1) {
                                    j7 = (length - position2) - ((long) i10);
                                } else {
                                    eb0Var = null;
                                }
                                long j114 = length;
                                long j115 = j7;
                                RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                                eb0Var = new eb0(j114, position2 + ((long) i10), jz4.m(f35.a0(j115, 8000000L, jY, roundingMode5)), jz4.m(gh0.h(j115, j6, roundingMode5)), false, true);
                            } else {
                                eb0Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length5 = l51Var.getLength();
                        position4 = l51Var.getPosition();
                        be3Var2.O(6);
                        int iM7 = be3Var2.m();
                        i7 = 0;
                        j9 = position4 + ((long) wy2Var5.b);
                        j10 = j9 + ((long) iM7);
                        iM4 = be3Var2.m();
                        if (iM4 <= 0) {
                            jY3 = f35.Y(wy2Var5.c, (((long) iM4) * ((long) wy2Var5.f)) - 1);
                            iH = be3Var2.H();
                            iH2 = be3Var2.H();
                            iH3 = be3Var2.H();
                            be3Var2.O(2);
                            jArr5 = new long[iH];
                            jArr6 = new long[iH];
                            wy2Var3 = wy2Var5;
                            j11 = position4 + ((long) wy2Var5.b);
                            i16 = 0;
                            while (true) {
                                if (i16 < iH) {
                                    long[] jArr15 = jArr5;
                                    long[] jArr16 = jArr6;
                                    wy2 wy2Var8 = wy2Var3;
                                    if (length5 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        l93.q0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j12 + ", " + j11 + "\nSeeking will be inaccurate.");
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    wy2Var2 = wy2Var8;
                                    eb0Var = new l35(jArr15, jArr16, jY3, j9, jMax, wy2Var2.e);
                                    break;
                                }
                                long[] jArr17 = jArr6;
                                wy2Var4 = wy2Var3;
                                int i213 = i16;
                                long[] jArr18 = jArr5;
                                jArr18[i213] = (((long) i16) * jY3) / ((long) iH);
                                jArr17[i213] = j11;
                                if (iH3 != 1) {
                                    iA = be3Var2.A();
                                } else if (iH3 != 2) {
                                    iA = be3Var2.H();
                                } else if (iH3 != 3) {
                                    iA = be3Var2.D();
                                } else {
                                    if (iH3 != 4) {
                                        eb0Var = null;
                                        wy2Var2 = wy2Var4;
                                        break;
                                    }
                                    iA = be3Var2.E();
                                }
                                j11 += ((long) iA) * ((long) iH2);
                                i16 = i213 + 1;
                                jArr6 = jArr17;
                                wy2Var3 = wy2Var4;
                                jArr5 = jArr18;
                            }
                        } else {
                            eb0Var = null;
                            wy2Var2 = wy2Var5;
                        }
                        l51Var.l(wy2Var2.b);
                    } else if (iM2 != 1483304551) {
                        l51Var.k();
                        eb0Var = null;
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                    } else {
                        wy2Var2 = wy2Var5;
                        i7 = 0;
                        iM3 = be3Var2.m();
                        if ((iM3 & 1) != 0) {
                            iE = be3Var2.E();
                        } else {
                            iE = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jC = be3Var2.C();
                        } else {
                            jC = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i12 < 100) {
                                jArr2[i12] = be3Var2.A();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            be3Var2.O(4);
                        }
                        if (be3Var2.a() >= 24) {
                            be3Var2.O(11);
                            fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                            int iH14 = be3Var2.H();
                            int iH15 = be3Var2.H();
                            ly2VarA = ly2.a(iH14);
                            ly2VarA2 = ly2.a(iH15);
                            if (fIntBitsToFloat > 0.0f) {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            } else {
                                my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                            }
                            be3Var2.O(2);
                            int iD6 = be3Var2.D();
                            i9 = (16773120 & iD6) >> 12;
                            i8 = iD6 & 4095;
                        } else {
                            my2Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iE;
                        i10 = wy2Var2.b;
                        int i114 = wy2Var2.c;
                        i11 = wy2Var2.e;
                        int i214 = wy2Var2.f;
                        if (zg1Var.a != -1) {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        } else {
                            zg1Var.a = i9;
                            zg1Var.b = i8;
                        }
                        if (my2Var != null) {
                            qv2Var = new qv2(my2Var);
                        } else {
                            qv2Var = null;
                        }
                        this.l = qv2Var;
                        position2 = l51Var.getPosition();
                        if (l51Var.getLength() != -1) {
                            j6 = j5;
                        } else {
                            j6 = j5;
                        }
                        l51Var.l(wy2Var2.b);
                        if (iM2 == 1483304551) {
                            if (j6 != -1) {
                                jY2 = -9223372036854775807L;
                            } else {
                                jY2 = -9223372036854775807L;
                            }
                            if (jY2 == -9223372036854775807L) {
                                eb0Var = null;
                            } else {
                                eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                            }
                        } else {
                            length = l51Var.getLength();
                            if (j6 != -1) {
                                jY = -9223372036854775807L;
                            } else {
                                jY = -9223372036854775807L;
                            }
                            if (jY != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position2 + jC;
                                    j7 = jC - ((long) i10);
                                } else if (length != -1) {
                                    j7 = (length - position2) - ((long) i10);
                                } else {
                                    eb0Var = null;
                                }
                                long j116 = length;
                                long j117 = j7;
                                RoundingMode roundingMode6 = RoundingMode.HALF_UP;
                                eb0Var = new eb0(j116, position2 + ((long) i10), jz4.m(f35.a0(j117, 8000000L, jY, roundingMode6)), jz4.m(gh0.h(j117, j6, roundingMode6)), false, true);
                            } else {
                                eb0Var = null;
                            }
                        }
                    }
                    qv2Var2 = this.k;
                    position3 = l51Var.getPosition();
                    if (qv2Var2 == null) {
                        qw2Var = null;
                    } else {
                        pv2VarArr = qv2Var2.a;
                        length2 = pv2VarArr.length;
                        i13 = i7;
                        while (true) {
                            if (i13 < length2) {
                                pv2Var = null;
                                break;
                            }
                            pv2Var4 = pv2VarArr[i13];
                            if (pw2.class.isAssignableFrom(pv2Var4.getClass())) {
                                pv2Var = (pv2) pw2.class.cast(pv2Var4);
                                if (!zo3.n.apply(pv2Var)) {
                                    pv2Var = null;
                                }
                            } else {
                                pv2Var = null;
                            }
                            if (pv2Var != null) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        pw2Var = (pw2) pv2Var;
                        if (pw2Var == null) {
                            qw2Var = null;
                        } else {
                            iArr = pw2Var.e;
                            pv2VarArr2 = qv2Var2.a;
                            length3 = pv2VarArr2.length;
                            i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    pv2Var2 = null;
                                    break;
                                }
                                pv2Var3 = pv2VarArr2[i14];
                                if (ds4.class.isAssignableFrom(pv2Var3.getClass())) {
                                    pv2Var2 = (pv2) ds4.class.cast(pv2Var3);
                                    if (!((ds4) pv2Var2).a.equals("TLEN")) {
                                        pv2Var2 = null;
                                    }
                                } else {
                                    pv2Var2 = null;
                                }
                                if (pv2Var2 != null) {
                                    break;
                                    break;
                                }
                                i14++;
                            }
                            ds4Var = (ds4) pv2Var2;
                            if (ds4Var == null) {
                                jQ = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jQ = f35.Q(Long.parseLong((String) ds4Var.d.get(0)));
                            }
                            length4 = iArr.length;
                            int i215 = length4 + 1;
                            jArr3 = new long[i215];
                            jArr4 = new long[i215];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i15 = 1;
                            while (i15 <= length4) {
                                int i216 = i15 - 1;
                                long j118 = position3 + ((long) (pw2Var.c + iArr[i216]));
                                j8 += (long) (pw2Var.d + pw2Var.f[i216]);
                                jArr3[i15] = j118;
                                jArr4[i15] = j8;
                                i15++;
                                length4 = length4;
                                position3 = j118;
                            }
                            qw2Var = new qw2(jQ, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        p84Var = new p84(-9223372036854775807L);
                        be3Var = be3Var;
                        zg1Var = zg1Var;
                        wy2Var = wy2Var2;
                        z3 = true;
                        i18 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (qw2Var != null) {
                            eb0Var = qw2Var;
                        } else if (eb0Var == null) {
                            eb0Var = null;
                        }
                        if (eb0Var == null) {
                            int i217 = i7;
                            l51Var.n(be3Var.a, i217, 4);
                            be3Var.N(i217);
                            wy2Var2.a(be3Var.m());
                            wy2Var = wy2Var2;
                            z2 = true;
                            i18 = 0;
                            eb0Var = new eb0(l51Var.getLength(), l51Var.getPosition(), wy2Var2.e, wy2Var2.b, false, true);
                        } else {
                            wy2Var = wy2Var2;
                            z2 = true;
                            i18 = 0;
                        }
                        eb0Var.b();
                        eb0Var.b();
                        this.h.d(eb0Var.g());
                        p84Var = eb0Var;
                        z3 = z2;
                    }
                    this.r = p84Var;
                    this.g.w(p84Var);
                    qv2VarB = this.k;
                    qv2Var3 = this.l;
                    if (qv2VarB != null) {
                        if (qv2Var3 != null) {
                            qv2VarB = qv2VarB.b(qv2Var3);
                        }
                        qv2Var3 = qv2VarB;
                    }
                    sb1Var = new sb1();
                    sb1Var.l = lw2.m("audio/mpeg");
                    sb1Var.m = lw2.m((String) wy2Var.g);
                    sb1Var.n = 4096;
                    sb1Var.E = wy2Var.d;
                    sb1Var.F = wy2Var.c;
                    sb1Var.H = zg1Var.a;
                    sb1Var.I = zg1Var.b;
                    sb1Var.k = qv2Var3;
                    if (this.r.f() != -2147483647) {
                        sb1Var.h = this.r.f();
                    }
                    this.i.g(new tb1(sb1Var));
                    this.o = l51Var.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else if (i4 == 1) {
                    i5 = 13;
                }
                i6 = i5;
                j2 = -9223372036854775807L;
                if (be3Var2.c >= i6 + 4) {
                    be3Var2.N(i6);
                    iM2 = be3Var2.m();
                    if (iM2 != 1483304551) {
                        if (be3Var2.c >= 40) {
                            be3Var2.N(36);
                            if (be3Var2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (be3Var2.c >= 40) {
                    be3Var2.N(36);
                    if (be3Var2.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                zg1Var = this.d;
                if (iM2 == 1231971951) {
                    wy2Var2 = wy2Var5;
                    i7 = 0;
                    iM3 = be3Var2.m();
                    if ((iM3 & 1) != 0) {
                        iE = be3Var2.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jC = be3Var2.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i12 < 100) {
                            jArr2[i12] = be3Var2.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        be3Var2.O(4);
                    }
                    if (be3Var2.a() >= 24) {
                        be3Var2.O(11);
                        fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                        int iH16 = be3Var2.H();
                        int iH17 = be3Var2.H();
                        ly2VarA = ly2.a(iH16);
                        ly2VarA2 = ly2.a(iH17);
                        if (fIntBitsToFloat > 0.0f) {
                            my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                        } else {
                            my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                        }
                        be3Var2.O(2);
                        int iD7 = be3Var2.D();
                        i9 = (16773120 & iD7) >> 12;
                        i8 = iD7 & 4095;
                    } else {
                        my2Var = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iE;
                    i10 = wy2Var2.b;
                    int i115 = wy2Var2.c;
                    i11 = wy2Var2.e;
                    int i218 = wy2Var2.f;
                    if (zg1Var.a != -1) {
                        zg1Var.a = i9;
                        zg1Var.b = i8;
                    } else {
                        zg1Var.a = i9;
                        zg1Var.b = i8;
                    }
                    if (my2Var != null) {
                        qv2Var = new qv2(my2Var);
                    } else {
                        qv2Var = null;
                    }
                    this.l = qv2Var;
                    position2 = l51Var.getPosition();
                    if (l51Var.getLength() != -1) {
                        j6 = j5;
                    } else {
                        j6 = j5;
                    }
                    l51Var.l(wy2Var2.b);
                    if (iM2 == 1483304551) {
                        if (j6 != -1) {
                            jY2 = -9223372036854775807L;
                        } else {
                            jY2 = -9223372036854775807L;
                        }
                        if (jY2 == -9223372036854775807L) {
                            eb0Var = null;
                        } else {
                            eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                        }
                    } else {
                        length = l51Var.getLength();
                        if (j6 != -1) {
                            jY = -9223372036854775807L;
                        } else {
                            jY = -9223372036854775807L;
                        }
                        if (jY != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position2 + jC;
                                j7 = jC - ((long) i10);
                            } else if (length != -1) {
                                j7 = (length - position2) - ((long) i10);
                            } else {
                                eb0Var = null;
                            }
                            long j119 = length;
                            long j1110 = j7;
                            RoundingMode roundingMode7 = RoundingMode.HALF_UP;
                            eb0Var = new eb0(j119, position2 + ((long) i10), jz4.m(f35.a0(j1110, 8000000L, jY, roundingMode7)), jz4.m(gh0.h(j1110, j6, roundingMode7)), false, true);
                        } else {
                            eb0Var = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    length5 = l51Var.getLength();
                    position4 = l51Var.getPosition();
                    be3Var2.O(6);
                    int iM8 = be3Var2.m();
                    i7 = 0;
                    j9 = position4 + ((long) wy2Var5.b);
                    j10 = j9 + ((long) iM8);
                    iM4 = be3Var2.m();
                    if (iM4 <= 0) {
                        jY3 = f35.Y(wy2Var5.c, (((long) iM4) * ((long) wy2Var5.f)) - 1);
                        iH = be3Var2.H();
                        iH2 = be3Var2.H();
                        iH3 = be3Var2.H();
                        be3Var2.O(2);
                        jArr5 = new long[iH];
                        jArr6 = new long[iH];
                        wy2Var3 = wy2Var5;
                        j11 = position4 + ((long) wy2Var5.b);
                        i16 = 0;
                        while (true) {
                            if (i16 < iH) {
                                long[] jArr19 = jArr5;
                                long[] jArr110 = jArr6;
                                wy2 wy2Var9 = wy2Var3;
                                if (length5 != -1) {
                                    j12 = j10;
                                } else {
                                    j12 = j10;
                                }
                                if (j12 != j11) {
                                    l93.q0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j12 + ", " + j11 + "\nSeeking will be inaccurate.");
                                    jMax = Math.max(j12, j11);
                                } else {
                                    jMax = j12;
                                }
                                wy2Var2 = wy2Var9;
                                eb0Var = new l35(jArr19, jArr110, jY3, j9, jMax, wy2Var2.e);
                                break;
                            }
                            long[] jArr111 = jArr6;
                            wy2Var4 = wy2Var3;
                            int i219 = i16;
                            long[] jArr112 = jArr5;
                            jArr112[i219] = (((long) i16) * jY3) / ((long) iH);
                            jArr111[i219] = j11;
                            if (iH3 != 1) {
                                iA = be3Var2.A();
                            } else if (iH3 != 2) {
                                iA = be3Var2.H();
                            } else if (iH3 != 3) {
                                iA = be3Var2.D();
                            } else {
                                if (iH3 != 4) {
                                    eb0Var = null;
                                    wy2Var2 = wy2Var4;
                                    break;
                                }
                                iA = be3Var2.E();
                            }
                            j11 += ((long) iA) * ((long) iH2);
                            i16 = i219 + 1;
                            jArr6 = jArr111;
                            wy2Var3 = wy2Var4;
                            jArr5 = jArr112;
                        }
                    } else {
                        eb0Var = null;
                        wy2Var2 = wy2Var5;
                    }
                    l51Var.l(wy2Var2.b);
                } else if (iM2 != 1483304551) {
                    l51Var.k();
                    eb0Var = null;
                    wy2Var2 = wy2Var5;
                    i7 = 0;
                } else {
                    wy2Var2 = wy2Var5;
                    i7 = 0;
                    iM3 = be3Var2.m();
                    if ((iM3 & 1) != 0) {
                        iE = be3Var2.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jC = be3Var2.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i12 < 100) {
                            jArr2[i12] = be3Var2.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        be3Var2.O(4);
                    }
                    if (be3Var2.a() >= 24) {
                        be3Var2.O(11);
                        fIntBitsToFloat = Float.intBitsToFloat(be3Var2.m());
                        int iH18 = be3Var2.H();
                        int iH19 = be3Var2.H();
                        ly2VarA = ly2.a(iH18);
                        ly2VarA2 = ly2.a(iH19);
                        if (fIntBitsToFloat > 0.0f) {
                            my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                        } else {
                            my2Var = new my2(fIntBitsToFloat, ly2VarA, ly2VarA2);
                        }
                        be3Var2.O(2);
                        int iD8 = be3Var2.D();
                        i9 = (16773120 & iD8) >> 12;
                        i8 = iD8 & 4095;
                    } else {
                        my2Var = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iE;
                    i10 = wy2Var2.b;
                    int i116 = wy2Var2.c;
                    i11 = wy2Var2.e;
                    int i2110 = wy2Var2.f;
                    if (zg1Var.a != -1) {
                        zg1Var.a = i9;
                        zg1Var.b = i8;
                    } else {
                        zg1Var.a = i9;
                        zg1Var.b = i8;
                    }
                    if (my2Var != null) {
                        qv2Var = new qv2(my2Var);
                    } else {
                        qv2Var = null;
                    }
                    this.l = qv2Var;
                    position2 = l51Var.getPosition();
                    if (l51Var.getLength() != -1) {
                        j6 = j5;
                    } else {
                        j6 = j5;
                    }
                    l51Var.l(wy2Var2.b);
                    if (iM2 == 1483304551) {
                        if (j6 != -1) {
                            jY2 = -9223372036854775807L;
                        } else {
                            jY2 = -9223372036854775807L;
                        }
                        if (jY2 == -9223372036854775807L) {
                            eb0Var = null;
                        } else {
                            eb0Var = new ge5(position2, i10, jY2, i11, jC, jArr);
                        }
                    } else {
                        length = l51Var.getLength();
                        if (j6 != -1) {
                            jY = -9223372036854775807L;
                        } else {
                            jY = -9223372036854775807L;
                        }
                        if (jY != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position2 + jC;
                                j7 = jC - ((long) i10);
                            } else if (length != -1) {
                                j7 = (length - position2) - ((long) i10);
                            } else {
                                eb0Var = null;
                            }
                            long j1111 = length;
                            long j1112 = j7;
                            RoundingMode roundingMode8 = RoundingMode.HALF_UP;
                            eb0Var = new eb0(j1111, position2 + ((long) i10), jz4.m(f35.a0(j1112, 8000000L, jY, roundingMode8)), jz4.m(gh0.h(j1112, j6, roundingMode8)), false, true);
                        } else {
                            eb0Var = null;
                        }
                    }
                }
                qv2Var2 = this.k;
                position3 = l51Var.getPosition();
                if (qv2Var2 == null) {
                    qw2Var = null;
                } else {
                    pv2VarArr = qv2Var2.a;
                    length2 = pv2VarArr.length;
                    i13 = i7;
                    while (true) {
                        if (i13 < length2) {
                            pv2Var = null;
                            break;
                        }
                        pv2Var4 = pv2VarArr[i13];
                        if (pw2.class.isAssignableFrom(pv2Var4.getClass())) {
                            pv2Var = (pv2) pw2.class.cast(pv2Var4);
                            if (!zo3.n.apply(pv2Var)) {
                                pv2Var = null;
                            }
                        } else {
                            pv2Var = null;
                        }
                        if (pv2Var != null) {
                            break;
                            break;
                        }
                        i13++;
                    }
                    pw2Var = (pw2) pv2Var;
                    if (pw2Var == null) {
                        qw2Var = null;
                    } else {
                        iArr = pw2Var.e;
                        pv2VarArr2 = qv2Var2.a;
                        length3 = pv2VarArr2.length;
                        i14 = 0;
                        while (true) {
                            if (i14 < length3) {
                                pv2Var2 = null;
                                break;
                            }
                            pv2Var3 = pv2VarArr2[i14];
                            if (ds4.class.isAssignableFrom(pv2Var3.getClass())) {
                                pv2Var2 = (pv2) ds4.class.cast(pv2Var3);
                                if (!((ds4) pv2Var2).a.equals("TLEN")) {
                                    pv2Var2 = null;
                                }
                            } else {
                                pv2Var2 = null;
                            }
                            if (pv2Var2 != null) {
                                break;
                                break;
                            }
                            i14++;
                        }
                        ds4Var = (ds4) pv2Var2;
                        if (ds4Var == null) {
                            jQ = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jQ = f35.Q(Long.parseLong((String) ds4Var.d.get(0)));
                        }
                        length4 = iArr.length;
                        int i2111 = length4 + 1;
                        jArr3 = new long[i2111];
                        jArr4 = new long[i2111];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j8 = 0;
                        i15 = 1;
                        while (i15 <= length4) {
                            int i2112 = i15 - 1;
                            long j1113 = position3 + ((long) (pw2Var.c + iArr[i2112]));
                            j8 += (long) (pw2Var.d + pw2Var.f[i2112]);
                            jArr3[i15] = j1113;
                            jArr4[i15] = j8;
                            i15++;
                            length4 = length4;
                            position3 = j1113;
                        }
                        qw2Var = new qw2(jQ, jArr3, jArr4);
                    }
                }
                if (this.s) {
                    p84Var = new p84(-9223372036854775807L);
                    be3Var = be3Var;
                    zg1Var = zg1Var;
                    wy2Var = wy2Var2;
                    z3 = true;
                    i18 = 0;
                } else {
                    j2 = -9223372036854775807L;
                    if (qw2Var != null) {
                        eb0Var = qw2Var;
                    } else if (eb0Var == null) {
                        eb0Var = null;
                    }
                    if (eb0Var == null) {
                        int i2113 = i7;
                        l51Var.n(be3Var.a, i2113, 4);
                        be3Var.N(i2113);
                        wy2Var2.a(be3Var.m());
                        wy2Var = wy2Var2;
                        z2 = true;
                        i18 = 0;
                        eb0Var = new eb0(l51Var.getLength(), l51Var.getPosition(), wy2Var2.e, wy2Var2.b, false, true);
                    } else {
                        wy2Var = wy2Var2;
                        z2 = true;
                        i18 = 0;
                    }
                    eb0Var.b();
                    eb0Var.b();
                    this.h.d(eb0Var.g());
                    p84Var = eb0Var;
                    z3 = z2;
                }
                this.r = p84Var;
                this.g.w(p84Var);
                qv2VarB = this.k;
                qv2Var3 = this.l;
                if (qv2VarB != null) {
                    if (qv2Var3 != null) {
                        qv2VarB = qv2VarB.b(qv2Var3);
                    }
                    qv2Var3 = qv2VarB;
                }
                sb1Var = new sb1();
                sb1Var.l = lw2.m("audio/mpeg");
                sb1Var.m = lw2.m((String) wy2Var.g);
                sb1Var.n = 4096;
                sb1Var.E = wy2Var.d;
                sb1Var.F = wy2Var.c;
                sb1Var.H = zg1Var.a;
                sb1Var.I = zg1Var.b;
                sb1Var.k = qv2Var3;
                if (this.r.f() != -2147483647) {
                    sb1Var.h = this.r.f();
                }
                this.i.g(new tb1(sb1Var));
                this.o = l51Var.getPosition();
                j3 = 0;
                r4 = z3;
            } else {
                wy2Var = wy2Var5;
                be3Var = be3Var;
                z = true;
                th = null;
                j = 1000000;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (this.o != 0) {
                    position = l51Var.getPosition();
                    j4 = this.o;
                    if (position < j4) {
                        r4 = z;
                        r4 = z;
                        l51Var.l((int) (j4 - position));
                        r4 = z;
                    }
                }
            }
            r4 = z;
            r4 = z;
            r4 = z;
            if (this.q == 0) {
                l51Var.k();
                if (h(l51Var)) {
                    i = -1;
                    i18 = -1;
                } else {
                    be3Var.N(i18);
                    iM = be3Var.m();
                    if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                    }
                    l51Var.l(r4);
                    this.j = i18;
                    i = -1;
                }
            } else {
                iF = this.i.f(l51Var, this.q, r4);
                if (iF == -1) {
                    i = -1;
                    i18 = -1;
                } else {
                    i2 = this.q - iF;
                    this.q = i2;
                    if (i2 <= 0) {
                        this.i.a(this.m + ((this.n * j) / ((long) wy2Var.c)), 1, wy2Var.b, 0, null);
                        this.n += (long) wy2Var.f;
                        this.q = i18;
                    }
                    i = -1;
                }
            }
        }
        if (i18 == i) {
            q84 q84Var2 = this.r;
            if (q84Var2 instanceof vx1) {
                if (q84Var2.g() != ((this.n * j) / ((long) wy2Var.c)) + this.m) {
                    ((vx1) this.r).getClass();
                    throw th;
                }
            }
        }
        return i18;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return i(l51Var, true);
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        if (this.r instanceof vx1) {
            throw null;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.g = m51Var;
        wv4 wv4VarT = m51Var.t(0, 1);
        this.h = wv4VarT;
        this.i = wv4VarT;
        this.g.p();
    }

    public final void g() {
        q84 q84Var = this.r;
        if ((q84Var instanceof eb0) && ((eb0) q84Var).b()) {
            long j = this.p;
            if (j == -1 || j == this.r.a()) {
                return;
            }
            eb0 eb0Var = (eb0) this.r;
            this.r = new eb0(this.p, eb0Var.i, eb0Var.j, eb0Var.k, eb0Var.l, false);
            m51 m51Var = this.g;
            m51Var.getClass();
            m51Var.w(this.r);
            wv4 wv4Var = this.h;
            wv4Var.getClass();
            wv4Var.d(this.r.g());
        }
    }

    public final boolean h(l51 l51Var) {
        q84 q84Var = this.r;
        if (q84Var != null) {
            long jA = q84Var.a();
            if (jA == -1 || l51Var.f() <= jA - 4) {
            }
            return true;
        }
        try {
            return !l51Var.e(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean i(l51 l51Var, boolean z) throws EOFException {
        int iF;
        int i;
        int iV;
        l51Var.k();
        if (l51Var.getPosition() == 0) {
            qv2 qv2VarA = this.e.a(l51Var, null, 131072);
            this.k = qv2VarA;
            if (qv2VarA != null) {
                this.d.b(qv2VarA);
            }
            iF = (int) l51Var.f();
            if (!z) {
                l51Var.l(iF);
            }
            i = 0;
        } else {
            iF = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (h(l51Var)) {
                if (i2 > 0) {
                    break;
                }
                g();
                throw new EOFException();
            }
            be3 be3Var = this.b;
            be3Var.N(0);
            int iM = be3Var.m();
            if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iV = jz4.v(iM)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iM);
                    i = iM;
                }
                l51Var.g(iV - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    g();
                    throw new EOFException();
                }
                if (z) {
                    l51Var.k();
                    l51Var.g(iF + i4);
                } else {
                    l51Var.l(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            l51Var.l(iF + i3);
        } else {
            l51Var.k();
        }
        this.j = i;
        return true;
    }

    public ky2(int i) {
        this(-9223372036854775807L);
    }
}
