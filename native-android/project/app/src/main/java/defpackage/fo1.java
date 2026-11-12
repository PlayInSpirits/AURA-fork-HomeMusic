package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$Op
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  android.view.View
 *  android.widget.TextView
 */
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
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
        for (int i16 = 0; i16 < 4; ++i16) {
            ((kc4[])this.b)[i16] = new kc4();
            ((Matrix[])this.c)[i16] = new Matrix();
            ((Matrix[])this.d)[i16] = new Matrix();
        }
    }

    public fo1(LoginFragment loginFragment, uc1 uc12) {
        this.b = loginFragment;
        this.c = uc12;
        this.d = co1.n;
        this.e = "";
        this.j = u01.n;
        this.k = new bd1(1, this);
        this.l = new qa1(4, this);
    }

    public fo1(q41 q412, nj0 nj02, yp4 yp42, ik3 ik32) {
        this.b = ik32;
        this.f = q412;
        this.k = new pd4();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = nj02;
        this.j = yp42;
        this.g = new HashMap();
        this.h = new HashSet();
    }

    public static final void a(fo1 fo12, String string) {
        ud3.w0(null);
        ud3.v0(null);
        ud3.D0(null);
        ud3.q0(null);
        ud3.C0(null);
        ud3.u0(null);
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        if (!fo12.c()) {
            return;
        }
        fo12.r(false);
        co1 co12 = (co1)((Object)fo12.d);
        if (co12 == co1.p || co12 == co1.q) {
            fo12.s(co1.o);
        }
        fo12.t(string);
    }

    public cu4 b(int n16, ArrayList arrayList, pd4 object) {
        ArrayList arrayList2 = (ArrayList)this.c;
        if (!arrayList.isEmpty()) {
            this.k = object;
            for (int i16 = n16; i16 < arrayList.size() + n16; ++i16) {
                int n17;
                bu2 bu22;
                object = (bu2)arrayList.get(i16 - n16);
                if (i16 > 0) {
                    bu22 = (bu2)arrayList2.get(i16 - 1);
                    pg2 pg22 = bu22.a.o;
                    n17 = bu22.d;
                    ((bu2)object).d = pg22.e.o() + n17;
                    ((bu2)object).e = false;
                    ((bu2)object).c.clear();
                } else {
                    ((bu2)object).d = 0;
                    ((bu2)object).e = false;
                    ((bu2)object).c.clear();
                }
                int n18 = ((bu2)object).a.o.e.o();
                for (n17 = i16; n17 < arrayList2.size(); ++n17) {
                    bu22 = (bu2)arrayList2.get(n17);
                    bu22.d += n18;
                }
                arrayList2.add(i16, object);
                ((HashMap)this.e).put(((bu2)object).b, object);
                if (!this.a) continue;
                this.l((bu2)object);
                if (((IdentityHashMap)this.d).isEmpty()) {
                    ((HashSet)this.h).add(object);
                    continue;
                }
                if ((object = (au2)((HashMap)this.g).get(object)) == null) continue;
                ((au2)object).a.c(((au2)object).b);
            }
        }
        return this.f();
    }

    public boolean c() {
        LoginFragment loginFragment = (LoginFragment)this.b;
        return loginFragment.y() && loginFragment.T != null;
    }

    public void d(bc4 bc42, float f16, RectF rectF, pz1 pz12, Path path) {
        float f17;
        int n16;
        Object object;
        Object object2;
        jc4[] jc4Array;
        Object object3 = pz12;
        object3 = path;
        Matrix[] matrixArray = (Matrix[])this.d;
        float[] fArray = (float[])this.i;
        kc4[] kc4Array = (kc4[])this.b;
        Object object4 = (Path)this.c;
        object3.rewind();
        Path path2 = (Path)this.f;
        path2.rewind();
        Path path3 = (Path)this.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int n17 = 0;
        while (n17 < 4) {
            jc4Array = (PointF)this.e;
            object3 = n17 != 1 ? (n17 != 2 ? (n17 != 3 ? bc42.f : bc42.e) : bc42.h) : bc42.g;
            object2 = n17 != 1 ? (n17 != 2 ? (n17 != 3 ? bc42.b : bc42.a) : bc42.d) : bc42.c;
            object = kc4Array[n17];
            object2.getClass();
            ((su3)object2).r((kc4)object, f16, object3.a(rectF));
            n16 = n17 + 1;
            f17 = n16 % 4 * 90;
            object4[n17].reset();
            if (n17 != 1) {
                if (n17 != 2) {
                    if (n17 != 3) {
                        jc4Array.set(rectF.right, rectF.top);
                    } else {
                        jc4Array.set(rectF.left, rectF.top);
                    }
                } else {
                    jc4Array.set(rectF.left, rectF.bottom);
                }
            } else {
                jc4Array.set(rectF.right, rectF.bottom);
            }
            object4[n17].setTranslate(jc4Array.x, jc4Array.y);
            object4[n17].preRotate(f17);
            object3 = kc4Array[n17];
            fArray[0] = ((kc4)object3).c;
            fArray[1] = ((kc4)object3).d;
            object4[n17].mapPoints(fArray);
            matrixArray[n17].reset();
            matrixArray[n17].setTranslate(fArray[0], fArray[1]);
            matrixArray[n17].preRotate(f17);
            n17 = n16;
        }
        n17 = 0;
        object2 = object4;
        while (true) {
            object4 = path;
            object3 = pz12;
            if (n17 >= 4) break;
            jc4Array = kc4Array[n17];
            fArray[0] = jc4Array.a;
            fArray[1] = jc4Array.b;
            object2[n17].mapPoints(fArray);
            if (n17 == 0) {
                object4.moveTo(fArray[0], fArray[1]);
            } else {
                object4.lineTo(fArray[0], fArray[1]);
            }
            kc4Array[n17].b((Matrix)object2[n17], (Path)object4);
            if (object3 != null) {
                object4 = kc4Array[n17];
                jc4Array = object2[n17];
                object3 = (fi2)((pz1)object3).o;
                object = ((fi2)object3).q;
                object4.getClass();
                ((BitSet)object).set(n17, false);
                object3 = ((fi2)object3).o;
                ((kc4)object4).a(((kc4)object4).f);
                jc4Array = new Matrix((Matrix)jc4Array);
                object3[n17] = new dc4(new ArrayList(((kc4)object4).h), (Matrix)jc4Array);
            }
            jc4Array = (Path)this.k;
            object4 = (kc4)this.h;
            n16 = n17 + 1;
            int n18 = n16 % 4;
            object3 = kc4Array[n17];
            fArray[0] = ((kc4)object3).c;
            fArray[1] = ((kc4)object3).d;
            object2[n17].mapPoints(fArray);
            object3 = (float[])this.j;
            object = kc4Array[n18];
            object3[0] = (jc4)((kc4)object).a;
            object3[1] = (jc4)((kc4)object).b;
            object2[n18].mapPoints((float[])object3);
            float f18 = Math.max((float)Math.hypot(fArray[0] - object3[0], fArray[1] - object3[1]) - 0.001f, 0.0f);
            object3 = kc4Array[n17];
            fArray[0] = ((kc4)object3).c;
            fArray[1] = ((kc4)object3).d;
            object2[n17].mapPoints(fArray);
            f17 = n17 != 1 && n17 != 3 ? Math.abs(rectF.centerY() - fArray[1]) : Math.abs(rectF.centerX() - fArray[0]);
            ((kc4)object4).d(0.0f, 0.0f, 270.0f, 0.0f);
            object3 = n17 != 1 ? (n17 != 2 ? (n17 != 3 ? bc42.j : bc42.i) : bc42.l) : bc42.k;
            ((fz0)object3).j(f18, f17, f16, (kc4)object4);
            jc4Array.reset();
            ((kc4)object4).b(matrixArray[n17], (Path)jc4Array);
            if (this.a && (((fz0)object3).i() || this.k((Path)jc4Array, n17) || this.k((Path)jc4Array, n18))) {
                jc4Array.op((Path)jc4Array, path3, Path.Op.DIFFERENCE);
                fArray[0] = ((kc4)object4).a;
                fArray[1] = ((kc4)object4).b;
                matrixArray[n17].mapPoints(fArray);
                path2.moveTo(fArray[0], fArray[1]);
                ((kc4)object4).b(matrixArray[n17], path2);
            } else {
                ((kc4)object4).b(matrixArray[n17], path);
            }
            if (pz12 != null) {
                object3 = matrixArray[n17];
                jc4Array = (fi2)pz12.o;
                jc4Array.q.set(n17 + 4, false);
                jc4Array = jc4Array.p;
                ((kc4)object4).a(((kc4)object4).f);
                object3 = new Matrix((Matrix)object3);
                jc4Array[n17] = new dc4(new ArrayList(((kc4)object4).h), (Matrix)object3);
            }
            object3 = path;
            object3 = pz12;
            n17 = n16;
        }
        object4.close();
        path2.close();
        if (!path2.isEmpty()) {
            object4.op(path2, Path.Op.UNION);
        }
    }

    public void e() {
        this.t(null);
        Object object = (uc1)this.c;
        object = gb.P((Object[])new TextInputLayout[]{((uc1)object).u, ((uc1)object).f, ((uc1)object).d, ((uc1)object).A, ((uc1)object).n, ((uc1)object).m}).iterator();
        while (object.hasNext()) {
            ((TextInputLayout)((Object)object.next())).setError(null);
        }
    }

    public cu4 f() {
        ArrayList arrayList = (ArrayList)this.c;
        if (arrayList.isEmpty()) {
            return cu4.a;
        }
        int n16 = 0;
        for (int i16 = 0; i16 < arrayList.size(); ++i16) {
            bu2 bu22 = (bu2)arrayList.get(i16);
            bu22.d = n16;
            n16 += bu22.a.o.e.o();
        }
        return new tm3(arrayList, (pd4)this.k);
    }

    public void g() {
        Iterator iterator = ((HashSet)this.h).iterator();
        while (iterator.hasNext()) {
            Object object = (bu2)iterator.next();
            if (!((bu2)object).c.isEmpty()) continue;
            if ((object = (au2)((HashMap)this.g).get(object)) != null) {
                ((au2)object).a.c(((au2)object).b);
            }
            iterator.remove();
        }
    }

    public boolean h() {
        block10: {
            block7: {
                Object object;
                block9: {
                    block8: {
                        Object object2 = (HubAuthOptions)this.i;
                        if (object2 == null || !((HubAuthOptions)object2).getInvites()) break block7;
                        if ((object2 = ((HubAuthOptions)object2).getMusicUrl()) == null) break block8;
                        if (qm4.u0((CharSequence)object2)) {
                            object2 = null;
                        }
                        object = object2;
                        if (object2 != null) break block9;
                    }
                    object = "http://192.168.1.129:4533";
                }
                if (l93.b0((String)this.e, (String)object) || l93.b0((String)this.e, "http://192.168.1.129:4533")) break block10;
            }
            return false;
        }
        return true;
    }

    public void i(bu2 bu22) {
        if (bu22.e && bu22.c.isEmpty()) {
            au2 au22 = (au2)((HashMap)this.g).remove(bu22);
            au22.getClass();
            zt2 zt22 = au22.c;
            bq bq5 = au22.a;
            bq5.o(au22.b);
            bq5.r(zt22);
            bq5.q(zt22);
            ((HashSet)this.h).remove(bu22);
        }
    }

    public boolean j(String string) {
        uc1 uc12 = (uc1)this.c;
        TextInputLayout textInputLayout = uc12.n;
        if (!this.p(textInputLayout, string)) {
            return false;
        }
        if (string.length() < 6) {
            textInputLayout.setError(this.v(2131952095, new Object[0]));
            return false;
        }
        if (!string.equals(String.valueOf(uc12.l.getText()))) {
            uc12.m.setError(this.v(2131952079, new Object[0]));
            return false;
        }
        return true;
    }

    public boolean k(Path path, int n16) {
        Path path2 = (Path)this.l;
        path2.reset();
        ((kc4[])this.b)[n16].b(((Matrix[])this.c)[n16], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || rectF.width() > 1.0f && rectF.height() > 1.0f;
        {
        }
    }

    public void l(bu2 bu22) {
        rg2 rg22 = bu22.a;
        ut2 ut22 = new ut2(this);
        zt2 zt22 = new zt2(this, bu22);
        ((HashMap)this.g).put(bu22, new au2(rg22, ut22, zt22));
        bu22 = f35.q(null);
        rg22.getClass();
        Object object = rg22.c;
        object.getClass();
        object = (CopyOnWriteArrayList)((ue1)object).q;
        Object object2 = new Object();
        ((rt2)object2).a = bu22;
        ((rt2)object2).b = zt22;
        ((CopyOnWriteArrayList)object).add(object2);
        bu22 = f35.q(null);
        object = rg22.d;
        object.getClass();
        object2 = ((sw0)object).c;
        object = new Object();
        ((rw0)object).a = bu22;
        ((rw0)object).b = zt22;
        ((CopyOnWriteArrayList)object2).add(object);
        rg22.k(ut22, (rw4)this.l, (ik3)this.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void m() {
        Object object = (uc1)this.c;
        TextInputLayout textInputLayout = ((uc1)object).d;
        Object object2 = ((uc1)object).c;
        TextInputLayout textInputLayout2 = ((uc1)object).A;
        Object object3 = ((uc1)object).k;
        Object object4 = ((uc1)object).z;
        if (this.a) return;
        int n16 = ((co1)((Object)this.d)).ordinal();
        if (n16 != 0) {
            if (n16 != 1) {
                if (n16 != 2) {
                    if (n16 == 3) {
                        object = (String)this.h;
                        if (object == null) {
                            this.q();
                            return;
                        }
                        object2 = ((Object)qm4.K0(String.valueOf(((hg)object2).getText()))).toString();
                        object4 = ((Object)qm4.K0(String.valueOf(((hg)object4).getText()))).toString();
                        object3 = String.valueOf(((hg)object3).getText());
                        if (!this.p(textInputLayout, (String)object2) || !this.p(textInputLayout2, (String)object4) || !this.j((String)object3)) return;
                        ao1 ao12 = new ao1((String)object, (String)object2, (String)object4, 0, (String)object3);
                        this.r(true);
                        io1.a.execute(new v6(ao12, this, null, 10));
                        return;
                    }
                    er1.n();
                    return;
                }
                object = ((Object)qm4.K0(String.valueOf(((hg)object2).getText()))).toString();
                object4 = ((Object)qm4.K0(String.valueOf(((hg)object4).getText()))).toString();
                object2 = String.valueOf(((hg)object3).getText());
                object3 = (String)this.f;
                if (!this.p(textInputLayout, (String)object) || !this.p(textInputLayout2, (String)object4) || object3 == null && !this.j((String)object2)) return;
                ao1 ao13 = new ao1((String)object3, (String)object, (String)object4, 1, (String)object2);
                this.r(true);
                io1.a.execute(new v6(ao13, this, null, 10));
                return;
            }
            String string = ((Object)qm4.K0(String.valueOf(((hg)object4).getText()))).toString();
            object3 = String.valueOf(((hg)object3).getText());
            if (!this.p(textInputLayout2, string) || !this.p(((uc1)object).n, (String)object3)) return;
            if (qm4.n0(string, '@') && this.h()) {
                fa fa6 = new fa(8, string, object3);
                this.r(true);
                io1.a.execute(new v6(fa6, this, null, 10));
                return;
            }
            this.u(string, (String)object3);
            return;
        }
        String string = l93.M(String.valueOf(((uc1)object).r.getText()));
        if (string == null) {
            ((uc1)object).u.setError(this.v(2131952089, new Object[0]));
            return;
        }
        this.r(true);
        io1.a.execute(new yn1(string, this));
    }

    public void n(no2 no22) {
        IdentityHashMap identityHashMap = (IdentityHashMap)this.d;
        bu2 bu22 = (bu2)identityHashMap.remove(no22);
        bu22.getClass();
        bu22.a.n(no22);
        bu22.c.remove(((og2)no22).n);
        if (!identityHashMap.isEmpty()) {
            this.g();
        }
        this.i(bu22);
    }

    public void o(int n16, int n17) {
        ArrayList arrayList = (ArrayList)this.c;
        --n17;
        while (n17 >= n16) {
            bu2 bu22 = (bu2)arrayList.remove(n17);
            ((HashMap)this.e).remove(bu22.b);
            int n18 = -bu22.a.o.e.o();
            for (int i16 = n17; i16 < arrayList.size(); ++i16) {
                bu2 bu23 = (bu2)arrayList.get(i16);
                bu23.d += n18;
            }
            bu22.e = true;
            if (this.a) {
                this.i(bu22);
            }
            --n17;
        }
    }

    public boolean p(TextInputLayout textInputLayout, String string) {
        if (string.length() > 0) {
            return true;
        }
        textInputLayout.setError(this.v(2131952087, new Object[0]));
        textInputLayout = textInputLayout.getEditText();
        if (textInputLayout != null) {
            textInputLayout.requestFocus();
        }
        return false;
    }

    public void q() {
        Object object = (uc1)this.c;
        object = object.f;
        String string = ((Object)qm4.K0(String.valueOf(object.e.getText()))).toString();
        if (!this.p((TextInputLayout)((Object)object), string)) {
            return;
        }
        if (!qm4.n0(string, '@')) {
            ((TextInputLayout)((Object)object)).setError(this.v(2131952067, new Object[0]));
            return;
        }
        this.r(true);
        io1.a.execute(new yn1(this, string));
    }

    public void r(boolean bl5) {
        this.a = bl5;
        Object object = (uc1)this.c;
        Object object2 = ((uc1)object).p;
        int n16 = bl5 ? 0 : 4;
        object2.setVisibility(n16);
        object2 = gb.P(((uc1)object).o, ((uc1)object).i, ((uc1)object).y, ((uc1)object).g, ((uc1)object).v, ((uc1)object).s).iterator();
        while (object2.hasNext()) {
            ((View)object2.next()).setEnabled(bl5 ^ true);
        }
        object = gb.P(((uc1)object).r, ((uc1)object).e, ((uc1)object).c, ((uc1)object).z, ((uc1)object).k, ((uc1)object).l).iterator();
        while (object.hasNext()) {
            ((TextInputEditText)object.next()).setEnabled(bl5 ^ true);
        }
        this.w();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void s(co1 object) {
        int n16;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        Object object2;
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        TextView textView;
        TextInputEditText textInputEditText3;
        uc1 uc12;
        block26: {
            Object object3;
            block32: {
                boolean bl8;
                int n17;
                boolean bl9;
                co1 co12;
                Object object4;
                Object object5;
                MaterialButton materialButton;
                block31: {
                    block29: {
                        block30: {
                            TextView textView2;
                            int n18;
                            block25: {
                                block27: {
                                    block28: {
                                        uc12 = (uc1)this.c;
                                        textInputEditText3 = uc12.z;
                                        textView = uc12.j;
                                        materialButton = uc12.y;
                                        textInputEditText2 = uc12.k;
                                        object3 = uc12.A;
                                        object5 = uc12.d;
                                        textInputEditText = uc12.c;
                                        object2 = co1.p;
                                        if (object != object2) {
                                            this.f = null;
                                            this.g = null;
                                        }
                                        if (bl7 = object != (co1)((Object)this.d)) {
                                            textInputEditText.setText(null);
                                        }
                                        this.d = object;
                                        object4 = (bd1)this.k;
                                        co12 = co1.n;
                                        bl9 = object != co12;
                                        ((v83)object4).c(bl9);
                                        this.e();
                                        n17 = (String)this.f != null ? 1 : 0;
                                        bl6 = object == co1.q;
                                        bl5 = bl6 && (String)this.h == null;
                                        n16 = object != object2 && !bl6 ? 0 : 1;
                                        bl9 = this.h();
                                        bl8 = bl9 && (object4 = (HubAuthOptions)this.i) != null && ((HubAuthOptions)object4).getEmailSignup();
                                        object4 = uc12.w;
                                        n18 = object == co12 ? 0 : 8;
                                        object4.setVisibility(n18);
                                        object4 = uc12.b;
                                        n18 = object != co12 ? 0 : 8;
                                        object4.setVisibility(n18);
                                        uc12.t.setText((CharSequence)((String)this.e));
                                        object4 = uc12.f;
                                        n18 = bl6 ? 0 : 8;
                                        object4.setVisibility(n18);
                                        n18 = object != object2 && (!bl6 || bl5) ? 8 : 0;
                                        object5.setVisibility(n18);
                                        n18 = bl6 ? 2131952068 : 2131952064;
                                        object5.setHint(this.v(n18, new Object[0]));
                                        object2 = bl6 ? "000000" : "ABCD-EFGH";
                                        object5.setPlaceholderText((CharSequence)object2);
                                        n18 = bl6 ? 2 : 528529;
                                        textInputEditText.setInputType(n18);
                                        object2 = uc12.q;
                                        n18 = bl6 && !bl5 ? 0 : 8;
                                        object2.setVisibility(n18);
                                        n18 = !bl5 ? 0 : 8;
                                        object3.setVisibility(n18);
                                        object4 = co1.o;
                                        n18 = object == object4 && bl8 ? 2131952102 : 2131952101;
                                        object3.setHint(this.v(n18, new Object[0]));
                                        object2 = uc12.n;
                                        n18 = !bl5 && (object == object4 || n16 != 0 && n17 == 0) ? 0 : 8;
                                        object2.setVisibility(n18);
                                        object2 = uc12.m;
                                        n18 = !bl5 && n16 != 0 && n17 == 0 ? 0 : 8;
                                        object2.setVisibility(n18);
                                        n16 = n16 != 0 ? 5 : 2;
                                        textInputEditText2.setImeOptions(n16);
                                        textView2 = uc12.x;
                                        n16 = ((Enum)object).ordinal();
                                        object3 = "";
                                        if (n16 == 0) break block27;
                                        if (n16 == 1) break block28;
                                        if (n16 != 2) {
                                            if (n16 != 3) {
                                                er1.n();
                                                return;
                                            }
                                            object2 = (String)this.h;
                                            object2 = object2 != null ? this.v(2131952073, object2) : this.v(2131952074, new Object[0]);
                                            break block25;
                                        } else if (n17 != 0) {
                                            object5 = (String)this.g;
                                            object2 = object5;
                                            if (object5 == null) {
                                                object2 = "";
                                            }
                                            object2 = this.v(2131952076, object2);
                                            break block25;
                                        } else {
                                            object2 = this.v(2131952086, new Object[0]);
                                        }
                                        break block25;
                                    }
                                    object2 = this.v(2131952062, new Object[0]);
                                    break block25;
                                }
                                object2 = this.v(2131952093, new Object[0]);
                            }
                            textView2.setText((CharSequence)object2);
                            object2 = uc12.o;
                            int n19 = ((Enum)object).ordinal();
                            if (n19 == 0) break block29;
                            if (n19 == 1) break block30;
                            n16 = n18 = 2131952065;
                            if (n19 != 2) {
                                if (n19 != 3) {
                                    er1.n();
                                    return;
                                }
                                n16 = n18;
                                if (bl5) {
                                    n16 = 2131952072;
                                }
                            }
                            break block31;
                        }
                        n16 = 2131952096;
                        break block31;
                    }
                    n16 = 2131952080;
                }
                object2.setText(this.v(n16, new Object[0]));
                n16 = bl9 && object != co12 && n17 == 0 ? 0 : 8;
                materialButton.setVisibility(n16);
                n16 = object == object4 ? 2131952100 : 2131952098;
                materialButton.setText(this.v(n16, new Object[0]));
                object2 = uc12.g;
                n16 = object == object4 && bl8 ? 0 : 8;
                object2.setVisibility(n16);
                object5 = uc12.i;
                n16 = object == object4 && bl9 && (object2 = (object2 = (HubAuthOptions)this.i) != null ? ((HubAuthOptions)object2).getGoogleClientId() : null) != null && !qm4.u0((CharSequence)object2) ? 0 : 8;
                object5.setVisibility(n16);
                n17 = ((Enum)object).ordinal();
                if (n17 == 0) break block32;
                if (n17 != 1) {
                    n16 = 2131952085;
                    if (n17 != 2) {
                        if (n17 != 3) {
                            er1.n();
                            return;
                        }
                        if (bl5) {
                            n16 = 2131952069;
                        }
                        object2 = this.v(n16, new Object[0]);
                        break block26;
                    } else {
                        object2 = this.v(2131952085, new Object[0]);
                    }
                    break block26;
                } else if (!bl9) {
                    object2 = object3;
                    break block26;
                } else {
                    n16 = bl8 ? 2131952078 : 2131952077;
                    object2 = this.v(n16, new Object[0]);
                }
                break block26;
            }
            object2 = object3;
        }
        textView.setText((CharSequence)object2);
        object2 = textView.getText();
        ((Object)object2).getClass();
        n16 = object2.length() > 0 ? 0 : 8;
        textView.setVisibility(n16);
        this.x();
        this.w();
        if (!bl7 && !bl6) {
            return;
        }
        n16 = ((Enum)object).ordinal();
        if (n16 == 0) {
            uc12.r.requestFocus();
            return;
        }
        if (n16 != 1) {
            if (n16 == 2) {
                textInputEditText.requestFocus();
                return;
            }
            if (n16 != 3) {
                er1.n();
                return;
            }
            if (bl5) {
                if (!bl7) return;
                uc12.e.requestFocus();
                return;
            }
            textInputEditText.requestFocus();
            return;
        }
        object = textInputEditText3.getText();
        object = object != null && object.length() != 0 ? textInputEditText2 : textInputEditText3;
        object.requestFocus();
    }

    public void t(String string) {
        TextView textView = ((uc1)this.c).h;
        textView.setText((CharSequence)string);
        int n16 = string != null && !qm4.u0(string) ? 0 : 8;
        textView.setVisibility(n16);
    }

    public void u(String object, String object2) {
        Object object3;
        Object object4;
        String string2;
        block12: {
            block11: {
                Object object5;
                block10: {
                    block9: {
                        block8: {
                            this.r(true);
                            for (String string2 : (List)this.j) {
                                object4 = (Server)((Object)string2);
                                if (!l93.b0(((Server)object4).getAddress(), (String)this.e) || !h12.c(((Server)object4).getUsername(), object)) continue;
                                break block8;
                            }
                            string2 = null;
                        }
                        object5 = (Server)((Object)string2);
                        string2 = l93.b0((String)this.e, "http://192.168.1.129:4533") ? "http://192.168.1.129:4533" : (object5 != null ? ((Server)object5).getLocalAddress() : null);
                        if (object5 == null) break block9;
                        object3 = object4 = ((Server)object5).getServerId();
                        if (object4 != null) break block10;
                    }
                    object3 = UUID.randomUUID().toString();
                    object3.getClass();
                }
                if (object5 == null) break block11;
                object4 = object5 = ((Server)object5).getServerName();
                if (object5 != null) break block12;
            }
            object4 = "HomeMusic";
        }
        object = new Server((String)object3, (String)object4, (String)object, (String)object2, (String)this.e, string2, System.currentTimeMillis(), false, null);
        ud3.w0(((Server)object).getServerId());
        ud3.v0(((Server)object).getAddress());
        ud3.n0(((Server)object).getLocalAddress());
        ud3.m0(((Server)object).getAddress());
        ud3.D0(((Server)object).getUsername());
        ud3.q0(((Server)object).getPassword());
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        object2 = new rf2(this, object);
        object = App.f(false);
        if (((pn4)object).c == null) {
            ((pn4)object).c = new gp3((pn4)object, 21);
        }
        ((pn4)object).c.u().enqueue(new rm2(23, object2));
    }

    public String v(int n16, Object ... object) {
        object = ((LoginFragment)this.b).t(n16, Arrays.copyOf(object, ((Object[])object).length));
        object.getClass();
        return object;
    }

    public void w() {
        MaterialButton materialButton = ((uc1)this.c).q;
        qa1 qa12 = (qa1)this.l;
        materialButton.removeCallbacks(qa12);
        if (materialButton.getVisibility() == 0) {
            int n16 = (int)((999L - System.currentTimeMillis()) / 1000L);
            boolean bl5 = !this.a && n16 <= 0;
            materialButton.setEnabled(bl5);
            String string = n16 > 0 ? this.v(2131952071, n16) : this.v(2131952070, new Object[0]);
            materialButton.setText(string);
            if (n16 > 0) {
                materialButton.postDelayed(qa12, 1000L);
            }
        }
    }

    public void x() {
        uc1 uc12 = (uc1)this.c;
        String string = ((Object)qm4.K0(String.valueOf(uc12.r.getText()))).toString();
        uc12 = uc12.s;
        int n16 = (co1)((Object)this.d) == co1.n && !l93.b0(string, "http://192.168.1.129:4533") ? 0 : 8;
        uc12.setVisibility(n16);
    }
}

