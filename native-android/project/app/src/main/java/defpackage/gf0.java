package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gf0 extends kc1 {
    public Button l0;
    public Button m0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_crash_export, viewGroup, false);
        this.l0 = (Button) viewInflate.findViewById(R.id.crashExportButtonCopy);
        this.m0 = (Button) viewInflate.findViewById(R.id.crashExportButtonShare);
        return viewInflate;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        final String strO = b11.o(bu.m(Z()), "\n\n", ((CrashActivity) e()).N);
        final int i = 0;
        this.l0.setOnClickListener(new View.OnClickListener(this) { // from class: ff0
            public final /* synthetic */ gf0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                String str = strO;
                gf0 gf0Var = this.o;
                switch (i2) {
                    case 0:
                        ((ClipboardManager) gf0Var.Z().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("SimpleText", str));
                        Toast.makeText(gf0Var.Z(), R.string.ca_export_toast_log_copied_to_clipboard, 0).show();
                        break;
                    default:
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", str);
                        gf0Var.g0(Intent.createChooser(intent, "Share via"));
                        break;
                }
            }
        });
        final int i2 = 1;
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: ff0
            public final /* synthetic */ gf0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                String str = strO;
                gf0 gf0Var = this.o;
                switch (i3) {
                    case 0:
                        ((ClipboardManager) gf0Var.Z().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("SimpleText", str));
                        Toast.makeText(gf0Var.Z(), R.string.ca_export_toast_log_copied_to_clipboard, 0).show();
                        break;
                    default:
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", str);
                        gf0Var.g0(Intent.createChooser(intent, "Share via"));
                        break;
                }
            }
        });
    }
}
