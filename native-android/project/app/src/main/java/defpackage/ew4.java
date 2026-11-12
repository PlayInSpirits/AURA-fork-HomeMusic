package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
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

    public ew4() {
        this.n = 4;
        int r0 = GLES20.glCreateProgram();
        this.o = r0;
        j51.l();
        c("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", r0, 35633);
        c("// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", r0, 35632);
        GLES20.glLinkProgram(r0);
        int[] r2 = {0};
        GLES20.glGetProgramiv(r0, 35714, r2, 0);
        if (r2[0] != 1) goto L5;
        boolean r3 = true;
    L6:
        j51.m("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(r0), r3);
        GLES20.glUseProgram(r0);
        this.r = new HashMap();
        int[] r4 = new int[1];
        GLES20.glGetProgramiv(r0, 35721, r4, 0);
        this.p = new y41[r4[0]];
        int r5 = 0;
    L8:
        if (r5 >= r4[0]) goto L16;
        int r6 = this.o;
        int[] r1 = new int[1];
        GLES20.glGetProgramiv(r6, 35722, r1, 0);
        int r7 = r1[0];
        byte[] r13 = new byte[r7];
        GLES20.glGetActiveAttrib(r6, r5, r7, new int[1], 0, new int[1], 0, new int[1], 0, r13, 0);
        int r8 = 0;
    L10:
        if (r8 >= r7) goto L15;
        if (r13[r8] == 0) goto L13;
        r8 = r8 + 1;
        goto L10
    L13:
        r7 = r8;
    L15:
        String r9 = new String(r13, 0, r7);
        GLES20.glGetAttribLocation(r6, r9);
        y41 r10 = new y41(22);
        ((y41[]) this.p)[r5] = r10;
        ((HashMap) this.r).put(r9, r10);
        r5 = r5 + 1;
        goto L8
    L16:
        this.s = new HashMap();
        int[] r11 = new int[1];
        GLES20.glGetProgramiv(this.o, 35718, r11, 0);
        this.q = new y41[r11[0]];
        int r12 = 0;
    L18:
        if (r12 >= r11[0]) goto L26;
        int r14 = this.o;
        int[] r15 = new int[1];
        GLES20.glGetProgramiv(r14, 35719, r15, 0);
        int r16 = r15[0];
        byte[] r17 = new byte[r16];
        GLES20.glGetActiveUniform(r14, r12, r16, new int[1], 0, new int[1], 0, new int[1], 0, r17, 0);
        int r18 = 0;
    L20:
        if (r18 >= r16) goto L25;
        if (r17[r18] == 0) goto L23;
        r18 = r18 + 1;
        goto L20
    L23:
        r16 = r18;
    L25:
        String r19 = new String(r17, 0, r16);
        GLES20.glGetUniformLocation(r14, r19);
        y41 r20 = new y41(23);
        ((y41[]) this.q)[r12] = r20;
        ((HashMap) this.s).put(r19, r20);
        r12 = r12 + 1;
        goto L18
    L26:
        j51.l();
        return;
    L5:
        r3 = false;
        goto L6
    }

    public static void c(String r3, int r4, int r5) {
        int r6 = GLES20.glCreateShader(r5);
        GLES20.glShaderSource(r6, r3);
        GLES20.glCompileShader(r6);
        boolean r0 = false;
        int[] r1 = {0};
        GLES20.glGetShaderiv(r6, 35713, r1, 0);
        if (r1[0] != 1) goto L5;
        r0 = true;
    L5:
        j51.m(GLES20.glGetShaderInfoLog(r6) + ", source: \n" + r3, r0);
        GLES20.glAttachShader(r4, r6);
        GLES20.glDeleteShader(r6);
        j51.l();
    }

    @Override // defpackage.g84
    public void a(be3 r38) {
        SparseArray r2 = (SparseArray) this.q;
        SparseIntArray r3 = (SparseIntArray) this.r;
        h00 r4 = (h00) this.p;
        qy4 r5 = (qy4) this.s;
        SparseArray r6 = r5.h;
        SparseBooleanArray r7 = r5.i;
        qn0 r8 = r5.f;
        List r9 = r5.c;
        int r10 = r5.a;
        if (r38.A() == 2) goto L6;
        return;
    L6:
        if (r10 == 1) goto L12;
        if (r10 == 2) goto L12;
        if (r5.n == 1) goto L12;
        iu4 r14 = new iu4(((iu4) r9.get(0)).d());
        r9.add(r14);
    L14:
        if ((r38.A() & 128) == 0) goto L148;
        r38.O(1);
        int r11 = r38.H();
        r38.O(3);
        r38.k(r4.b, 0, 2);
        r4.q(0);
        r4.t(3);
        r5.t = r4.i(13);
        r38.k(r4.b, 0, 2);
        r4.q(0);
        r4.t(4);
        r38.O(r4.i(12));
        if (r10 == 2) goto L19;
    L23:
        r2.clear();
        r3.clear();
        int r0 = r38.a();
    L24:
        if (r0 <= 0) goto L105;
        r38.k(r4.b, 0, 5);
        r4.q(0);
        int r12 = r4.i(8);
        r4.t(3);
        int r13 = r4.i(13);
        r4.t(4);
        int r17 = r4.i(12);
        int r15 = r38.b;
        int r16 = r15 + r17;
        int r26 = -1;
        String r27 = null;
        ArrayList r29 = null;
        int r28 = 0;
        int r23 = r0;
    L27:
        if (r38.b >= r16) goto L82;
        int r1 = r38.A();
        h00 r31 = r4;
        int r18 = r38.b + r38.A();
        if (r18 > r16) goto L30;
        SparseArray r32 = r6;
        if (r1 != 5) goto L49;
        long r33 = r38.C();
        if (r33 != 1094921523) goto L37;
        r26 = 129;
    L81:
        r38.O(r18 - r38.b);
        r14 = r14;
        r4 = r31;
        r6 = r32;
        r11 = r11;
        goto L27
    L37:
        if (r33 != 1161904947) goto L40;
        r26 = 135;
        goto L81
    L40:
        if (r33 != 1094921524) goto L43;
    L41:
        r26 = 172;
        goto L81
    L43:
        if (r33 != 1212503619) goto L81;
        r26 = 36;
        goto L81
    L49:
        if (r1 != 106) goto L52;
        r18 = r18;
        r26 = 129;
        goto L81
    L52:
        if (r1 != 122) goto L55;
        r26 = 135;
        r18 = r18;
        goto L81
    L55:
        if (r1 != 127) goto L66;
        int r19 = r38.A();
        if (r19 == 21) goto L41;
        if (r19 != 14) goto L63;
        r26 = 136;
        goto L81
    L63:
        if (r19 != 33) goto L81;
        r26 = 139;
        goto L81
    L66:
        if (r1 != 123) goto L69;
        r26 = 138;
        goto L81
    L69:
        if (r1 != 10) goto L72;
        r27 = r38.y(3, StandardCharsets.UTF_8).trim();
        r28 = r38.A();
        goto L81
    L72:
        if (r1 != 89) goto L78;
        ArrayList r20 = new ArrayList();
    L75:
        if (r38.b >= r18) goto L77;
        String r21 = r38.y(3, StandardCharsets.UTF_8).trim();
        r38.A();
        iu4 r110 = r14;
        byte[] r111 = new byte[4];
        r38.k(r111, 0, 4);
        r20.add(new ry4(r21, r111));
        r14 = r110;
        r18 = r18;
        r11 = r11;
        goto L75
    L77:
        r18 = r18;
        r11 = r11;
        r14 = r14;
        r29 = r20;
        r26 = 89;
        goto L81
    L78:
        r18 = r18;
        r11 = r11;
        r14 = r14;
        if (r1 != 111) goto L81;
        r26 = 257;
    L30:
        SparseArray r34 = r6;
        int r35 = r11;
        iu4 r112 = r14;
        r38.N(r16);
        gc r25 = new gc(r26, r27, r28, r29, Arrays.copyOfRange(r38.a, r15, r16));
        if (r12 != 6) goto L86;
    L87:
        r12 = r26;
    L88:
        int r22 = r23 - (r17 + 5);
        if (r10 != 2) goto L91;
        int r24 = r12;
    L93:
        if (r7.get(r24) == false) goto L95;
        char r113 = 21;
    L104:
        r0 = r22;
        r14 = r112;
        r4 = r31;
        r6 = r34;
        r11 = r35;
        goto L24
    L95:
        r113 = 21;
        if (r10 != 2) goto L99;
        if (r12 != 21) goto L99;
        ty4 r30 = r5.r;
    L100:
        if (r10 == 2) goto L102;
    L103:
        r3.put(r24, r13);
        r2.put(r24, r30);
        goto L104
    L102:
        if (r13 >= r3.get(r24, 8192)) goto L104;
    L99:
        r30 = r8.a(r12, r25);
        goto L100
    L91:
        r24 = r13;
        goto L93
    L86:
        if (r12 != 5) goto L88;
    L82:
        r31 = r4;
        goto L30
    L105:
        SparseArray r36 = r6;
        int r37 = r11;
        iu4 r114 = r14;
        int r39 = r3.size();
        int r115 = 0;
    L106:
        if (r115 >= r39) goto L117;
        int r40 = r3.keyAt(r115);
        int r41 = r3.valueAt(r115);
        r7.put(r40, true);
        r5.j.put(r41, true);
        ty4 r42 = (ty4) r2.valueAt(r115);
        if (r42 != null) goto L110;
        iu4 r116 = r114;
        SparseArray r43 = r36;
        int r117 = r37;
    L116:
        r115 = r115 + 1;
        r36 = r43;
        r37 = r117;
        r114 = r116;
        goto L106
    L110:
        if (r42 == r5.r) goto L113;
        r117 = r37;
        r116 = r114;
        r42.b(r116, r5.m, new sy4(r117, r40, 8192));
    L112:
        r43 = r36;
        r43.put(r41, r42);
        goto L116
    L113:
        r116 = r114;
        r117 = r37;
        goto L112
    L117:
        SparseArray r44 = r36;
        if (r10 == 2) goto L120;
        r44.remove(this.o);
        if (r10 != 1) goto L126;
        int r118 = 0;
    L127:
        r5.n = r118;
        if (r118 != 0) goto L146;
        r5.m.p();
        r5.o = true;
        return;
    L146:
        return;
    L126:
        r118 = r5.n - 1;
        goto L127
    L120:
        if (r5.o == true) goto L145;
        r5.m.p();
        r5.n = 0;
        r5.o = true;
        return;
    L145:
        return;
    L19:
        if (r5.r != null) goto L23;
        ty4 r119 = r8.a(21, new gc(21, null, 0, null, f35.b));
        r5.r = r119;
        if (r119 == null) goto L23;
        r119.b(r14, r5.m, new sy4(r11, 21, 8192));
        goto L23
    L148:
        return;
    L12:
        r14 = (iu4) r9.get(0);
        goto L14
    }

    @Override // defpackage.g84
    public void b(iu4 r1, m51 r2, sy4 r3) {
    }

    public void d(View r3, int r4, boolean r5) {
        RecyclerView r0 = (RecyclerView) ((rm2) this.p).o;
        if (r4 >= 0) goto L5;
        int r6 = r0.getChildCount();
    L6:
        ((e20) this.q).v(r6, r5);
        if (r5 == false) goto L9;
        l(r3);
    L9:
        r0.addView(r3, r6);
        cx3 r2 = RecyclerView.N(r3);
        dw3 r7 = r0.z;
        if (r7 == null) goto L13;
        if (r2 == null) goto L13;
        r7.l(r2);
    L13:
        ArrayList r8 = r0.P;
        if (r8 == null) goto L18;
        int r9 = r8.size() - 1;
    L16:
        if (r9 < 0) goto L20;
        ((ow3) r0.P.get(r9)).c(r3);
        r9 = r9 - 1;
        goto L16
    L20:
        return;
    L18:
        return;
    L5:
        r6 = i(r4);
        goto L6
    }

    public void e(View r3, int r4, ViewGroup.LayoutParams r5, boolean r6) {
        RecyclerView r0 = (RecyclerView) ((rm2) this.p).o;
        if (r4 >= 0) goto L5;
        int r7 = r0.getChildCount();
    L6:
        ((e20) this.q).v(r7, r6);
        if (r6 == false) goto L9;
        l(r3);
    L9:
        cx3 r2 = RecyclerView.N(r3);
        if (r2 == null) goto L23;
        if (r2.l() == true) goto L19;
        if (r2.q() == true) goto L19;
        StringBuilder r8 = new StringBuilder("Called attach on a child which is not detached: ");
        r8.append(r2);
        kf2.g(r0.C(), r8);
        return;
    L19:
        if (RecyclerView.Q0 == false) goto L21;
        Log.d("RecyclerView", "reAttach " + r2);
    L21:
        r2.j &= -257;
    L24:
        RecyclerView.a(r0, r3, r7, r5);
        return;
    L23:
        if (RecyclerView.P0 == false) goto L24;
        StringBuilder r9 = new StringBuilder("No ViewHolder found for child: ");
        r9.append(r3);
        String r10 = r0.C();
        r9.append(", index: ");
        r9.append(r7);
        r9.append(r10);
        throw new IllegalArgumentException(r9.toString());
    L5:
        r7 = i(r4);
        goto L6
    }

    public void f(int r4) {
        int r5 = i(r4);
        ((e20) this.q).y(r5);
        RecyclerView r3 = (RecyclerView) ((rm2) this.p).o;
        View r0 = r3.getChildAt(r5);
        if (r0 == null) goto L18;
        cx3 r1 = RecyclerView.N(r0);
        if (r1 != null) goto L7;
    L19:
        RecyclerView.c(r3, r5);
        return;
    L7:
        if (r1.l() == false) goto L14;
        if (r1.q() == true) goto L14;
        StringBuilder r6 = new StringBuilder("called detach on an already detached child ");
        r6.append(r1);
        kf2.g(r3.C(), r6);
        return;
    L14:
        if (RecyclerView.Q0 == false) goto L16;
        Log.d("RecyclerView", "tmpDetach " + r1);
    L16:
        r1.a(256);
        goto L19
    L18:
        if (RecyclerView.P0 == false) goto L19;
        throw new IllegalArgumentException("No view at offset " + r5 + r3.C());
    }

    public View g(int r1) {
        int r2 = i(r1);
        return ((RecyclerView) ((rm2) this.p).o).getChildAt(r2);
    }

    public int h() {
        return ((RecyclerView) ((rm2) this.p).o).getChildCount() - ((ArrayList) this.r).size();
    }

    public int i(int r4) {
        e20 r0 = (e20) this.q;
        if (r4 < 0) goto L14;
        int r3 = ((RecyclerView) ((rm2) this.p).o).getChildCount();
        int r1 = r4;
    L6:
        if (r1 >= r3) goto L19;
        int r2 = r4 - (r1 - r0.q(r1));
        if (r2 == 0) goto L10;
        r1 = r1 + r2;
    L10:
        if (r0.s(r1) == false) goto L12;
        r1 = r1 + 1;
        goto L10
    L12:
        return r1;
    L19:
        return -1;
    L14:
        return -1;
    }

    public View j(int r1) {
        return ((RecyclerView) ((rm2) this.p).o).getChildAt(r1);
    }

    public int k() {
        return ((RecyclerView) ((rm2) this.p).o).getChildCount();
    }

    public void l(View r4) {
        ((ArrayList) this.r).add(r4);
        rm2 r3 = (rm2) this.p;
        cx3 r5 = RecyclerView.N(r4);
        if (r5 == null) goto L14;
        View r0 = r5.a;
        RecyclerView r6 = (RecyclerView) r3.o;
        int r1 = r5.q;
        if (r1 == (-1)) goto L7;
        r5.p = r1;
    L9:
        if (r6.R() == false) goto L12;
        r5.q = 4;
        r6.H0.add(r5);
        return;
    L12:
        r0.setImportantForAccessibility(4);
        return;
    L7:
        r5.p = r0.getImportantForAccessibility();
        goto L9
    }

    public boolean m(ew4 r4, int r5) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if (Objects.equals(((dz3[]) this.p)[r5], ((dz3[]) r4.p)[r5]) == true) goto L8;
    L11:
        return false;
    L8:
        if (Objects.equals(((t41[]) this.q)[r5], ((t41[]) r4.q)[r5]) == false) goto L11;
        return true;
    }

    public boolean n(int r1) {
        if (((dz3[]) this.p)[r1] == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void o() {
        MainActivity r2 = (MainActivity) this.p;
        if (r2.R != null) goto L5;
        return;
    L5:
        Toast.makeText(r2, R.string.playlist_chooser_dialog_toast_remove_failure, 0).show();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r4, Throwable r5) {
        Log.e("AlbumRepository", "Network Failure on getAlbums: " + r5.getMessage());
        ((k03) this.p).k(kb4.b((String) this.q, this.o, (Integer) this.r, (Integer) this.s, null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r6, Response r7) {
        Integer r8 = (Integer) this.s;
        Integer r0 = (Integer) this.r;
        int r1 = this.o;
        String r2 = (String) this.q;
        k03 r5 = (k03) this.p;
        if (r7.isSuccessful() == true) goto L5;
    L12:
        Log.e("AlbumRepository", "API Error on getAlbums. HTTP Code: " + r7.code());
        r5.k(kb4.b(r2, r1, r0, r8, null));
        return;
    L5:
        if (r7.body() == null) goto L12;
        if (((ApiResponse) r7.body()).getSubsonicResponse().getAlbumList2() == null) goto L12;
        if (((ApiResponse) r7.body()).getSubsonicResponse().getAlbumList2().getAlbums() == null) goto L12;
        r5.k(kb4.b(r2, r1, r0, r8, ((ApiResponse) r7.body()).getSubsonicResponse().getAlbumList2().getAlbums()));
    }

    public void p(View r3) {
        if (((ArrayList) this.r).remove(r3) == false) goto L12;
        rm2 r2 = (rm2) this.p;
        cx3 r4 = RecyclerView.N(r3);
        if (r4 == null) goto L13;
        RecyclerView r5 = (RecyclerView) r2.o;
        int r0 = r4.p;
        if (r5.R() == false) goto L9;
        r4.q = r0;
        r5.H0.add(r4);
    L10:
        r4.p = 0;
        return;
    L9:
        r4.a.setImportantForAccessibility(r0);
        goto L10
    L13:
        return;
    }

    public String toString() {
        switch(this.n) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return ((e20) this.q).toString() + ", hidden list:" + ((ArrayList) this.r).size();
    }

    public ew4(k03 r2, String r3, int r4, Integer r5, Integer r6) {
        this.n = 1;
        this.p = r2;
        this.q = r3;
        this.o = r4;
        this.r = r5;
        this.s = r6;
    }

    public ew4(rm2 r2) {
        this.n = 2;
        this.o = 0;
        this.p = r2;
        this.q = new e20();
        this.r = new ArrayList();
    }

    public /* synthetic */ ew4(Object r1, Object r2, Serializable r3, Object r4, int r5, int r6) {
        this.n = r6;
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        this.o = r5;
    }

    public ew4(dz3[] r4, t41[] r5, jw4 r6, Object r7) {
        boolean r0 = false;
        this.n = 0;
        if (r4.length != r5.length) goto L5;
        r0 = true;
    L5:
        rr2.l(r0);
        this.p = r4;
        this.q = (t41[]) r5.clone();
        this.r = r6;
        this.s = r7;
        this.o = r4.length;
    }

    public ew4(List r6, HashSet r7, int r8) {
        this.n = 3;
        byte[] r1 = new byte[64];
        this.q = r1;
        this.o = r8;
        short r2 = 0;
        r1[0] = 64;
        this.s = new n50[r6.size()];
        int r0 = 0;
    L4:
        if (r0 >= r6.size()) goto L6;
        ((n50[]) this.s)[r0] = new n50(r0, ((j50) r6.get(r0)).e);
        r0 = r0 + 1;
        goto L4
    L6:
        this.r = new int[r8];
        int r9 = 0;
    L7:
        if (r2 >= r8) goto L13;
        boolean r3 = r7.contains(Short.valueOf(r2));
        int[] r4 = (int[]) this.r;
        if (r3 == false) goto L11;
        r4[r2] = r9;
        r9 = r9 + 16;
    L12:
        r2 = (short) (r2 + 1);
        goto L7
    L11:
        r4[r2] = -1;
        goto L12
    L13:
        this.p = new m50((((n50[]) this.s).length * 16) + ((((int[]) this.r).length * 4) + 84), 513, 84);
    }

    public ew4(qy4 r3, int r4) {
        this.n = 6;
        this.s = r3;
        this.p = new h00(5, new byte[5]);
        this.q = new SparseArray();
        this.r = new SparseIntArray();
        this.o = r4;
    }
}
