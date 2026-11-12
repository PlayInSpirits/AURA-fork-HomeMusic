package defpackage;

import android.app.Dialog;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.model.Server;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra4 o;

    public /* synthetic */ pa4(ra4 ra4Var, int i) {
        this.n = i;
        this.o = ra4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String strTrim;
        String strTrim2;
        int i = this.n;
        String strTrim3 = null;
        int iCharCount = 0;
        final ra4 ra4Var = this.o;
        switch (i) {
            case 0:
                if (!TextUtils.isEmpty(((TextInputEditText) ra4Var.B0.b).getText())) {
                    ((TextInputEditText) ra4Var.B0.b).setText((CharSequence) null);
                } else {
                    KeyChain.choosePrivateKeyAlias(ra4Var.X(), new KeyChainAliasCallback() { // from class: qa4
                        @Override // android.security.KeyChainAliasCallback
                        public final void alias(String str) {
                            ((TextInputEditText) ra4Var.B0.b).setText(str);
                        }
                    }, null, null, null, null);
                }
                break;
            case 1:
                Editable text = ((TextInputEditText) ra4Var.B0.f).getText();
                Objects.requireNonNull(text);
                ra4Var.D0 = text.toString().trim();
                Editable text2 = ((TextInputEditText) ra4Var.B0.h).getText();
                Objects.requireNonNull(text2);
                ra4Var.E0 = text2.toString().trim();
                boolean zIsChecked = ((CheckBox) ra4Var.B0.d).isChecked();
                ey eyVar = ra4Var.B0;
                if (zIsChecked) {
                    Editable text3 = ((TextInputEditText) eyVar.e).getText();
                    Objects.requireNonNull(text3);
                    String string2 = text3.toString();
                    Pattern pattern = e03.a;
                    string = "enc:" + ((String) string2.chars().mapToObj(new c03()).collect(Collectors.joining()));
                } else {
                    Editable text4 = ((TextInputEditText) eyVar.e).getText();
                    Objects.requireNonNull(text4);
                    string = text4.toString();
                }
                ra4Var.F0 = string;
                if (((TextInputEditText) ra4Var.B0.g).getText() != null) {
                    String strTrim4 = ((TextInputEditText) ra4Var.B0.g).getText().toString().trim();
                    int length = strTrim4.length();
                    int iCharCount2 = 0;
                    while (true) {
                        if (iCharCount2 < length) {
                            int iCodePointAt = strTrim4.codePointAt(iCharCount2);
                            if (Character.isWhitespace(iCodePointAt)) {
                                iCharCount2 += Character.charCount(iCodePointAt);
                            } else {
                                strTrim = ((TextInputEditText) ra4Var.B0.g).getText().toString().trim();
                            }
                        } else {
                            strTrim = null;
                        }
                    }
                } else {
                    strTrim = null;
                }
                ra4Var.G0 = strTrim;
                if (((TextInputEditText) ra4Var.B0.c).getText() != null) {
                    String strTrim5 = ((TextInputEditText) ra4Var.B0.c).getText().toString().trim();
                    int length2 = strTrim5.length();
                    int iCharCount3 = 0;
                    while (true) {
                        if (iCharCount3 < length2) {
                            int iCodePointAt2 = strTrim5.codePointAt(iCharCount3);
                            if (Character.isWhitespace(iCodePointAt2)) {
                                iCharCount3 += Character.charCount(iCodePointAt2);
                            } else {
                                strTrim2 = ((TextInputEditText) ra4Var.B0.c).getText().toString().trim();
                            }
                        } else {
                            strTrim2 = null;
                        }
                    }
                } else {
                    strTrim2 = null;
                }
                ra4Var.H0 = strTrim2;
                ra4Var.I0 = ((CheckBox) ra4Var.B0.d).isChecked();
                if (((TextInputEditText) ra4Var.B0.b).getText() != null) {
                    String strTrim6 = ((TextInputEditText) ra4Var.B0.b).getText().toString().trim();
                    int length3 = strTrim6.length();
                    while (iCharCount < length3) {
                        int iCodePointAt3 = strTrim6.codePointAt(iCharCount);
                        if (Character.isWhitespace(iCodePointAt3)) {
                            iCharCount += Character.charCount(iCodePointAt3);
                        } else {
                            strTrim3 = ((TextInputEditText) ra4Var.B0.b).getText().toString().trim();
                        }
                    }
                }
                ra4Var.J0 = strTrim3;
                if (TextUtils.isEmpty(ra4Var.D0)) {
                    ((TextInputEditText) ra4Var.B0.f).setError(ra4Var.s(R.string.error_required));
                } else if (TextUtils.isEmpty(ra4Var.E0)) {
                    ((TextInputEditText) ra4Var.B0.h).setError(ra4Var.s(R.string.error_required));
                } else if (TextUtils.isEmpty(ra4Var.G0)) {
                    ((TextInputEditText) ra4Var.B0.g).setError(ra4Var.s(R.string.error_required));
                } else if (!TextUtils.isEmpty(ra4Var.H0) && !ra4Var.H0.matches("^https?://(.*)")) {
                    ((TextInputEditText) ra4Var.B0.c).setError(ra4Var.s(R.string.error_server_prefix));
                } else if (!ra4Var.G0.matches("^https?://(.*)")) {
                    ((TextInputEditText) ra4Var.B0.g).setError(ra4Var.s(R.string.error_server_prefix));
                } else {
                    Server server = ra4Var.C0.d;
                    new Thread(new oa4((na4) ra4Var.C0.c.o, new Server(server != null ? server.getServerId() : UUID.randomUUID().toString(), ra4Var.D0, ra4Var.E0, ra4Var.F0, ra4Var.G0, ra4Var.H0, System.currentTimeMillis(), ra4Var.I0, ra4Var.J0), 1)).start();
                    Dialog dialog = ra4Var.w0;
                    Objects.requireNonNull(dialog);
                    dialog.dismiss();
                }
                break;
            default:
                Toast.makeText(ra4Var.Z(), R.string.server_signup_dialog_action_delete_toast, 0).show();
                break;
        }
    }
}
