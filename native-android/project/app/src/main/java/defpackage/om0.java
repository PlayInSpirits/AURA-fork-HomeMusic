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
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static k03 W(String str) {
        k03 k03Var = new k03();
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getMusicDirectory()");
        ((ov) gp3VarC.p).h(((pn4) gp3VarC.o).f(), str).enqueue(new qr2(k03Var, str, false, 7));
        return k03Var;
    }

    public static k03 X() {
        k03 k03Var = new k03();
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getMusicFolders()");
        ((ov) gp3VarC.p).l(((pn4) gp3VarC.o).f()).enqueue(new p8(k03Var, 2));
        return k03Var;
    }

    public static boolean Y(a01 a01Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                l05[] l05VarArr = (l05[]) editable.getSpans(selectionStart, iMin, l05.class);
                if (l05VarArr != null && l05VarArr.length > 0) {
                    for (l05 l05Var : l05VarArr) {
                        int spanStart = editable.getSpanStart(l05Var);
                        int spanEnd = editable.getSpanEnd(l05Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    a01Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    a01Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.m31
    public void A(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public void B(byte[] bArr) {
    }

    @Override // defpackage.xn4
    public zn4 C(tb1 tb1Var) {
        int i;
        String str = tb1Var.n;
        List list = tb1Var.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new lv4(list);
                case "application/pgs":
                    return new bq4(10);
                case "application/x-mp4-vtt":
                    return new ov1(1);
                case "text/vtt":
                    return new wo0(23);
                case "application/x-quicktime-tx3g":
                    return new az4(list);
                case "text/x-ssa":
                    return new hk4(list);
                case "application/vobsub":
                    na4 na4Var = new na4();
                    na4Var.n = new be3();
                    na4Var.o = new be3();
                    o85 o85Var = new o85();
                    na4Var.p = o85Var;
                    String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
                    String str2 = f35.a;
                    for (String str3 : strTrim.split("\\r?\\n", -1)) {
                        if (str3.startsWith("palette: ")) {
                            String[] strArrSplit = str3.substring(9).split(",", -1);
                            o85Var.d = new int[strArrSplit.length];
                            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                                int[] iArr = o85Var.d;
                                try {
                                    i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                                } catch (RuntimeException e) {
                                    l93.r0("VobsubParser", "Parsing color failed", e);
                                    i = 0;
                                }
                                iArr[i2] = i;
                            }
                        } else if (str3.startsWith("size: ")) {
                            String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                            if (strArrSplit2.length != 2) {
                                l93.q0("VobsubParser", "Ignoring malformed IDX size line: '" + str3 + "'");
                            } else {
                                try {
                                    o85Var.e = Integer.parseInt(strArrSplit2[0]);
                                    o85Var.f = Integer.parseInt(strArrSplit2[1]);
                                    o85Var.b = true;
                                } catch (RuntimeException e2) {
                                    l93.r0("VobsubParser", "Parsing IDX failed", e2);
                                }
                            }
                        }
                    }
                    return na4Var;
                case "application/x-subrip":
                    return new nn4();
                case "application/ttml+xml":
                    return new vy4();
            }
        }
        kf2.n(xa3.g("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.m31
    public void D(zg5 zg5Var) {
    }

    @Override // defpackage.hu0
    public void E(zs zsVar, Bitmap bitmap) {
    }

    @Override // defpackage.ky0
    public void G(df dfVar) {
    }

    @Override // defpackage.m31
    public byte[] H(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.cp
    public long J() {
        return 0L;
    }

    @Override // defpackage.cp
    public void L(Handler handler, nj0 nj0Var) {
    }

    @Override // defpackage.wq0
    public void M(f42 f42Var, ns3 ns3Var) {
    }

    @Override // defpackage.m31
    public void N(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public k31 O(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public int P() {
        return 1;
    }

    @Override // defpackage.xn4
    public int R(tb1 tb1Var) {
        String str = tb1Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        kf2.n(xa3.g("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // defpackage.m31
    public boolean U(String str, byte[] bArr) {
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
    public Map e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.cp
    public void h(nj0 nj0Var) {
    }

    @Override // defpackage.pe1
    public void i(nc1 nc1Var) {
    }

    @Override // defpackage.s41
    public t41[] k(r41[] r41VarArr, cp cpVar) {
        t41[] t41VarArr = new t41[r41VarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < r41VarArr.length; i2++) {
            r41 r41Var = r41VarArr[i2];
            t41VarArr[i2] = r41Var == null ? null : new ys0(r41Var.a, r41Var.b, i, i);
        }
        return t41VarArr;
    }

    @Override // defpackage.cx4
    public boolean l(Object obj, ws wsVar) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = wsVar.n;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // defpackage.wq0
    public File m(f42 f42Var) {
        return null;
    }

    @Override // defpackage.xn4
    public boolean n(tb1 tb1Var) {
        String str = tb1Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.m31
    public l31 p() {
        throw new IllegalStateException();
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.h0) ? editTextPreference.n.getString(R.string.not_set) : editTextPreference.h0;
    }

    @Override // defpackage.q44
    public void s() {
    }

    @Override // defpackage.q44
    public int t(gp3 gp3Var, cj0 cj0Var, int i) {
        cj0Var.o = 4;
        return -4;
    }

    @Override // defpackage.q44
    public int u(long j) {
        return 0;
    }

    @Override // defpackage.m31
    public se1 v(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m31
    public byte[] w() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.hu0
    public void x() {
    }

    @Override // defpackage.cp
    public rw4 z() {
        return null;
    }

    public /* synthetic */ om0(int i) {
        this.n = i;
    }
}
