package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh4 {
    public final if1 a;
    public Object b;
    public p03 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final w03 e = te5.i();
    public final w03 f = new w03();
    public final x03 g = new x03();
    public final f13 h = new f13(new dp0[16]);
    public final qg1 i = new qg1(1, this);
    public final w03 l = te5.i();
    public final HashMap m = new HashMap();

    public sh4(if1 if1Var) {
        this.a = if1Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 167801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh4.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, p03 p03Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = p03Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = p03Var.c[iC];
        }
        p03Var.b[iC] = obj;
        p03Var.c[iC] = i;
        if ((obj instanceof dp0) && i2 != i) {
            cp0 cp0VarH = ((dp0) obj).h();
            this.m.put(obj, cp0VarH.f);
            p03 p03Var2 = cp0VarH.e;
            w03 w03Var = this.l;
            te5.J(w03Var, obj);
            Object[] objArr = p03Var2.b;
            long[] jArr = p03Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                rl4 rl4Var = (rl4) objArr[(i3 << 3) + i5];
                                if (rl4Var instanceof sl4) {
                                    ((sl4) rl4Var).f(2);
                                }
                                te5.b(w03Var, rl4Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof sl4) {
                ((sl4) obj).f(2);
            }
            te5.b(this.e, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    public final void c(k52 k52Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        Object obj;
        long j3;
        Object obj2;
        w03 w03Var = this.f;
        long[] jArr3 = w03Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj3 = w03Var.b[i6];
                        j2 = j5;
                        p03 p03Var = (p03) w03Var.c[i6];
                        Boolean bool = (Boolean) k52Var.invoke(obj3);
                        if (bool.booleanValue()) {
                            Object[] objArr = p03Var.b;
                            int[] iArr = p03Var.c;
                            long[] jArr4 = p03Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj4 = objArr[i11];
                                                int i12 = iArr[i11];
                                                w03 w03Var2 = this.e;
                                                te5.I(w03Var2, obj4, obj3);
                                                obj2 = obj3;
                                                if ((obj4 instanceof dp0) && !w03Var2.c(obj4)) {
                                                    te5.J(this.l, obj4);
                                                    this.m.remove(obj4);
                                                }
                                            } else {
                                                j3 = j6;
                                                obj2 = obj3;
                                            }
                                            j6 = j3 >> i7;
                                            i10++;
                                            obj3 = obj2;
                                        }
                                        obj = obj3;
                                        if (i9 != i7) {
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr4 = jArr5;
                                    obj3 = obj;
                                    i7 = 8;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                        }
                        if (bool.booleanValue()) {
                            w03Var.k(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
