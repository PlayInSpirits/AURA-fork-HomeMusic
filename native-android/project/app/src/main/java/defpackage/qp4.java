package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.eddyizm.tempus.database.AppDatabase;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qp4 {
    public static qp4 d;
    public final Object a;
    public Object b;
    public Object c;

    public qp4(im... imVarArr) {
        wd4 wd4Var = new wd4();
        bj4 bj4Var = new bj4();
        bj4Var.c = 1.0f;
        bj4Var.d = 1.0f;
        gm gmVar = gm.e;
        bj4Var.e = gmVar;
        bj4Var.f = gmVar;
        bj4Var.g = gmVar;
        bj4Var.h = gmVar;
        ByteBuffer byteBuffer = im.a;
        bj4Var.k = byteBuffer;
        bj4Var.l = byteBuffer;
        bj4Var.b = -1;
        im[] imVarArr2 = new im[imVarArr.length + 2];
        this.a = imVarArr2;
        System.arraycopy(imVarArr, 0, imVarArr2, 0, imVarArr.length);
        this.b = wd4Var;
        this.c = bj4Var;
        imVarArr2[imVarArr.length] = wd4Var;
        imVarArr2[imVarArr.length + 1] = bj4Var;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        l05[] l05VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (l05VarArr = (l05[]) editable.getSpans(selectionStart, selectionEnd, l05.class)) != null && l05VarArr.length > 0) {
                for (l05 l05Var : l05VarArr) {
                    int spanStart = editable.getSpanStart(l05Var);
                    int spanEnd = editable.getSpanEnd(l05Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int b() {
        if (e().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((xi2) q40.w0(e().a)).a) - ((long) e().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean c() {
        return !e().a.isEmpty();
    }

    public int d() {
        if (e().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((xi2) q40.C0(e().a)).a) + ((long) e().h);
        long jH = ((long) h()) - 1;
        if (j > jH) {
            j = jH;
        }
        return (int) j;
    }

    public qc3 e() {
        qc3 qc3Var = (qc3) this.b;
        if (qc3Var != null) {
            return qc3Var;
        }
        h12.Q("layoutInfo");
        throw null;
    }

    public int f() {
        if (e().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((xi2) q40.C0(e().a)).l + e().b) + e().c) - e().g);
    }

    public int g() {
        if (e().a.isEmpty()) {
            return 0;
        }
        int i = ((xi2) q40.w0(e().a)).l + (-e().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public int h() {
        return ((Number) ((vc3) this.a).invoke()).intValue();
    }

    public boolean i(CharSequence charSequence, int i, int i2, k05 k05Var) {
        if ((k05Var.c & 3) == 0) {
            wk0 wk0Var = (wk0) this.c;
            vv2 vv2VarB = k05Var.b();
            int iA = vv2VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) vv2VarB.q).getShort(iA + vv2VarB.n);
            }
            wk0Var.getClass();
            ThreadLocal threadLocal = wk0.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = wk0Var.a.hasGlyph(sb.toString());
            int i3 = k05Var.c & 4;
            k05Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (k05Var.c & 3) == 2;
    }

    public boolean j() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.a).readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public boolean k(int i, jc0 jc0Var, nr3 nr3Var) {
        kr krVar = (kr) this.b;
        int[] iArr = jc0Var.o0;
        int[] iArr2 = jc0Var.t;
        krVar.a = iArr[0];
        krVar.b = iArr[1];
        krVar.c = jc0Var.o();
        krVar.d = jc0Var.i();
        krVar.i = false;
        krVar.j = i;
        boolean z = krVar.a == 3;
        boolean z2 = krVar.b == 3;
        boolean z3 = z && jc0Var.V > 0.0f;
        boolean z4 = z2 && jc0Var.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            krVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            krVar.b = 1;
        }
        nr3Var.d(jc0Var, krVar);
        jc0Var.K(krVar.e);
        jc0Var.H(krVar.f);
        jc0Var.E = krVar.h;
        int i2 = krVar.g;
        jc0Var.Z = i2;
        jc0Var.E = i2 > 0;
        krVar.j = 0;
        return krVar.i;
    }

    public String l() {
        if (!j()) {
            tb4.k();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public void m(q92 q92Var) {
        ua4 ua4Var = (ua4) this.c;
        if (ua4Var != null) {
            ua4Var.run();
        }
        ua4 ua4Var2 = new ua4((ea2) this.a, q92Var);
        this.c = ua4Var2;
        ((Handler) this.b).postAtFrontOfQueue(ua4Var2);
    }

    public Object n(CharSequence charSequence, int i, int i2, int i3, boolean z, e01 e01Var) {
        int i4;
        char c;
        g01 g01Var = new g01((zv2) ((na4) this.b).p);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zB = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zB) {
                    SparseArray sparseArray = ((zv2) g01Var.e).a;
                    zv2 zv2Var = sparseArray == null ? null : (zv2) sparseArray.get(iCodePointAt);
                    if (g01Var.a == 2) {
                        if (zv2Var != null) {
                            g01Var.e = zv2Var;
                            g01Var.c++;
                        } else {
                            if (iCodePointAt == 65038) {
                                g01Var.b();
                            } else if (iCodePointAt != 65039) {
                                zv2 zv2Var2 = (zv2) g01Var.e;
                                if (zv2Var2.b != null) {
                                    if (g01Var.c != 1) {
                                        g01Var.f = zv2Var2;
                                        g01Var.b();
                                    } else if (g01Var.c()) {
                                        g01Var.f = (zv2) g01Var.e;
                                        g01Var.b();
                                    } else {
                                        g01Var.b();
                                    }
                                    c = 3;
                                } else {
                                    g01Var.b();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (zv2Var == null) {
                        g01Var.b();
                        c = 1;
                    } else {
                        g01Var.a = 2;
                        g01Var.e = zv2Var;
                        g01Var.c = 1;
                        c = 2;
                    }
                    g01Var.b = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && i(charSequence, i4, iCharCount, ((zv2) g01Var.f).b)) {
                            break;
                        }
                        zB = e01Var.b(charSequence, i4, iCharCount, ((zv2) g01Var.f).b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (g01Var.a == 2 && ((zv2) g01Var.e).b != null && ((g01Var.c > 1 || g01Var.c()) && i5 < i3 && zB && (z || !i(charSequence, i4, iCharCount, ((zv2) g01Var.e).b)))) {
            e01Var.b(charSequence, i4, iCharCount, ((zv2) g01Var.e).b);
        }
        return e01Var.a();
    }

    public void o(String str, String str2) {
        xl.E((s24) this.a, false, true, new ps0(3, str, str2));
    }

    public void p(kc0 kc0Var, int i, int i2, int i3) {
        kc0Var.getClass();
        int i4 = kc0Var.a0;
        int i5 = kc0Var.b0;
        kc0Var.a0 = 0;
        kc0Var.b0 = 0;
        kc0Var.K(i2);
        kc0Var.H(i3);
        if (i4 < 0) {
            kc0Var.a0 = 0;
        } else {
            kc0Var.a0 = i4;
        }
        if (i5 < 0) {
            kc0Var.b0 = 0;
        } else {
            kc0Var.b0 = i5;
        }
        kc0 kc0Var2 = (kc0) this.c;
        kc0Var2.s0 = i;
        kc0Var2.Q();
    }

    public void q(kc0 kc0Var) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = kc0Var.p0.size();
        for (int i = 0; i < size; i++) {
            jc0 jc0Var = (jc0) kc0Var.p0.get(i);
            int[] iArr = jc0Var.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(jc0Var);
            }
        }
        kc0Var.r0.b = true;
    }

    public qp4(ConstraintLayout constraintLayout, TextView textView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
    }

    public qp4(AppDatabase appDatabase) {
        this.b = new i80(22);
        this.c = new si1(25);
        this.a = appDatabase;
    }

    public qp4(DrawerLayout drawerLayout, BottomNavigationView bottomNavigationView, TextView textView, FrameLayout frameLayout) {
        this.a = bottomNavigationView;
        this.b = textView;
        this.c = frameLayout;
    }

    public qp4(zg2 zg2Var, View view) {
        Object ah2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ah2Var = new ch2();
        } else {
            ah2Var = i >= 33 ? new ah2() : null;
        }
        this.a = ah2Var;
        this.b = zg2Var;
        this.c = view;
    }

    public qp4(vc3 vc3Var) {
        this.a = vc3Var;
    }

    public qp4(Context context, LocationManager locationManager) {
        this.c = new yn4();
        this.a = context;
        this.b = locationManager;
    }

    public qp4(kc0 kc0Var) {
        this.a = new ArrayList();
        this.b = new kr();
        this.c = kc0Var;
    }

    public qp4(na4 na4Var, om0 om0Var, wk0 wk0Var, Set set) {
        this.a = om0Var;
        this.b = na4Var;
        this.c = wk0Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            n(str, 0, str.length(), 1, true, new f01(0, str));
        }
    }

    public qp4(ja2 ja2Var) {
        this.a = new ea2(ja2Var, true);
        this.b = new Handler(Looper.getMainLooper());
    }

    public qp4(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
