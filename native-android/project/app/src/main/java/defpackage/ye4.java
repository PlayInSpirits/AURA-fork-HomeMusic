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
    public int u = 0;
    public final /* synthetic */ wh2 v;
    public final /* synthetic */ TextInputLayout w;
    public final /* synthetic */ ze4 x;

    public ye4(ze4 ze4Var, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, dy dyVar, wh2 wh2Var, TextInputLayout textInputLayout2) {
        this.x = ze4Var;
        this.v = wh2Var;
        this.w = textInputLayout2;
        this.o = str;
        this.p = simpleDateFormat;
        this.n = textInputLayout;
        this.q = dyVar;
        this.r = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.s = new k6(17, this, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.o;
        if (length >= str.length() || editable.length() < this.u) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.u = charSequence.length();
    }

    @Override // defpackage.ft4, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dy dyVar = this.q;
        TextInputLayout textInputLayout = this.n;
        k6 k6Var = this.s;
        textInputLayout.removeCallbacks(k6Var);
        textInputLayout.removeCallbacks(this.t);
        textInputLayout.setError(null);
        ze4 ze4Var = this.x;
        ze4Var.n = null;
        ze4Var.getClass();
        Long l = ze4Var.n;
        wh2 wh2Var = this.v;
        wh2Var.b(l);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.o.length()) {
            return;
        }
        try {
            Date date = this.p.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (time >= dyVar.p.n) {
                Calendar calendarC = a35.c(dyVar.n.n);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    ix2 ix2Var = dyVar.o;
                    int i4 = ix2Var.r;
                    Calendar calendarC2 = a35.c(ix2Var.n);
                    calendarC2.set(5, i4);
                    if (time <= calendarC2.getTimeInMillis()) {
                        ze4Var.n = Long.valueOf(date.getTime());
                        ze4Var.getClass();
                        wh2Var.b(ze4Var.n);
                        return;
                    }
                }
            }
            mm mmVar = new mm(this, time, 1);
            this.t = mmVar;
            textInputLayout.post(mmVar);
        } catch (ParseException unused) {
            textInputLayout.post(k6Var);
        }
    }
}
