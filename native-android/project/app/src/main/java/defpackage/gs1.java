package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends WebChromeClient {
    public final /* synthetic */ HubFragment a;

    public gs1(HubFragment r1) {
        this.a = r1;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView r10, ValueCallback r11, WebChromeClient.FileChooserParams r12) {
        r10.getClass();
        r11.getClass();
        r12.getClass();
        HubFragment r9 = this.a;
        ValueCallback r13 = r9.r0;
        if (r13 == null) goto L5;
        r13.onReceiveValue(null);
    L5:
        r9.r0 = r11;
        Intent r14 = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE");
        r14.getClass();
        String[] r1 = r12.getAcceptTypes();
        r1.getClass();
        ArrayList r2 = new ArrayList();
        int r3 = r1.length;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L9;
        String r7 = r1[r5];
        r7.getClass();
        v40.n0(qm4.D0(r7, new char[]{','}), r2);
        r5 = r5 + 1;
        goto L7
    L9:
        ArrayList r4 = new ArrayList(r40.k0(r2, 10));
        int r6 = r2.size();
        int r8 = 0;
    L10:
        if (r8 >= r6) goto L12;
        Object r15 = r2.get(r8);
        r8 = r8 + 1;
        String r16 = qm4.K0((String) r15).toString().toLowerCase(Locale.ROOT);
        r16.getClass();
        r4.add(r16);
        goto L10
    L12:
        ArrayList r17 = new ArrayList();
        int r18 = r4.size();
        int r19 = 0;
    L13:
        if (r19 >= r18) goto L17;
        Object r20 = r4.get(r19);
        r19 = r19 + 1;
        if (((String) r20).length() <= 0) goto L13;
        r17.add(r20);
        goto L13
    L17:
        ArrayList r21 = new ArrayList();
        int r22 = r17.size();
        int r23 = 0;
    L18:
        if (r23 >= r22) goto L24;
        Object r24 = r17.get(r23);
        r23 = r23 + 1;
        String r25 = (String) r24;
        if (xm4.k0(r25, ".", false) == false) goto L22;
        r25 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r25.substring(1));
    L22:
        if (r25 == null) goto L18;
        r21.add(r25);
        goto L18
    L24:
        List r26 = q40.t0(r21);
        if (r26.isEmpty() == false) goto L28;
        r14.setType("*/*");
    L32:
        if (r12.getMode() != 1) goto L38;
        r14.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
    L38:
        r9.s0.a(Intent.createChooser(r14, r9.s(R.string.homemusic_pick_files)));     // Catch: ActivityNotFoundException -> L36
        return true;
    L36:
        r9.r0 = null;
        r11.onReceiveValue(null);
        return false;
    L28:
        if (r26.size() != 1) goto L30;
        r14.setType((String) r26.get(0));
        goto L32
    L30:
        r14.setType("*/*");
        r14.putExtra("android.intent.extra.MIME_TYPES", (String[]) r26.toArray(new String[0])).getClass();
        goto L32
    }
}
