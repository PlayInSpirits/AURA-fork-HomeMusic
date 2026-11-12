package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 implements TextWatcher {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ pn1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    private final void a(Editable r1) {
    }

    private final void b(Editable r1) {
    }

    private final void c(Editable r1) {
    }

    private final void d(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void e(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void f(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void g(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void h(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void i(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void j(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void k(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void l(int r1, int r2, int r3, CharSequence r4) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r3) {
        int r0 = this.n;
        String r1 = "";
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L11;
            case 2: goto L29;
            case 3: goto L29;
            case 4: goto L29;
            default: goto L4;
        };
    L4:
        TextInputLayout r4 = (TextInputLayout) r2;
        r4.u(!r4.M0, false);
        if (r4.x == false) goto L8;
        r4.n(r3);
    L8:
        if (r4.F == false) goto L30;
        r4.v(r3);
        return;
    L30:
        return;
    L11:
        eu3 r5 = (eu3) r2;
        r5.p0();
        if (r5.N0 == false) goto L14;
        return;
    L14:
        if (r5.J0 == null) goto L32;
        if (r3 == null) goto L18;
        r1 = r3.toString();
    L18:
        r5.o0(r1);
        return;
    L32:
        return;
    L20:
        x r6 = (x) r2;
        if (r3 == null) goto L23;
        String r7 = r3.toString();
    L24:
        if (r7 == null) goto L27;
        r1 = r7;
    L27:
        r6.invoke(r1);
        return;
    L23:
        r7 = null;
        goto L24
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r0 = this.n;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r9, int r10, int r11, int r12) {
        int r13 = this.n;
        int r0 = 8;
        Object r8 = this.o;
        switch(r13) {
            case 0: goto L31;
            case 1: goto L31;
            case 2: goto L23;
            case 3: goto L10;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ImageButton r14 = ((SearchView) r8).x;
        if (r9.length() <= 0) goto L8;
        r0 = 0;
    L8:
        r14.setVisibility(r0);
        return;
    L10:
        androidx.appcompat.widget.SearchView r15 = (androidx.appcompat.widget.SearchView) r8;
        Editable r16 = r15.C.getText();
        r15.n0 = r16;
        boolean r17 = TextUtils.isEmpty(r16);
        r15.v(!r17);
        if (r15.l0 == true) goto L13;
    L16:
        r15.J.setVisibility(r0);
        r15.r();
        r15.u();
        if (r15.a0 != null) goto L19;
    L21:
        r15.m0 = r9.toString();
        return;
    L19:
        if (TextUtils.equals(r9, r15.m0) == true) goto L21;
        r15.a0.onQueryTextChange(r9.toString());
        goto L21
    L13:
        if (r15.e0 == true) goto L16;
        if (r17 == false) goto L16;
        r15.H.setVisibility(8);
        r0 = 0;
        goto L16
    L23:
        SearchFragment r18 = (SearchFragment) r8;
        if ((r10 + r12) <= 1) goto L29;
        String r3 = r9.toString();
        r18.n0.c.getClass();
        k03 r19 = new k03();
        pn4 r110 = App.f(false);
        if (r110.g != null) goto L28;
        r110.g = new hd5(r110);
    L28:
        r110.g.m(r3, 5, 0, 5, 5).enqueue(new p8(r19, 4));
        r19.e(r18.v(), new k74(r18, 2));
        return;
    L29:
        r18.i0();
        return;
    }
}
