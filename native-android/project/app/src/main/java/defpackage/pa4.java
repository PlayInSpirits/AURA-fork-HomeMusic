package defpackage;

import android.app.Dialog;
import android.security.KeyChain;
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

    public /* synthetic */ pa4(ra4 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r12) {
        int r13 = this.n;
        String r0 = null;
        int r1 = 0;
        final ra4 r11 = this.o;
        switch(r13) {
            case 0: goto L61;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Toast.makeText(r11.Z(), R.string.server_signup_dialog_action_delete_toast, 0).show();
        return;
    L6:
        Editable r14 = ((TextInputEditText) r11.B0.f).getText();
        Objects.requireNonNull(r14);
        r11.D0 = r14.toString().trim();
        Editable r15 = ((TextInputEditText) r11.B0.h).getText();
        Objects.requireNonNull(r15);
        r11.E0 = r15.toString().trim();
        boolean r16 = ((CheckBox) r11.B0.d).isChecked();
        ey r2 = r11.B0;
        if (r16 == false) goto L9;
        Editable r17 = ((TextInputEditText) r2.e).getText();
        Objects.requireNonNull(r17);
        String r18 = r17.toString();
        Pattern r3 = e03.a;
        String r19 = "enc:" + ((String) r18.chars().mapToObj(new c03()).collect(Collectors.joining()));
    L10:
        r11.F0 = r19;
        if (((TextInputEditText) r11.B0.g).getText() == null) goto L18;
        String r110 = ((TextInputEditText) r11.B0.g).getText().toString().trim();
        int r4 = r110.length();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L18;
        int r6 = r110.codePointAt(r5);
        if (Character.isWhitespace(r6) == false) goto L16;
        r5 = r5 + Character.charCount(r6);
        goto L13
    L16:
        String r111 = ((TextInputEditText) r11.B0.g).getText().toString().trim();
    L19:
        r11.G0 = r111;
        if (((TextInputEditText) r11.B0.c).getText() == null) goto L27;
        String r112 = ((TextInputEditText) r11.B0.c).getText().toString().trim();
        int r7 = r112.length();
        int r8 = 0;
    L22:
        if (r8 >= r7) goto L27;
        int r9 = r112.codePointAt(r8);
        if (Character.isWhitespace(r9) == false) goto L25;
        r8 = r8 + Character.charCount(r9);
        goto L22
    L25:
        String r113 = ((TextInputEditText) r11.B0.c).getText().toString().trim();
    L28:
        r11.H0 = r113;
        r11.I0 = ((CheckBox) r11.B0.d).isChecked();
        if (((TextInputEditText) r11.B0.b).getText() == null) goto L36;
        String r114 = ((TextInputEditText) r11.B0.b).getText().toString().trim();
        int r10 = r114.length();
    L31:
        if (r1 >= r10) goto L36;
        int r20 = r114.codePointAt(r1);
        if (Character.isWhitespace(r20) == false) goto L34;
        r1 = r1 + Character.charCount(r20);
        goto L31
    L34:
        r0 = ((TextInputEditText) r11.B0.b).getText().toString().trim();
    L36:
        r11.J0 = r0;
        if (TextUtils.isEmpty(r11.D0) == false) goto L40;
        ((TextInputEditText) r11.B0.f).setError(r11.s(R.string.error_required));
        return;
    L40:
        if (TextUtils.isEmpty(r11.E0) == false) goto L43;
        ((TextInputEditText) r11.B0.h).setError(r11.s(R.string.error_required));
        return;
    L43:
        if (TextUtils.isEmpty(r11.G0) == false) goto L46;
        ((TextInputEditText) r11.B0.g).setError(r11.s(R.string.error_required));
        return;
    L46:
        if (TextUtils.isEmpty(r11.H0) == true) goto L51;
        if (r11.H0.matches("^https?://(.*)") == true) goto L51;
        ((TextInputEditText) r11.B0.c).setError(r11.s(R.string.error_server_prefix));
        return;
    L51:
        if (r11.G0.matches("^https?://(.*)") == true) goto L53;
        ((TextInputEditText) r11.B0.g).setError(r11.s(R.string.error_server_prefix));
        return;
    L53:
        Server r115 = r11.C0.d;
        if (r115 == null) goto L57;
        String r116 = r115.getServerId();
    L56:
        String r21 = r116;
        se2 r117 = r11.C0;
        new Thread(new oa4((na4) r117.c.o, new Server(r21, r11.D0, r11.E0, r11.F0, r11.G0, r11.H0, System.currentTimeMillis(), r11.I0, r11.J0), 1)).start();
        Dialog r118 = r11.w0;
        Objects.requireNonNull(r118);
        r118.dismiss();
        return;
    L57:
        r116 = UUID.randomUUID().toString();
    L27:
        r113 = null;
    L18:
        r111 = null;
        goto L19
    L9:
        Editable r119 = ((TextInputEditText) r2.e).getText();
        Objects.requireNonNull(r119);
        r19 = r119.toString();
        goto L10
    L61:
        if (TextUtils.isEmpty(((TextInputEditText) r11.B0.b).getText()) == false) goto L63;
        KeyChain.choosePrivateKeyAlias(r11.X(), new qa4(r11), null, null, null, null);
        return;
    L63:
        ((TextInputEditText) r11.B0.b).setText(null);
    }
}
