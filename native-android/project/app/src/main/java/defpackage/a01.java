package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 extends InputConnectionWrapper {
    public final TextView a;
    public final om0 b;

    public a01(EditorInfo r3, InputConnection r4, TextView r5) {
        om0 r0 = new om0(21);
        super(r4, false);
        this.a = r5;
        this.b = r0;
        if (tz0.c() == false) goto L17;
        tz0 r2 = tz0.a();
        if (r2.b() != 1) goto L18;
        if (r3 != null) goto L9;
        return;
    L9:
        if (r3.extras != null) goto L11;
        r3.extras = new Bundle();
    L11:
        pz0 r6 = r2.e;
        r6.getClass();
        Bundle r7 = r3.extras;
        wv2 r8 = (wv2) r6.c.n;
        int r9 = r8.a(4);
        if (r9 == 0) goto L14;
        int r10 = ((ByteBuffer) r8.q).getInt(r9 + r8.n);
    L15:
        r7.putInt("android.support.text.emoji.emojiCompat_metadataVersion", r10);
        r3.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        return;
    L14:
        r10 = 0;
        goto L15
    L18:
        return;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
        Editable r0 = this.a.getEditableText();
        this.b.getClass();
        if (om0.Y(this, r0, r3, r4, false) == false) goto L5;
        return true;
    L5:
        if (super.deleteSurroundingText(r3, r4) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
        Editable r0 = this.a.getEditableText();
        this.b.getClass();
        if (om0.Y(this, r0, r3, r4, true) == false) goto L5;
    L9:
        return true;
    L5:
        if (super.deleteSurroundingTextInCodePoints(r3, r4) == true) goto L9;
        return false;
    }
}
