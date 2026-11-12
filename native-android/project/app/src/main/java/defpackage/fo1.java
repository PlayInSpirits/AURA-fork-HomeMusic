package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.eddyizm.tempus.homemusic.HubGoogleLogin;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.Matrix[], java.io.Serializable] */
    public fo1() {
        this.b = new kc4[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new kc4();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((kc4[]) this.b)[i] = new kc4();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public static final void a(fo1 fo1Var, String str) {
        ud3.w0(null);
        ud3.v0(null);
        ud3.D0(null);
        ud3.q0(null);
        ud3.C0(null);
        ud3.u0(null);
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        if (fo1Var.c()) {
            fo1Var.r(false);
            co1 co1Var = (co1) fo1Var.d;
            if (co1Var == co1.p || co1Var == co1.q) {
                fo1Var.s(co1.o);
            }
            fo1Var.t(str);
        }
    }

    public cu4 b(int i, ArrayList arrayList, pd4 pd4Var) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = pd4Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                bu2 bu2Var = (bu2) arrayList.get(i2 - i);
                if (i2 > 0) {
                    bu2 bu2Var2 = (bu2) arrayList2.get(i2 - 1);
                    bu2Var.d = bu2Var2.a.o.e.o() + bu2Var2.d;
                    bu2Var.e = false;
                    bu2Var.c.clear();
                } else {
                    bu2Var.d = 0;
                    bu2Var.e = false;
                    bu2Var.c.clear();
                }
                int iO = bu2Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((bu2) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, bu2Var);
                ((HashMap) this.e).put(bu2Var.b, bu2Var);
                if (this.a) {
                    l(bu2Var);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(bu2Var);
                    } else {
                        au2 au2Var = (au2) ((HashMap) this.g).get(bu2Var);
                        if (au2Var != null) {
                            au2Var.a.c(au2Var.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public boolean c() {
        LoginFragment loginFragment = (LoginFragment) this.b;
        return loginFragment.y() && loginFragment.T != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(bc4 bc4Var, float f, RectF rectF, pz1 pz1Var, Path path) {
        char c;
        int i;
        fz0 fz0Var;
        Path path2;
        pz1 pz1Var2;
        char c2;
        ke0 ke0Var;
        su3 su3Var;
        pz1 pz1Var3 = pz1Var;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr = (float[]) this.i;
        kc4[] kc4VarArr = (kc4[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path3.rewind();
        Path path4 = (Path) this.f;
        path4.rewind();
        Path path5 = (Path) this.g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            if (i2 == 1) {
                ke0Var = bc4Var.g;
            } else if (i2 != 2) {
                ke0Var = i2 != 3 ? bc4Var.f : bc4Var.e;
            } else {
                ke0Var = bc4Var.h;
            }
            if (i2 == 1) {
                su3Var = bc4Var.c;
            } else if (i2 != 2) {
                su3Var = i2 != 3 ? bc4Var.b : bc4Var.a;
            } else {
                su3Var = bc4Var.d;
            }
            Matrix[] matrixArr3 = matrixArr;
            kc4 kc4Var = kc4VarArr[i2];
            su3Var.getClass();
            su3Var.r(kc4Var, f, ke0Var.a(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            kc4 kc4Var2 = kc4VarArr[i2];
            fArr[0] = kc4Var2.c;
            fArr[1] = kc4Var2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f2);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c3 = 1;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            kc4 kc4Var3 = kc4VarArr[i4];
            fArr[c] = kc4Var3.a;
            fArr[c3] = kc4Var3.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c], fArr[c3]);
            } else {
                path3.lineTo(fArr[c], fArr[c3]);
            }
            kc4VarArr[i4].b(matrixArr2[i4], path3);
            if (pz1Var3 != null) {
                kc4 kc4Var4 = kc4VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                fi2 fi2Var = (fi2) pz1Var3.o;
                BitSet bitSet = fi2Var.q;
                kc4Var4.getClass();
                bitSet.set(i4, (boolean) c);
                jc4[] jc4VarArr = fi2Var.o;
                kc4Var4.a(kc4Var4.f);
                jc4VarArr[i4] = new dc4(new ArrayList(kc4Var4.h), new Matrix(matrix));
            }
            Path path6 = (Path) this.k;
            kc4 kc4Var5 = (kc4) this.h;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            kc4 kc4Var6 = kc4VarArr[i4];
            kc4[] kc4VarArr2 = kc4VarArr;
            fArr[0] = kc4Var6.c;
            fArr[1] = kc4Var6.d;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.j;
            kc4 kc4Var7 = kc4VarArr2[i6];
            Matrix[] matrixArr5 = matrixArr2;
            fArr2[0] = kc4Var7.a;
            fArr2[1] = kc4Var7.b;
            matrixArr5[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            kc4 kc4Var8 = kc4VarArr2[i4];
            fArr[0] = kc4Var8.c;
            fArr[1] = kc4Var8.d;
            matrixArr5[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            kc4Var5.d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                fz0Var = bc4Var.k;
            } else if (i4 != 2) {
                fz0Var = i4 != 3 ? bc4Var.j : bc4Var.i;
            } else {
                fz0Var = bc4Var.l;
            }
            fz0Var.j(fMax, fAbs, f, kc4Var5);
            path6.reset();
            kc4Var5.b(matrixArr4[i4], path6);
            if (this.a && (fz0Var.i() || k(path6, i4) || k(path6, i6))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = kc4Var5.a;
                c3 = 1;
                fArr[1] = kc4Var5.b;
                matrixArr4[i4].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                kc4Var5.b(matrixArr4[i4], path4);
                path2 = path;
            } else {
                c3 = 1;
                path2 = path;
                kc4Var5.b(matrixArr4[i4], path2);
            }
            if (pz1Var != null) {
                Matrix matrix2 = matrixArr4[i4];
                pz1Var2 = pz1Var;
                fi2 fi2Var2 = (fi2) pz1Var2.o;
                c2 = 0;
                fi2Var2.q.set(i4 + 4, false);
                jc4[] jc4VarArr2 = fi2Var2.p;
                kc4Var5.a(kc4Var5.f);
                jc4VarArr2[i4] = new dc4(new ArrayList(kc4Var5.h), new Matrix(matrix2));
            } else {
                pz1Var2 = pz1Var;
                c2 = 0;
            }
            path3 = path2;
            pz1Var3 = pz1Var2;
            i4 = i5;
            c = c2;
            kc4VarArr = kc4VarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public void e() {
        t(null);
        uc1 uc1Var = (uc1) this.c;
        Iterator it = gb.P(uc1Var.u, uc1Var.f, uc1Var.d, uc1Var.A, uc1Var.n, uc1Var.m).iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setError(null);
        }
    }

    public cu4 f() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return cu4.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            bu2 bu2Var = (bu2) arrayList.get(i);
            bu2Var.d = iO;
            iO += bu2Var.a.o.e.o();
        }
        return new tm3(arrayList, (pd4) this.k);
    }

    public void g() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            bu2 bu2Var = (bu2) it.next();
            if (bu2Var.c.isEmpty()) {
                au2 au2Var = (au2) ((HashMap) this.g).get(bu2Var);
                if (au2Var != null) {
                    au2Var.a.c(au2Var.b);
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    public boolean h() {
        HubAuthOptions hubAuthOptions = (HubAuthOptions) this.i;
        if (hubAuthOptions == null || !hubAuthOptions.getInvites()) {
            return false;
        }
        String musicUrl = hubAuthOptions.getMusicUrl();
        if (musicUrl == null) {
            musicUrl = "http://192.168.1.129:4533";
        } else {
            if (qm4.u0(musicUrl)) {
                musicUrl = null;
            }
            if (musicUrl == null) {
                musicUrl = "http://192.168.1.129:4533";
            }
        }
        return l93.b0((String) this.e, musicUrl) || l93.b0((String) this.e, "http://192.168.1.129:4533");
    }

    public void i(bu2 bu2Var) {
        if (bu2Var.e && bu2Var.c.isEmpty()) {
            au2 au2Var = (au2) ((HashMap) this.g).remove(bu2Var);
            au2Var.getClass();
            zt2 zt2Var = au2Var.c;
            bq bqVar = au2Var.a;
            bqVar.o(au2Var.b);
            bqVar.r(zt2Var);
            bqVar.q(zt2Var);
            ((HashSet) this.h).remove(bu2Var);
        }
    }

    public boolean j(String str) {
        uc1 uc1Var = (uc1) this.c;
        TextInputLayout textInputLayout = uc1Var.n;
        if (!p(textInputLayout, str)) {
            return false;
        }
        if (str.length() < 6) {
            textInputLayout.setError(v(R.string.homemusic_login_short_password, new Object[0]));
            return false;
        }
        if (str.equals(String.valueOf(uc1Var.l.getText()))) {
            return true;
        }
        uc1Var.m.setError(v(R.string.homemusic_login_mismatch, new Object[0]));
        return false;
    }

    public boolean k(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((kc4[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [nt2, ut2] */
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
    public void l(bu2 bu2Var) {
        rg2 rg2Var = bu2Var.a;
        ?? r1 = new nt2() { // from class: ut2
            @Override // defpackage.nt2
            public final void a(bq bqVar, cu4 cu4Var) {
                yp4 yp4Var = ((q41) this.a.f).u;
                yp4Var.f(2);
                yp4Var.g(22);
            }
        };
        zt2 zt2Var = new zt2(this, bu2Var);
        ((HashMap) this.g).put(bu2Var, new au2(rg2Var, r1, zt2Var));
        Handler handlerQ = f35.q(null);
        rg2Var.getClass();
        ue1 ue1Var = rg2Var.c;
        ue1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ue1Var.q;
        rt2 rt2Var = new rt2();
        rt2Var.a = handlerQ;
        rt2Var.b = zt2Var;
        copyOnWriteArrayList.add(rt2Var);
        Handler handlerQ2 = f35.q(null);
        sw0 sw0Var = rg2Var.d;
        sw0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = sw0Var.c;
        rw0 rw0Var = new rw0();
        rw0Var.a = handlerQ2;
        rw0Var.b = zt2Var;
        copyOnWriteArrayList2.add(rw0Var);
        rg2Var.k(r1, (rw4) this.l, (ik3) this.b);
    }

    public void m() {
        uc1 uc1Var = (uc1) this.c;
        TextInputLayout textInputLayout = uc1Var.d;
        TextInputEditText textInputEditText = uc1Var.c;
        TextInputLayout textInputLayout2 = uc1Var.A;
        TextInputEditText textInputEditText2 = uc1Var.k;
        TextInputEditText textInputEditText3 = uc1Var.z;
        if (this.a) {
            return;
        }
        int iOrdinal = ((co1) this.d).ordinal();
        if (iOrdinal == 0) {
            String strM = l93.M(String.valueOf(uc1Var.r.getText()));
            if (strM == null) {
                uc1Var.u.setError(v(R.string.homemusic_login_server_bad, new Object[0]));
                return;
            } else {
                r(true);
                io1.a.execute(new yn1(strM, this));
                return;
            }
        }
        int i = 10;
        Object obj = null;
        if (iOrdinal == 1) {
            String string = qm4.K0(String.valueOf(textInputEditText3.getText())).toString();
            String strValueOf = String.valueOf(textInputEditText2.getText());
            if (p(textInputLayout2, string) && p(uc1Var.n, strValueOf)) {
                if (!qm4.n0(string, '@') || !h()) {
                    u(string, strValueOf);
                    return;
                }
                fa faVar = new fa(8, string, strValueOf);
                r(true);
                io1.a.execute(new v6(faVar, this, obj, i));
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            final String string2 = qm4.K0(String.valueOf(textInputEditText.getText())).toString();
            final String string3 = qm4.K0(String.valueOf(textInputEditText3.getText())).toString();
            final String strValueOf2 = String.valueOf(textInputEditText2.getText());
            final String str = (String) this.f;
            if (p(textInputLayout, string2) && p(textInputLayout2, string3)) {
                if (str != null || j(strValueOf2)) {
                    final int i2 = 1;
                    gf1 gf1Var = new gf1() { // from class: ao1
                        @Override // defpackage.gf1
                        public final Object invoke() {
                            int i3 = i2;
                            String str2 = strValueOf2;
                            String str3 = string3;
                            String str4 = string2;
                            String str5 = str;
                            switch (i3) {
                                case 0:
                                    rr1 rr1Var = rr1.a;
                                    str5.getClass();
                                    rr1 rr1Var2 = rr1.a;
                                    return new kd3(str3, str2);
                                default:
                                    if (str5 == null) {
                                        rr1 rr1Var3 = rr1.a;
                                        return new kd3(str3, str2);
                                    }
                                    HubGoogleLogin hubGoogleLoginL = rr1.l(str5, str4, str3);
                                    String username = hubGoogleLoginL.getUsername();
                                    if (username != null) {
                                        str3 = username;
                                    }
                                    String password = hubGoogleLoginL.getPassword();
                                    if (password == null) {
                                        password = "";
                                    }
                                    return new kd3(str3, password);
                            }
                        }
                    };
                    r(true);
                    io1.a.execute(new v6(gf1Var, this, obj, i));
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 3) {
            er1.n();
            return;
        }
        final String str2 = (String) this.h;
        if (str2 == null) {
            q();
            return;
        }
        final String string4 = qm4.K0(String.valueOf(textInputEditText.getText())).toString();
        final String string5 = qm4.K0(String.valueOf(textInputEditText3.getText())).toString();
        final String strValueOf3 = String.valueOf(textInputEditText2.getText());
        if (p(textInputLayout, string4) && p(textInputLayout2, string5) && j(strValueOf3)) {
            final int i3 = 0;
            gf1 gf1Var2 = new gf1() { // from class: ao1
                @Override // defpackage.gf1
                public final Object invoke() {
                    int i4 = i3;
                    String str3 = strValueOf3;
                    String str4 = string5;
                    String str5 = string4;
                    String str6 = str2;
                    switch (i4) {
                        case 0:
                            rr1 rr1Var = rr1.a;
                            str6.getClass();
                            rr1 rr1Var2 = rr1.a;
                            return new kd3(str4, str3);
                        default:
                            if (str6 == null) {
                                rr1 rr1Var3 = rr1.a;
                                return new kd3(str4, str3);
                            }
                            HubGoogleLogin hubGoogleLoginL = rr1.l(str6, str5, str4);
                            String username = hubGoogleLoginL.getUsername();
                            if (username != null) {
                                str4 = username;
                            }
                            String password = hubGoogleLoginL.getPassword();
                            if (password == null) {
                                password = "";
                            }
                            return new kd3(str4, password);
                    }
                }
            };
            r(true);
            io1.a.execute(new v6(gf1Var2, this, obj, i));
        }
    }

    public void n(no2 no2Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        bu2 bu2Var = (bu2) identityHashMap.remove(no2Var);
        bu2Var.getClass();
        bu2Var.a.n(no2Var);
        bu2Var.c.remove(((og2) no2Var).n);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        i(bu2Var);
    }

    public void o(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            bu2 bu2Var = (bu2) arrayList.remove(i3);
            ((HashMap) this.e).remove(bu2Var.b);
            int i4 = -bu2Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((bu2) arrayList.get(i5)).d += i4;
            }
            bu2Var.e = true;
            if (this.a) {
                i(bu2Var);
            }
        }
    }

    public boolean p(TextInputLayout textInputLayout, String str) {
        if (str.length() > 0) {
            return true;
        }
        textInputLayout.setError(v(R.string.homemusic_login_required, new Object[0]));
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.requestFocus();
        }
        return false;
    }

    public void q() {
        uc1 uc1Var = (uc1) this.c;
        String string = qm4.K0(String.valueOf(uc1Var.e.getText())).toString();
        TextInputLayout textInputLayout = uc1Var.f;
        if (p(textInputLayout, string)) {
            if (!qm4.n0(string, '@')) {
                textInputLayout.setError(v(R.string.homemusic_login_email_bad, new Object[0]));
            } else {
                r(true);
                io1.a.execute(new yn1(this, string));
            }
        }
    }

    public void r(boolean z) {
        this.a = z;
        uc1 uc1Var = (uc1) this.c;
        uc1Var.p.setVisibility(z ? 0 : 4);
        Iterator it = gb.P(uc1Var.o, uc1Var.i, uc1Var.y, uc1Var.g, uc1Var.v, uc1Var.s).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(!z);
        }
        Iterator it2 = gb.P(uc1Var.r, uc1Var.e, uc1Var.c, uc1Var.z, uc1Var.k, uc1Var.l).iterator();
        while (it2.hasNext()) {
            ((TextInputEditText) it2.next()).setEnabled(!z);
        }
        w();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01be  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:159:0x020c  */
    /* JADX WARN: Code duplicated, block: B:172:0x022e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0239  */
    /* JADX WARN: Code duplicated, block: B:177:0x023c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0242  */
    /* JADX WARN: Code duplicated, block: B:181:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0247  */
    /* JADX WARN: Code duplicated, block: B:184:0x0252  */
    /* JADX WARN: Code duplicated, block: B:186:0x0256  */
    /* JADX WARN: Code duplicated, block: B:187:0x025e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0264  */
    /* JADX WARN: Code duplicated, block: B:192:0x0268  */
    /* JADX WARN: Code duplicated, block: B:194:0x0272  */
    /* JADX WARN: Code duplicated, block: B:197:0x0283  */
    /* JADX WARN: Code duplicated, block: B:198:0x0285  */
    /* JADX WARN: Code duplicated, block: B:205:0x029b  */
    /* JADX WARN: Code duplicated, block: B:207:0x029e  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:230:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    public void s(co1 co1Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        co1 co1Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int iOrdinal;
        String strV;
        TextInputEditText textInputEditText;
        String strV2;
        int iOrdinal2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iOrdinal3;
        int i18;
        CharSequence text;
        int i19;
        int iOrdinal4;
        Editable text2;
        TextInputEditText textInputEditText2;
        int i20;
        int i21;
        String str2;
        String str3;
        HubAuthOptions hubAuthOptions;
        uc1 uc1Var = (uc1) this.c;
        TextInputEditText textInputEditText3 = uc1Var.z;
        TextView textView = uc1Var.j;
        MaterialButton materialButton = uc1Var.y;
        TextInputEditText textInputEditText4 = uc1Var.k;
        TextInputLayout textInputLayout = uc1Var.A;
        TextInputLayout textInputLayout2 = uc1Var.d;
        TextInputEditText textInputEditText5 = uc1Var.c;
        co1 co1Var3 = co1.p;
        if (co1Var != co1Var3) {
            this.f = null;
            this.g = null;
        }
        boolean z3 = co1Var != ((co1) this.d);
        if (z3) {
            textInputEditText5.setText((CharSequence) null);
        }
        this.d = co1Var;
        bd1 bd1Var = (bd1) this.k;
        co1 co1Var4 = co1.n;
        bd1Var.c(co1Var != co1Var4);
        e();
        boolean z4 = ((String) this.f) != null;
        boolean z5 = co1Var == co1.q;
        boolean z6 = z5 && ((String) this.h) == null;
        boolean z7 = co1Var == co1Var3 || z5;
        boolean zH = h();
        if (zH && (hubAuthOptions = (HubAuthOptions) this.i) != null) {
            z = z3;
            z2 = hubAuthOptions.getEmailSignup();
            LinearLayout linearLayout = uc1Var.w;
            if (co1Var == co1Var4) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            LinearLayout linearLayout2 = uc1Var.b;
            if (co1Var != co1Var4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            linearLayout2.setVisibility(i2);
            uc1Var.t.setText((String) this.e);
            TextInputLayout textInputLayout3 = uc1Var.f;
            if (z5) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textInputLayout3.setVisibility(i3);
            if (co1Var != co1Var3 || (z5 && !z6)) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            textInputLayout2.setVisibility(i4);
            if (z5) {
                i5 = R.string.homemusic_login_email_code;
            } else {
                i5 = R.string.homemusic_login_code;
            }
            textInputLayout2.setHint(v(i5, new Object[0]));
            if (z5) {
                str = "000000";
            } else {
                str = "ABCD-EFGH";
            }
            textInputLayout2.setPlaceholderText(str);
            if (z5) {
                i6 = 2;
            } else {
                i6 = 528529;
            }
            textInputEditText5.setInputType(i6);
            MaterialButton materialButton2 = uc1Var.q;
            if (z5 || z6) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            materialButton2.setVisibility(i7);
            if (z6) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            textInputLayout.setVisibility(i8);
            co1Var2 = co1.o;
            if (co1Var == co1Var2 || !z2) {
                i9 = R.string.homemusic_login_user;
            } else {
                i9 = R.string.homemusic_login_user_or_email;
            }
            textInputLayout.setHint(v(i9, new Object[0]));
            TextInputLayout textInputLayout4 = uc1Var.n;
            if (!z6 || (co1Var != co1Var2 && (!z7 || z4))) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textInputLayout4.setVisibility(i10);
            TextInputLayout textInputLayout5 = uc1Var.m;
            if (z6 && z7 && !z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textInputLayout5.setVisibility(i11);
            if (z7) {
                i12 = 5;
            } else {
                i12 = 2;
            }
            textInputEditText4.setImeOptions(i12);
            TextView textView2 = uc1Var.x;
            iOrdinal = co1Var.ordinal();
            strV = "";
            if (iOrdinal != 0) {
                textInputEditText = textInputEditText4;
                strV2 = v(R.string.homemusic_login_server_subtitle, new Object[0]);
            } else if (iOrdinal != 1) {
                textInputEditText = textInputEditText4;
                strV2 = v(R.string.homemusic_login_account_subtitle, new Object[0]);
            } else if (iOrdinal != 2) {
                textInputEditText = textInputEditText4;
                if (z4) {
                    str2 = (String) this.g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    strV2 = v(R.string.homemusic_login_google_register_subtitle, str2);
                } else {
                    strV2 = v(R.string.homemusic_login_register_subtitle, new Object[0]);
                }
            } else {
                if (iOrdinal == 3) {
                    er1.n();
                    return;
                }
                str3 = (String) this.h;
                if (str3 != null) {
                    strV2 = v(R.string.homemusic_login_email_sent, str3);
                    textInputEditText = textInputEditText4;
                } else {
                    textInputEditText = textInputEditText4;
                    strV2 = v(R.string.homemusic_login_email_subtitle, new Object[0]);
                }
            }
            textView2.setText(strV2);
            MaterialButton materialButton3 = uc1Var.o;
            iOrdinal2 = co1Var.ordinal();
            if (iOrdinal2 != 0) {
                i13 = R.string.homemusic_login_next;
            } else if (iOrdinal2 != 1) {
                i13 = R.string.homemusic_login_create;
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        er1.n();
                        return;
                    } else if (z6) {
                        i13 = R.string.homemusic_login_email_send;
                    }
                }
            } else {
                i13 = R.string.homemusic_login_sign_in;
            }
            materialButton3.setText(v(i13, new Object[0]));
            if (zH || co1Var == co1Var4 || z4) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            materialButton.setVisibility(i14);
            if (co1Var == co1Var2) {
                i15 = R.string.homemusic_login_to_register;
            } else {
                i15 = R.string.homemusic_login_to_account;
            }
            materialButton.setText(v(i15, new Object[0]));
            MaterialButton materialButton4 = uc1Var.g;
            if (co1Var == co1Var2 || z2 == 0) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            materialButton4.setVisibility(i16);
            MaterialButton materialButton5 = uc1Var.i;
            if (co1Var == co1Var2 || !zH) {
                i17 = 8;
            } else {
                HubAuthOptions hubAuthOptions2 = (HubAuthOptions) this.i;
                String googleClientId = hubAuthOptions2 != null ? hubAuthOptions2.getGoogleClientId() : null;
                if (googleClientId == null || qm4.u0(googleClientId)) {
                    i17 = 8;
                } else {
                    i17 = 0;
                }
            }
            materialButton5.setVisibility(i17);
            iOrdinal3 = co1Var.ordinal();
            if (iOrdinal3 != 0) {
                i18 = 0;
            } else if (iOrdinal3 != 1) {
                i21 = R.string.homemusic_login_register_hint;
                if (iOrdinal3 != 2) {
                    i18 = 0;
                    strV = v(R.string.homemusic_login_register_hint, new Object[0]);
                } else {
                    if (iOrdinal3 == 3) {
                        er1.n();
                        return;
                    }
                    if (z6) {
                        i21 = R.string.homemusic_login_email_hint;
                    }
                    i18 = 0;
                    strV = v(i21, new Object[0]);
                }
            } else {
                i18 = 0;
                if (zH) {
                    if (z2 != 0) {
                        i20 = R.string.homemusic_login_hint_email;
                    } else {
                        i20 = R.string.homemusic_login_hint;
                    }
                    strV = v(i20, new Object[0]);
                }
            }
            textView.setText(strV);
            text = textView.getText();
            text.getClass();
            if (text.length() > 0) {
                i19 = i18;
            } else {
                i19 = 8;
            }
            textView.setVisibility(i19);
            x();
            w();
            if (!z || z5) {
                iOrdinal4 = co1Var.ordinal();
                if (iOrdinal4 != 0) {
                    uc1Var.r.requestFocus();
                    return;
                }
                if (iOrdinal4 != 1) {
                    text2 = textInputEditText3.getText();
                    if (text2 != null || text2.length() == 0) {
                        textInputEditText2 = textInputEditText3;
                    } else {
                        textInputEditText2 = textInputEditText;
                    }
                    textInputEditText2.requestFocus();
                    return;
                }
                if (iOrdinal4 != 2) {
                    textInputEditText5.requestFocus();
                    return;
                }
                if (iOrdinal4 == 3) {
                    er1.n();
                } else if (z6) {
                    textInputEditText5.requestFocus();
                } else if (z) {
                    uc1Var.e.requestFocus();
                }
            }
            return;
        }
        z = z3;
        LinearLayout linearLayout3 = uc1Var.w;
        if (co1Var == co1Var4) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout3.setVisibility(i);
        LinearLayout linearLayout4 = uc1Var.b;
        if (co1Var != co1Var4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout4.setVisibility(i2);
        uc1Var.t.setText((String) this.e);
        TextInputLayout textInputLayout6 = uc1Var.f;
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textInputLayout6.setVisibility(i3);
        if (co1Var != co1Var3) {
            i4 = 0;
        } else {
            i4 = 0;
        }
        textInputLayout2.setVisibility(i4);
        if (z5) {
            i5 = R.string.homemusic_login_email_code;
        } else {
            i5 = R.string.homemusic_login_code;
        }
        textInputLayout2.setHint(v(i5, new Object[0]));
        if (z5) {
            str = "000000";
        } else {
            str = "ABCD-EFGH";
        }
        textInputLayout2.setPlaceholderText(str);
        if (z5) {
            i6 = 2;
        } else {
            i6 = 528529;
        }
        textInputEditText5.setInputType(i6);
        MaterialButton materialButton6 = uc1Var.q;
        if (z5) {
            i7 = 8;
        } else {
            i7 = 8;
        }
        materialButton6.setVisibility(i7);
        if (z6) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        textInputLayout.setVisibility(i8);
        co1Var2 = co1.o;
        if (co1Var == co1Var2) {
            i9 = R.string.homemusic_login_user;
        } else {
            i9 = R.string.homemusic_login_user;
        }
        textInputLayout.setHint(v(i9, new Object[0]));
        TextInputLayout textInputLayout7 = uc1Var.n;
        if (z6) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        textInputLayout7.setVisibility(i10);
        TextInputLayout textInputLayout8 = uc1Var.m;
        if (z6) {
            i11 = 8;
        } else {
            i11 = 8;
        }
        textInputLayout8.setVisibility(i11);
        if (z7) {
            i12 = 5;
        } else {
            i12 = 2;
        }
        textInputEditText4.setImeOptions(i12);
        TextView textView3 = uc1Var.x;
        iOrdinal = co1Var.ordinal();
        strV = "";
        if (iOrdinal != 0) {
            textInputEditText = textInputEditText4;
            strV2 = v(R.string.homemusic_login_server_subtitle, new Object[0]);
        } else if (iOrdinal != 1) {
            textInputEditText = textInputEditText4;
            strV2 = v(R.string.homemusic_login_account_subtitle, new Object[0]);
        } else if (iOrdinal != 2) {
            textInputEditText = textInputEditText4;
            if (z4) {
                str2 = (String) this.g;
                if (str2 == null) {
                    str2 = "";
                }
                strV2 = v(R.string.homemusic_login_google_register_subtitle, str2);
            } else {
                strV2 = v(R.string.homemusic_login_register_subtitle, new Object[0]);
            }
        } else {
            if (iOrdinal == 3) {
                er1.n();
                return;
            }
            str3 = (String) this.h;
            if (str3 != null) {
                strV2 = v(R.string.homemusic_login_email_sent, str3);
                textInputEditText = textInputEditText4;
            } else {
                textInputEditText = textInputEditText4;
                strV2 = v(R.string.homemusic_login_email_subtitle, new Object[0]);
            }
        }
        textView3.setText(strV2);
        MaterialButton materialButton7 = uc1Var.o;
        iOrdinal2 = co1Var.ordinal();
        if (iOrdinal2 != 0) {
            i13 = R.string.homemusic_login_next;
        } else if (iOrdinal2 != 1) {
            i13 = R.string.homemusic_login_create;
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    er1.n();
                    return;
                } else if (z6) {
                    i13 = R.string.homemusic_login_email_send;
                }
            }
        } else {
            i13 = R.string.homemusic_login_sign_in;
        }
        materialButton7.setText(v(i13, new Object[0]));
        if (zH) {
            i14 = 8;
        } else {
            i14 = 8;
        }
        materialButton.setVisibility(i14);
        if (co1Var == co1Var2) {
            i15 = R.string.homemusic_login_to_register;
        } else {
            i15 = R.string.homemusic_login_to_account;
        }
        materialButton.setText(v(i15, new Object[0]));
        MaterialButton materialButton8 = uc1Var.g;
        if (co1Var == co1Var2) {
            i16 = 8;
        } else {
            i16 = 8;
        }
        materialButton8.setVisibility(i16);
        MaterialButton materialButton9 = uc1Var.i;
        if (co1Var == co1Var2) {
            i17 = 8;
        } else {
            i17 = 8;
        }
        materialButton9.setVisibility(i17);
        iOrdinal3 = co1Var.ordinal();
        if (iOrdinal3 != 0) {
            i18 = 0;
        } else if (iOrdinal3 != 1) {
            i21 = R.string.homemusic_login_register_hint;
            if (iOrdinal3 != 2) {
                i18 = 0;
                strV = v(R.string.homemusic_login_register_hint, new Object[0]);
            } else {
                if (iOrdinal3 == 3) {
                    er1.n();
                    return;
                }
                if (z6) {
                    i21 = R.string.homemusic_login_email_hint;
                }
                i18 = 0;
                strV = v(i21, new Object[0]);
            }
        } else {
            i18 = 0;
            if (zH) {
                if (z2 != 0) {
                    i20 = R.string.homemusic_login_hint_email;
                } else {
                    i20 = R.string.homemusic_login_hint;
                }
                strV = v(i20, new Object[0]);
            }
        }
        textView.setText(strV);
        text = textView.getText();
        text.getClass();
        if (text.length() > 0) {
            i19 = i18;
        } else {
            i19 = 8;
        }
        textView.setVisibility(i19);
        x();
        w();
        if (z) {
        }
        iOrdinal4 = co1Var.ordinal();
        if (iOrdinal4 != 0) {
            uc1Var.r.requestFocus();
            return;
        }
        if (iOrdinal4 != 1) {
            text2 = textInputEditText3.getText();
            if (text2 != null) {
                textInputEditText2 = textInputEditText3;
            } else {
                textInputEditText2 = textInputEditText3;
            }
            textInputEditText2.requestFocus();
            return;
        }
        if (iOrdinal4 != 2) {
            textInputEditText5.requestFocus();
            return;
        }
        if (iOrdinal4 == 3) {
            er1.n();
        } else if (z6) {
            textInputEditText5.requestFocus();
        } else if (z) {
            uc1Var.e.requestFocus();
        }
    }

    public void t(String str) {
        TextView textView = ((uc1) this.c).h;
        textView.setText(str);
        textView.setVisibility((str == null || qm4.u0(str)) ? 8 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    public void u(String str, String str2) {
        String str3;
        Object next;
        String str4;
        String localAddress;
        String string;
        String serverName;
        pn4 pn4VarF;
        r(true);
        Iterator it = ((List) this.j).iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = str;
                next = null;
                break;
            }
            next = it.next();
            Server server = (Server) next;
            if (l93.b0(server.getAddress(), (String) this.e)) {
                str3 = str;
                if (h12.c(server.getUsername(), str3)) {
                    break;
                }
            }
        }
        Server server2 = (Server) next;
        if (!l93.b0((String) this.e, "http://192.168.1.129:4533")) {
            if (server2 != null) {
                localAddress = server2.getLocalAddress();
            } else {
                str4 = null;
            }
            if (server2 != null || (string = server2.getServerId()) == null) {
                string = UUID.randomUUID().toString();
                string.getClass();
            }
            String str5 = string;
            if (server2 != null || (serverName = server2.getServerName()) == null) {
                serverName = "HomeMusic";
            }
            Server server3 = new Server(str5, serverName, str3, str2, (String) this.e, str4, System.currentTimeMillis(), false, null);
            ud3.w0(server3.getServerId());
            ud3.v0(server3.getAddress());
            ud3.n0(server3.getLocalAddress());
            ud3.m0(server3.getAddress());
            ud3.D0(server3.getUsername());
            ud3.q0(server3.getPassword());
            ud3.o0(false);
            ud3.h0(null);
            App.f(true);
            rf2 rf2Var = new rf2(this, server3);
            pn4VarF = App.f(false);
            if (pn4VarF.c == null) {
                pn4VarF.c = new gp3(pn4VarF, 21);
            }
            pn4VarF.c.u().enqueue(new rm2(23, rf2Var));
        }
        localAddress = "http://192.168.1.129:4533";
        str4 = localAddress;
        if (server2 != null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        String str6 = string;
        if (server2 != null) {
            serverName = "HomeMusic";
        } else {
            serverName = "HomeMusic";
        }
        Server server4 = new Server(str6, serverName, str3, str2, (String) this.e, str4, System.currentTimeMillis(), false, null);
        ud3.w0(server4.getServerId());
        ud3.v0(server4.getAddress());
        ud3.n0(server4.getLocalAddress());
        ud3.m0(server4.getAddress());
        ud3.D0(server4.getUsername());
        ud3.q0(server4.getPassword());
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        rf2 rf2Var2 = new rf2(this, server4);
        pn4VarF = App.f(false);
        if (pn4VarF.c == null) {
            pn4VarF.c = new gp3(pn4VarF, 21);
        }
        pn4VarF.c.u().enqueue(new rm2(23, rf2Var2));
    }

    public String v(int i, Object... objArr) {
        String strT = ((LoginFragment) this.b).t(i, Arrays.copyOf(objArr, objArr.length));
        strT.getClass();
        return strT;
    }

    public void w() {
        MaterialButton materialButton = ((uc1) this.c).q;
        qa1 qa1Var = (qa1) this.l;
        materialButton.removeCallbacks(qa1Var);
        if (materialButton.getVisibility() == 0) {
            int iCurrentTimeMillis = (int) ((999 - System.currentTimeMillis()) / 1000);
            materialButton.setEnabled(!this.a && iCurrentTimeMillis <= 0);
            materialButton.setText(iCurrentTimeMillis > 0 ? v(R.string.homemusic_login_email_resend_in, Integer.valueOf(iCurrentTimeMillis)) : v(R.string.homemusic_login_email_resend, new Object[0]));
            if (iCurrentTimeMillis > 0) {
                materialButton.postDelayed(qa1Var, 1000L);
            }
        }
    }

    public void x() {
        uc1 uc1Var = (uc1) this.c;
        uc1Var.s.setVisibility((((co1) this.d) != co1.n || l93.b0(qm4.K0(String.valueOf(uc1Var.r.getText())).toString(), "http://192.168.1.129:4533")) ? 8 : 0);
    }

    public fo1(LoginFragment loginFragment, uc1 uc1Var) {
        this.b = loginFragment;
        this.c = uc1Var;
        this.d = co1.n;
        this.e = "";
        this.j = u01.n;
        this.k = new bd1(1, this);
        this.l = new qa1(4, this);
    }

    public fo1(q41 q41Var, nj0 nj0Var, yp4 yp4Var, ik3 ik3Var) {
        this.b = ik3Var;
        this.f = q41Var;
        this.k = new pd4();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = nj0Var;
        this.j = yp4Var;
        this.g = new HashMap();
        this.h = new HashSet();
    }
}
