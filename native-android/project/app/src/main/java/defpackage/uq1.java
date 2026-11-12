package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 implements Closeable {
    public static final Logger q;
    public final fw n;
    public final tq1 o;
    public final yp1 p;

    static {
        Logger logger = Logger.getLogger(iq1.class.getName());
        logger.getClass();
        q = logger;
    }

    public uq1(fw fwVar) {
        fwVar.getClass();
        this.n = fwVar;
        tq1 tq1Var = new tq1(fwVar);
        this.o = tq1Var;
        this.p = new yp1(tq1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(boolean z, mq1 mq1Var) throws Exception {
        b21 b21Var;
        boolean z2;
        b21 b21Var2;
        Object[] array;
        boolean z3 = false;
        try {
            this.n.P(9L);
            int iN = xe5.n(this.n);
            if (iN > 16384) {
                mj0.i(f34.f(iN, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i = this.n.readByte() & 255;
            byte b = this.n.readByte();
            int i2 = b & 255;
            int i3 = this.n.readInt();
            int i4 = Integer.MAX_VALUE & i3;
            if (i != 8) {
                Logger logger = q;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(iq1.b(true, i4, iN, i, i2));
                }
            }
            if (z && i != 4) {
                mj0.m(iq1.a(i), "Expected a SETTINGS frame but was ");
                return false;
            }
            int i5 = 2;
            switch (i) {
                case 0:
                    f(mq1Var, iN, i2, i4);
                    return true;
                case 1:
                    n(mq1Var, iN, i2, i4);
                    return true;
                case 2:
                    if (iN != 5) {
                        mj0.i(b11.j(iN, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        mj0.i("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    fw fwVar = this.n;
                    fwVar.readInt();
                    fwVar.readByte();
                    return true;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    if (iN != 4) {
                        mj0.i(b11.j(iN, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        mj0.i("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i6 = this.n.readInt();
                    b21.o.getClass();
                    b21[] b21VarArrValues = b21.values();
                    int length = b21VarArrValues.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            b21Var = b21VarArrValues[i7];
                            if (b21Var.n != i6) {
                                i7++;
                            }
                        } else {
                            b21Var = null;
                        }
                    }
                    if (b21Var == null) {
                        mj0.i(f34.f(i6, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    rq1 rq1Var = mq1Var.o;
                    if (i4 != 0 && (i3 & 1) == 0) {
                        fr4.c(rq1Var.v, rq1Var.p + '[' + i4 + "] onReset", new oq1(rq1Var, i4, b21Var, i5));
                        return true;
                    }
                    yq1 yq1VarN = rq1Var.n(i4);
                    if (yq1VarN != null) {
                        synchronized (yq1VarN) {
                            if (yq1VarN.l == null) {
                                yq1VarN.l = b21Var;
                                yq1VarN.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    fw fwVar2 = this.n;
                    if (i4 != 0) {
                        mj0.i("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iN != 0) {
                            mj0.i("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iN % 6 != 0) {
                        mj0.i(f34.f(iN, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    pb4 pb4Var = new pb4();
                    int i8 = 6;
                    h02 h02VarB0 = gb.b0(gb.g0(0, iN), 6);
                    int i9 = h02VarB0.n;
                    int i10 = h02VarB0.o;
                    int i11 = h02VarB0.p;
                    if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                        while (true) {
                            short s = fwVar2.readShort();
                            byte[] bArr = xe5.a;
                            int i12 = s & 65535;
                            int i13 = fwVar2.readInt();
                            if (i12 == 2) {
                                z2 = z3;
                                if (i13 != 0 && i13 != 1) {
                                    mj0.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    return z2;
                                }
                            } else if (i12 == 3) {
                                z2 = z3;
                                i12 = 4;
                            } else if (i12 == 4) {
                                z2 = z3;
                                if (i13 < 0) {
                                    mj0.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return z2;
                                }
                                i12 = 7;
                            } else if (i12 != 5) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                if (i13 < 16384 || i13 > 16777215) {
                                    mj0.i(f34.f(i13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    return z2;
                                }
                            }
                            pb4Var.b(i12, i13);
                            if (i9 != i10) {
                                i9 += i11;
                                z3 = z2;
                            }
                        }
                    }
                    rq1 rq1Var2 = mq1Var.o;
                    fr4.c(rq1Var2.u, b11.q(new StringBuilder(), rq1Var2.p, " applyAndAckSettings"), new gp(i8, mq1Var, pb4Var));
                    return true;
                case 5:
                    q(mq1Var, iN, i2, i4);
                    return true;
                case 6:
                    if (iN != 8) {
                        mj0.i(f34.f(iN, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        mj0.i("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i14 = this.n.readInt();
                    int i15 = this.n.readInt();
                    Object[] objArr = (b & 1) != 0 ? 1 : 0;
                    rq1 rq1Var3 = mq1Var.o;
                    if (objArr == 0) {
                        fr4.c(rq1Var3.u, b11.q(new StringBuilder(), mq1Var.o.p, " ping"), new lq1(mq1Var.o, i14, i15));
                        return true;
                    }
                    synchronized (rq1Var3) {
                        try {
                            if (i14 == 1) {
                                rq1Var3.y++;
                            } else if (i14 == 2) {
                                rq1Var3.A++;
                            } else if (i14 == 3) {
                                rq1Var3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iN < 8) {
                        mj0.i(f34.f(iN, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        mj0.i("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i16 = this.n.readInt();
                    int i17 = this.n.readInt();
                    int i18 = iN - 8;
                    b21.o.getClass();
                    b21[] b21VarArrValues2 = b21.values();
                    int length2 = b21VarArrValues2.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length2) {
                            b21 b21Var3 = b21VarArrValues2[i19];
                            if (b21Var3.n == i17) {
                                b21Var2 = b21Var3;
                            } else {
                                i19++;
                            }
                        } else {
                            b21Var2 = null;
                        }
                    }
                    if (b21Var2 == null) {
                        mj0.i(f34.f(i17, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    yw ywVarG = yw.q;
                    if (i18 > 0) {
                        ywVarG = this.n.g(i18);
                    }
                    ywVarG.getClass();
                    ywVarG.d();
                    rq1 rq1Var4 = mq1Var.o;
                    synchronized (rq1Var4) {
                        array = rq1Var4.o.values().toArray(new yq1[0]);
                        rq1Var4.s = true;
                    }
                    for (yq1 yq1Var : (yq1[]) array) {
                        if (yq1Var.a > i16 && yq1Var.g()) {
                            b21 b21Var4 = b21.REFUSED_STREAM;
                            synchronized (yq1Var) {
                                if (yq1Var.l == null) {
                                    yq1Var.l = b21Var4;
                                    yq1Var.notifyAll();
                                }
                                break;
                            }
                            mq1Var.o.n(yq1Var.a);
                        }
                    }
                    return true;
                case 8:
                    try {
                        if (iN != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iN);
                        }
                        long j = 2147483647L & ((long) this.n.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = q;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(iq1.c(i4, iN, j, true));
                        }
                        rq1 rq1Var5 = mq1Var.o;
                        if (i4 == 0) {
                            synchronized (rq1Var5) {
                                rq1Var5.H += j;
                                rq1Var5.notifyAll();
                            }
                            return true;
                        }
                        yq1 yq1VarJ = rq1Var5.j(i4);
                        if (yq1VarJ != null) {
                            synchronized (yq1VarJ) {
                                yq1VarJ.e += j;
                                if (j > 0) {
                                    yq1VarJ.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        q.fine(iq1.b(true, i4, iN, 8, i2));
                        throw e;
                    }
                default:
                    this.n.skip(iN);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.close();
    }

    public final void f(mq1 mq1Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            mj0.i("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            mj0.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.n.readByte();
            byte[] bArr = xe5.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iE = te5.E(i, i2, i4);
        fw fwVar = this.n;
        fwVar.getClass();
        rq1 rq1Var = mq1Var.o;
        if (i3 != 0 && (i3 & 1) == 0) {
            tv tvVar = new tv();
            long j = iE;
            fwVar.P(j);
            fwVar.read(tvVar, j);
            fr4.c(rq1Var.v, rq1Var.p + '[' + i3 + "] onData", new nq1(rq1Var, i3, tvVar, iE, z3));
        } else {
            yq1 yq1VarJ = rq1Var.j(i3);
            if (yq1VarJ == null) {
                mq1Var.o.v(i3, b21.PROTOCOL_ERROR);
                long j2 = iE;
                mq1Var.o.s(j2);
                fwVar.skip(j2);
            } else {
                tl1 tl1Var = ze5.a;
                wq1 wq1Var = yq1VarJ.h;
                long j3 = iE;
                wq1Var.getClass();
                long j4 = j3;
                while (true) {
                    yq1 yq1Var = wq1Var.t;
                    if (j4 <= 0) {
                        tl1 tl1Var2 = ze5.a;
                        yq1Var.b.s(j3);
                        wq1Var.t.b.C.getClass();
                        break;
                    }
                    synchronized (yq1Var) {
                        z = wq1Var.o;
                        z2 = wq1Var.q.o + j4 > wq1Var.n;
                    }
                    if (z2) {
                        fwVar.skip(j4);
                        wq1Var.t.e(b21.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        fwVar.skip(j4);
                        break;
                    }
                    long j5 = fwVar.read(wq1Var.p, j4);
                    if (j5 == -1) {
                        throw new EOFException();
                    }
                    j4 -= j5;
                    yq1 yq1Var2 = wq1Var.t;
                    synchronized (yq1Var2) {
                        try {
                            if (wq1Var.s) {
                                wq1Var.p.b();
                            } else {
                                tv tvVar2 = wq1Var.q;
                                boolean z4 = tvVar2.o == 0;
                                tvVar2.p(wq1Var.p);
                                if (z4) {
                                    yq1Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    yq1VarJ.i(ze5.a, true);
                }
            }
        }
        this.n.skip(i4);
    }

    public final List j(int i, int i2, int i3, int i4) throws IOException {
        tq1 tq1Var = this.o;
        tq1Var.r = i;
        tq1Var.o = i;
        tq1Var.s = i2;
        tq1Var.p = i3;
        tq1Var.q = i4;
        yp1 yp1Var = this.p;
        xu3 xu3Var = yp1Var.c;
        ArrayList arrayList = yp1Var.b;
        while (!xu3Var.l()) {
            byte b = xu3Var.readByte();
            byte[] bArr = xe5.a;
            int i5 = b & 255;
            if (i5 == 128) {
                mj0.i("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = yp1Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    pl1[] pl1VarArr = aq1.a;
                    if (i6 <= pl1VarArr.length - 1) {
                        arrayList.add(pl1VarArr[i6]);
                    }
                }
                int length = yp1Var.e + 1 + (i6 - aq1.a.length);
                if (length >= 0) {
                    pl1[] pl1VarArr2 = yp1Var.d;
                    if (length < pl1VarArr2.length) {
                        pl1 pl1Var = pl1VarArr2[length];
                        pl1Var.getClass();
                        arrayList.add(pl1Var);
                    }
                }
                mj0.i(f34.f(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                pl1[] pl1VarArr3 = aq1.a;
                yw ywVarD = yp1Var.d();
                aq1.a(ywVarD);
                yp1Var.c(new pl1(ywVarD, yp1Var.d()));
            } else if ((b & 64) == 64) {
                yp1Var.c(new pl1(yp1Var.b(yp1Var.e(i5, 63) - 1), yp1Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = yp1Var.e(i5, 31);
                yp1Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + yp1Var.a);
                }
                int i7 = yp1Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        pl1[] pl1VarArr4 = yp1Var.d;
                        ti.f0(0, pl1VarArr4.length, null, pl1VarArr4);
                        yp1Var.e = yp1Var.d.length - 1;
                        yp1Var.f = 0;
                        yp1Var.g = 0;
                    } else {
                        yp1Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                pl1[] pl1VarArr5 = aq1.a;
                yw ywVarD2 = yp1Var.d();
                aq1.a(ywVarD2);
                arrayList.add(new pl1(ywVarD2, yp1Var.d()));
            } else {
                arrayList.add(new pl1(yp1Var.b(yp1Var.e(i5, 15) - 1), yp1Var.d()));
            }
        }
        List listQ0 = q40.Q0(arrayList);
        arrayList.clear();
        return listQ0;
    }

    public final void n(mq1 mq1Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            mj0.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.n.readByte();
            byte[] bArr = xe5.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            fw fwVar = this.n;
            fwVar.readInt();
            fwVar.readByte();
            byte[] bArr2 = xe5.a;
            i -= 5;
        }
        List listJ = j(te5.E(i, i2, i4), i4, i2, i3);
        rq1 rq1Var = mq1Var.o;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            fr4.c(rq1Var.v, rq1Var.p + '[' + i3 + "] onHeaders", new oq1(rq1Var, i3, listJ, z2));
            return;
        }
        synchronized (rq1Var) {
            yq1 yq1VarJ = rq1Var.j(i3);
            if (yq1VarJ != null) {
                yq1VarJ.i(ze5.i(listJ), z2);
                return;
            }
            if (rq1Var.s) {
                return;
            }
            if (i3 <= rq1Var.q) {
                return;
            }
            if (i3 % 2 == rq1Var.r % 2) {
                return;
            }
            yq1 yq1Var = new yq1(i3, rq1Var, false, z2, ze5.i(listJ));
            rq1Var.q = i3;
            rq1Var.o.put(Integer.valueOf(i3), yq1Var);
            fr4.c(rq1Var.t.e(), rq1Var.p + '[' + i3 + "] onStream", new gp(5, rq1Var, yq1Var));
        }
    }

    public final void q(mq1 mq1Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            mj0.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.n.readByte();
            byte[] bArr = xe5.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.n.readInt() & Integer.MAX_VALUE;
        List listJ = j(te5.E(i - 4, i2, i4), i4, i2, i3);
        rq1 rq1Var = mq1Var.o;
        synchronized (rq1Var) {
            if (rq1Var.L.contains(Integer.valueOf(i5))) {
                rq1Var.v(i5, b21.PROTOCOL_ERROR);
                return;
            }
            rq1Var.L.add(Integer.valueOf(i5));
            fr4.c(rq1Var.v, rq1Var.p + '[' + i5 + "] onRequest", new oq1(rq1Var, i5, listJ, 1));
        }
    }
}
