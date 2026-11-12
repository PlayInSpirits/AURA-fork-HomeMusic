package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.EOFException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z05 implements aw1, g84 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public z05(int i) {
        this.n = i;
        switch (i) {
            case 9:
                this.o = new AtomicReference(l93.c);
                this.p = new Object();
                break;
            default:
                this.q = new xi4(15);
                break;
        }
    }

    public static z84 e(Class cls, kx kxVar) {
        try {
            return (z84) cls.getConstructor(kx.class).newInstance(kxVar);
        } catch (Exception e) {
            mj0.j("Downloader factory missing", e);
            return null;
        }
    }

    @Override // defpackage.g84
    public void a(be3 be3Var) {
        long jD;
        long j;
        ((iu4) this.p).getClass();
        String str = f35.a;
        iu4 iu4Var = (iu4) this.p;
        synchronized (iu4Var) {
            try {
                long j2 = iu4Var.c;
                jD = j2 != -9223372036854775807L ? j2 + iu4Var.b : iu4Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        iu4 iu4Var2 = (iu4) this.p;
        synchronized (iu4Var2) {
            j = iu4Var2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        tb1 tb1Var = (tb1) this.o;
        if (j != tb1Var.s) {
            sb1 sb1VarA = tb1Var.a();
            sb1VarA.r = j;
            tb1 tb1Var2 = new tb1(sb1VarA);
            this.o = tb1Var2;
            ((wv4) this.q).g(tb1Var2);
        }
        int iA = be3Var.a();
        ((wv4) this.q).e(iA, be3Var);
        ((wv4) this.q).a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.g84
    public void b(iu4 iu4Var, m51 m51Var, sy4 sy4Var) {
        this.p = iu4Var;
        sy4Var.a();
        sy4Var.b();
        wv4 wv4VarT = m51Var.t(sy4Var.d, 5);
        this.q = wv4VarT;
        wv4VarT.g((tb1) this.o);
    }

    @Override // defpackage.aw1
    public int c() {
        List list = (List) this.p;
        ByteBuffer byteBufferC = vw.c((ByteBuffer) this.o);
        qj0 qj0Var = (qj0) this.q;
        if (byteBufferC != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iC = ((wv1) list.get(i)).c(byteBufferC, qj0Var);
                    if (iC != -1) {
                        return iC;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return -1;
    }

    public du0 d(tt0 tt0Var) {
        z84 z84VarM;
        zm2 zm2Var;
        bn2 bn2Var;
        ym2 ym2Var;
        um2 um2Var;
        bn2 bn2Var2;
        ym2 ym2Var2;
        kx kxVar = (kx) this.o;
        Uri uri = tt0Var.o;
        int iJ = f35.J(uri, tt0Var.p);
        boolean z = true;
        if (iJ != 0 && iJ != 1 && iJ != 2) {
            if (iJ != 4) {
                kf2.n(f34.f(iJ, "Unsupported type: "));
                return null;
            }
            rt0 rt0Var = tt0Var.u;
            um2 um2Var2 = new um2();
            xm2 xm2Var = new xm2();
            List list = Collections.EMPTY_LIST;
            gy3 gy3Var = gy3.r;
            zm2 zm2Var2 = new zm2();
            cn2 cn2Var = cn2.d;
            String str = tt0Var.s;
            if (((Uri) xm2Var.e) != null && ((UUID) xm2Var.d) == null) {
                z = false;
            }
            rr2.w(z);
            if (uri != null) {
                if (((UUID) xm2Var.d) != null) {
                    ym2Var2 = new ym2(xm2Var);
                    um2Var = um2Var2;
                } else {
                    um2Var = um2Var2;
                    ym2Var2 = null;
                }
                bn2Var2 = new bn2(uri, null, ym2Var2, null, list, str, gy3Var, -9223372036854775807L);
            } else {
                um2Var = um2Var2;
                bn2Var2 = null;
            }
            return new zq3(new gn2("", new wm2(um2Var), bn2Var2, new an2(zm2Var2), do2.K, cn2Var), kxVar, (Executor) this.p, rt0Var != null ? rt0Var.n : 0L, rt0Var != null ? rt0Var.o : -1L);
        }
        SparseArray sparseArray = (SparseArray) this.q;
        if (f35.l(sparseArray, iJ)) {
            z84VarM = (z84) sparseArray.get(iJ);
        } else {
            try {
                z84VarM = m(iJ, kxVar);
            } catch (ClassNotFoundException e) {
                mj0.j(f34.f(iJ, "Module missing for content type "), e);
                return null;
            }
        }
        um2 um2Var3 = new um2();
        xm2 xm2Var2 = new xm2();
        List listUnmodifiableList = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var3 = new zm2();
        cn2 cn2Var2 = cn2.d;
        List list2 = tt0Var.q;
        if (list2 != null && !list2.isEmpty()) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
        }
        List list3 = listUnmodifiableList;
        String str2 = tt0Var.s;
        if (((Uri) xm2Var2.e) != null && ((UUID) xm2Var2.d) == null) {
            z = false;
        }
        rr2.w(z);
        if (uri != null) {
            if (((UUID) xm2Var2.d) != null) {
                ym2Var = new ym2(xm2Var2);
                zm2Var = zm2Var3;
            } else {
                zm2Var = zm2Var3;
                ym2Var = null;
            }
            bn2Var = new bn2(uri, null, ym2Var, null, list3, str2, gy3Var2, -9223372036854775807L);
        } else {
            zm2Var = zm2Var3;
            bn2Var = null;
        }
        gn2 gn2Var = new gn2("", new wm2(um2Var3), bn2Var, new an2(zm2Var), do2.K, cn2Var2);
        st0 st0Var = tt0Var.v;
        if (st0Var != null) {
            lm1 lm1Var = (lm1) z84VarM;
            lm1Var.d = st0Var.n;
            lm1Var.e = st0Var.o;
        }
        Executor executor = (Executor) this.p;
        lm1 lm1Var2 = (lm1) z84VarM;
        lm1Var2.getClass();
        return new mm1(gn2Var, lm1Var2.b, lm1Var2.a, executor, lm1Var2.c, lm1Var2.d, lm1Var2.e);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f A[RETURN, SYNTHETIC] */
    public boolean equals(Object obj) {
        switch (this.n) {
            case 0:
                GenericDeclaration genericDeclaration = (GenericDeclaration) this.o;
                String str = (String) this.p;
                if (!y05.a) {
                    if (obj instanceof TypeVariable) {
                        TypeVariable typeVariable = (TypeVariable) obj;
                        if (str.equals(typeVariable.getName()) && genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                            return true;
                        }
                    }
                    return false;
                }
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof a15)) {
                    z05 z05Var = ((a15) Proxy.getInvocationHandler(obj)).a;
                    if (str.equals((String) z05Var.p) && genericDeclaration.equals((GenericDeclaration) z05Var.o) && ((gy3) this.q).equals((gy3) z05Var.q)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public Object f() {
        long jM = te5.m();
        if (jM == nt4.a) {
            return this.q;
        }
        kt4 kt4Var = (kt4) ((AtomicReference) this.o).get();
        int iA = kt4Var.a(jM);
        if (iA >= 0) {
            return kt4Var.c[iA];
        }
        return null;
    }

    public long g() {
        rk0 rk0Var = (rk0) this.q;
        if (rk0Var != null) {
            return rk0Var.q;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public void h(ci0 ci0Var, Uri uri, Map map, long j, long j2, hr3 hr3Var) throws UnrecognizedInputFormatException {
        rk0 rk0Var = new rk0(ci0Var, j, j2);
        this.q = rk0Var;
        if (((k51) this.p) != null) {
            return;
        }
        k51[] k51VarArrE = ((n51) this.o).e(uri, map);
        int length = k51VarArrE.length;
        vw1 vw1Var = yw1.o;
        uc5.f(length, "expectedSize");
        uw1 uw1Var = new uw1(length);
        boolean z = true;
        if (k51VarArrE.length == 1) {
            this.p = k51VarArrE[0];
        } else {
            for (k51 k51Var : k51VarArrE) {
                try {
                    if (k51Var.c(rk0Var)) {
                        this.p = k51Var;
                        rk0Var.s = 0;
                        break;
                    }
                    uw1Var.d(k51Var.e());
                    boolean z2 = ((k51) this.p) != null || rk0Var.q == j;
                    rr2.w(z2);
                    rk0Var.s = 0;
                } catch (EOFException unused) {
                    if (((k51) this.p) != null || rk0Var.q == j) {
                    }
                } catch (Throwable th) {
                    if (((k51) this.p) == null && rk0Var.q != j) {
                        z = false;
                    }
                    rr2.w(z);
                    rk0Var.s = 0;
                    throw th;
                }
                rr2.w(z2);
                rk0Var.s = 0;
            }
            if (((k51) this.p) == null) {
                String str = "None of the available extractors (" + new uc0(", ").b(hw.P(new kf2(14), yw1.l(k51VarArrE))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, uw1Var.f());
            }
        }
        ((k51) this.p).f(hr3Var);
    }

    public int hashCode() {
        switch (this.n) {
            case 0:
                return ((String) this.p).hashCode() ^ ((GenericDeclaration) this.o).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new uw(vw.c((ByteBuffer) this.o)), null, options);
    }

    public boolean j() {
        if (((kl4) this.o).getValue() != this.q) {
            return true;
        }
        z05 z05Var = (z05) this.p;
        return z05Var != null && z05Var.j();
    }

    @Override // defpackage.aw1
    public void k() {
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() {
        return kb4.C((List) this.p, vw.c((ByteBuffer) this.o));
    }

    public z84 m(int i, kx kxVar) {
        z84 z84VarE;
        if (i == 0) {
            z84VarE = e(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(z84.class), kxVar);
        } else if (i == 1) {
            z84VarE = e(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(z84.class), kxVar);
        } else {
            if (i != 2) {
                kf2.n(f34.f(i, "Unsupported type: "));
                return null;
            }
            z84VarE = e(lm1.class.asSubclass(z84.class), kxVar);
        }
        ((SparseArray) this.q).put(i, z84VarE);
        return z84VarE;
    }

    public void n(Object obj) {
        long jM = te5.m();
        if (jM == nt4.a) {
            this.q = obj;
            return;
        }
        synchronized (this.p) {
            kt4 kt4Var = (kt4) ((AtomicReference) this.o).get();
            int iA = kt4Var.a(jM);
            if (iA < 0) {
                ((AtomicReference) this.o).set(kt4Var.b(jM, obj));
            } else {
                kt4Var.c[iA] = obj;
            }
        }
    }

    public String toString() {
        switch (this.n) {
            case 0:
                return (String) this.p;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z05(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    public z05(String str) {
        this.n = 8;
        sb1 sb1Var = new sb1();
        sb1Var.l = lw2.m("video/mp2t");
        sb1Var.m = lw2.m(str);
        this.o = new tb1(sb1Var);
    }

    public z05(n51 n51Var) {
        this.n = 2;
        this.o = n51Var;
    }

    public z05(kx kxVar, Executor executor) {
        this.n = 3;
        this.o = kxVar;
        executor.getClass();
        this.p = executor;
        this.q = new SparseArray();
    }

    public z05(n05 n05Var, z05 z05Var) {
        this.n = 10;
        this.o = n05Var;
        this.p = z05Var;
        this.q = n05Var.n;
    }

    public z05(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        this.n = 0;
        b15.b(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.o = genericDeclaration;
        str.getClass();
        this.p = str;
        this.q = yw1.l(typeArr);
    }

    public z05(i11 i11Var, cf4 cf4Var, m11 m11Var) {
        this.n = 4;
        this.q = i11Var;
        this.p = cf4Var;
        this.o = m11Var;
    }

    public z05(im2 im2Var) {
        this.n = 7;
        this.q = im2Var;
        this.o = new dj2(this);
    }
}
