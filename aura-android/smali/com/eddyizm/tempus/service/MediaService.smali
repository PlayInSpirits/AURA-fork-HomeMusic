.class public final Lcom/eddyizm/tempus/service/MediaService;
.super Landroidx/media3/session/MediaLibraryService;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lao2;


# instance fields
.field public A:Lwo0;

.field public final B:Landroid/os/Handler;

.field public C:Z

.field public volatile D:Z

.field public E:J

.field public final F:Lg5;

.field public final G:Ljava/util/concurrent/ScheduledExecutorService;

.field public H:Z

.field public I:Ljava/util/concurrent/ScheduledFuture;

.field public final J:Lsp;

.field public final K:Lxp;

.field public final L:Lii;

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public O:J

.field public final P:J

.field public u:Li41;

.field public v:Lkn2;

.field public w:Ls25;

.field public x:Lq25;

.field public y:Lns3;

.field public z:Lwp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/session/MediaLibraryService;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lg5;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, v1, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->F:Lg5;

    .line 22
    .line 23
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->G:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    new-instance v0, Lsp;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p0, v1}, Lsp;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->J:Lsp;

    .line 39
    .line 40
    new-instance v0, Lxp;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lxp;-><init>(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->K:Lxp;

    .line 46
    .line 47
    new-instance v0, Lii;

    .line 48
    .line 49
    invoke-direct {v0}, Lii;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->L:Lii;

    .line 53
    .line 54
    const-wide/16 v0, 0x1388

    .line 55
    .line 56
    iput-wide v0, p0, Lcom/eddyizm/tempus/service/MediaService;->P:J

    .line 57
    .line 58
    return-void
.end method

.method public static final m(Lcom/eddyizm/tempus/service/MediaService;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, v0, Lgn2;->d:Ldo2;

    .line 20
    .line 21
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v1, "type"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    const-string v1, "radio"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-boolean v0, p0, Lcom/eddyizm/tempus/service/MediaService;->H:Z

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->n()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->G:Ljava/util/concurrent/ScheduledExecutorService;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/eddyizm/tempus/service/MediaService;->J:Lsp;

    .line 53
    .line 54
    const-wide/16 v5, 0x1e

    .line 55
    .line 56
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    .line 58
    const-wide/16 v3, 0x1e

    .line 59
    .line 60
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->I:Ljava/util/concurrent/ScheduledFuture;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Lcom/eddyizm/tempus/service/MediaService;->H:Z

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a(III)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    if-lez p2, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lyp;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2, p3}, Lyp;-><init>(III)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->L:Lii;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lii;->addLast(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->u()V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public final b()Lqi3;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/eddyizm/tempus/service/MediaService;->D:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final h(Lfr2;)Lkn2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final i(Lfr2;)Lkn2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final n()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    iget-object v2, v1, Lgn2;->d:Ldo2;

    .line 21
    .line 22
    iget-object v3, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    const-string v5, "type"

    .line 28
    .line 29
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v5, v4

    .line 35
    :goto_0
    const-string v6, "radio"

    .line 36
    .line 37
    invoke-static {v5, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_2
    iget-object v5, v2, Ldo2;->b:Ljava/lang/CharSequence;

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-static {v5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_10

    .line 54
    .line 55
    :cond_3
    iget-object v2, v2, Ldo2;->a:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_10

    .line 64
    .line 65
    :cond_4
    if-eqz v3, :cond_5

    .line 66
    .line 67
    const-string v2, "radioArtist"

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_10

    .line 80
    .line 81
    :cond_5
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const-string v2, "radioTitle"

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_10

    .line 96
    .line 97
    :cond_6
    if-eqz v3, :cond_7

    .line 98
    .line 99
    const-string v2, "uri"

    .line 100
    .line 101
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-nez v2, :cond_9

    .line 106
    .line 107
    :cond_7
    iget-object v1, v1, Lgn2;->f:Lcn2;

    .line 108
    .line 109
    iget-object v1, v1, Lcn2;->a:Landroid/net/Uri;

    .line 110
    .line 111
    if-eqz v1, :cond_8

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    goto :goto_1

    .line 118
    :cond_8
    move-object v2, v4

    .line 119
    :cond_9
    :goto_1
    if-eqz v2, :cond_10

    .line 120
    .line 121
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_a

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_a
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 129
    .line 130
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    instance-of v2, v1, Ljava/net/HttpURLConnection;

    .line 138
    .line 139
    if-eqz v2, :cond_b

    .line 140
    .line 141
    move-object v4, v1

    .line 142
    check-cast v4, Ljava/net/HttpURLConnection;

    .line 143
    .line 144
    :cond_b
    if-nez v4, :cond_c

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_c
    const-string v1, "HEAD"

    .line 148
    .line 149
    invoke-virtual {v4, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v1, "Icy-MetaData"

    .line 153
    .line 154
    const-string v2, "1"

    .line 155
    .line 156
    invoke-virtual {v4, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v1, "User-Agent"

    .line 160
    .line 161
    const-string v2, "Tempus/1.0"

    .line 162
    .line 163
    invoke-virtual {v4, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 v1, 0xbb8

    .line 167
    .line 168
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/16 v2, 0x190

    .line 182
    .line 183
    if-lt v1, v2, :cond_d

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_d
    const-string v1, "icy-name"

    .line 190
    .line 191
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-nez v1, :cond_e

    .line 196
    .line 197
    const-string v1, "StreamTitle"

    .line 198
    .line 199
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-nez v1, :cond_e

    .line 204
    .line 205
    const-string v1, "stream-title"

    .line 206
    .line 207
    invoke-virtual {v4, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :cond_e
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 212
    .line 213
    .line 214
    if-eqz v1, :cond_10

    .line 215
    .line 216
    invoke-static {v1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_f

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_f
    invoke-virtual {p0, v1, v0}, Lcom/eddyizm/tempus/service/MediaService;->r(Ljava/lang/String;Lqi3;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    .line 225
    .line 226
    :catch_0
    :cond_10
    :goto_2
    return-void
.end method

.method public final o()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/service/MediaService;->u:Li41;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "exoplayer"

    .line 7
    .line 8
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v1, "com.eddyizm.tempus.service.BIND_EQUALIZER"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lcom/eddyizm/tempus/service/MediaService;->K:Lxp;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    invoke-super {p0, p1}, Landroidx/media3/session/MediaLibraryService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final onCreate()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super {v1}, Landroidx/media3/session/MediaLibraryService;->onCreate()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lo31;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lo31;-><init>(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lzp;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Lpm0;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v11, 0x1

    .line 17
    iput v11, v2, Lpm0;->c:I

    .line 18
    .line 19
    iget-boolean v3, v0, Lo31;->D:Z

    .line 20
    .line 21
    xor-int/2addr v3, v11

    .line 22
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lsl;

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v3, v4, v2}, Lsl;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, v0, Lo31;->c:Lgo4;

    .line 32
    .line 33
    new-instance v2, Lmy0;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Lmy0;-><init>(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v3, v0, Lo31;->D:Z

    .line 39
    .line 40
    xor-int/2addr v3, v11

    .line 41
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Lsl;

    .line 45
    .line 46
    const/4 v12, 0x3

    .line 47
    invoke-direct {v3, v12, v2}, Lsl;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, v0, Lo31;->d:Lgo4;

    .line 51
    .line 52
    sget-object v2, Lil;->i:Lil;

    .line 53
    .line 54
    iget-boolean v3, v0, Lo31;->D:Z

    .line 55
    .line 56
    xor-int/2addr v3, v11

    .line 57
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 58
    .line 59
    .line 60
    iput-object v2, v0, Lo31;->j:Lil;

    .line 61
    .line 62
    iput-boolean v11, v0, Lo31;->k:Z

    .line 63
    .line 64
    iget-boolean v2, v0, Lo31;->D:Z

    .line 65
    .line 66
    xor-int/2addr v2, v11

    .line 67
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 68
    .line 69
    .line 70
    iput-boolean v11, v0, Lo31;->n:Z

    .line 71
    .line 72
    iget-boolean v2, v0, Lo31;->D:Z

    .line 73
    .line 74
    xor-int/2addr v2, v11

    .line 75
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 76
    .line 77
    .line 78
    const/4 v13, 0x2

    .line 79
    iput v13, v0, Lo31;->l:I

    .line 80
    .line 81
    iput-boolean v11, v0, Lo31;->m:Z

    .line 82
    .line 83
    new-instance v2, Los3;

    .line 84
    .line 85
    new-instance v3, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    sget-object v4, Lik3;->d:Lik3;

    .line 91
    .line 92
    iget-object v4, v4, Lik3;->a:Ljava/lang/String;

    .line 93
    .line 94
    const/high16 v5, 0x8980000

    .line 95
    .line 96
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const/16 v4, 0x3e8

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    const-string v6, "bufferForPlaybackMs"

    .line 107
    .line 108
    const-string v7, "0"

    .line 109
    .line 110
    invoke-static {v4, v5, v6, v7}, Lwl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const/16 v8, 0x7d0

    .line 114
    .line 115
    const-string v9, "bufferForPlaybackAfterRebufferMs"

    .line 116
    .line 117
    invoke-static {v8, v5, v9, v7}, Lwl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const v7, 0x124f80

    .line 121
    .line 122
    .line 123
    const-string v10, "minBufferMs"

    .line 124
    .line 125
    invoke-static {v7, v4, v10, v6}, Lwl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v7, v8, v10, v9}, Lwl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v4, "maxBufferMs"

    .line 132
    .line 133
    const v6, 0x124f80

    .line 134
    .line 135
    .line 136
    invoke-static {v6, v7, v4, v10}, Lwl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v15, Lgj0;

    .line 140
    .line 141
    invoke-direct {v15}, Lgj0;-><init>()V

    .line 142
    .line 143
    .line 144
    new-instance v14, Lwl0;

    .line 145
    .line 146
    move/from16 v17, v7

    .line 147
    .line 148
    move/from16 v19, v6

    .line 149
    .line 150
    move-object/from16 v22, v3

    .line 151
    .line 152
    move/from16 v21, v5

    .line 153
    .line 154
    move/from16 v18, v6

    .line 155
    .line 156
    move/from16 v16, v7

    .line 157
    .line 158
    move/from16 v20, v8

    .line 159
    .line 160
    invoke-direct/range {v14 .. v22}, Lwl0;-><init>(Lgj0;IIIIIZLjava/util/Map;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v2, v14}, Los3;-><init>(Lwl0;)V

    .line 164
    .line 165
    .line 166
    iget-boolean v3, v0, Lo31;->D:Z

    .line 167
    .line 168
    xor-int/2addr v3, v11

    .line 169
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 170
    .line 171
    .line 172
    new-instance v3, Lsl;

    .line 173
    .line 174
    invoke-direct {v3, v13, v2}, Lsl;-><init>(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iput-object v3, v0, Lo31;->f:Lgo4;

    .line 178
    .line 179
    iget-boolean v2, v0, Lo31;->D:Z

    .line 180
    .line 181
    xor-int/2addr v2, v11

    .line 182
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 183
    .line 184
    .line 185
    iput-boolean v11, v0, Lo31;->D:Z

    .line 186
    .line 187
    new-instance v2, Li41;

    .line 188
    .line 189
    invoke-direct {v2, v0}, Li41;-><init>(Lo31;)V

    .line 190
    .line 191
    .line 192
    iput-object v2, v1, Lcom/eddyizm/tempus/service/MediaService;->u:Li41;

    .line 193
    .line 194
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v2, "shuffle_mode"

    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    invoke-static {v2, v14}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    check-cast v0, Li41;

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Li41;->s(Z)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const-string v3, "repeat_mode"

    .line 226
    .line 227
    invoke-interface {v2, v3, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    check-cast v0, Li41;

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Li41;->p0(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const-string v3, "playback_speed"

    .line 252
    .line 253
    const/high16 v4, 0x3f800000    # 1.0f

    .line 254
    .line 255
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const-string v3, "playback_speed_pitch"

    .line 260
    .line 261
    invoke-static {v3, v14}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_1

    .line 266
    .line 267
    const-string v3, "playback_speed_manual_pitch"

    .line 268
    .line 269
    invoke-static {v3, v14}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_0

    .line 274
    .line 275
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    const-string v5, "playback_speed_manual_pitch_value"

    .line 287
    .line 288
    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    move v4, v3

    .line 293
    goto :goto_0

    .line 294
    :cond_0
    move v4, v2

    .line 295
    :cond_1
    :goto_0
    new-instance v3, Lqh3;

    .line 296
    .line 297
    invoke-direct {v3, v2, v4}, Lqh3;-><init>(FF)V

    .line 298
    .line 299
    .line 300
    check-cast v0, Li41;

    .line 301
    .line 302
    invoke-virtual {v0, v3}, Li41;->d(Lqh3;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    const-string v0, "BaseMediaService"

    .line 310
    .line 311
    const-string v3, "initializeMediaLibrarySession"

    .line 312
    .line 313
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    new-instance v0, Landroid/content/Intent;

    .line 317
    .line 318
    const-class v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 319
    .line 320
    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 321
    .line 322
    .line 323
    const-string v3, "com.eddyizm.tempus.action.OPEN_NOW_PLAYING"

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    .line 327
    .line 328
    const/high16 v3, 0x24000000

    .line 329
    .line 330
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 331
    .line 332
    .line 333
    const/high16 v3, 0xc000000

    .line 334
    .line 335
    invoke-static {v1, v14, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    new-instance v0, Lns3;

    .line 340
    .line 341
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-direct {v0, v4}, Lns3;-><init>(Landroid/content/Context;)V

    .line 349
    .line 350
    .line 351
    iput-object v0, v1, Lcom/eddyizm/tempus/service/MediaService;->y:Lns3;

    .line 352
    .line 353
    new-instance v7, Lpq;

    .line 354
    .line 355
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-direct {v7, v0, v1}, Lpq;-><init>(Landroid/content/Context;Lcom/eddyizm/tempus/service/MediaService;)V

    .line 363
    .line 364
    .line 365
    new-instance v8, Landroid/os/Bundle;

    .line 366
    .line 367
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 368
    .line 369
    .line 370
    new-instance v9, Landroid/os/Bundle;

    .line 371
    .line 372
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 373
    .line 374
    .line 375
    sget-object v0, Lyw1;->o:Lvw1;

    .line 376
    .line 377
    sget-object v4, Lgy3;->r:Lgy3;

    .line 378
    .line 379
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 380
    .line 381
    const/16 v5, 0x1f

    .line 382
    .line 383
    if-lt v0, v5, :cond_2

    .line 384
    .line 385
    invoke-static {v3}, Lgo2;->v(Landroid/app/PendingIntent;)Z

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    invoke-static {v5}, Lrr2;->l(Z)V

    .line 390
    .line 391
    .line 392
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object v5, v1, Lcom/eddyizm/tempus/service/MediaService;->y:Lns3;

    .line 396
    .line 397
    const/4 v15, 0x0

    .line 398
    if-eqz v5, :cond_9

    .line 399
    .line 400
    sget-object v6, Lkn2;->b:Ljava/lang/Object;

    .line 401
    .line 402
    sget-object v6, Ltn2;->I:Lgo4;

    .line 403
    .line 404
    invoke-interface {v6}, Lgo4;->get()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    check-cast v6, Ljava/lang/Integer;

    .line 409
    .line 410
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    const/16 v10, 0x1b

    .line 415
    .line 416
    if-ge v0, v10, :cond_3

    .line 417
    .line 418
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const/high16 v10, 0x43a00000    # 320.0f

    .line 427
    .line 428
    invoke-static {v11, v10, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    float-to-int v0, v0

    .line 433
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    :cond_3
    new-instance v10, Lx7;

    .line 438
    .line 439
    const/16 v0, 0xc

    .line 440
    .line 441
    invoke-direct {v10, v6, v0, v5}, Lx7;-><init>(IILjava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    move v5, v0

    .line 445
    new-instance v0, Lkn2;

    .line 446
    .line 447
    move v6, v5

    .line 448
    move-object v5, v4

    .line 449
    move/from16 v16, v6

    .line 450
    .line 451
    move-object v6, v4

    .line 452
    move/from16 v12, v16

    .line 453
    .line 454
    invoke-direct/range {v0 .. v10}, Lkn2;-><init>(Lcom/eddyizm/tempus/service/MediaService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lyw1;Lyw1;Lyw1;Lpq;Landroid/os/Bundle;Landroid/os/Bundle;Lx7;)V

    .line 455
    .line 456
    .line 457
    iput-object v0, v1, Lcom/eddyizm/tempus/service/MediaService;->v:Lkn2;

    .line 458
    .line 459
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/service/MediaService;->q(Lqi3;)V

    .line 464
    .line 465
    .line 466
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    new-instance v2, Lzh0;

    .line 471
    .line 472
    const/16 v3, 0x9

    .line 473
    .line 474
    invoke-direct {v2, v3, v1}, Lzh0;-><init>(ILjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    iput-object v2, v0, Lyf4;->i:Lzh0;

    .line 478
    .line 479
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iget-boolean v0, v0, Lyf4;->f:Z

    .line 484
    .line 485
    if-eqz v0, :cond_4

    .line 486
    .line 487
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    iget-boolean v0, v0, Lyf4;->g:Z

    .line 492
    .line 493
    if-eqz v0, :cond_4

    .line 494
    .line 495
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    invoke-virtual {v0}, Lyf4;->f()V

    .line 508
    .line 509
    .line 510
    iput-boolean v14, v0, Lyf4;->c:Z

    .line 511
    .line 512
    new-instance v3, Lua4;

    .line 513
    .line 514
    invoke-direct {v3, v0, v2}, Lua4;-><init>(Lyf4;Lqi3;)V

    .line 515
    .line 516
    .line 517
    iput-object v3, v0, Lyf4;->d:Lua4;

    .line 518
    .line 519
    iget-object v0, v0, Lyf4;->a:Landroid/os/Handler;

    .line 520
    .line 521
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 522
    .line 523
    .line 524
    :cond_4
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v1, v15, v0}, Lcom/eddyizm/tempus/service/MediaService;->s(Lqi3;Lqi3;)V

    .line 529
    .line 530
    .line 531
    invoke-static {}, Lud3;->C()I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-eq v0, v11, :cond_6

    .line 536
    .line 537
    if-eq v0, v13, :cond_5

    .line 538
    .line 539
    new-instance v0, Li80;

    .line 540
    .line 541
    const/16 v2, 0x17

    .line 542
    .line 543
    invoke-direct {v0, v2}, Li80;-><init>(I)V

    .line 544
    .line 545
    .line 546
    goto :goto_1

    .line 547
    :cond_5
    new-instance v0, Ly41;

    .line 548
    .line 549
    invoke-direct {v0, v11}, Ly41;-><init>(I)V

    .line 550
    .line 551
    .line 552
    goto :goto_1

    .line 553
    :cond_6
    new-instance v0, Ld34;

    .line 554
    .line 555
    invoke-direct {v0, v12, v14}, Ld34;-><init>(IZ)V

    .line 556
    .line 557
    .line 558
    :goto_1
    new-instance v2, Lwo0;

    .line 559
    .line 560
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 568
    .line 569
    .line 570
    iput-object v0, v2, Lwo0;->n:Ljava/lang/Object;

    .line 571
    .line 572
    iput-object v3, v2, Lwo0;->o:Ljava/lang/Object;

    .line 573
    .line 574
    iput-object v2, v1, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 575
    .line 576
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    check-cast v2, Li41;

    .line 581
    .line 582
    invoke-virtual {v2}, Li41;->e1()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-interface {v0, v3, v2}, Lv11;->f(Landroid/content/Context;I)Z

    .line 594
    .line 595
    .line 596
    new-instance v0, Landroid/content/Intent;

    .line 597
    .line 598
    const-string v2, "com.eddyizm.tempus.service.EQUALIZER_UPDATED"

    .line 599
    .line 600
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 604
    .line 605
    .line 606
    new-instance v0, Lwp;

    .line 607
    .line 608
    invoke-direct {v0, v1}, Lwp;-><init>(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 609
    .line 610
    .line 611
    iput-object v0, v1, Lcom/eddyizm/tempus/service/MediaService;->z:Lwp;

    .line 612
    .line 613
    const-class v0, Landroid/net/ConnectivityManager;

    .line 614
    .line 615
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 620
    .line 621
    iget-object v2, v1, Lcom/eddyizm/tempus/service/MediaService;->z:Lwp;

    .line 622
    .line 623
    if-eqz v2, :cond_8

    .line 624
    .line 625
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/service/MediaService;->v(Lqi3;)V

    .line 640
    .line 641
    .line 642
    new-instance v0, Lf25;

    .line 643
    .line 644
    invoke-direct {v0}, Lf25;-><init>()V

    .line 645
    .line 646
    .line 647
    new-instance v2, Ls25;

    .line 648
    .line 649
    invoke-direct {v2, v1, v0}, Ls25;-><init>(Lcom/eddyizm/tempus/service/MediaService;Lf25;)V

    .line 650
    .line 651
    .line 652
    new-instance v3, Lhd5;

    .line 653
    .line 654
    const/4 v4, 0x3

    .line 655
    invoke-direct {v3, v4, v1, v0}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    iput-object v3, v2, Ls25;->w:Lhd5;

    .line 659
    .line 660
    invoke-static {v1}, Lyq2;->d(Landroid/content/Context;)Lyq2;

    .line 661
    .line 662
    .line 663
    invoke-static {}, Lyq2;->b()V

    .line 664
    .line 665
    .line 666
    invoke-static {}, Lyq2;->c()Lui1;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0, v2, v14}, Lui1;->a(Lqq2;Z)V

    .line 671
    .line 672
    .line 673
    iput-object v2, v1, Lcom/eddyizm/tempus/service/MediaService;->w:Ls25;

    .line 674
    .line 675
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-interface {v0}, Lqi3;->Q0()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-lez v2, :cond_7

    .line 691
    .line 692
    return-void

    .line 693
    :cond_7
    new-instance v2, Ljava/lang/Thread;

    .line 694
    .line 695
    new-instance v3, Lk6;

    .line 696
    .line 697
    const/16 v4, 0xa

    .line 698
    .line 699
    invoke-direct {v3, v4, v1, v0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :cond_8
    const-string v0, "networkCallback"

    .line 710
    .line 711
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    throw v15

    .line 715
    :cond_9
    const-string v0, "bitmapLoader"

    .line 716
    .line 717
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    throw v15
.end method

.method public final onDestroy()V
    .locals 10

    .line 1
    sget-object v0, Lrs3;->a:Lrs3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrs3;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lkn2;->a()Lqi3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v1, Lrs1;->q:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lps1;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lqi3;->r0(Loi3;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lps1;->q:Landroid/os/Handler;

    .line 32
    .line 33
    iget-object v3, v1, Lps1;->r:Lg5;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, v1, Lps1;->s:Lqa1;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lrs1;->a:Lrs1;

    .line 44
    .line 45
    sget-object v0, Lb00;->a:Lb00;

    .line 46
    .line 47
    invoke-static {}, Lb00;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0, v2}, Lrs1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v1, Lps1;->p:Lzq2;

    .line 55
    .line 56
    iget-object v0, v1, Lps1;->n:Lqi3;

    .line 57
    .line 58
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    iget-object v1, v1, Lgn2;->a:Ljava/lang/String;

    .line 65
    .line 66
    move-object v4, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move-object v4, v2

    .line 69
    :goto_0
    invoke-interface {v0}, Lqi3;->M0()J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    const/4 v8, 0x0

    .line 82
    const-string v9, "interrupted"

    .line 83
    .line 84
    invoke-virtual/range {v3 .. v9}, Lzq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    sget-object v0, Lis3;->a:Landroid/os/Handler;

    .line 88
    .line 89
    sget-object v1, Lis3;->f:Lu6;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lis3;->b:Ljava/util/WeakHashMap;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Lqi3;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Loi3;

    .line 127
    .line 128
    invoke-interface {v4, v3}, Lqi3;->r0(Loi3;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 133
    .line 134
    .line 135
    sput-object v2, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;

    .line 136
    .line 137
    sget-object v0, Lis3;->e:Lk03;

    .line 138
    .line 139
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    const/4 v0, 0x1

    .line 145
    iput-boolean v0, p0, Lcom/eddyizm/tempus/service/MediaService;->D:Z

    .line 146
    .line 147
    sput-object v2, Ln61;->e:Lmq;

    .line 148
    .line 149
    const-class v1, Landroid/net/ConnectivityManager;

    .line 150
    .line 151
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 156
    .line 157
    iget-object v3, p0, Lcom/eddyizm/tempus/service/MediaService;->z:Lwp;

    .line 158
    .line 159
    if-eqz v3, :cond_10

    .line 160
    .line 161
    invoke-virtual {v1, v3}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 165
    .line 166
    if-eqz v1, :cond_f

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Li41;

    .line 173
    .line 174
    invoke-virtual {v3}, Li41;->e1()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    iget-object v4, v1, Lwo0;->n:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v4, Lv11;

    .line 181
    .line 182
    iget-object v1, v1, Lwo0;->o:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Landroid/content/Context;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-interface {v4, v1, v3}, Lv11;->o(Landroid/content/Context;I)V

    .line 194
    .line 195
    .line 196
    sget-object v1, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 199
    .line 200
    .line 201
    sget-object v1, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 204
    .line 205
    .line 206
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    sput-object v1, Ljz3;->f:Ljava/lang/ref/WeakReference;

    .line 212
    .line 213
    iget-boolean v1, p0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 214
    .line 215
    const/4 v3, 0x0

    .line 216
    if-nez v1, :cond_3

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_3
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 220
    .line 221
    iget-object v4, p0, Lcom/eddyizm/tempus/service/MediaService;->F:Lg5;

    .line 222
    .line 223
    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 224
    .line 225
    .line 226
    iput-boolean v3, p0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 227
    .line 228
    :goto_2
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->t()V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1}, Lyf4;->f()V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    iput-object v2, v1, Lyf4;->i:Lzh0;

    .line 243
    .line 244
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->G:Ljava/util/concurrent/ScheduledExecutorService;

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->y:Lns3;

    .line 250
    .line 251
    if-eqz v1, :cond_4

    .line 252
    .line 253
    iget-object v1, v1, Lns3;->q:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 256
    .line 257
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 258
    .line 259
    .line 260
    :cond_4
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->w:Ls25;

    .line 261
    .line 262
    if-eqz v1, :cond_6

    .line 263
    .line 264
    iput-object v2, v1, Ls25;->w:Lhd5;

    .line 265
    .line 266
    invoke-static {p0}, Lyq2;->d(Landroid/content/Context;)Lyq2;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Lyq2;->b()V

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lyq2;->c()Lui1;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v4, v1}, Lui1;->d(Lqq2;)Lvq2;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    if-eqz v5, :cond_5

    .line 281
    .line 282
    invoke-static {}, Lyq2;->b()V

    .line 283
    .line 284
    .line 285
    iput-object v2, v1, Lqq2;->q:Lsi1;

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Lqq2;->g(Lup2;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v5, v2}, Lui1;->m(Lvq2;Lxk0;)V

    .line 291
    .line 292
    .line 293
    iget-object v6, v4, Lui1;->a:Lri1;

    .line 294
    .line 295
    const/16 v7, 0x202

    .line 296
    .line 297
    invoke-virtual {v6, v7, v5}, Lri1;->b(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    iget-object v4, v4, Lui1;->k:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    :cond_5
    iput-boolean v3, v1, Ls25;->A:Z

    .line 306
    .line 307
    iput-boolean v3, v1, Ls25;->B:Z

    .line 308
    .line 309
    iget-object v4, v1, Ls25;->y:Landroid/os/Handler;

    .line 310
    .line 311
    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object v1, v1, Ls25;->x:Ljava/util/concurrent/ExecutorService;

    .line 315
    .line 316
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 317
    .line 318
    .line 319
    :cond_6
    iput-object v2, p0, Lcom/eddyizm/tempus/service/MediaService;->w:Ls25;

    .line 320
    .line 321
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 322
    .line 323
    if-eqz v1, :cond_7

    .line 324
    .line 325
    invoke-virtual {v1}, Lqe4;->A1()V

    .line 326
    .line 327
    .line 328
    :cond_7
    iput-object v2, p0, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 329
    .line 330
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    check-cast v1, Li41;

    .line 335
    .line 336
    const-string v4, "ExoPlayerImpl"

    .line 337
    .line 338
    new-instance v5, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    const-string v6, "Release "

    .line 341
    .line 342
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v6, " [AndroidXMedia3/1.9.2] ["

    .line 357
    .line 358
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    sget-object v6, Lf35;->a:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v6, "] ["

    .line 367
    .line 368
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-class v6, Lhn2;

    .line 372
    .line 373
    monitor-enter v6

    .line 374
    :try_start_0
    sget-object v7, Lhn2;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 375
    .line 376
    monitor-exit v6

    .line 377
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v6, "]"

    .line 381
    .line 382
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    invoke-static {v4, v5}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1}, Li41;->z1()V

    .line 393
    .line 394
    .line 395
    iget-object v4, v1, Li41;->z:Lll;

    .line 396
    .line 397
    invoke-virtual {v4, v3}, Lll;->l(Z)V

    .line 398
    .line 399
    .line 400
    iget-object v4, v1, Li41;->A:Ly10;

    .line 401
    .line 402
    invoke-virtual {v4, v3}, Ly10;->k(Z)V

    .line 403
    .line 404
    .line 405
    iget-object v4, v1, Li41;->B:Ly10;

    .line 406
    .line 407
    invoke-virtual {v4, v3}, Ly10;->k(Z)V

    .line 408
    .line 409
    .line 410
    iget-object v3, v1, Li41;->F:Lyc5;

    .line 411
    .line 412
    if-eqz v3, :cond_9

    .line 413
    .line 414
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 415
    .line 416
    const/16 v5, 0x22

    .line 417
    .line 418
    if-lt v4, v5, :cond_9

    .line 419
    .line 420
    iget-object v4, v3, Lyc5;->n:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 423
    .line 424
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    check-cast v4, Landroid/content/Context;

    .line 429
    .line 430
    if-nez v4, :cond_8

    .line 431
    .line 432
    goto :goto_3

    .line 433
    :cond_8
    iget-object v3, v3, Lyc5;->o:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v3, Lg41;

    .line 436
    .line 437
    invoke-static {v4, v3}, Lbn;->u(Landroid/content/Context;Lg41;)V

    .line 438
    .line 439
    .line 440
    :cond_9
    :goto_3
    iget-object v3, v1, Li41;->E:Lw12;

    .line 441
    .line 442
    iget-object v4, v3, Lw12;->g:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v4, Lyp4;

    .line 445
    .line 446
    invoke-virtual {v4}, Lyp4;->e()V

    .line 447
    .line 448
    .line 449
    iget-object v4, v3, Lw12;->b:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v4, Li41;

    .line 452
    .line 453
    iget-object v3, v3, Lw12;->c:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v3, Lj52;

    .line 456
    .line 457
    invoke-virtual {v4, v3}, Li41;->r0(Loi3;)V

    .line 458
    .line 459
    .line 460
    iget-object v3, v1, Li41;->m:Lq41;

    .line 461
    .line 462
    iget-boolean v4, v3, Lq41;->X:Z

    .line 463
    .line 464
    if-nez v4, :cond_b

    .line 465
    .line 466
    iget-object v4, v3, Lq41;->w:Landroid/os/Looper;

    .line 467
    .line 468
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-nez v4, :cond_a

    .line 477
    .line 478
    goto :goto_4

    .line 479
    :cond_a
    iput-boolean v0, v3, Lq41;->X:Z

    .line 480
    .line 481
    new-instance v4, Lq90;

    .line 482
    .line 483
    iget-object v5, v3, Lq41;->D:Lvp4;

    .line 484
    .line 485
    invoke-direct {v4, v5}, Lq90;-><init>(Lvp4;)V

    .line 486
    .line 487
    .line 488
    iget-object v5, v3, Lq41;->u:Lyp4;

    .line 489
    .line 490
    const/4 v6, 0x7

    .line 491
    invoke-virtual {v5, v6, v4}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    invoke-virtual {v5}, Lxp4;->b()V

    .line 496
    .line 497
    .line 498
    iget-wide v5, v3, Lq41;->I:J

    .line 499
    .line 500
    invoke-virtual {v4, v5, v6}, Lq90;->c(J)Z

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    goto :goto_5

    .line 505
    :cond_b
    :goto_4
    move v3, v0

    .line 506
    :goto_5
    if-nez v3, :cond_c

    .line 507
    .line 508
    iget-object v3, v1, Li41;->n:Ltc2;

    .line 509
    .line 510
    new-instance v4, Lmj0;

    .line 511
    .line 512
    const/16 v5, 0x11

    .line 513
    .line 514
    invoke-direct {v4, v5}, Lmj0;-><init>(I)V

    .line 515
    .line 516
    .line 517
    const/16 v5, 0xa

    .line 518
    .line 519
    invoke-virtual {v3, v5, v4}, Ltc2;->f(ILqc2;)V

    .line 520
    .line 521
    .line 522
    :cond_c
    iget-object v3, v1, Li41;->n:Ltc2;

    .line 523
    .line 524
    invoke-virtual {v3}, Ltc2;->d()V

    .line 525
    .line 526
    .line 527
    iget-object v3, v1, Li41;->k:Lyp4;

    .line 528
    .line 529
    invoke-virtual {v3}, Lyp4;->e()V

    .line 530
    .line 531
    .line 532
    iget-object v3, v1, Li41;->v:Lcp;

    .line 533
    .line 534
    iget-object v4, v1, Li41;->t:Lnj0;

    .line 535
    .line 536
    invoke-interface {v3, v4}, Lcp;->h(Lnj0;)V

    .line 537
    .line 538
    .line 539
    iget-object v3, v1, Li41;->p0:Lph3;

    .line 540
    .line 541
    iget-boolean v4, v3, Lph3;->p:Z

    .line 542
    .line 543
    if-eqz v4, :cond_d

    .line 544
    .line 545
    invoke-virtual {v3}, Lph3;->a()Lph3;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    iput-object v3, v1, Li41;->p0:Lph3;

    .line 550
    .line 551
    :cond_d
    iget-object v3, v1, Li41;->p0:Lph3;

    .line 552
    .line 553
    invoke-static {v3, v0}, Li41;->k1(Lph3;I)Lph3;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    iput-object v3, v1, Li41;->p0:Lph3;

    .line 558
    .line 559
    iget-object v4, v3, Lph3;->b:Lmt2;

    .line 560
    .line 561
    invoke-virtual {v3, v4}, Lph3;->c(Lmt2;)Lph3;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    iput-object v3, v1, Li41;->p0:Lph3;

    .line 566
    .line 567
    iget-wide v4, v3, Lph3;->s:J

    .line 568
    .line 569
    iput-wide v4, v3, Lph3;->q:J

    .line 570
    .line 571
    iget-object v3, v1, Li41;->p0:Lph3;

    .line 572
    .line 573
    const-wide/16 v4, 0x0

    .line 574
    .line 575
    iput-wide v4, v3, Lph3;->r:J

    .line 576
    .line 577
    iget-object v3, v1, Li41;->t:Lnj0;

    .line 578
    .line 579
    iget-object v4, v3, Lnj0;->u:Lyp4;

    .line 580
    .line 581
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    new-instance v5, La0;

    .line 585
    .line 586
    const/16 v6, 0x10

    .line 587
    .line 588
    invoke-direct {v5, v6, v3}, La0;-><init>(ILjava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v4, v5}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1}, Li41;->p1()V

    .line 595
    .line 596
    .line 597
    iget-object v3, v1, Li41;->V:Landroid/view/Surface;

    .line 598
    .line 599
    if-eqz v3, :cond_e

    .line 600
    .line 601
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 602
    .line 603
    .line 604
    iput-object v2, v1, Li41;->V:Landroid/view/Surface;

    .line 605
    .line 606
    :cond_e
    sget-object v2, Ljg0;->d:Ljg0;

    .line 607
    .line 608
    iput-object v2, v1, Li41;->e0:Ljg0;

    .line 609
    .line 610
    iput-boolean v0, v1, Li41;->i0:Z

    .line 611
    .line 612
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    :try_start_1
    sget-object v1, Lkn2;->b:Ljava/lang/Object;

    .line 617
    .line 618
    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 619
    :try_start_2
    sget-object v2, Lkn2;->c:Ljava/util/HashMap;

    .line 620
    .line 621
    iget-object v3, v0, Lkn2;->a:Ltn2;

    .line 622
    .line 623
    iget-object v3, v3, Ltn2;->i:Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 629
    :try_start_3
    iget-object v0, v0, Lkn2;->a:Ltn2;

    .line 630
    .line 631
    invoke-virtual {v0}, Ltn2;->A()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 632
    .line 633
    .line 634
    goto :goto_6

    .line 635
    :catchall_0
    move-exception v0

    .line 636
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 637
    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 638
    :catch_0
    :goto_6
    invoke-super {p0}, Landroidx/media3/session/MediaLibraryService;->onDestroy()V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    :catchall_1
    move-exception v0

    .line 643
    move-object p0, v0

    .line 644
    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 645
    throw p0

    .line 646
    :cond_f
    const-string p0, "equalizerManager"

    .line 647
    .line 648
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    throw v2

    .line 652
    :cond_10
    const-string p0, "networkCallback"

    .line 653
    .line 654
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v2
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const v4, -0xa2594ed

    .line 18
    .line 19
    .line 20
    if-eq v3, v4, :cond_1

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_1
    const-string v3, "com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Li41;

    .line 41
    .line 42
    invoke-virtual {v0}, Li41;->e1()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v4, v1, Lwo0;->n:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Lv11;

    .line 49
    .line 50
    iget-object v1, v1, Lwo0;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v4, v1, v0}, Lv11;->o(Landroid/content/Context;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lud3;->C()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eq v0, v2, :cond_3

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    if-eq v0, v1, :cond_2

    .line 72
    .line 73
    new-instance v0, Li80;

    .line 74
    .line 75
    const/16 v1, 0x17

    .line 76
    .line 77
    invoke-direct {v0, v1}, Li80;-><init>(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance v0, Ly41;

    .line 82
    .line 83
    invoke-direct {v0, v2}, Ly41;-><init>(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance v0, Ld34;

    .line 88
    .line 89
    const/16 v1, 0xc

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    invoke-direct {v0, v1, v4}, Ld34;-><init>(IZ)V

    .line 93
    .line 94
    .line 95
    :goto_1
    new-instance v1, Lwo0;

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v0, v1, Lwo0;->n:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v4, v1, Lwo0;->o:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Li41;

    .line 118
    .line 119
    invoke-virtual {v1}, Li41;->e1()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-interface {v0, v4, v1}, Lv11;->f(Landroid/content/Context;I)Z

    .line 131
    .line 132
    .line 133
    new-instance v0, Landroid/content/Intent;

    .line 134
    .line 135
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    const-string p0, "equalizerManager"

    .line 143
    .line 144
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_5
    :goto_2
    invoke-super {p0, p1, p2, p3}, Landroidx/media3/session/MediaLibraryService;->onStartCommand(Landroid/content/Intent;II)I

    .line 149
    .line 150
    .line 151
    return v2
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lkn2;->a()Lqi3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lqi3;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Lqi3;->Q0()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p1}, Lqi3;->a()Lgn2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Lqi3;->M0()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long v0, v0, v2

    .line 39
    .line 40
    if-lez v0, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Lqi3;->a()Lgn2;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1}, Lqi3;->M0()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    invoke-static {v0, v1, v2}, Lbo2;->n(Lgn2;J)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final p()Lkn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/service/MediaService;->v:Lkn2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "mediaLibrarySession"

    .line 7
    .line 8
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final q(Lqi3;)V
    .locals 3

    .line 1
    invoke-static {}, Lrs1;->g()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrs1;->q:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lps1;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lps1;-><init>(Lqi3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v1}, Lqi3;->v(Loi3;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sput-object p0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;

    .line 25
    .line 26
    sget-object v0, Lis3;->b:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    new-instance v1, Lj52;

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    invoke-direct {v1, v2, p0}, Lj52;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v1}, Lqi3;->v(Loi3;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    new-instance v0, Laq;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Laq;-><init>(Lcom/eddyizm/tempus/service/MediaService;Lqi3;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0}, Lqi3;->v(Loi3;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Lqi3;->h0()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-boolean p1, p0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->F:Lg5;

    .line 85
    .line 86
    const-wide/16 v0, 0x3e8

    .line 87
    .line 88
    iget-object v2, p0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 89
    .line 90
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 95
    .line 96
    :cond_3
    :goto_2
    return-void
.end method

.method public final r(Ljava/lang/String;Lqi3;)V
    .locals 10

    .line 1
    const-string v0, " - "

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p1, v0, v1}, Lqm4;->C0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-ne v2, v1, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    move-object v2, v3

    .line 41
    :cond_0
    move-object v6, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v6, v3

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ne v2, v1, :cond_3

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v3, p1

    .line 73
    :goto_1
    move-object v7, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {p1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :goto_2
    if-eqz v6, :cond_4

    .line 91
    .line 92
    invoke-static {v6}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    :cond_4
    if-eqz v7, :cond_7

    .line 99
    .line 100
    invoke-static {v7}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->M:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v6, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->N:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v7, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    iput-object v6, p0, Lcom/eddyizm/tempus/service/MediaService;->M:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v7, p0, Lcom/eddyizm/tempus/service/MediaService;->N:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v4, Lt6;

    .line 129
    .line 130
    const/4 v9, 0x2

    .line 131
    move-object v8, p0

    .line 132
    move-object v5, p2

    .line 133
    invoke-direct/range {v4 .. v9}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    iget-object p0, v8, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 137
    .line 138
    invoke-virtual {p0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 139
    .line 140
    .line 141
    :cond_7
    :goto_3
    return-void
.end method

.method public final s(Lqi3;Lqi3;)V
    .locals 7

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    new-instance v2, Lj02;

    .line 10
    .line 11
    invoke-interface {p1}, Lqi3;->Q0()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sub-int/2addr v3, v0

    .line 16
    invoke-direct {v2, v1, v3, v0}, Lh02;-><init>(III)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    invoke-static {v2, v4}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lh02;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    move-object v4, v2

    .line 35
    check-cast v4, Li02;

    .line 36
    .line 37
    iget-boolean v4, v4, Li02;->p:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    move-object v4, v2

    .line 42
    check-cast v4, Lb02;

    .line 43
    .line 44
    invoke-virtual {v4}, Lb02;->nextInt()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-interface {p1, v4}, Lqi3;->Y(I)Lgn2;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-interface {p1}, Lqi3;->o0()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-interface {p1}, Lqi3;->M0()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-interface {p1}, Lqi3;->q()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-interface {p1}, Lqi3;->stop()V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, v3, v2, v4, v5}, Lqi3;->T(Ljava/util/List;IJ)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p2, v6}, Lqi3;->V(Z)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2}, Lqi3;->b()V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p2}, Lqi3;->P0()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p1}, Lrr2;->l(Z)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p2}, Lqi3;->U0()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, Lqi3;->U0()Landroid/os/Looper;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-ne p1, v2, :cond_3

    .line 104
    .line 105
    move p1, v0

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move p1, v1

    .line 108
    :goto_1
    invoke-static {p1}, Lrr2;->l(Z)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2}, Lqi3;->U0()Landroid/os/Looper;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-ne p1, v2, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move v0, v1

    .line 123
    :goto_2
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, Lkn2;->a:Ltn2;

    .line 127
    .line 128
    iget-object p1, p0, Ltn2;->s:Lal3;

    .line 129
    .line 130
    iget-object v0, p1, Lal3;->b:Lqi3;

    .line 131
    .line 132
    if-ne p2, v0, :cond_5

    .line 133
    .line 134
    :goto_3
    return-void

    .line 135
    :cond_5
    new-instance v0, Lal3;

    .line 136
    .line 137
    invoke-direct {v0, p2}, Lal3;-><init>(Lqi3;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1, v0}, Ltn2;->D(Lal3;Lal3;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/eddyizm/tempus/service/MediaService;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->I:Ljava/util/concurrent/ScheduledFuture;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->I:Ljava/util/concurrent/ScheduledFuture;

    .line 16
    .line 17
    iput-boolean v1, p0, Lcom/eddyizm/tempus/service/MediaService;->H:Z

    .line 18
    .line 19
    return-void
.end method

.method public final u()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/eddyizm/tempus/service/MediaService;->L:Lii;

    .line 6
    .line 7
    invoke-virtual {v1}, Lii;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_a

    .line 12
    .line 13
    invoke-virtual {v1}, Lii;->first()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lyp;

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Lfq;

    .line 21
    .line 22
    invoke-virtual {v3}, Lfq;->Q0()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget v5, v2, Lyp;->c:I

    .line 27
    .line 28
    iget v6, v2, Lyp;->a:I

    .line 29
    .line 30
    iget v2, v2, Lyp;->b:I

    .line 31
    .line 32
    if-ge v4, v5, :cond_0

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v3}, Lfq;->Q0()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v3, v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1}, Lii;->removeFirst()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v3, v0

    .line 47
    check-cast v3, Li41;

    .line 48
    .line 49
    invoke-virtual {v3}, Li41;->z1()V

    .line 50
    .line 51
    .line 52
    iget-boolean v4, v3, Li41;->J:Z

    .line 53
    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Lii;->removeFirst()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v3}, Li41;->o0()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/4 v7, -0x1

    .line 65
    if-eq v4, v7, :cond_9

    .line 66
    .line 67
    add-int v4, v6, v2

    .line 68
    .line 69
    if-le v4, v5, :cond_3

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_3
    invoke-virtual {v3}, Li41;->x0()Lcu4;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v9, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const/4 v10, 0x1

    .line 86
    invoke-virtual {v8, v10}, Lcu4;->a(Z)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    :goto_1
    const/4 v12, 0x0

    .line 91
    if-eq v11, v7, :cond_6

    .line 92
    .line 93
    if-lt v11, v6, :cond_4

    .line 94
    .line 95
    if-lt v11, v4, :cond_5

    .line 96
    .line 97
    :cond_4
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-virtual {v8, v11, v12, v10}, Lcu4;->e(IIZ)I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    goto :goto_1

    .line 109
    :cond_6
    add-int/lit8 v4, v6, -0x1

    .line 110
    .line 111
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-gez v4, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1}, Lii;->removeFirst()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    :goto_2
    if-ge v12, v2, :cond_8

    .line 134
    .line 135
    add-int/lit8 v5, v4, 0x1

    .line 136
    .line 137
    add-int/2addr v5, v12

    .line 138
    add-int v8, v6, v12

    .line 139
    .line 140
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v7, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    new-instance v5, Lpd4;

    .line 151
    .line 152
    invoke-static {v7}, Lq40;->P0(Ljava/util/List;)[I

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    sget-object v7, Lku3;->n:Lju3;

    .line 157
    .line 158
    sget-object v7, Lku3;->o:Lz1;

    .line 159
    .line 160
    invoke-virtual {v7}, Lz1;->b()Ljava/util/Random;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v7}, Ljava/util/Random;->nextLong()J

    .line 165
    .line 166
    .line 167
    move-result-wide v7

    .line 168
    invoke-direct {v5, v6, v7, v8}, Lpd4;-><init>([IJ)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v5}, Li41;->s1(Lpd4;)V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v4, v4, 0x1

    .line 175
    .line 176
    new-instance v3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v5, "playNextFixup: "

    .line 179
    .line 180
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v2, " item(s) moved to shuffle position "

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v3, "BaseMediaService"

    .line 199
    .line 200
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lii;->removeFirst()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_9
    :goto_3
    invoke-virtual {v1}, Lii;->removeFirst()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_a
    :goto_4
    return-void
.end method

.method public final v(Lqi3;)V
    .locals 5

    .line 1
    const-string v0, "BaseMediaService"

    .line 2
    .line 3
    const-string v1, "update items"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lqi3;->o0()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-interface {p1}, Lqi3;->Q0()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Lgb;->g0(II)Lj02;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {v0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lh02;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    move-object v2, v0

    .line 42
    check-cast v2, Li02;

    .line 43
    .line 44
    iget-boolean v2, v2, Li02;->p:Z

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    move-object v2, v0

    .line 49
    check-cast v2, Lb02;

    .line 50
    .line 51
    invoke-virtual {v2}, Lb02;->nextInt()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    new-instance v3, Lkd3;

    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {p1, v2}, Lqi3;->Y(I)Lgn2;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v3, v4, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :cond_2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lwr1;->M(Ljava/util/concurrent/ExecutorService;)Lmx2;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v3, Ltp;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-direct {v3, v4, v1}, Ltp;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 101
    .line 102
    .line 103
    new-instance v0, Lwo0;

    .line 104
    .line 105
    invoke-direct {v0, p0, p1}, Lwo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance p0, Llg1;

    .line 109
    .line 110
    invoke-direct {p0, v4, v1, v0}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p1, Lgq0;->n:Lgq0;

    .line 114
    .line 115
    invoke-interface {v1, p0, p1}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final w(Lqi3;)V
    .locals 23

    .line 1
    invoke-interface/range {p1 .. p1}, Lqi3;->a()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v2, v0, Lgn2;->d:Ldo2;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v2, v2, Ldo2;->a:Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    :cond_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v2, v0, Lgn2;->d:Ldo2;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v2, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const-string v3, "title"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v1

    .line 40
    :cond_2
    :goto_0
    const-string v3, "artist"

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v4, v0, Lgn2;->d:Ldo2;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    iget-object v4, v4, Ldo2;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v4, v0, Lgn2;->d:Ldo2;

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    iget-object v4, v4, Ldo2;->I:Landroid/os/Bundle;

    .line 65
    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move-object v4, v1

    .line 74
    :cond_5
    :goto_1
    const-string v5, "album"

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    iget-object v6, v0, Lgn2;->d:Ldo2;

    .line 79
    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    iget-object v6, v6, Ldo2;->c:Ljava/lang/CharSequence;

    .line 83
    .line 84
    if-eqz v6, :cond_6

    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    if-nez v6, :cond_8

    .line 91
    .line 92
    :cond_6
    if-eqz v0, :cond_7

    .line 93
    .line 94
    iget-object v6, v0, Lgn2;->d:Ldo2;

    .line 95
    .line 96
    if-eqz v6, :cond_7

    .line 97
    .line 98
    iget-object v6, v6, Ldo2;->I:Landroid/os/Bundle;

    .line 99
    .line 100
    if-eqz v6, :cond_7

    .line 101
    .line 102
    invoke-virtual {v6, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    goto :goto_2

    .line 107
    :cond_7
    move-object v6, v1

    .line 108
    :cond_8
    :goto_2
    if-eqz v0, :cond_9

    .line 109
    .line 110
    iget-object v0, v0, Lgn2;->d:Ldo2;

    .line 111
    .line 112
    if-eqz v0, :cond_9

    .line 113
    .line 114
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_9
    move-object v0, v1

    .line 118
    :goto_3
    if-eqz v0, :cond_a

    .line 119
    .line 120
    const-string v7, "coverArtId"

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    move-object v12, v7

    .line 127
    goto :goto_4

    .line 128
    :cond_a
    move-object v12, v1

    .line 129
    :goto_4
    if-eqz v0, :cond_c

    .line 130
    .line 131
    const-string v7, "assetLinkSong"

    .line 132
    .line 133
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-nez v7, :cond_b

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_b
    :goto_5
    move-object/from16 v20, v7

    .line 141
    .line 142
    goto :goto_8

    .line 143
    :cond_c
    :goto_6
    if-eqz v0, :cond_d

    .line 144
    .line 145
    const-string v7, "id"

    .line 146
    .line 147
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    goto :goto_7

    .line 152
    :cond_d
    move-object v7, v1

    .line 153
    :goto_7
    const-string v8, "song"

    .line 154
    .line 155
    invoke-static {v8, v7}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    goto :goto_5

    .line 160
    :goto_8
    if-eqz v0, :cond_f

    .line 161
    .line 162
    const-string v7, "assetLinkAlbum"

    .line 163
    .line 164
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    if-nez v7, :cond_e

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_e
    :goto_9
    move-object/from16 v21, v7

    .line 172
    .line 173
    goto :goto_c

    .line 174
    :cond_f
    :goto_a
    if-eqz v0, :cond_10

    .line 175
    .line 176
    const-string v7, "albumId"

    .line 177
    .line 178
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    goto :goto_b

    .line 183
    :cond_10
    move-object v7, v1

    .line 184
    :goto_b
    invoke-static {v5, v7}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    goto :goto_9

    .line 189
    :goto_c
    if-eqz v0, :cond_12

    .line 190
    .line 191
    const-string v5, "assetLinkArtist"

    .line 192
    .line 193
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    if-nez v5, :cond_11

    .line 198
    .line 199
    goto :goto_e

    .line 200
    :cond_11
    :goto_d
    move-object/from16 v22, v5

    .line 201
    .line 202
    goto :goto_10

    .line 203
    :cond_12
    :goto_e
    if-eqz v0, :cond_13

    .line 204
    .line 205
    const-string v5, "artistId"

    .line 206
    .line 207
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    goto :goto_f

    .line 212
    :cond_13
    move-object v0, v1

    .line 213
    :goto_f
    invoke-static {v3, v0}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    goto :goto_d

    .line 218
    :goto_10
    invoke-interface/range {p1 .. p1}, Lqi3;->M0()J

    .line 219
    .line 220
    .line 221
    move-result-wide v7

    .line 222
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    cmp-long v3, v7, v9

    .line 232
    .line 233
    if-eqz v3, :cond_14

    .line 234
    .line 235
    goto :goto_11

    .line 236
    :cond_14
    move-object v0, v1

    .line 237
    :goto_11
    const-wide/16 v7, 0x0

    .line 238
    .line 239
    if-eqz v0, :cond_15

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 242
    .line 243
    .line 244
    move-result-wide v13

    .line 245
    move-wide/from16 v16, v13

    .line 246
    .line 247
    goto :goto_12

    .line 248
    :cond_15
    move-wide/from16 v16, v7

    .line 249
    .line 250
    :goto_12
    invoke-interface/range {p1 .. p1}, Lqi3;->getDuration()J

    .line 251
    .line 252
    .line 253
    move-result-wide v13

    .line 254
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    cmp-long v3, v13, v9

    .line 259
    .line 260
    if-eqz v3, :cond_16

    .line 261
    .line 262
    move-object v1, v0

    .line 263
    :cond_16
    if-eqz v1, :cond_17

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v7

    .line 269
    :cond_17
    move-wide/from16 v18, v7

    .line 270
    .line 271
    const-string v0, ""

    .line 272
    .line 273
    if-nez v2, :cond_18

    .line 274
    .line 275
    move-object v9, v0

    .line 276
    goto :goto_13

    .line 277
    :cond_18
    move-object v9, v2

    .line 278
    :goto_13
    if-nez v4, :cond_19

    .line 279
    .line 280
    move-object v10, v0

    .line 281
    goto :goto_14

    .line 282
    :cond_19
    move-object v10, v4

    .line 283
    :goto_14
    if-nez v6, :cond_1a

    .line 284
    .line 285
    move-object v11, v0

    .line 286
    goto :goto_15

    .line 287
    :cond_1a
    move-object v11, v6

    .line 288
    :goto_15
    invoke-interface/range {p1 .. p1}, Lqi3;->h0()Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    invoke-interface/range {p1 .. p1}, Lqi3;->D0()Z

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    invoke-interface/range {p1 .. p1}, Lqi3;->h()I

    .line 297
    .line 298
    .line 299
    move-result v15

    .line 300
    move-object/from16 v8, p0

    .line 301
    .line 302
    invoke-static/range {v8 .. v22}, Lji2;->T(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-void
.end method
