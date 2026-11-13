package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g01 {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public g01(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = 16;
        this.b = 12544;
        this.c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        if (bitmap.isRecycled()) {
            kf2.n("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(bq4.r);
        this.d = bitmap;
        arrayList.add(xq4.d);
        arrayList.add(xq4.e);
        arrayList.add(xq4.f);
        arrayList.add(xq4.g);
        arrayList.add(xq4.h);
        arrayList.add(xq4.i);
    }

    public bq4 a() {
        int max;
        ArrayList arrayList;
        bq4 bq4Var;
        ArrayList arrayList2 = (ArrayList) this.f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i = this.c;
        int i2 = this.b;
        double d = -1.0d;
        if (i2 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i2) {
                d = Math.sqrt(i2 / height);
            }
        } else if (i > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i) {
            d = i / max;
        }
        int i3 = 0;
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        z40 z40Var = new z40(iArr, this.a, arrayList2.isEmpty() ? null : (md3[]) arrayList2.toArray(new md3[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) z40Var.p;
        ArrayList arrayList4 = (ArrayList) this.e;
        bq4 bq4Var2 = new bq4(arrayList3, arrayList4);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bq4Var2.p;
        int size = arrayList4.size();
        int i4 = 0;
        while (i4 < size) {
            xq4 xq4Var = (xq4) arrayList4.get(i4);
            float[] fArr = xq4Var.c;
            float[] fArr2 = xq4Var.a;
            int length = fArr.length;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i5 = i3; i5 < length; i5++) {
                float f3 = fArr[i5];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = fArr.length;
                for (int i6 = i3; i6 < length2; i6++) {
                    float f4 = fArr[i6];
                    if (f4 > 0.0f) {
                        fArr[i6] = f4 / f2;
                    }
                }
            }
            oi oiVar = (oi) bq4Var2.o;
            List list = (List) bq4Var2.n;
            int size2 = list.size();
            int i7 = i3;
            float f5 = 0.0f;
            nd3 nd3Var = null;
            while (i7 < size2) {
                nd3 nd3Var2 = (nd3) list.get(i7);
                float[] b = nd3Var2.b();
                float f6 = b[1];
                float f7 = f;
                float[] fArr3 = xq4Var.b;
                if (f6 >= fArr2[i7] && f6 <= fArr2[2]) {
                    float f8 = b[2];
                    if (f8 >= fArr3[i7] && f8 <= fArr3[2] && !sparseBooleanArray.get(nd3Var2.d)) {
                        float[] b2 = nd3Var2.b();
                        arrayList = arrayList4;
                        nd3 nd3Var3 = (nd3) bq4Var2.q;
                        int i8 = nd3Var3 != null ? nd3Var3.e : 1;
                        bq4Var = bq4Var2;
                        float[] fArr4 = xq4Var.c;
                        float f9 = fArr4[i7];
                        float abs = f9 > f7 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f9 : f7;
                        float f10 = fArr4[1];
                        float abs2 = f10 > f7 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f10 : f7;
                        float f11 = fArr4[2];
                        float f12 = abs + abs2 + (f11 > f7 ? (nd3Var2.e / i8) * f11 : f7);
                        if (nd3Var == null || f12 > f5) {
                            nd3Var = nd3Var2;
                            f5 = f12;
                        }
                        i7++;
                        f = f7;
                        arrayList4 = arrayList;
                        bq4Var2 = bq4Var;
                    }
                }
                arrayList = arrayList4;
                bq4Var = bq4Var2;
                i7++;
                f = f7;
                arrayList4 = arrayList;
                bq4Var2 = bq4Var;
            }
            ArrayList arrayList5 = arrayList4;
            bq4 bq4Var3 = bq4Var2;
            if (nd3Var != null) {
                sparseBooleanArray.append(nd3Var.d, true);
            }
            oiVar.put(xq4Var, nd3Var);
            i4++;
            i3 = i7;
            arrayList4 = arrayList5;
            bq4Var2 = bq4Var3;
        }
        bq4 bq4Var4 = bq4Var2;
        sparseBooleanArray.clear();
        return bq4Var4;
    }

    public void b() {
        this.a = 1;
        this.e = (zv2) this.d;
        this.c = 0;
    }

    public boolean c() {
        vv2 b = ((zv2) this.e).b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.q).get(a + b.n) == 0) || this.b == 65039;
    }

    public g01(zv2 zv2Var) {
        this.a = 1;
        this.d = zv2Var;
        this.e = zv2Var;
    }
}
