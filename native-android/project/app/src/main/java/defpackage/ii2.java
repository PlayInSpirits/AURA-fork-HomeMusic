package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii2<S> extends cg3 {
    public int m0;
    public ze4 n0;
    public dy o0;

    public ii2() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r2) {
        super.F(r2);
        if (r2 != null) goto L5;
        r2 = this.s;
    L5:
        this.m0 = r2.getInt("THEME_RES_ID_KEY");
        this.n0 = (ze4) r2.getParcelable("DATE_SELECTOR_KEY");
        this.o0 = (dy) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r17, ViewGroup r18, Bundle r19) {
        LayoutInflater r1 = r17.cloneInContext(new ContextThemeWrapper(n(), this.m0));
        ze4 r3 = this.n0;
        dy r7 = this.o0;
        wh2 r8 = new wh2(1, this);
        r3.getClass();
        View r0 = r1.inflate(R.layout.mtrl_picker_text_input_date, r18, false);
        TextInputLayout r6 = (TextInputLayout) r0.findViewById(R.id.mtrl_picker_text_input_date);
        EditText r2 = r6.getEditText();
        String r4 = Build.MANUFACTURER;
        if (r4 == null) goto L5;
        String r5 = r4.toLowerCase(Locale.ENGLISH);
    L7:
        if (r5.equals("lge") == true) goto L13;
        if (r4 == null) goto L10;
        String r9 = r4.toLowerCase(Locale.ENGLISH);
    L12:
        if (r9.equals("samsung") == true) goto L13;
    L14:
        AtomicReference r10 = a35.a;
        SimpleDateFormat r11 = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        r11.setTimeZone(TimeZone.getTimeZone("UTC"));
        r11.setLenient(false);
        Resources r12 = r0.getResources();
        String r13 = r11.toPattern();
        String r14 = r12.getString(R.string.mtrl_picker_text_input_year_abbr);
        String r15 = r12.getString(R.string.mtrl_picker_text_input_month_abbr);
        String r16 = r12.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) == false) goto L17;
        r13 = r13.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
    L17:
        String r20 = r13.replace("d", r16).replace("M", r15).replace("y", r14);
        r6.setPlaceholderText(r20);
        Long r21 = r3.n;
        if (r21 == null) goto L20;
        r2.setText(r11.format(r21));
    L20:
        r2.addTextChangedListener(new ye4(r3, r20, r11, r6, r7, r8, r6));
        EditText[] r22 = {r2};
        p30 r23 = new p30(1, r22);
        r22[0].setOnFocusChangeListener(r23);
        EditText r24 = r22[0];
        r24.postDelayed(new ni0(r24, 0), 100);
        return r0;
    L10:
        r9 = "";
    L13:
        r2.setInputType(17);
        goto L14
    L5:
        r5 = "";
        goto L7
    }

    @Override // defpackage.kc1
    public final void Q(Bundle r3) {
        r3.putInt("THEME_RES_ID_KEY", this.m0);
        r3.putParcelable("DATE_SELECTOR_KEY", this.n0);
        r3.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.o0);
    }
}
