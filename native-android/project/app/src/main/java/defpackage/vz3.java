package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vz3 extends lq {
    public final Context I;
    public final c04 J;
    public final Class K;
    public final ii1 L;
    public jx4 M;
    public Object N;
    public ArrayList O;
    public vz3 P;
    public vz3 Q;
    public boolean R = true;
    public boolean S;
    public boolean T;

    static {
    }

    public vz3(a aVar, c04 c04Var, Class cls, Context context) {
        g04 g04Var;
        this.J = c04Var;
        this.K = cls;
        this.I = context;
        oi oiVar = c04Var.n.p.f;
        jx4 jx4Var = (jx4) oiVar.get(cls);
        if (jx4Var == null) {
            for (Map.Entry entry : (n60) oiVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    jx4Var = (jx4) entry.getValue();
                }
            }
        }
        this.M = jx4Var == null ? ii1.k : jx4Var;
        this.L = aVar.p;
        Iterator it = c04Var.v.iterator();
        while (it.hasNext()) {
            F((zz3) it.next());
        }
        synchronized (c04Var) {
            g04Var = c04Var.w;
        }
        a(g04Var);
    }

    public vz3 F(zz3 zz3Var) {
        if (this.E) {
            return clone().F(zz3Var);
        }
        if (zz3Var != null) {
            if (this.O == null) {
                this.O = new ArrayList();
            }
            this.O.add(zz3Var);
        }
        u();
        return this;
    }

    @Override // defpackage.lq
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public vz3 a(lq lqVar) {
        h12.e(lqVar);
        return (vz3) super.a(lqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final pz3 H(Object obj, wq4 wq4Var, zz3 zz3Var, wz3 wz3Var, jx4 jx4Var, eq3 eq3Var, int i, int i2, lq lqVar, Executor executor) {
        wz3 wz3Var2;
        wz3 e21Var;
        lq lqVar2;
        pz3 cf4Var;
        eq3 eq3Var2;
        if (this.Q != null) {
            e21Var = new e21(obj, wz3Var);
            wz3Var2 = e21Var;
        } else {
            wz3Var2 = null;
            e21Var = wz3Var;
        }
        vz3 vz3Var = this.P;
        if (vz3Var == null) {
            Context context = this.I;
            ii1 ii1Var = this.L;
            lqVar2 = lqVar;
            cf4Var = new cf4(context, ii1Var, obj, this.N, this.K, lqVar2, i, i2, eq3Var, wq4Var, zz3Var, this.O, e21Var, ii1Var.g, jx4Var.n, executor);
        } else {
            if (this.T) {
                kf2.o("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            jx4 jx4Var2 = vz3Var.R ? jx4Var : vz3Var.M;
            if (lq.j(vz3Var.n, 8)) {
                eq3Var2 = this.P.q;
            } else {
                int iOrdinal = eq3Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    eq3Var2 = eq3.n;
                } else if (iOrdinal == 2) {
                    eq3Var2 = eq3.o;
                } else {
                    if (iOrdinal != 3) {
                        kf2.l(this.q, "unknown priority: ");
                        return null;
                    }
                    eq3Var2 = eq3.p;
                }
            }
            eq3 eq3Var3 = eq3Var2;
            vz3 vz3Var2 = this.P;
            int i3 = vz3Var2.v;
            int i4 = vz3Var2.u;
            if (e35.I(i, i2)) {
                vz3 vz3Var3 = this.P;
                if (!e35.I(vz3Var3.v, vz3Var3.u)) {
                    i3 = lqVar.v;
                    i4 = lqVar.u;
                }
            }
            int i5 = i4;
            int i6 = i3;
            tt4 tt4Var = new tt4(obj, e21Var);
            Context context2 = this.I;
            ii1 ii1Var2 = this.L;
            cf4 cf4Var2 = new cf4(context2, ii1Var2, obj, this.N, this.K, lqVar, i, i2, eq3Var, wq4Var, zz3Var, this.O, tt4Var, ii1Var2.g, jx4Var.n, executor);
            this.T = true;
            vz3 vz3Var4 = this.P;
            pz3 pz3VarH = vz3Var4.H(obj, wq4Var, zz3Var, tt4Var, jx4Var2, eq3Var3, i6, i5, vz3Var4, executor);
            this.T = false;
            tt4Var.c = cf4Var2;
            tt4Var.d = pz3VarH;
            lqVar2 = lqVar;
            cf4Var = tt4Var;
        }
        if (wz3Var2 == null) {
            return cf4Var;
        }
        vz3 vz3Var5 = this.Q;
        int i7 = vz3Var5.v;
        int i8 = vz3Var5.u;
        if (e35.I(i, i2)) {
            vz3 vz3Var6 = this.Q;
            if (!e35.I(vz3Var6.v, vz3Var6.u)) {
                i7 = lqVar2.v;
                i8 = lqVar2.u;
            }
        }
        vz3 vz3Var7 = this.Q;
        e21 e21Var2 = wz3Var2;
        pz3 pz3VarH2 = vz3Var7.H(obj, wq4Var, zz3Var, e21Var2, vz3Var7.M, vz3Var7.q, i7, i8, vz3Var7, executor);
        e21Var2.c = cf4Var;
        e21Var2.d = pz3VarH2;
        return e21Var2;
    }

    @Override // defpackage.lq
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public vz3 clone() {
        vz3 vz3Var = (vz3) super.clone();
        vz3Var.M = vz3Var.M.clone();
        if (vz3Var.O != null) {
            vz3Var.O = new ArrayList(vz3Var.O);
        }
        vz3 vz3Var2 = vz3Var.P;
        if (vz3Var2 != null) {
            vz3Var.P = vz3Var2.clone();
        }
        vz3 vz3Var3 = vz3Var.Q;
        if (vz3Var3 != null) {
            vz3Var.Q = vz3Var3.clone();
        }
        return vz3Var;
    }

    public final void J(wq4 wq4Var, yz3 yz3Var, lq lqVar, Executor executor) {
        h12.e(wq4Var);
        if (!this.S) {
            kf2.n("You must call #load() before calling #into()");
            return;
        }
        pz3 pz3VarH = H(new Object(), wq4Var, yz3Var, null, this.M, lqVar.q, lqVar.v, lqVar.u, lqVar, executor);
        pz3 pz3VarL = wq4Var.l();
        if (pz3VarH.e(pz3VarL) && (lqVar.t || !pz3VarL.d())) {
            h12.f(pz3VarL, "Argument must not be null");
            if (pz3VarL.isRunning()) {
                return;
            }
            pz3VarL.k();
            return;
        }
        this.J.q(wq4Var);
        wq4Var.e(pz3VarH);
        c04 c04Var = this.J;
        synchronized (c04Var) {
            c04Var.s.n.add(wq4Var);
            mf4 mf4Var = c04Var.q;
            ((Set) mf4Var.p).add(pz3VarH);
            if (mf4Var.o) {
                pz3VarH.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) mf4Var.q).add(pz3VarH);
            } else {
                pz3VarH.k();
            }
        }
    }

    public final void K(ImageView imageView) {
        lq lqVarM;
        wq4 wsVar;
        e35.m();
        h12.e(imageView);
        if (!lq.j(this.n, 2048) && imageView.getScaleType() != null) {
            switch (uz3.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    lqVarM = clone().m();
                    break;
                case 2:
                    lqVarM = clone().n();
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                case 5:
                    lqVarM = clone().o();
                    break;
                case 6:
                    lqVarM = clone().n();
                    break;
                default:
                    lqVarM = this;
                    break;
            }
        } else {
            lqVarM = this;
        }
        this.L.c.getClass();
        Class cls = this.K;
        if (Bitmap.class.equals(cls)) {
            wsVar = new ws(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                nz2.A(cls, ", try .as*(Class).transcode(ResourceTranscoder)", "Unhandled class: ");
                return;
            }
            wsVar = new ws(imageView, 1);
        }
        J(wsVar, null, lqVarM, fh0.g);
    }

    public vz3 L(rj rjVar) {
        if (this.E) {
            return clone().L(rjVar);
        }
        this.O = null;
        return F(rjVar);
    }

    public vz3 M(vk4 vk4Var) {
        return Q(vk4Var);
    }

    public vz3 N(Uri uri) {
        PackageInfo packageInfo;
        vz3 vz3VarQ = Q(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return vz3VarQ;
        }
        Context context = this.I;
        vz3 vz3Var = (vz3) vz3VarQ.z(context.getTheme());
        ConcurrentHashMap concurrentHashMap = ai.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = ai.a;
        f42 f42Var = (f42) concurrentHashMap2.get(packageName);
        if (f42Var == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            s73 s73Var = new s73(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            f42 f42Var2 = (f42) concurrentHashMap2.putIfAbsent(packageName, s73Var);
            f42Var = f42Var2 == null ? s73Var : f42Var2;
        }
        return (vz3) vz3Var.w(new tc(context.getResources().getConfiguration().uiMode & 48, f42Var));
    }

    public vz3 O(File file) {
        return Q(file);
    }

    public vz3 P(String str) {
        return Q(str);
    }

    public final vz3 Q(Object obj) {
        if (this.E) {
            return clone().Q(obj);
        }
        this.N = obj;
        this.S = true;
        u();
        return this;
    }

    public final yz3 R(int i, int i2) {
        yz3 yz3Var = new yz3(i, i2);
        J(yz3Var, yz3Var, this, fh0.h);
        return yz3Var;
    }

    public vz3 S(vz3 vz3Var) {
        if (this.E) {
            return clone().S(vz3Var);
        }
        this.P = vz3Var;
        u();
        return this;
    }

    public vz3 T(xv0 xv0Var) {
        if (this.E) {
            return clone().T(xv0Var);
        }
        this.M = xv0Var;
        this.R = false;
        u();
        return this;
    }

    @Override // defpackage.lq
    public final boolean equals(Object obj) {
        if (!(obj instanceof vz3)) {
            return false;
        }
        vz3 vz3Var = (vz3) obj;
        return super.equals(vz3Var) && Objects.equals(this.K, vz3Var.K) && this.M.equals(vz3Var.M) && Objects.equals(this.N, vz3Var.N) && Objects.equals(this.O, vz3Var.O) && Objects.equals(this.P, vz3Var.P) && Objects.equals(this.Q, vz3Var.Q) && this.R == vz3Var.R && this.S == vz3Var.S;
    }

    @Override // defpackage.lq
    public final int hashCode() {
        return e35.E(this.S ? 1 : 0, e35.E(this.R ? 1 : 0, e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(super.hashCode(), this.K), this.M), this.N), this.O), this.P), this.Q), null)));
    }
}
