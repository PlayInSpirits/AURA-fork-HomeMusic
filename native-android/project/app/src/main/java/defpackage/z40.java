package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.App;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z40 implements Callback, qn4 {
    public static final ca1 s = new ca1(13);
    public final Object n;
    public Object o;
    public final Object p;
    public Object q;
    public Object r;

    public z40(int[] iArr, int i, md3[] md3VarArr) {
        y40 y40Var;
        this.r = new float[3];
        this.q = md3VarArr;
        int[] iArr2 = new int[32768];
        this.o = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iH = h(Color.blue(i3), 8, 5) | (h(Color.red(i3), 8, 5) << 10) | (h(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iH;
            iArr2[iH] = iArr2[iH] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iRgb = Color.rgb(h((i5 >> 10) & 31, 5, 8), h((i5 >> 5) & 31, 5, 8), h(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.r;
                ThreadLocal threadLocal = v50.a;
                v50.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (j(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.n = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.p = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.p).add(new nd3(Color.rgb(h((i9 >> 10) & 31, 5, 8), h((i9 >> 5) & 31, 5, 8), h(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue<y40> priorityQueue = new PriorityQueue(i, s);
        priorityQueue.offer(new y40(this, 0, ((int[]) this.n).length - 1));
        while (priorityQueue.size() < i && (y40Var = (y40) priorityQueue.poll()) != null) {
            int i10 = y40Var.b;
            int iMin = y40Var.a;
            if ((i10 + 1) - iMin <= 1) {
                break;
            }
            z40 z40Var = y40Var.j;
            if ((i10 + 1) - iMin <= 1) {
                kf2.o("Can not split a box with only 1 color");
                throw null;
            }
            int i11 = y40Var.e - y40Var.d;
            int i12 = y40Var.g - y40Var.f;
            int i13 = y40Var.i - y40Var.h;
            int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) z40Var.n;
            int[] iArr5 = (int[]) z40Var.o;
            g(iArr4, i14, iMin, i10);
            Arrays.sort(iArr4, iMin, y40Var.b + 1);
            g(iArr4, i14, iMin, y40Var.b);
            int i15 = y40Var.c / 2;
            int i16 = 0;
            int i17 = iMin;
            while (true) {
                int i18 = y40Var.b;
                if (i17 > i18) {
                    break;
                }
                i16 += iArr5[iArr4[i17]];
                if (i16 >= i15) {
                    iMin = Math.min(i18 - 1, i17);
                    break;
                }
                i17++;
            }
            y40 y40Var2 = new y40(z40Var, iMin + 1, y40Var.b);
            y40Var.b = iMin;
            y40Var.a();
            priorityQueue.offer(y40Var2);
            priorityQueue.offer(y40Var);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (y40 y40Var3 : priorityQueue) {
            z40 z40Var2 = y40Var3.j;
            int[] iArr6 = (int[]) z40Var2.n;
            int[] iArr7 = (int[]) z40Var2.o;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = y40Var3.a; i23 <= y40Var3.b; i23++) {
                int i24 = iArr6[i23];
                int i25 = iArr7[i24];
                i20 += i25;
                i19 = (((i24 >> 10) & 31) * i25) + i19;
                i21 = (((i24 >> 5) & 31) * i25) + i21;
                i22 += i25 * (i24 & 31);
            }
            float f = i20;
            nd3 nd3Var = new nd3(Color.rgb(h(Math.round(i19 / f), 5, 8), h(Math.round(i21 / f), 5, 8), h(Math.round(i22 / f), 5, 8)), i20);
            if (!j(nd3Var.b())) {
                arrayList.add(nd3Var);
            }
        }
        this.p = arrayList;
    }

    public static void g(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int h(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public ez a(ko koVar, gf1 gf1Var) {
        int i;
        int i2;
        int i3;
        hx3 hx3Var = new hx3();
        hx3Var.n = -1;
        synchronized (this.n) {
            Throwable th = (Throwable) this.o;
            if (th != null) {
                koVar.b(th);
                return fz0.E;
            }
            fl flVar = (fl) this.p;
            do {
                i = flVar.get();
                i2 = i + 1;
            } while (!flVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            hx3Var.n = (i2 >>> 27) & 15;
            ((q03) this.q).a(koVar);
            if (z && gf1Var != null) {
                try {
                    gf1Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.n) {
                        try {
                            if (((Throwable) this.o) == null) {
                                this.o = th2;
                                q03 q03Var = (q03) this.q;
                                Object[] objArr = q03Var.a;
                                int i5 = q03Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((ko) objArr[i6]).b(th2);
                                }
                                ((q03) this.q).d();
                                fl flVar2 = (fl) this.p;
                                do {
                                    i3 = flVar2.get();
                                } while (!flVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new gp3(new jo(koVar, this, hx3Var, i4));
        }
    }

    public void b(if1 if1Var) {
        int i;
        synchronized (this.n) {
            try {
                q03 q03Var = (q03) this.q;
                this.q = (q03) this.r;
                this.r = q03Var;
                fl flVar = (fl) this.p;
                do {
                    i = flVar.get();
                } while (!flVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = q03Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    if1Var.invoke(q03Var.f(i3));
                }
                q03Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float c(int i, boolean z) {
        Layout layout = (Layout) this.n;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    public float d(int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        Bidi bidi;
        Bidi bidi2;
        char[] cArr;
        boolean z4;
        ArrayList arrayList = (ArrayList) this.p;
        Layout layout = (Layout) this.n;
        if (!z2) {
            return c(i, z);
        }
        int iW = vr1.w(layout, i, z2);
        int lineStart = layout.getLineStart(iW);
        int lineEnd = layout.getLineEnd(iW);
        if (i != lineStart && i != lineEnd) {
            return c(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return c(i, z);
        }
        int iE = gb.e(arrayList, Integer.valueOf(i));
        int i3 = iE < 0 ? -(iE + 1) : iE + 1;
        if (z2 && i3 > 0) {
            int i4 = i3 - 1;
            if (i == ((Number) arrayList.get(i4)).intValue()) {
                i3 = i4;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i3 == 0 ? 0 : ((Number) arrayList.get(i3 + (-1))).intValue())) == -1;
        int iF = f(lineEnd, lineStart);
        int iIntValue = i3 == 0 ? 0 : ((Number) arrayList.get(i3 - 1)).intValue();
        int i5 = lineStart - iIntValue;
        int i6 = iF - iIntValue;
        ArrayList arrayList2 = (ArrayList) this.o;
        boolean[] zArr = (boolean[]) this.q;
        if (zArr[i3]) {
            bidi2 = (Bidi) arrayList2.get(i3);
            i2 = -1;
        } else {
            int iIntValue2 = i3 == 0 ? 0 : ((Number) arrayList.get(i3 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i3)).intValue();
            int i7 = iIntValue3 - iIntValue2;
            char[] cArr2 = (char[]) this.r;
            if (cArr2 == null || cArr2.length < i7) {
                cArr2 = new char[i7];
            }
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i7)) {
                i2 = -1;
                Bidi bidi3 = new Bidi(cArr2, 0, null, 0, i7, layout.getParagraphDirection(layout.getLineForOffset(i3 == 0 ? 0 : ((Number) arrayList.get(i3 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi3.getRunCount() != 1) {
                    bidi = bidi3;
                }
                arrayList2.set(i3, bidi);
                zArr[i3] = z3;
                if (bidi != null) {
                    cArr = (char[]) this.r;
                    if (cArr2 == cArr) {
                        cArr2 = null;
                    } else {
                        cArr2 = cArr;
                    }
                }
                this.r = cArr2;
                bidi2 = bidi;
            } else {
                z3 = true;
                i2 = -1;
            }
            bidi = null;
            arrayList2.set(i3, bidi);
            zArr[i3] = z3;
            if (bidi != null) {
                cArr = (char[]) this.r;
                if (cArr2 == cArr) {
                    cArr2 = null;
                } else {
                    cArr2 = cArr;
                }
            }
            this.r = cArr2;
            bidi2 = bidi;
        }
        Bidi bidiCreateLineBidi = bidi2 != null ? bidi2.createLineBidi(i5, i6) : null;
        if (bidiCreateLineBidi == null) {
            z4 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                s62[] s62VarArr = new s62[runCount];
                for (int i8 = 0; i8 < runCount; i8++) {
                    s62VarArr[i8] = new s62(bidiCreateLineBidi.getRunStart(i8) + lineStart, bidiCreateLineBidi.getRunLimit(i8) + lineStart, bidiCreateLineBidi.getRunLevel(i8) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i9 = 0; i9 < runCount2; i9++) {
                    bArr[i9] = (byte) bidiCreateLineBidi.getRunLevel(i9);
                }
                Bidi.reorderVisually(bArr, 0, s62VarArr, 0, runCount);
                if (i == lineStart) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= runCount) {
                            i10 = i2;
                            break;
                        }
                        if (s62VarArr[i10].a == i) {
                            break;
                        }
                        i10++;
                    }
                    boolean z6 = (z || z5 == s62VarArr[i10].c) ? !z5 : z5;
                    if (i10 == 0 && z6) {
                        return layout.getLineLeft(iW);
                    }
                    if (i10 != runCount - 1 || z6) {
                        return z6 ? layout.getPrimaryHorizontal(s62VarArr[i10 - 1].a) : layout.getPrimaryHorizontal(s62VarArr[i10 + 1].a);
                    }
                    return layout.getLineRight(iW);
                }
                int iF2 = i > iF ? f(i, lineStart) : i;
                int i11 = 0;
                while (true) {
                    if (i11 >= runCount) {
                        i11 = i2;
                        break;
                    }
                    if (s62VarArr[i11].b == iF2) {
                        break;
                    }
                    i11++;
                }
                boolean z7 = (z || z5 == s62VarArr[i11].c) ? z5 : !z5;
                if (i11 == 0 && z7) {
                    return layout.getLineLeft(iW);
                }
                if (i11 != runCount - 1 || z7) {
                    return z7 ? layout.getPrimaryHorizontal(s62VarArr[i11 - 1].b) : layout.getPrimaryHorizontal(s62VarArr[i11 + 1].b);
                }
                return layout.getLineRight(iW);
            }
            z4 = true;
        }
        boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == zIsRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(iW) : layout.getLineRight(iW);
    }

    @Override // defpackage.qn4
    public int e(long j) {
        long[] jArr = (long[]) this.o;
        int iB = f35.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public int f(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.n).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((h12.j(cCharAt, 8192) < 0 || h12.j(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void i(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.n).put(str, obj);
        nl4 nl4Var = (nl4) ((LinkedHashMap) this.p).get(str);
        if (nl4Var != null) {
            nl4Var.i(obj);
        }
        nl4 nl4Var2 = (nl4) ((LinkedHashMap) this.q).get(str);
        if (nl4Var2 != null) {
            nl4Var2.i(obj);
        }
    }

    public boolean j(float[] fArr) {
        md3[] md3VarArr = (md3[]) this.q;
        if (md3VarArr != null && md3VarArr.length > 0) {
            for (md3 md3Var : md3VarArr) {
                md3Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qn4
    public long k(int i) {
        return ((long[]) this.o)[i];
    }

    @Override // defpackage.qn4
    public List m(long j) {
        uy4 uy4Var = (uy4) this.n;
        Map map = (Map) this.p;
        HashMap map2 = (HashMap) this.q;
        HashMap map3 = (HashMap) this.r;
        ArrayList arrayList = new ArrayList();
        uy4Var.g(j, uy4Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        uy4Var.i(j, false, uy4Var.h, treeMap);
        uy4Var.h(j, map, map2, uy4Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                wy4 wy4Var = (wy4) map2.get(pair.first);
                wy4Var.getClass();
                arrayList2.add(new ig0(null, null, null, bitmapDecodeByteArray, wy4Var.c, 0, wy4Var.e, wy4Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, wy4Var.f, wy4Var.g, false, -16777216, wy4Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            wy4 wy4Var2 = (wy4) map2.get(entry.getKey());
            wy4Var2.getClass();
            hg0 hg0Var = (hg0) entry.getValue();
            CharSequence charSequence = hg0Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ko0 ko0Var : (ko0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ko0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ko0Var), spannableStringBuilder.getSpanEnd(ko0Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = wy4Var2.c;
            int i10 = wy4Var2.d;
            hg0Var.e = f;
            hg0Var.f = i10;
            hg0Var.g = wy4Var2.e;
            hg0Var.h = wy4Var2.b;
            hg0Var.l = wy4Var2.f;
            float f2 = wy4Var2.i;
            int i11 = wy4Var2.h;
            hg0Var.k = f2;
            hg0Var.j = i11;
            hg0Var.p = wy4Var2.j;
            arrayList2.add(hg0Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.qn4
    public int n() {
        return ((long[]) this.o).length;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((lm3) this.q).g();
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        lm3 lm3Var = (lm3) this.q;
        String str = (String) this.n;
        mm3 mm3Var = (mm3) this.r;
        if (!mm3.f(response)) {
            lm3Var.g();
            return;
        }
        new Thread(new qo2(mm3Var, str, (String) this.o, 8)).start();
        ArrayList<String> arrayList = (ArrayList) this.p;
        if (arrayList == null || arrayList.isEmpty()) {
            mm3Var.g();
            lm3Var.onSuccess();
        } else {
            rm3 rm3VarG = App.f(false).g();
            rm3VarG.getClass();
            Log.d("BrowsingClient", "createPlaylist()");
            ((qm3) rm3VarG.o).a(((pn4) rm3VarG.n).f(), str, null, arrayList).enqueue(new hd5(mm3Var, lm3Var, false, 17));
        }
    }

    public /* synthetic */ z40(ConstraintLayout constraintLayout, View view, View view2, View view3, TextView textView) {
        this.n = constraintLayout;
        this.o = view;
        this.p = view2;
        this.q = view3;
        this.r = textView;
    }

    public z40(Map map) {
        map.getClass();
        this.n = new LinkedHashMap(map);
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.r = new cs0(4, this);
    }

    public z40(bq4 bq4Var, Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        sr srVar = new sr(applicationContext, bq4Var, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        sr srVar2 = new sr(applicationContext2, bq4Var, 1);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        String str = s53.a;
        r53 r53Var = new r53(bq4Var, applicationContext3);
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        sr srVar3 = new sr(applicationContext4, bq4Var, 2);
        this.n = context;
        this.o = srVar;
        this.p = srVar2;
        this.q = r53Var;
        this.r = srVar3;
    }

    public z40() {
        this.n = new Object();
        this.p = new fl(0);
        this.q = new q03();
        this.r = new q03();
    }

    public z40(Layout layout) {
        this.n = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iR0 = qm4.r0(((Layout) this.n).getText(), '\n', length, 4);
            length = iR0 < 0 ? ((Layout) this.n).getText().length() : iR0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.n).getText().length());
        this.p = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.o = arrayList2;
        this.q = new boolean[((ArrayList) this.p).size()];
        ((ArrayList) this.p).size();
    }

    public z40(uy4 uy4Var, HashMap map, HashMap map2, HashMap map3) {
        this.n = uy4Var;
        this.q = map2;
        this.r = map3;
        this.p = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        uy4Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.o = jArr;
    }

    public /* synthetic */ z40(ViewGroup viewGroup, View view, TextView textView, View view2, ViewGroup viewGroup2, View view3) {
        this.n = view;
        this.o = textView;
        this.p = view2;
        this.q = viewGroup2;
        this.r = view3;
    }

    public z40(mm3 mm3Var, String str, String str2, ArrayList arrayList, lm3 lm3Var) {
        this.r = mm3Var;
        this.n = str;
        this.o = str2;
        this.p = arrayList;
        this.q = lm3Var;
    }
}
