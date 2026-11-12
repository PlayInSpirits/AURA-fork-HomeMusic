package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.PlaybackException;
import androidx.preference.Preference;
import app.homemusic.R;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na4 implements jj1, zn4 {
    public static final tv1 r = new tv1();
    public static final l15 s = new l15(2);
    public static na4 t;
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    public na4(Typeface typeface, wv2 wv2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.q = typeface;
        this.n = wv2Var;
        this.p = new zv2(1024);
        int iA = wv2Var.a(6);
        if (iA != 0) {
            int i5 = iA + wv2Var.n;
            i = ((ByteBuffer) wv2Var.q).getInt(((ByteBuffer) wv2Var.q).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.o = new char[i * 2];
        int iA2 = wv2Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + wv2Var.n;
            i2 = ((ByteBuffer) wv2Var.q).getInt(((ByteBuffer) wv2Var.q).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            k05 k05Var = new k05(this, i7);
            vv2 vv2VarB = k05Var.b();
            int iA3 = vv2VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) vv2VarB.q).getInt(iA3 + vv2VarB.n) : 0, (char[]) this.o, i7 * 2);
            vv2 vv2VarB2 = k05Var.b();
            int iA4 = vv2VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + vv2VarB2.n;
                i3 = ((ByteBuffer) vv2VarB2.q).getInt(((ByteBuffer) vv2VarB2.q).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            l93.j("invalid metadata codepoint length", i3 > 0);
            zv2 zv2Var = (zv2) this.p;
            vv2 vv2VarB3 = k05Var.b();
            int iA5 = vv2VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + vv2VarB3.n;
                i4 = ((ByteBuffer) vv2VarB3.q).getInt(((ByteBuffer) vv2VarB3.q).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            zv2Var.a(k05Var, 0, i4 - 1);
        }
    }

    public static na4 z() {
        if (t == null) {
            t = new na4(11);
        }
        return t;
    }

    public PlaybackException A(fr2 fr2Var) {
        synchronized (this.n) {
            try {
                return ((ba0) ((oi) this.p).get(fr2Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lk3 B(fr2 fr2Var) {
        synchronized (this.n) {
            try {
                return ((ba0) ((oi) this.p).get(fr2Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yk C(fr2 fr2Var) {
        ba0 ba0Var;
        synchronized (this.n) {
            ba0Var = (ba0) ((oi) this.p).get(fr2Var);
        }
        if (ba0Var != null) {
            return ba0Var.b;
        }
        return null;
    }

    public ce D(ce ceVar, ce ceVar2) {
        na4 na4Var = this;
        if (((ce) na4Var.q) == null) {
            na4Var.q = ceVar.c();
        }
        ce ceVar3 = (ce) na4Var.q;
        if (ceVar3 == null) {
            h12.Q("targetVector");
            throw null;
        }
        int iB = ceVar3.b();
        int i = 0;
        while (true) {
            ce ceVar4 = (ce) na4Var.q;
            if (i >= iB) {
                if (ceVar4 != null) {
                    return ceVar4;
                }
                h12.Q("targetVector");
                throw null;
            }
            if (ceVar4 == null) {
                h12.Q("targetVector");
                throw null;
            }
            rm2 rm2Var = (rm2) na4Var.n;
            float fA = ceVar.a(i);
            float fA2 = ceVar2.a(i);
            yx0 yx0Var = (yx0) rm2Var.o;
            double dB = yx0Var.b(fA2);
            double d = a81.a;
            float f = yx0Var.a * yx0Var.b;
            ceVar4.d(i, (Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) f)))) + fA);
            i++;
            na4Var = this;
            iB = iB;
        }
    }

    public ce E(long j, ce ceVar, ce ceVar2) {
        if (((ce) this.p) == null) {
            this.p = ceVar.c();
        }
        ce ceVar3 = (ce) this.p;
        if (ceVar3 == null) {
            h12.Q("velocityVector");
            throw null;
        }
        int iB = ceVar3.b();
        int i = 0;
        while (true) {
            ce ceVar4 = (ce) this.p;
            if (i >= iB) {
                if (ceVar4 != null) {
                    return ceVar4;
                }
                h12.Q("velocityVector");
                throw null;
            }
            if (ceVar4 == null) {
                h12.Q("velocityVector");
                throw null;
            }
            rm2 rm2Var = (rm2) this.n;
            ceVar.getClass();
            long j2 = j / 1000000;
            z71 z71VarA = ((yx0) rm2Var.o).a(ceVar2.a(i));
            long j3 = z71VarA.c;
            ceVar4.d(i, (((Math.signum(z71VarA.a) * yb.a(j3 > 0 ? j2 / j3 : 1.0f).b) * z71VarA.b) / j3) * 1000.0f);
            i++;
        }
    }

    public boolean F(fr2 fr2Var) {
        boolean z;
        synchronized (this.n) {
            z = ((oi) this.p).get(fr2Var) != null;
        }
        return z;
    }

    public boolean G(br brVar) {
        rg4 rg4Var = (rg4) this.p;
        return (rg4Var == null || brVar == null || rg4Var.a.get() != brVar) ? false : true;
    }

    public boolean H(fr2 fr2Var, int i) {
        ba0 ba0Var;
        synchronized (this.n) {
            ba0Var = (ba0) ((oi) this.p).get(fr2Var);
        }
        tn2 tn2Var = (tn2) ((WeakReference) this.q).get();
        return ba0Var != null && ba0Var.e.a(i) && tn2Var != null && tn2Var.s.o().a(i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[RETURN] */
    public boolean I(fr2 fr2Var, int i) {
        ba0 ba0Var;
        boolean z;
        synchronized (this.n) {
            ba0Var = (ba0) ((oi) this.p).get(fr2Var);
        }
        if (ba0Var != null) {
            wa4 wa4Var = ba0Var.d;
            wa4Var.getClass();
            rr2.k("Use contains(Command) for custom command", i != 0);
            Iterator<E> it = wa4Var.a.iterator();
            while (it.hasNext()) {
                if (((va4) it.next()).a == i) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean J(fr2 fr2Var, va4 va4Var) {
        ba0 ba0Var;
        synchronized (this.n) {
            ba0Var = (ba0) ((oi) this.p).get(fr2Var);
        }
        if (ba0Var == null) {
            return false;
        }
        jx1 jx1Var = ba0Var.d.a;
        va4Var.getClass();
        return jx1Var.contains(va4Var) || j60.n(va4Var.b);
    }

    public void K(br brVar) {
        synchronized (this.n) {
            try {
                if (G(brVar)) {
                    rg4 rg4Var = (rg4) this.p;
                    if (!rg4Var.c) {
                        rg4Var.c = true;
                        ((Handler) this.o).removeCallbacksAndMessages(rg4Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void L() {
        int i;
        int size;
        yu3 yu3Var;
        int size2;
        yu3 yu3Var2;
        tl1 tl1Var = ze5.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.o).iterator();
                it.getClass();
                while (it.hasNext()) {
                    yu3 yu3Var3 = (yu3) it.next();
                    if (((ArrayDeque) this.p).size() >= 64) {
                        break;
                    }
                    if (yu3Var3.o.get() < 5) {
                        it.remove();
                        yu3Var3.o.incrementAndGet();
                        arrayList.add(yu3Var3);
                        ((ArrayDeque) this.p).add(yu3Var3);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.p).size();
                    ((ArrayDeque) this.q).size();
                }
                i = 0;
                if (!((ThreadPoolExecutor) n()).isShutdown()) {
                    size2 = arrayList.size();
                    while (i < size2) {
                        yu3Var2 = (yu3) arrayList.get(i);
                        yu3Var2.o.decrementAndGet();
                        synchronized (this) {
                            ((ArrayDeque) this.p).remove(yu3Var2);
                        }
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(null);
                        bv3 bv3Var = yu3Var2.p;
                        bv3Var.g(interruptedIOException);
                        yu3Var2.n.onFailure(bv3Var, interruptedIOException);
                        i++;
                    }
                }
                size = arrayList.size();
                while (i < size) {
                    yu3Var = (yu3) arrayList.get(i);
                    ExecutorService executorServiceN = n();
                    yu3Var.getClass();
                    bv3 bv3Var2 = yu3Var.p;
                    na4 na4Var = bv3Var2.n.a;
                    tl1 tl1Var2 = ze5.a;
                    try {
                        try {
                            ((ThreadPoolExecutor) executorServiceN).execute(yu3Var);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                            interruptedIOException2.initCause(e);
                            bv3 bv3Var3 = yu3Var.p;
                            bv3Var3.g(interruptedIOException2);
                            yu3Var.n.onFailure(bv3Var3, interruptedIOException2);
                            bv3Var2.n.a.q(yu3Var);
                        }
                        i++;
                    } catch (Throwable th) {
                        bv3Var2.n.a.q(yu3Var);
                        throw th;
                    }
                }
                return;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i = 0;
        if (!((ThreadPoolExecutor) n()).isShutdown()) {
            size = arrayList.size();
            while (i < size) {
                yu3Var = (yu3) arrayList.get(i);
                ExecutorService executorServiceN2 = n();
                yu3Var.getClass();
                bv3 bv3Var4 = yu3Var.p;
                na4 na4Var2 = bv3Var4.n.a;
                tl1 tl1Var3 = ze5.a;
                ((ThreadPoolExecutor) executorServiceN2).execute(yu3Var);
                i++;
            }
            return;
        }
        size2 = arrayList.size();
        while (i < size2) {
            yu3Var2 = (yu3) arrayList.get(i);
            yu3Var2.o.decrementAndGet();
            synchronized (this) {
                ((ArrayDeque) this.p).remove(yu3Var2);
                InterruptedIOException interruptedIOException3 = new InterruptedIOException("executor rejected");
                interruptedIOException3.initCause(null);
                bv3 bv3Var5 = yu3Var2.p;
                bv3Var5.g(interruptedIOException3);
                yu3Var2.n.onFailure(bv3Var5, interruptedIOException3);
                i++;
            }
        }
    }

    public synchronized ArrayList M() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.n).iterator();
        while (it.hasNext()) {
            cz2 cz2Var = (cz2) it.next();
            if (cz2Var.a.isAssignableFrom(String.class) && cz2Var.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(cz2Var.c);
            }
        }
        return arrayList;
    }

    public void N(fr2 fr2Var) {
        synchronized (this.n) {
            try {
                ba0 ba0Var = (ba0) ((oi) this.p).remove(fr2Var);
                if (ba0Var == null) {
                    return;
                }
                ((oi) this.o).remove(ba0Var.a);
                ba0Var.b.a();
                tn2 tn2Var = (tn2) ((WeakReference) this.q).get();
                if (tn2Var == null || tn2Var.l()) {
                    return;
                }
                f35.W(tn2Var.l, new y90(tn2Var, fr2Var, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void O(br brVar) {
        synchronized (this.n) {
            try {
                if (G(brVar)) {
                    rg4 rg4Var = (rg4) this.p;
                    if (rg4Var.c) {
                        rg4Var.c = false;
                        P(rg4Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void P(rg4 rg4Var) {
        Handler handler = (Handler) this.o;
        int i = rg4Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(rg4Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, rg4Var), i);
    }

    public void Q() {
        rg4 rg4Var = (rg4) this.q;
        if (rg4Var != null) {
            this.p = rg4Var;
            this.q = null;
            br brVar = (br) rg4Var.a.get();
            if (brVar == null) {
                this.p = null;
            } else {
                Handler handler = fr.z;
                handler.sendMessage(handler.obtainMessage(0, brVar.a));
            }
        }
    }

    public void R(gl4 gl4Var) {
        gl4Var.getClass();
        ur2 ur2Var = new ur2(24, this, gl4Var);
        synchronized (this.p) {
        }
        ((Handler) ((hg3) this.n).o).postDelayed(ur2Var, 5400000L);
    }

    public void S() {
        ArrayList arrayList = (ArrayList) this.q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((o23) obj).a;
            if (o(i2) == null) {
                int i3 = r23.w;
                kf2.g((t23) this.p, xa3.j("Navigation destination ", ya4.v((Context) this.n, i2), " cannot be found in the navigation graph "));
                return;
            }
        }
    }

    public void a(Object obj, fr2 fr2Var, wa4 wa4Var, mi3 mi3Var) {
        synchronized (this.n) {
            try {
                fr2 fr2VarW = w(obj);
                if (fr2VarW == null) {
                    ((oi) this.o).put(obj, fr2Var);
                    ((oi) this.p).put(fr2Var, new ba0(obj, new yk(), wa4Var, mi3Var));
                } else {
                    ba0 ba0Var = (ba0) ((oi) this.p).get(fr2VarW);
                    ba0Var.getClass();
                    ba0Var.d = wa4Var;
                    ba0Var.e = mi3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:88:0x025c  */
    @Override // defpackage.zn4
    public void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        ig0 ig0Var;
        gy3 gy3VarO;
        boolean z;
        Rect rect;
        be3 be3Var = (be3) this.n;
        be3Var.L(i + i2, bArr);
        be3Var.N(i);
        be3 be3Var2 = (be3) this.o;
        o85 o85Var = (o85) this.p;
        if (((Inflater) this.q) == null) {
            this.q = new Inflater();
        }
        Inflater inflater = (Inflater) this.q;
        String str = f35.a;
        if (be3Var.a() > 0 && be3Var.j() == 120 && f35.K(be3Var, be3Var2, inflater)) {
            be3Var.L(be3Var2.c, be3Var2.a);
        }
        o85Var.c = false;
        o85Var.g = null;
        o85Var.h = -1;
        o85Var.i = -1;
        int iA = be3Var.a();
        if (iA < 2 || be3Var.H() != iA) {
            ig0Var = null;
        } else {
            if (o85Var.d == null) {
                l93.q0("VobsubParser", "Skipping SPU (no palette)");
            } else if (o85Var.b) {
                int i3 = be3Var.b - 2;
                be3Var.N(be3Var.H() + i3);
                do {
                    int i4 = 4;
                    if (be3Var.a() < 4) {
                        z = false;
                    } else {
                        int i5 = be3Var.b;
                        be3Var.O(2);
                        int iH = be3Var.H() + i3;
                        z = iH != i5 && iH < be3Var.c;
                        int i6 = z ? iH : be3Var.c;
                        boolean z2 = true;
                        while (be3Var.b < i6 && z2) {
                            int[] iArr = o85Var.a;
                            int iA2 = be3Var.A();
                            if (iA2 != 255) {
                                switch (iA2) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        z2 = true;
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        if (be3Var.a() >= 2) {
                                            int iA3 = be3Var.A();
                                            int iA4 = be3Var.A();
                                            iArr[3] = o85.a(o85Var.d, iA3 >> 4);
                                            iArr[2] = o85.a(o85Var.d, iA3 & 15);
                                            iArr[1] = o85.a(o85Var.d, iA4 >> 4);
                                            iArr[0] = o85.a(o85Var.d, iA4 & 15);
                                            o85Var.c = true;
                                            z2 = true;
                                        } else {
                                            l93.q0("VobsubParser", "Incomplete color command");
                                            z2 = false;
                                        }
                                        break;
                                    case 4:
                                        if (be3Var.a() < 2) {
                                            l93.q0("VobsubParser", "Incomplete alpha command");
                                        } else if (o85Var.c) {
                                            int iA5 = be3Var.A();
                                            int iA6 = be3Var.A();
                                            iArr[3] = o85.c(iArr[3], iA5 >> 4);
                                            iArr[2] = o85.c(iArr[2], iA5 & 15);
                                            iArr[1] = o85.c(iArr[1], iA6 >> 4);
                                            iArr[0] = o85.c(iArr[0], iA6 & 15);
                                            z2 = true;
                                        } else {
                                            l93.q0("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                        z2 = false;
                                        break;
                                    case 5:
                                        if (be3Var.a() >= 6) {
                                            int iA7 = be3Var.A();
                                            int iA8 = be3Var.A();
                                            int i7 = (iA7 << i4) | (iA8 >> 4);
                                            int iA9 = ((iA8 & 15) << 8) | be3Var.A();
                                            int iA10 = be3Var.A();
                                            int iA11 = be3Var.A();
                                            o85Var.g = new Rect(i7, (iA10 << i4) | (iA11 >> 4), iA9 + 1, (((iA11 & 15) << 8) | be3Var.A()) + 1);
                                            z2 = true;
                                        } else {
                                            l93.q0("VobsubParser", "Incomplete area command");
                                            z2 = false;
                                        }
                                        break;
                                    case 6:
                                        if (be3Var.a() >= i4) {
                                            o85Var.h = be3Var.H();
                                            o85Var.i = be3Var.H();
                                            z2 = true;
                                        } else {
                                            l93.q0("VobsubParser", "Incomplete offsets command");
                                            z2 = false;
                                        }
                                        break;
                                    default:
                                        xa3.m(iA2, "Unrecognized command: ", "VobsubParser");
                                        z2 = false;
                                        break;
                                }
                            } else {
                                z2 = false;
                            }
                            i4 = 4;
                        }
                        if (z) {
                            be3Var.N(iH);
                        }
                    }
                } while (z);
            } else {
                l93.q0("VobsubParser", "Skipping SPU (no plane)");
            }
            if (o85Var.d == null || !o85Var.b || !o85Var.c || (rect = o85Var.g) == null || o85Var.h == -1 || o85Var.i == -1 || rect.width() < 2 || o85Var.g.height() < 2) {
                ig0Var = null;
            } else {
                Rect rect2 = o85Var.g;
                int[] iArr2 = new int[rect2.height() * rect2.width()];
                h00 h00Var = new h00();
                be3Var.N(o85Var.h);
                h00Var.p(be3Var);
                o85Var.b(h00Var, true, rect2, iArr2);
                be3Var.N(o85Var.i);
                h00Var.p(be3Var);
                o85Var.b(h00Var, false, rect2, iArr2);
                ig0Var = new ig0(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / o85Var.f, 0, 0, rect2.left / o85Var.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / o85Var.e, rect2.height() / o85Var.f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
            }
        }
        if (ig0Var != null) {
            gy3VarO = yw1.o(ig0Var);
        } else {
            vw1 vw1Var = yw1.o;
            gy3VarO = gy3.r;
        }
        wc0Var.accept(new lg0(-9223372036854775807L, 5000000L, gy3VarO));
    }

    public void d(fr2 fr2Var, int i, aa0 aa0Var) {
        synchronized (this.n) {
            try {
                ba0 ba0Var = (ba0) ((oi) this.p).get(fr2Var);
                if (ba0Var != null) {
                    mi3 mi3Var = ba0Var.g;
                    mi3Var.getClass();
                    xk0 xk0Var = new xk0(2);
                    xk0Var.c(mi3Var.a);
                    xk0Var.b(i);
                    ba0Var.g = new mi3(xk0Var.f());
                    ba0Var.c.add(aa0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void e(Class cls, Class cls2, vw2 vw2Var) {
        cz2 cz2Var = new cz2(cls, cls2, vw2Var);
        ArrayList arrayList = (ArrayList) this.n;
        arrayList.add(arrayList.size(), cz2Var);
    }

    public synchronized uw2 f(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.n;
            int size = arrayList2.size();
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= size) {
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                cz2 cz2Var = (cz2) obj;
                if (((HashSet) this.p).contains(cz2Var)) {
                    z = true;
                } else {
                    if (!cz2Var.a.isAssignableFrom(cls) || !cz2Var.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.p).add(cz2Var);
                        arrayList.add(cz2Var.c.a(this));
                        ((HashSet) this.p).remove(cz2Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                tv1 tv1Var = (tv1) this.o;
                i61 i61Var = (i61) this.q;
                tv1Var.getClass();
                return new lk(2, arrayList, i61Var);
            }
            if (arrayList.size() == 1) {
                return (uw2) arrayList.get(0);
            }
            if (z) {
                return s;
            }
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.p).clear();
            throw th;
        }
    }

    @Override // defpackage.jj1
    public void g(String str, String str2) {
        str.getClass();
        jx3 jx3Var = (jx3) this.o;
        jx3 jx3Var2 = (jx3) this.p;
        vb4 vb4Var = (vb4) this.n;
        Preference preference = (Preference) this.q;
        do1 do1Var = new do1(1, str);
        String strS = vb4Var.s(R.string.homemusic_settings_google_linked);
        strS.getClass();
        io1.a.execute(new up(do1Var, jx3Var, strS, jx3Var2, vb4Var, preference, 2));
    }

    public synchronized ArrayList h(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.n;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                cz2 cz2Var = (cz2) obj;
                if (!((HashSet) this.p).contains(cz2Var) && cz2Var.a.isAssignableFrom(cls)) {
                    ((HashSet) this.p).add(cz2Var);
                    arrayList.add(cz2Var.c.a(this));
                    ((HashSet) this.p).remove(cz2Var);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.p).clear();
            throw th;
        }
        return arrayList;
    }

    public void i(gl4 gl4Var) {
        Runnable runnable;
        gl4Var.getClass();
        synchronized (this.p) {
            runnable = (Runnable) ((LinkedHashMap) this.q).remove(gl4Var);
        }
        if (runnable != null) {
            ((Handler) ((hg3) this.n).o).removeCallbacks(runnable);
        }
    }

    public boolean j(rg4 rg4Var, int i) {
        br brVar = (br) rg4Var.a.get();
        if (brVar == null) {
            return false;
        }
        ((Handler) this.o).removeCallbacksAndMessages(rg4Var);
        Handler handler = fr.z;
        handler.sendMessage(handler.obtainMessage(1, i, 0, brVar.a));
        return true;
    }

    public hr4 k() {
        Context context = (Context) this.n;
        ArrayList arrayList = (ArrayList) this.q;
        Intent intent = (Intent) this.o;
        t23 t23Var = (t23) this.p;
        if (t23Var == null) {
            kf2.o("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            kf2.o("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        r23 r23Var = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o23 o23Var = (o23) obj;
            int i2 = o23Var.a;
            Bundle bundle = o23Var.b;
            r23 r23VarO = o(i2);
            if (r23VarO == null) {
                int i3 = r23.w;
                tb4.h("Navigation destination ", ya4.v(context, i2), " cannot be found in the navigation graph ", t23Var);
                return null;
            }
            for (int i4 : r23VarO.b(r23Var)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            r23Var = r23VarO;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", q40.P0(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        hr4 hr4Var = new hr4(context);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(hr4Var.o.getPackageManager());
        }
        if (component != null) {
            hr4Var.a(component);
        }
        ArrayList arrayList4 = hr4Var.n;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = (Intent) arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return hr4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(long j, long j2, wd0 wd0Var) {
        z43 z43Var;
        long j3;
        if (wd0Var instanceof z43) {
            z43Var = (z43) wd0Var;
            int i = z43Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                z43Var.p = i - Integer.MIN_VALUE;
            } else {
                z43Var = new z43(this, wd0Var);
            }
        } else {
            z43Var = new z43(this, wd0Var);
        }
        z43 z43Var2 = z43Var;
        Object objB0 = z43Var2.n;
        int i2 = z43Var2.p;
        if (i2 == 0) {
            kb4.X(objB0);
            e53 e53Var = (e53) this.n;
            e53 e53VarR0 = e53Var != null ? e53Var.r0() : null;
            j3 = 0;
            xe0 xe0Var = xe0.n;
            if (e53VarR0 == null) {
                e53 e53Var2 = (e53) this.o;
                if (e53Var2 != null) {
                    z43Var2.p = 1;
                    objB0 = e53Var2.b0(j, j2, z43Var2);
                }
            } else {
                e53 e53Var3 = (e53) this.n;
                e53 e53VarR1 = e53Var3 != null ? e53Var3.r0() : null;
                if (e53VarR1 != null) {
                    z43Var2.p = 2;
                    objB0 = e53VarR1.b0(j, j2, z43Var2);
                }
            }
        } else if (i2 == 1) {
            kb4.X(objB0);
            j3 = ((k45) objB0).a;
        } else {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objB0);
            j3 = ((k45) objB0).a;
        }
        return new k45(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(long j, wd0 wd0Var) {
        a53 a53Var;
        long j2;
        if (wd0Var instanceof a53) {
            a53Var = (a53) wd0Var;
            int i = a53Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                a53Var.p = i - Integer.MIN_VALUE;
            } else {
                a53Var = new a53(this, wd0Var);
            }
        } else {
            a53Var = new a53(this, wd0Var);
        }
        Object objS = a53Var.n;
        int i2 = a53Var.p;
        if (i2 == 0) {
            kb4.X(objS);
            e53 e53Var = (e53) this.n;
            e53 e53VarR0 = e53Var != null ? e53Var.r0() : null;
            if (e53VarR0 != null) {
                a53Var.p = 1;
                objS = e53VarR0.s(j, a53Var);
                xe0 xe0Var = xe0.n;
                if (objS == xe0Var) {
                    return xe0Var;
                }
            } else {
                j2 = 0;
            }
            return new k45(j2);
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(objS);
        j2 = ((k45) objS).a;
        return new k45(j2);
    }

    public synchronized ExecutorService n() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.n) == null) {
                this.n = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ye5(ze5.c + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.n;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public r23 o(int i) {
        ii iiVar = new ii();
        t23 t23Var = (t23) this.p;
        t23Var.getClass();
        iiVar.addLast(t23Var);
        while (!iiVar.isEmpty()) {
            r23 r23Var = (r23) iiVar.removeFirst();
            if (r23Var.u == i) {
                return r23Var;
            }
            if (r23Var instanceof t23) {
                s23 s23Var = new s23((t23) r23Var);
                while (s23Var.hasNext()) {
                    iiVar.addLast((r23) s23Var.next());
                }
            }
        }
        return null;
    }

    public void p(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        L();
    }

    public void q(yu3 yu3Var) {
        yu3Var.o.decrementAndGet();
        p((ArrayDeque) this.p, yu3Var);
    }

    public void r(ba0 ba0Var) {
        tn2 tn2Var = (tn2) ((WeakReference) this.q).get();
        if (tn2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            aa0 aa0Var = (aa0) ba0Var.c.poll();
            if (aa0Var == null) {
                ba0Var.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            na4 na4Var = this;
            f35.W(tn2Var.l, new ur2(tn2Var, this.w(ba0Var.a), new mr(na4Var, aa0Var, atomicBoolean2, ba0Var, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            this = na4Var;
        }
    }

    public void s(final fr2 fr2Var) {
        synchronized (this.n) {
            try {
                ba0 ba0Var = (ba0) ((oi) this.p).get(fr2Var);
                if (ba0Var == null) {
                    return;
                }
                final mi3 mi3Var = ba0Var.g;
                ba0Var.g = mi3.b;
                ba0Var.c.add(new aa0() { // from class: z90
                    @Override // defpackage.aa0
                    public final ic2 run() {
                        tn2 tn2Var = (tn2) ((WeakReference) this.a.q).get();
                        if (tn2Var != null) {
                            tn2Var.v(fr2Var, mi3Var);
                        }
                        return mw1.o;
                    }
                });
                if (ba0Var.f) {
                    return;
                }
                ba0Var.f = true;
                r(ba0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mi3 t(fr2 fr2Var) {
        synchronized (this.n) {
            try {
                ba0 ba0Var = (ba0) ((oi) this.p).get(fr2Var);
                if (ba0Var == null) {
                    return null;
                }
                return ba0Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yw1 u() {
        yw1 yw1VarK;
        synchronized (this.n) {
            yw1VarK = yw1.k(((oi) this.o).values());
        }
        return yw1VarK;
    }

    @Override // defpackage.jj1
    public void v(String str) {
        if (str != null) {
            bu.f((vb4) this.n, str);
        }
    }

    public fr2 w(Object obj) {
        fr2 fr2Var;
        synchronized (this.n) {
            fr2Var = (fr2) ((oi) this.o).get(obj);
        }
        return fr2Var;
    }

    public we0 x() {
        we0 we0Var = (we0) ((gf1) this.p).invoke();
        if (we0Var != null) {
            return we0Var;
        }
        kf2.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public synchronized ArrayList y(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.n;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            cz2 cz2Var = (cz2) obj;
            if (!arrayList.contains(cz2Var.b) && cz2Var.a.isAssignableFrom(cls)) {
                arrayList.add(cz2Var.b);
            }
        }
        return arrayList;
    }

    public /* synthetic */ na4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    public na4(int i) {
        switch (i) {
            case 10:
                this.p = new wc(14, this);
                break;
            case 11:
                this.n = new Object();
                this.o = new Handler(Looper.getMainLooper(), new ai1(1, this));
                break;
            default:
                this.o = new ArrayDeque();
                this.p = new ArrayDeque();
                this.q = new ArrayDeque();
                break;
        }
    }

    public na4(tn2 tn2Var) {
        this.o = new oi(0);
        this.p = new oi(0);
        this.n = new Object();
        this.q = new WeakReference(tn2Var);
    }

    public na4(v23 v23Var) {
        Intent launchIntentForPackage;
        v23Var.getClass();
        Context context = v23Var.a;
        this.n = context;
        g71 g71Var = new g71(new h71(new tq4(fa4.c0(k5.w, context), k5.x, 1), false, new o54(13)));
        Activity activity = (Activity) (!g71Var.hasNext() ? null : g71Var.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.o = launchIntentForPackage;
        this.q = new ArrayList();
        this.p = v23Var.i();
    }

    public /* synthetic */ na4(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4) {
        this.n = view;
        this.o = view2;
        this.p = view3;
        this.q = view4;
    }

    public na4(rm2 rm2Var) {
        this.n = rm2Var;
    }
}
