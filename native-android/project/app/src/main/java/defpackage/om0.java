package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaDrmException;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 implements qm, xn4, wh4, wq0, pe1, s41, cp, hu0, cx4, m31, ky0, ep3, f04, q44 {
    public static om0 o;
    public final /* synthetic */ int n;

    public om0() {
        this.n = 3;
        if (Build.VERSION.SDK_INT >= 35) goto L5;
        return;
    }

    public static k03 W(String r5) {
        k03 r0 = new k03();
        gp3 r2 = App.f(false).c();
        r2.getClass();
        Log.d("BrowsingClient", "getMusicDirectory()");
        ((ov) r2.p).h(((pn4) r2.o).f(), r5).enqueue(new qr2(r0, r5, false, 7));
        return r0;
    }

    public static k03 X() {
        k03 r0 = new k03();
        gp3 r1 = App.f(false).c();
        r1.getClass();
        Log.d("BrowsingClient", "getMusicFolders()");
        ((ov) r1.p).l(((pn4) r1.o).f()).enqueue(new p8(r0, 2));
        return r0;
    }

    public static boolean Y(a01 r7, Editable r8, int r9, int r10, boolean r11) {
        if (r8 == null) goto L79;
        if (r9 < 0) goto L79;
        if (r10 < 0) goto L79;
        int r1 = Selection.getSelectionStart(r8);
        int r2 = Selection.getSelectionEnd(r8);
        if (r1 == (-1)) goto L79;
        if (r2 == (-1)) goto L79;
        if (r1 != r2) goto L79;
        if (r11 == false) goto L69;
        int r12 = Math.max(r9, 0);
        int r13 = r8.length();
        if (r1 < 0) goto L19;
        if (r13 < r1) goto L19;
        if (r12 < 0) goto L19;
    L20:
        boolean r14 = false;
    L21:
        if (r12 == 0) goto L41;
        r1 = r1 - 1;
        if (r1 < 0) goto L25;
        char r5 = r8.charAt(r1);
        if (r14 == true) goto L31;
        if (Character.isSurrogate(r5) == false) goto L36;
        if (Character.isHighSurrogate(r5) == true) goto L19;
        r14 = true;
        goto L21
    L36:
        r12 = r12 - 1;
        goto L21
    L31:
        if (Character.isHighSurrogate(r5) == false) goto L19;
        r12 = r12 - 1;
        goto L20
    L25:
        if (r14 == true) goto L19;
        r1 = 0;
    L41:
        int r15 = Math.max(r10, 0);
        int r16 = r8.length();
        if (r2 < 0) goto L46;
        if (r16 < r2) goto L46;
        if (r15 < 0) goto L46;
    L47:
        boolean r17 = false;
    L48:
        if (r15 == 0) goto L49;
        if (r2 >= r16) goto L51;
        char r6 = r8.charAt(r2);
        if (r17 == true) goto L56;
        if (Character.isSurrogate(r6) == false) goto L61;
        if (Character.isLowSurrogate(r6) == true) goto L46;
        r2 = r2 + 1;
        r17 = true;
        goto L48
    L61:
        r15 = r15 - 1;
        r2 = r2 + 1;
        goto L48
    L56:
        if (Character.isLowSurrogate(r6) == false) goto L46;
        r15 = r15 - 1;
        r2 = r2 + 1;
        goto L47
    L51:
        if (r17 == true) goto L46;
    L66:
        if (r1 == (-1)) goto L79;
        if (r16 == (-1)) goto L79;
    L70:
        l05[] r18 = (l05[]) r8.getSpans(r1, r16, l05.class);
        if (r18 == null) goto L79;
        if (r18.length <= 0) goto L79;
        int r19 = r18.length;
        int r3 = 0;
    L75:
        if (r3 >= r19) goto L77;
        l05 r4 = r18[r3];
        int r20 = r8.getSpanStart(r4);
        int r21 = r8.getSpanEnd(r4);
        r1 = Math.min(r20, r1);
        r16 = Math.max(r21, r16);
        r3 = r3 + 1;
        goto L75
    L77:
        int r22 = Math.max(r1, 0);
        int r110 = Math.min(r16, r8.length());
        r7.beginBatchEdit();
        r8.delete(r22, r110);
        r7.endBatchEdit();
        return true;
    L49:
        r16 = r2;
    L46:
        r16 = -1;
    L19:
        r1 = -1;
        goto L41
    L69:
        r1 = Math.max(r1 - r9, 0);
        r16 = Math.min(r2 + r10, r8.length());
    L79:
        return false;
    }

    @Override // defpackage.m31
    public void A(byte[] r1, byte[] r2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public void B(byte[] r1) {
    }

    @Override // defpackage.xn4
    public zn4 C(tb1 r15) {
        String r14 = r15.n;
        List r16 = r15.q;
        if (r14 != null) goto L5;
    L85:
        kf2.n(xa3.g("Unsupported MIME type: ", r14));
        return null;
    L5:
        switch(r14.hashCode()) {
            case -1351681404: goto L40;
            case -1248334819: goto L36;
            case -1026075066: goto L32;
            case -1004728940: goto L28;
            case 691401887: goto L24;
            case 822864842: goto L20;
            case 1157994102: goto L16;
            case 1668750253: goto L12;
            case 1693976202: goto L8;
            default: goto L6;
        };
    L6:
        byte r0 = -1;
    L43:
        switch(r0) {
            case 0: goto L84;
            case 1: goto L82;
            case 2: goto L80;
            case 3: goto L78;
            case 4: goto L76;
            case 5: goto L74;
            case 6: goto L49;
            case 7: goto L48;
            case 8: goto L46;
            default: goto L85;
        };
    L49:
        na4 r17 = new na4();
        r17.n = new be3();
        r17.o = new be3();
        o85 r1 = new o85();
        r17.p = r1;
        String r18 = new String((byte[]) r16.get(0), StandardCharsets.UTF_8).trim();
        String r6 = f35.a;
        String[] r19 = r18.split("\\r?\\n", -1);
        int r7 = r19.length;
        int r8 = 0;
    L50:
        if (r8 >= r7) goto L72;
        String r9 = r19[r8];
        if (r9.startsWith("palette: ") == false) goto L63;
        String[] r10 = r9.substring(9).split(",", -1);
        r1.d = new int[r10.length];
        int r11 = 0;
    L55:
        if (r11 >= r10.length) goto L71;
        int[] r12 = r1.d;
        int r13 = Integer.parseInt(r10[r11].trim(), 16);     // Catch: RuntimeException -> L59
    L61:
        r12[r11] = r13;
        r11 = r11 + 1;
    L59:
        e = move-exception;
        l93.r0("VobsubParser", "Parsing color failed", e);
        r13 = 0;
    L71:
        r8 = r8 + 1;
        goto L50
    L63:
        if (r9.startsWith("size: ") == false) goto L71;
        String[] r20 = r9.substring(6).trim().split("x", -1);
        if (r20.length == 2) goto L89;
        l93.q0("VobsubParser", "Ignoring malformed IDX size line: '" + r9 + "'");
        goto L71
    L89:
        r1.e = Integer.parseInt(r20[0]);     // Catch: RuntimeException -> L69
        r1.f = Integer.parseInt(r20[1]);     // Catch: RuntimeException -> L69
        r1.b = true;     // Catch: RuntimeException -> L69
    L69:
        e = move-exception;
        l93.r0("VobsubParser", "Parsing IDX failed", e);
        goto L71
    L72:
        return r17;
    L46:
        return new vy4();
    L48:
        return new nn4();
    L74:
        return new hk4(r16);
    L76:
        return new az4(r16);
    L78:
        return new wo0(23);
    L80:
        return new ov1(1);
    L82:
        return new bq4(10);
    L84:
        return new lv4(r16);
    L8:
        if (r14.equals("application/ttml+xml") == false) goto L99;
        r0 = 8;
        goto L43
    L99:
        r0 = -1;
        goto L43
    L12:
        if (r14.equals("application/x-subrip") == false) goto L100;
        r0 = 7;
        goto L43
    L100:
        r0 = -1;
        goto L43
    L16:
        if (r14.equals("application/vobsub") == false) goto L101;
        r0 = 6;
        goto L43
    L101:
        r0 = -1;
        goto L43
    L20:
        if (r14.equals("text/x-ssa") == false) goto L102;
        r0 = 5;
        goto L43
    L102:
        r0 = -1;
        goto L43
    L24:
        if (r14.equals("application/x-quicktime-tx3g") == false) goto L103;
        r0 = 4;
        goto L43
    L103:
        r0 = -1;
        goto L43
    L28:
        if (r14.equals("text/vtt") == false) goto L104;
        r0 = 3;
        goto L43
    L104:
        r0 = -1;
        goto L43
    L32:
        if (r14.equals("application/x-mp4-vtt") == false) goto L105;
        r0 = 2;
        goto L43
    L105:
        r0 = -1;
        goto L43
    L36:
        if (r14.equals("application/pgs") == false) goto L106;
        r0 = 1;
        goto L43
    L106:
        r0 = -1;
        goto L43
    L40:
        if (r14.equals("application/dvbsubs") == false) goto L107;
        r0 = 0;
        goto L43
    L107:
        r0 = -1;
        goto L43
    }

    @Override // defpackage.m31
    public void D(zg5 r1) {
    }

    @Override // defpackage.hu0
    public void E(zs r1, Bitmap r2) {
    }

    @Override // defpackage.ky0
    public void G(df r1) {
    }

    @Override // defpackage.m31
    public byte[] H(byte[] r1, byte[] r2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.cp
    public long J() {
        return 0;
    }

    @Override // defpackage.cp
    public void L(Handler r1, nj0 r2) {
    }

    @Override // defpackage.wq0
    public void M(f42 r1, ns3 r2) {
    }

    @Override // defpackage.m31
    public void N(byte[] r1) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public k31 O(byte[] r1, List r2, int r3, HashMap r4) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public int P() {
        return 1;
    }

    @Override // defpackage.xn4
    public int R(tb1 r5) {
        String r4 = r5.n;
        if (r4 == null) goto L51;
        byte r3 = -1;
        switch(r4.hashCode()) {
            case -1351681404: goto L40;
            case -1248334819: goto L36;
            case -1026075066: goto L32;
            case -1004728940: goto L28;
            case 691401887: goto L24;
            case 822864842: goto L20;
            case 1157994102: goto L16;
            case 1668750253: goto L12;
            case 1693976202: goto L8;
            default: goto L43;
        };
    L43:
        switch(r3) {
            case 0: goto L50;
            case 1: goto L50;
            case 2: goto L50;
            case 3: goto L49;
            case 4: goto L48;
            case 5: goto L47;
            case 6: goto L46;
            case 7: goto L45;
            case 8: goto L45;
            default: goto L51;
        };
    L45:
        return 1;
    L46:
        return 2;
    L47:
        return 1;
    L48:
        return 2;
    L49:
        return 1;
    L50:
        return 2;
    L8:
        if (r4.equals("application/ttml+xml") == false) goto L43;
        r3 = 8;
        goto L43
    L12:
        if (r4.equals("application/x-subrip") == false) goto L43;
        r3 = 7;
        goto L43
    L16:
        if (r4.equals("application/vobsub") == false) goto L43;
        r3 = 6;
        goto L43
    L20:
        if (r4.equals("text/x-ssa") == false) goto L43;
        r3 = 5;
        goto L43
    L24:
        if (r4.equals("application/x-quicktime-tx3g") == false) goto L43;
        r3 = 4;
        goto L43
    L28:
        if (r4.equals("text/vtt") == false) goto L43;
        r3 = 3;
        goto L43
    L32:
        if (r4.equals("application/x-mp4-vtt") == false) goto L43;
        r3 = 2;
        goto L43
    L36:
        if (r4.equals("application/pgs") == false) goto L43;
        r3 = 1;
        goto L43
    L40:
        if (r4.equals("application/dvbsubs") == false) goto L43;
        r3 = 0;
    L51:
        kf2.n(xa3.g("Unsupported MIME type: ", r4));
        return 0;
    }

    @Override // defpackage.m31
    public boolean U(String r1, byte[] r2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public void a() {
    }

    @Override // defpackage.q44
    public boolean c() {
        return true;
    }

    @Override // defpackage.m31
    public Map e(byte[] r1) {
        throw new IllegalStateException();
    }

    @Override // defpackage.cp
    public void h(nj0 r1) {
    }

    @Override // defpackage.pe1
    public void i(nc1 r1) {
    }

    @Override // defpackage.s41
    public t41[] k(r41[] r5, cp r6) {
        t41[] r4 = new t41[r5.length];
        int r7 = 0;
        int r0 = 0;
    L4:
        if (r0 >= r5.length) goto L10;
        r41 r1 = r5[r0];
        if (r1 != null) goto L8;
        ys0 r2 = null;
    L9:
        r4[r0] = r2;
        r0 = r0 + 1;
        goto L4
    L8:
        r2 = new ys0(r1.a, r1.b, r7, r7);
        goto L9
    L10:
        return r4;
    }

    @Override // defpackage.cx4
    public boolean l(Object r3, ws r4) {
        Drawable r5 = (Drawable) r3;
        ImageView r2 = r4.n;
        Drawable r6 = r2.getDrawable();
        if (r6 != null) goto L5;
        r6 = new ColorDrawable(0);
    L5:
        TransitionDrawable r1 = new TransitionDrawable(new Drawable[]{r6, r5});
        r1.setCrossFadeEnabled(false);
        r1.startTransition(300);
        r2.setImageDrawable(r1);
        return true;
    }

    @Override // defpackage.wq0
    public File m(f42 r1) {
        return null;
    }

    @Override // defpackage.xn4
    public boolean n(tb1 r1) {
        String r0 = r1.n;
        if (Objects.equals(r0, "text/x-ssa") == false) goto L5;
        return true;
    L5:
        if (Objects.equals(r0, "text/vtt") == false) goto L7;
        return true;
    L7:
        if (Objects.equals(r0, "application/x-mp4-vtt") == false) goto L9;
        return true;
    L9:
        if (Objects.equals(r0, "application/x-subrip") == false) goto L11;
        return true;
    L11:
        if (Objects.equals(r0, "application/x-quicktime-tx3g") == false) goto L13;
        return true;
    L13:
        if (Objects.equals(r0, "application/pgs") == false) goto L15;
        return true;
    L15:
        if (Objects.equals(r0, "application/vobsub") == false) goto L17;
        return true;
    L17:
        if (Objects.equals(r0, "application/dvbsubs") == false) goto L19;
        return true;
    L19:
        if (Objects.equals(r0, "application/ttml+xml") == true) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // defpackage.m31
    public l31 p() {
        throw new IllegalStateException();
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference r1) {
        EditTextPreference r2 = (EditTextPreference) r1;
        if (TextUtils.isEmpty(r2.h0) == false) goto L7;
        return r2.n.getString(R.string.not_set);
    L7:
        return r2.h0;
    }

    @Override // defpackage.q44
    public void s() {
    }

    @Override // defpackage.q44
    public int t(gp3 r1, cj0 r2, int r3) {
        r2.o = 4;
        return -4;
    }

    @Override // defpackage.q44
    public int u(long r1) {
        return 0;
    }

    @Override // defpackage.m31
    public se1 v(byte[] r1) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public byte[] w() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.hu0
    public void x() {
    }

    @Override // defpackage.cp
    public rw4 z() {
        return null;
    }

    public /* synthetic */ om0(int r1) {
        this.n = r1;
    }
}
