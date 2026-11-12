package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na extends ig1 implements gf1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.n = i3;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1 A[LOOP:0: B:31:0x00bd->B:42:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7 A[LOOP:4: B:82:0x0178->B:93:0x01a7, LOOP_END] */
    @Override // defpackage.gf1
    public final Object invoke() throws Exception {
        ContentCaptureSession contentCaptureSessionA;
        w12 w12Var;
        int i = this.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                View view = (View) this.receiver;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    p3.g(view);
                }
                if (i2 < 29 || (contentCaptureSessionA = yh.a(view)) == null) {
                    return null;
                }
                return new gp3(5, contentCaptureSessionA, view);
            case 1:
                s91 s91Var = (s91) this.receiver;
                x03 x03Var = s91Var.c;
                x03 x03Var2 = s91Var.d;
                ey eyVar = s91Var.a;
                ba1 ba1VarF = eyVar.f();
                if (ba1VarF == null) {
                    Object[] objArr = x03Var2.b;
                    long[] jArr = x03Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((xo) objArr[(i3 << 3) + i5]).r0();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                } else if (ba1VarF.A) {
                    if (x03Var.c(ba1VarF)) {
                        ba1VarF.w0();
                    }
                    ba1VarF.v0();
                    if (!ba1VarF.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    cx2 cx2Var = ba1VarF.n;
                    c72 c72VarO = j51.O(ba1VarF);
                    int i6 = 0;
                    while (c72VarO != null) {
                        if ((((cx2) c72VarO.Q.g).q & 5120) != 0) {
                            while (cx2Var != null) {
                                int i7 = cx2Var.p;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((cx2Var instanceof xo) && x03Var2.c(cx2Var)) {
                                        if (i6 <= 1) {
                                            ((xo) cx2Var).r0();
                                            throw null;
                                        }
                                        ((xo) cx2Var).r0();
                                        throw null;
                                    }
                                }
                                cx2Var = cx2Var.r;
                            }
                        }
                        c72VarO = c72VarO.t();
                        cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
                    }
                    Object[] objArr2 = x03Var2.b;
                    long[] jArr2 = x03Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((xo) objArr2[(i8 << 3) + i10]).r0();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length2) {
                                        i8++;
                                    }
                                }
                            } else if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (eyVar.f() == null || ((ba1) eyVar.c).v0() == z91.p) {
                    eyVar.c();
                }
                x03Var.b();
                x03Var2.b();
                s91Var.e = false;
                return j15Var;
            case 2:
                return Boolean.valueOf(((ea1) this.receiver).I.y0(7));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((b00) this.receiver).getClass();
                return b00.a();
            case 4:
                ((rr1) this.receiver).getClass();
                return Boolean.valueOf(rr1.e().contains("typed_favorites_v1"));
            case 5:
                ((rr1) this.receiver).getClass();
                return Boolean.valueOf(rr1.e().contains("favorite_compensation_chains_v1"));
            case 6:
                ((b00) this.receiver).getClass();
                return b00.a();
            case 7:
                ((rr1) this.receiver).getClass();
                return Boolean.valueOf(rr1.e().contains("listening_checkpoints_v1"));
            default:
                s24 s24Var = (s24) this.receiver;
                td0 td0Var = s24Var.a;
                if (td0Var == null) {
                    h12.Q("coroutineScope");
                    throw null;
                }
                te5.g(td0Var, null);
                s24Var.i();
                p24 p24Var = s24Var.d;
                if (p24Var != null) {
                    p24Var.f.close();
                    return j15Var;
                }
                h12.Q("connectionManager");
                throw null;
        }
    }
}
