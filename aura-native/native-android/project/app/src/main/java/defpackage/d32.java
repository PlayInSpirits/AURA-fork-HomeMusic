package defpackage;

import androidx.media3.common.ParserException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d32 implements k51 {
    public m51 b;
    public int c;
    public int d;
    public int e;
    public xx2 g;
    public l51 h;
    public e20 i;
    public sy2 j;
    public final be3 a = new be3(2);
    public long f = -1;

    @Override // defpackage.k51
    public final void a() {
        sy2 sy2Var = this.j;
        if (sy2Var != null) {
            sy2Var.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        String strV;
        e20 e20VarY;
        gy3 gy3Var;
        int i;
        xx2 xx2Var;
        long j;
        int i2 = this.c;
        long j2 = -1;
        be3 be3Var = this.a;
        if (i2 == 0) {
            be3Var.K(2);
            l51Var.readFully(be3Var.a, 0, 2);
            int iH = be3Var.H();
            this.d = iH;
            if (iH == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((iH < 65488 || iH > 65497) && iH != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            be3Var.K(2);
            l51Var.n(be3Var.a, 0, 2);
            this.e = be3Var.H() - 2;
            l51Var.l(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    tb4.a();
                    return 0;
                }
                if (this.i == null || l51Var != this.h) {
                    this.h = l51Var;
                    this.i = new e20(l51Var, this.f);
                }
                sy2 sy2Var = this.j;
                sy2Var.getClass();
                int iB = sy2Var.b(this.i, t71Var);
                if (iB == 1) {
                    t71Var.a += this.f;
                }
                return iB;
            }
            long position = l51Var.getPosition();
            long j3 = this.f;
            if (position != j3) {
                t71Var.a = j3;
                return 1;
            }
            if (!l51Var.e(be3Var.a, 0, 1, true)) {
                g();
                return 0;
            }
            l51Var.k();
            if (this.j == null) {
                this.j = new sy2(xn4.m, 8);
            }
            e20 e20Var = new e20(l51Var, this.f);
            this.i = e20Var;
            if (!this.j.c(e20Var)) {
                g();
                return 0;
            }
            sy2 sy2Var2 = this.j;
            long j4 = this.f;
            m51 m51Var = this.b;
            m51Var.getClass();
            sy2Var2.f(new e20(j4, m51Var, 6));
            xx2 xx2Var2 = this.g;
            xx2Var2.getClass();
            m51 m51Var2 = this.b;
            m51Var2.getClass();
            wv4 wv4VarT = m51Var2.t(1024, 4);
            sb1 sb1Var = new sb1();
            sb1Var.l = lw2.m("image/jpeg");
            sb1Var.k = new qv2(xx2Var2);
            f34.l(sb1Var, wv4VarT);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            be3 be3Var2 = new be3(this.e);
            l51Var.readFully(be3Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(be3Var2.v()) && (strV = be3Var2.v()) != null) {
                long length = l51Var.getLength();
                if (length == -1) {
                    xx2Var = null;
                } else {
                    try {
                        e20VarY = bu.y(strV);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        l93.q0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        e20VarY = null;
                    }
                    if (e20VarY != null && (i = (gy3Var = (gy3) e20VarY.p).q) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            wx2 wx2Var = (wx2) gy3Var.get(i3);
                            String str = wx2Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                length -= wx2Var.c;
                                j = 0;
                            } else {
                                j = length - wx2Var.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            xx2Var = null;
                        } else {
                            xx2Var = new xx2(j5, j6, e20VarY.o, j7, j8);
                        }
                    } else {
                        xx2Var = null;
                    }
                }
                this.g = xx2Var;
                if (xx2Var != null) {
                    this.f = xx2Var.d;
                }
            }
        } else {
            l51Var.l(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        String strV;
        rk0 rk0Var = (rk0) l51Var;
        be3 be3Var = this.a;
        be3Var.K(2);
        rk0Var.e(be3Var.a, 0, 2, false);
        if (be3Var.H() == 65496) {
            while (true) {
                be3Var.K(2);
                rk0Var.e(be3Var.a, 0, 2, false);
                int iH = be3Var.H();
                this.d = iH;
                if (iH == 65498) {
                    break;
                }
                be3Var.K(2);
                rk0Var.n(be3Var.a, 0, 2);
                int iH2 = be3Var.H() - 2;
                if (iH2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    rk0Var.o(iH2, false);
                } else {
                    be3Var.K(iH2);
                    rk0Var.e(be3Var.a, 0, iH2, false);
                    if (Objects.equals(be3Var.v(), "http://ns.adobe.com/xap/1.0/") && (strV = be3Var.v()) != null) {
                        String[] strArr = bu.c;
                        for (int i = 0; i < 4; i++) {
                            if (strV.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            sy2 sy2Var = this.j;
            sy2Var.getClass();
            sy2Var.d(j, j2);
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.b = m51Var;
    }

    public final void g() {
        m51 m51Var = this.b;
        m51Var.getClass();
        m51Var.p();
        this.b.w(new bo(-9223372036854775807L));
        this.c = 6;
    }
}
