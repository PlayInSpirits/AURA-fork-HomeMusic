package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p35 {
    public static final hd5 a;
    public static final hd5 b;
    public static final hd5 c;
    public static final hd5 d;
    public static final hd5 e;
    public static final hd5 f;
    public static final hd5 g;
    public static final hd5 h;
    public static final hd5 i;

    static {
        final int i2 = 11;
        int i3 = 21;
        a = new hd5(i3, new o54(24), new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        b = new hd5(i3, new o54(25), new o54(26));
        c = new hd5(i3, new o54(27), new o54(28));
        final int i4 = 0;
        d = new hd5(i3, new o54(29), new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        final int i5 = 1;
        final int i6 = 2;
        e = new hd5(i3, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        }, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        final int i7 = 3;
        final int i8 = 4;
        f = new hd5(i3, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        }, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        final int i9 = 5;
        final int i10 = 6;
        g = new hd5(i3, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        }, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        final int i11 = 7;
        final int i12 = 8;
        h = new hd5(i3, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        }, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
        final int i13 = 9;
        final int i14 = 10;
        i = new hd5(i3, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        }, new if1() { // from class: o35
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        ae aeVar = (ae) obj;
                        return new mu0((((long) Float.floatToRawIntBits(aeVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar.a)) << 32));
                    case 1:
                        qf4 qf4Var = (qf4) obj;
                        return new ae(Float.intBitsToFloat((int) (qf4Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & qf4Var.a)));
                    case 2:
                        ae aeVar2 = (ae) obj;
                        return new qf4((((long) Float.floatToRawIntBits(aeVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar2.a)) << 32));
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        g83 g83Var = (g83) obj;
                        return new ae(Float.intBitsToFloat((int) (g83Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & g83Var.a)));
                    case 4:
                        ae aeVar3 = (ae) obj;
                        return new g83((((long) Float.floatToRawIntBits(aeVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(aeVar3.a)) << 32));
                    case 5:
                        long j = ((g02) obj).a;
                        return new ae((int) (j >> 32), (int) (4294967295L & j));
                    case 6:
                        ae aeVar4 = (ae) obj;
                        return new g02((((long) Math.round(aeVar4.b)) & 4294967295L) | (((long) Math.round(aeVar4.a)) << 32));
                    case 7:
                        long j2 = ((n02) obj).a;
                        return new ae((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 8:
                        ae aeVar5 = (ae) obj;
                        int iRound = Math.round(aeVar5.a);
                        if (iRound < 0) {
                            iRound = 0;
                        }
                        int iRound2 = Math.round(aeVar5.b);
                        return new n02((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
                    case 9:
                        wv3 wv3Var = (wv3) obj;
                        return new be(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
                    case 10:
                        be beVar = (be) obj;
                        return new wv3(beVar.a, beVar.b, beVar.c, beVar.d);
                    case 11:
                        return Float.valueOf(((zd) obj).a);
                    default:
                        bc5 bc5Var = (bc5) obj;
                        bc5Var.getClass();
                        return bc5Var;
                }
            }
        });
    }
}
