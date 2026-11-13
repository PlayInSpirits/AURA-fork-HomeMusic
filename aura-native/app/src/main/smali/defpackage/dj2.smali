.class public final Ldefpackage/dj2;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Ldefpackage/z05;


# direct methods
.method public constructor <init>(Ldefpackage/z05;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/dj2;->a:Ldefpackage/z05;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConnected()V
    .locals 11

    .line 1
    iget-object p0, p0, Ldefpackage/dj2;->a:Ldefpackage/z05;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/gj2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    const-string v3, "MediaBrowserCompat"

    .line 12
    .line 13
    iget-object v4, v0, Ldefpackage/gj2;->d:Ldefpackage/cj2;

    .line 14
    .line 15
    iget-object v5, v0, Ldefpackage/gj2;->b:Landroid/media/browse/MediaBrowser;

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v5}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-static {v6}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    const-string v7, "extra_service_version"

    .line 30
    .line 31
    invoke-virtual {v6, v7, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    const-string v7, "extra_messenger"

    .line 35
    .line 36
    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    new-instance v8, Ldefpackage/xc5;

    .line 43
    .line 44
    iget-object v9, v0, Ldefpackage/gj2;->c:Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {v8, v7, v9}, Ldefpackage/xc5;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    iput-object v8, v0, Ldefpackage/gj2;->f:Ldefpackage/xc5;

    .line 50
    .line 51
    new-instance v7, Landroid/os/Messenger;

    .line 52
    .line 53
    invoke-direct {v7, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 54
    .line 55
    .line 56
    iput-object v7, v0, Ldefpackage/gj2;->g:Landroid/os/Messenger;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    invoke-direct {v9, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v9, v4, Ldefpackage/cj2;->c:Ljava/lang/Object;

    .line 67
    .line 68
    :try_start_1
    iget-object v4, v0, Ldefpackage/gj2;->a:Landroid/content/Context;

    .line 69
    .line 70
    new-instance v9, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v10, "data_package_name"

    .line 76
    .line 77
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v9, v10, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v4, "data_calling_pid"

    .line 85
    .line 86
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    invoke-virtual {v9, v4, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    const-string v4, "data_root_hints"

    .line 94
    .line 95
    iget-object v10, v8, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v10, Landroid/os/Bundle;

    .line 98
    .line 99
    invoke-virtual {v9, v4, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    const/4 v4, 0x6

    .line 103
    invoke-virtual {v8, v4, v9, v7}, Ldefpackage/xc5;->w(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catch_0
    const-string v4, "Remote error registering client messenger."

    .line 108
    .line 109
    invoke-static {v3, v4}, Ldefpackage/l93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    const-string v3, "extra_session_binder"

    .line 113
    .line 114
    invoke-virtual {v6, v3}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    sget v4, Ldefpackage/jr2;->f:I

    .line 119
    .line 120
    if-nez v3, :cond_2

    .line 121
    .line 122
    move-object v4, v2

    .line 123
    goto :goto_1

    .line 124
    :cond_2
    const-string v4, "android.support.v4.media.session.IMediaSession"

    .line 125
    .line 126
    invoke-interface {v3, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-eqz v4, :cond_3

    .line 131
    .line 132
    instance-of v6, v4, Ldefpackage/qu1;

    .line 133
    .line 134
    if-eqz v6, :cond_3

    .line 135
    .line 136
    check-cast v4, Ldefpackage/qu1;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    new-instance v4, Ldefpackage/mu1;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v3, v4, Ldefpackage/mu1;->e:Landroid/os/IBinder;

    .line 145
    .line 146
    :goto_1
    if-eqz v4, :cond_4

    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    new-instance v5, Ldefpackage/pr2;

    .line 153
    .line 154
    invoke-direct {v5, v3, v4}, Ldefpackage/pr2;-><init>(Landroid/media/session/MediaSession$Token;Ldefpackage/qu1;)V

    .line 155
    .line 156
    .line 157
    iput-object v5, v0, Ldefpackage/gj2;->h:Ldefpackage/pr2;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catch_1
    move-exception v0

    .line 161
    const-string v4, "Unexpected IllegalStateException"

    .line 162
    .line 163
    invoke-static {v3, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    :goto_2
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Ldefpackage/im2;

    .line 169
    .line 170
    iget-object v0, p0, Ldefpackage/im2;->j:Ldefpackage/jj2;

    .line 171
    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    iget-object v0, v0, Ldefpackage/jj2;->a:Ldefpackage/gj2;

    .line 175
    .line 176
    iget-object v3, v0, Ldefpackage/gj2;->h:Ldefpackage/pr2;

    .line 177
    .line 178
    if-nez v3, :cond_5

    .line 179
    .line 180
    iget-object v3, v0, Ldefpackage/gj2;->b:Landroid/media/browse/MediaBrowser;

    .line 181
    .line 182
    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    new-instance v4, Ldefpackage/pr2;

    .line 187
    .line 188
    invoke-direct {v4, v3, v2}, Ldefpackage/pr2;-><init>(Landroid/media/session/MediaSession$Token;Ldefpackage/qu1;)V

    .line 189
    .line 190
    .line 191
    iput-object v4, v0, Ldefpackage/gj2;->h:Ldefpackage/pr2;

    .line 192
    .line 193
    :cond_5
    iget-object v0, v0, Ldefpackage/gj2;->h:Ldefpackage/pr2;

    .line 194
    .line 195
    invoke-virtual {p0}, Ldefpackage/im2;->a1()Ldefpackage/sk2;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    new-instance v3, Ldefpackage/ws1;

    .line 200
    .line 201
    const/16 v4, 0xd

    .line 202
    .line 203
    invoke-direct {v3, v4, p0, v0}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v3}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Ldefpackage/im2;->a1()Ldefpackage/sk2;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iget-object v0, v0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 214
    .line 215
    new-instance v2, Ldefpackage/dm2;

    .line 216
    .line 217
    invoke-direct {v2, p0, v1}, Ldefpackage/dm2;-><init>(Ldefpackage/im2;I)V

    .line 218
    .line 219
    .line 220
    const-wide/16 v3, 0x1f4

    .line 221
    .line 222
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 223
    .line 224
    .line 225
    :cond_6
    return-void
.end method

.method public final onConnectionFailed()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dj2;->a:Ldefpackage/z05;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/im2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/im2;->a1()Ldefpackage/sk2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ldefpackage/sk2;->Y0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onConnectionSuspended()V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/dj2;->a:Ldefpackage/z05;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/gj2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, v0, Ldefpackage/gj2;->f:Ldefpackage/xc5;

    .line 11
    .line 12
    iput-object v1, v0, Ldefpackage/gj2;->g:Landroid/os/Messenger;

    .line 13
    .line 14
    iput-object v1, v0, Ldefpackage/gj2;->h:Ldefpackage/pr2;

    .line 15
    .line 16
    iget-object v0, v0, Ldefpackage/gj2;->d:Ldefpackage/cj2;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v2, v0, Ldefpackage/cj2;->c:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ldefpackage/im2;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/im2;->a1()Ldefpackage/sk2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ldefpackage/sk2;->Y0()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
