package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a01 extends InputConnectionWrapper {
    public final TextView a;
    public final om0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        om0 om0Var = new om0(21);
        this.a = textView;
        this.b = om0Var;
        if (tz0.c()) {
            tz0 a = tz0.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            pz0 pz0Var = a.e;
            pz0Var.getClass();
            Bundle bundle = editorInfo.extras;
            wv2 wv2Var = (wv2) pz0Var.c.n;
            int a2 = wv2Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? ((ByteBuffer) wv2Var.q).getInt(a2 + wv2Var.n) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return om0.Y(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return om0.Y(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
