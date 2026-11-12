package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jj4 {
    public static final long a = su3.v(14);
    public static final long b = su3.v(0);
    public static final long c = x40.f;
    public static final as4 d;

    static {
        long j = x40.b;
        d = j != 16 ? new u50(j) : rv2.F;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0181  */
    /* JADX WARN: Code duplicated, block: B:110:0x0186  */
    /* JADX WARN: Code duplicated, block: B:111:0x0189  */
    /* JADX WARN: Code duplicated, block: B:113:0x018d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:116:0x0194  */
    /* JADX WARN: Code duplicated, block: B:118:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x019c  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r19
  0x0049: PHI (r19v6 rv2) = 
  (r19v0 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
  (r19v7 rv2)
 binds: [B:6:0x0034, B:35:0x0090, B:44:0x00b0, B:41:0x00a6, B:38:0x009c, B:33:0x0084, B:30:0x007a, B:25:0x006b, B:22:0x0065, B:19:0x005b, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    public static final ij4 a(ij4 ij4Var, long j, uo uoVar, float f, long j2, gb1 gb1Var, eb1 eb1Var, fb1 fb1Var, vk0 vk0Var, String str, long j3, hr hrVar, bs4 bs4Var, vd2 vd2Var, long j4, sr4 sr4Var, xb4 xb4Var, q05 q05Var) {
        rv2 rv2Var;
        hr hrVar2;
        q05 q05Var2;
        xb4 xb4Var2;
        long j5;
        as4 u50Var;
        as4 as4Var;
        boolean z;
        long j6;
        gb1 gb1Var2;
        bs4 bs4Var2;
        vd2 vd2Var2;
        sr4 sr4Var2;
        q05 q05Var3;
        long jM;
        eb1 eb1Var2 = eb1Var;
        fb1 fb1Var2 = fb1Var;
        vk0 vk0Var2 = vk0Var;
        String str2 = str;
        long j7 = j3;
        rv2 rv2Var2 = rv2.F;
        ct4[] ct4VarArr = bt4.b;
        long j8 = j2 & 1095216660480L;
        if (j8 != 0) {
            rv2Var = rv2Var2;
            if (!bt4.a(j2, ij4Var.b)) {
                hrVar2 = hrVar;
                j5 = j4;
                xb4Var2 = xb4Var;
                q05Var2 = q05Var;
            }
            if (uoVar != null) {
                if (uoVar instanceof zh4) {
                    jM = rr2.M(((zh4) uoVar).u, f);
                    if (jM != 16) {
                        u50Var = new u50(jM);
                    } else {
                        u50Var = rv2Var;
                    }
                } else {
                    if (uoVar instanceof pv) {
                        er1.n();
                        return null;
                    }
                    u50Var = new qv((pv) uoVar, f);
                }
            } else if (j != 16) {
                u50Var = new u50(j);
            } else {
                u50Var = rv2Var;
            }
            as4Var = ij4Var.a;
            as4Var.getClass();
            z = u50Var instanceof qv;
            if (!z && (as4Var instanceof qv)) {
                qv qvVar = (qv) u50Var;
                pv pvVar = qvVar.n;
                float f2 = qvVar.o;
                if (Float.isNaN(f2)) {
                    f2 = ((qv) as4Var).o;
                }
                u50Var = new qv(pvVar, f2);
            } else if ((z || (as4Var instanceof qv)) && ((!z && (as4Var instanceof qv)) || u50Var.equals(rv2Var))) {
            }
            if (vk0Var2 == null) {
                vk0Var2 = ij4Var.f;
            }
            if (j8 == 0) {
                j6 = ij4Var.b;
            } else {
                j6 = j2;
            }
            if (gb1Var == null) {
                gb1Var2 = ij4Var.c;
            } else {
                gb1Var2 = gb1Var;
            }
            if (eb1Var2 == null) {
                eb1Var2 = ij4Var.d;
            }
            if (fb1Var2 == null) {
                fb1Var2 = ij4Var.e;
            }
            if (str2 == null) {
                str2 = ij4Var.g;
            }
            if ((j7 & 1095216660480L) == 0) {
                j7 = ij4Var.h;
            }
            if (hrVar2 == null) {
                hrVar2 = ij4Var.i;
            }
            long j9 = j6;
            if (bs4Var == null) {
                bs4Var2 = ij4Var.j;
            } else {
                bs4Var2 = bs4Var;
            }
            if (vd2Var == null) {
                vd2Var2 = ij4Var.k;
            } else {
                vd2Var2 = vd2Var;
            }
            if (j5 == 16) {
                j5 = ij4Var.l;
            }
            bs4 bs4Var3 = bs4Var2;
            if (sr4Var == null) {
                sr4Var2 = ij4Var.m;
            } else {
                sr4Var2 = sr4Var;
            }
            if (xb4Var2 == null) {
                xb4Var2 = ij4Var.n;
            }
            if (q05Var2 == null) {
                q05Var3 = ij4Var.o;
            } else {
                q05Var3 = q05Var2;
            }
            return new ij4(u50Var, j9, gb1Var2, eb1Var2, fb1Var2, vk0Var2, str2, j7, hrVar2, bs4Var3, vd2Var2, j5, sr4Var2, xb4Var2, q05Var3);
        }
        rv2Var = rv2Var2;
        if ((uoVar != null || j == 16 || x40.c(j, ij4Var.a.c())) && ((eb1Var2 == null || eb1Var2.equals(ij4Var.d)) && ((gb1Var == null || gb1Var.equals(ij4Var.c)) && ((vk0Var2 == null || vk0Var2 == ij4Var.f) && (((j7 & 1095216660480L) == 0 || bt4.a(j7, ij4Var.h)) && ((sr4Var == null || sr4Var.equals(ij4Var.m)) && h12.c(uoVar, ij4Var.a.f()) && ((uoVar == null || f == ij4Var.a.b()) && ((fb1Var2 == null || fb1Var2.equals(ij4Var.e)) && (str2 == null || str2.equals(ij4Var.g)))))))))) {
            if (hrVar != null) {
                hrVar2 = hrVar;
                if (hrVar2.equals(ij4Var.i)) {
                }
                if (uoVar != null) {
                    if (uoVar instanceof zh4) {
                        jM = rr2.M(((zh4) uoVar).u, f);
                        if (jM != 16) {
                            u50Var = new u50(jM);
                        } else {
                            u50Var = rv2Var;
                        }
                    } else {
                        if (uoVar instanceof pv) {
                            er1.n();
                            return null;
                        }
                        u50Var = new qv((pv) uoVar, f);
                    }
                } else if (j != 16) {
                    u50Var = new u50(j);
                } else {
                    u50Var = rv2Var;
                }
                as4Var = ij4Var.a;
                as4Var.getClass();
                z = u50Var instanceof qv;
                if (!z) {
                    u50Var = z ? as4Var : as4Var;
                } else if (z) {
                }
                if (vk0Var2 == null) {
                    vk0Var2 = ij4Var.f;
                }
                if (j8 == 0) {
                    j6 = ij4Var.b;
                } else {
                    j6 = j2;
                }
                if (gb1Var == null) {
                    gb1Var2 = ij4Var.c;
                } else {
                    gb1Var2 = gb1Var;
                }
                if (eb1Var2 == null) {
                    eb1Var2 = ij4Var.d;
                }
                if (fb1Var2 == null) {
                    fb1Var2 = ij4Var.e;
                }
                if (str2 == null) {
                    str2 = ij4Var.g;
                }
                if ((j7 & 1095216660480L) == 0) {
                    j7 = ij4Var.h;
                }
                if (hrVar2 == null) {
                    hrVar2 = ij4Var.i;
                }
                long j10 = j6;
                if (bs4Var == null) {
                    bs4Var2 = ij4Var.j;
                } else {
                    bs4Var2 = bs4Var;
                }
                if (vd2Var == null) {
                    vd2Var2 = ij4Var.k;
                } else {
                    vd2Var2 = vd2Var;
                }
                if (j5 == 16) {
                    j5 = ij4Var.l;
                }
                bs4 bs4Var4 = bs4Var2;
                if (sr4Var == null) {
                    sr4Var2 = ij4Var.m;
                } else {
                    sr4Var2 = sr4Var;
                }
                if (xb4Var2 == null) {
                    xb4Var2 = ij4Var.n;
                }
                if (q05Var2 == null) {
                    q05Var3 = ij4Var.o;
                } else {
                    q05Var3 = q05Var2;
                }
                return new ij4(u50Var, j10, gb1Var2, eb1Var2, fb1Var2, vk0Var2, str2, j7, hrVar2, bs4Var4, vd2Var2, j5, sr4Var2, xb4Var2, q05Var3);
            }
            hrVar2 = hrVar;
            if (bs4Var == null || bs4Var.equals(ij4Var.j)) {
                if (vd2Var == null || vd2Var.equals(ij4Var.k)) {
                    j5 = j4;
                    if (j5 == 16 || x40.c(j5, ij4Var.l)) {
                        xb4Var2 = xb4Var;
                        if (xb4Var2 == null || xb4Var2.equals(ij4Var.n)) {
                            q05Var2 = q05Var;
                            if (q05Var2 == null || q05Var2.equals(ij4Var.o)) {
                                return ij4Var;
                            }
                        }
                    }
                    q05Var2 = q05Var;
                }
                xb4Var2 = xb4Var;
                q05Var2 = q05Var;
            }
            if (uoVar != null) {
                if (uoVar instanceof zh4) {
                    jM = rr2.M(((zh4) uoVar).u, f);
                    if (jM != 16) {
                        u50Var = new u50(jM);
                    } else {
                        u50Var = rv2Var;
                    }
                } else {
                    if (uoVar instanceof pv) {
                        er1.n();
                        return null;
                    }
                    u50Var = new qv((pv) uoVar, f);
                }
            } else if (j != 16) {
                u50Var = new u50(j);
            } else {
                u50Var = rv2Var;
            }
            as4Var = ij4Var.a;
            as4Var.getClass();
            z = u50Var instanceof qv;
            if (!z) {
                if (z) {
                }
            } else if (z) {
            }
            if (vk0Var2 == null) {
                vk0Var2 = ij4Var.f;
            }
            if (j8 == 0) {
                j6 = ij4Var.b;
            } else {
                j6 = j2;
            }
            if (gb1Var == null) {
                gb1Var2 = ij4Var.c;
            } else {
                gb1Var2 = gb1Var;
            }
            if (eb1Var2 == null) {
                eb1Var2 = ij4Var.d;
            }
            if (fb1Var2 == null) {
                fb1Var2 = ij4Var.e;
            }
            if (str2 == null) {
                str2 = ij4Var.g;
            }
            if ((j7 & 1095216660480L) == 0) {
                j7 = ij4Var.h;
            }
            if (hrVar2 == null) {
                hrVar2 = ij4Var.i;
            }
            long j11 = j6;
            if (bs4Var == null) {
                bs4Var2 = ij4Var.j;
            } else {
                bs4Var2 = bs4Var;
            }
            if (vd2Var == null) {
                vd2Var2 = ij4Var.k;
            } else {
                vd2Var2 = vd2Var;
            }
            if (j5 == 16) {
                j5 = ij4Var.l;
            }
            bs4 bs4Var5 = bs4Var2;
            if (sr4Var == null) {
                sr4Var2 = ij4Var.m;
            } else {
                sr4Var2 = sr4Var;
            }
            if (xb4Var2 == null) {
                xb4Var2 = ij4Var.n;
            }
            if (q05Var2 == null) {
                q05Var3 = ij4Var.o;
            } else {
                q05Var3 = q05Var2;
            }
            return new ij4(u50Var, j11, gb1Var2, eb1Var2, fb1Var2, vk0Var2, str2, j7, hrVar2, bs4Var5, vd2Var2, j5, sr4Var2, xb4Var2, q05Var3);
        }
        hrVar2 = hrVar;
        j5 = j4;
        xb4Var2 = xb4Var;
        q05Var2 = q05Var;
        if (uoVar != null) {
            if (uoVar instanceof zh4) {
                jM = rr2.M(((zh4) uoVar).u, f);
                if (jM != 16) {
                    u50Var = new u50(jM);
                } else {
                    u50Var = rv2Var;
                }
            } else {
                if (uoVar instanceof pv) {
                    er1.n();
                    return null;
                }
                u50Var = new qv((pv) uoVar, f);
            }
        } else if (j != 16) {
            u50Var = new u50(j);
        } else {
            u50Var = rv2Var;
        }
        as4Var = ij4Var.a;
        as4Var.getClass();
        z = u50Var instanceof qv;
        if (!z) {
            if (z) {
            }
        } else if (z) {
        }
        if (vk0Var2 == null) {
            vk0Var2 = ij4Var.f;
        }
        if (j8 == 0) {
            j6 = ij4Var.b;
        } else {
            j6 = j2;
        }
        if (gb1Var == null) {
            gb1Var2 = ij4Var.c;
        } else {
            gb1Var2 = gb1Var;
        }
        if (eb1Var2 == null) {
            eb1Var2 = ij4Var.d;
        }
        if (fb1Var2 == null) {
            fb1Var2 = ij4Var.e;
        }
        if (str2 == null) {
            str2 = ij4Var.g;
        }
        if ((j7 & 1095216660480L) == 0) {
            j7 = ij4Var.h;
        }
        if (hrVar2 == null) {
            hrVar2 = ij4Var.i;
        }
        long j12 = j6;
        if (bs4Var == null) {
            bs4Var2 = ij4Var.j;
        } else {
            bs4Var2 = bs4Var;
        }
        if (vd2Var == null) {
            vd2Var2 = ij4Var.k;
        } else {
            vd2Var2 = vd2Var;
        }
        if (j5 == 16) {
            j5 = ij4Var.l;
        }
        bs4 bs4Var6 = bs4Var2;
        if (sr4Var == null) {
            sr4Var2 = ij4Var.m;
        } else {
            sr4Var2 = sr4Var;
        }
        if (xb4Var2 == null) {
            xb4Var2 = ij4Var.n;
        }
        if (q05Var2 == null) {
            q05Var3 = ij4Var.o;
        } else {
            q05Var3 = q05Var2;
        }
        return new ij4(u50Var, j12, gb1Var2, eb1Var2, fb1Var2, vk0Var2, str2, j7, hrVar2, bs4Var6, vd2Var2, j5, sr4Var2, xb4Var2, q05Var3);
    }
}
