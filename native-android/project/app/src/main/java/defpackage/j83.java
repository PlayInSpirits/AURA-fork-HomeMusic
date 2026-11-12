package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j83 implements su, r83, bi {
    public static final byte[] q = null;
    public static final byte[] r = null;
    public int n;
    public int o;
    public Object p;

    static {
        q = new byte[]{79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
        r = new byte[]{79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public j83(Context r7, XmlResourceParser r8) {
        this.p = new ArrayList();
        this.o = -1;
        TypedArray r9 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), kt3.h);
        int r0 = r9.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L13;
        int r2 = r9.getIndex(r1);
        if (r2 != 0) goto L8;
        this.n = r9.getResourceId(r2, this.n);
    L12:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r2 != 1) goto L12;
        int r3 = r9.getResourceId(r2, this.o);
        this.o = r3;
        String r4 = r7.getResources().getResourceTypeName(r3);
        r7.getResources().getResourceName(r3);
        if ("layout".equals(r4) == false) goto L12;
        new wb0().b((ConstraintLayout) LayoutInflater.from(r7).inflate(r3, null));
        goto L12
    L13:
        r9.recycle();
    }

    public static void n(ByteBuffer r1, long r2, int r4, int r5, boolean r6) {
        r1.put((byte) 79);
        r1.put((byte) 103);
        r1.put((byte) 103);
        r1.put((byte) 83);
        r1.put((byte) 0);
        if (r6 == false) goto L5;
        byte r7 = 2;
    L6:
        r1.put(r7);
        r1.putLong(r2);
        r1.putInt(0);
        r1.putInt(r4);
        r1.putInt(0);
        r1.put(ji2.p(r5));
        return;
    L5:
        r7 = 0;
        goto L6
    }

    @Override // defpackage.bi
    public void a(int r3, Object r4) {
        bi r0 = (bi) this.p;
        if (this.o != 0) goto L5;
        int r2 = this.n;
    L6:
        r0.a(r3 + r2, r4);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.bi
    public void b(Object r2) {
        this.o++;
        ((bi) this.p).b(r2);
    }

    @Override // defpackage.bi
    public void c() {
        ((bi) this.p).c();
    }

    @Override // defpackage.bi
    public void d(int r2, int r3, int r4) {
        if (this.o != 0) goto L5;
        int r0 = this.n;
    L6:
        ((bi) this.p).d(r2 + r0, r3 + r0, r4);
        return;
    L5:
        r0 = 0;
        goto L6
    }

    @Override // defpackage.bi
    public void e(int r3, int r4) {
        bi r0 = (bi) this.p;
        if (this.o != 0) goto L5;
        int r2 = this.n;
    L6:
        r0.e(r3 + r2, r4);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.su
    public int f() {
        return this.n;
    }

    @Override // defpackage.bi
    public void g() {
        if (this.o > 0) goto L6;
        l80.a("OffsetApplier up called with no corresponding down");
    L6:
        this.o--;
        ((bi) this.p).g();
    }

    @Override // defpackage.bi
    public void h(int r3, Object r4) {
        bi r0 = (bi) this.p;
        if (this.o != 0) goto L5;
        int r2 = this.n;
    L6:
        r0.h(r3 + r2, r4);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.bi
    public Object j() {
        return ((bi) this.p).j();
    }

    @Override // defpackage.su
    public int k() {
        return this.o;
    }

    @Override // defpackage.su
    public int l() {
        int r0 = this.n;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return ((be3) this.p).E();
    }

    @Override // defpackage.bi
    public void m(wf1 r1, Object r2) {
        ((bi) this.p).m(r1, r2);
    }

    @Override // defpackage.r83
    public pb5 x(View r4, pb5 r5) {
        View r6 = (View) this.p;
        int r0 = r5.a.h(519).b;
        int r1 = this.n;
        if (r1 < 0) goto L5;
        int r2 = r1 + r0;
        r6.getLayoutParams().height = r2;
        r6.setLayoutParams(r6.getLayoutParams());
    L5:
        r6.setPadding(r6.getPaddingLeft(), this.o + r0, r6.getPaddingRight(), r6.getPaddingBottom());
        return r5;
    }

    public j83() {
        this.p = new j83[256];
        this.n = 0;
        this.o = 0;
    }
}
