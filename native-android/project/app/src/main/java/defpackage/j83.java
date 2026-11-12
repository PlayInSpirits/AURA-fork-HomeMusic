package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j83 implements su, r83, bi {
    public static final byte[] q = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] r = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int n;
    public int o;
    public Object p;

    public j83(Context context, XmlResourceParser xmlResourceParser) {
        this.p = new ArrayList();
        this.o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), kt3.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.n = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                this.o = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new wb0().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void n(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(ji2.p(i2));
    }

    @Override // defpackage.bi
    public void a(int i, Object obj) {
        ((bi) this.p).a(i + (this.o == 0 ? this.n : 0), obj);
    }

    @Override // defpackage.bi
    public void b(Object obj) {
        this.o++;
        ((bi) this.p).b(obj);
    }

    @Override // defpackage.bi
    public void c() {
        ((bi) this.p).c();
    }

    @Override // defpackage.bi
    public void d(int i, int i2, int i3) {
        int i4 = this.o == 0 ? this.n : 0;
        ((bi) this.p).d(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.bi
    public void e(int i, int i2) {
        ((bi) this.p).e(i + (this.o == 0 ? this.n : 0), i2);
    }

    @Override // defpackage.su
    public int f() {
        return this.n;
    }

    @Override // defpackage.bi
    public void g() {
        if (this.o <= 0) {
            l80.a("OffsetApplier up called with no corresponding down");
        }
        this.o--;
        ((bi) this.p).g();
    }

    @Override // defpackage.bi
    public void h(int i, Object obj) {
        ((bi) this.p).h(i + (this.o == 0 ? this.n : 0), obj);
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
        int i = this.n;
        return i == -1 ? ((be3) this.p).E() : i;
    }

    @Override // defpackage.bi
    public void m(wf1 wf1Var, Object obj) {
        ((bi) this.p).m(wf1Var, obj);
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        View view2 = (View) this.p;
        int i = pb5Var.a.h(519).b;
        int i2 = this.n;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.o + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return pb5Var;
    }

    public j83() {
        this.p = new j83[256];
        this.n = 0;
        this.o = 0;
    }
}
