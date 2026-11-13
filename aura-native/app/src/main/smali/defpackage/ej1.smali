.class public final Ldefpackage/ej1;
.super Ldefpackage/fj1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Ljava/lang/Object;

.field public static final c:Ldefpackage/ej1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/ej1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/ej1;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/ej1;->c:Ldefpackage/ej1;

    .line 14
    .line 15
    return-void
.end method

.method public static d(Landroid/app/Activity;ILdefpackage/sf5;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x1010309

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "Theme.Dialog.Alert"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 40
    .line 41
    const/4 v1, 0x5

    .line 42
    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    if-nez v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p0, p1}, Ldefpackage/lf5;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 57
    .line 58
    .line 59
    if-eqz p3, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-eq p1, v4, :cond_6

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    if-eq p1, v1, :cond_5

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    if-eq p1, v1, :cond_4

    .line 75
    .line 76
    const v1, 0x104000a

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    const v1, 0x7f1300b0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    const v1, 0x7f1300ba

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const v1, 0x7f1300b3

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :goto_0
    if-eqz p3, :cond_7

    .line 108
    .line 109
    invoke-virtual {v0, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 110
    .line 111
    .line 112
    :cond_7
    invoke-static {p0, p1}, Ldefpackage/lf5;->c(Landroid/content/Context;I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 119
    .line 120
    .line 121
    :cond_8
    const-string p0, "Creating dialog for Google Play services availability issue. ConnectionResult="

    .line 122
    .line 123
    invoke-static {p1, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string p2, "GoogleApiAvailability"

    .line 133
    .line 134
    invoke-static {p2, p0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method

.method public static e(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 3

    .line 1
    const-string v0, "Cannot display null dialog"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    instance-of v2, p0, Ldefpackage/nc1;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    check-cast p0, Ldefpackage/nc1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v2, Ldefpackage/ko4;

    .line 15
    .line 16
    invoke-direct {v2}, Ldefpackage/ko4;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v2, Ldefpackage/ko4;->B0:Landroid/app/Dialog;

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    iput-object p3, v2, Ldefpackage/ko4;->C0:Landroid/content/DialogInterface$OnCancelListener;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v2, p0, p2}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v2, Ldefpackage/d21;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/app/DialogFragment;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Ldefpackage/ji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v2, Ldefpackage/d21;->n:Landroid/app/Dialog;

    .line 57
    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    iput-object p3, v2, Ldefpackage/d21;->o:Landroid/content/DialogInterface$OnCancelListener;

    .line 61
    .line 62
    :cond_2
    invoke-virtual {v2, p0, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/api/GoogleApiActivity;ILcom/google/android/gms/common/api/GoogleApiActivity;)V
    .locals 2

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-super {p0, p2, p1, v0}, Ldefpackage/fj1;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ldefpackage/sf5;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/sf5;-><init>(Landroid/content/Intent;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, v0, p3}, Ldefpackage/ej1;->d(Landroid/app/Activity;ILdefpackage/sf5;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p2, "GooglePlayServicesErrorDialog"

    .line 21
    .line 22
    invoke-static {p1, p0, p2, p3}, Ldefpackage/ej1;->e(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final f(Landroid/content/Context;ILandroid/app/PendingIntent;)V
    .locals 9

    .line 1
    const-string v0, "GMS core API Availability. ConnectionResult="

    .line 2
    .line 3
    const-string v1, ", tag=null"

    .line 4
    .line 5
    invoke-static {p2, v0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "GoogleApiAvailability"

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x12

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p2, v0, :cond_0

    .line 23
    .line 24
    new-instance p2, Ldefpackage/uf5;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Ldefpackage/uf5;-><init>(Ldefpackage/ej1;Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    const-wide/32 p0, 0x1d4c0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, p0, p1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 p0, 0x6

    .line 37
    if-nez p3, :cond_2

    .line 38
    .line 39
    if-ne p2, p0, :cond_1

    .line 40
    .line 41
    const-string p0, "GoogleApiAvailability"

    .line 42
    .line 43
    const-string p1, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."

    .line 44
    .line 45
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    if-ne p2, p0, :cond_3

    .line 50
    .line 51
    const-string v0, "common_google_play_services_resolution_required_title"

    .line 52
    .line 53
    invoke-static {p1, v0}, Ldefpackage/lf5;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {p1, p2}, Ldefpackage/lf5;->c(Landroid/content/Context;I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_0
    const v2, 0x7f1300b7

    .line 63
    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_4
    if-eq p2, p0, :cond_6

    .line 76
    .line 77
    const/16 p0, 0x13

    .line 78
    .line 79
    if-ne p2, p0, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-static {p1, p2}, Ldefpackage/lf5;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    goto :goto_2

    .line 87
    :cond_6
    :goto_1
    invoke-static {p1}, Ldefpackage/lf5;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string v3, "common_google_play_services_resolution_required_text"

    .line 92
    .line 93
    invoke-static {p1, v3, p0}, Ldefpackage/lf5;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "notification"

    .line 102
    .line 103
    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v4}, Ldefpackage/ji2;->m(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    check-cast v4, Landroid/app/NotificationManager;

    .line 111
    .line 112
    new-instance v5, Ldefpackage/s63;

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    invoke-direct {v5, p1, v6}, Ldefpackage/s63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-boolean v1, v5, Ldefpackage/s63;->p:Z

    .line 119
    .line 120
    const/16 v7, 0x10

    .line 121
    .line 122
    invoke-virtual {v5, v7, v1}, Ldefpackage/s63;->c(IZ)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, v5, Ldefpackage/s63;->e:Ljava/lang/CharSequence;

    .line 130
    .line 131
    new-instance v0, Ldefpackage/r63;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-static {p0}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    iput-object v7, v0, Ldefpackage/r63;->b:Ljava/lang/CharSequence;

    .line 141
    .line 142
    invoke-virtual {v5, v0}, Ldefpackage/s63;->e(Ldefpackage/rp;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sget-object v7, Ldefpackage/kb4;->e:Ljava/lang/Boolean;

    .line 150
    .line 151
    if-nez v7, :cond_7

    .line 152
    .line 153
    const-string v7, "android.hardware.type.watch"

    .line 154
    .line 155
    invoke-virtual {v0, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sput-object v0, Ldefpackage/kb4;->e:Ljava/lang/Boolean;

    .line 164
    .line 165
    :cond_7
    sget-object v0, Ldefpackage/kb4;->e:Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/4 v7, 0x2

    .line 172
    if-eqz v0, :cond_9

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 179
    .line 180
    iget-object v0, v5, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 181
    .line 182
    iput p0, v0, Landroid/app/Notification;->icon:I

    .line 183
    .line 184
    iput v7, v5, Ldefpackage/s63;->i:I

    .line 185
    .line 186
    invoke-static {p1}, Ldefpackage/kb4;->J(Landroid/content/Context;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_8

    .line 191
    .line 192
    const p0, 0x7f1300bf

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    iget-object v0, v5, Ldefpackage/s63;->b:Ljava/util/ArrayList;

    .line 200
    .line 201
    new-instance v2, Ldefpackage/q63;

    .line 202
    .line 203
    const v3, 0x7f080091

    .line 204
    .line 205
    .line 206
    const-string v8, ""

    .line 207
    .line 208
    invoke-static {v6, v8, v3}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-direct {v2, v3, p0, p3}, Ldefpackage/q63;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    iput-object p3, v5, Ldefpackage/s63;->g:Landroid/app/PendingIntent;

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_9
    const v0, 0x108008a

    .line 223
    .line 224
    .line 225
    iget-object v6, v5, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 226
    .line 227
    iput v0, v6, Landroid/app/Notification;->icon:I

    .line 228
    .line 229
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v2, v5, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 234
    .line 235
    invoke-static {v0}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iput-object v0, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 240
    .line 241
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    iget-object v0, v5, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 246
    .line 247
    iput-wide v2, v0, Landroid/app/Notification;->when:J

    .line 248
    .line 249
    iput-object p3, v5, Ldefpackage/s63;->g:Landroid/app/PendingIntent;

    .line 250
    .line 251
    invoke-static {p0}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iput-object p0, v5, Ldefpackage/s63;->f:Ljava/lang/CharSequence;

    .line 256
    .line 257
    :goto_3
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 258
    .line 259
    const/16 p3, 0x1a

    .line 260
    .line 261
    if-lt p0, p3, :cond_d

    .line 262
    .line 263
    if-lt p0, p3, :cond_c

    .line 264
    .line 265
    sget-object p0, Ldefpackage/ej1;->b:Ljava/lang/Object;

    .line 266
    .line 267
    monitor-enter p0

    .line 268
    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    const-string p0, "com.google.android.gms.availability"

    .line 270
    .line 271
    invoke-static {v4}, Ldefpackage/gm0;->b(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const v0, 0x7f1300b6

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    if-nez p3, :cond_a

    .line 287
    .line 288
    invoke-static {p1}, Ldefpackage/gm0;->c(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {v4, p1}, Ldefpackage/gm0;->q(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 293
    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_a
    invoke-static {p3}, Ldefpackage/gm0;->k(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-nez v0, :cond_b

    .line 305
    .line 306
    invoke-static {p3, p1}, Ldefpackage/gm0;->p(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v4, p3}, Ldefpackage/gm0;->q(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 310
    .line 311
    .line 312
    :cond_b
    :goto_4
    iput-object p0, v5, Ldefpackage/s63;->s:Ljava/lang/String;

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :catchall_0
    move-exception p1

    .line 316
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 317
    throw p1

    .line 318
    :cond_c
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_d
    :goto_5
    invoke-virtual {v5}, Ldefpackage/s63;->a()Landroid/app/Notification;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    if-eq p2, v1, :cond_e

    .line 327
    .line 328
    if-eq p2, v7, :cond_e

    .line 329
    .line 330
    const/4 p1, 0x3

    .line 331
    if-eq p2, p1, :cond_e

    .line 332
    .line 333
    const p1, 0x9b6d

    .line 334
    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_e
    sget-object p1, Ldefpackage/lj1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 338
    .line 339
    const/4 p2, 0x0

    .line 340
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 341
    .line 342
    .line 343
    const/16 p1, 0x28c4

    .line 344
    .line 345
    :goto_6
    invoke-virtual {v4, p1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public final g(Landroid/app/Activity;Ldefpackage/x92;ILandroid/content/DialogInterface$OnCancelListener;)V
    .locals 2

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-super {p0, p3, p1, v0}, Ldefpackage/fj1;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ldefpackage/sf5;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, p2, v1}, Ldefpackage/sf5;-><init>(Landroid/content/Intent;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p3, v0, p4}, Ldefpackage/ej1;->d(Landroid/app/Activity;ILdefpackage/sf5;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p2, "GooglePlayServicesErrorDialog"

    .line 21
    .line 22
    invoke-static {p1, p0, p2, p4}, Ldefpackage/ej1;->e(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
