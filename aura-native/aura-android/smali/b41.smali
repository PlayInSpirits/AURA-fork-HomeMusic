.class public final synthetic Lb41;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p5, p0, Lb41;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lb41;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lb41;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lb41;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p4, p0, Lb41;->o:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p5, p0, Lb41;->n:I

    iput-object p1, p0, Lb41;->p:Ljava/lang/Object;

    iput-boolean p2, p0, Lb41;->o:Z

    iput-object p3, p0, Lb41;->q:Ljava/lang/Object;

    iput-object p4, p0, Lb41;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lb41;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb41;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lmm3;

    .line 11
    .line 12
    iget-boolean v3, p0, Lb41;->o:Z

    .line 13
    .line 14
    iget-object v4, p0, Lb41;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    iget-object p0, p0, Lb41;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, v0, Lmm3;->d:Lqp4;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lqp4;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ls24;

    .line 29
    .line 30
    new-instance v3, Lps0;

    .line 31
    .line 32
    const/4 v5, 0x4

    .line 33
    invoke-direct {v3, v5, v4, p0}, Lps0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2, v1, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0, v4, p0}, Lqp4;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lb41;->p:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ltn2;

    .line 47
    .line 48
    iget-boolean v1, p0, Lb41;->o:Z

    .line 49
    .line 50
    iget-object v2, p0, Lb41;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lfr2;

    .line 53
    .line 54
    iget-object p0, p0, Lb41;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ljava/lang/Runnable;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    new-instance v1, Lva4;

    .line 61
    .line 62
    const-string v3, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 63
    .line 64
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-direct {v1, v3, v4}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lcn;

    .line 70
    .line 71
    invoke-direct {v3, v1}, Lcn;-><init>(Lva4;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2, v3}, Ltn2;->d(Lfr2;Lyr2;)Lic2;

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 78
    .line 79
    .line 80
    iget-object p0, v0, Ltn2;->g:Lkt2;

    .line 81
    .line 82
    iget-object p0, p0, Lkt2;->f:Lna4;

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Lna4;->s(Lfr2;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_1
    iget-object v0, p0, Lb41;->p:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Llo2;

    .line 91
    .line 92
    iget-object v1, p0, Lb41;->q:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lkn2;

    .line 95
    .line 96
    iget-object v2, p0, Lb41;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Lrm2;

    .line 99
    .line 100
    iget-boolean p0, p0, Lb41;->o:Z

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2, p0}, Llo2;->e(Lkn2;Lrm2;Z)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_2
    iget-object v0, p0, Lb41;->p:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 109
    .line 110
    iget-object v3, p0, Lb41;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, Ljava/io/Serializable;

    .line 113
    .line 114
    iget-object v4, p0, Lb41;->r:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean p0, p0, Lb41;->o:Z

    .line 119
    .line 120
    iget-object v5, v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 121
    .line 122
    if-nez v5, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    instance-of v5, v3, Ls14;

    .line 126
    .line 127
    if-nez v5, :cond_5

    .line 128
    .line 129
    move-object v5, v3

    .line 130
    check-cast v5, Ljava/lang/String;

    .line 131
    .line 132
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 133
    .line 134
    if-nez v6, :cond_3

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    if-nez p0, :cond_4

    .line 138
    .line 139
    sget-object p0, Lhw;->i:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {p0, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_4

    .line 146
    .line 147
    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-eqz p0, :cond_4

    .line 152
    .line 153
    invoke-static {p0, v5, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-ne p0, v1, :cond_4

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v4}, Lcom/eddyizm/tempus/homemusic/HubFragment;->i0(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    sput-object v5, Lhw;->i:Ljava/lang/String;

    .line 167
    .line 168
    new-instance p0, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v1, "/?embedded=1#"

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {v6, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    :goto_1
    invoke-static {v3}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-eqz p0, :cond_7

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0(Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-nez p0, :cond_6

    .line 205
    .line 206
    const p0, 0x7f1301b5

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p0}, Lkc1;->s(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    :cond_6
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->k0(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_7
    :goto_2
    return-void

    .line 220
    :pswitch_3
    iget-object v0, p0, Lb41;->p:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Landroid/content/Context;

    .line 223
    .line 224
    iget-boolean v1, p0, Lb41;->o:Z

    .line 225
    .line 226
    iget-object v2, p0, Lb41;->q:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v2, Li41;

    .line 229
    .line 230
    iget-object p0, p0, Lb41;->r:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, Lik3;

    .line 233
    .line 234
    const-string v3, "media_metrics"

    .line 235
    .line 236
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-static {v3}, Lfo2;->b(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-nez v3, :cond_8

    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    goto :goto_3

    .line 248
    :cond_8
    new-instance v4, Lho2;

    .line 249
    .line 250
    invoke-static {v3}, Lfo2;->j(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-direct {v4, v0, v3}, Lho2;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 255
    .line 256
    .line 257
    move-object v0, v4

    .line 258
    :goto_3
    if-nez v0, :cond_9

    .line 259
    .line 260
    const-string p0, "ExoPlayerImpl"

    .line 261
    .line 262
    const-string v0, "MediaMetricsService unavailable."

    .line 263
    .line 264
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_9
    if-eqz v1, :cond_a

    .line 269
    .line 270
    iget-object v1, v2, Li41;->t:Lnj0;

    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object v1, v1, Lnj0;->s:Ltc2;

    .line 276
    .line 277
    invoke-virtual {v1, v0}, Ltc2;->a(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_a
    iget-object v0, v0, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 281
    .line 282
    invoke-static {v0}, Lfo2;->a(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    monitor-enter p0

    .line 287
    :try_start_0
    iget-object v1, p0, Lik3;->b:Lrm2;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object v2, v1, Lrm2;->o:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v2, Landroid/media/metrics/LogSessionId;

    .line 295
    .line 296
    invoke-static {}, Lgo2;->d()Landroid/media/metrics/LogSessionId;

    .line 297
    .line 298
    .line 299
    invoke-static {v2}, Lgo2;->w(Landroid/media/metrics/LogSessionId;)Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 304
    .line 305
    .line 306
    iput-object v0, v1, Lrm2;->o:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    monitor-exit p0

    .line 309
    :goto_4
    return-void

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 312
    throw v0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
