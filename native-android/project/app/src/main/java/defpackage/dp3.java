package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dp3 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference n;

    public dp3(Preference preference) {
        this.n = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.n;
        CharSequence charSequenceF = preference.f();
        if (!preference.Q || TextUtils.isEmpty(charSequenceF)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceF);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.n;
        Context context = preference.n;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence charSequenceF = preference.f();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceF));
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceF), 0).show();
        return true;
    }
}
