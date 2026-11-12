package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 implements b85, y43, fv2 {
    public static final int[] q = null;
    public final /* synthetic */ int n;
    public boolean o;
    public Object p;

    static {
        q = new int[]{8, 13, 11, 2, 0, 1, 7};
    }

    public xk0(int r4) {
        this.n = r4;
        switch(r4) {
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L5;
            case 5: goto L5;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        this.p = new Handler(Looper.getMainLooper(), new yq(1));
        return;
    L8:
        this.p = new ArrayList();
        return;
    L10:
        this.p = new SparseBooleanArray();
        return;
    }

    public static void e(int r3, ArrayList r4) {
        if (jz4.y(q, r3, 0, 7) != (-1)) goto L5;
        return;
    L5:
        if (r4.contains(Integer.valueOf(r3)) == true) goto L10;
        r4.add(Integer.valueOf(r3));
        return;
    }

    public static xk0 h(Bundle r7) {
        if (r7 != null) goto L5;
        return null;
    L5:
        ArrayList r1 = new ArrayList();
        ArrayList r2 = r7.getParcelableArrayList("routes");
        if (r2 == null) goto L16;
        int r4 = 0;
    L9:
        if (r4 >= r2.size()) goto L16;
        Bundle r5 = (Bundle) r2.get(r4);
        if (r5 == null) goto L13;
        sp2 r6 = new sp2(r5);
    L14:
        r1.add(r6);
        r4 = r4 + 1;
        goto L9
    L13:
        r6 = null;
    L16:
        return new xk0(r1, r7.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // defpackage.y43
    public long R(int r1, long r2, long r4) {
        if (this.o == false) goto L9;
        g74 r0 = (g74) this.p;
        if (r0.a.a() == false) goto L8;
        return 0;
    L8:
        return r0.i(r0.e(r0.a.d(r0.e(r0.h(r4)))));
    L9:
        return 0;
    }

    @Override // defpackage.fv2
    public void a(qu2 r3, boolean r4) {
        cv4 r5 = (cv4) this.p;
        if (this.o == false) goto L5;
        return;
    L5:
        this.o = true;
        ActionMenuView r0 = r5.d.a.n;
        if (r0 == null) goto L14;
        y4 r1 = r0.G;
        if (r1 == null) goto L14;
        r1.f();
        t4 r2 = r1.H;
        if (r2 == null) goto L14;
        if (r2.b() == false) goto L14;
        r2.i.dismiss();
    L14:
        r5.e.onPanelClosed(108, r3);
        this.o = false;
    }

    public void b(int r3) {
        rr2.w(!this.o);
        ((SparseBooleanArray) this.p).append(r3, true);
    }

    @Override // defpackage.y43
    public Object b0(long r4, long r6, vd0 r8) {
        if ((r8 instanceof w64) == false) goto L7;
        w64 r5 = (w64) r8;
        int r7 = r5.q;
        if ((r7 & Integer.MIN_VALUE) == 0) goto L7;
        r5.q = r7 - Integer.MIN_VALUE;
    L8:
        Object r9 = r5.o;
        int r10 = r5.q;
        if (r10 == 0) goto L14;
        if (r10 != 1) goto L12;
        r6 = r5.n;
        kb4.X(r9);
    L22:
        long r1 = ((k45) r9).a;
    L23:
        r1 = k45.d(r6, r1);
    L25:
        return new k45(r1);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        r1 = 0;
        if (this.o == false) goto L25;
        g74 r3 = (g74) this.p;
        if (r3.i == true) goto L23;
        r5.n = r6;
        r5.q = 1;
        r9 = r3.a(r6, r5);
        xe0 r11 = xe0.n;
        if (r9 != r11) goto L22;
        return r11;
    L7:
        r5 = new w64(this, (wd0) r8);
        goto L8
    }

    public void c(w71 r3) {
        int r0 = 0;
    L4:
        if (r0 >= r3.a.size()) goto L6;
        b(r3.b(r0));
        r0 = r0 + 1;
        goto L4
    }

    public void d(int... r4) {
        int r0 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        b(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    public w71 f() {
        rr2.w(!this.o);
        this.o = true;
        return new w71((SparseBooleanArray) this.p);
    }

    public boolean g() {
        return this.o;
    }

    public tb1 i(tb1 r4) {
        if (this.o == true) goto L5;
    L12:
        return r4;
    L5:
        if (((om0) this.p).n(r4) == false) goto L12;
        sb1 r0 = r4.a();
        String r1 = r4.k;
        r0.m = lw2.m("application/x-media3-cues");
        r0.K = ((om0) this.p).R(r4);
        StringBuilder r3 = new StringBuilder();
        r3.append(r4.n);
        if (r1 == null) goto L9;
        String r5 = " ".concat(r1);
    L10:
        r3.append(r5);
        r0.j = r3.toString();
        r0.r = Long.MAX_VALUE;
        return new tb1(r0);
    L9:
        r5 = "";
        goto L10
    }

    public boolean j(CharSequence r7, int r8) {
        char r0 = 0;
        if (r7 == null) goto L30;
        if (r8 < 0) goto L30;
        if ((r7.length() - r8) < 0) goto L30;
        if (((rv2) this.p) == null) goto L10;
        int r2 = 0;
        r0 = 2;
    L13:
        if (r2 >= r8) goto L24;
        if (r0 != 2) goto L24;
        byte r3 = Character.getDirectionality(r7.charAt(r2));
        xk0 r5 = vr4.a;
        if (r3 == 0) goto L22;
        if (r3 == 1) goto L23;
        if (r3 == 2) goto L23;
        switch(r3) {
            case 14: goto L22;
            case 15: goto L22;
            case 16: goto L23;
            case 17: goto L23;
            default: goto L20;
        };
    L20:
        r0 = 2;
    L23:
        r2 = r2 + 1;
    L22:
        r0 = 1;
    L24:
        if (r0 == 0) goto L29;
        if (r0 != 1) goto L27;
        return false;
    L27:
        return g();
    L29:
        return true;
    L10:
        return g();
    L30:
        nz2.c();
        return false;
    }

    public synchronized void k(q04 r3, boolean r4) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.o == true) goto L10;
        if (r4 == true) goto L10;
        this.o = true;     // Catch: Throwable -> L8
        r3.b();     // Catch: Throwable -> L8
        this.o = false;     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
        return;
    L10:
        ((Handler) this.p).obtainMessage(1, r3).sendToTarget();     // Catch: Throwable -> L8
        goto L11
    }

    @Override // defpackage.b85
    public pb5 m(View r12, pb5 r13, c85 r14) {
        mb5 r0 = r13.a;
        vz1 r1 = r0.h(519);
        vz1 r2 = r0.h(32);
        BottomSheetBehavior r3 = (BottomSheetBehavior) this.p;
        int r4 = r1.b;
        int r5 = r1.c;
        int r6 = r1.a;
        r3.J = r4;
        boolean r7 = vr1.z(r12);
        int r8 = r12.getPaddingBottom();
        int r9 = r12.getPaddingLeft();
        int r10 = r12.getPaddingRight();
        boolean r11 = r3.B;
        if (r11 == false) goto L6;
        int r15 = r13.a();
        r3.I = r15;
        r8 = r15 + r14.d;
    L6:
        if (r3.C == false) goto L12;
        if (r7 == false) goto L9;
        int r16 = r14.c;
    L10:
        r9 = r16 + r6;
        goto L12
    L9:
        r16 = r14.a;
    L12:
        if (r3.D == false) goto L17;
        if (r7 == false) goto L15;
        int r17 = r14.a;
    L16:
        r10 = r17 + r5;
        goto L17
    L15:
        r17 = r14.c;
    L17:
        ViewGroup.MarginLayoutParams r18 = (ViewGroup.MarginLayoutParams) r12.getLayoutParams();
        boolean r19 = true;
        if (r3.F == true) goto L20;
    L22:
        boolean r20 = false;
    L24:
        if (r3.G == false) goto L29;
        if (r18.rightMargin == r5) goto L29;
        r18.rightMargin = r5;
        r20 = true;
    L29:
        if (r3.H == false) goto L33;
        int r21 = r18.topMargin;
        int r22 = r1.b;
        if (r21 == r22) goto L33;
        r18.topMargin = r22;
    L34:
        if (r19 == false) goto L36;
        r12.setLayoutParams(r18);
    L36:
        r12.setPadding(r9, r12.getPaddingTop(), r10, r8);
        boolean r110 = this.o;
        if (r110 == false) goto L39;
        r3.z = r2.d;
    L39:
        if (r11 == true) goto L43;
        if (r110 == true) goto L43;
        return r13;
    L43:
        r3.Q();
        return r13;
    L33:
        r19 = r20;
        goto L34
    L20:
        if (r18.leftMargin == r6) goto L22;
        r18.leftMargin = r6;
        r20 = true;
        goto L24
    }

    public String toString() {
        switch(this.n) {
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
        List r5 = (List) this.p;
        r0.append(Arrays.toString(r5.toArray()));
        r0.append(", isValid=");
        int r1 = r5.size();
        boolean r2 = false;
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L14;
        sp2 r4 = (sp2) r5.get(r3);
        if (r4 == null) goto L15;
        if (r4.e() == false) goto L15;
        r3 = r3 + 1;
    L15:
        r0.append(r2);
        r0.append(" }");
        return r0.toString();
    L14:
        r2 = true;
        goto L15
    L5:
        return super.toString();
    }

    @Override // defpackage.fv2
    public boolean w(qu2 r2) {
        ((cv4) this.p).e.onMenuOpened(108, r2);
        return true;
    }

    public /* synthetic */ xk0(Object r1, boolean r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    public /* synthetic */ xk0(int r1, Object r2) {
        this.n = r1;
        this.p = r2;
    }

    public xk0(ArrayList r2, boolean r3) {
        this.n = 5;
        if (r2.isEmpty() == false) goto L5;
        this.p = Collections.EMPTY_LIST;
    L6:
        this.o = r3;
        return;
    L5:
        this.p = Collections.unmodifiableList(new ArrayList(r2));
        goto L6
    }

    public xk0(rv2 r2, boolean r3) {
        this.n = 8;
        this(8, r2);
        this.o = r3;
    }

    public xk0(WebView r2, boolean r3) {
        this.n = 4;
        r2.getClass();
        this.p = r2;
        this.o = r3;
    }
}
