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

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.s;
        }
        this.m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.n0 = (ze4) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.o0 = (dy) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(n(), this.m0));
        ze4 ze4Var = this.n0;
        dy dyVar = this.o0;
        wh2 wh2Var = new wh2(1, this);
        ze4Var.getClass();
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
            editText.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung")) {
                editText.setInputType(17);
            }
        }
        AtomicReference atomicReference = a35.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = viewInflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String strReplace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        textInputLayout.setPlaceholderText(strReplace);
        Long l = ze4Var.n;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new ye4(ze4Var, strReplace, simpleDateFormat, textInputLayout, dyVar, wh2Var, textInputLayout));
        EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new p30(1, editTextArr));
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new ni0(editText2, 0), 100L);
        return viewInflate;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.o0);
    }
}
