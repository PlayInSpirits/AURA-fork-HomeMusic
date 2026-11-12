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
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
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
        int r1 = 0;
    L3:
        if (r1 >= 4) goto L5;
        ((kc4[]) this.b)[r1] = new kc4();
        ((Matrix[]) this.c)[r1] = new Matrix();
        ((Matrix[]) this.d)[r1] = new Matrix();
        r1 = r1 + 1;
        goto L3
    }

    public static final void a(fo1 r2, String r3) {
        ud3.w0(null);
        ud3.v0(null);
        ud3.D0(null);
        ud3.q0(null);
        ud3.C0(null);
        ud3.u0(null);
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        if (r2.c() == true) goto L5;
        return;
    L5:
        r2.r(false);
        co1 r0 = (co1) r2.d;
        if (r0 != co1.p) goto L8;
    L9:
        r2.s(co1.o);
    L10:
        r2.t(r3);
        return;
    L8:
        if (r0 != co1.q) goto L10;
        goto L9
    }

    public cu4 b(int r7, ArrayList r8, pd4 r9) {
        ArrayList r0 = (ArrayList) this.c;
        if (r8.isEmpty() == true) goto L25;
        this.k = r9;
        int r10 = r7;
    L6:
        if (r10 >= (r8.size() + r7)) goto L25;
        bu2 r1 = (bu2) r8.get(r10 - r7);
        if (r10 <= 0) goto L10;
        bu2 r3 = (bu2) r0.get(r10 - 1);
        pg2 r4 = r3.a.o;
        r1.d = r4.e.o() + r3.d;
        r1.e = false;
        r1.c.clear();
    L11:
        int r2 = r1.a.o.e.o();
        int r5 = r10;
    L13:
        if (r5 >= r0.size()) goto L15;
        ((bu2) r0.get(r5)).d += r2;
        r5 = r5 + 1;
        goto L13
    L15:
        r0.add(r10, r1);
        ((HashMap) this.e).put(r1.b, r1);
        if (this.a == false) goto L23;
        l(r1);
        if (((IdentityHashMap) this.d).isEmpty() == false) goto L20;
        ((HashSet) this.h).add(r1);
        goto L23
    L20:
        au2 r6 = (au2) ((HashMap) this.g).get(r1);
        if (r6 == null) goto L23;
        r6.a.c(r6.b);
    L23:
        r10 = r10 + 1;
        goto L6
    L10:
        r1.d = 0;
        r1.e = false;
        r1.c.clear();
    L25:
        return f();
    }

    public boolean c() {
        LoginFragment r1 = (LoginFragment) this.b;
        if (r1.y() == true) goto L5;
        return false;
    L5:
        if (r1.T == null) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(bc4 r24, float r25, RectF r26, pz1 r27, Path r28) {
        pz1 r4 = r27;
        Path r5 = r28;
        Matrix[] r6 = (Matrix[]) this.d;
        float[] r7 = (float[]) this.i;
        kc4[] r8 = (kc4[]) this.b;
        Matrix[] r9 = (Matrix[]) this.c;
        r5.rewind();
        Path r10 = (Path) this.f;
        r10.rewind();
        Path r11 = (Path) this.g;
        r11.rewind();
        r11.addRect(r26, Path.Direction.CW);
        int r13 = 0;
    L3:
        char r16 = 0;
        int r12 = 4;
        if (r13 >= 4) goto L35;
        PointF r14 = (PointF) this.e;
        if (r13 == 1) goto L13;
        if (r13 != 2) goto L9;
        ke0 r15 = r24.h;
    L14:
        if (r13 != 1) goto L16;
        su3 r17 = r24.c;
    L20:
        Matrix[] r19 = r6;
        kc4 r18 = r8[r13];
        r17.getClass();
        r17.r(r18, r25, r15.a(r26));
        int r20 = r13 + 1;
        float r110 = (r20 % 4) * 90;
        r9[r13].reset();
        if (r13 != 1) goto L27;
        r14.set(r26.right, r26.bottom);
    L34:
        r9[r13].setTranslate(r14.x, r14.y);
        r9[r13].preRotate(r110);
        kc4 r21 = r8[r13];
        r7[0] = r21.c;
        r7[1] = r21.d;
        r9[r13].mapPoints(r7);
        r19[r13].reset();
        r19[r13].setTranslate(r7[0], r7[1]);
        r19[r13].preRotate(r110);
        r13 = r20;
        r6 = r19;
        goto L3
    L27:
        if (r13 != 2) goto L29;
        r14.set(r26.left, r26.bottom);
        goto L34
    L29:
        if (r13 == 3) goto L31;
        r14.set(r26.right, r26.top);
        goto L34
    L31:
        r14.set(r26.left, r26.top);
        goto L34
    L16:
        if (r13 != 2) goto L18;
        r17 = r24.d;
        goto L20
    L18:
        if (r13 == 3) goto L21;
        r17 = r24.b;
        goto L20
    L21:
        r17 = r24.a;
        goto L20
    L9:
        if (r13 == 3) goto L11;
        r15 = r24.f;
        goto L14
    L11:
        r15 = r24.e;
        goto L14
    L13:
        r15 = r24.g;
        goto L14
    L35:
        Matrix[] r111 = r6;
        char r112 = 1;
        int r22 = 0;
    L36:
        if (r22 >= r12) goto L76;
        kc4 r113 = r8[r22];
        r7[r16] = r113.a;
        r7[r112] = r113.b;
        r9[r22].mapPoints(r7);
        if (r22 != 0) goto L40;
        r5.moveTo(r7[r16], r7[r112]);
    L41:
        r8[r22].b(r9[r22], r5);
        if (r4 == null) goto L44;
        kc4 r114 = r8[r22];
        Matrix r115 = r9[r22];
        fi2 r116 = (fi2) r4.o;
        BitSet r117 = r116.q;
        r114.getClass();
        r117.set(r22, r16);
        jc4[] r3 = r116.o;
        r114.a(r114.f);
        r3[r22] = new dc4(new ArrayList(r114.h), new Matrix(r115));
    L44:
        Path r23 = (Path) this.k;
        kc4 r118 = (kc4) this.h;
        int r119 = r22 + 1;
        int r120 = r119 % 4;
        kc4 r121 = r8[r22];
        kc4[] r29 = r8;
        r7[0] = r121.c;
        r7[1] = r121.d;
        r9[r22].mapPoints(r7);
        float[] r30 = (float[]) this.j;
        kc4 r122 = r29[r120];
        Matrix[] r210 = r9;
        r30[0] = r122.a;
        r30[1] = r122.b;
        r210[r120].mapPoints(r30);
        float r31 = Math.max(((float) Math.hypot(r7[0] - r30[0], r7[1] - r30[1])) - 0.001f, 0.0f);
        kc4 r32 = r29[r22];
        r7[0] = r32.c;
        r7[1] = r32.d;
        r210[r22].mapPoints(r7);
        if (r22 != 1) goto L47;
    L49:
        float r33 = Math.abs(r26.centerX() - r7[0]);
    L50:
        r118.d(0.0f, 0.0f, 270.0f, 0.0f);
        if (r22 != 1) goto L53;
        fz0 r34 = r24.k;
    L60:
        r34.j(r31, r33, r25, r118);
        r23.reset();
        r118.b(r111[r22], r23);
        if (this.a == true) goto L63;
    L69:
        r112 = 1;
        Path r35 = r28;
        r118.b(r111[r22], r35);
    L72:
        if (r27 == null) goto L74;
        Matrix r36 = r111[r22];
        pz1 r37 = r27;
        fi2 r38 = (fi2) r37.o;
        char r123 = 0;
        r38.q.set(r22 + 4, false);
        jc4[] r39 = r38.p;
        r118.a(r118.f);
        r39[r22] = new dc4(new ArrayList(r118.h), new Matrix(r36));
    L75:
        r5 = r35;
        r4 = r37;
        r22 = r119;
        r16 = r123;
        r8 = r29;
        r9 = r210;
        r12 = 4;
        goto L36
    L74:
        r37 = r27;
        r123 = 0;
        goto L75
    L63:
        if (r34.i() == false) goto L65;
    L70:
        r23.op(r23, r11, Path.Op.DIFFERENCE);
        r7[0] = r118.a;
        r112 = 1;
        r7[1] = r118.b;
        r111[r22].mapPoints(r7);
        r10.moveTo(r7[0], r7[1]);
        r118.b(r111[r22], r10);
        r35 = r28;
        goto L72
    L65:
        if (k(r23, r22) == true) goto L70;
        if (k(r23, r120) == false) goto L69;
    L53:
        if (r22 != 2) goto L55;
        r34 = r24.l;
        goto L60
    L55:
        if (r22 == 3) goto L57;
        r34 = r24.j;
        goto L60
    L57:
        r34 = r24.i;
        goto L60
    L47:
        if (r22 == 3) goto L49;
        r33 = Math.abs(r26.centerY() - r7[1]);
        goto L50
    L40:
        r5.lineTo(r7[r16], r7[r112]);
        goto L41
    L76:
        Path r40 = r5;
        r40.close();
        r10.close();
        if (r10.isEmpty() == true) goto L88;
        r40.op(r10, Path.Op.UNION);
        return;
    }

    public void e() {
        t(null);
        uc1 r7 = (uc1) this.c;
        Iterator r8 = gb.P(new TextInputLayout[]{r7.u, r7.f, r7.d, r7.A, r7.n, r7.m}).iterator();
    L4:
        if (r8.hasNext() == false) goto L6;
        ((TextInputLayout) r8.next()).setError(null);
        goto L4
    }

    public cu4 f() {
        ArrayList r0 = (ArrayList) this.c;
        if (r0.isEmpty() == true) goto L5;
        int r1 = 0;
        int r2 = 0;
    L8:
        if (r1 >= r0.size()) goto L11;
        bu2 r3 = (bu2) r0.get(r1);
        r3.d = r2;
        r2 = r2 + r3.a.o.e.o();
        r1 = r1 + 1;
        goto L8
    L11:
        return new tm3(r0, (pd4) this.k);
    L5:
        return cu4.a;
    }

    public void g() {
        Iterator r0 = ((HashSet) this.h).iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        bu2 r1 = (bu2) r0.next();
        if (r1.c.isEmpty() == false) goto L4;
        au2 r2 = (au2) ((HashMap) this.g).get(r1);
        if (r2 == null) goto L10;
        r2.a.c(r2.b);
    L10:
        r0.remove();
        goto L4
    }

    public boolean h() {
        HubAuthOptions r0 = (HubAuthOptions) this.i;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.getInvites() == false) goto L26;
        String r1 = r0.getMusicUrl();
        if (r1 != null) goto L11;
    L15:
        r1 = "http://192.168.1.129:4533";
    L17:
        if (l93.b0((String) this.e, r1) == false) goto L19;
        return true;
    L19:
        if (l93.b0((String) this.e, "http://192.168.1.129:4533") == true) goto L27;
        return false;
    L27:
        return true;
    L11:
        if (qm4.u0(r1) == false) goto L14;
        r1 = null;
    L14:
        if (r1 != null) goto L17;
    L26:
        return false;
    }

    public void i(bu2 r4) {
        if (r4.e == true) goto L5;
        return;
    L5:
        if (r4.c.isEmpty() == false) goto L9;
        au2 r0 = (au2) ((HashMap) this.g).remove(r4);
        r0.getClass();
        zt2 r1 = r0.c;
        bq r2 = r0.a;
        r2.o(r0.b);
        r2.r(r1);
        r2.q(r1);
        ((HashSet) this.h).remove(r4);
        return;
    }

    public boolean j(String r6) {
        uc1 r0 = (uc1) this.c;
        TextInputLayout r1 = r0.n;
        if (p(r1, r6) == true) goto L6;
        return false;
    L6:
        if (r6.length() >= 6) goto L10;
        r1.setError(v(R.string.homemusic_login_short_password, new Object[0]));
        return false;
    L10:
        if (r6.equals(String.valueOf(r0.l.getText())) == true) goto L13;
        r0.m.setError(v(R.string.homemusic_login_mismatch, new Object[0]));
        return false;
    L13:
        return true;
    }

    public boolean k(Path r3, int r4) {
        Path r0 = (Path) this.l;
        r0.reset();
        ((kc4[]) this.b)[r4].b(((Matrix[]) this.c)[r4], r0);
        RectF r2 = new RectF();
        r3.computeBounds(r2, true);
        r0.computeBounds(r2, true);
        r3.op(r0, Path.Op.INTERSECT);
        r3.computeBounds(r2, true);
        if (r2.isEmpty() == true) goto L5;
    L11:
        return true;
    L5:
        if (r2.width() > 1.0f) goto L7;
        return false;
    L7:
        if (r2.height() > 1.0f) goto L11;
        return false;
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
    public void l(bu2 r7) {
        rg2 r0 = r7.a;
        ?? r1 = new ut2(this);
        zt2 r2 = new zt2(this, r7);
        ((HashMap) this.g).put(r7, new au2(r0, r1, r2));
        Handler r3 = f35.q(null);
        r0.getClass();
        ue1 r4 = r0.c;
        r4.getClass();
        CopyOnWriteArrayList r5 = (CopyOnWriteArrayList) r4.q;
        rt2 r6 = new rt2();
        r6.a = r3;
        r6.b = r2;
        r5.add(r6);
        Handler r8 = f35.q(null);
        sw0 r9 = r0.d;
        r9.getClass();
        CopyOnWriteArrayList r10 = r9.c;
        rw0 r11 = new rw0();
        r11.a = r8;
        r11.b = r2;
        r10.add(r11);
        r0.k(r1, (rw4) this.l, (ik3) this.b);
    }

    public void m() {
        uc1 r1 = (uc1) this.c;
        TextInputLayout r2 = r1.d;
        TextInputEditText r3 = r1.c;
        TextInputLayout r4 = r1.A;
        TextInputEditText r5 = r1.k;
        TextInputEditText r6 = r1.z;
        if (this.a == true) goto L62;
        int r7 = ((co1) this.d).ordinal();
        if (r7 == 0) goto L52;
        int r9 = 10;
        Object r10 = null;
        if (r7 != 1) goto L10;
        String r8 = qm4.K0(String.valueOf(r6.getText())).toString();
        String r11 = String.valueOf(r5.getText());
        if (p(r4, r8) == true) goto L42;
        return;
    L42:
        if (p(r1.n, r11) == true) goto L45;
        return;
    L45:
        if (qm4.n0(r8, '@') == true) goto L47;
    L50:
        u(r8, r11);
        return;
    L47:
        if (h() == false) goto L50;
        fa r12 = new fa(8, r8, r11);
        r(true);
        io1.a.execute(new v6(r12, this, r10, r9));
        return;
    L10:
        if (r7 != 2) goto L12;
        final String r13 = qm4.K0(String.valueOf(r3.getText())).toString();
        final String r14 = qm4.K0(String.valueOf(r6.getText())).toString();
        final String r15 = String.valueOf(r5.getText());
        final String r16 = (String) this.f;
        if (p(r2, r13) == true) goto L31;
        return;
    L31:
        if (p(r4, r14) == false) goto L64;
        if (r16 == null) goto L35;
    L37:
        final int r17 = 1;
        gf1 r18 = new ao1(r16, r13, r14, r17, r15);
        r(true);
        io1.a.execute(new v6(r18, this, r10, r9));
        return;
    L35:
        if (j(r15) == true) goto L37;
        return;
    L64:
        return;
    L12:
        if (r7 != 3) goto L26;
        final String r19 = (String) this.h;
        if (r19 != null) goto L17;
        q();
        return;
    L17:
        final String r110 = qm4.K0(String.valueOf(r3.getText())).toString();
        final String r111 = qm4.K0(String.valueOf(r6.getText())).toString();
        final String r20 = String.valueOf(r5.getText());
        if (p(r2, r110) == true) goto L20;
        return;
    L20:
        if (p(r4, r111) == true) goto L22;
        return;
    L22:
        if (j(r20) == false) goto L63;
        final int r112 = 0;
        gf1 r113 = new ao1(r19, r110, r111, r112, r20);
        r(true);
        io1.a.execute(new v6(r113, this, r10, r9));
        return;
    L63:
        return;
    L26:
        er1.n();
        return;
    L52:
        String r21 = l93.M(String.valueOf(r1.r.getText()));
        if (r21 != null) goto L56;
        r1.u.setError(v(R.string.homemusic_login_server_bad, new Object[0]));
        return;
    L56:
        r(true);
        io1.a.execute(new yn1(r21, this));
        return;
    }

    public void n(no2 r4) {
        IdentityHashMap r0 = (IdentityHashMap) this.d;
        bu2 r1 = (bu2) r0.remove(r4);
        r1.getClass();
        r1.a.n(r4);
        r1.c.remove(((og2) r4).n);
        if (r0.isEmpty() == true) goto L5;
        g();
    L5:
        i(r1);
    }

    public void o(int r8, int r9) {
        ArrayList r0 = (ArrayList) this.c;
        int r10 = r9 - 1;
    L3:
        if (r10 < r8) goto L12;
        bu2 r2 = (bu2) r0.remove(r10);
        ((HashMap) this.e).remove(r2.b);
        int r3 = -r2.a.o.e.o();
        int r4 = r10;
    L6:
        if (r4 >= r0.size()) goto L8;
        ((bu2) r0.get(r4)).d += r3;
        r4 = r4 + 1;
        goto L6
    L8:
        r2.e = true;
        if (this.a == false) goto L11;
        i(r2);
    L11:
        r10 = r10 - 1;
        goto L3
    }

    public boolean p(TextInputLayout r3, String r4) {
        if (r4.length() <= 0) goto L6;
        return true;
    L6:
        r3.setError(v(R.string.homemusic_login_required, new Object[0]));
        EditText r2 = r3.getEditText();
        if (r2 == null) goto L9;
        r2.requestFocus();
    L9:
        return false;
    }

    public void q() {
        uc1 r0 = (uc1) this.c;
        String r1 = qm4.K0(String.valueOf(r0.e.getText())).toString();
        TextInputLayout r2 = r0.f;
        if (p(r2, r1) == true) goto L6;
        return;
    L6:
        if (qm4.n0(r1, '@') == true) goto L9;
        r2.setError(v(R.string.homemusic_login_email_bad, new Object[0]));
        return;
    L9:
        r(true);
        io1.a.execute(new yn1(this, r1));
    }

    public void r(boolean r12) {
        this.a = r12;
        uc1 r0 = (uc1) this.c;
        LinearProgressIndicator r1 = r0.p;
        if (r12 == false) goto L5;
        int r4 = 0;
    L6:
        r1.setVisibility(r4);
        Iterator r2 = gb.P(new View[]{r0.o, r0.i, r0.y, r0.g, r0.v, r0.s}).iterator();
    L8:
        if (r2.hasNext() == false) goto L10;
        ((View) r2.next()).setEnabled(!r12);
        goto L8
    L10:
        Iterator r3 = gb.P(new TextInputEditText[]{r0.r, r0.e, r0.c, r0.z, r0.k, r0.l}).iterator();
    L12:
        if (r3.hasNext() == false) goto L14;
        ((TextInputEditText) r3.next()).setEnabled(!r12);
        goto L12
    L14:
        w();
        return;
    L5:
        r4 = 4;
        goto L6
    }

    public void s(co1 r24) {
        uc1 r2 = (uc1) this.c;
        TextInputEditText r3 = r2.z;
        TextView r4 = r2.j;
        MaterialButton r5 = r2.y;
        TextInputEditText r6 = r2.k;
        TextInputLayout r7 = r2.A;
        TextInputLayout r8 = r2.d;
        TextInputEditText r9 = r2.c;
        co1 r11 = co1.p;
        if (r24 == r11) goto L6;
        this.f = null;
        this.g = null;
    L6:
        if (r24 == ((co1) this.d)) goto L8;
        boolean r12 = true;
    L9:
        if (r12 == false) goto L11;
        r9.setText(null);
    L11:
        this.d = r24;
        bd1 r15 = (bd1) this.k;
        co1 r10 = co1.n;
        if (r24 == r10) goto L14;
        boolean r14 = true;
    L15:
        r15.c(r14);
        e();
        if (((String) this.f) == null) goto L18;
        boolean r16 = true;
    L20:
        if (r24 != co1.q) goto L22;
        boolean r17 = true;
    L23:
        if (r17 == true) goto L25;
    L27:
        boolean r13 = false;
    L28:
        if (r24 == r11) goto L32;
        if (r17 == true) goto L32;
        boolean r18 = false;
    L33:
        boolean r19 = h();
        if (r19 == false) goto L40;
        HubAuthOptions r20 = (HubAuthOptions) this.i;
        if (r20 == null) goto L40;
        boolean r110 = r12;
        if (r20.getEmailSignup() != true) goto L41;
        boolean r111 = true;
    L42:
        LinearLayout r21 = r2.w;
        if (r24 != r10) goto L45;
        int r112 = 0;
    L46:
        r21.setVisibility(r112);
        LinearLayout r22 = r2.b;
        if (r24 == r10) goto L49;
        int r113 = 0;
    L50:
        r22.setVisibility(r113);
        r2.t.setText((String) this.e);
        TextInputLayout r23 = r2.f;
        if (r17 == false) goto L53;
        int r114 = 0;
    L54:
        r23.setVisibility(r114);
        if (r24 == r11) goto L60;
        if (r17 == false) goto L59;
        if (r13 == false) goto L60;
    L59:
        int r25 = 8;
    L61:
        r8.setVisibility(r25);
        if (r17 == false) goto L65;
        int r26 = R.string.homemusic_login_email_code;
    L66:
        r8.setHint(v(r26, new Object[0]));
        if (r17 == false) goto L69;
        String r27 = "000000";
    L70:
        r8.setPlaceholderText(r27);
        if (r17 == false) goto L73;
        int r28 = 2;
    L74:
        r9.setInputType(r28);
        MaterialButton r29 = r2.q;
        if (r17 == false) goto L78;
        if (r13 == true) goto L78;
        int r115 = 0;
    L79:
        r29.setVisibility(r115);
        if (r13 == true) goto L82;
        int r30 = 0;
    L83:
        r7.setVisibility(r30);
        co1 r31 = co1.o;
        if (r24 != r31) goto L88;
        if (r111 == false) goto L88;
        int r116 = R.string.homemusic_login_user_or_email;
    L89:
        r7.setHint(v(r116, new Object[0]));
        TextInputLayout r32 = r2.n;
        if (r13 == true) goto L95;
        if (r24 == r31) goto L94;
        if (r18 == false) goto L95;
        if (r16 == true) goto L95;
    L94:
        int r33 = 0;
    L96:
        r32.setVisibility(r33);
        TextInputLayout r34 = r2.m;
        if (r13 == true) goto L101;
        if (r18 == false) goto L101;
        if (r16 == true) goto L101;
        int r35 = 0;
    L102:
        r34.setVisibility(r35);
        if (r18 == false) goto L105;
        int r36 = 5;
    L106:
        r6.setImeOptions(r36);
        TextView r37 = r2.x;
        int r38 = r24.ordinal();
        String r117 = "";
        if (r38 != 0) goto L109;
        TextInputEditText r210 = r6;
        String r39 = v(R.string.homemusic_login_server_subtitle, new Object[0]);
    L129:
        r37.setText(r39);
        MaterialButton r40 = r2.o;
        int r41 = r24.ordinal();
        if (r41 != 0) goto L132;
        int r42 = R.string.homemusic_login_next;
    L144:
        r40.setText(v(r42, new Object[0]));
        if (r19 == false) goto L149;
        if (r24 == r10) goto L149;
        if (r16 == true) goto L149;
        int r43 = 0;
    L150:
        r5.setVisibility(r43);
        if (r24 != r31) goto L154;
        int r44 = R.string.homemusic_login_to_register;
    L155:
        r5.setText(v(r44, new Object[0]));
        MaterialButton r45 = r2.g;
        if (r24 != r31) goto L159;
        if (r111 == 0) goto L159;
        int r46 = 0;
    L160:
        r45.setVisibility(r46);
        MaterialButton r47 = r2.i;
        if (r24 != r31) goto L172;
        if (r19 == false) goto L172;
        HubAuthOptions r48 = (HubAuthOptions) this.i;
        if (r48 == null) goto L166;
        String r118 = r48.getGoogleClientId();
    L167:
        if (r118 == null) goto L172;
        if (qm4.u0(r118) == true) goto L172;
        int r49 = 0;
    L173:
        r47.setVisibility(r49);
        int r50 = r24.ordinal();
        if (r50 != 0) goto L176;
        int r119 = 0;
    L195:
        r4.setText(r117);
        CharSequence r51 = r4.getText();
        r51.getClass();
        if (r51.length() <= 0) goto L198;
        int r120 = r119;
    L199:
        r4.setVisibility(r120);
        x();
        w();
        if (r110 == true) goto L203;
        if (r17 == true) goto L203;
        return;
    L203:
        int r0 = r24.ordinal();
        if (r0 != 0) goto L206;
        r2.r.requestFocus();
        return;
    L206:
        if (r0 != 1) goto L208;
        Editable r1 = r3.getText();
        if (r1 != null) goto L224;
    L227:
        TextInputEditText r52 = r3;
    L228:
        r52.requestFocus();
        return;
    L224:
        if (r1.length() == 0) goto L227;
        r52 = r210;
        goto L228
    L208:
        if (r0 != 2) goto L210;
        r9.requestFocus();
        return;
    L210:
        if (r0 != 3) goto L217;
        if (r13 == false) goto L215;
        if (r110 == false) goto L232;
        r2.e.requestFocus();
        return;
    L232:
        return;
    L215:
        r9.requestFocus();
        return;
    L217:
        er1.n();
        return;
    L198:
        r120 = 8;
        goto L199
    L176:
        if (r50 == 1) goto L187;
        int r53 = R.string.homemusic_login_register_hint;
        if (r50 != 2) goto L180;
        r119 = 0;
        r117 = v(R.string.homemusic_login_register_hint, new Object[0]);
        goto L195
    L180:
        if (r50 != 3) goto L184;
        if (r13 == false) goto L183;
        r53 = R.string.homemusic_login_email_hint;
    L183:
        r119 = 0;
        r117 = v(r53, new Object[0]);
        goto L195
    L184:
        er1.n();
        return;
    L187:
        r119 = 0;
        if (r19 == false) goto L195;
        if (r111 == 0) goto L192;
        int r54 = R.string.homemusic_login_hint_email;
    L193:
        r117 = v(r54, new Object[0]);
        goto L195
    L192:
        r54 = R.string.homemusic_login_hint;
        goto L193
    L166:
        r118 = null;
    L172:
        r49 = 8;
    L159:
        r46 = 8;
        goto L160
    L154:
        r44 = R.string.homemusic_login_to_account;
    L149:
        r43 = 8;
        goto L150
    L132:
        if (r41 == 1) goto L142;
        r42 = R.string.homemusic_login_create;
        if (r41 == 2) goto L144;
        if (r41 != 3) goto L140;
        if (r13 == false) goto L144;
        r42 = R.string.homemusic_login_email_send;
        goto L144
    L140:
        er1.n();
        return;
    L142:
        r42 = R.string.homemusic_login_sign_in;
        goto L144
    L109:
        if (r38 != 1) goto L111;
        r210 = r6;
        r39 = v(R.string.homemusic_login_account_subtitle, new Object[0]);
        goto L129
    L111:
        if (r38 != 2) goto L113;
        r210 = r6;
        if (r16 == false) goto L126;
        String r55 = (String) this.g;
        if (r55 != null) goto L125;
        r55 = "";
    L125:
        r39 = v(R.string.homemusic_login_google_register_subtitle, new Object[]{r55});
        goto L129
    L126:
        r39 = v(R.string.homemusic_login_register_subtitle, new Object[0]);
        goto L129
    L113:
        if (r38 != 3) goto L118;
        String r56 = (String) this.h;
        if (r56 == null) goto L117;
        r39 = v(R.string.homemusic_login_email_sent, new Object[]{r56});
        r210 = r6;
        goto L129
    L117:
        r210 = r6;
        r39 = v(R.string.homemusic_login_email_subtitle, new Object[0]);
        goto L129
    L118:
        er1.n();
        return;
    L105:
        r36 = 2;
    L101:
        r35 = 8;
    L95:
        r33 = 8;
    L88:
        r116 = R.string.homemusic_login_user;
        goto L89
    L82:
        r30 = 8;
    L78:
        r115 = 8;
        goto L79
    L73:
        r28 = 528529;
        goto L74
    L69:
        r27 = "ABCD-EFGH";
        goto L70
    L65:
        r26 = R.string.homemusic_login_code;
    L60:
        r25 = 0;
        goto L61
    L53:
        r114 = 8;
        goto L54
    L49:
        r113 = 8;
        goto L50
    L45:
        r112 = 8;
    L41:
        r111 = false;
    L40:
        r110 = r12;
    L32:
        r18 = true;
        goto L33
    L25:
        if (((String) this.h) != null) goto L27;
        r13 = true;
        goto L28
    L22:
        r17 = false;
        goto L23
    L18:
        r16 = false;
        goto L20
    L14:
        r14 = false;
        goto L15
    L8:
        r12 = false;
        goto L9
    }

    public void t(String r1) {
        TextView r0 = ((uc1) this.c).h;
        r0.setText(r1);
        if (r1 != null) goto L5;
    L8:
        int r2 = 8;
    L9:
        r0.setVisibility(r2);
        return;
    L5:
        if (qm4.u0(r1) == true) goto L8;
        r2 = 0;
        goto L9
    }

    public void u(String r18, String r19) {
        r(true);
        Iterator r2 = ((List) this.j).iterator();
    L4:
        if (r2.hasNext() == false) goto L11;
        Object r3 = r2.next();
        Server r5 = (Server) r3;
        if (l93.b0(r5.getAddress(), (String) this.e) == false) goto L4;
        String r9 = r18;
        if (h12.c(r5.getUsername(), r9) == false) goto L4;
    L12:
        Server r4 = (Server) r3;
        if (l93.b0((String) this.e, "http://192.168.1.129:4533") == false) goto L16;
        String r6 = "http://192.168.1.129:4533";
    L15:
        String r12 = r6;
    L20:
        if (r4 == null) goto L25;
        String r7 = r4.getServerId();
        if (r7 == null) goto L25;
    L24:
        String r8 = r7;
        if (r4 == null) goto L31;
        String r10 = r4.getServerName();
        if (r10 == null) goto L31;
    L32:
        Server r11 = new Server(r8, r10, r9, r19, (String) this.e, r12, System.currentTimeMillis(), false, null);
        ud3.w0(r11.getServerId());
        ud3.v0(r11.getAddress());
        ud3.n0(r11.getLocalAddress());
        ud3.m0(r11.getAddress());
        ud3.D0(r11.getUsername());
        ud3.q0(r11.getPassword());
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        rf2 r1 = new rf2(this, r11);
        pn4 r0 = App.f(false);
        if (r0.c != null) goto L35;
        r0.c = new gp3(r0, 21);
    L35:
        r0.c.u().enqueue(new rm2(23, r1));
        return;
    L31:
        r10 = "HomeMusic";
    L25:
        r7 = UUID.randomUUID().toString();
        r7.getClass();
        goto L24
    L16:
        if (r4 == null) goto L18;
        r6 = r4.getLocalAddress();
        goto L15
    L18:
        r12 = null;
        goto L20
    L11:
        r9 = r18;
        r3 = null;
        goto L12
    }

    public String v(int r2, Object... r3) {
        String r1 = ((LoginFragment) this.b).t(r2, Arrays.copyOf(r3, r3.length));
        r1.getClass();
        return r1;
    }

    public void w() {
        MaterialButton r0 = ((uc1) this.c).q;
        qa1 r1 = (qa1) this.l;
        r0.removeCallbacks(r1);
        if (r0.getVisibility() != 0) goto L17;
        int r4 = (int) ((999 - System.currentTimeMillis()) / 1000);
        if (this.a == true) goto L8;
        if (r4 > 0) goto L8;
        boolean r5 = true;
    L9:
        r0.setEnabled(r5);
        if (r4 <= 0) goto L12;
        String r7 = v(R.string.homemusic_login_email_resend_in, new Object[]{Integer.valueOf(r4)});
    L13:
        r0.setText(r7);
        if (r4 <= 0) goto L18;
        r0.postDelayed(r1, 1000);
        return;
    L18:
        return;
    L12:
        r7 = v(R.string.homemusic_login_email_resend, new Object[0]);
    L8:
        r5 = false;
        goto L9
    }

    public void x() {
        uc1 r0 = (uc1) this.c;
        String r1 = qm4.K0(String.valueOf(r0.r.getText())).toString();
        TextView r2 = r0.s;
        if (((co1) this.d) == co1.n) goto L5;
    L7:
        int r3 = 8;
    L8:
        r2.setVisibility(r3);
        return;
    L5:
        if (l93.b0(r1, "http://192.168.1.129:4533") == true) goto L7;
        r3 = 0;
        goto L8
    }

    public fo1(LoginFragment r1, uc1 r2) {
        this.b = r1;
        this.c = r2;
        this.d = co1.n;
        this.e = "";
        this.j = u01.n;
        this.k = new bd1(1, this);
        this.l = new qa1(4, this);
    }

    public fo1(q41 r1, nj0 r2, yp4 r3, ik3 r4) {
        this.b = r4;
        this.f = r1;
        this.k = new pd4();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = r2;
        this.j = r3;
        this.g = new HashMap();
        this.h = new HashSet();
    }
}
