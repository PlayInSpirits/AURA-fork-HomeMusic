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

    public dp3(Preference r1) {
        this.n = r1;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu r1, View r2, ContextMenu.ContextMenuInfo r3) {
        Preference r4 = this.n;
        CharSequence r5 = r4.f();
        if (r4.Q == true) goto L5;
        return;
    L5:
        if (TextUtils.isEmpty(r5) == true) goto L10;
        r1.setHeaderTitle(r5);
        r1.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        return;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r3) {
        Preference r2 = this.n;
        Context r4 = r2.n;
        ClipboardManager r0 = (ClipboardManager) r4.getSystemService("clipboard");
        CharSequence r5 = r2.f();
        r0.setPrimaryClip(ClipData.newPlainText("Preference", r5));
        Toast.makeText(r4, r4.getString(R.string.preference_copied, new Object[]{r5}), 0).show();
        return true;
    }
}
