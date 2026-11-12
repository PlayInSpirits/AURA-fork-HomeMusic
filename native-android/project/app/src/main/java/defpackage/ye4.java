package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ye4 extends ft4 {
    public final TextInputLayout n;
    public final String o;
    public final SimpleDateFormat p;
    public final dy q;
    public final String r;
    public final k6 s;
    public mm t;
    public int u;
    public final /* synthetic */ wh2 v;
    public final /* synthetic */ TextInputLayout w;
    public final /* synthetic */ ze4 x;

    public ye4(ze4 r1, String r2, SimpleDateFormat r3, TextInputLayout r4, dy r5, wh2 r6, TextInputLayout r7) {
        this.x = r1;
        this.v = r6;
        this.w = r7;
        this.u = 0;
        this.o = r2;
        this.p = r3;
        this.n = r4;
        this.q = r5;
        this.r = r4.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.s = new k6(17, this, r2);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r4) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) == false) goto L6;
        return;
    L6:
        if (r4.length() == 0) goto L16;
        int r0 = r4.length();
        String r1 = this.o;
        if (r0 < r1.length()) goto L10;
        return;
    L10:
        if (r4.length() < this.u) goto L20;
        char r3 = r1.charAt(r4.length());
        if (Character.isDigit(r3) == true) goto L18;
        r4.append(r3);
        return;
    L18:
        return;
    L20:
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        this.u = r1.length();
    }

    @Override // defpackage.ft4, android.text.TextWatcher
    public final void onTextChanged(CharSequence r10, int r11, int r12, int r13) {
        dy r14 = this.q;
        TextInputLayout r15 = this.n;
        k6 r16 = this.s;
        r15.removeCallbacks(r16);
        r15.removeCallbacks(this.t);
        r15.setError(null);
        ze4 r1 = this.x;
        r1.n = null;
        r1.getClass();
        Long r2 = r1.n;
        wh2 r3 = this.v;
        r3.b(r2);
        if (TextUtils.isEmpty(r10) == false) goto L5;
        return;
    L5:
        if (r10.length() < this.o.length()) goto L24;
        Date r17 = this.p.parse(r10.toString());     // Catch: ParseException -> L20
        r15.setError(null);     // Catch: ParseException -> L20
        long r4 = r17.getTime();     // Catch: ParseException -> L20
        if (r4 < r14.p.n) goto L10;
        boolean r0 = true;
    L11:
        if (r0 == false) goto L18;
        Calendar r5 = a35.c(r14.n.n);     // Catch: ParseException -> L20
        r5.set(5, 1);     // Catch: ParseException -> L20
        if (r5.getTimeInMillis() > r4) goto L18;
        ix2 r18 = r14.o;     // Catch: ParseException -> L20
        int r6 = r18.r;     // Catch: ParseException -> L20
        Calendar r19 = a35.c(r18.n);     // Catch: ParseException -> L20
        r19.set(5, r6);     // Catch: ParseException -> L20
        if (r4 > r19.getTimeInMillis()) goto L18;
        r1.n = Long.valueOf(r17.getTime());     // Catch: ParseException -> L20
        r1.getClass();     // Catch: ParseException -> L20
        r3.b(r1.n);     // Catch: ParseException -> L20
        return;
    L18:
        mm r110 = new mm(this, r4, 1);     // Catch: ParseException -> L20
        this.t = r110;     // Catch: ParseException -> L20
        r15.post(r110);     // Catch: ParseException -> L20
        return;
    L10:
        r0 = false;
    L20:
        r15.post(r16);
        return;
    }
}
