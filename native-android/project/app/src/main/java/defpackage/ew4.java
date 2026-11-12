package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew4 implements Callback, g84 {
    public final /* synthetic */ int n;
    public int o;
    public final Object p;
    public final Object q;
    public final Object r;
    public Object s;

    public ew4() throws GlUtil$GlException {
        this.n = 4;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.o = iGlCreateProgram;
        j51.l();
        c("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", iGlCreateProgram, 35633);
        c("// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        j51.m("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.r = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.p = new y41[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.o;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str);
            y41 y41Var = new y41(22);
            ((y41[]) this.p)[i] = y41Var;
            ((HashMap) this.r).put(str, y41Var);
        }
        this.s = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.o, 35718, iArr4, 0);
        this.q = new y41[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.o;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str2 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str2);
            y41 y41Var2 = new y41(23);
            ((y41[]) this.q)[i5] = y41Var2;
            ((HashMap) this.s).put(str2, y41Var2);
        }
        j51.l();
    }

    public static void c(String str, int i, int i2) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        j51.m(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        j51.l();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // defpackage.g84
    public void a(be3 be3Var) {
        iu4 iu4Var;
        iu4 iu4Var2;
        SparseArray sparseArray;
        int i;
        h00 h00Var;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.q;
        SparseIntArray sparseIntArray = (SparseIntArray) this.r;
        h00 h00Var2 = (h00) this.p;
        qy4 qy4Var = (qy4) this.s;
        SparseArray sparseArray3 = qy4Var.h;
        SparseBooleanArray sparseBooleanArray = qy4Var.i;
        qn0 qn0Var = qy4Var.f;
        List list = qy4Var.c;
        int i2 = qy4Var.a;
        if (be3Var.A() != 2) {
            return;
        }
        if (i2 == 1 || i2 == 2 || qy4Var.n == 1) {
            iu4Var = (iu4) list.get(0);
        } else {
            iu4Var = new iu4(((iu4) list.get(0)).d());
            list.add(iu4Var);
        }
        if ((be3Var.A() & 128) == 0) {
            return;
        }
        be3Var.O(1);
        int iH = be3Var.H();
        be3Var.O(3);
        be3Var.k(h00Var2.b, 0, 2);
        h00Var2.q(0);
        h00Var2.t(3);
        qy4Var.t = h00Var2.i(13);
        be3Var.k(h00Var2.b, 0, 2);
        h00Var2.q(0);
        h00Var2.t(4);
        be3Var.O(h00Var2.i(12));
        if (i2 == 2 && qy4Var.r == null) {
            ty4 ty4VarA = qn0Var.a(21, new gc(21, null, 0, null, f35.b));
            qy4Var.r = ty4VarA;
            if (ty4VarA != null) {
                ty4VarA.b(iu4Var, qy4Var.m, new sy4(iH, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = be3Var.a();
        while (iA > 0) {
            be3Var.k(h00Var2.b, 0, 5);
            h00Var2.q(0);
            int i3 = h00Var2.i(8);
            h00Var2.t(3);
            int i4 = h00Var2.i(13);
            h00Var2.t(4);
            int i5 = h00Var2.i(12);
            int i6 = be3Var.b;
            int i7 = i6 + i5;
            int i8 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iA2 = 0;
            int i9 = iA;
            while (true) {
                if (be3Var.b >= i7) {
                    h00Var = h00Var2;
                    break;
                }
                int iA3 = be3Var.A();
                h00Var = h00Var2;
                int iA4 = be3Var.b + be3Var.A();
                if (iA4 > i7) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iA3 == 5) {
                    long jC = be3Var.C();
                    if (jC == 1094921523) {
                        i8 = 129;
                    } else if (jC == 1161904947) {
                        i8 = 135;
                    } else if (jC == 1094921524) {
                        i8 = 172;
                    } else if (jC == 1212503619) {
                        i8 = 36;
                    }
                } else if (iA3 == 106) {
                    iA4 = iA4;
                    i8 = 129;
                } else if (iA3 == 122) {
                    i8 = 135;
                    iA4 = iA4;
                } else if (iA3 == 127) {
                    int iA5 = be3Var.A();
                    if (iA5 == 21) {
                        i8 = 172;
                    } else if (iA5 == 14) {
                        i8 = 136;
                    } else if (iA5 == 33) {
                        i8 = 139;
                    }
                } else if (iA3 == 123) {
                    i8 = 138;
                } else if (iA3 == 10) {
                    strTrim = be3Var.y(3, StandardCharsets.UTF_8).trim();
                    iA2 = be3Var.A();
                } else if (iA3 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (be3Var.b < iA4) {
                        String strTrim2 = be3Var.y(3, StandardCharsets.UTF_8).trim();
                        be3Var.A();
                        iu4 iu4Var3 = iu4Var;
                        byte[] bArr = new byte[4];
                        be3Var.k(bArr, 0, 4);
                        arrayList2.add(new ry4(strTrim2, bArr));
                        iu4Var = iu4Var3;
                        iA4 = iA4;
                        iH = iH;
                    }
                    iA4 = iA4;
                    iH = iH;
                    iu4Var = iu4Var;
                    arrayList = arrayList2;
                    i8 = 89;
                } else {
                    iA4 = iA4;
                    iH = iH;
                    iu4Var = iu4Var;
                    if (iA3 == 111) {
                        i8 = 257;
                    }
                }
                be3Var.O(iA4 - be3Var.b);
                iu4Var = iu4Var;
                h00Var2 = h00Var;
                sparseArray3 = sparseArray4;
                iH = iH;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i10 = iH;
            iu4 iu4Var4 = iu4Var;
            be3Var.N(i7);
            gc gcVar = new gc(i8, strTrim, iA2, arrayList, Arrays.copyOfRange(be3Var.a, i6, i7));
            if (i3 == 6 || i3 == 5) {
                i3 = i8;
            }
            int i11 = i9 - (i5 + 5);
            int i12 = i2 == 2 ? i3 : i4;
            if (sparseBooleanArray.get(i12)) {
                c = 21;
            } else {
                c = 21;
                ty4 ty4VarA2 = (i2 == 2 && i3 == 21) ? qy4Var.r : qn0Var.a(i3, gcVar);
                if (i2 != 2 || i4 < sparseIntArray.get(i12, 8192)) {
                    sparseIntArray.put(i12, i4);
                    sparseArray2.put(i12, ty4VarA2);
                }
            }
            iA = i11;
            iu4Var = iu4Var4;
            h00Var2 = h00Var;
            sparseArray3 = sparseArray5;
            iH = i10;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i13 = iH;
        iu4 iu4Var5 = iu4Var;
        int size = sparseIntArray.size();
        int i14 = 0;
        while (i14 < size) {
            int iKeyAt = sparseIntArray.keyAt(i14);
            int iValueAt = sparseIntArray.valueAt(i14);
            sparseBooleanArray.put(iKeyAt, true);
            qy4Var.j.put(iValueAt, true);
            ty4 ty4Var = (ty4) sparseArray2.valueAt(i14);
            if (ty4Var != null) {
                if (ty4Var != qy4Var.r) {
                    i = i13;
                    iu4Var2 = iu4Var5;
                    ty4Var.b(iu4Var2, qy4Var.m, new sy4(i, iKeyAt, 8192));
                } else {
                    iu4Var2 = iu4Var5;
                    i = i13;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, ty4Var);
            } else {
                iu4Var2 = iu4Var5;
                sparseArray = sparseArray6;
                i = i13;
            }
            i14++;
            sparseArray6 = sparseArray;
            i13 = i;
            iu4Var5 = iu4Var2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (i2 == 2) {
            if (qy4Var.o) {
                return;
            }
            qy4Var.m.p();
            qy4Var.n = 0;
            qy4Var.o = true;
            return;
        }
        sparseArray7.remove(this.o);
        int i15 = i2 == 1 ? 0 : qy4Var.n - 1;
        qy4Var.n = i15;
        if (i15 == 0) {
            qy4Var.m.p();
            qy4Var.o = true;
        }
    }

    @Override // defpackage.g84
    public void b(iu4 iu4Var, m51 m51Var, sy4 sy4Var) {
    }

    public void d(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((rm2) this.p).o;
        int childCount = i < 0 ? recyclerView.getChildCount() : i(i);
        ((e20) this.q).v(childCount, z);
        if (z) {
            l(view);
        }
        recyclerView.addView(view, childCount);
        cx3 cx3VarN = RecyclerView.N(view);
        dw3 dw3Var = recyclerView.z;
        if (dw3Var != null && cx3VarN != null) {
            dw3Var.l(cx3VarN);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ow3) recyclerView.P.get(size)).c(view);
            }
        }
    }

    public void e(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((rm2) this.p).o;
        int childCount = i < 0 ? recyclerView.getChildCount() : i(i);
        ((e20) this.q).v(childCount, z);
        if (z) {
            l(view);
        }
        cx3 cx3VarN = RecyclerView.N(view);
        if (cx3VarN != null) {
            if (!cx3VarN.l() && !cx3VarN.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(cx3VarN);
                kf2.g(recyclerView.C(), sb);
                return;
            } else {
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "reAttach " + cx3VarN);
                }
                cx3VarN.j &= -257;
            }
        } else if (RecyclerView.P0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strC = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strC);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void f(int i) {
        int i2 = i(i);
        ((e20) this.q).y(i2);
        RecyclerView recyclerView = (RecyclerView) ((rm2) this.p).o;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            cx3 cx3VarN = RecyclerView.N(childAt);
            if (cx3VarN != null) {
                if (cx3VarN.l() && !cx3VarN.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(cx3VarN);
                    kf2.g(recyclerView.C(), sb);
                    return;
                } else {
                    if (RecyclerView.Q0) {
                        Log.d("RecyclerView", "tmpDetach " + cx3VarN);
                    }
                    cx3VarN.a(256);
                }
            }
        } else if (RecyclerView.P0) {
            throw new IllegalArgumentException("No view at offset " + i2 + recyclerView.C());
        }
        recyclerView.detachViewFromParent(i2);
    }

    public View g(int i) {
        return ((RecyclerView) ((rm2) this.p).o).getChildAt(i(i));
    }

    public int h() {
        return ((RecyclerView) ((rm2) this.p).o).getChildCount() - ((ArrayList) this.r).size();
    }

    public int i(int i) {
        e20 e20Var = (e20) this.q;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((rm2) this.p).o).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iQ = i - (i2 - e20Var.q(i2));
            if (iQ == 0) {
                while (e20Var.s(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iQ;
        }
        return -1;
    }

    public View j(int i) {
        return ((RecyclerView) ((rm2) this.p).o).getChildAt(i);
    }

    public int k() {
        return ((RecyclerView) ((rm2) this.p).o).getChildCount();
    }

    public void l(View view) {
        ((ArrayList) this.r).add(view);
        rm2 rm2Var = (rm2) this.p;
        cx3 cx3VarN = RecyclerView.N(view);
        if (cx3VarN != null) {
            View view2 = cx3VarN.a;
            RecyclerView recyclerView = (RecyclerView) rm2Var.o;
            int i = cx3VarN.q;
            if (i != -1) {
                cx3VarN.p = i;
            } else {
                cx3VarN.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.R()) {
                view2.setImportantForAccessibility(4);
            } else {
                cx3VarN.q = 4;
                recyclerView.H0.add(cx3VarN);
            }
        }
    }

    public boolean m(ew4 ew4Var, int i) {
        return ew4Var != null && Objects.equals(((dz3[]) this.p)[i], ((dz3[]) ew4Var.p)[i]) && Objects.equals(((t41[]) this.q)[i], ((t41[]) ew4Var.q)[i]);
    }

    public boolean n(int i) {
        return ((dz3[]) this.p)[i] != null;
    }

    public void o() {
        MainActivity mainActivity = (MainActivity) this.p;
        if (mainActivity.R == null) {
            return;
        }
        Toast.makeText(mainActivity, R.string.playlist_chooser_dialog_toast_remove_failure, 0).show();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        Log.e("AlbumRepository", "Network Failure on getAlbums: " + th.getMessage());
        ((k03) this.p).k(kb4.b((String) this.q, this.o, (Integer) this.r, (Integer) this.s, null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Integer num = (Integer) this.s;
        Integer num2 = (Integer) this.r;
        int i = this.o;
        String str = (String) this.q;
        k03 k03Var = (k03) this.p;
        if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums() != null) {
            k03Var.k(kb4.b(str, i, num2, num, ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums()));
            return;
        }
        Log.e("AlbumRepository", "API Error on getAlbums. HTTP Code: " + response.code());
        k03Var.k(kb4.b(str, i, num2, num, null));
    }

    public void p(View view) {
        if (((ArrayList) this.r).remove(view)) {
            rm2 rm2Var = (rm2) this.p;
            cx3 cx3VarN = RecyclerView.N(view);
            if (cx3VarN != null) {
                RecyclerView recyclerView = (RecyclerView) rm2Var.o;
                int i = cx3VarN.p;
                if (recyclerView.R()) {
                    cx3VarN.q = i;
                    recyclerView.H0.add(cx3VarN);
                } else {
                    cx3VarN.a.setImportantForAccessibility(i);
                }
                cx3VarN.p = 0;
            }
        }
    }

    public String toString() {
        switch (this.n) {
            case 2:
                return ((e20) this.q).toString() + ", hidden list:" + ((ArrayList) this.r).size();
            default:
                return super.toString();
        }
    }

    public ew4(k03 k03Var, String str, int i, Integer num, Integer num2) {
        this.n = 1;
        this.p = k03Var;
        this.q = str;
        this.o = i;
        this.r = num;
        this.s = num2;
    }

    public ew4(rm2 rm2Var) {
        this.n = 2;
        this.o = 0;
        this.p = rm2Var;
        this.q = new e20();
        this.r = new ArrayList();
    }

    public /* synthetic */ ew4(Object obj, Object obj2, Serializable serializable, Object obj3, int i, int i2) {
        this.n = i2;
        this.p = obj;
        this.q = obj2;
        this.r = serializable;
        this.s = obj3;
        this.o = i;
    }

    public ew4(dz3[] dz3VarArr, t41[] t41VarArr, jw4 jw4Var, Object obj) {
        this.n = 0;
        rr2.l(dz3VarArr.length == t41VarArr.length);
        this.p = dz3VarArr;
        this.q = (t41[]) t41VarArr.clone();
        this.r = jw4Var;
        this.s = obj;
        this.o = dz3VarArr.length;
    }

    public ew4(List list, HashSet hashSet, int i) {
        this.n = 3;
        byte[] bArr = new byte[64];
        this.q = bArr;
        this.o = i;
        bArr[0] = 64;
        this.s = new n50[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((n50[]) this.s)[i2] = new n50(i2, ((j50) list.get(i2)).e);
        }
        this.r = new int[i];
        int i3 = 0;
        for (short s = 0; s < i; s = (short) (s + 1)) {
            boolean zContains = hashSet.contains(Short.valueOf(s));
            int[] iArr = (int[]) this.r;
            if (zContains) {
                iArr[s] = i3;
                i3 += 16;
            } else {
                iArr[s] = -1;
            }
        }
        this.p = new m50((((n50[]) this.s).length * 16) + (((int[]) this.r).length * 4) + 84, (short) 513, (short) 84);
    }

    public ew4(qy4 qy4Var, int i) {
        this.n = 6;
        this.s = qy4Var;
        this.p = new h00(5, new byte[5]);
        this.q = new SparseArray();
        this.r = new SparseIntArray();
        this.o = i;
    }
}
